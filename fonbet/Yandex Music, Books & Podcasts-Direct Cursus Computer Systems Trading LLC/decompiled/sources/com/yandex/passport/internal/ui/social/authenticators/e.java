package com.yandex.passport.internal.ui.social.authenticators;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.y1;
import com.yandex.passport.data.network.token.i;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.network.client.h;
import com.yandex.passport.internal.report.ac;
import com.yandex.passport.internal.report.bc;
import com.yandex.passport.internal.report.dc;
import com.yandex.passport.internal.report.ec;
import com.yandex.passport.internal.report.fc;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.reporters.a1;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.ui.social.m;
import com.yandex.passport.internal.ui.social.n;
import com.yandex.passport.internal.ui.social.p;
import com.yandex.passport.internal.ui.social.q;
import com.yandex.passport.internal.ui.social.s;
import com.yandex.passport.internal.ui.social.t;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.util.k;
import com.yandex.passport.legacy.lx.g;
import defpackage.b6e;
import defpackage.u13;
import defpackage.xdr;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends f {
    public final k s;
    public final h t;
    public final l u;
    public final com.yandex.passport.common.account.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar, k kVar, h hVar, a1 a1Var, l lVar, com.yandex.passport.internal.properties.l lVar2, a0 a0Var, Bundle bundle) {
        super(lVar2, a0Var, bundle, false, nVar, a1Var);
        kVar.getClass();
        hVar.getClass();
        a1Var.getClass();
        lVar.getClass();
        lVar2.getClass();
        a0Var.getClass();
        this.s = kVar;
        this.t = hVar;
        this.u = lVar;
        this.v = lVar.d;
    }

    @Override // com.yandex.passport.internal.ui.social.authenticators.f
    public final void G() {
        com.yandex.passport.internal.ui.base.l lVar;
        a1 a1Var = this.o;
        a1Var.getClass();
        a0 a0Var = this.l;
        a0Var.getClass();
        final int i = 0;
        final int i2 = 1;
        a1Var.n(ec.d, new ff(a1.u(a0Var), 7, false), new ve(a1Var.c, 25));
        n nVar = (n) this.n;
        if (Intrinsics.d(nVar, com.yandex.passport.internal.ui.social.l.b)) {
            lVar = new com.yandex.passport.internal.ui.base.l(new g(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.d
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.g
                public final Object b(Object obj) {
                    int i3 = i;
                    e eVar = this.b;
                    Context context = (Context) obj;
                    switch (i3) {
                        case 0:
                            int i4 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar2 = eVar.k;
                            com.yandex.passport.api.impl.b bVar = lVar2.d.a;
                            context.getClass();
                            y1 y1Var = lVar2.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var2 = com.yandex.passport.internal.ui.webview.webcases.a0.BIND_SOCIAL_WEB;
                            a0 a0Var3 = eVar.l;
                            com.yandex.passport.common.account.a aVar = eVar.v;
                            a0Var3.getClass();
                            aVar.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", a0Var3);
                            bundle.putString("master-token", aVar.e());
                            return i.e(bVar, context, y1Var, a0Var2, bundle);
                        default:
                            return ((m) eVar.n).a;
                    }
                }
            }, 109);
        } else if (Intrinsics.d(nVar, com.yandex.passport.internal.ui.social.l.a)) {
            lVar = new com.yandex.passport.internal.ui.base.l(new com.yandex.passport.internal.ui.l(6, this, com.yandex.passport.internal.util.b.b()), 110);
        } else {
            if (!(nVar instanceof m)) {
                b6e.s();
                return;
            }
            lVar = new com.yandex.passport.internal.ui.base.l(new g(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.d
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.g
                public final Object b(Object obj) {
                    int i3 = i2;
                    e eVar = this.b;
                    Context context = (Context) obj;
                    switch (i3) {
                        case 0:
                            int i4 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar2 = eVar.k;
                            com.yandex.passport.api.impl.b bVar = lVar2.d.a;
                            context.getClass();
                            y1 y1Var = lVar2.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var2 = com.yandex.passport.internal.ui.webview.webcases.a0.BIND_SOCIAL_WEB;
                            a0 a0Var3 = eVar.l;
                            com.yandex.passport.common.account.a aVar = eVar.v;
                            a0Var3.getClass();
                            aVar.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", a0Var3);
                            bundle.putString("master-token", aVar.e());
                            return i.e(bVar, context, y1Var, a0Var2, bundle);
                        default:
                            return ((m) eVar.n).a;
                    }
                }
            }, 108);
        }
        M(lVar);
    }

    public final void L() {
        a1 a1Var = this.o;
        a1Var.getClass();
        a0 a0Var = this.l;
        a0Var.getClass();
        a1Var.n(fc.d, new ff(a1.u(a0Var), 7, false), new ve(a1Var.c, 25));
        ((t) this.r.a.getValue()).getClass();
        q qVar = q.a;
        xdr xdrVar = this.q;
        xdrVar.getClass();
        xdrVar.m(null, qVar);
    }

    public final void M(com.yandex.passport.internal.ui.base.l lVar) {
        int i = lVar.b;
        a1 a1Var = this.o;
        a1Var.getClass();
        a0 a0Var = this.l;
        a0Var.getClass();
        a1Var.n(dc.d, new ff(a1.u(a0Var), 7, false), new ve(i, 19), new ve(a1Var.c, 25));
        ((t) this.r.a.getValue()).getClass();
        s sVar = new s(lVar);
        xdr xdrVar = this.q;
        xdrVar.getClass();
        xdrVar.m(null, sVar);
    }

    @Override // com.yandex.passport.internal.ui.social.authenticators.f
    public final void a(int i, int i2, Intent intent) {
        a1 a1Var = this.o;
        a1Var.getClass();
        a0 a0Var = this.l;
        a0Var.getClass();
        a1Var.n(ac.d, new ff(a1.u(a0Var), 7, false), new ve(i, 19), new ve(i2, 21), new ve(a1Var.c, 25));
        switch (i) {
            case 108:
                if (i2 == -1) {
                    if (intent != null) {
                        String stringExtra = intent.getStringExtra("social-token");
                        if (stringExtra != null) {
                            String stringExtra2 = intent.getStringExtra("application-id");
                            stringExtra2.getClass();
                            M(new com.yandex.passport.internal.ui.base.l(new u13(24, this, stringExtra, stringExtra2), 109));
                            break;
                        } else {
                            a1Var.w(a0Var, new RuntimeException("Social token is null"));
                            break;
                        }
                    } else {
                        a1Var.w(a0Var, new RuntimeException("Intent data is null"));
                        break;
                    }
                } else if (i2 == 100) {
                    K();
                    break;
                } else {
                    if ((intent != null ? intent.getSerializableExtra(Constants.KEY_EXCEPTION) : null) == null) {
                        L();
                        break;
                    } else {
                        Throwable th = (Throwable) intent.getSerializableExtra(Constants.KEY_EXCEPTION);
                        th.getClass();
                        a1Var.w(a0Var, th);
                        break;
                    }
                }
            case 109:
            case 110:
                if (i2 != -1) {
                    L();
                    break;
                } else {
                    l lVar = this.u;
                    com.yandex.passport.common.core.f fVar = lVar.b;
                    fVar.getClass();
                    a1Var.n(bc.d, new ff(a1.u(a0Var), 7, false), new com.yandex.passport.internal.report.c(String.valueOf(fVar.b), 3), new ve(a1Var.c, 25));
                    ((t) this.r.a.getValue()).getClass();
                    p pVar = new p(lVar);
                    xdr xdrVar = this.q;
                    xdrVar.getClass();
                    xdrVar.m(null, pVar);
                    break;
                }
        }
    }
}
