package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.m4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3559m4 implements InterfaceC3291h4 {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f32656l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final C3602mu f32657a;

    /* renamed from: b, reason: collision with root package name */
    public final Lr f32658b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f32659c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final C3451k4 f32660d;

    /* renamed from: e, reason: collision with root package name */
    public final C3990u4 f32661e;

    /* renamed from: f, reason: collision with root package name */
    public C3505l4 f32662f;

    /* renamed from: g, reason: collision with root package name */
    public long f32663g;

    /* renamed from: h, reason: collision with root package name */
    public String f32664h;
    public InterfaceC3448k1 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32665j;

    /* renamed from: k, reason: collision with root package name */
    public long f32666k;

    public C3559m4(C3602mu c3602mu) {
        this.f32657a = c3602mu;
        C3451k4 c3451k4 = new C3451k4();
        c3451k4.f32253e = new byte[128];
        this.f32660d = c3451k4;
        this.f32666k = com.anythink.basead.exoplayer.b.f6539b;
        this.f32661e = new C3990u4(178);
        this.f32658b = new Lr();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void a() {
        PA.V(this.f32659c);
        C3451k4 c3451k4 = this.f32660d;
        c3451k4.f32249a = false;
        c3451k4.f32251c = 0;
        c3451k4.f32250b = 0;
        C3505l4 c3505l4 = this.f32662f;
        if (c3505l4 != null) {
            c3505l4.f32531b = false;
            c3505l4.f32532c = false;
            c3505l4.f32533d = false;
            c3505l4.f32534e = -1;
        }
        this.f32661e.e();
        this.f32663g = 0L;
        this.f32666k = com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void b(boolean z8) {
        C3505l4 c3505l4 = this.f32662f;
        c3505l4.getClass();
        if (z8) {
            c3505l4.b(0, this.f32663g, this.f32665j);
            C3505l4 c3505l42 = this.f32662f;
            c3505l42.f32531b = false;
            c3505l42.f32532c = false;
            c3505l42.f32533d = false;
            c3505l42.f32534e = -1;
        }
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
    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Lr lr) {
        C3451k4 c3451k4;
        C3990u4 c3990u4;
        int i;
        char c4;
        int i4;
        boolean z8;
        float f6;
        boolean z9 = true;
        this.f32662f.getClass();
        this.i.getClass();
        int i9 = lr.f26234b;
        int i10 = lr.f26235c;
        byte[] bArr = lr.f26233a;
        this.f32663g += lr.B();
        this.i.a(lr.B(), lr);
        while (true) {
            int R8 = PA.R(bArr, i9, i10, this.f32659c);
            c3451k4 = this.f32660d;
            c3990u4 = this.f32661e;
            if (R8 == i10) {
                break;
            }
            int i11 = R8 + 3;
            byte b9 = lr.f26233a[i11];
            int i12 = b9 & 255;
            int i13 = R8 - i9;
            if (this.f32665j) {
                i = i10;
            } else {
                if (i13 > 0) {
                    c3451k4.a(bArr, i9, R8);
                }
                int i14 = i13 < 0 ? -i13 : 0;
                int i15 = c3451k4.f32250b;
                if (i15 != 0) {
                    i = i10;
                    if (i15 != z9) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i12 == 179 || i12 == 181) {
                                    c3451k4.f32251c -= i14;
                                    c3451k4.f32249a = false;
                                    InterfaceC3448k1 interfaceC3448k1 = this.i;
                                    int i16 = c3451k4.f32252d;
                                    String str = this.f32664h;
                                    str.getClass();
                                    byte[] copyOf = Arrays.copyOf(c3451k4.f32253e, c3451k4.f32251c);
                                    Er er = new Er(copyOf, copyOf.length);
                                    er.l(i16);
                                    er.l(4);
                                    er.e();
                                    er.f(8);
                                    if (er.g()) {
                                        er.f(4);
                                        er.f(3);
                                    }
                                    int h9 = er.h(4);
                                    if (h9 == 15) {
                                        int h10 = er.h(8);
                                        int h11 = er.h(8);
                                        if (h11 == 0) {
                                            AbstractC3217fl.I("H263Reader", "Invalid aspect ratio");
                                            f6 = 1.0f;
                                            if (er.g()) {
                                                er.f(2);
                                                er.f(1);
                                                if (er.g()) {
                                                    er.f(15);
                                                    er.e();
                                                    er.f(15);
                                                    er.e();
                                                    er.f(15);
                                                    er.e();
                                                    er.f(3);
                                                    er.f(11);
                                                    er.e();
                                                    er.f(15);
                                                    er.e();
                                                }
                                            }
                                            if (er.h(2) != 0) {
                                                AbstractC3217fl.I("H263Reader", "Unhandled video object layer shape");
                                            }
                                            er.e();
                                            int h12 = er.h(16);
                                            er.e();
                                            if (er.g()) {
                                                if (h12 == 0) {
                                                    AbstractC3217fl.I("H263Reader", "Invalid vop_increment_time_resolution");
                                                } else {
                                                    int i17 = h12 - 1;
                                                    int i18 = 0;
                                                    while (i17 > 0) {
                                                        i17 >>= 1;
                                                        i18++;
                                                    }
                                                    er.f(i18);
                                                }
                                            }
                                            er.e();
                                            int h13 = er.h(13);
                                            er.e();
                                            int h14 = er.h(13);
                                            er.e();
                                            er.e();
                                            C4065vP c4065vP = new C4065vP();
                                            c4065vP.f34773a = str;
                                            c4065vP.d("video/mp2t");
                                            c4065vP.e(com.anythink.basead.exoplayer.k.o.f8611l);
                                            c4065vP.f34792u = h13;
                                            c4065vP.f34793v = h14;
                                            c4065vP.f34760A = f6;
                                            c4065vP.f34788q = Collections.singletonList(copyOf);
                                            interfaceC3448k1.e(new TP(c4065vP));
                                            this.f32665j = true;
                                        } else {
                                            f6 = h10 / h11;
                                            if (er.g()) {
                                            }
                                            if (er.h(2) != 0) {
                                            }
                                            er.e();
                                            int h122 = er.h(16);
                                            er.e();
                                            if (er.g()) {
                                            }
                                            er.e();
                                            int h132 = er.h(13);
                                            er.e();
                                            int h142 = er.h(13);
                                            er.e();
                                            er.e();
                                            C4065vP c4065vP2 = new C4065vP();
                                            c4065vP2.f34773a = str;
                                            c4065vP2.d("video/mp2t");
                                            c4065vP2.e(com.anythink.basead.exoplayer.k.o.f8611l);
                                            c4065vP2.f34792u = h132;
                                            c4065vP2.f34793v = h142;
                                            c4065vP2.f34760A = f6;
                                            c4065vP2.f34788q = Collections.singletonList(copyOf);
                                            interfaceC3448k1.e(new TP(c4065vP2));
                                            this.f32665j = true;
                                        }
                                    } else if (h9 < 7) {
                                        f6 = f32656l[h9];
                                        if (er.g()) {
                                        }
                                        if (er.h(2) != 0) {
                                        }
                                        er.e();
                                        int h1222 = er.h(16);
                                        er.e();
                                        if (er.g()) {
                                        }
                                        er.e();
                                        int h1322 = er.h(13);
                                        er.e();
                                        int h1422 = er.h(13);
                                        er.e();
                                        er.e();
                                        C4065vP c4065vP22 = new C4065vP();
                                        c4065vP22.f34773a = str;
                                        c4065vP22.d("video/mp2t");
                                        c4065vP22.e(com.anythink.basead.exoplayer.k.o.f8611l);
                                        c4065vP22.f34792u = h1322;
                                        c4065vP22.f34793v = h1422;
                                        c4065vP22.f34760A = f6;
                                        c4065vP22.f34788q = Collections.singletonList(copyOf);
                                        interfaceC3448k1.e(new TP(c4065vP22));
                                        this.f32665j = true;
                                    } else {
                                        AbstractC3217fl.I("H263Reader", "Invalid aspect ratio");
                                        f6 = 1.0f;
                                        if (er.g()) {
                                        }
                                        if (er.h(2) != 0) {
                                        }
                                        er.e();
                                        int h12222 = er.h(16);
                                        er.e();
                                        if (er.g()) {
                                        }
                                        er.e();
                                        int h13222 = er.h(13);
                                        er.e();
                                        int h14222 = er.h(13);
                                        er.e();
                                        er.e();
                                        C4065vP c4065vP222 = new C4065vP();
                                        c4065vP222.f34773a = str;
                                        c4065vP222.d("video/mp2t");
                                        c4065vP222.e(com.anythink.basead.exoplayer.k.o.f8611l);
                                        c4065vP222.f34792u = h13222;
                                        c4065vP222.f34793v = h14222;
                                        c4065vP222.f34760A = f6;
                                        c4065vP222.f34788q = Collections.singletonList(copyOf);
                                        interfaceC3448k1.e(new TP(c4065vP222));
                                        this.f32665j = true;
                                    }
                                }
                            } else if ((b9 & 240) != 32) {
                                AbstractC3217fl.I("H263Reader", "Unexpected start code value");
                                c3451k4.f32249a = false;
                                c3451k4.f32251c = 0;
                                c3451k4.f32250b = 0;
                            } else {
                                c3451k4.f32252d = c3451k4.f32251c;
                                c3451k4.f32250b = 4;
                            }
                        } else if (i12 > 31) {
                            AbstractC3217fl.I("H263Reader", "Unexpected start code value");
                            c3451k4.f32249a = false;
                            c3451k4.f32251c = 0;
                            c3451k4.f32250b = 0;
                        } else {
                            c3451k4.f32250b = 3;
                        }
                    } else if (i12 != 181) {
                        AbstractC3217fl.I("H263Reader", "Unexpected start code value");
                        c3451k4.f32249a = false;
                        c3451k4.f32251c = 0;
                        c3451k4.f32250b = 0;
                    } else {
                        c3451k4.f32250b = 2;
                    }
                } else {
                    i = i10;
                    if (i12 == 176) {
                        c3451k4.f32250b = 1;
                        c3451k4.f32249a = true;
                    }
                }
                c4 = 3;
                c3451k4.a(C3451k4.f32248f, 0, 3);
                this.f32662f.a(bArr, i9, R8);
                if (i13 <= 0) {
                    c3990u4.h(bArr, i9, R8);
                    i4 = 0;
                } else {
                    i4 = -i13;
                }
                if (c3990u4.i(i4)) {
                    int f9 = PA.f(c3990u4.f34532e, (byte[]) c3990u4.f34533f);
                    String str2 = AbstractC3548lu.f32613a;
                    byte[] bArr2 = (byte[]) c3990u4.f34533f;
                    Lr lr2 = this.f32658b;
                    lr2.z(f9, bArr2);
                    this.f32657a.s(this.f32666k, lr2);
                }
                if (i12 != 178) {
                    z9 = true;
                    if (lr.f26233a[R8 + 2] == 1) {
                        c3990u4.g(178);
                    }
                    i12 = 178;
                } else {
                    z9 = true;
                }
                int i19 = i - R8;
                this.f32662f.b(i19, this.f32663g - i19, this.f32665j);
                C3505l4 c3505l4 = this.f32662f;
                long j9 = this.f32666k;
                c3505l4.f32534e = i12;
                c3505l4.f32533d = false;
                if (i12 != 182) {
                    if (i12 == 179) {
                        i12 = 179;
                    } else {
                        z8 = false;
                        c3505l4.f32531b = z8;
                        c3505l4.f32532c = i12 == 182 ? z9 : false;
                        c3505l4.f32535f = 0;
                        c3505l4.f32537h = j9;
                        i9 = i11;
                        i10 = i;
                    }
                }
                z8 = z9;
                c3505l4.f32531b = z8;
                c3505l4.f32532c = i12 == 182 ? z9 : false;
                c3505l4.f32535f = 0;
                c3505l4.f32537h = j9;
                i9 = i11;
                i10 = i;
            }
            c4 = 3;
            this.f32662f.a(bArr, i9, R8);
            if (i13 <= 0) {
            }
            if (c3990u4.i(i4)) {
            }
            if (i12 != 178) {
            }
            int i192 = i - R8;
            this.f32662f.b(i192, this.f32663g - i192, this.f32665j);
            C3505l4 c3505l42 = this.f32662f;
            long j92 = this.f32666k;
            c3505l42.f32534e = i12;
            c3505l42.f32533d = false;
            if (i12 != 182) {
            }
            z8 = z9;
            c3505l42.f32531b = z8;
            c3505l42.f32532c = i12 == 182 ? z9 : false;
            c3505l42.f32535f = 0;
            c3505l42.f32537h = j92;
            i9 = i11;
            i10 = i;
        }
        if (!this.f32665j) {
            c3451k4.a(bArr, i9, i10);
        }
        this.f32662f.a(bArr, i9, i10);
        c3990u4.h(bArr, i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void d(int i, long j9) {
        this.f32666k = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void e(Q0 q02, D4 d42) {
        d42.a();
        d42.b();
        this.f32664h = d42.f24338e;
        d42.b();
        InterfaceC3448k1 x3 = q02.x(d42.f24337d, 2);
        this.i = x3;
        this.f32662f = new C3505l4(x3);
        this.f32657a.i(q02, d42);
    }
}
