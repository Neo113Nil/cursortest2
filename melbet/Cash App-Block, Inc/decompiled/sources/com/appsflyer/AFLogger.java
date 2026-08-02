package com.appsflyer;

import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFh1ySDK;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001:B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ7\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0015J+\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0016J3\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0017J#\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0015J+\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\bJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\bJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b!\u0010\u000bJ'\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&JG\u0010)\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010&J!\u00100\u001a\u00020\u00062\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010.\"\u00020\u0001¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00062\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010.\"\u00020\u0001¢\u0006\u0004\b2\u00101J'\u00103\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u0010&J'\u00104\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u0010&R\u0015\u00106\u001a\u0002058BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u00109\u001a\b\u0012\u0004\u0012\u00020\u0001088BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b9\u00107"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFh1ySDK;", "<init>", "()V", "", "debugLogMessage", "", "afDebugLog", "(Ljava/lang/String;)V", "", "shouldRemoteDebug", "(Ljava/lang/String;Z)V", "message", "", "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "afErrorLogForExcManagerOnly", "disableReporting", "logMessage", "afInfoLog", "afLogForce", "rdLogMessage", "afRDLog", "afVerboseLog", "warningLogMessage", "afWarnLog", "Lcom/appsflyer/internal/AFg1cSDK;", "tag", "msg", "d", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "throwable", "printMsg", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", "i", "", "client", "registerClient", "([Lcom/appsflyer/internal/AFh1ySDK;)V", "unregisterClient", "v", "w", "Ljava/util/concurrent/ExecutorService;", "getCurrencyIso4217Code", "Lkotlin/Lazy;", "", "getMediationNetwork", "LogLevel"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFLogger extends AFh1ySDK {
    public static final AFLogger INSTANCE = new AFLogger();
    private static final Lazy getMediationNetwork = LazyKt.lazy(new Function0<Set<AFh1ySDK>>() { // from class: com.appsflyer.AFLogger.7
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final Set<AFh1ySDK> invoke() {
            return new LinkedHashSet();
        }
    });
    private static final Lazy getCurrencyIso4217Code = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.AFLogger.5
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return AFc1kSDK.getMediationNetwork();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "level", "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    @Deprecated
    public static final void afDebugLog(String debugLogMessage) {
        debugLogMessage.getClass();
        INSTANCE.d(AFg1cSDK.OTHER, debugLogMessage, true);
    }

    @Deprecated
    public static final void afErrorLog(String errorLogMessage, Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, false, false, 120, null);
    }

    @Deprecated
    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex, boolean disableReporting) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, !disableReporting, false, 64, null);
    }

    @Deprecated
    public static final void afInfoLog(String logMessage) {
        logMessage.getClass();
        INSTANCE.i(AFg1cSDK.OTHER, logMessage, true);
    }

    @Deprecated
    public static final void afLogForce(String logMessage) {
        logMessage.getClass();
        INSTANCE.force(AFg1cSDK.OTHER, logMessage);
    }

    @Deprecated
    public static final void afRDLog(String rdLogMessage) {
        rdLogMessage.getClass();
        INSTANCE.v(AFg1cSDK.OTHER, rdLogMessage, true);
    }

    @Deprecated
    public static final void afVerboseLog(String rdLogMessage) {
        rdLogMessage.getClass();
        INSTANCE.v(AFg1cSDK.OTHER, rdLogMessage, false);
    }

    @Deprecated
    public static final void afWarnLog(String warningLogMessage) {
        warningLogMessage.getClass();
        AFh1ySDK.w$default(INSTANCE, AFg1cSDK.OTHER, warningLogMessage, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFh1ySDK[] aFh1ySDKArr) {
        aFh1ySDKArr.getClass();
        CollectionsKt__MutableCollectionsKt.addAll((Set) getMediationNetwork.getValue(), aFh1ySDKArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFh1ySDK[] aFh1ySDKArr) {
        aFh1ySDKArr.getClass();
        ((Set) getMediationNetwork.getValue()).removeAll(ArraysKt___ArraysKt.toSet(aFh1ySDKArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(Function1 function1) {
        function1.getClass();
        Iterator it = ((Set) getMediationNetwork.getValue()).iterator();
        while (it.hasNext()) {
            function1.invoke((AFh1ySDK) it.next());
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(final AFg1cSDK tag, final String msg, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getCurrencyIso4217Code(AFh1ySDK aFh1ySDK) {
                aFh1ySDK.getClass();
                aFh1ySDK.d(AFg1cSDK.this, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                getCurrencyIso4217Code((AFh1ySDK) obj);
                return Unit.INSTANCE;
            }
        }, 0));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(final AFg1cSDK tag, final String msg, final Throwable throwable, final boolean printMsg, final boolean printThrowable, final boolean shouldReportToExManager, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        throwable.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getRevenue(AFh1ySDK aFh1ySDK) {
                aFh1ySDK.getClass();
                aFh1ySDK.e(AFg1cSDK.this, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                getRevenue((AFh1ySDK) obj);
                return Unit.INSTANCE;
            }
        }, 0));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(final AFg1cSDK tag, final String msg) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getMonetizationNetwork(AFh1ySDK aFh1ySDK) {
                aFh1ySDK.getClass();
                aFh1ySDK.force(AFg1cSDK.this, msg);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                getMonetizationNetwork((AFh1ySDK) obj);
                return Unit.INSTANCE;
            }
        }, 0));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(final AFg1cSDK tag, final String msg, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
                aFh1ySDK.getClass();
                aFh1ySDK.i(AFg1cSDK.this, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                AFAdRevenueData((AFh1ySDK) obj);
                return Unit.INSTANCE;
            }
        }, 0));
    }

    public final void registerClient(AFh1ySDK... client) {
        client.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda1(client, 1));
    }

    public final void unregisterClient(AFh1ySDK... client) {
        client.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda1(client, 0));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(final AFg1cSDK tag, final String msg, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getMediationNetwork(AFh1ySDK aFh1ySDK) {
                aFh1ySDK.getClass();
                aFh1ySDK.v(AFg1cSDK.this, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                getMediationNetwork((AFh1ySDK) obj);
                return Unit.INSTANCE;
            }
        }, 0));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(final AFg1cSDK tag, final String msg, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
                aFh1ySDK.getClass();
                aFh1ySDK.w(AFg1cSDK.this, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                AFAdRevenueData((AFh1ySDK) obj);
                return Unit.INSTANCE;
            }
        }, 0));
    }

    @Deprecated
    public static final void afDebugLog(String debugLogMessage, boolean shouldRemoteDebug) {
        debugLogMessage.getClass();
        INSTANCE.d(AFg1cSDK.OTHER, debugLogMessage, shouldRemoteDebug);
    }

    @Deprecated
    public static final void afInfoLog(String logMessage, boolean shouldRemoteDebug) {
        logMessage.getClass();
        INSTANCE.i(AFg1cSDK.OTHER, logMessage, shouldRemoteDebug);
    }

    @Deprecated
    public static final void afWarnLog(String warningLogMessage, boolean shouldRemoteDebug) {
        warningLogMessage.getClass();
        INSTANCE.w(AFg1cSDK.OTHER, warningLogMessage, shouldRemoteDebug);
    }

    @Deprecated
    public static final void afErrorLog(String message, Throwable ex, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
        message.getClass();
        ex.getClass();
        AFh1ySDK.e$default(INSTANCE, AFg1cSDK.OTHER, message, ex, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
    }

    @Deprecated
    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, true, false, 64, null);
    }

    @Deprecated
    public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, printThrowable, false, false, 104, null);
    }

    @Deprecated
    public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable, boolean shouldReportToExManager) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, printThrowable, shouldReportToExManager, false, 72, null);
    }
}
