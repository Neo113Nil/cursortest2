package com.yandex.plus.home.internal.di;

import defpackage.btf;
import defpackage.jyr;
import defpackage.tf6;

/* loaded from: classes5.dex */
public final class l {
    public final jyr A;
    public final jyr B;
    public final com.yandex.plus.metrica.utils.i a;
    public final u b;
    public final d c;
    public final e d;
    public final p e;
    public final com.yandex.passport.internal.core.accounts.h f;
    public final com.yandex.plus.domain.auth.impl.i g;
    public final tf6 h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public final jyr q;
    public final jyr r;
    public final jyr s;
    public final jyr t;
    public final jyr u;
    public final jyr v;
    public final jyr w;
    public final jyr x;
    public final jyr y;
    public final jyr z;

    public l(com.yandex.plus.metrica.utils.i iVar, u uVar, d dVar, e eVar, p pVar, com.yandex.passport.internal.core.accounts.h hVar, com.yandex.plus.domain.auth.impl.i iVar2, tf6 tf6Var) {
        this.a = iVar;
        this.b = uVar;
        this.c = dVar;
        this.d = eVar;
        this.e = pVar;
        this.f = hVar;
        this.g = iVar2;
        this.h = tf6Var;
        btf.b(new f(this, 0));
        this.i = btf.b(new f(this, 2));
        this.j = btf.b(new f(this, 4));
        int i = 5;
        this.k = btf.b(new f(this, i));
        this.l = btf.b(new com.yandex.plus.home.graphql.configuration.a(this, i));
        this.m = btf.b(new f(this, 6));
        this.n = btf.b(new f(this, 7));
        this.o = btf.b(new f(this, 8));
        this.p = btf.b(new f(this, 9));
        this.q = btf.b(new com.yandex.plus.home.graphql.configuration.a(6));
        this.r = btf.b(new f(this, 10));
        this.s = btf.b(new f(this, 16));
        this.t = btf.b(new f(this, 17));
        this.u = btf.b(new f(this, 18));
        this.v = btf.b(new f(this, 19));
        this.w = btf.b(new f(this, 20));
        this.x = btf.b(new com.yandex.plus.home.graphql.configuration.a(this, 7));
        this.y = btf.b(new com.yandex.plus.home.graphql.configuration.a(8));
        this.z = btf.b(new f(this, 21));
        this.A = btf.b(new f(this, 1));
        this.B = btf.b(new f(this, 3));
    }

    public final com.yandex.plus.experiments.impl.providers.h a() {
        return (com.yandex.plus.experiments.impl.providers.h) this.t.getValue();
    }

    public final com.yandex.plus.home.graphql.plusstate.f b() {
        return (com.yandex.plus.home.graphql.plusstate.f) this.v.getValue();
    }

    public final com.yandex.plus.core.openapi.g c() {
        return (com.yandex.plus.core.openapi.g) this.A.getValue();
    }
}
