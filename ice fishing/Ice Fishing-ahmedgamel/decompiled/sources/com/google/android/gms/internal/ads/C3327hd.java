package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3327hd implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31582a;

    /* renamed from: b, reason: collision with root package name */
    public final P3.a f31583b;

    public /* synthetic */ C3327hd(int i, P3.a aVar) {
        this.f31582a = i;
        this.f31583b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final P3.a a(Object obj) {
        switch (this.f31582a) {
            case 0:
                return QC.t(this.f31583b, new E2.r(2, this, obj), AbstractC3436jg.f32062h);
            case 1:
                return obj != null ? this.f31583b : QC.k(new Zq(1, "Retrieve required value in native ad response failed."));
            default:
                return this.f31583b;
        }
    }
}
