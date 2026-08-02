package ru.yandex.taxi.am;

import android.app.Application;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.WebAmProperties;
import defpackage.a60;
import defpackage.b64;
import defpackage.cey;
import defpackage.ckf0;
import defpackage.cl7;
import defpackage.cne0;
import defpackage.dvw;
import defpackage.ep90;
import defpackage.fhz;
import defpackage.hst;
import defpackage.im51;
import defpackage.j18;
import defpackage.jst;
import defpackage.nk3;
import defpackage.no90;
import defpackage.ny61;
import defpackage.qzj0;
import defpackage.r660;
import defpackage.tj;
import defpackage.tse;
import defpackage.uj;
import defpackage.um3;
import defpackage.vj;
import defpackage.wj;
import defpackage.y50;
import defpackage.yce;
import defpackage.z50;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes9.dex */
public final class e {
    public final ckf0 a;
    public final y50 b;
    public final g c;
    public final ru.yandex.taxi.am.internal.b d;
    public final no90 e;
    public final ru.yandex.taxi.am.internal.c f;
    public final fhz g;
    public final im51 h;
    public final tse i;
    public final ep90 j;
    public final r660 k;
    public um3 l;

    public e(ckf0 ckf0Var, y50 y50Var, g gVar, ru.yandex.taxi.am.internal.b bVar, no90 no90Var, ru.yandex.taxi.am.internal.c cVar, fhz fhzVar, im51 im51Var, tse tseVar, ep90 ep90Var, r660 r660Var) {
        this.a = ckf0Var;
        this.b = y50Var;
        this.c = gVar;
        this.d = bVar;
        this.e = no90Var;
        this.f = cVar;
        this.g = fhzVar;
        this.h = im51Var;
        this.i = tseVar;
        this.j = ep90Var;
        this.k = r660Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(e eVar, nk3 nk3Var, Events$Zalogin$LoginContext events$Zalogin$LoginContext) {
        eVar.getClass();
        eVar.l = new um3(events$Zalogin$LoginContext, nk3Var, false, false, 28);
        ckf0 ckf0Var = eVar.a;
        eVar.h.getClass();
        ckf0Var.a();
        y50 y50Var = eVar.b;
        no90 no90Var = eVar.e;
        com.yandex.passport.internal.autologin.ui.h b = no90Var.f.b();
        Application application = no90Var.a;
        LoginProperties.a aVar = new LoginProperties.a();
        aVar.c();
        aVar.e(no90Var.e.a(new yce(false, 17)));
        aVar.h(no90Var.d.a());
        aVar.k(no90Var.h);
        no90Var.c.getClass();
        WebAmProperties.a aVar2 = new WebAmProperties.a();
        aVar2.b();
        aVar2.d();
        aVar2.e();
        aVar2.c();
        aVar.l(aVar2.a());
        aVar.j(com.yandex.passport.api.r.a());
        LoginProperties.Companion.getClass();
        Intent i = b.b.i(application, com.yandex.passport.internal.properties.i.b(aVar));
        a60 a60Var = (a60) y50Var;
        a60Var.getClass();
        hst hstVar = jst.e;
        new Throwable();
        hstVar.getClass();
        cey.c(a60Var.a.getLifecycle(), Lifecycle.State.RESUMED, new z50((Object) a60Var, (Object) i, HProv.PP_INFO, (int) (0 == true ? 1 : 0)));
        eVar.g.k(events$Zalogin$LoginContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        AccountAuthorizationHandler$checkNeedReAuth$1 accountAuthorizationHandler$checkNeedReAuth$1;
        int i;
        if (continuation instanceof AccountAuthorizationHandler$checkNeedReAuth$1) {
            accountAuthorizationHandler$checkNeedReAuth$1 = (AccountAuthorizationHandler$checkNeedReAuth$1) continuation;
            int i2 = accountAuthorizationHandler$checkNeedReAuth$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountAuthorizationHandler$checkNeedReAuth$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountAuthorizationHandler$checkNeedReAuth$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountAuthorizationHandler$checkNeedReAuth$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    return zy11Var;
                }
                kotlin.b.b(obj);
                g gVar = this.c;
                k kVar = gVar.a;
                boolean booleanValue = ((Boolean) kVar.A.getValue(kVar, k.S[2])).booleanValue();
                if (gVar.f() && booleanValue) {
                    ((cne0) kVar.b).w("recently_reset");
                    booleanValue = false;
                }
                if (booleanValue) {
                    ((cne0) gVar.a.b).w("recently_reset");
                    um3 um3Var = this.l;
                    um3 a = um3Var != null ? um3.a(um3Var, Events$Zalogin$LoginContext.REAUTH, null, 30) : new um3(Events$Zalogin$LoginContext.REAUTH, null, false, false, 30);
                    accountAuthorizationHandler$checkNeedReAuth$1.label = 1;
                    if (d(a, accountAuthorizationHandler$checkNeedReAuth$1) == obj2) {
                        return obj2;
                    }
                }
                return zy11Var;
            }
        }
        accountAuthorizationHandler$checkNeedReAuth$1 = new AccountAuthorizationHandler$checkNeedReAuth$1(this, continuation);
        Object obj3 = accountAuthorizationHandler$checkNeedReAuth$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountAuthorizationHandler$checkNeedReAuth$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    public final void b() {
        nk3 nk3Var;
        ckf0 ckf0Var = this.a;
        SimpleSpinnerModalView simpleSpinnerModalView = ckf0Var.b;
        if (simpleSpinnerModalView != null) {
            simpleSpinnerModalView.dismiss();
            ckf0Var.b = null;
        }
        ((cne0) this.c.a.b).w("recently_reset");
        um3 um3Var = this.l;
        this.g.i(um3Var != null ? um3Var.a : null, "Login activity cancelled");
        AuthCancellationException authCancellationException = new AuthCancellationException();
        um3 um3Var2 = this.l;
        if (um3Var2 == null || (nk3Var = um3Var2.b) == null) {
            return;
        }
        nk3Var.b(authCancellationException);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Events$Zalogin$LoginContext events$Zalogin$LoginContext, boolean z, ContinuationImpl continuationImpl) {
        AccountAuthorizationHandler$startLogin$1 accountAuthorizationHandler$startLogin$1;
        int i;
        if (continuationImpl instanceof AccountAuthorizationHandler$startLogin$1) {
            accountAuthorizationHandler$startLogin$1 = (AccountAuthorizationHandler$startLogin$1) continuationImpl;
            int i2 = accountAuthorizationHandler$startLogin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountAuthorizationHandler$startLogin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountAuthorizationHandler$startLogin$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountAuthorizationHandler$startLogin$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                kotlin.b.b(obj);
                um3 um3Var = new um3(events$Zalogin$LoginContext, null, false, z, 22);
                accountAuthorizationHandler$startLogin$1.L$0 = null;
                accountAuthorizationHandler$startLogin$1.Z$0 = z;
                accountAuthorizationHandler$startLogin$1.label = 1;
                Object d = d(um3Var, accountAuthorizationHandler$startLogin$1);
                return d == obj2 ? obj2 : d;
            }
        }
        accountAuthorizationHandler$startLogin$1 = new AccountAuthorizationHandler$startLogin$1(this, continuationImpl);
        Object obj3 = accountAuthorizationHandler$startLogin$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountAuthorizationHandler$startLogin$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e3, code lost:
    
        if (r12 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r12 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, uj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(um3 um3Var, ContinuationImpl continuationImpl) {
        AccountAuthorizationHandler$startLogin$2 accountAuthorizationHandler$startLogin$2;
        int i;
        cl7 cl7Var;
        if (continuationImpl instanceof AccountAuthorizationHandler$startLogin$2) {
            accountAuthorizationHandler$startLogin$2 = (AccountAuthorizationHandler$startLogin$2) continuationImpl;
            int i2 = accountAuthorizationHandler$startLogin$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountAuthorizationHandler$startLogin$2.label = i2 - Integer.MIN_VALUE;
                Object obj = accountAuthorizationHandler$startLogin$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountAuthorizationHandler$startLogin$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.h.getClass();
                    this.a.a();
                    boolean z = um3Var.d;
                    accountAuthorizationHandler$startLogin$2.L$0 = um3Var;
                    accountAuthorizationHandler$startLogin$2.label = 1;
                    obj = this.f.a(z, accountAuthorizationHandler$startLogin$2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    um3Var = (um3) accountAuthorizationHandler$startLogin$2.L$0;
                    kotlin.b.b(obj);
                }
                Intent intent = (Intent) obj;
                accountAuthorizationHandler$startLogin$2.L$0 = um3Var;
                accountAuthorizationHandler$startLogin$2.L$1 = intent;
                accountAuthorizationHandler$startLogin$2.label = 2;
                j18 j18Var = new j18(1, dvw.b(accountAuthorizationHandler$startLogin$2));
                Ref$ObjectRef y = b64.y(j18Var);
                int i3 = 0;
                vj vjVar = new vj(0, y);
                cl7Var = new cl7(j18Var, vjVar);
                this.l = um3.a(um3Var, null, new qzj0(new AccountAuthorizationHandler$startLogin$3$2(um3Var.b), new tj(i3, um3Var, new AccountAuthorizationHandler$startLogingIAlus$$inlined$suspendCallbackApi$2(cl7Var))), 29);
                a60 a60Var = (a60) this.b;
                a60Var.getClass();
                hst hstVar = jst.e;
                new Throwable();
                hstVar.getClass();
                cey.c(a60Var.a.getLifecycle(), Lifecycle.State.RESUMED, new z50(a60Var, intent, HProv.PP_INFO, i3));
                this.g.k(um3Var.a);
                y.element = uj.b;
                if (cl7Var.c()) {
                    j18Var.w(new wj(cl7Var, 0));
                } else {
                    vjVar.invoke();
                }
                obj = j18Var.s();
            }
        }
        accountAuthorizationHandler$startLogin$2 = new AccountAuthorizationHandler$startLogin$2(this, continuationImpl);
        Object obj2 = accountAuthorizationHandler$startLogin$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountAuthorizationHandler$startLogin$2.label;
        if (i != 0) {
        }
        Intent intent2 = (Intent) obj2;
        accountAuthorizationHandler$startLogin$2.L$0 = um3Var;
        accountAuthorizationHandler$startLogin$2.L$1 = intent2;
        accountAuthorizationHandler$startLogin$2.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(accountAuthorizationHandler$startLogin$2));
        Ref$ObjectRef y2 = b64.y(j18Var2);
        int i32 = 0;
        vj vjVar2 = new vj(0, y2);
        cl7Var = new cl7(j18Var2, vjVar2);
        this.l = um3.a(um3Var, null, new qzj0(new AccountAuthorizationHandler$startLogin$3$2(um3Var.b), new tj(i32, um3Var, new AccountAuthorizationHandler$startLogingIAlus$$inlined$suspendCallbackApi$2(cl7Var))), 29);
        a60 a60Var2 = (a60) this.b;
        a60Var2.getClass();
        hst hstVar2 = jst.e;
        new Throwable();
        hstVar2.getClass();
        cey.c(a60Var2.a.getLifecycle(), Lifecycle.State.RESUMED, new z50(a60Var2, intent2, HProv.PP_INFO, i32));
        this.g.k(um3Var.a);
        y2.element = uj.b;
        if (cl7Var.c()) {
        }
        obj2 = j18Var2.s();
    }

    public final void f(um3 um3Var) {
        this.l = um3Var;
        this.h.getClass();
        this.a.a();
        Intent b = this.e.b(null);
        a60 a60Var = (a60) this.b;
        a60Var.getClass();
        hst hstVar = jst.e;
        new Throwable();
        hstVar.getClass();
        cey.c(a60Var.a.getLifecycle(), Lifecycle.State.RESUMED, new z50(a60Var, b, HProv.PP_INFO, 0));
        this.g.k(um3Var.a);
    }
}
