package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0668pg {

    /* renamed from: a, reason: collision with root package name */
    public final Na f6745a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0538kg f6746b;

    /* renamed from: c, reason: collision with root package name */
    public final La f6747c;

    public C0668pg(Na na, InterfaceC0538kg interfaceC0538kg, La la) {
        this.f6745a = na;
        this.f6746b = interfaceC0538kg;
        this.f6747c = la;
    }

    public final void a(C0616ng c0616ng) {
        if (this.f6745a.a(c0616ng)) {
            this.f6746b.a(c0616ng);
            this.f6747c.a();
        }
    }

    public final InterfaceC0538kg b() {
        return this.f6746b;
    }

    public final La c() {
        return this.f6747c;
    }

    public final Na a() {
        return this.f6745a;
    }
}
