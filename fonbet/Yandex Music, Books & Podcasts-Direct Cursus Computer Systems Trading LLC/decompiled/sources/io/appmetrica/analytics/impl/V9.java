package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* loaded from: classes5.dex */
public final class V9 {
    public final String a;
    public String b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final C0138b8 g;
    public final EnumC0603rc h;
    public final Integer i;
    public final String j;
    public final Integer k;
    public final Integer l;
    public final String m;
    public final String n;
    public final Q9 o;
    public final EnumC0458mb p;
    public final EnumC0688ua q;
    public final Boolean r;
    public final Integer s;
    public final byte[] t;

    /* JADX WARN: Multi-variable type inference failed */
    public V9(ContentValues contentValues) {
        X7 model = new Y7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.a = model.a().j();
        this.b = model.a().p();
        this.c = model.c();
        this.d = model.b();
        this.e = model.a().k();
        this.f = model.d();
        this.g = model.a().i();
        this.h = model.e();
        this.i = model.a().d();
        this.j = model.a().f();
        this.k = model.a().o();
        this.l = model.a().c();
        this.m = model.a().b();
        this.n = model.a().m();
        Q9 e = model.a().e();
        this.o = e == null ? Q9.a(null) : e;
        EnumC0458mb h = model.a().h();
        this.p = h == null ? EnumC0458mb.a(null) : h;
        this.q = model.a().n();
        this.r = model.a().a();
        this.s = model.a().l();
        this.t = model.a().g();
    }
}
