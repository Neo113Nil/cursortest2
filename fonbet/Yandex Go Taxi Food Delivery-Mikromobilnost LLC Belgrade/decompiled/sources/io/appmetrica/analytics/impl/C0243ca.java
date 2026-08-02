package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0243ca {
    public final String a;
    public String b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final C0327f8 g;
    public final Hc h;
    public final Integer i;
    public final String j;
    public final Integer k;
    public final Integer l;
    public final String m;
    public final String n;
    public final X9 o;
    public final EnumC0821wb p;
    public final Ba q;
    public final Boolean r;
    public final Integer s;
    public final byte[] t;
    public final String u;
    public final long v;

    /* JADX WARN: Multi-variable type inference failed */
    public C0243ca(ContentValues contentValues) {
        C0212b8 model = new C0241c8(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.a = model.a().l();
        this.b = model.a().r();
        this.c = model.c();
        this.d = model.b();
        this.e = model.a().m();
        this.f = model.d();
        this.g = model.a().k();
        this.h = model.e();
        this.i = model.a().f();
        this.j = model.a().h();
        this.k = model.a().q();
        this.l = model.a().e();
        this.m = model.a().d();
        this.n = model.a().o();
        X9 g = model.a().g();
        this.o = g == null ? X9.a(null) : g;
        EnumC0821wb j = model.a().j();
        this.p = j == null ? EnumC0821wb.a(null) : j;
        this.q = model.a().p();
        this.r = model.a().c();
        this.s = model.a().n();
        this.t = model.a().i();
        String a = model.a().a();
        this.u = a == null ? "" : a;
        Long b = model.a().b();
        this.v = b != null ? b.longValue() : 0L;
    }
}
