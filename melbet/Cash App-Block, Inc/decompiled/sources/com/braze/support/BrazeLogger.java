package com.braze.support;

import android.util.Log;
import bo.app.jg$$ExternalSyntheticLambda1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt;
import okhttp3.Handshake$$ExternalSyntheticLambda0;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001>B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J?\u0010\u0010\u001a\u00020\u000f*\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u0010\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030!H\u0007¢\u0006\u0004\b\u0005\u0010#J\u001b\u0010$\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0002¢\u0006\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'RD\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u0010\u0003\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/RD\u00102\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000f\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R0\u00108\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00198\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b8\u00109\u0012\u0004\b=\u0010\u0003\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\u001c¨\u0006?"}, d2 = {"Lcom/braze/support/BrazeLogger;", "", "<init>", "()V", "", "getBrazeLogTag", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/braze/support/BrazeLogger$Priority;", "priority", "", "tr", "", "skipSdkDebug", "Lkotlin/Function0;", "message", "", "brazelog", "(Ljava/lang/Object;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;)V", "tag", "(Ljava/lang/String;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;)V", "brazeLogTag", "(Ljava/lang/Object;)Ljava/lang/String;", "returnOnDebug", "checkForSystemLogLevelProperty", "(Z)V", "", "initialLogLevel", "setInitialLogLevelFromConfiguration", "(I)V", "msg", "w", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "e", "Ljava/lang/Class;", "classForTag", "(Ljava/lang/Class;)Ljava/lang/String;", "toStringSafe", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/String;", "isSystemPropLogLevelSet", "Z", "hasLogLevelBeenSetForAppRun", "Lkotlin/Function3;", "onLoggedCallback", "Lkotlin/jvm/functions/Function3;", "getOnLoggedCallback", "()Lkotlin/jvm/functions/Function3;", "setOnLoggedCallback", "(Lkotlin/jvm/functions/Function3;)V", "getOnLoggedCallback$annotations", "Lkotlin/Function4;", "sdkDebuggerCallback", "Lkotlin/jvm/functions/Function4;", "getSdkDebuggerCallback$android_sdk_base_release", "()Lkotlin/jvm/functions/Function4;", "setSdkDebuggerCallback$android_sdk_base_release", "(Lkotlin/jvm/functions/Function4;)V", "logLevel", "I", "getLogLevel", "()I", "setLogLevel", "getLogLevel$annotations", "Priority", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeLogger {
    private static boolean hasLogLevelBeenSetForAppRun;
    private static boolean isSystemPropLogLevelSet;
    private static Function3 onLoggedCallback;
    private static Function4 sdkDebuggerCallback;
    public static final BrazeLogger INSTANCE = new BrazeLogger();
    private static int logLevel = 4;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/braze/support/BrazeLogger$Priority;", "", "logLevel", "", "<init>", "(Ljava/lang/String;II)V", "getLogLevel", "()I", "D", "I", "E", GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY, "W", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Priority {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Priority[] $VALUES;
        private final int logLevel;
        public static final Priority D = new Priority("D", 0, 3);
        public static final Priority I = new Priority("I", 1, 4);
        public static final Priority E = new Priority("E", 2, 6);
        public static final Priority V = new Priority(GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY, 3, 2);
        public static final Priority W = new Priority("W", 4, 5);

        private static final /* synthetic */ Priority[] $values() {
            return new Priority[]{D, I, E, V, W};
        }

        static {
            Priority[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private Priority(String str, int i, int i2) {
            this.logLevel = i2;
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) $VALUES.clone();
        }

        public final int getLogLevel() {
            return this.logLevel;
        }
    }

    private BrazeLogger() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_logLevel_$lambda$0(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Log level already set via system property. BrazeLogger.setLogLevel() ignored for level: ");
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, Object obj, Priority priority, Throwable th, boolean z, Function0 function0, int i, Object obj2) {
        if ((i & 1) != 0) {
            priority = Priority.D;
        }
        Priority priority2 = priority;
        if ((i & 2) != 0) {
            th = null;
        }
        Throwable th2 = th;
        if ((i & 4) != 0) {
            z = false;
        }
        brazeLogger.brazelog(obj, priority2, th2, z, (Function0<String>) function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String brazelog$lambda$0(Function0 function0) {
        return INSTANCE.toStringSafe(function0);
    }

    public static final void checkForSystemLogLevelProperty(boolean returnOnDebug) {
        String a = j.a("log.tag.BRAZE");
        if ("verbose".equalsIgnoreCase(StringsKt.trim(j.a("log.tag.APPBOY")).toString()) || "verbose".equalsIgnoreCase(StringsKt.trim(a).toString())) {
            setLogLevel(2);
            isSystemPropLogLevelSet = true;
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, (Object) brazeLogger, Priority.I, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(0), 6, (Object) null);
        }
    }

    public static /* synthetic */ void checkForSystemLogLevelProperty$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        checkForSystemLogLevelProperty(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String checkForSystemLogLevelProperty$lambda$0() {
        return "BrazeLogger log level set to VERBOSE via device system property for BRAZE/APPBOY. Note that subsequent calls to BrazeLogger.setLogLevel() will have no effect.";
    }

    public static final void e(String tag, String msg, Throwable tr) {
        tag.getClass();
        msg.getClass();
        tr.getClass();
        brazelog$default(INSTANCE, tag, Priority.D, tr, false, (Function0) new b$$ExternalSyntheticLambda1(msg, 11), 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e$lambda$0(String str) {
        return str;
    }

    public static final String getBrazeLogTag(Class<?> classForTag) {
        classForTag.getClass();
        String name = classForTag.getName();
        int length = name.length();
        if (length > 65) {
            name = name.substring(length - 65);
        }
        return "Braze v42.2.0 .".concat(name);
    }

    public static final void setInitialLogLevelFromConfiguration(int initialLogLevel) {
        if (hasLogLevelBeenSetForAppRun) {
            return;
        }
        setLogLevel(initialLogLevel);
    }

    public static final void setLogLevel(int i) {
        if (isSystemPropLogLevelSet) {
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, (Object) brazeLogger, Priority.W, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(i, 14), 6, (Object) null);
        } else {
            hasLogLevelBeenSetForAppRun = true;
            logLevel = i;
        }
    }

    private final String toStringSafe(Function0<? extends Object> function0) {
        try {
            return String.valueOf(function0.invoke());
        } catch (Exception unused) {
            return "";
        }
    }

    public static final void w(String tag, String msg, Throwable tr) {
        tag.getClass();
        msg.getClass();
        brazelog$default(INSTANCE, tag, Priority.W, tr, false, (Function0) new b$$ExternalSyntheticLambda1(msg, 10), 8, (Object) null);
    }

    public static /* synthetic */ void w$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        w(str, str2, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String w$lambda$0(String str) {
        return str;
    }

    public final String brazeLogTag(Object obj) {
        obj.getClass();
        String name = obj.getClass().getName();
        String substringBefore$default = StringsKt.substringBefore$default(name, '$');
        String substringAfterLast = StringsKt.substringAfterLast('.', substringBefore$default, substringBefore$default);
        return substringAfterLast.length() == 0 ? getBrazeLogTag(name) : getBrazeLogTag(substringAfterLast);
    }

    public final void brazelog(String tag, Priority priority, Throwable tr, boolean skipSdkDebug, Function0<String> message) {
        Function4 function4;
        tag.getClass();
        priority.getClass();
        message.getClass();
        Lazy lazy = LazyKt.lazy(new Handshake$$ExternalSyntheticLambda0(2, message));
        Function3 function3 = onLoggedCallback;
        if (function3 != null) {
            function3.invoke(priority, lazy.getValue(), tr);
        }
        if (!skipSdkDebug && (function4 = sdkDebuggerCallback) != null) {
            function4.invoke(tag, priority, lazy.getValue(), tr);
        }
        if (logLevel <= priority.getLogLevel()) {
            int i = a.a[priority.ordinal()];
            if (i == 1) {
                if (tr == null) {
                    Log.d(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.d(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i == 2) {
                if (tr == null) {
                    Log.i(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.i(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i == 3) {
                if (tr == null) {
                    Log.w(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.e(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i == 4) {
                if (tr == null) {
                    Log.w(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.w(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i != 5) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            } else if (tr == null) {
                Log.v(tag, (String) lazy.getValue());
            } else {
                Log.v(tag, (String) lazy.getValue(), tr);
            }
        }
    }

    public final void setSdkDebuggerCallback$android_sdk_base_release(Function4 function4) {
        sdkDebuggerCallback = function4;
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, String str, Priority priority, Throwable th, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            priority = Priority.D;
        }
        Priority priority2 = priority;
        if ((i & 4) != 0) {
            th = null;
        }
        Throwable th2 = th;
        if ((i & 8) != 0) {
            z = false;
        }
        brazeLogger.brazelog(str, priority2, th2, z, (Function0<String>) function0);
    }

    public static final void w(String str, String str2) {
        str.getClass();
        str2.getClass();
        w$default(str, str2, null, 4, null);
    }

    public final String getBrazeLogTag(String str) {
        str.getClass();
        return "Braze v42.2.0 ." + str;
    }

    public final void brazelog(Object obj, Priority priority, Throwable th, boolean z, Function0<String> function0) {
        obj.getClass();
        priority.getClass();
        function0.getClass();
        if (logLevel <= priority.getLogLevel() || sdkDebuggerCallback != null) {
            brazelog(brazeLogTag(obj), priority, th, z, function0);
        }
    }
}
