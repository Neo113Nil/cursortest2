package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.uo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4014uo implements InterfaceC3799qo {

    /* renamed from: a, reason: collision with root package name */
    public final long f34589a;

    /* renamed from: b, reason: collision with root package name */
    public final Gr f34590b;

    public C4014uo(long j6, Context context, C3657o7 c3657o7, C3309hi c3309hi, String str) {
        this.f34589a = j6;
        C3309hi c3309hi2 = c3309hi.f30874b;
        q2.f1 f1Var = new q2.f1();
        str.getClass();
        Gr gr = (Gr) ((C3243gN) new C3657o7(c3309hi2, context, str, f1Var).f32862u).f();
        this.f34590b = gr;
        gr.Z2(new BinderC3960to(this, c3657o7));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3799qo
    public final void a(q2.c1 c1Var) {
        this.f34590b.d3(c1Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3799qo
    public final void f() {
        this.f34590b.C1(new W2.b(null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3799qo
    public final void i() {
        this.f34590b.A();
    }
}
