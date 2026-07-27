package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3977u4 implements InterfaceC3384j4 {

    /* renamed from: a, reason: collision with root package name */
    public final Cr f34473a;

    /* renamed from: b, reason: collision with root package name */
    public final C3006c1 f34474b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34475c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34476d;

    /* renamed from: e, reason: collision with root package name */
    public final String f34477e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3543m1 f34478f;

    /* renamed from: g, reason: collision with root package name */
    public String f34479g;

    /* renamed from: h, reason: collision with root package name */
    public int f34480h = 0;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f34481j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f34482k;

    /* renamed from: l, reason: collision with root package name */
    public long f34483l;

    /* renamed from: m, reason: collision with root package name */
    public int f34484m;

    /* renamed from: n, reason: collision with root package name */
    public long f34485n;

    public C3977u4(String str, int i, String str2) {
        Cr cr = new Cr(4);
        this.f34473a = cr;
        cr.f24252a[0] = -1;
        this.f34474b = new C3006c1();
        this.f34485n = com.anythink.basead.exoplayer.b.f6382b;
        this.f34475c = str;
        this.f34476d = i;
        this.f34477e = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f34479g = f42.f24746e;
        f42.b();
        this.f34478f = s02.C(f42.f24745d, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void b(Cr cr) {
        this.f34478f.getClass();
        while (cr.B() > 0) {
            int i = this.f34480h;
            Cr cr2 = this.f34473a;
            if (i == 0) {
                byte[] bArr = cr.f24252a;
                int i6 = cr.f24253b;
                int i9 = cr.f24254c;
                while (true) {
                    if (i6 >= i9) {
                        cr.E(i9);
                        break;
                    }
                    int i10 = i6 + 1;
                    byte b9 = bArr[i6];
                    boolean z3 = (b9 & 255) == 255;
                    boolean z6 = this.f34482k && (b9 & 224) == 224;
                    this.f34482k = z3;
                    if (z6) {
                        cr.E(i10);
                        this.f34482k = false;
                        cr2.f24252a[1] = bArr[i6];
                        this.i = 2;
                        this.f34480h = 1;
                        break;
                    }
                    i6 = i10;
                }
            } else if (i != 1) {
                int min = Math.min(cr.B(), this.f34484m - this.i);
                this.f34478f.a(min, cr);
                int i11 = this.i + min;
                this.i = i11;
                if (i11 >= this.f34484m) {
                    AbstractC2772Sd.H(this.f34485n != com.anythink.basead.exoplayer.b.f6382b);
                    this.f34478f.c(this.f34485n, 1, this.f34484m, 0, null);
                    this.f34485n += this.f34483l;
                    this.i = 0;
                    this.f34480h = 0;
                }
            } else {
                int min2 = Math.min(cr.B(), 4 - this.i);
                cr.H(cr2.f24252a, this.i, min2);
                int i12 = this.i + min2;
                this.i = i12;
                if (i12 >= 4) {
                    cr2.E(0);
                    int b10 = cr2.b();
                    C3006c1 c3006c1 = this.f34474b;
                    if (c3006c1.a(b10)) {
                        this.f34484m = c3006c1.f29409b;
                        if (!this.f34481j) {
                            this.f34483l = (c3006c1.f29413f * 1000000) / c3006c1.f29410c;
                            C3299hP c3299hP = new C3299hP();
                            c3299hP.f30780a = this.f34479g;
                            c3299hP.d(this.f34477e);
                            c3299hP.e((String) c3006c1.f29414g);
                            c3299hP.f30793o = 4096;
                            c3299hP.f30772G = c3006c1.f29411d;
                            c3299hP.f30774I = c3006c1.f29410c;
                            c3299hP.f30783d = this.f34475c;
                            c3299hP.f30785f = this.f34476d;
                            this.f34478f.e(new DP(c3299hP));
                            this.f34481j = true;
                        }
                        cr2.E(0);
                        this.f34478f.a(4, cr2);
                        this.f34480h = 2;
                    } else {
                        this.i = 0;
                        this.f34480h = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void c() {
        this.f34480h = 0;
        this.i = 0;
        this.f34482k = false;
        this.f34485n = com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void d(int i, long j6) {
        this.f34485n = j6;
    }
}
