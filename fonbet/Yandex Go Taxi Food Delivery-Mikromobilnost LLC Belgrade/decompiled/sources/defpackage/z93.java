package defpackage;

import com.yandex.go.overdraft.domain.f;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v1.c;
import com.yandex.go.trusted_contacts.ui.error.ErrorScreenAction;
import com.yandex.passport.internal.push.n0;
import com.yandex.passport.internal.report.la;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import flex.network.cache.impl.a;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.yandex.taxi.network.api.models.GoApiException;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes4.dex */
public final class z93 extends d7 implements mse {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z93(vc5 vc5Var) {
        super(lse.a);
        this.b = vc5Var;
    }

    @Override // defpackage.mse
    public final void handleException(fse fseVar, Throwable th) {
        StackTraceElement stackTraceElement;
        String str;
        Integer valueOf;
        String num;
        StackTraceElement stackTraceElement2;
        String num2;
        int i = this.a;
        String str2 = "No line info";
        tjr tjrVar = tjr.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                zjr zjrVar = ((a) obj).b;
                String type = ErrorTypes.ASYNC_CACHE_FAILED.getType();
                i3y a = xfz.a(new Pair("locator", "AsyncDiskMemoryCaching.save"), new Pair("cause", th), xfz.d(th.getMessage(), DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION));
                s7s0 s7s0Var = zjrVar.c.a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement.getFileName();
                    str = fileName != null ? fileName : "No file info";
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                    if (valueOf != null && (num = valueOf.toString()) != null) {
                        str2 = num;
                    }
                    tjrVar = new tjr(str, methodName, str2);
                }
                zjrVar.d(FlexLogLevel.WARNING, "Async cache save failed", xfz.c(a, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
                break;
            case 1:
                if (th instanceof Exception) {
                    EbsLogger.INSTANCE.error(th);
                    ((vc5) obj).f0(new hao((Exception) th));
                    break;
                }
                break;
            case 2:
                jst.e.j(th);
                ((f) obj).a.d();
                break;
            case 3:
                zjr zjrVar2 = ((flex.network.cache.action.a) obj).b;
                String type2 = ErrorTypes.INVALIDATE_CACHE_FAILED.getType();
                i3y a2 = xfz.a(new Pair("locator", "InvalidateCacheActionHandler"), new Pair("cause", th), xfz.d(th.getMessage(), DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION));
                s7s0 s7s0Var2 = zjrVar2.c.a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName2 = stackTraceElement2.getFileName();
                    str = fileName2 != null ? fileName2 : "No file info";
                    String methodName2 = stackTraceElement2.getMethodName();
                    int lineNumber2 = stackTraceElement2.getLineNumber();
                    valueOf = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
                    if (valueOf != null && (num2 = valueOf.toString()) != null) {
                        str2 = num2;
                    }
                    tjrVar = new tjr(str, methodName2, str2);
                }
                zjrVar2.d(FlexLogLevel.WARNING, "InvalidateCacheActionHandler delete failed", xfz.c(a2, xfz.a(new Pair("errorType", type2))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
                break;
            case 4:
                c.Mg((c) obj);
                break;
            case 5:
                sh11 sh11Var = (sh11) obj;
                hst hstVar = jst.e;
                String message = th != null ? th.getMessage() : null;
                xby.l(hstVar, "TRUSTED_CONTACTS_ERROR:TRUSTED_CONTACTS_COMMON_ERROR", null, th, message == null ? "" : message, 2);
                r0 r0Var = sh11Var.B;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool);
                avj0 avj0Var = (avj0) sh11Var.A;
                sh11Var.Kg(new wg11(avj0Var.h(kyh0.error_occurred), avj0Var.h(kyh0.unknown_error_description), avj0Var.h(kyh0.try_again), ErrorScreenAction.TRY_AGAIN));
                break;
            case 6:
                if (!(th instanceof GoApiException)) {
                    xby.l(jst.e, "UserConfig:NoApiError", null, th, "Failed user config request", 2);
                }
                ((sls) obj).invoke();
                break;
            default:
                n0 n0Var = (n0) obj;
                la laVar = la.w;
                String message2 = th.getMessage();
                n0Var.c(laVar, b.i(new Pair("throwable-message", message2 != null ? message2 : ""), new Pair("throwable", ljo.b(th))));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z93(n0 n0Var) {
        super(lse.a);
        this.b = n0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z93(flex.network.cache.action.a aVar) {
        super(lse.a);
        this.b = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z93(a aVar) {
        super(lse.a);
        this.b = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z93(sls slsVar) {
        super(lse.a);
        this.b = slsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z93(sh11 sh11Var) {
        super(lse.a);
        this.b = sh11Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z93(f fVar) {
        super(lse.a);
        this.b = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z93(c cVar) {
        super(lse.a);
        this.b = cVar;
    }
}
