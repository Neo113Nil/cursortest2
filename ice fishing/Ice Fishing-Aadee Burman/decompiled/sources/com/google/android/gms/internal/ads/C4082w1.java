package com.google.android.gms.internal.ads;

import com.anythink.expressad.foundation.d.d;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4082w1 implements InterfaceC3759q1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3500lC f34784a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34785b;

    public C4082w1(int i, C3500lC c3500lC) {
        this.f34785b = i;
        this.f34784a = c3500lC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4082w1 a(int i, Cr cr) {
        int i6;
        String str;
        InterfaceC3759q1 c4136x1;
        String str2;
        int i9 = 1;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = cr.f24254c;
        int i11 = -2;
        int i12 = 0;
        while (cr.B() > 8) {
            int c9 = cr.c();
            int c10 = cr.f24253b + cr.c();
            cr.C(c10);
            if (c9 == 1414744396) {
                c4136x1 = a(cr.c(), cr);
            } else {
                C3974u1 c3974u1 = null;
                switch (c9) {
                    case 1718776947:
                        if (i11 != 2) {
                            if (i11 != i9) {
                                i6 = i9;
                                String str3 = AbstractC3159eu.f29993a;
                                switch (i11) {
                                    case -2:
                                        str = "none";
                                        break;
                                    case -1:
                                        str = com.anythink.core.common.v.m.f16809e;
                                        break;
                                    case 0:
                                        str = com.anythink.core.express.b.a.f17530f;
                                        break;
                                    case 1:
                                        str = com.anythink.basead.exoplayer.k.o.f8445b;
                                        break;
                                    case 2:
                                        str = com.anythink.basead.exoplayer.k.o.f8444a;
                                        break;
                                    case 3:
                                        str = com.anythink.basead.exoplayer.k.o.f8446c;
                                        break;
                                    case 4:
                                        str = d.c.f18635e;
                                        break;
                                    case 5:
                                        str = "metadata";
                                        break;
                                    default:
                                        str = "camera motion";
                                        break;
                                }
                                AbstractC2968bG.y("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(str));
                                c4136x1 = c3974u1;
                                break;
                            } else {
                                int M8 = cr.M();
                                String str4 = M8 != i9 ? M8 != 85 ? M8 != 255 ? M8 != 8192 ? M8 != 8193 ? null : com.anythink.basead.exoplayer.k.o.f8423D : com.anythink.basead.exoplayer.k.o.f8468z : com.anythink.basead.exoplayer.k.o.f8460r : com.anythink.basead.exoplayer.k.o.f8462t : com.anythink.basead.exoplayer.k.o.f8465w;
                                if (str4 != null) {
                                    int M9 = cr.M();
                                    int c11 = cr.c();
                                    cr.G(6);
                                    int b9 = AbstractC3159eu.b(cr.M(), ByteOrder.LITTLE_ENDIAN);
                                    int M10 = cr.B() > 0 ? cr.M() : 0;
                                    i6 = i9;
                                    C3299hP c3299hP = new C3299hP();
                                    c3299hP.e(str4);
                                    c3299hP.f30772G = M9;
                                    c3299hP.f30774I = c11;
                                    if (str4.equals(com.anythink.basead.exoplayer.k.o.f8465w) && b9 != 0) {
                                        c3299hP.J = b9;
                                    }
                                    if (str4.equals(com.anythink.basead.exoplayer.k.o.f8460r) && M10 > 0) {
                                        byte[] bArr = new byte[M10];
                                        cr.H(bArr, 0, M10);
                                        c3299hP.f30795q = RB.j(bArr);
                                    }
                                    c4136x1 = new C4136x1(new DP(c3299hP));
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.q(M8, "Ignoring track with unsupported format tag ", "StreamFormatChunk", new StringBuilder(String.valueOf(M8).length() + 43));
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
                                    str2 = com.anythink.basead.exoplayer.k.o.f8454l;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = com.anythink.basead.exoplayer.k.o.f8451h;
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
                                C3299hP c3299hP2 = new C3299hP();
                                c3299hP2.f30799u = c12;
                                c3299hP2.f30800v = c13;
                                c3299hP2.e(str2);
                                c4136x1 = new C4136x1(new DP(c3299hP2));
                                break;
                            } else {
                                com.anythink.basead.exoplayer.f.f.q(c14, "Ignoring track with unsupported compression ", "StreamFormatChunk", new StringBuilder(String.valueOf(c14).length() + 44));
                            }
                        }
                        i6 = i9;
                        c4136x1 = c3974u1;
                    case 1751742049:
                        int c15 = cr.c();
                        cr.G(8);
                        int c16 = cr.c();
                        int c17 = cr.c();
                        cr.G(4);
                        cr.c();
                        cr.G(12);
                        i6 = i9;
                        c4136x1 = new C3920t1(c15, c16, c17);
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
                        c3974u1 = new C3974u1(c18, c19, c20, c21, c22, cr.c());
                        i6 = i9;
                        c4136x1 = c3974u1;
                        break;
                    case 1852994675:
                        c4136x1 = new C4190y1(cr.k(cr.B(), StandardCharsets.UTF_8));
                        break;
                    default:
                        i6 = i9;
                        c4136x1 = c3974u1;
                        break;
                }
                if (c4136x1 != null) {
                    if (c4136x1.c() == 1752331379) {
                        i11 = ((C3974u1) c4136x1).a();
                    }
                    int length = objArr.length;
                    int i13 = i12 + 1;
                    int d2 = MB.d(length, i13);
                    if (d2 > length) {
                        objArr = Arrays.copyOf(objArr, d2);
                    }
                    objArr[i12] = c4136x1;
                    i12 = i13;
                }
                cr.E(c10);
                cr.C(i10);
                i9 = i6;
            }
            i6 = i9;
            if (c4136x1 != null) {
            }
            cr.E(c10);
            cr.C(i10);
            i9 = i6;
        }
        return new C4082w1(i, RB.p(objArr, i12));
    }

    public final InterfaceC3759q1 b(Class cls) {
        C3500lC c3500lC = this.f34784a;
        int i = c3500lC.f31747w;
        int i6 = 0;
        while (i6 < i) {
            InterfaceC3759q1 interfaceC3759q1 = (InterfaceC3759q1) c3500lC.get(i6);
            i6++;
            if (interfaceC3759q1.getClass() == cls) {
                return interfaceC3759q1;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3759q1
    public final int c() {
        return this.f34785b;
    }
}
