package com.google.android.gms.internal.ads;

import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Og, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2707Og extends L3.o {

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC4061vh f26628v;

    /* renamed from: w, reason: collision with root package name */
    public final AbstractC2839Wg f26629w;

    /* renamed from: x, reason: collision with root package name */
    public final String f26630x;

    /* renamed from: y, reason: collision with root package name */
    public final String[] f26631y;

    public C2707Og(InterfaceC4061vh interfaceC4061vh, AbstractC2839Wg abstractC2839Wg, String str, String[] strArr) {
        super(3);
        this.f26628v = interfaceC4061vh;
        this.f26629w = abstractC2839Wg;
        this.f26630x = str;
        this.f26631y = strArr;
        C4835j.f39730C.f39731A.f26840n.add(this);
    }

    @Override // L3.o
    public final void k() {
        try {
            this.f26629w.d(this.f26630x, this.f26631y);
        } finally {
            u2.D.f41234l.post(new RunnableC3111e(this));
        }
    }

    @Override // L3.o
    public final N3.a l() {
        return (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31999D2)).booleanValue() && (this.f26629w instanceof C2986bh)) ? AbstractC3413jg.f31273f.b(new CallableC3549m7(2, this)) : super.l();
    }
}
