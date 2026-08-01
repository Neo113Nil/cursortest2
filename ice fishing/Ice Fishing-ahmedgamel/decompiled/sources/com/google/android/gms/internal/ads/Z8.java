package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Z8 extends C3467kg {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28844u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Object f28845v;

    public Z8(com.bumptech.glide.manager.p pVar) {
        this.f28845v = pVar;
    }

    @Override // com.google.android.gms.internal.ads.C3467kg, java.util.concurrent.Future
    public boolean cancel(boolean z3) {
        switch (this.f28844u) {
            case 0:
                ((com.bumptech.glide.manager.p) this.f28845v).g();
                return this.f31479n.cancel(z3);
            default:
                return super.cancel(z3);
        }
    }

    public void d() {
        b(this.f28845v);
    }

    public Z8(Object obj) {
        this.f28845v = obj;
    }
}
