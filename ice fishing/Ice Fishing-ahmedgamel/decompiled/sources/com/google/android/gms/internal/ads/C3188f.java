package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3188f extends AbstractC3510l implements Comparable {

    /* renamed from: x, reason: collision with root package name */
    public final int f30796x;

    /* renamed from: y, reason: collision with root package name */
    public final int f30797y;

    public C3188f(int i, A8 a82, int i4, C3350i c3350i, int i6) {
        super(i, a82, i4);
        int i9;
        this.f30796x = SP.K(i6, c3350i.f31752B) ? 1 : 0;
        DP dp = this.f32455w;
        int i10 = dp.f25183v;
        int i11 = -1;
        if (i10 != -1 && (i9 = dp.f25184w) != -1) {
            i11 = i10 * i9;
        }
        this.f30797y = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3510l
    public final int a() {
        return this.f30796x;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3510l
    public final /* bridge */ /* synthetic */ boolean b(AbstractC3510l abstractC3510l) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f30797y, ((C3188f) obj).f30797y);
    }
}
