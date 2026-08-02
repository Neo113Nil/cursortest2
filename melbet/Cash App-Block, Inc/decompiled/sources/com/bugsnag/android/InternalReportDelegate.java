package com.bugsnag.android;

import android.content.Context;
import android.os.storage.StorageManager;
import com.bugsnag.android.Client;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.TaskType;
import com.bugsnag.android.internal.dag.Provider;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class InternalReportDelegate {
    public final Context appContext;
    public final Provider appDataCollector;
    public final BackgroundTaskService backgroundTaskService;
    public final ImmutableConfig config;
    public final Provider deviceDataCollector;
    public final Logger logger;
    public final Notifier notifier;
    public final StorageManager storageManager;

    public InternalReportDelegate(Context context, Logger logger, ImmutableConfig immutableConfig, StorageManager storageManager, EventStorageModule$special$$inlined$provider$2 eventStorageModule$special$$inlined$provider$2, EventStorageModule$special$$inlined$provider$2 eventStorageModule$special$$inlined$provider$22, Notifier notifier, BackgroundTaskService backgroundTaskService) {
        this.logger = logger;
        this.config = immutableConfig;
        this.storageManager = storageManager;
        this.appDataCollector = eventStorageModule$special$$inlined$provider$2;
        this.deviceDataCollector = eventStorageModule$special$$inlined$provider$22;
        this.appContext = context;
        this.notifier = notifier;
        this.backgroundTaskService = backgroundTaskService;
    }

    public final void onErrorIOFailure(Exception exc, File file, String str) {
        boolean z = false;
        Event event = new Event(exc, this.config, SeverityReason.newInstance(null, "unhandledException", null), new Metadata(0), new FeatureFlags(), this.logger);
        EventInternal eventInternal = event.impl;
        eventInternal.context = str;
        event.addMetadata("BugsnagDiagnostics", "canRead", Boolean.valueOf(file.canRead()));
        event.addMetadata("BugsnagDiagnostics", "canWrite", Boolean.valueOf(file.canWrite()));
        event.addMetadata("BugsnagDiagnostics", "exists", Boolean.valueOf(file.exists()));
        Context context = this.appContext;
        event.addMetadata("BugsnagDiagnostics", "usableSpace", Long.valueOf(context.getCacheDir().getUsableSpace()));
        event.addMetadata("BugsnagDiagnostics", "filename", file.getName());
        event.addMetadata("BugsnagDiagnostics", "fileLength", Long.valueOf(file.length()));
        StorageManager storageManager = this.storageManager;
        if (storageManager != null) {
            File file2 = new File(context.getCacheDir(), "bugsnag/errors");
            try {
                boolean isCacheBehaviorTombstone = storageManager.isCacheBehaviorTombstone(file2);
                boolean isCacheBehaviorGroup = storageManager.isCacheBehaviorGroup(file2);
                event.addMetadata("BugsnagDiagnostics", "cacheTombstone", Boolean.valueOf(isCacheBehaviorTombstone));
                event.addMetadata("BugsnagDiagnostics", "cacheGroup", Boolean.valueOf(isCacheBehaviorGroup));
            } catch (IOException e) {
                this.logger.w("Failed to record cache behaviour, skipping diagnostics", e);
            }
        }
        eventInternal.f940app = ((AppDataCollector) this.appDataCollector.get()).generateAppWithState();
        eventInternal.device = ((DeviceDataCollector) this.deviceDataCollector.get()).generateDeviceWithState(new Date().getTime());
        Notifier notifier = this.notifier;
        event.addMetadata("BugsnagDiagnostics", "notifierName", notifier.name);
        event.addMetadata("BugsnagDiagnostics", "notifierVersion", notifier.version);
        event.addMetadata("BugsnagDiagnostics", "apiKey", this.config.apiKey);
        try {
            this.backgroundTaskService.submitTask(TaskType.INTERNAL_REPORT, new Client.AnonymousClass4(this, new EventPayload(null, event, null, this.notifier, this.config), z, 11));
        } catch (RejectedExecutionException unused) {
        }
    }
}
