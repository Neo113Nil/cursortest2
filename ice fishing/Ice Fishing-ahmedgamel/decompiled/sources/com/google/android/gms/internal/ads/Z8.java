package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Z8 extends C3490kg {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29624u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Object f29625v;

    public Z8(com.bumptech.glide.manager.o oVar) {
        this.f29625v = oVar;
    }

    @Override // com.google.android.gms.internal.ads.C3490kg, java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        switch (this.f29624u) {
            case 0:
                ((com.bumptech.glide.manager.o) this.f29625v).g();
                return this.f32256n.cancel(z6);
            default:
                return super.cancel(z6);
        }
    }

    public void d() {
        b(this.f29625v);
    }

    public Z8(Object obj) {
        this.f29625v = obj;
    }
}
