package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class P2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3543m1 f26716a;

    /* renamed from: d, reason: collision with root package name */
    public C3008c3 f26719d;

    /* renamed from: e, reason: collision with root package name */
    public K2 f26720e;

    /* renamed from: f, reason: collision with root package name */
    public int f26721f;

    /* renamed from: g, reason: collision with root package name */
    public int f26722g;

    /* renamed from: h, reason: collision with root package name */
    public int f26723h;
    public int i;

    /* renamed from: l, reason: collision with root package name */
    public DP f26726l;

    /* renamed from: m, reason: collision with root package name */
    public DP f26727m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26728n;

    /* renamed from: b, reason: collision with root package name */
    public final C2955b3 f26717b = new C2955b3();

    /* renamed from: c, reason: collision with root package name */
    public final Cr f26718c = new Cr();

    /* renamed from: j, reason: collision with root package name */
    public final Cr f26724j = new Cr(1);

    /* renamed from: k, reason: collision with root package name */
    public final Cr f26725k = new Cr();

    public P2(InterfaceC3543m1 interfaceC3543m1, C3008c3 c3008c3, K2 k22, DP dp) {
        this.f26716a = interfaceC3543m1;
        this.f26719d = c3008c3;
        this.f26720e = k22;
        this.f26727m = dp;
        if (AbstractC2968bG.n(dp.f24431o)) {
            this.f26726l = dp;
        }
        this.f26719d = c3008c3;
        this.f26720e = k22;
        if (this.f26726l == null) {
            interfaceC3543m1.e(this.f26727m);
        }
        a();
    }

    public final void a() {
        C2955b3 c2955b3 = this.f26717b;
        c2955b3.f29192d = 0;
        c2955b3.f29203p = 0L;
        c2955b3.f29204q = false;
        c2955b3.f29198k = false;
        c2955b3.f29202o = false;
        c2955b3.f29200m = null;
        this.f26721f = 0;
        this.f26723h = 0;
        this.f26722g = 0;
        this.i = 0;
        this.f26728n = false;
    }

    public final int b() {
        int i = !this.f26728n ? this.f26719d.f29422g[this.f26721f] : this.f26717b.f29197j[this.f26721f] ? 1 : 0;
        return e() != null ? i | 1073741824 : i;
    }

    public final boolean c() {
        this.f26721f++;
        if (!this.f26728n) {
            return false;
        }
        int i = this.f26722g + 1;
        this.f26722g = i;
        int[] iArr = this.f26717b.f29195g;
        int i6 = this.f26723h;
        if (i != iArr[i6]) {
            return true;
        }
        this.f26723h = i6 + 1;
        this.f26722g = 0;
        return false;
    }

    public final int d(int i, int i6) {
        Cr cr;
        C2901a3 e9 = e();
        if (e9 == null) {
            return 0;
        }
        C2955b3 c2955b3 = this.f26717b;
        int i9 = e9.f29013d;
        if (i9 != 0) {
            cr = c2955b3.f29201n;
        } else {
            String str = AbstractC3159eu.f29993a;
            byte[] bArr = e9.f29014e;
            i9 = bArr.length;
            Cr cr2 = this.f26725k;
            cr2.z(i9, bArr);
            cr = cr2;
        }
        boolean z3 = c2955b3.f29198k && c2955b3.f29199l[this.f26721f];
        boolean z6 = z3 || i6 != 0;
        int i10 = true != z6 ? 0 : 128;
        Cr cr3 = this.f26724j;
        cr3.f24252a[0] = (byte) (i10 | i9);
        cr3.E(0);
        InterfaceC3543m1 interfaceC3543m1 = this.f26716a;
        interfaceC3543m1.f(cr3, 1, 1);
        interfaceC3543m1.f(cr, i9, 1);
        if (!z6) {
            return i9 + 1;
        }
        Cr cr4 = this.f26718c;
        if (!z3) {
            cr4.y(8);
            byte[] bArr2 = cr4.f24252a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i6;
            bArr2[4] = (byte) ((i >> 24) & com.anythink.basead.exoplayer.k.p.f8473b);
            bArr2[5] = (byte) ((i >> 16) & com.anythink.basead.exoplayer.k.p.f8473b);
            bArr2[6] = (byte) ((i >> 8) & com.anythink.basead.exoplayer.k.p.f8473b);
            bArr2[7] = (byte) (i & com.anythink.basead.exoplayer.k.p.f8473b);
            interfaceC3543m1.f(cr4, 8, 1);
            return i9 + 9;
        }
        int i11 = i9 + 1;
        Cr cr5 = c2955b3.f29201n;
        int L6 = cr5.L();
        cr5.G(-2);
        int i12 = (L6 * 6) + 2;
        if (i6 != 0) {
            cr4.y(i12);
            byte[] bArr3 = cr4.f24252a;
            cr5.H(bArr3, 0, i12);
            int i13 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i6;
            bArr3[2] = (byte) ((i13 >> 8) & com.anythink.basead.exoplayer.k.p.f8473b);
            bArr3[3] = (byte) (i13 & com.anythink.basead.exoplayer.k.p.f8473b);
        } else {
            cr4 = cr5;
        }
        interfaceC3543m1.f(cr4, i12, 1);
        return i11 + i12;
    }

    public final C2901a3 e() {
        if (this.f26728n) {
            C2955b3 c2955b3 = this.f26717b;
            K2 k22 = c2955b3.f29189a;
            String str = AbstractC3159eu.f29993a;
            int i = k22.f25829a;
            C2901a3 c2901a3 = c2955b3.f29200m;
            if (c2901a3 == null) {
                C2901a3[] c2901a3Arr = this.f26719d.f29416a.f28834n;
                c2901a3 = c2901a3Arr == null ? null : c2901a3Arr[i];
            }
            if (c2901a3 != null && c2901a3.f29010a) {
                return c2901a3;
            }
        }
        return null;
    }
}
