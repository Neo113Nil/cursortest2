package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3006c1 {

    /* renamed from: a, reason: collision with root package name */
    public int f29408a;

    /* renamed from: b, reason: collision with root package name */
    public int f29409b;

    /* renamed from: c, reason: collision with root package name */
    public int f29410c;

    /* renamed from: d, reason: collision with root package name */
    public int f29411d;

    /* renamed from: e, reason: collision with root package name */
    public int f29412e;

    /* renamed from: f, reason: collision with root package name */
    public int f29413f;

    /* renamed from: g, reason: collision with root package name */
    public Object f29414g;

    public /* synthetic */ C3006c1(VO vo) {
        this.f29408a = vo.f28191a;
        this.f29409b = vo.f28192b;
        this.f29410c = vo.f28193c;
        this.f29411d = vo.f28194d;
        this.f29414g = vo.f28195e;
        this.f29412e = vo.f28196f;
        this.f29413f = vo.f28197g;
    }

    public boolean a(int i) {
        int i6;
        int i9;
        int i10;
        int i11;
        if ((i & (-2097152)) != -2097152 || (i6 = (i >>> 19) & 3) == 1 || (i9 = (i >>> 17) & 3) == 0 || (i10 = (i >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i12 = i10 - 1;
        this.f29408a = i6;
        this.f29414g = SK.f27455n[3 - i9];
        int i13 = SK.f27463u[i11];
        this.f29410c = i13;
        if (i6 == 2) {
            i13 /= 2;
            this.f29410c = i13;
        } else if (i6 == 0) {
            i13 /= 4;
            this.f29410c = i13;
        }
        int i14 = (i >>> 9) & 1;
        int i15 = 1152;
        if (i9 != 1) {
            if (i9 != 2) {
                i15 = 384;
            }
        } else if (i6 != 3) {
            i15 = 576;
        }
        this.f29413f = i15;
        if (i9 == 3) {
            int i16 = i6 == 3 ? SK.f27465v[i12] : SK.f27467w[i12];
            this.f29412e = i16;
            this.f29409b = (((i16 * 12) / i13) + i14) * 4;
        } else {
            if (i6 == 3) {
                int i17 = i9 == 2 ? SK.f27469x[i12] : SK.f27470y[i12];
                this.f29412e = i17;
                this.f29409b = ((i17 * 144) / i13) + i14;
            } else {
                int i18 = SK.f27471z[i12];
                this.f29412e = i18;
                this.f29409b = (((i9 == 1 ? 72 : 144) * i18) / i13) + i14;
            }
        }
        this.f29411d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
