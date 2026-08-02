package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class P2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3566m1 f27499a;

    /* renamed from: d, reason: collision with root package name */
    public C3031c3 f27502d;

    /* renamed from: e, reason: collision with root package name */
    public K2 f27503e;

    /* renamed from: f, reason: collision with root package name */
    public int f27504f;

    /* renamed from: g, reason: collision with root package name */
    public int f27505g;

    /* renamed from: h, reason: collision with root package name */
    public int f27506h;
    public int i;

    /* renamed from: l, reason: collision with root package name */
    public DP f27509l;

    /* renamed from: m, reason: collision with root package name */
    public DP f27510m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f27511n;

    /* renamed from: b, reason: collision with root package name */
    public final C2978b3 f27500b = new C2978b3();

    /* renamed from: c, reason: collision with root package name */
    public final Cr f27501c = new Cr();

    /* renamed from: j, reason: collision with root package name */
    public final Cr f27507j = new Cr(1);

    /* renamed from: k, reason: collision with root package name */
    public final Cr f27508k = new Cr();

    public P2(InterfaceC3566m1 interfaceC3566m1, C3031c3 c3031c3, K2 k22, DP dp) {
        this.f27499a = interfaceC3566m1;
        this.f27502d = c3031c3;
        this.f27503e = k22;
        this.f27510m = dp;
        if (AbstractC2991bG.n(dp.f25176o)) {
            this.f27509l = dp;
        }
        this.f27502d = c3031c3;
        this.f27503e = k22;
        if (this.f27509l == null) {
            interfaceC3566m1.e(this.f27510m);
        }
        a();
    }

    public final void a() {
        C2978b3 c2978b3 = this.f27500b;
        c2978b3.f29980d = 0;
        c2978b3.f29991p = 0L;
        c2978b3.f29992q = false;
        c2978b3.f29986k = false;
        c2978b3.f29990o = false;
        c2978b3.f29988m = null;
        this.f27504f = 0;
        this.f27506h = 0;
        this.f27505g = 0;
        this.i = 0;
        this.f27511n = false;
    }

    public final int b() {
        int i = !this.f27511n ? this.f27502d.f30205g[this.f27504f] : this.f27500b.f29985j[this.f27504f] ? 1 : 0;
        return e() != null ? i | 1073741824 : i;
    }

    public final boolean c() {
        this.f27504f++;
        if (!this.f27511n) {
            return false;
        }
        int i = this.f27505g + 1;
        this.f27505g = i;
        int[] iArr = this.f27500b.f29983g;
        int i4 = this.f27506h;
        if (i != iArr[i4]) {
            return true;
        }
        this.f27506h = i4 + 1;
        this.f27505g = 0;
        return false;
    }

    public final int d(int i, int i4) {
        Cr cr;
        C2924a3 e9 = e();
        if (e9 == null) {
            return 0;
        }
        C2978b3 c2978b3 = this.f27500b;
        int i6 = e9.f29783d;
        if (i6 != 0) {
            cr = c2978b3.f29989n;
        } else {
            String str = AbstractC3182eu.f30782a;
            byte[] bArr = e9.f29784e;
            i6 = bArr.length;
            Cr cr2 = this.f27508k;
            cr2.z(i6, bArr);
            cr = cr2;
        }
        boolean z6 = c2978b3.f29986k && c2978b3.f29987l[this.f27504f];
        boolean z9 = z6 || i4 != 0;
        int i9 = true != z9 ? 0 : 128;
        Cr cr3 = this.f27507j;
        cr3.f24997a[0] = (byte) (i9 | i6);
        cr3.E(0);
        InterfaceC3566m1 interfaceC3566m1 = this.f27499a;
        interfaceC3566m1.f(cr3, 1, 1);
        interfaceC3566m1.f(cr, i6, 1);
        if (!z9) {
            return i6 + 1;
        }
        Cr cr4 = this.f27501c;
        if (!z6) {
            cr4.y(8);
            byte[] bArr2 = cr4.f24997a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i4;
            bArr2[4] = (byte) ((i >> 24) & com.anythink.basead.exoplayer.k.p.f9259b);
            bArr2[5] = (byte) ((i >> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
            bArr2[6] = (byte) ((i >> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
            bArr2[7] = (byte) (i & com.anythink.basead.exoplayer.k.p.f9259b);
            interfaceC3566m1.f(cr4, 8, 1);
            return i6 + 9;
        }
        int i10 = i6 + 1;
        Cr cr5 = c2978b3.f29989n;
        int L2 = cr5.L();
        cr5.G(-2);
        int i11 = (L2 * 6) + 2;
        if (i4 != 0) {
            cr4.y(i11);
            byte[] bArr3 = cr4.f24997a;
            cr5.H(bArr3, 0, i11);
            int i12 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i4;
            bArr3[2] = (byte) ((i12 >> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
            bArr3[3] = (byte) (i12 & com.anythink.basead.exoplayer.k.p.f9259b);
        } else {
            cr4 = cr5;
        }
        interfaceC3566m1.f(cr4, i11, 1);
        return i10 + i11;
    }

    public final C2924a3 e() {
        if (this.f27511n) {
            C2978b3 c2978b3 = this.f27500b;
            K2 k22 = c2978b3.f29977a;
            String str = AbstractC3182eu.f30782a;
            int i = k22.f26581a;
            C2924a3 c2924a3 = c2978b3.f29988m;
            if (c2924a3 == null) {
                C2924a3[] c2924a3Arr = this.f27502d.f30199a.f29614n;
                c2924a3 = c2924a3Arr == null ? null : c2924a3Arr[i];
            }
            if (c2924a3 != null && c2924a3.f29780a) {
                return c2924a3;
            }
        }
        return null;
    }
}
