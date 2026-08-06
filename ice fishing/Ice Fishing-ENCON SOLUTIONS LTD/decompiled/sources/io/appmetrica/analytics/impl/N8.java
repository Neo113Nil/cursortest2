package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* loaded from: classes.dex */
public final class N8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4802a;

    /* renamed from: b, reason: collision with root package name */
    public String f4803b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f4804c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f4805d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f4806e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f4807f;

    /* renamed from: g, reason: collision with root package name */
    public final C0478i7 f4808g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC0301bb f4809h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f4810i;

    /* renamed from: j, reason: collision with root package name */
    public final String f4811j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f4812k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f4813l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4814m;

    /* renamed from: n, reason: collision with root package name */
    public final String f4815n;

    /* renamed from: o, reason: collision with root package name */
    public final I8 f4816o;

    /* renamed from: p, reason: collision with root package name */
    public final EnumC0352da f4817p;

    /* renamed from: q, reason: collision with root package name */
    public final EnumC0583m9 f4818q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f4819r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f4820s;
    public final byte[] t;

    /* JADX WARN: Multi-variable type inference failed */
    public N8(ContentValues contentValues) {
        C0374e7 model = new C0400f7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f4802a = model.a().j();
        this.f4803b = model.a().p();
        this.f4804c = model.c();
        this.f4805d = model.b();
        this.f4806e = model.a().k();
        this.f4807f = model.d();
        this.f4808g = model.a().i();
        this.f4809h = model.e();
        this.f4810i = model.a().d();
        this.f4811j = model.a().f();
        this.f4812k = model.a().o();
        this.f4813l = model.a().c();
        this.f4814m = model.a().b();
        this.f4815n = model.a().m();
        I8 e2 = model.a().e();
        this.f4816o = e2 == null ? I8.a(null) : e2;
        EnumC0352da h2 = model.a().h();
        this.f4817p = h2 == null ? EnumC0352da.a(null) : h2;
        this.f4818q = model.a().n();
        this.f4819r = model.a().a();
        this.f4820s = model.a().l();
        this.t = model.a().g();
    }
}
