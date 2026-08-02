package ru.yandex.taxi;

import com.yandex.go.superapp.api.loading_tracker.ServiceLoadingEvent;
import defpackage.bp90;
import defpackage.c9w0;
import defpackage.cb60;
import defpackage.cne;
import defpackage.dvx;
import defpackage.ene;
import defpackage.evu0;
import defpackage.fne;
import defpackage.g8e;
import defpackage.g92;
import defpackage.gne;
import defpackage.go60;
import defpackage.h1p;
import defpackage.hst;
import defpackage.i891;
import defpackage.ibw0;
import defpackage.jdj;
import defpackage.jst;
import defpackage.lzu0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pne;
import defpackage.rvq0;
import defpackage.sjh;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.ua41;
import defpackage.uyj;
import defpackage.vbb;
import defpackage.vr;
import defpackage.w511;
import defpackage.x6w0;
import defpackage.xby;
import defpackage.xfo;
import defpackage.z8w0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.shortcuts.dto.response.RequiredAccount;

/* loaded from: classes5.dex */
public final class n {
    public final x6w0 a;
    public final tt2 b;
    public final jdj c;
    public final o d;
    public final ru.yandex.taxi.superapp.f e;
    public final vbb f;
    public final rvq0 g;
    public final bp90 h;
    public final vr i;

