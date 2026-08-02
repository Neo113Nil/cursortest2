package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.vo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4091vo implements InterfaceC3875ro {

    /* renamed from: a, reason: collision with root package name */
    public final long f35510a;

    /* renamed from: b, reason: collision with root package name */
    public final Gr f35511b;

    public C4091vo(long j6, Context context, C3680o7 c3680o7, C3332hi c3332hi, String str) {
        this.f35510a = j6;
        C3332hi c3332hi2 = c3332hi.f31635b;
        s2.f1 f1Var = new s2.f1();
        str.getClass();
        Gr gr = (Gr) ((C3266gN) new C3680o7(c3332hi2, context, str, f1Var).f33649u).f();
        this.f35511b = gr;
        gr.H1(new BinderC4037uo(this, c3680o7));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3875ro
    public final void a(s2.c1 c1Var) {
        this.f35511b.D3(c1Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3875ro
    public final void f() {
        this.f35511b.x0(new Y2.b(null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3875ro
    public final void i() {
        this.f35511b.A();
    }
}
