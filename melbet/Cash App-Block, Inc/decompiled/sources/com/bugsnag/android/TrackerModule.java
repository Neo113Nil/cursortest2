package com.bugsnag.android;

import android.content.Context;
import android.os.storage.StorageManager;
import androidx.room.TransactorKt;
import androidx.work.impl.WorkLauncherImpl;
import coil3.Extras;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.TaskType;
import com.bugsnag.android.internal.dag.ContextModule;
import com.bugsnag.android.internal.dag.RunnableProvider;

/* loaded from: classes.dex */
public final class TrackerModule extends TransactorKt {
    public final ImmutableConfig config;
    public final Object launchCrashTracker;
    public final RunnableProvider sessionTracker;

    public TrackerModule(final ContextModule contextModule, Extras.Key key, final StorageModule storageModule, final BackgroundTaskService backgroundTaskService, final TrackerModule trackerModule, final WorkLauncherImpl workLauncherImpl, final Notifier notifier, CallbackState callbackState) {
        super(backgroundTaskService);
        this.config = (ImmutableConfig) key.f61default;
        TaskType taskType = TaskType.DEFAULT;
        Runnable runnable = new RunnableProvider(contextModule, workLauncherImpl, storageModule, trackerModule, notifier, backgroundTaskService) { // from class: com.bugsnag.android.EventStorageModule$special$$inlined$provider$1
            public final /* synthetic */ BackgroundTaskService $bgTaskService$inlined;
            public final /* synthetic */ ContextModule $contextModule$inlined;
            public final /* synthetic */ StorageModule $dataCollectionModule$inlined;
            public final /* synthetic */ Notifier $notifier$inlined;
            public final /* synthetic */ WorkLauncherImpl $systemServiceModule$inlined;

            {
                this.$notifier$inlined = notifier;
                this.$bgTaskService$inlined = backgroundTaskService;
            }

            @Override // com.bugsnag.android.internal.dag.RunnableProvider
            public final Object invoke() {
                ImmutableConfig immutableConfig = TrackerModule.this.config;
                if (!immutableConfig.telemetry.contains(Telemetry.INTERNAL_ERRORS)) {
                    return null;
                }
                Context context = this.$contextModule$inlined.ctx;
                Logger logger = immutableConfig.logger;
                StorageManager storageManager = (StorageManager) this.$systemServiceModule$inlined.processor;
                StorageModule storageModule2 = this.$dataCollectionModule$inlined;
                return new InternalReportDelegate(context, logger, immutableConfig, storageManager, (EventStorageModule$special$$inlined$provider$2) storageModule2.lastRunInfoStore, (EventStorageModule$special$$inlined$provider$2) storageModule2.lastRunInfo, this.$notifier$inlined, this.$bgTaskService$inlined);
            }
        };
        backgroundTaskService.execute(taskType, runnable);
        this.launchCrashTracker = runnable;
        TaskType taskType2 = TaskType.DEFAULT;
        EventStorageModule$special$$inlined$provider$2 eventStorageModule$special$$inlined$provider$2 = new EventStorageModule$special$$inlined$provider$2(this, notifier, backgroundTaskService, callbackState, 0);
        backgroundTaskService.execute(taskType2, eventStorageModule$special$$inlined$provider$2);
        this.sessionTracker = eventStorageModule$special$$inlined$provider$2;
    }

    public TrackerModule(Extras.Key key, final StorageModule storageModule, final Client client, final BackgroundTaskService backgroundTaskService, final CallbackState callbackState) {
        super(backgroundTaskService);
        ImmutableConfig immutableConfig = (ImmutableConfig) key.f61default;
        this.config = immutableConfig;
        this.launchCrashTracker = new LaunchCrashTracker(immutableConfig);
        TaskType taskType = TaskType.DEFAULT;
        RunnableProvider runnableProvider = new RunnableProvider() { // from class: com.bugsnag.android.TrackerModule$special$$inlined$provider$1
            @Override // com.bugsnag.android.internal.dag.RunnableProvider
            public final Object invoke() {
                ImmutableConfig immutableConfig2 = this.config;
                return new SessionTracker(immutableConfig2, callbackState, Client.this, (StorageModule$special$$inlined$provider$1) storageModule.sessionStore, immutableConfig2.logger, backgroundTaskService);
            }
        };
        backgroundTaskService.execute(taskType, runnableProvider);
        this.sessionTracker = runnableProvider;
    }
}
