package io.appmetrica.analytics.impl;

import a.AbstractC0083a;
import h1.C0237g;
import h1.InterfaceC0233c;
import i1.AbstractC0252i;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.cc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328cc {

    /* renamed from: a, reason: collision with root package name */
    public final Qg f5736a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0712r9 f5737b;

    /* renamed from: c, reason: collision with root package name */
    public final C0630o4 f5738c;

    /* renamed from: d, reason: collision with root package name */
    public final We f5739d;

    /* renamed from: e, reason: collision with root package name */
    public final N4 f5740e;

    /* renamed from: f, reason: collision with root package name */
    public final C0819vc f5741f = new C0819vc();

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0233c f5742g = R1.d.y(new C0302bc(this));

    public C0328cc(L6 l6, Qg qg, InterfaceC0712r9 interfaceC0712r9, C0630o4 c0630o4, We we) {
        this.f5736a = qg;
        this.f5737b = interfaceC0712r9;
        this.f5738c = c0630o4;
        this.f5739d = we;
        this.f5740e = new N4(l6, qg);
    }

    public final List<F8> a() {
        return this.f5740e.a();
    }

    public final List<F8> b() {
        return AbstractC0252i.N(AbstractC0083a.m(this.f5740e.f4797c), AbstractC0083a.m((F8) ((C0237g) this.f5742g).a()));
    }
}
