package com.bugsnag.android;

import com.bugsnag.android.Client;
import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.StateObserver;
import com.bugsnag.android.internal.TaskType;
import com.bugsnag.android.internal.dag.Provider;
import com.bugsnag.android.ndk.NativeBridge;
import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyMap;
import okio.Utf8;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u000e\u001a\u00020\u000fH\u0082 J\t\u0010\u0010\u001a\u00020\u000fH\u0082 J\t\u0010\u0011\u001a\u00020\u0012H\u0082 J\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u0014J\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00170\u0014J\u0006\u0010\u0018\u001a\u00020\u0019J\u001a\u0010\u001a\u001a\u00020\u000f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u0014J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u000e\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0012J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0017J\u001a\u0010$\u001a\u00020\u000f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0\u0014J\b\u0010'\u001a\u00020\u000fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bugsnag/android/NdkPlugin;", "Lcom/bugsnag/android/Plugin;", "()V", "client", "Lcom/bugsnag/android/Client;", "libraryLoader", "Lcom/bugsnag/android/LibraryLoader;", "<set-?>", "Lcom/bugsnag/android/ndk/NativeBridge;", "nativeBridge", "getNativeBridge", "()Lcom/bugsnag/android/ndk/NativeBridge;", "oneTimeSetupPerformed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "disableCrashReporting", "", "enableCrashReporting", "getBinaryArch", "", "getCurrentCallbackSetCounts", "", "", "getCurrentNativeApiCallUsage", "", "getSignalUnwindStackFunction", "", "initCallbackCounts", "counts", "initNativeBridge", "load", "notifyAddCallback", "callback", "notifyRemoveCallback", "performOneTimeSetup", "setInternalMetricsEnabled", "enabled", "setStaticData", "data", "", "unload", "Companion", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NdkPlugin implements Plugin {
    private static final Companion Companion = new Companion();
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report NDK errors. See https://docs.bugsnag.com/platforms/android/ndk-link-errors";
    private Client client;
    private NativeBridge nativeBridge;
    private final LibraryLoader libraryLoader = new LibraryLoader();
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);

    public final class Companion {
    }

    private final native void disableCrashReporting();

    private final native void enableCrashReporting();

    private final native String getBinaryArch();

    private final NativeBridge initNativeBridge(final Client client) {
        boolean z;
        Set<Map.Entry> entrySet;
        NativeBridge nativeBridge = new NativeBridge(client.bgTaskService);
        client.metadataState.addObserver(nativeBridge);
        client.breadcrumbState.addObserver(nativeBridge);
        client.sessionTracker.addObserver(nativeBridge);
        client.clientObservable.addObserver(nativeBridge);
        ((UserState) client.userState.get()).addObserver(nativeBridge);
        client.contextState.addObserver(nativeBridge);
        client.deliveryDelegate.addObserver(nativeBridge);
        client.launchCrashTracker.addObserver(nativeBridge);
        client.memoryTrimState.addObserver(nativeBridge);
        client.featureFlagState.addObserver(nativeBridge);
        client.groupingDiscriminatorState.addObserver(nativeBridge);
        int i = 0;
        try {
            z = ((Boolean) client.bgTaskService.submitTask(TaskType.IO, new Callable() { // from class: com.bugsnag.android.Client.8
                public AnonymousClass8() {
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    File nativeReportPath = NativeInterface.getNativeReportPath();
                    return Boolean.valueOf(nativeReportPath.exists() || nativeReportPath.mkdirs());
                }
            }).get()).booleanValue();
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            String absolutePath = client.lastRunInfoStore.file.getAbsolutePath();
            LastRunInfo lastRunInfo = client.lastRunInfo;
            int i2 = lastRunInfo != null ? lastRunInfo.consecutiveLaunchCrashes : 0;
            ClientObservable clientObservable = client.clientObservable;
            ImmutableConfig immutableConfig = client.immutableConfig;
            if (!clientObservable.getObservers$bugsnag_android_core_release().isEmpty()) {
                String str = immutableConfig.apiKey;
                Provider provider = immutableConfig.buildUuid;
                boolean z2 = immutableConfig.enabledErrorTypes.ndkCrashes;
                if (provider != null && provider.isComplete()) {
                }
                StateEvent.Install install = new StateEvent.Install(str, z2, absolutePath, i2, immutableConfig.sendThreads, immutableConfig.maxBreadcrumbs);
                Iterator<T> it = clientObservable.getObservers$bugsnag_android_core_release().iterator();
                while (it.hasNext()) {
                    ((StateObserver) it.next()).onStateChange(install);
                }
            }
            MetadataState metadataState = client.metadataState;
            Metadata metadata = metadataState.metadata;
            for (String str2 : metadata.store.keySet()) {
                Map map = (Map) metadata.store.get(str2);
                if (map != null && (entrySet = map.entrySet()) != null) {
                    for (Map.Entry entry : entrySet) {
                        metadataState.notifyMetadataAdded(str2, (String) entry.getKey(), entry.getValue());
                    }
                }
            }
            client.contextState.emitObservableEvent();
            ((UserState) client.userState.get()).emitObservableEvent();
            client.memoryTrimState.emitObservableEvent();
            FeatureFlagState featureFlagState = client.featureFlagState;
            FeatureFlag[] featureFlagArr = featureFlagState.featureFlags.flags;
            ArrayList arrayList = new ArrayList(featureFlagArr.length);
            for (FeatureFlag featureFlag : featureFlagArr) {
                arrayList.add(new FeatureFlag(featureFlag.name, featureFlag.variant));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                FeatureFlag featureFlag2 = (FeatureFlag) it2.next();
                String str3 = featureFlag2.name;
                String str4 = featureFlag2.variant;
                if (!featureFlagState.getObservers$bugsnag_android_core_release().isEmpty()) {
                    StateEvent.AddFeatureFlag addFeatureFlag = new StateEvent.AddFeatureFlag(str3, str4);
                    Iterator<T> it3 = featureFlagState.getObservers$bugsnag_android_core_release().iterator();
                    while (it3.hasNext()) {
                        ((StateObserver) it3.next()).onStateChange(addFeatureFlag);
                    }
                }
            }
            ClientObservable clientObservable2 = client.clientObservable;
            if (!clientObservable2.getObservers$bugsnag_android_core_release().isEmpty()) {
                StateEvent.DeliverPending deliverPending = StateEvent.DeliverPending.INSTANCE;
                Iterator<T> it4 = clientObservable2.getObservers$bugsnag_android_core_release().iterator();
                while (it4.hasNext()) {
                    ((StateObserver) it4.next()).onStateChange(deliverPending);
                }
            }
            Provider provider2 = client.immutableConfig.buildUuid;
            if (provider2 != null && !provider2.isComplete()) {
                try {
                    client.bgTaskService.submitTask(TaskType.IO, new Client.AnonymousClass7(client, i));
                } catch (RejectedExecutionException e) {
                    client.logger.w("Failed to schedule deferred NDK build UUID sync", e);
                }
            }
        } else {
            client.logger.w("Failed to setup NDK directory.");
        }
        return nativeBridge;
    }

    private final void performOneTimeSetup(Client client) {
        this.libraryLoader.loadLibrary("bugsnag-ndk", client, new AnrPlugin$$ExternalSyntheticLambda0(1));
        if (!this.libraryLoader.loaded) {
            client.logger.e(LOAD_ERR_MSG);
        } else {
            client.appDataCollector.binaryArch = getBinaryArch();
            this.nativeBridge = initNativeBridge(client);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean performOneTimeSetup$lambda$0(Event event) {
        Error error = (Error) event.impl.errors.get(0);
        event.addMetadata("LinkError", "errorClass", error.impl.errorClass);
        ErrorInternal errorInternal = error.impl;
        event.addMetadata("LinkError", "errorMessage", errorInternal.errorMessage);
        error.setErrorClass("NdkLinkError");
        errorInternal.errorMessage = LOAD_ERR_MSG;
        return true;
    }

    public final Map<String, Integer> getCurrentCallbackSetCounts() {
        Map<String, Integer> currentCallbackSetCounts;
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null && (currentCallbackSetCounts = nativeBridge.getCurrentCallbackSetCounts()) != null) {
            return currentCallbackSetCounts;
        }
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    public final Map<String, Boolean> getCurrentNativeApiCallUsage() {
        Map<String, Boolean> currentNativeApiCallUsage;
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null && (currentNativeApiCallUsage = nativeBridge.getCurrentNativeApiCallUsage()) != null) {
            return currentNativeApiCallUsage;
        }
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    public final NativeBridge getNativeBridge() {
        return this.nativeBridge;
    }

    public final long getSignalUnwindStackFunction() {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            return nativeBridge.getSignalUnwindStackFunction();
        }
        return 0L;
    }

    public final void initCallbackCounts(Map<String, Integer> counts) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            nativeBridge.initCallbackCounts(counts);
        }
    }

    @Override // com.bugsnag.android.Plugin
    public void load(Client client) {
        this.client = client;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(client);
        }
        if (this.libraryLoader.loaded) {
            enableCrashReporting();
            client.logger.i("Initialised NDK Plugin");
        }
    }

    public final void notifyAddCallback(String callback) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            nativeBridge.notifyAddCallback(callback);
        }
    }

    public final void notifyRemoveCallback(String callback) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            nativeBridge.notifyRemoveCallback(callback);
        }
    }

    public final void setInternalMetricsEnabled(boolean enabled) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            nativeBridge.setInternalMetricsEnabled(enabled);
        }
    }

    public final void setStaticData(Map<String, ? extends Object> data) {
        StringWriter stringWriter = new StringWriter();
        try {
            JsonStream jsonStream = new JsonStream(stringWriter);
            try {
                jsonStream.value(data);
                jsonStream.close();
                stringWriter.close();
                String stringWriter2 = stringWriter.toString();
                NativeBridge nativeBridge = this.nativeBridge;
                if (nativeBridge != null) {
                    nativeBridge.setStaticJsonData(stringWriter2);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Utf8.closeFinally(stringWriter, th);
                throw th2;
            }
        }
    }

    @Override // com.bugsnag.android.Plugin
    public void unload() {
        Client client;
        if (this.libraryLoader.loaded) {
            disableCrashReporting();
            NativeBridge nativeBridge = this.nativeBridge;
            if (nativeBridge == null || (client = this.client) == null) {
                return;
            }
            client.metadataState.removeObserver(nativeBridge);
            client.breadcrumbState.removeObserver(nativeBridge);
            client.sessionTracker.removeObserver(nativeBridge);
            client.clientObservable.removeObserver(nativeBridge);
            ((UserState) client.userState.get()).removeObserver(nativeBridge);
            client.contextState.removeObserver(nativeBridge);
            client.deliveryDelegate.removeObserver(nativeBridge);
            client.launchCrashTracker.removeObserver(nativeBridge);
            client.memoryTrimState.removeObserver(nativeBridge);
            client.featureFlagState.removeObserver(nativeBridge);
            client.groupingDiscriminatorState.removeObserver(nativeBridge);
        }
    }
}
