package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class M2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3448k1 f26282a;

    /* renamed from: d, reason: collision with root package name */
    public C2908a3 f26285d;

    /* renamed from: e, reason: collision with root package name */
    public I2 f26286e;

    /* renamed from: f, reason: collision with root package name */
    public int f26287f;

    /* renamed from: g, reason: collision with root package name */
    public int f26288g;

    /* renamed from: h, reason: collision with root package name */
    public int f26289h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final TP f26290j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26293m;

    /* renamed from: b, reason: collision with root package name */
    public final Z2 f26283b = new Z2();

    /* renamed from: c, reason: collision with root package name */
    public final Lr f26284c = new Lr();

    /* renamed from: k, reason: collision with root package name */
    public final Lr f26291k = new Lr(1);

    /* renamed from: l, reason: collision with root package name */
    public final Lr f26292l = new Lr();

    public M2(InterfaceC3448k1 interfaceC3448k1, C2908a3 c2908a3, I2 i22, TP tp) {
        this.f26282a = interfaceC3448k1;
        this.f26285d = c2908a3;
        this.f26286e = i22;
        this.f26290j = tp;
        this.f26285d = c2908a3;
        this.f26286e = i22;
        interfaceC3448k1.e(tp);
        a();
    }

    public final void a() {
        Z2 z22 = this.f26283b;
        z22.f28946d = 0;
        z22.f28957p = 0L;
        z22.f28958q = false;
        z22.f28952k = false;
        z22.f28956o = false;
        z22.f28954m = null;
        this.f26287f = 0;
        this.f26289h = 0;
        this.f26288g = 0;
        this.i = 0;
        this.f26293m = false;
    }

    public final int b() {
        int i = !this.f26293m ? this.f26285d.f29169g[this.f26287f] : this.f26283b.f28951j[this.f26287f] ? 1 : 0;
        return e() != null ? i | 1073741824 : i;
    }

    public final boolean c() {
        this.f26287f++;
        if (!this.f26293m) {
            return false;
        }
        int i = this.f26288g + 1;
        this.f26288g = i;
        int[] iArr = this.f26283b.f28949g;
        int i4 = this.f26289h;
        if (i != iArr[i4]) {
            return true;
        }
        this.f26289h = i4 + 1;
        this.f26288g = 0;
        return false;
    }

    public final int d(int i, int i4) {
        Lr lr;
        Y2 e6 = e();
        if (e6 == null) {
            return 0;
        }
        Z2 z22 = this.f26283b;
        int i9 = e6.f28775d;
        if (i9 != 0) {
            lr = z22.f28955n;
        } else {
            String str = AbstractC3548lu.f32613a;
            byte[] bArr = e6.f28776e;
            i9 = bArr.length;
            Lr lr2 = this.f26292l;
            lr2.z(i9, bArr);
            lr = lr2;
        }
        boolean z8 = z22.f28952k && z22.f28953l[this.f26287f];
        boolean z9 = z8 || i4 != 0;
        int i10 = true != z9 ? 0 : 128;
        Lr lr3 = this.f26291k;
        lr3.f26233a[0] = (byte) (i10 | i9);
        lr3.E(0);
        InterfaceC3448k1 interfaceC3448k1 = this.f26282a;
        interfaceC3448k1.f(lr3, 1, 1);
        interfaceC3448k1.f(lr, i9, 1);
        if (!z9) {
            return i9 + 1;
        }
        Lr lr4 = this.f26284c;
        if (!z8) {
            lr4.y(8);
            byte[] bArr2 = lr4.f26233a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i4;
            bArr2[4] = (byte) ((i >> 24) & com.anythink.basead.exoplayer.k.p.f8630b);
            bArr2[5] = (byte) ((i >> 16) & com.anythink.basead.exoplayer.k.p.f8630b);
            bArr2[6] = (byte) ((i >> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
            bArr2[7] = (byte) (i & com.anythink.basead.exoplayer.k.p.f8630b);
            interfaceC3448k1.f(lr4, 8, 1);
            return i9 + 9;
        }
        int i11 = i9 + 1;
        Lr lr5 = z22.f28955n;
        int L8 = lr5.L();
        lr5.G(-2);
        int i12 = (L8 * 6) + 2;
        if (i4 != 0) {
            lr4.y(i12);
            byte[] bArr3 = lr4.f26233a;
            lr5.H(bArr3, 0, i12);
            int i13 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i4;
            bArr3[2] = (byte) ((i13 >> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
            bArr3[3] = (byte) (i13 & com.anythink.basead.exoplayer.k.p.f8630b);
        } else {
            lr4 = lr5;
        }
        interfaceC3448k1.f(lr4, i12, 1);
        return i11 + i12;
    }

    public final Y2 e() {
        if (this.f26293m) {
            Z2 z22 = this.f26283b;
            I2 i22 = z22.f28943a;
            String str = AbstractC3548lu.f32613a;
            int i = i22.f25510a;
            Y2 y22 = z22.f28954m;
            if (y22 == null) {
                Y2[] y2Arr = this.f26285d.f29163a.f28599n;
                y22 = y2Arr == null ? null : y2Arr[i];
            }
            if (y22 != null && y22.f28772a) {
                return y22;
            }
        }
        return null;
    }
}
