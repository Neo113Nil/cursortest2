package com.bugsnag.android;

import android.app.ActivityManager;
import android.content.Context;
import androidx.room.TransactorKt;
import androidx.work.impl.WorkLauncherImpl;
import coil3.Extras;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.RootDetectionProvider;
import com.bugsnag.android.internal.dag.Provider;
import com.bugsnag.android.internal.dag.RunnableProvider;
import java.io.File;

/* loaded from: classes.dex */
public final class EventStorageModule$special$$inlined$provider$2 extends RunnableProvider {
    public final /* synthetic */ Object $bgTaskService$inlined;
    public final /* synthetic */ Object $callbackState$inlined;
    public final /* synthetic */ Object $notifier$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public EventStorageModule$special$$inlined$provider$2(Extras.Key key, StorageModule storageModule, Provider provider, BackgroundTaskService backgroundTaskService) {
        this.$r8$classId = 2;
        this.this$0 = key;
        this.$notifier$inlined = storageModule;
        this.$callbackState$inlined = provider;
        this.$bgTaskService$inlined = backgroundTaskService;
    }

    @Override // com.bugsnag.android.internal.dag.RunnableProvider
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.$bgTaskService$inlined;
        Object obj2 = this.$callbackState$inlined;
        Object obj3 = this.$notifier$inlined;
        Object obj4 = this.this$0;
        switch (i) {
            case 0:
                TrackerModule trackerModule = (TrackerModule) obj4;
                ImmutableConfig immutableConfig = trackerModule.config;
                return new EventStore(immutableConfig, immutableConfig.logger, (Notifier) obj3, (BackgroundTaskService) obj, (EventStorageModule$special$$inlined$provider$1) trackerModule.launchCrashTracker, (CallbackState) obj2);
            case 1:
                StorageModule storageModule = (StorageModule) obj4;
                Context context = (Context) storageModule.bugsnagDir;
                TrackerModule trackerModule2 = (TrackerModule) obj3;
                return new AppDataCollector(context, context.getPackageManager(), storageModule.immutableConfig, (TrackerModule$special$$inlined$provider$1) trackerModule2.sessionTracker, (ActivityManager) ((WorkLauncherImpl) obj).workTaskExecutor, (LaunchCrashTracker) trackerModule2.launchCrashTracker, (MemoryTrimState) obj2);
            default:
                Extras.Key key = (Extras.Key) obj4;
                StorageModule storageModule2 = (StorageModule) obj3;
                Context context2 = (Context) storageModule2.bugsnagDir;
                return new DeviceDataCollector(key, context2, context2.getResources(), (Provider) obj2, (DeviceBuildInfo) storageModule2.deviceId, (File) storageModule2.userStore, (RootDetectionProvider) storageModule2.sessionStore, (BackgroundTaskService) obj, (Logger) storageModule2.sharedPrefMigrator);
        }
    }

    public /* synthetic */ EventStorageModule$special$$inlined$provider$2(TransactorKt transactorKt, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.this$0 = transactorKt;
        this.$notifier$inlined = obj;
        this.$bgTaskService$inlined = obj2;
        this.$callbackState$inlined = obj3;
    }
}
