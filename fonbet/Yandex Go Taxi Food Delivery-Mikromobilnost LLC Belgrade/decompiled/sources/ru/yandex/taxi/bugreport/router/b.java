package ru.yandex.taxi.bugreport.router;

import com.yandex.go.modals.progress.api.CircularProgressRouter$Payload;
import defpackage.dpb;
import defpackage.gf41;
import defpackage.h55;
import defpackage.hr6;
import defpackage.hwf;
import defpackage.i3y;
import defpackage.jj3;
import defpackage.jst;
import defpackage.kp50;
import defpackage.lu5;
import defpackage.ny61;
import defpackage.or6;
import defpackage.pr6;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.qzj0;
import defpackage.rk6;
import defpackage.svb;
import defpackage.tje;
import defpackage.tls;
import defpackage.tvb;
import defpackage.um3;
import defpackage.xby;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes5.dex */
public final class b extends h55 {
    public final jj3 D;
    public final ru.yandex.taxi.am.token.a E;
    public final gf41 F;
    public final o G;
    public final pr6 H;
    public final hwf I;
    public pzt0 J;
    public final i3y K;

    public b(jj3 jj3Var, ru.yandex.taxi.am.token.a aVar, gf41 gf41Var, o oVar, pr6 pr6Var, hwf hwfVar) {
        super(null);
        this.D = jj3Var;
        this.E = aVar;
        this.F = gf41Var;
        this.G = oVar;
        this.H = pr6Var;
        this.I = hwfVar;
        this.K = kotlin.a.a(new rk6(4, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(b bVar, String str, tvb tvbVar, ContinuationImpl continuationImpl) {
        BugReportRouterImpl$showWebContainer$1 bugReportRouterImpl$showWebContainer$1;
        int i;
        Object d;
        String str2;
        tvb tvbVar2;
        Throwable a;
        bVar.getClass();
        if (continuationImpl instanceof BugReportRouterImpl$showWebContainer$1) {
            bugReportRouterImpl$showWebContainer$1 = (BugReportRouterImpl$showWebContainer$1) continuationImpl;
            int i2 = bugReportRouterImpl$showWebContainer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bugReportRouterImpl$showWebContainer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bugReportRouterImpl$showWebContainer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bugReportRouterImpl$showWebContainer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.am.token.a aVar = bVar.E;
                    bugReportRouterImpl$showWebContainer$1.L$0 = str;
                    bugReportRouterImpl$showWebContainer$1.L$1 = tvbVar;
                    bugReportRouterImpl$showWebContainer$1.label = 1;
                    d = aVar.d(false, bugReportRouterImpl$showWebContainer$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                    tvbVar2 = tvbVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tvbVar2 = (tvb) bugReportRouterImpl$showWebContainer$1.L$1;
                    str2 = (String) bugReportRouterImpl$showWebContainer$1.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                a = Result.a(d);
                zy11 zy11Var = zy11.a;
                if (a == null) {
                    xby.l(jst.e, "BUG_REPORT:MISSING_OAUTH_TOKEN", null, a, "Failed to get oauth token to show bug report", 2);
                    bVar.r(new qu(9));
                    return zy11Var;
                }
                kotlin.b.b(d);
                String str3 = (String) d;
                CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
                aVar2.b = str2;
                aVar2.e = false;
                aVar2.c = str3;
                aVar2.b("Authorization", kp50.h(str3));
                aVar2.b("X-Oauth-Token", str3);
                UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar2.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                uiWebViewConfig.setHasTitleFromWeb(true);
                uiWebViewConfig.setShouldUseCached(false);
                uiWebViewConfig.setAnimateOnAppearing(false);
                ((svb) tvbVar2).T(new lu5(12, bVar, uiWebViewConfig));
                return zy11Var;
            }
        }
        bugReportRouterImpl$showWebContainer$1 = new BugReportRouterImpl$showWebContainer$1(bVar, continuationImpl);
        Object obj2 = bugReportRouterImpl$showWebContainer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bugReportRouterImpl$showWebContainer$1.label;
        if (i != 0) {
        }
        a = Result.a(d);
        zy11 zy11Var2 = zy11.a;
        if (a == null) {
        }
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        this.D.c(new um3(Events$Zalogin$LoginContext.DEEPLINK, new qzj0(null, new tls() { // from class: ru.yandex.taxi.bugreport.router.a
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                Result result = (Result) obj2;
                Object value = result.getValue();
                boolean z = value instanceof Result.Failure;
                int i = 9;
                b bVar = b.this;
                if (!z) {
                    or6 or6Var = (or6) bVar.H.b.b();
                    String str = or6Var.c;
                    if (!or6Var.b || str.length() == 0) {
                        bVar.r(new qu(i));
                    } else {
                        tvb tvbVar = (tvb) bVar.I.get();
                        bVar.D(tvbVar, new CircularProgressRouter$Payload(null, false, 7), new hr6(bVar, 0));
                        bVar.J = tje.N(bVar.o(), null, null, new BugReportRouterImpl$openBugReport$2(bVar, str, tvbVar, null), 3);
                    }
                }
                if (Result.a(result.getValue()) != null) {
                    bVar.r(new qu(i));
                }
                return zy11.a;
            }
        }), false, false, 28));
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        pzt0 pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.J = null;
        j(dpb.a);
    }
}
