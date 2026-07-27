package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3304hd implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30821a;

    /* renamed from: b, reason: collision with root package name */
    public final N3.a f30822b;

    public /* synthetic */ C3304hd(int i, N3.a aVar) {
        this.f30821a = i;
        this.f30822b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final N3.a a(Object obj) {
        switch (this.f30821a) {
            case 0:
                return QC.t(this.f30822b, new C2.s(2, this, obj), AbstractC3413jg.f31275h);
            case 1:
                return obj != null ? this.f30822b : QC.k(new Zq(1, "Retrieve required value in native ad response failed."));
            default:
                return this.f30822b;
        }
    }
}
