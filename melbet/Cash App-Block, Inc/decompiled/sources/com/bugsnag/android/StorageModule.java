package com.bugsnag.android;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import androidx.room.TransactorKt;
import androidx.work.impl.WorkLauncherImpl;
import coil3.Extras;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.RootDetectionProvider;
import com.bugsnag.android.internal.TaskType;
import com.bugsnag.android.internal.dag.ContextModule;
import com.bugsnag.android.internal.dag.RunnableProvider;
import java.io.File;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class StorageModule extends TransactorKt {
    public final Object bugsnagDir;
    public final Object deviceId;
    public final ImmutableConfig immutableConfig;
    public final RunnableProvider lastRunInfo;
    public final RunnableProvider lastRunInfoStore;
    public final RunnableProvider sessionStore;
    public final Object sharedPrefMigrator;
    public final Object userStore;

    public StorageModule(ContextModule contextModule, Extras.Key key, WorkLauncherImpl workLauncherImpl, TrackerModule trackerModule, BackgroundTaskService backgroundTaskService, Extras.Key key2, StorageModule$special$$inlined$provider$2 storageModule$special$$inlined$provider$2, MemoryTrimState memoryTrimState, ClientObservable clientObservable) {
        super(backgroundTaskService);
        this.bugsnagDir = contextModule.ctx;
        ImmutableConfig immutableConfig = (ImmutableConfig) key.f61default;
        this.immutableConfig = immutableConfig;
        Logger logger = immutableConfig.logger;
        this.sharedPrefMigrator = logger;
        DeviceBuildInfo deviceBuildInfo = new DeviceBuildInfo(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT), Build.DISPLAY, Build.FINGERPRINT, Build.TAGS, Build.BRAND, Build.SUPPORTED_ABIS);
        this.deviceId = deviceBuildInfo;
        this.userStore = Environment.getDataDirectory();
        TaskType taskType = TaskType.DEFAULT;
        EventStorageModule$special$$inlined$provider$2 eventStorageModule$special$$inlined$provider$2 = new EventStorageModule$special$$inlined$provider$2(this, trackerModule, workLauncherImpl, memoryTrimState, 1);
        backgroundTaskService.execute(taskType, eventStorageModule$special$$inlined$provider$2);
        this.lastRunInfoStore = eventStorageModule$special$$inlined$provider$2;
        RootDetectionProvider rootDetectionProvider = new RootDetectionProvider(deviceBuildInfo, clientObservable, logger);
        java.lang.Thread thread = new java.lang.Thread(rootDetectionProvider, "Bugsnag Worker");
        thread.setPriority(1);
        thread.setDaemon(true);
        thread.start();
        this.sessionStore = rootDetectionProvider;
        TaskType taskType2 = TaskType.DEFAULT;
        EventStorageModule$special$$inlined$provider$2 eventStorageModule$special$$inlined$provider$22 = new EventStorageModule$special$$inlined$provider$2(key2, this, storageModule$special$$inlined$provider$2, backgroundTaskService);
        backgroundTaskService.execute(taskType2, eventStorageModule$special$$inlined$provider$22);
        this.lastRunInfo = eventStorageModule$special$$inlined$provider$22;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StorageModule(Context context, ImmutableConfig immutableConfig, BackgroundTaskService backgroundTaskService) {
        super(backgroundTaskService, r0);
        TaskType taskType = TaskType.IO;
        this.immutableConfig = immutableConfig;
        final int i = 0;
        Runnable runnable = new RunnableProvider(this) { // from class: com.bugsnag.android.StorageModule$special$$inlined$provider$1
            public final /* synthetic */ StorageModule this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bugsnag.android.internal.dag.RunnableProvider
            public final Object invoke() {
                int i2 = i;
                StorageModule storageModule = this.this$0;
                switch (i2) {
                    case 0:
                        File file = (File) storageModule.immutableConfig.persistenceDirectory.getValue();
                        File file2 = new File(file, "bugsnag");
                        if (!file2.isDirectory()) {
                            file2.mkdirs();
                        }
                        for (Pair pair : CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair("last-run-info", "last-run-info"), new Pair("bugsnag-sessions", "sessions"), new Pair("user-info", "user-info"), new Pair("bugsnag-native", "native"), new Pair("bugsnag-errors", "errors")})) {
                            String str = (String) pair.first;
                            String str2 = (String) pair.second;
                            File file3 = new File(file, str);
                            if (file3.exists()) {
                                file3.renameTo(new File(file2, str2));
                            }
                        }
                        return file2;
                    case 1:
                        ImmutableConfig immutableConfig2 = storageModule.immutableConfig;
                        return new UserStore(immutableConfig2.persistUser, (StorageModule$special$$inlined$provider$1) storageModule.bugsnagDir, (StorageModule$special$$inlined$provider$2) storageModule.deviceId, (StorageModule$special$$inlined$provider$2) storageModule.sharedPrefMigrator, immutableConfig2.logger);
                    case 2:
                        return new LastRunInfoStore(storageModule.immutableConfig);
                    default:
                        File file4 = (File) ((StorageModule$special$$inlined$provider$1) storageModule.bugsnagDir).get();
                        ImmutableConfig immutableConfig3 = storageModule.immutableConfig;
                        return new SessionStore(file4, immutableConfig3.maxPersistedSessions, immutableConfig3.apiKey, immutableConfig3.logger);
                }
            }
        };
        backgroundTaskService.execute(taskType, runnable);
        this.bugsnagDir = runnable;
        Runnable storageModule$special$$inlined$provider$2 = new StorageModule$special$$inlined$provider$2(context, 0);
        backgroundTaskService.execute(taskType, storageModule$special$$inlined$provider$2);
        this.sharedPrefMigrator = storageModule$special$$inlined$provider$2;
        Runnable storageModule$special$$inlined$provider$3 = new StorageModule$special$$inlined$provider$3(this, context, i);
        backgroundTaskService.execute(taskType, storageModule$special$$inlined$provider$3);
        final int i2 = 1;
        Runnable storageModule$special$$inlined$provider$22 = new StorageModule$special$$inlined$provider$2(storageModule$special$$inlined$provider$3, 1);
        backgroundTaskService.execute(taskType, storageModule$special$$inlined$provider$22);
        this.deviceId = storageModule$special$$inlined$provider$22;
        Runnable runnable2 = new RunnableProvider(this) { // from class: com.bugsnag.android.StorageModule$special$$inlined$provider$1
            public final /* synthetic */ StorageModule this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bugsnag.android.internal.dag.RunnableProvider
            public final Object invoke() {
                int i22 = i2;
                StorageModule storageModule = this.this$0;
                switch (i22) {
                    case 0:
                        File file = (File) storageModule.immutableConfig.persistenceDirectory.getValue();
                        File file2 = new File(file, "bugsnag");
                        if (!file2.isDirectory()) {
                            file2.mkdirs();
                        }
                        for (Pair pair : CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair("last-run-info", "last-run-info"), new Pair("bugsnag-sessions", "sessions"), new Pair("user-info", "user-info"), new Pair("bugsnag-native", "native"), new Pair("bugsnag-errors", "errors")})) {
                            String str = (String) pair.first;
                            String str2 = (String) pair.second;
                            File file3 = new File(file, str);
                            if (file3.exists()) {
                                file3.renameTo(new File(file2, str2));
                            }
                        }
                        return file2;
                    case 1:
                        ImmutableConfig immutableConfig2 = storageModule.immutableConfig;
                        return new UserStore(immutableConfig2.persistUser, (StorageModule$special$$inlined$provider$1) storageModule.bugsnagDir, (StorageModule$special$$inlined$provider$2) storageModule.deviceId, (StorageModule$special$$inlined$provider$2) storageModule.sharedPrefMigrator, immutableConfig2.logger);
                    case 2:
                        return new LastRunInfoStore(storageModule.immutableConfig);
                    default:
                        File file4 = (File) ((StorageModule$special$$inlined$provider$1) storageModule.bugsnagDir).get();
                        ImmutableConfig immutableConfig3 = storageModule.immutableConfig;
                        return new SessionStore(file4, immutableConfig3.maxPersistedSessions, immutableConfig3.apiKey, immutableConfig3.logger);
                }
            }
        };
        backgroundTaskService.execute(taskType, runnable2);
        this.userStore = runnable2;
        final int i3 = 2;
        RunnableProvider runnableProvider = new RunnableProvider(this) { // from class: com.bugsnag.android.StorageModule$special$$inlined$provider$1
            public final /* synthetic */ StorageModule this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bugsnag.android.internal.dag.RunnableProvider
            public final Object invoke() {
                int i22 = i3;
                StorageModule storageModule = this.this$0;
                switch (i22) {
                    case 0:
                        File file = (File) storageModule.immutableConfig.persistenceDirectory.getValue();
                        File file2 = new File(file, "bugsnag");
                        if (!file2.isDirectory()) {
                            file2.mkdirs();
                        }
                        for (Pair pair : CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair("last-run-info", "last-run-info"), new Pair("bugsnag-sessions", "sessions"), new Pair("user-info", "user-info"), new Pair("bugsnag-native", "native"), new Pair("bugsnag-errors", "errors")})) {
                            String str = (String) pair.first;
                            String str2 = (String) pair.second;
                            File file3 = new File(file, str);
                            if (file3.exists()) {
                                file3.renameTo(new File(file2, str2));
                            }
                        }
                        return file2;
                    case 1:
                        ImmutableConfig immutableConfig2 = storageModule.immutableConfig;
                        return new UserStore(immutableConfig2.persistUser, (StorageModule$special$$inlined$provider$1) storageModule.bugsnagDir, (StorageModule$special$$inlined$provider$2) storageModule.deviceId, (StorageModule$special$$inlined$provider$2) storageModule.sharedPrefMigrator, immutableConfig2.logger);
                    case 2:
                        return new LastRunInfoStore(storageModule.immutableConfig);
                    default:
                        File file4 = (File) ((StorageModule$special$$inlined$provider$1) storageModule.bugsnagDir).get();
                        ImmutableConfig immutableConfig3 = storageModule.immutableConfig;
                        return new SessionStore(file4, immutableConfig3.maxPersistedSessions, immutableConfig3.apiKey, immutableConfig3.logger);
                }
            }
        };
        backgroundTaskService.execute(taskType, runnableProvider);
        this.lastRunInfoStore = runnableProvider;
        final int i4 = 3;
        RunnableProvider runnableProvider2 = new RunnableProvider(this) { // from class: com.bugsnag.android.StorageModule$special$$inlined$provider$1
            public final /* synthetic */ StorageModule this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bugsnag.android.internal.dag.RunnableProvider
            public final Object invoke() {
                int i22 = i4;
                StorageModule storageModule = this.this$0;
                switch (i22) {
                    case 0:
                        File file = (File) storageModule.immutableConfig.persistenceDirectory.getValue();
                        File file2 = new File(file, "bugsnag");
                        if (!file2.isDirectory()) {
                            file2.mkdirs();
                        }
                        for (Pair pair : CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair("last-run-info", "last-run-info"), new Pair("bugsnag-sessions", "sessions"), new Pair("user-info", "user-info"), new Pair("bugsnag-native", "native"), new Pair("bugsnag-errors", "errors")})) {
                            String str = (String) pair.first;
                            String str2 = (String) pair.second;
                            File file3 = new File(file, str);
                            if (file3.exists()) {
                                file3.renameTo(new File(file2, str2));
                            }
                        }
                        return file2;
                    case 1:
                        ImmutableConfig immutableConfig2 = storageModule.immutableConfig;
                        return new UserStore(immutableConfig2.persistUser, (StorageModule$special$$inlined$provider$1) storageModule.bugsnagDir, (StorageModule$special$$inlined$provider$2) storageModule.deviceId, (StorageModule$special$$inlined$provider$2) storageModule.sharedPrefMigrator, immutableConfig2.logger);
                    case 2:
                        return new LastRunInfoStore(storageModule.immutableConfig);
                    default:
                        File file4 = (File) ((StorageModule$special$$inlined$provider$1) storageModule.bugsnagDir).get();
                        ImmutableConfig immutableConfig3 = storageModule.immutableConfig;
                        return new SessionStore(file4, immutableConfig3.maxPersistedSessions, immutableConfig3.apiKey, immutableConfig3.logger);
                }
            }
        };
        backgroundTaskService.execute(taskType, runnableProvider2);
        this.sessionStore = runnableProvider2;
        StorageModule$special$$inlined$provider$2 storageModule$special$$inlined$provider$23 = new StorageModule$special$$inlined$provider$2(runnableProvider, 2);
        backgroundTaskService.execute(taskType, storageModule$special$$inlined$provider$23);
        this.lastRunInfo = storageModule$special$$inlined$provider$23;
    }
}
