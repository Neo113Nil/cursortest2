package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.o4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3677o4 implements InterfaceC3407j4 {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f33636l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final C3504ku f33637a;

    /* renamed from: b, reason: collision with root package name */
    public final Cr f33638b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f33639c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final C3569m4 f33640d;

    /* renamed from: e, reason: collision with root package name */
    public final C4108w4 f33641e;

    /* renamed from: f, reason: collision with root package name */
    public C3623n4 f33642f;

    /* renamed from: g, reason: collision with root package name */
    public long f33643g;

    /* renamed from: h, reason: collision with root package name */
    public String f33644h;
    public InterfaceC3566m1 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f33645j;

    /* renamed from: k, reason: collision with root package name */
    public long f33646k;

    public C3677o4(C3504ku c3504ku) {
        this.f33637a = c3504ku;
        C3569m4 c3569m4 = new C3569m4();
        c3569m4.f32677e = new byte[128];
        this.f33640d = c3569m4;
        this.f33646k = com.anythink.basead.exoplayer.b.f7168b;
        this.f33641e = new C4108w4(178);
        this.f33638b = new Cr();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f33644h = f42.f25502e;
        f42.b();
        InterfaceC3566m1 C8 = s02.C(f42.f25501d, 2);
        this.i = C8;
        this.f33642f = new C3623n4(C8);
        this.f33637a.j(s02, f42);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        C3569m4 c3569m4;
        C4108w4 c4108w4;
        int i;
        char c9;
        int i4;
        boolean z6;
        float f2;
        boolean z9 = true;
        this.f33642f.getClass();
        this.i.getClass();
        int i6 = cr.f24998b;
        int i9 = cr.f24999c;
        byte[] bArr = cr.f24997a;
        this.f33643g += cr.B();
        this.i.a(cr.B(), cr);
        while (true) {
            int Q8 = SK.Q(bArr, i6, i9, this.f33639c);
            c3569m4 = this.f33640d;
            c4108w4 = this.f33641e;
            if (Q8 == i9) {
                break;
            }
            int i10 = Q8 + 3;
            byte b9 = cr.f24997a[i10];
            int i11 = b9 & 255;
            int i12 = Q8 - i6;
            if (this.f33645j) {
                i = i9;
            } else {
                if (i12 > 0) {
                    c3569m4.a(bArr, i6, Q8);
                }
                int i13 = i12 < 0 ? -i12 : 0;
                int i14 = c3569m4.f32674b;
                if (i14 != 0) {
                    i = i9;
                    if (i14 != z9) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i11 == 179 || i11 == 181) {
                                    c3569m4.f32675c -= i13;
                                    c3569m4.f32673a = false;
                                    InterfaceC3566m1 interfaceC3566m1 = this.i;
                                    int i15 = c3569m4.f32676d;
                                    String str = this.f33644h;
                                    str.getClass();
                                    byte[] copyOf = Arrays.copyOf(c3569m4.f32677e, c3569m4.f32675c);
                                    C4256yr c4256yr = new C4256yr(copyOf, copyOf.length);
                                    c4256yr.l(i15);
                                    c4256yr.l(4);
                                    c4256yr.e();
                                    c4256yr.f(8);
                                    if (c4256yr.g()) {
                                        c4256yr.f(4);
                                        c4256yr.f(3);
                                    }
                                    int h3 = c4256yr.h(4);
                                    if (h3 == 15) {
                                        int h9 = c4256yr.h(8);
                                        int h10 = c4256yr.h(8);
                                        if (h10 == 0) {
                                            AbstractC2991bG.y("H263Reader", "Invalid aspect ratio");
                                            f2 = 1.0f;
                                            if (c4256yr.g()) {
                                                c4256yr.f(2);
                                                c4256yr.f(1);
                                                if (c4256yr.g()) {
                                                    c4256yr.f(15);
                                                    c4256yr.e();
                                                    c4256yr.f(15);
                                                    c4256yr.e();
                                                    c4256yr.f(15);
                                                    c4256yr.e();
                                                    c4256yr.f(3);
                                                    c4256yr.f(11);
                                                    c4256yr.e();
                                                    c4256yr.f(15);
                                                    c4256yr.e();
                                                }
                                            }
                                            if (c4256yr.h(2) != 0) {
                                                AbstractC2991bG.y("H263Reader", "Unhandled video object layer shape");
                                            }
                                            c4256yr.e();
                                            int h11 = c4256yr.h(16);
                                            c4256yr.e();
                                            if (c4256yr.g()) {
                                                if (h11 == 0) {
                                                    AbstractC2991bG.y("H263Reader", "Invalid vop_increment_time_resolution");
                                                } else {
                                                    int i16 = h11 - 1;
                                                    int i17 = 0;
                                                    while (i16 > 0) {
                                                        i16 >>= 1;
                                                        i17++;
                                                    }
                                                    c4256yr.f(i17);
                                                }
                                            }
                                            c4256yr.e();
                                            int h12 = c4256yr.h(13);
                                            c4256yr.e();
                                            int h13 = c4256yr.h(13);
                                            c4256yr.e();
                                            c4256yr.e();
                                            C3322hP c3322hP = new C3322hP();
                                            c3322hP.f31546a = str;
                                            c3322hP.d("video/mp2t");
                                            c3322hP.e(com.anythink.basead.exoplayer.k.o.f9240l);
                                            c3322hP.f31565u = h12;
                                            c3322hP.f31566v = h13;
                                            c3322hP.f31533B = f2;
                                            c3322hP.f31561q = Collections.singletonList(copyOf);
                                            interfaceC3566m1.e(new DP(c3322hP));
                                            this.f33645j = true;
                                        } else {
                                            f2 = h9 / h10;
                                            if (c4256yr.g()) {
                                            }
                                            if (c4256yr.h(2) != 0) {
                                            }
                                            c4256yr.e();
                                            int h112 = c4256yr.h(16);
                                            c4256yr.e();
                                            if (c4256yr.g()) {
                                            }
                                            c4256yr.e();
                                            int h122 = c4256yr.h(13);
                                            c4256yr.e();
                                            int h132 = c4256yr.h(13);
                                            c4256yr.e();
                                            c4256yr.e();
                                            C3322hP c3322hP2 = new C3322hP();
                                            c3322hP2.f31546a = str;
                                            c3322hP2.d("video/mp2t");
                                            c3322hP2.e(com.anythink.basead.exoplayer.k.o.f9240l);
                                            c3322hP2.f31565u = h122;
                                            c3322hP2.f31566v = h132;
                                            c3322hP2.f31533B = f2;
                                            c3322hP2.f31561q = Collections.singletonList(copyOf);
                                            interfaceC3566m1.e(new DP(c3322hP2));
                                            this.f33645j = true;
                                        }
                                    } else if (h3 < 7) {
                                        f2 = f33636l[h3];
                                        if (c4256yr.g()) {
                                        }
                                        if (c4256yr.h(2) != 0) {
                                        }
                                        c4256yr.e();
                                        int h1122 = c4256yr.h(16);
                                        c4256yr.e();
                                        if (c4256yr.g()) {
                                        }
                                        c4256yr.e();
                                        int h1222 = c4256yr.h(13);
                                        c4256yr.e();
                                        int h1322 = c4256yr.h(13);
                                        c4256yr.e();
                                        c4256yr.e();
                                        C3322hP c3322hP22 = new C3322hP();
                                        c3322hP22.f31546a = str;
                                        c3322hP22.d("video/mp2t");
                                        c3322hP22.e(com.anythink.basead.exoplayer.k.o.f9240l);
                                        c3322hP22.f31565u = h1222;
                                        c3322hP22.f31566v = h1322;
                                        c3322hP22.f31533B = f2;
                                        c3322hP22.f31561q = Collections.singletonList(copyOf);
                                        interfaceC3566m1.e(new DP(c3322hP22));
                                        this.f33645j = true;
                                    } else {
                                        AbstractC2991bG.y("H263Reader", "Invalid aspect ratio");
                                        f2 = 1.0f;
                                        if (c4256yr.g()) {
                                        }
                                        if (c4256yr.h(2) != 0) {
                                        }
                                        c4256yr.e();
                                        int h11222 = c4256yr.h(16);
                                        c4256yr.e();
                                        if (c4256yr.g()) {
                                        }
                                        c4256yr.e();
                                        int h12222 = c4256yr.h(13);
                                        c4256yr.e();
                                        int h13222 = c4256yr.h(13);
                                        c4256yr.e();
                                        c4256yr.e();
                                        C3322hP c3322hP222 = new C3322hP();
                                        c3322hP222.f31546a = str;
                                        c3322hP222.d("video/mp2t");
                                        c3322hP222.e(com.anythink.basead.exoplayer.k.o.f9240l);
                                        c3322hP222.f31565u = h12222;
                                        c3322hP222.f31566v = h13222;
                                        c3322hP222.f31533B = f2;
                                        c3322hP222.f31561q = Collections.singletonList(copyOf);
                                        interfaceC3566m1.e(new DP(c3322hP222));
                                        this.f33645j = true;
                                    }
                                }
                            } else if ((b9 & 240) != 32) {
                                AbstractC2991bG.y("H263Reader", "Unexpected start code value");
                                c3569m4.f32673a = false;
                                c3569m4.f32675c = 0;
                                c3569m4.f32674b = 0;
                            } else {
                                c3569m4.f32676d = c3569m4.f32675c;
                                c3569m4.f32674b = 4;
                            }
                        } else if (i11 > 31) {
                            AbstractC2991bG.y("H263Reader", "Unexpected start code value");
                            c3569m4.f32673a = false;
                            c3569m4.f32675c = 0;
                            c3569m4.f32674b = 0;
                        } else {
                            c3569m4.f32674b = 3;
                        }
                    } else if (i11 != 181) {
                        AbstractC2991bG.y("H263Reader", "Unexpected start code value");
                        c3569m4.f32673a = false;
                        c3569m4.f32675c = 0;
                        c3569m4.f32674b = 0;
                    } else {
                        c3569m4.f32674b = 2;
                    }
                } else {
                    i = i9;
                    if (i11 == 176) {
                        c3569m4.f32674b = 1;
                        c3569m4.f32673a = true;
                    }
                }
                c9 = 3;
                c3569m4.a(C3569m4.f32672f, 0, 3);
                this.f33642f.a(bArr, i6, Q8);
                if (i12 <= 0) {
                    c4108w4.h(bArr, i6, Q8);
                    i4 = 0;
                } else {
                    i4 = -i12;
                }
                if (c4108w4.i(i4)) {
                    int b10 = SK.b(c4108w4.f35567e, (byte[]) c4108w4.f35568f);
                    String str2 = AbstractC3182eu.f30782a;
                    byte[] bArr2 = (byte[]) c4108w4.f35568f;
                    Cr cr2 = this.f33638b;
                    cr2.z(b10, bArr2);
                    this.f33637a.m(this.f33646k, cr2);
                }
                if (i11 != 178) {
                    z9 = true;
                    if (cr.f24997a[Q8 + 2] == 1) {
                        c4108w4.g(178);
                    }
                    i11 = 178;
                } else {
                    z9 = true;
                }
                int i18 = i - Q8;
                this.f33642f.b(i18, this.f33643g - i18, this.f33645j);
                C3623n4 c3623n4 = this.f33642f;
                long j6 = this.f33646k;
                c3623n4.f33458e = i11;
                c3623n4.f33457d = false;
                if (i11 != 182) {
                    if (i11 == 179) {
                        i11 = 179;
                    } else {
                        z6 = false;
                        c3623n4.f33455b = z6;
                        c3623n4.f33456c = i11 == 182 ? z9 : false;
                        c3623n4.f33459f = 0;
                        c3623n4.f33461h = j6;
                        i6 = i10;
                        i9 = i;
                    }
                }
                z6 = z9;
                c3623n4.f33455b = z6;
                c3623n4.f33456c = i11 == 182 ? z9 : false;
                c3623n4.f33459f = 0;
                c3623n4.f33461h = j6;
                i6 = i10;
                i9 = i;
            }
            c9 = 3;
            this.f33642f.a(bArr, i6, Q8);
            if (i12 <= 0) {
            }
            if (c4108w4.i(i4)) {
            }
            if (i11 != 178) {
            }
            int i182 = i - Q8;
            this.f33642f.b(i182, this.f33643g - i182, this.f33645j);
            C3623n4 c3623n42 = this.f33642f;
            long j62 = this.f33646k;
            c3623n42.f33458e = i11;
            c3623n42.f33457d = false;
            if (i11 != 182) {
            }
            z6 = z9;
            c3623n42.f33455b = z6;
            c3623n42.f33456c = i11 == 182 ? z9 : false;
            c3623n42.f33459f = 0;
            c3623n42.f33461h = j62;
            i6 = i10;
            i9 = i;
        }
        if (!this.f33645j) {
            c3569m4.a(bArr, i6, i9);
        }
        this.f33642f.a(bArr, i6, i9);
        c4108w4.h(bArr, i6, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void c() {
        SK.S(this.f33639c);
        C3569m4 c3569m4 = this.f33640d;
        c3569m4.f32673a = false;
        c3569m4.f32675c = 0;
        c3569m4.f32674b = 0;
        C3623n4 c3623n4 = this.f33642f;
        if (c3623n4 != null) {
            c3623n4.f33455b = false;
            c3623n4.f33456c = false;
            c3623n4.f33457d = false;
            c3623n4.f33458e = -1;
        }
        this.f33641e.e();
        this.f33643g = 0L;
        this.f33646k = com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void d(int i, long j6) {
        this.f33646k = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void p() {
        C3623n4 c3623n4 = this.f33642f;
        c3623n4.getClass();
        c3623n4.b(0, this.f33643g, this.f33645j);
        C3623n4 c3623n42 = this.f33642f;
        c3623n42.f33455b = false;
        c3623n42.f33456c = false;
        c3623n42.f33457d = false;
        c3623n42.f33458e = -1;
    }
}
