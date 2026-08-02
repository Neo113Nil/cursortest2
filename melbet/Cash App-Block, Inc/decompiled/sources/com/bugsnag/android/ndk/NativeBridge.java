package com.bugsnag.android.ndk;

import android.os.Build;
import android.util.JsonReader;
import androidx.tracing.Trace;
import androidx.work.impl.WorkLauncherImpl;
import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.Logger;
import com.bugsnag.android.NativeInterface;
import com.bugsnag.android.StateEvent;
import com.bugsnag.android.User;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.StateObserver;
import com.bugsnag.android.internal.TaskType;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u001b\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0086 J\t\u0010\u001b\u001a\u00020\u0011H\u0086 J!\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\bH\u0086 J!\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020!H\u0086 J!\u0010\"\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0086 J!\u0010#\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0086 J\t\u0010$\u001a\u00020\u0011H\u0086 J\u0011\u0010%\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086 J\t\u0010&\u001a\u00020\u0011H\u0086 J\u0011\u0010'\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0013H\u0086 J\b\u0010(\u001a\u00020\u0011H\u0002J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0015\u0018\u00010*H\u0086 J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010*H\u0086 J\t\u0010,\u001a\u00020-H\u0086 J\u0010\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020\u00112\u0006\u0010/\u001a\u000202H\u0002J\u001d\u00103\u001a\u00020\u00112\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00150*H\u0086 JY\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u0015H\u0086 J\u0012\u0010?\u001a\u00020\b2\b\u0010@\u001a\u0004\u0018\u00010\u0018H\u0002J\u0011\u0010A\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u0013H\u0086 J\u0011\u0010C\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u0013H\u0086 J\u0010\u0010D\u001a\u00020\u00112\u0006\u0010E\u001a\u00020FH\u0016J\t\u0010G\u001a\u00020\u0011H\u0086 J\t\u0010H\u001a\u00020\u0011H\u0086 J\u0019\u0010I\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0086 J\u0011\u0010J\u001a\u00020\u00112\u0006\u0010K\u001a\u00020LH\u0086 J\u0011\u0010M\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\bH\u0086 J\u0011\u0010O\u001a\u00020\u00112\u0006\u0010P\u001a\u00020\u0013H\u0086 J)\u0010Q\u001a\u00020\u00112\u0006\u0010R\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010S\u001a\u00020\u00152\u0006\u0010T\u001a\u00020\u0015H\u0086 J\t\u0010U\u001a\u00020\u0011H\u0082 J\u0011\u0010V\u001a\u00020\u00112\u0006\u0010W\u001a\u00020\u0013H\u0086 J\u0013\u0010X\u001a\u00020\u00112\b\u0010Y\u001a\u0004\u0018\u00010\u0013H\u0086 J\u0019\u0010Z\u001a\u00020\u00112\u0006\u0010[\u001a\u00020\b2\u0006\u0010\\\u001a\u00020\u0013H\u0086 J\u0011\u0010]\u001a\u00020\u00112\u0006\u0010^\u001a\u00020\bH\u0086 J\u0019\u0010_\u001a\u00020\u00112\u0006\u0010`\u001a\u00020\b2\u0006\u0010a\u001a\u00020\u0013H\u0086 J\u0011\u0010b\u001a\u00020\u00112\u0006\u0010c\u001a\u00020\u0013H\u0086 J\u0011\u0010d\u001a\u00020\u00112\u0006\u0010`\u001a\u00020\u0013H\u0086 J\u0011\u0010e\u001a\u00020\u00112\u0006\u0010`\u001a\u00020\u0013H\u0086 J\u0011\u0010f\u001a\u00020\u00112\u0006\u0010`\u001a\u00020\u0013H\u0086 J\f\u0010g\u001a\u00020\u0015*\u00020hH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006i"}, d2 = {"Lcom/bugsnag/android/ndk/NativeBridge;", "Lcom/bugsnag/android/internal/StateObserver;", "bgTaskService", "Lcom/bugsnag/android/internal/BackgroundTaskService;", "(Lcom/bugsnag/android/internal/BackgroundTaskService;)V", "installed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "is32bit", "", "()Z", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "logger", "Lcom/bugsnag/android/Logger;", "reportDirectory", "Ljava/io/File;", "addBreadcrumb", "", "name", "", "type", "", "timestamp", "metadata", "", "addFeatureFlag", "variant", "addHandledEvent", "addMetadataBoolean", "tab", "key", "value", "addMetadataDouble", "", "addMetadataOpaque", "addMetadataString", "addUnhandledEvent", "clearFeatureFlag", "clearFeatureFlags", "clearMetadataTab", "deliverPendingReports", "getCurrentCallbackSetCounts", "", "getCurrentNativeApiCallUsage", "getSignalUnwindStackFunction", "", "handleAddMetadata", "arg", "Lcom/bugsnag/android/StateEvent$AddMetadata;", "handleInstallMessage", "Lcom/bugsnag/android/StateEvent$Install;", "initCallbackCounts", "counts", "install", "apiKey", "reportingDirectory", "lastRunInfoPath", "eventUUID", "consecutiveLaunchCrashes", "autoDetectNdkCrashes", "apiLevel", "threadSendPolicy", "maxBreadcrumbs", "isInvalidMessage", "msg", "notifyAddCallback", "callback", "notifyRemoveCallback", "onStateChange", BreadcrumbHelper.Category.EVENT, "Lcom/bugsnag/android/StateEvent;", "pausedSession", "refreshSymbolTable", "removeMetadata", "reportOutOfMemory", "oom", "Ljava/lang/OutOfMemoryError;", "setInternalMetricsEnabled", "enabled", "setStaticJsonData", "data", "startedSession", "sessionID", "handledCount", "unhandledCount", "synchronizeState", "updateContext", "context", "updateGroupingDiscriminator", "groupingDiscriminator", "updateInForeground", "inForeground", "activityName", "updateIsLaunching", "isLaunching", "updateLowMemory", "newValue", "memoryTrimLevelDescription", "updateOrientation", "orientation", "updateUserEmail", "updateUserId", "updateUserName", "toNativeValue", "Lcom/bugsnag/android/BreadcrumbType;", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NativeBridge implements StateObserver {
    private final BackgroundTaskService bgTaskService;
    private final ReentrantLock lock = new ReentrantLock();
    private final AtomicBoolean installed = new AtomicBoolean(false);
    private final File reportDirectory = NativeInterface.getNativeReportPath();
    private final Logger logger = NativeInterface.getLogger();

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BreadcrumbType.values().length];
            try {
                iArr[BreadcrumbType.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BreadcrumbType.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BreadcrumbType.MANUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BreadcrumbType.NAVIGATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BreadcrumbType.PROCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BreadcrumbType.REQUEST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BreadcrumbType.STATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BreadcrumbType.USER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NativeBridge(BackgroundTaskService backgroundTaskService) {
        this.bgTaskService = backgroundTaskService;
    }

    private final native void addBreadcrumb(String name, int type2, String timestamp, Object metadata);

    private final void deliverPendingReports() {
        boolean z;
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this.logger);
        File[] listFiles = this.reportDirectory.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!StringsKt__StringsJVMKt.endsWith(file.getName(), ".json", false) || StringsKt__StringsJVMKt.endsWith(file.getName(), ".static_data.json", false)) {
                    z = true;
                } else {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), PKIFailureInfo.certRevoked);
                        try {
                            JsonReader jsonReader = new JsonReader(bufferedReader);
                            try {
                                z = workLauncherImpl.shouldDiscard$bugsnag_plugin_android_ndk_release(jsonReader);
                                jsonReader.close();
                                bufferedReader.close();
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Exception unused) {
                        z = false;
                    }
                }
                if (z) {
                    file.delete();
                } else {
                    NativeInterface.deliverReport(file);
                }
            }
        }
    }

    private final void handleAddMetadata(StateEvent.AddMetadata arg) {
        String str = arg.key;
        String str2 = arg.section;
        if (str != null) {
            Object makeSafe = Trace.makeSafe(arg.value);
            if (makeSafe instanceof String) {
                str.getClass();
                addMetadataString(str2, str, (String) makeSafe);
                return;
            }
            if (makeSafe instanceof Boolean) {
                str.getClass();
                addMetadataBoolean(str2, str, ((Boolean) makeSafe).booleanValue());
            } else if (makeSafe instanceof Number) {
                str.getClass();
                addMetadataDouble(str2, str, ((Number) makeSafe).doubleValue());
            } else if (makeSafe instanceof OpaqueValue) {
                str.getClass();
                addMetadataOpaque(str2, str, ((OpaqueValue) makeSafe).getJson());
            }
        }
    }

    private final void handleInstallMessage(StateEvent.Install arg) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.installed.get()) {
                this.logger.w("Received duplicate setup message with arg: " + arg);
            } else {
                install(arg.apiKey, this.reportDirectory.getAbsolutePath(), arg.lastRunInfoPath, UUID.randomUUID().toString(), arg.consecutiveLaunchCrashes, arg.autoDetectNdkCrashes, Build.VERSION.SDK_INT, is32bit(), arg.sendThreads.ordinal(), arg.maxBreadcrumbs);
                this.installed.set(true);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final boolean is32bit() {
        String[] cpuAbi = NativeInterface.getCpuAbi();
        int length = cpuAbi.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (StringsKt.contains((CharSequence) cpuAbi[i], (CharSequence) "64", false)) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    private final boolean isInvalidMessage(Object msg) {
        if (msg == null || !(msg instanceof StateEvent)) {
            return true;
        }
        if (this.installed.get() || (msg instanceof StateEvent.Install)) {
            return false;
        }
        this.logger.w("Received message before INSTALL: " + msg);
        return true;
    }

    private final native void synchronizeState();

    private final int toNativeValue(BreadcrumbType breadcrumbType) {
        switch (WhenMappings.$EnumSwitchMapping$0[breadcrumbType.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
        }
    }

    public final void addBreadcrumb(String name, String type2, String timestamp, Object metadata) {
        BreadcrumbType breadcrumbType;
        BreadcrumbType[] values = BreadcrumbType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                breadcrumbType = null;
                break;
            }
            breadcrumbType = values[i];
            if (Intrinsics.areEqual(breadcrumbType.getType(), type2)) {
                break;
            } else {
                i++;
            }
        }
        if (breadcrumbType == null) {
            breadcrumbType = BreadcrumbType.MANUAL;
        }
        addBreadcrumb(name, toNativeValue(breadcrumbType), timestamp, metadata);
    }

    public final native void addFeatureFlag(String name, String variant);

    public final native void addHandledEvent();

    public final native void addMetadataBoolean(String tab, String key, boolean value);

    public final native void addMetadataDouble(String tab, String key, double value);

    public final native void addMetadataOpaque(String tab, String key, String value);

    public final native void addMetadataString(String tab, String key, String value);

    public final native void addUnhandledEvent();

    public final native void clearFeatureFlag(String name);

    public final native void clearFeatureFlags();

    public final native void clearMetadataTab(String tab);

    public final native Map<String, Integer> getCurrentCallbackSetCounts();

    public final native Map<String, Boolean> getCurrentNativeApiCallUsage();

    public final native long getSignalUnwindStackFunction();

    public final native void initCallbackCounts(Map<String, Integer> counts);

    public final native void install(String apiKey, String reportingDirectory, String lastRunInfoPath, String eventUUID, int consecutiveLaunchCrashes, boolean autoDetectNdkCrashes, int apiLevel, boolean is32bit, int threadSendPolicy, int maxBreadcrumbs);

    public final native void notifyAddCallback(String callback);

    public final native void notifyRemoveCallback(String callback);

    @Override // com.bugsnag.android.internal.StateObserver
    public void onStateChange(StateEvent event) {
        if (isInvalidMessage(event)) {
            return;
        }
        if (event instanceof StateEvent.Install) {
            handleInstallMessage((StateEvent.Install) event);
            return;
        }
        if (event instanceof StateEvent.DeliverPending) {
            deliverPendingReports();
            return;
        }
        if (event instanceof StateEvent.AddMetadata) {
            handleAddMetadata((StateEvent.AddMetadata) event);
            return;
        }
        if (event instanceof StateEvent.ClearMetadataSection) {
            clearMetadataTab(((StateEvent.ClearMetadataSection) event).section);
            return;
        }
        if (event instanceof StateEvent.ClearMetadataValue) {
            StateEvent.ClearMetadataValue clearMetadataValue = (StateEvent.ClearMetadataValue) event;
            String str = clearMetadataValue.section;
            String str2 = clearMetadataValue.key;
            removeMetadata(str, str2 != null ? str2 : "");
            return;
        }
        if (event instanceof StateEvent.AddBreadcrumb) {
            StateEvent.AddBreadcrumb addBreadcrumb = (StateEvent.AddBreadcrumb) event;
            addBreadcrumb(addBreadcrumb.message, toNativeValue(addBreadcrumb.f944type), addBreadcrumb.timestamp, addBreadcrumb.metadata);
            return;
        }
        if (Intrinsics.areEqual(event, StateEvent.PauseSession.INSTANCE$1)) {
            addHandledEvent();
            return;
        }
        if (Intrinsics.areEqual(event, StateEvent.PauseSession.INSTANCE$2)) {
            addUnhandledEvent();
            return;
        }
        if (Intrinsics.areEqual(event, StateEvent.PauseSession.INSTANCE)) {
            pausedSession();
            return;
        }
        if (event instanceof StateEvent.StartSession) {
            StateEvent.StartSession startSession = (StateEvent.StartSession) event;
            startedSession(startSession.id, startSession.startedAt, startSession.handledCount, startSession.unhandledCount);
            return;
        }
        if (event instanceof StateEvent.UpdateContext) {
            String str3 = ((StateEvent.UpdateContext) event).context;
            updateContext(str3 != null ? str3 : "");
            return;
        }
        if (event instanceof StateEvent.UpdateGroupingDiscriminator) {
            updateGroupingDiscriminator(((StateEvent.UpdateGroupingDiscriminator) event).groupingDiscriminator);
            return;
        }
        if (event instanceof StateEvent.UpdateInForeground) {
            StateEvent.UpdateInForeground updateInForeground = (StateEvent.UpdateInForeground) event;
            boolean z = updateInForeground.inForeground;
            String str4 = updateInForeground.contextActivity;
            updateInForeground(z, str4 != null ? str4 : "");
            return;
        }
        if (event instanceof StateEvent.UpdateIsLaunching) {
            updateIsLaunching(false);
            this.bgTaskService.submitTask(TaskType.DEFAULT, new AFLogger$$ExternalSyntheticLambda0(this, 13));
            return;
        }
        if (event instanceof StateEvent.UpdateOrientation) {
            String str5 = ((StateEvent.UpdateOrientation) event).orientation;
            updateOrientation(str5 != null ? str5 : "");
            return;
        }
        if (event instanceof StateEvent.UpdateUser) {
            User user = ((StateEvent.UpdateUser) event).user;
            String str6 = user.id;
            if (str6 == null) {
                str6 = "";
            }
            updateUserId(str6);
            String str7 = user.name;
            if (str7 == null) {
                str7 = "";
            }
            updateUserName(str7);
            String str8 = user.email;
            updateUserEmail(str8 != null ? str8 : "");
            return;
        }
        if (event instanceof StateEvent.UpdateMemoryTrimEvent) {
            StateEvent.UpdateMemoryTrimEvent updateMemoryTrimEvent = (StateEvent.UpdateMemoryTrimEvent) event;
            updateLowMemory(updateMemoryTrimEvent.isLowMemory, updateMemoryTrimEvent.memoryTrimLevelDescription);
        } else if (event instanceof StateEvent.AddFeatureFlag) {
            StateEvent.AddFeatureFlag addFeatureFlag = (StateEvent.AddFeatureFlag) event;
            addFeatureFlag(addFeatureFlag.name, addFeatureFlag.variant);
        } else if (event instanceof StateEvent.SynchronizeState) {
            synchronizeState();
        }
    }

    public final native void pausedSession();

    public final native void refreshSymbolTable();

    public final native void removeMetadata(String tab, String key);

    public final native void reportOutOfMemory(OutOfMemoryError oom);

    public final native void setInternalMetricsEnabled(boolean enabled);

    public final native void setStaticJsonData(String data);

    public final native void startedSession(String sessionID, String key, int handledCount, int unhandledCount);

    public final native void updateContext(String context);

    public final native void updateGroupingDiscriminator(String groupingDiscriminator);

    public final native void updateInForeground(boolean inForeground, String activityName);

    public final native void updateIsLaunching(boolean isLaunching);

    public final native void updateLowMemory(boolean newValue, String memoryTrimLevelDescription);

    public final native void updateOrientation(String orientation);

    public final native void updateUserEmail(String newValue);

    public final native void updateUserId(String newValue);

    public final native void updateUserName(String newValue);
}
