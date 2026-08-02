package com.yandex.passport.internal.ui.authsdk;

import android.os.Bundle;
import com.connectsdk.service.airplay.PListParser;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.methods.z5;
import com.yandex.passport.internal.usecase.l2;
import defpackage.tot;
import defpackage.xy0;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class k extends com.yandex.passport.internal.ui.base.h {
    public final com.yandex.passport.internal.ui.util.k q;
    public final com.yandex.passport.internal.ui.util.q r;
    public final com.yandex.passport.internal.core.accounts.e s;
    public final com.yandex.passport.internal.core.accounts.i t;
    public final com.yandex.passport.internal.network.client.h u;
    public p v;
    public final o0 w;
    public final com.yandex.passport.internal.ui.e x;
    public final l y;
    public final l2 z;

    public k(o0 o0Var, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.core.accounts.i iVar, com.yandex.passport.internal.network.client.h hVar, l lVar, l2 l2Var, Bundle bundle) {
        j jVar = new j(0, null);
        com.yandex.passport.internal.ui.util.k kVar = new com.yandex.passport.internal.ui.util.k();
        kVar.l(jVar);
        this.q = kVar;
        this.r = new com.yandex.passport.internal.ui.util.q();
        this.x = new com.yandex.passport.internal.ui.e();
        this.w = o0Var;
        this.s = eVar;
        this.t = iVar;
        this.u = hVar;
        this.y = lVar;
        this.z = l2Var;
        if (bundle == null) {
            z1 z1Var = lVar.f;
            this.v = new s(z1Var != null ? com.yandex.plus.pay.ui.core.b.L(z1Var) : null);
            o0Var.getClass();
            xy0 xy0Var = new xy0(0);
            xy0Var.put("subtype", LegacyAccountType.STRING_LOGIN);
            xy0Var.put("fromLoginSDK", PListParser.TAG_TRUE);
            xy0Var.put("reporter", lVar.a);
            xy0Var.put("caller_app_id", lVar.g);
            xy0Var.put("caller_fingerprint", lVar.h);
            o0Var.a.b(com.yandex.passport.internal.analytics.g.f, xy0Var);
        } else {
            p pVar = (p) bundle.getParcelable("state");
            pVar.getClass();
            this.v = pVar;
        }
        O();
    }

    @Override // com.yandex.passport.internal.ui.base.h
    public final void J(Bundle bundle) {
        bundle.getClass();
        bundle.putParcelable("state", this.v);
    }

    public final com.yandex.passport.internal.network.client.g L() {
        return this.u.a(com.yandex.plus.core.network.api.utils.a.L(this.y.d.d.a));
    }

    public final void M() {
        p pVar = this.v;
        if (pVar instanceof a0) {
            a0 a0Var = (a0) pVar;
            this.v = new u(a0Var.a, a0Var.b);
            O();
        }
        String str = this.y.a;
        o0 o0Var = this.w;
        o0Var.getClass();
        str.getClass();
        xy0 xy0Var = new xy0(0);
        xy0Var.put("reporter", str);
        o0Var.a.b(com.yandex.passport.internal.analytics.q.c, xy0Var);
    }

    public final void N(Exception exc, com.yandex.passport.internal.l lVar) {
        com.yandex.passport.internal.ui.f a = this.x.a(exc);
        this.k.m(a);
        this.q.m(new i(a, lVar, 1));
        o0 o0Var = this.w;
        o0Var.getClass();
        o0Var.a.d(com.yandex.passport.internal.analytics.q.f, exc);
    }

    public final void O() {
        com.yandex.passport.legacy.lx.j d = z5.d(new androidx.core.app.a(5, this));
        HashMap hashMap = (HashMap) this.n.a;
        com.yandex.passport.legacy.lx.j jVar = (com.yandex.passport.legacy.lx.j) hashMap.get(1);
        if (jVar != null) {
            jVar.a();
        }
        hashMap.put(1, d);
    }

    public final void P() {
        this.r.m(new com.yandex.passport.internal.ui.base.l(new tot(18, this.y.d), 400));
        p pVar = this.v;
        if (pVar instanceof a0) {
            this.v = new b0(((a0) pVar).b.b, false);
        }
    }
}
