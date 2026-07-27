package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3490kq implements InterfaceC3436jq {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3436jq f32464a;

    /* renamed from: b, reason: collision with root package name */
    public final XA f32465b;

    public C3490kq(InterfaceC3436jq interfaceC3436jq, XA xa) {
        this.f32464a = interfaceC3436jq;
        this.f32465b = xa;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final J3.a a(C2953au c2953au, Ut ut) {
        return C3686oN.A(this.f32464a.a(c2953au, ut), this.f32465b, AbstractC3212fg.f30738a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final boolean b(C2953au c2953au, Ut ut) {
        return this.f32464a.b(c2953au, ut);
    }
}
