package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4000u4 implements InterfaceC3407j4 {

    /* renamed from: a, reason: collision with root package name */
    public final Cr f35247a;

    /* renamed from: b, reason: collision with root package name */
    public final C3029c1 f35248b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35249c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35250d;

    /* renamed from: e, reason: collision with root package name */
    public final String f35251e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3566m1 f35252f;

    /* renamed from: g, reason: collision with root package name */
    public String f35253g;

    /* renamed from: h, reason: collision with root package name */
    public int f35254h = 0;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f35255j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35256k;

    /* renamed from: l, reason: collision with root package name */
    public long f35257l;

    /* renamed from: m, reason: collision with root package name */
    public int f35258m;

    /* renamed from: n, reason: collision with root package name */
    public long f35259n;

    public C4000u4(String str, int i, String str2) {
        Cr cr = new Cr(4);
        this.f35247a = cr;
        cr.f24997a[0] = -1;
        this.f35248b = new C3029c1();
        this.f35259n = com.anythink.basead.exoplayer.b.f7168b;
        this.f35249c = str;
        this.f35250d = i;
        this.f35251e = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f35253g = f42.f25502e;
        f42.b();
        this.f35252f = s02.C(f42.f25501d, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void b(Cr cr) {
        this.f35252f.getClass();
        while (cr.B() > 0) {
            int i = this.f35254h;
            Cr cr2 = this.f35247a;
            if (i == 0) {
                byte[] bArr = cr.f24997a;
                int i4 = cr.f24998b;
                int i6 = cr.f24999c;
                while (true) {
                    if (i4 >= i6) {
                        cr.E(i6);
                        break;
                    }
                    int i9 = i4 + 1;
                    byte b9 = bArr[i4];
                    boolean z6 = (b9 & 255) == 255;
                    boolean z9 = this.f35256k && (b9 & 224) == 224;
                    this.f35256k = z6;
                    if (z9) {
                        cr.E(i9);
                        this.f35256k = false;
                        cr2.f24997a[1] = bArr[i4];
                        this.i = 2;
                        this.f35254h = 1;
                        break;
                    }
                    i4 = i9;
                }
            } else if (i != 1) {
                int min = Math.min(cr.B(), this.f35258m - this.i);
                this.f35252f.a(min, cr);
                int i10 = this.i + min;
                this.i = i10;
                if (i10 >= this.f35258m) {
                    AbstractC2792Sd.H(this.f35259n != com.anythink.basead.exoplayer.b.f7168b);
                    this.f35252f.c(this.f35259n, 1, this.f35258m, 0, null);
                    this.f35259n += this.f35257l;
                    this.i = 0;
                    this.f35254h = 0;
                }
            } else {
                int min2 = Math.min(cr.B(), 4 - this.i);
                cr.H(cr2.f24997a, this.i, min2);
                int i11 = this.i + min2;
                this.i = i11;
                if (i11 >= 4) {
                    cr2.E(0);
                    int b10 = cr2.b();
                    C3029c1 c3029c1 = this.f35248b;
                    if (c3029c1.a(b10)) {
                        this.f35258m = c3029c1.f30192b;
                        if (!this.f35255j) {
                            this.f35257l = (c3029c1.f30196f * 1000000) / c3029c1.f30193c;
                            C3322hP c3322hP = new C3322hP();
                            c3322hP.f31546a = this.f35253g;
                            c3322hP.d(this.f35251e);
                            c3322hP.e((String) c3029c1.f30197g);
                            c3322hP.f31559o = 4096;
                            c3322hP.f31538G = c3029c1.f30194d;
                            c3322hP.f31540I = c3029c1.f30193c;
                            c3322hP.f31549d = this.f35249c;
                            c3322hP.f31551f = this.f35250d;
                            this.f35252f.e(new DP(c3322hP));
                            this.f35255j = true;
                        }
                        cr2.E(0);
                        this.f35252f.a(4, cr2);
                        this.f35254h = 2;
                    } else {
                        this.i = 0;
                        this.f35254h = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void c() {
        this.f35254h = 0;
        this.i = 0;
        this.f35256k = false;
        this.f35259n = com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void d(int i, long j6) {
        this.f35259n = j6;
    }
}
