package com.yandex.passport.internal.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.n2;
import com.yandex.passport.api.q2;
import com.yandex.passport.api.x0;
import com.yandex.passport.api.y0;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.ui.AccountNotAuthorizedActivity;
import com.yandex.passport.internal.ui.AutoLoginActivity;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import defpackage.cxb;
import defpackage.e5b;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class y implements com.yandex.passport.api.i {
    public final a a;

    public y(Context context, a aVar) {
        context.getClass();
        this.a = aVar;
    }

    @Override // com.yandex.passport.api.i
    public final Intent a(Context context, com.yandex.passport.internal.properties.c cVar) {
        context.getClass();
        cVar.getClass();
        a aVar = this.a;
        aVar.q();
        try {
            int i = GlobalRouterActivity.i;
            y1 y1Var = cVar.a;
            com.yandex.passport.api.impl.b bVar = cVar.b;
            bVar.getClass();
            com.yandex.passport.api.impl.b b = com.yandex.passport.api.impl.b.b(bVar);
            b.getClass();
            Intent d = com.yandex.passport.internal.ui.router.b.d(context, com.yandex.passport.internal.ui.router.c0.AUTHORIZATION_BY_QR, cxb.K(new Pair("auth_by_qr_properties", new com.yandex.passport.internal.properties.c(y1Var, b, cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h, cVar.i))));
            d.putExtra("EXTERNAL_EXTRA", true);
            return d;
        } catch (RuntimeException e) {
            aVar.r(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.i
    public final Intent b(Context context, com.yandex.passport.internal.properties.h hVar) {
        a aVar;
        a aVar2;
        y1 y1Var;
        com.yandex.passport.internal.entities.k s;
        com.yandex.passport.internal.properties.h hVar2;
        com.yandex.passport.internal.properties.m0 m0Var;
        context.getClass();
        hVar.getClass();
        LinkedHashMap linkedHashMap = hVar.g;
        com.yandex.passport.internal.entities.p pVar = hVar.f;
        a aVar3 = this.a;
        aVar3.q();
        try {
            int i = GlobalRouterActivity.i;
            y1Var = hVar.a;
            com.yandex.passport.internal.properties.m0 m0Var2 = hVar.e;
            z1 z1Var = hVar.b;
            com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
            com.yandex.passport.api.impl.b bVar = z1Var.a;
            com.yandex.passport.api.h.b.getClass();
            jVar.a = com.yandex.passport.api.q.b(bVar);
            jVar.c = pVar;
            s = com.yandex.passport.internal.ui.a.s(jVar);
            m0Var = null;
            hVar2 = new com.yandex.passport.internal.properties.h(hVar.a, com.yandex.passport.internal.ui.a.D(z1Var), hVar.c, hVar.d, m0Var2 != null ? com.yandex.plus.core.network.api.utils.a.N(m0Var2) : null, pVar, linkedHashMap);
            if (m0Var2 != null) {
                try {
                    m0Var = com.yandex.plus.core.network.api.utils.a.N(m0Var2);
                } catch (RuntimeException e) {
                    e = e;
                    aVar2 = aVar3;
                    aVar2.r(e);
                    throw e;
                }
            }
            aVar = aVar3;
        } catch (RuntimeException e2) {
            e = e2;
            aVar = aVar3;
        }
        try {
            return com.yandex.passport.internal.ui.router.b.b(context, new com.yandex.passport.internal.properties.l(null, false, null, s, y1Var, null, null, false, false, null, null, false, null, null, null, hVar2, null, null, null, m0Var, false, null, linkedHashMap, false, null, false, null, 1064239079), "BindPhone", 16);
        } catch (RuntimeException e3) {
            e = e3;
            aVar2 = aVar;
            aVar2.r(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.i
    public final Intent c(Context context, com.yandex.passport.internal.properties.j0 j0Var) {
        context.getClass();
        j0Var.getClass();
        a aVar = this.a;
        aVar.q();
        try {
            int i = GlobalRouterActivity.i;
            y1 y1Var = j0Var.a;
            com.yandex.passport.api.impl.b bVar = j0Var.b;
            bVar.getClass();
            com.yandex.passport.api.impl.b b = com.yandex.passport.api.impl.b.b(bVar);
            b.getClass();
            return com.yandex.passport.internal.ui.router.b.d(context, com.yandex.passport.internal.ui.router.c0.SHOW_USER_MENU, cxb.K(new Pair("passport-show-user-menu-properties", new com.yandex.passport.internal.properties.j0(y1Var, b, com.yandex.plus.core.locale.b.z(j0Var.c), j0Var.d))));
        } catch (RuntimeException e) {
            aVar.r(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.i
    public final Intent d(Context context, x0 x0Var) {
        context.getClass();
        x0Var.getClass();
        a aVar = this.a;
        aVar.q();
        try {
            int i = GlobalRouterActivity.i;
            return com.yandex.passport.internal.ui.router.b.b(context, com.yandex.plus.pay.ui.core.b.t((com.yandex.passport.api.limited.a) x0Var), "Login", 16);
        } catch (RuntimeException e) {
            aVar.r(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.i
    public final Intent e(Context context, y0 y0Var) {
        context.getClass();
        y0Var.getClass();
        a aVar = this.a;
        aVar.q();
        try {
            int i = GlobalRouterActivity.i;
            return com.yandex.passport.internal.ui.router.b.d(context, com.yandex.passport.internal.ui.router.c0.LOGOUT, cxb.K(new Pair("passport-logout-properties", new com.yandex.passport.internal.properties.u(com.yandex.passport.internal.ui.a.D(y0Var.getUid()), y0Var.getTheme(), y0Var.e(), y0Var.f(), com.yandex.plus.core.locale.b.z(y0Var.g()), y0Var.d()))));
        } catch (RuntimeException e) {
            aVar.r(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.i
    public final Intent f(Context context) {
        context.getClass();
        throw null;
    }

    @Override // com.yandex.passport.api.i
    public final Intent g(Context context, z1 z1Var) {
        context.getClass();
        z1Var.getClass();
        a aVar = this.a;
        aVar.q();
        try {
            int i = GlobalRouterActivity.i;
            z1 D = com.yandex.passport.internal.ui.a.D(z1Var);
            com.yandex.passport.internal.properties.v vVar = new com.yandex.passport.internal.properties.v(new j2(), q2.a, n2.a, true);
            y1 y1Var = y1.d;
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return com.yandex.passport.internal.ui.router.b.d(context, com.yandex.passport.internal.ui.router.c0.DELETE_ACCOUNT, cxb.K(new Pair("passport-delete-account-properties", new com.yandex.passport.internal.properties.r(D, vVar, y1Var, e5bVar))));
        } catch (RuntimeException e) {
            aVar.r(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.i
    public final Intent h(Context context) {
        context.getClass();
        throw null;
    }

    @Override // com.yandex.passport.api.i
    public final Intent i(Context context, com.yandex.passport.internal.properties.e0 e0Var) {
        context.getClass();
        e0Var.getClass();
        a aVar = this.a;
        aVar.q();
        try {
            int i = GlobalRouterActivity.i;
            com.yandex.passport.internal.properties.e0 e0Var2 = new com.yandex.passport.internal.properties.e0(com.yandex.passport.internal.ui.a.s(e0Var.a), e0Var.b, com.yandex.passport.internal.ui.a.D(e0Var.c), e0Var.d);
            com.yandex.passport.internal.ui.router.c0 c0Var = com.yandex.passport.internal.ui.router.c0.SOCIAL_BIND;
            Bundle bundle = new Bundle();
            bundle.putParcelable("passport-bind-properties", e0Var2);
            return com.yandex.passport.internal.ui.router.b.d(context, c0Var, bundle);
        } catch (RuntimeException e) {
            aVar.r(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.i
    public final Intent j(Context context, Uri uri) {
        context.getClass();
        uri.getClass();
        a aVar = this.a;
        aVar.q();
        try {
            int i = GlobalRouterActivity.i;
            return com.yandex.passport.internal.ui.router.b.d(context, com.yandex.passport.internal.ui.router.c0.CONFIRM_QR_AUTHORIZATION, cxb.K(new Pair("URI", uri)));
        } catch (RuntimeException e) {
            aVar.r(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.i
    public final Intent k(Context context, com.yandex.passport.internal.properties.b bVar) {
        context.getClass();
        bVar.getClass();
        a aVar = this.a;
        aVar.q();
        try {
            Intent intent = new Intent(context, (Class<?>) AccountNotAuthorizedActivity.class);
            z1 D = com.yandex.passport.internal.ui.a.D(bVar.a);
            y1 y1Var = bVar.b;
            String str = bVar.c;
            com.yandex.passport.internal.properties.l lVar = bVar.d;
            lVar.getClass();
            intent.putExtras(cxb.K(new Pair("account-not-authorized-properties", new com.yandex.passport.internal.properties.b(D, y1Var, str, com.yandex.plus.pay.ui.core.b.t(lVar)))));
            return intent;
        } catch (RuntimeException e) {
            aVar.r(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.i
    public final Intent l(Context context, com.yandex.passport.api.g0 g0Var) {
        context.getClass();
        g0Var.getClass();
        a aVar = this.a;
        aVar.q();
        try {
            int i = GlobalRouterActivity.i;
            return com.yandex.passport.internal.ui.router.b.d(context, com.yandex.passport.internal.ui.router.c0.DELETE_ACCOUNT, cxb.K(new Pair("passport-delete-account-properties", new com.yandex.passport.internal.properties.r(com.yandex.passport.internal.ui.a.D(g0Var.getUid()), com.yandex.plus.core.locale.b.z(g0Var.getProgressProperties()), g0Var.getTheme(), g0Var.d()))));
        } catch (RuntimeException e) {
            aVar.r(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.i
    public final Intent m(Context context, com.yandex.passport.internal.properties.h0 h0Var) {
        context.getClass();
        h0Var.getClass();
        a aVar = this.a;
        aVar.q();
        try {
            int i = GlobalRouterActivity.i;
            y1 y1Var = h0Var.a;
            com.yandex.passport.api.impl.b b = com.yandex.passport.api.impl.b.b(h0Var.b);
            b.getClass();
            return com.yandex.passport.internal.ui.router.b.c(context, new com.yandex.passport.internal.properties.h0(y1Var, b, com.yandex.passport.internal.ui.a.D(h0Var.c), h0Var.d, h0Var.e, h0Var.f));
        } catch (RuntimeException e) {
            aVar.r(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.i
    public final Intent n(Context context, com.yandex.passport.internal.properties.d0 d0Var) {
        context.getClass();
        d0Var.getClass();
        a aVar = this.a;
        aVar.q();
        try {
            int i = GlobalRouterActivity.i;
            return com.yandex.passport.internal.ui.router.b.d(context, com.yandex.passport.internal.ui.router.c0.SOCIAL_APPLICATION_BIND, cxb.K(new Pair("passport-application-bind-properties", com.yandex.plus.pay.ui.core.b.H(d0Var))));
        } catch (RuntimeException e) {
            aVar.r(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.i
    public final Intent o(Context context, z1 z1Var, com.yandex.passport.internal.properties.g gVar) {
        context.getClass();
        z1Var.getClass();
        gVar.getClass();
        a aVar = this.a;
        aVar.q();
        try {
            z1 D = com.yandex.passport.internal.ui.a.D(z1Var);
            com.yandex.passport.internal.entities.k s = com.yandex.passport.internal.ui.a.s(gVar.e());
            y1 h = gVar.h();
            com.yandex.passport.api.x f = gVar.f();
            String message = gVar.getMessage();
            boolean g = gVar.g();
            com.yandex.passport.internal.credentials.f d = gVar.d();
            return p(context, D, new com.yandex.passport.internal.properties.g(s, h, f, message, g, d != null ? new com.yandex.passport.internal.credentials.f(d.a, d.b) : null));
        } catch (RuntimeException e) {
            aVar.r(e);
            throw e;
        }
    }

    public final Intent p(Context context, z1 z1Var, com.yandex.passport.internal.properties.g gVar) {
        a aVar = this.a;
        aVar.q();
        try {
            Intent intent = new Intent(context, (Class<?>) AutoLoginActivity.class);
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("passport-uid", z1Var);
            bundle.putAll(bundle2);
            bundle.putAll(cxb.K(new Pair("passport-auto-login-properties", gVar)));
            intent.putExtras(bundle);
            return intent;
        } catch (RuntimeException e) {
            aVar.r(e);
            throw e;
        }
    }
}
