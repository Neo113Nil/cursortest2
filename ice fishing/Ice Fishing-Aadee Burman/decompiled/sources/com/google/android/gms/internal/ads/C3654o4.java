package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.o4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3654o4 implements InterfaceC3384j4 {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f32849l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final C3481ku f32850a;

    /* renamed from: b, reason: collision with root package name */
    public final Cr f32851b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f32852c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final C3546m4 f32853d;

    /* renamed from: e, reason: collision with root package name */
    public final C4085w4 f32854e;

    /* renamed from: f, reason: collision with root package name */
    public C3600n4 f32855f;

    /* renamed from: g, reason: collision with root package name */
    public long f32856g;

    /* renamed from: h, reason: collision with root package name */
    public String f32857h;
    public InterfaceC3543m1 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32858j;

    /* renamed from: k, reason: collision with root package name */
    public long f32859k;

    public C3654o4(C3481ku c3481ku) {
        this.f32850a = c3481ku;
        C3546m4 c3546m4 = new C3546m4();
        c3546m4.f31897e = new byte[128];
        this.f32853d = c3546m4;
        this.f32859k = com.anythink.basead.exoplayer.b.f6382b;
        this.f32854e = new C4085w4(178);
        this.f32851b = new Cr();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f32857h = f42.f24746e;
        f42.b();
        InterfaceC3543m1 C8 = s02.C(f42.f24745d, 2);
        this.i = C8;
        this.f32855f = new C3600n4(C8);
        this.f32850a.j(s02, f42);
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
    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        C3546m4 c3546m4;
        C4085w4 c4085w4;
        int i;
        char c9;
        int i6;
        boolean z3;
        float f3;
        boolean z6 = true;
        this.f32855f.getClass();
        this.i.getClass();
        int i9 = cr.f24253b;
        int i10 = cr.f24254c;
        byte[] bArr = cr.f24252a;
        this.f32856g += cr.B();
        this.i.a(cr.B(), cr);
        while (true) {
            int Q8 = SK.Q(bArr, i9, i10, this.f32852c);
            c3546m4 = this.f32853d;
            c4085w4 = this.f32854e;
            if (Q8 == i10) {
                break;
            }
            int i11 = Q8 + 3;
            byte b9 = cr.f24252a[i11];
            int i12 = b9 & 255;
            int i13 = Q8 - i9;
            if (this.f32858j) {
                i = i10;
            } else {
                if (i13 > 0) {
                    c3546m4.a(bArr, i9, Q8);
                }
                int i14 = i13 < 0 ? -i13 : 0;
                int i15 = c3546m4.f31894b;
                if (i15 != 0) {
                    i = i10;
                    if (i15 != z6) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i12 == 179 || i12 == 181) {
                                    c3546m4.f31895c -= i14;
                                    c3546m4.f31893a = false;
                                    InterfaceC3543m1 interfaceC3543m1 = this.i;
                                    int i16 = c3546m4.f31896d;
                                    String str = this.f32857h;
                                    str.getClass();
                                    byte[] copyOf = Arrays.copyOf(c3546m4.f31897e, c3546m4.f31895c);
                                    C4233yr c4233yr = new C4233yr(copyOf, copyOf.length);
                                    c4233yr.l(i16);
                                    c4233yr.l(4);
                                    c4233yr.e();
                                    c4233yr.f(8);
                                    if (c4233yr.g()) {
                                        c4233yr.f(4);
                                        c4233yr.f(3);
                                    }
                                    int h9 = c4233yr.h(4);
                                    if (h9 == 15) {
                                        int h10 = c4233yr.h(8);
                                        int h11 = c4233yr.h(8);
                                        if (h11 == 0) {
                                            AbstractC2968bG.y("H263Reader", "Invalid aspect ratio");
                                            f3 = 1.0f;
                                            if (c4233yr.g()) {
                                                c4233yr.f(2);
                                                c4233yr.f(1);
                                                if (c4233yr.g()) {
                                                    c4233yr.f(15);
                                                    c4233yr.e();
                                                    c4233yr.f(15);
                                                    c4233yr.e();
                                                    c4233yr.f(15);
                                                    c4233yr.e();
                                                    c4233yr.f(3);
                                                    c4233yr.f(11);
                                                    c4233yr.e();
                                                    c4233yr.f(15);
                                                    c4233yr.e();
                                                }
                                            }
                                            if (c4233yr.h(2) != 0) {
                                                AbstractC2968bG.y("H263Reader", "Unhandled video object layer shape");
                                            }
                                            c4233yr.e();
                                            int h12 = c4233yr.h(16);
                                            c4233yr.e();
                                            if (c4233yr.g()) {
                                                if (h12 == 0) {
                                                    AbstractC2968bG.y("H263Reader", "Invalid vop_increment_time_resolution");
                                                } else {
                                                    int i17 = h12 - 1;
                                                    int i18 = 0;
                                                    while (i17 > 0) {
                                                        i17 >>= 1;
                                                        i18++;
                                                    }
                                                    c4233yr.f(i18);
                                                }
                                            }
                                            c4233yr.e();
                                            int h13 = c4233yr.h(13);
                                            c4233yr.e();
                                            int h14 = c4233yr.h(13);
                                            c4233yr.e();
                                            c4233yr.e();
                                            C3299hP c3299hP = new C3299hP();
                                            c3299hP.f30780a = str;
                                            c3299hP.d("video/mp2t");
                                            c3299hP.e(com.anythink.basead.exoplayer.k.o.f8454l);
                                            c3299hP.f30799u = h13;
                                            c3299hP.f30800v = h14;
                                            c3299hP.f30767B = f3;
                                            c3299hP.f30795q = Collections.singletonList(copyOf);
                                            interfaceC3543m1.e(new DP(c3299hP));
                                            this.f32858j = true;
                                        } else {
                                            f3 = h10 / h11;
                                            if (c4233yr.g()) {
                                            }
                                            if (c4233yr.h(2) != 0) {
                                            }
                                            c4233yr.e();
                                            int h122 = c4233yr.h(16);
                                            c4233yr.e();
                                            if (c4233yr.g()) {
                                            }
                                            c4233yr.e();
                                            int h132 = c4233yr.h(13);
                                            c4233yr.e();
                                            int h142 = c4233yr.h(13);
                                            c4233yr.e();
                                            c4233yr.e();
                                            C3299hP c3299hP2 = new C3299hP();
                                            c3299hP2.f30780a = str;
                                            c3299hP2.d("video/mp2t");
                                            c3299hP2.e(com.anythink.basead.exoplayer.k.o.f8454l);
                                            c3299hP2.f30799u = h132;
                                            c3299hP2.f30800v = h142;
                                            c3299hP2.f30767B = f3;
                                            c3299hP2.f30795q = Collections.singletonList(copyOf);
                                            interfaceC3543m1.e(new DP(c3299hP2));
                                            this.f32858j = true;
                                        }
                                    } else if (h9 < 7) {
                                        f3 = f32849l[h9];
                                        if (c4233yr.g()) {
                                        }
                                        if (c4233yr.h(2) != 0) {
                                        }
                                        c4233yr.e();
                                        int h1222 = c4233yr.h(16);
                                        c4233yr.e();
                                        if (c4233yr.g()) {
                                        }
                                        c4233yr.e();
                                        int h1322 = c4233yr.h(13);
                                        c4233yr.e();
                                        int h1422 = c4233yr.h(13);
                                        c4233yr.e();
                                        c4233yr.e();
                                        C3299hP c3299hP22 = new C3299hP();
                                        c3299hP22.f30780a = str;
                                        c3299hP22.d("video/mp2t");
                                        c3299hP22.e(com.anythink.basead.exoplayer.k.o.f8454l);
                                        c3299hP22.f30799u = h1322;
                                        c3299hP22.f30800v = h1422;
                                        c3299hP22.f30767B = f3;
                                        c3299hP22.f30795q = Collections.singletonList(copyOf);
                                        interfaceC3543m1.e(new DP(c3299hP22));
                                        this.f32858j = true;
                                    } else {
                                        AbstractC2968bG.y("H263Reader", "Invalid aspect ratio");
                                        f3 = 1.0f;
                                        if (c4233yr.g()) {
                                        }
                                        if (c4233yr.h(2) != 0) {
                                        }
                                        c4233yr.e();
                                        int h12222 = c4233yr.h(16);
                                        c4233yr.e();
                                        if (c4233yr.g()) {
                                        }
                                        c4233yr.e();
                                        int h13222 = c4233yr.h(13);
                                        c4233yr.e();
                                        int h14222 = c4233yr.h(13);
                                        c4233yr.e();
                                        c4233yr.e();
                                        C3299hP c3299hP222 = new C3299hP();
                                        c3299hP222.f30780a = str;
                                        c3299hP222.d("video/mp2t");
                                        c3299hP222.e(com.anythink.basead.exoplayer.k.o.f8454l);
                                        c3299hP222.f30799u = h13222;
                                        c3299hP222.f30800v = h14222;
                                        c3299hP222.f30767B = f3;
                                        c3299hP222.f30795q = Collections.singletonList(copyOf);
                                        interfaceC3543m1.e(new DP(c3299hP222));
                                        this.f32858j = true;
                                    }
                                }
                            } else if ((b9 & 240) != 32) {
                                AbstractC2968bG.y("H263Reader", "Unexpected start code value");
                                c3546m4.f31893a = false;
                                c3546m4.f31895c = 0;
                                c3546m4.f31894b = 0;
                            } else {
                                c3546m4.f31896d = c3546m4.f31895c;
                                c3546m4.f31894b = 4;
                            }
                        } else if (i12 > 31) {
                            AbstractC2968bG.y("H263Reader", "Unexpected start code value");
                            c3546m4.f31893a = false;
                            c3546m4.f31895c = 0;
                            c3546m4.f31894b = 0;
                        } else {
                            c3546m4.f31894b = 3;
                        }
                    } else if (i12 != 181) {
                        AbstractC2968bG.y("H263Reader", "Unexpected start code value");
                        c3546m4.f31893a = false;
                        c3546m4.f31895c = 0;
                        c3546m4.f31894b = 0;
                    } else {
                        c3546m4.f31894b = 2;
                    }
                } else {
                    i = i10;
                    if (i12 == 176) {
                        c3546m4.f31894b = 1;
                        c3546m4.f31893a = true;
                    }
                }
                c9 = 3;
                c3546m4.a(C3546m4.f31892f, 0, 3);
                this.f32855f.a(bArr, i9, Q8);
                if (i13 <= 0) {
                    c4085w4.h(bArr, i9, Q8);
                    i6 = 0;
                } else {
                    i6 = -i13;
                }
                if (c4085w4.i(i6)) {
                    int b10 = SK.b(c4085w4.f34798e, (byte[]) c4085w4.f34799f);
                    String str2 = AbstractC3159eu.f29993a;
                    byte[] bArr2 = (byte[]) c4085w4.f34799f;
                    Cr cr2 = this.f32851b;
                    cr2.z(b10, bArr2);
                    this.f32850a.m(this.f32859k, cr2);
                }
                if (i12 != 178) {
                    z6 = true;
                    if (cr.f24252a[Q8 + 2] == 1) {
                        c4085w4.g(178);
                    }
                    i12 = 178;
                } else {
                    z6 = true;
                }
                int i19 = i - Q8;
                this.f32855f.b(i19, this.f32856g - i19, this.f32858j);
                C3600n4 c3600n4 = this.f32855f;
                long j6 = this.f32859k;
                c3600n4.f32680e = i12;
                c3600n4.f32679d = false;
                if (i12 != 182) {
                    if (i12 == 179) {
                        i12 = 179;
                    } else {
                        z3 = false;
                        c3600n4.f32677b = z3;
                        c3600n4.f32678c = i12 == 182 ? z6 : false;
                        c3600n4.f32681f = 0;
                        c3600n4.f32683h = j6;
                        i9 = i11;
                        i10 = i;
                    }
                }
                z3 = z6;
                c3600n4.f32677b = z3;
                c3600n4.f32678c = i12 == 182 ? z6 : false;
                c3600n4.f32681f = 0;
                c3600n4.f32683h = j6;
                i9 = i11;
                i10 = i;
            }
            c9 = 3;
            this.f32855f.a(bArr, i9, Q8);
            if (i13 <= 0) {
            }
            if (c4085w4.i(i6)) {
            }
            if (i12 != 178) {
            }
            int i192 = i - Q8;
            this.f32855f.b(i192, this.f32856g - i192, this.f32858j);
            C3600n4 c3600n42 = this.f32855f;
            long j62 = this.f32859k;
            c3600n42.f32680e = i12;
            c3600n42.f32679d = false;
            if (i12 != 182) {
            }
            z3 = z6;
            c3600n42.f32677b = z3;
            c3600n42.f32678c = i12 == 182 ? z6 : false;
            c3600n42.f32681f = 0;
            c3600n42.f32683h = j62;
            i9 = i11;
            i10 = i;
        }
        if (!this.f32858j) {
            c3546m4.a(bArr, i9, i10);
        }
        this.f32855f.a(bArr, i9, i10);
        c4085w4.h(bArr, i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void c() {
        SK.S(this.f32852c);
        C3546m4 c3546m4 = this.f32853d;
        c3546m4.f31893a = false;
        c3546m4.f31895c = 0;
        c3546m4.f31894b = 0;
        C3600n4 c3600n4 = this.f32855f;
        if (c3600n4 != null) {
            c3600n4.f32677b = false;
            c3600n4.f32678c = false;
            c3600n4.f32679d = false;
            c3600n4.f32680e = -1;
        }
        this.f32854e.e();
        this.f32856g = 0L;
        this.f32859k = com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void d(int i, long j6) {
        this.f32859k = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void p() {
        C3600n4 c3600n4 = this.f32855f;
        c3600n4.getClass();
        c3600n4.b(0, this.f32856g, this.f32858j);
        C3600n4 c3600n42 = this.f32855f;
        c3600n42.f32677b = false;
        c3600n42.f32678c = false;
        c3600n42.f32679d = false;
        c3600n42.f32680e = -1;
    }
}
