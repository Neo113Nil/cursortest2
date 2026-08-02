package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3029c1 {

    /* renamed from: a, reason: collision with root package name */
    public int f30191a;

    /* renamed from: b, reason: collision with root package name */
    public int f30192b;

    /* renamed from: c, reason: collision with root package name */
    public int f30193c;

    /* renamed from: d, reason: collision with root package name */
    public int f30194d;

    /* renamed from: e, reason: collision with root package name */
    public int f30195e;

    /* renamed from: f, reason: collision with root package name */
    public int f30196f;

    /* renamed from: g, reason: collision with root package name */
    public Object f30197g;

    public /* synthetic */ C3029c1(VO vo) {
        this.f30191a = vo.f28987a;
        this.f30192b = vo.f28988b;
        this.f30193c = vo.f28989c;
        this.f30194d = vo.f28990d;
        this.f30197g = vo.f28991e;
        this.f30195e = vo.f28992f;
        this.f30196f = vo.f28993g;
    }

    public boolean a(int i) {
        int i4;
        int i6;
        int i9;
        int i10;
        if ((i & (-2097152)) != -2097152 || (i4 = (i >>> 19) & 3) == 1 || (i6 = (i >>> 17) & 3) == 0 || (i9 = (i >>> 12) & 15) == 0 || i9 == 15 || (i10 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i11 = i9 - 1;
        this.f30191a = i4;
        this.f30197g = SK.f28173n[3 - i6];
        int i12 = SK.f28179u[i10];
        this.f30193c = i12;
        if (i4 == 2) {
            i12 /= 2;
            this.f30193c = i12;
        } else if (i4 == 0) {
            i12 /= 4;
            this.f30193c = i12;
        }
        int i13 = (i >>> 9) & 1;
        int i14 = 1152;
        if (i6 != 1) {
            if (i6 != 2) {
                i14 = 384;
            }
        } else if (i4 != 3) {
            i14 = 576;
        }
        this.f30196f = i14;
        if (i6 == 3) {
            int i15 = i4 == 3 ? SK.f28180v[i11] : SK.f28181w[i11];
            this.f30195e = i15;
            this.f30192b = (((i15 * 12) / i12) + i13) * 4;
        } else {
            if (i4 == 3) {
                int i16 = i6 == 2 ? SK.f28182x[i11] : SK.f28183y[i11];
                this.f30195e = i16;
                this.f30192b = ((i16 * 144) / i12) + i13;
            } else {
                int i17 = SK.f28184z[i11];
                this.f30195e = i17;
                this.f30192b = (((i6 == 1 ? 72 : 144) * i17) / i12) + i13;
            }
        }
        this.f30194d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