    public n(x6w0 x6w0Var, tt2 tt2Var, jdj jdjVar, o oVar, ru.yandex.taxi.superapp.f fVar, vbb vbbVar, rvq0 rvq0Var, bp90 bp90Var, vr vrVar) {
        this.a = x6w0Var;
        this.b = tt2Var;
        this.c = jdjVar;
        this.d = oVar;
        this.e = fVar;
        this.f = vbbVar;
        this.g = rvq0Var;
        this.h = bp90Var;
        this.i = vrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(n nVar, String str, boolean z, ContinuationImpl continuationImpl) {
        SuperappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1 superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1;
        int i;
        boolean z2;
        boolean z3;
        nVar.getClass();
        if (continuationImpl instanceof SuperappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1) {
            superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1 = (SuperappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1) continuationImpl;
            int i2 = superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                SuperappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1 superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$12 = superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1;
                Object obj = superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x6w0 x6w0Var = nVar.a;
                    if (!x6w0Var.s) {
                        return Boolean.FALSE;
                    }
                    ru.yandex.taxi.superapp.f fVar = nVar.e;
                    boolean z4 = x6w0Var.t;
                    c9w0 c9w0Var = new c9w0(nVar);
                    superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$12.L$0 = null;
                    superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$12.Z$0 = z;
                    superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$12.label = 1;
                    obj = fVar.b(str, z, z4, c9w0Var, superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                gne gneVar = (gne) obj;
                z2 = gneVar instanceof ene;
                if (z2) {
                    xby.l(jst.e, "EATSKIT:AUTH:COOKIES", null, null, "Unable to inject cookies; fallback switch to redirect", 6);
                }
                vbb vbbVar = nVar.f;
                ibw0 ibw0Var = (ibw0) vbbVar.a;
                h1p h1pVar = (h1p) vbbVar.b;
                z3 = gneVar instanceof fne;
                if (!z3) {
                    String value = h1pVar.getValue();
                    ibw0Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put(Constants.KEY_SERVICE, value);
                    ibw0Var.a.a("SuperappMain.CookieEnjector.InjectingCompleted", hashMap, 2, new HashMap());
                } else {
                    if (!z2) {
                        w511.b();
                        return null;
                    }
                    int i3 = cne.b[((ene) gneVar).a.ordinal()];
                    if (i3 != 1 && i3 != 2) {
                        if (i3 != 3) {
                            String value2 = h1pVar.getValue();
                            ibw0Var.getClass();
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(Constants.KEY_SERVICE, value2);
                            ibw0Var.a.a("SuperappMain.CookieEnjector.InjectingFailed", hashMap2, 2, new HashMap());
                        } else {
                            String value3 = h1pVar.getValue();
                            ibw0Var.getClass();
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put(Constants.KEY_SERVICE, value3);
                            ibw0Var.a.a("SuperappMain.CookieEnjector.NoMoreAttemptsLeft", hashMap3, 2, new HashMap());
                        }
                    }
                }
                return Boolean.valueOf(z3);
            }
        }
        superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1 = new SuperappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1(nVar, continuationImpl);
        SuperappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1 superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$122 = superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1;
        Object obj2 = superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappAuthorizerImpl$injectAuthorizationCookieIfNeeded$122.label;
        if (i != 0) {
        }
        gne gneVar2 = (gne) obj2;
        z2 = gneVar2 instanceof ene;
        if (z2) {
        }
        vbb vbbVar2 = nVar.f;
        ibw0 ibw0Var2 = (ibw0) vbbVar2.a;
        h1p h1pVar2 = (h1p) vbbVar2.b;
        z3 = gneVar2 instanceof fne;
        if (!z3) {
        }
        return Boolean.valueOf(z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(n nVar, String str, ContinuationImpl continuationImpl) {
        SuperappAuthorizerImpl$wrapToAuthorizationUrl$1 superappAuthorizerImpl$wrapToAuthorizationUrl$1;
        int i;
        ua41 ua41Var;
        nVar.getClass();
        if (continuationImpl instanceof SuperappAuthorizerImpl$wrapToAuthorizationUrl$1) {
            superappAuthorizerImpl$wrapToAuthorizationUrl$1 = (SuperappAuthorizerImpl$wrapToAuthorizationUrl$1) continuationImpl;
            int i2 = superappAuthorizerImpl$wrapToAuthorizationUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappAuthorizerImpl$wrapToAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappAuthorizerImpl$wrapToAuthorizationUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappAuthorizerImpl$wrapToAuthorizationUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = nVar.d;
                    AuthType authType = AuthType.COOKIES;
                    superappAuthorizerImpl$wrapToAuthorizationUrl$1.L$0 = null;
                    superappAuthorizerImpl$wrapToAuthorizationUrl$1.label = 1;
                    obj = oVar.b(str, authType, superappAuthorizerImpl$wrapToAuthorizationUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ua41Var = (ua41) obj;
                if (!(ua41Var instanceof pne)) {
                    return ((pne) ua41Var).a;
                }
                xfo.g(ua41Var);
                return null;
            }
        }
        superappAuthorizerImpl$wrapToAuthorizationUrl$1 = new SuperappAuthorizerImpl$wrapToAuthorizationUrl$1(nVar, continuationImpl);
        Object obj2 = superappAuthorizerImpl$wrapToAuthorizationUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappAuthorizerImpl$wrapToAuthorizationUrl$1.label;
        if (i != 0) {
        }
        ua41Var = (ua41) obj2;
        if (!(ua41Var instanceof pne)) {
        }
    }

    public static Map e(dvx dvxVar) {
        String str = dvxVar.a;
        if (evu0.J(str)) {
            xby.l(jst.e, "SUPERAPP_TEAM:EATS_COOKIE:USER_ID", null, null, "Empty user id provides to eatskit", 6);
        }
        return g8e.z("X-YaTaxi-UserId", str);
    }

    public final tpr c(dvx dvxVar, boolean z, tls tlsVar) {
        bp90 bp90Var = this.h;
        bp90Var.a = false;
        boolean a = dvxVar.a();
        String str = dvxVar.a;
        x6w0 x6w0Var = this.a;
        if (!a && x6w0Var.u != RequiredAccount.NOT_REQUIRED) {
            return d(tlsVar, dvxVar);
        }
        this.g.a(ServiceLoadingEvent.AUTH_START);
        int i = z8w0.a[x6w0Var.r.ordinal()];
        tt2 tt2Var = this.b;
        if (i == 1) {
            lzu0 lzu0Var = new lzu0(9, this, tlsVar);
            String str2 = dvxVar.e;
            hst hstVar = jst.e;
            boolean z2 = str2 == null || str2.length() == 0;
            StringBuilder sb = new StringBuilder("EatsKitDelegates.Main provide OAuth data: hasToken=");
            sb.append(!z2);
            sb.append(", userId=");
            sb.append(str);
            hstVar.n(sb.toString());
            k kVar = new k(new g92(2, new go60(str2, str)), lzu0Var);
            tt2Var.getClass();
            sjh sjhVar = uyj.a;
            return kotlinx.coroutines.flow.e.F(kVar, o400.a);
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        bp90Var.a = i891.e(this.i.a) != 0;
        jst.e.n("EatsKitDelegates.Main provide session cookies: userId=" + str);
        if (!dvxVar.a()) {
            return d(tlsVar, dvxVar);
        }
        kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.g(new SuperappAuthorizerImpl$authorizeWithCookies$1(tlsVar, null)), new SuperappAuthorizerImpl$authorizeWithCookies$2(this, z, dvxVar, null));
        tt2Var.getClass();
        sjh sjhVar2 = uyj.a;
        return kotlinx.coroutines.flow.e.F(I, o400.a);
    }

    public final tpr d(tls tlsVar, dvx dvxVar) {
        m mVar = new m(new g92(2, new cb60(e(dvxVar))), tlsVar);
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(mVar, o400.a);
    }
}
