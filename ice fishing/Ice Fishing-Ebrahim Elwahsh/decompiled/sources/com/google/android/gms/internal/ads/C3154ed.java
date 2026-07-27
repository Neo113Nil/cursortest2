package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ed, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3154ed implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30445a;

    /* renamed from: b, reason: collision with root package name */
    public final J3.a f30446b;

    public /* synthetic */ C3154ed(int i, J3.a aVar) {
        this.f30445a = i;
        this.f30446b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final J3.a b(Object obj) {
        switch (this.f30445a) {
            case 0:
                return C3686oN.y(this.f30446b, new C2936ad(1, this, obj), AbstractC3212fg.f30745h);
            case 1:
                return obj != null ? this.f30446b : C3686oN.l(new C3059cr(1, "Retrieve required value in native ad response failed."));
            default:
                return this.f30446b;
        }
    }
}
