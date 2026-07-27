package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3165f extends AbstractC3487l implements Comparable {

    /* renamed from: x, reason: collision with root package name */
    public final int f30009x;

    /* renamed from: y, reason: collision with root package name */
    public final int f30010y;

    public C3165f(int i, A8 a82, int i6, C3327i c3327i, int i9) {
        super(i, a82, i6);
        int i10;
        this.f30009x = RP.K(i9, c3327i.f30979B) ? 1 : 0;
        DP dp = this.f31675w;
        int i11 = dp.f24438v;
        int i12 = -1;
        if (i11 != -1 && (i10 = dp.f24439w) != -1) {
            i12 = i11 * i10;
        }
        this.f30010y = i12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3487l
    public final int a() {
        return this.f30009x;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3487l
    public final /* bridge */ /* synthetic */ boolean b(AbstractC3487l abstractC3487l) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f30010y, ((C3165f) obj).f30010y);
    }
}
