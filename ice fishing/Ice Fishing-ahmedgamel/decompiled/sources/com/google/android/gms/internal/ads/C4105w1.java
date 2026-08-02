package com.google.android.gms.internal.ads;

import com.anythink.expressad.foundation.d.d;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4105w1 implements InterfaceC3782q1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3523lC f35553a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35554b;

    public C4105w1(int i, C3523lC c3523lC) {
        this.f35554b = i;
        this.f35553a = c3523lC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4105w1 a(int i, Cr cr) {
        int i4;
        String str;
        InterfaceC3782q1 c4159x1;
        String str2;
        int i6 = 1;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i9 = cr.f24999c;
        int i10 = -2;
        int i11 = 0;
        while (cr.B() > 8) {
            int c9 = cr.c();
            int c10 = cr.f24998b + cr.c();
            cr.C(c10);
            if (c9 == 1414744396) {
                c4159x1 = a(cr.c(), cr);
            } else {
                C3997u1 c3997u1 = null;
                switch (c9) {
                    case 1718776947:
                        if (i10 != 2) {
                            if (i10 != i6) {
                                i4 = i6;
                                String str3 = AbstractC3182eu.f30782a;
                                switch (i10) {
                                    case -2:
                                        str = "none";
                                        break;
                                    case -1:
                                        str = com.anythink.core.common.v.m.f17596e;
                                        break;
                                    case 0:
                                        str = com.anythink.core.express.b.a.f18317f;
                                        break;
                                    case 1:
                                        str = com.anythink.basead.exoplayer.k.o.f9231b;
                                        break;
                                    case 2:
                                        str = com.anythink.basead.exoplayer.k.o.f9230a;
                                        break;
                                    case 3:
                                        str = com.anythink.basead.exoplayer.k.o.f9232c;
                                        break;
                                    case 4:
                                        str = d.c.f19422e;
                                        break;
                                    case 5:
                                        str = "metadata";
                                        break;
                                    default:
                                        str = "camera motion";
                                        break;
                                }
                                AbstractC2991bG.y("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(str));
                                c4159x1 = c3997u1;
                                break;
                            } else {
                                int M8 = cr.M();
                                String str4 = M8 != i6 ? M8 != 85 ? M8 != 255 ? M8 != 8192 ? M8 != 8193 ? null : com.anythink.basead.exoplayer.k.o.f9209D : com.anythink.basead.exoplayer.k.o.f9254z : com.anythink.basead.exoplayer.k.o.f9246r : com.anythink.basead.exoplayer.k.o.f9248t : com.anythink.basead.exoplayer.k.o.f9251w;
                                if (str4 != null) {
                                    int M9 = cr.M();
                                    int c11 = cr.c();
                                    cr.G(6);
                                    int b9 = AbstractC3182eu.b(cr.M(), ByteOrder.LITTLE_ENDIAN);
                                    int M10 = cr.B() > 0 ? cr.M() : 0;
                                    i4 = i6;
                                    C3322hP c3322hP = new C3322hP();
                                    c3322hP.e(str4);
                                    c3322hP.f31538G = M9;
                                    c3322hP.f31540I = c11;
                                    if (str4.equals(com.anythink.basead.exoplayer.k.o.f9251w) && b9 != 0) {
                                        c3322hP.J = b9;
                                    }
                                    if (str4.equals(com.anythink.basead.exoplayer.k.o.f9246r) && M10 > 0) {
                                        byte[] bArr = new byte[M10];
                                        cr.H(bArr, 0, M10);
                                        c3322hP.f31561q = RB.j(bArr);
                                    }
                                    c4159x1 = new C4159x1(new DP(c3322hP));
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.t(M8, "Ignoring track with unsupported format tag ", "StreamFormatChunk", new StringBuilder(String.valueOf(M8).length() + 43));
                                }
                            }
                        } else {
                            cr.G(4);
                            int c12 = cr.c();
                            int c13 = cr.c();
                            cr.G(4);
                            int c14 = cr.c();
                            switch (c14) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = com.anythink.basead.exoplayer.k.o.f9240l;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = com.anythink.basead.exoplayer.k.o.f9237h;
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                C3322hP c3322hP2 = new C3322hP();
                                c3322hP2.f31565u = c12;
                                c3322hP2.f31566v = c13;
                                c3322hP2.e(str2);
                                c4159x1 = new C4159x1(new DP(c3322hP2));
                                break;
                            } else {
                                com.IceFishing.LiveIceFishing.k.t(c14, "Ignoring track with unsupported compression ", "StreamFormatChunk", new StringBuilder(String.valueOf(c14).length() + 44));
                            }
                        }
                        i4 = i6;
                        c4159x1 = c3997u1;
                    case 1751742049:
                        int c15 = cr.c();
                        cr.G(8);
                        int c16 = cr.c();
                        int c17 = cr.c();
                        cr.G(4);
                        cr.c();
                        cr.G(12);
                        i4 = i6;
                        c4159x1 = new C3943t1(c15, c16, c17);
                        break;
                    case 1752331379:
                        int c18 = cr.c();
                        cr.G(12);
                        cr.c();
                        int c19 = cr.c();
                        int c20 = cr.c();
                        cr.G(4);
                        int c21 = cr.c();
                        int c22 = cr.c();
                        cr.G(4);
                        c3997u1 = new C3997u1(c18, c19, c20, c21, c22, cr.c());
                        i4 = i6;
                        c4159x1 = c3997u1;
                        break;
                    case 1852994675:
                        c4159x1 = new C4213y1(cr.k(cr.B(), StandardCharsets.UTF_8));
                        break;
                    default:
                        i4 = i6;
                        c4159x1 = c3997u1;
                        break;
                }
                if (c4159x1 != null) {
                    if (c4159x1.c() == 1752331379) {
                        i10 = ((C3997u1) c4159x1).a();
                    }
                    int length = objArr.length;
                    int i12 = i11 + 1;
                    int d9 = MB.d(length, i12);
                    if (d9 > length) {
                        objArr = Arrays.copyOf(objArr, d9);
                    }
                    objArr[i11] = c4159x1;
                    i11 = i12;
                }
                cr.E(c10);
                cr.C(i9);
                i6 = i4;
            }
            i4 = i6;
            if (c4159x1 != null) {
            }
            cr.E(c10);
            cr.C(i9);
            i6 = i4;
        }
        return new C4105w1(i, RB.p(objArr, i11));
    }

    public final InterfaceC3782q1 b(Class cls) {
        C3523lC c3523lC = this.f35553a;
        int i = c3523lC.f32527w;
        int i4 = 0;
        while (i4 < i) {
            InterfaceC3782q1 interfaceC3782q1 = (InterfaceC3782q1) c3523lC.get(i4);
            i4++;
            if (interfaceC3782q1.getClass() == cls) {
                return interfaceC3782q1;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3782q1
    public final int c() {
        return this.f35554b;
    }
}
