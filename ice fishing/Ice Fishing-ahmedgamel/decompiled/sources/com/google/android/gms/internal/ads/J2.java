package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public abstract class J2 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f26400a;

    static {
        String str = AbstractC3182eu.f30782a;
        f26400a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int a(int i) {
        return (i >> 24) & com.anythink.basead.exoplayer.k.p.f9259b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x012c, code lost:
    
        if (r43 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012e, code lost:
    
        r43 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x10d0  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x10d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x125e  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x1267  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0344  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList b(Iw iw, Z0 z02, long j6, EO eo, boolean z6, boolean z9, UA ua) {
        long j9;
        long j10;
        int i;
        int i4;
        int i6;
        int i9;
        boolean z10;
        int i10;
        long j11;
        long j12;
        long w3;
        int a9;
        int i11;
        int i12;
        int i13;
        int i14;
        long j13;
        long j14;
        long j15;
        int i15;
        int i16;
        String str;
        Zw i17;
        int i18;
        String str2;
        ArrayList arrayList;
        int i19;
        int i20;
        int i21;
        SC sc;
        SC sc2;
        DP dp;
        String str3;
        Z2 z22;
        UA ua2;
        Iw j16;
        Pair h3;
        Zw i22;
        short s9;
        short s10;
        int i23;
        ArrayList arrayList2;
        Iw iw2;
        long j17;
        long j18;
        Cr cr;
        int i24;
        byte b9;
        String str4;
        EO eo2;
        int i25;
        String str5;
        String str6;
        int i26;
        int i27;
        String str7;
        char c9;
        String str8;
        String str9;
        int i28;
        int i29;
        boolean z11;
        String str10;
        int i30;
        int i31;
        boolean z12;
        String str11;
        String str12;
        int i32;
        char c10;
        int i33;
        int i34;
        J3.q qVar;
        C2590Gf c2590Gf;
        int i35;
        String str13;
        boolean z13;
        int i36;
        int i37;
        Qx qx;
        int i38;
        boolean z14;
        String str14;
        int i39;
        boolean z15;
        boolean z16;
        boolean z17;
        EO eo3;
        int i40;
        J3.q qVar2;
        int i41;
        int i42;
        String str15;
        int i43;
        int i44;
        int i45;
        Cr cr2;
        char c11;
        String str16;
        long j19;
        C3523lC c3523lC;
        boolean z18;
        boolean z19;
        ArrayList arrayList3;
        Iw iw3 = iw;
        String str17 = "text/x-unknown";
        String str18 = com.anythink.basead.exoplayer.k.o.f9229Z;
        byte b10 = -1;
        int i46 = 10;
        int i47 = 16;
        int i48 = 4;
        int i49 = 8;
        ArrayList arrayList4 = new ArrayList();
        int i50 = 0;
        while (true) {
            ArrayList arrayList5 = iw3.f26374e;
            if (i50 >= arrayList5.size()) {
                return arrayList4;
            }
            Iw iw4 = (Iw) arrayList5.get(i50);
            if (iw4.f31925b != 1953653099) {
                arrayList3 = arrayList4;
                i18 = i50;
                i = i46;
                str3 = str17;
                str2 = str18;
                i19 = i49;
                i20 = i48;
            } else {
                Zw i51 = iw3.i(1836476516);
                i51.getClass();
                Iw j20 = iw4.j(1835297121);
                j20.getClass();
                Zw i52 = j20.i(1751411826);
                i52.getClass();
                Cr cr3 = i52.f29750c;
                cr3.E(i47);
                int b11 = cr3.b();
                byte b12 = b11 == 1936684398 ? (byte) 1 : b11 == 1986618469 ? (byte) 2 : (b11 == 1952807028 || b11 == 1935832172 || b11 == 1937072756 || b11 == 1668047728 || b11 == 1937072752) ? (byte) 3 : b11 == 1835365473 ? (byte) 5 : b10;
                if (b12 == b10) {
                    ua2 = ua;
                    arrayList = arrayList4;
                    i18 = i50;
                    i = i46;
                    str3 = str17;
                    str2 = str18;
                    i19 = i49;
                    z22 = null;
                    i20 = i48;
                } else {
                    Zw i53 = iw4.i(1953196132);
                    i53.getClass();
                    Cr cr4 = i53.f29750c;
                    cr4.E(i49);
                    int a10 = a(cr4.b());
                    if (a10 != 0) {
                        i49 = 16;
                    }
                    cr4.G(i49);
                    int b13 = cr4.b();
                    cr4.G(i48);
                    int i54 = cr4.f24998b;
                    int i55 = 0;
                    while (true) {
                        if (a10 != 0) {
                            i48 = 8;
                        }
                        j9 = com.anythink.basead.exoplayer.b.f7168b;
                        if (i55 >= i48) {
                            cr4.G(i48);
                            break;
                        }
                        if (cr4.f24997a[i54 + i55] != b10) {
                            j10 = a10 == 0 ? cr4.P() : cr4.j();
                        } else {
                            i55++;
                            i48 = 4;
                        }
                    }
                    cr4.G(i46);
                    int L2 = cr4.L();
                    cr4.G(4);
                    int b14 = cr4.b();
                    i = i46;
                    int b15 = cr4.b();
                    cr4.G(4);
                    int b16 = cr4.b();
                    int b17 = cr4.b();
                    int i56 = com.anythink.basead.exoplayer.b.aX;
                    ArrayList arrayList6 = arrayList4;
                    if (b14 == 0) {
                        if (b15 == 65536) {
                            if (b16 != -65536) {
                                if (b16 == 65536) {
                                    z18 = b17 != 0;
                                    z19 = true;
                                    b16 = 65536;
                                }
                                b15 = 65536;
                            } else if (b17 == 0) {
                                z18 = false;
                                z19 = true;
                            } else {
                                z18 = true;
                                z19 = true;
                            }
                            if (z19 != z18) {
                                i9 = 90;
                                b14 = 0;
                                cr4.G(16);
                                short N8 = cr4.N();
                                int i57 = i9;
                                cr4.G(2);
                                short N9 = cr4.N();
                                Iw iw5 = iw4;
                                int i58 = i50;
                                boolean z20 = (((long) b17) * ((long) b14)) - (((long) i56) * ((long) b16)) >= 0;
                                j11 = j6 != com.anythink.basead.exoplayer.b.f7168b ? j10 : j6;
                                long j21 = d(i51.f29750c).f26158c;
                                if (j11 != com.anythink.basead.exoplayer.b.f7168b) {
                                    j12 = j21;
                                    w3 = -9223372036854775807L;
                                } else {
                                    j12 = j21;
                                    w3 = AbstractC3182eu.w(j11, 1000000L, j12, RoundingMode.DOWN);
                                }
                                Iw j22 = j20.j(1835626086);
                                j22.getClass();
                                Iw j23 = j22.j(1937007212);
                                j23.getClass();
                                Zw i59 = j20.i(1835296868);
                                i59.getClass();
                                Cr cr5 = i59.f29750c;
                                cr5.E(8);
                                a9 = a(cr5.b());
                                cr5.G(a9 != 0 ? 8 : 16);
                                long P8 = cr5.P();
                                i11 = cr5.f24998b;
                                i12 = 0;
                                while (true) {
                                    if (a9 != 0) {
                                        i13 = i11;
                                        i14 = 4;
                                    } else {
                                        i13 = i11;
                                        i14 = 8;
                                    }
                                    if (i12 < i14) {
                                        j13 = w3;
                                        j14 = P8;
                                        cr5.G(i14);
                                        break;
                                    }
                                    j13 = w3;
                                    if (cr5.f24997a[i13 + i12] != -1) {
                                        long P9 = a9 == 0 ? cr5.P() : cr5.j();
                                        if (P9 == 0) {
                                            j15 = -9223372036854775807L;
                                            j14 = P8;
                                        } else {
                                            j9 = AbstractC3182eu.w(P9, 1000000L, P8, RoundingMode.DOWN);
                                            j14 = P8;
                                        }
                                    } else {
                                        i12++;
                                        i11 = i13;
                                        w3 = j13;
                                    }
                                }
                                j15 = j9;
                                int L6 = cr5.L();
                                char[] cArr = {(char) (((L6 >> 10) & 31) + 96), (char) (((L6 >> 5) & 31) + 96), (char) ((L6 & 31) + 96)};
                                i16 = 0;
                                for (i15 = 3; i16 < i15; i15 = 3) {
                                    char c12 = cArr[i16];
                                    if (c12 < 'a' || c12 > 'z') {
                                        str = null;
                                        break;
                                    }
                                    i16++;
                                }
                                str = new String(cArr);
                                i17 = j23.i(1937011556);
                                String str19 = "BoxParsers";
                                if (i17 != null) {
                                    AbstractC2991bG.y("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                                    ua2 = ua;
                                    i18 = i58;
                                    str3 = str17;
                                    str2 = str18;
                                    arrayList = arrayList6;
                                    iw4 = iw5;
                                    i19 = 8;
                                    z22 = null;
                                    i20 = 4;
                                } else {
                                    Cr cr6 = i17.f29750c;
                                    char c13 = '\f';
                                    cr6.E(12);
                                    int b18 = cr6.b();
                                    J3.q qVar3 = new J3.q();
                                    qVar3.f1504c = new C2924a3[b18];
                                    qVar3.f1503b = 0;
                                    int i60 = 0;
                                    while (i60 < b18) {
                                        int i61 = i60;
                                        int i62 = cr6.f24998b;
                                        String str20 = str19;
                                        int b19 = cr6.b();
                                        int i63 = i62;
                                        String str21 = "childAtomSize must be positive";
                                        MA.k("childAtomSize must be positive", b19 > 0);
                                        int b20 = cr6.b();
                                        int i64 = i58;
                                        if (b20 == 1635148593 || b20 == 1635148595 || b20 == 1701733238 || b20 == 1831958048 || b20 == 1836070006 || b20 == 1752589105 || b20 == 1751479857 || b20 == 1987470129 || b20 == 1987471665 || b20 == 1932670515 || b20 == 1211250227 || b20 == 1748121139 || b20 == 1987063864 || b20 == 1987063865 || b20 == 1635135537 || b20 == 1685479798 || b20 == 1685479729 || b20 == 1685481573 || b20 == 1685481521 || b20 == 1634760241 || b20 == 1684108849) {
                                            s9 = N9;
                                            s10 = N8;
                                            i23 = b18;
                                            J3.q qVar4 = qVar3;
                                            int i65 = b13;
                                            String str22 = str20;
                                            int i66 = b19;
                                            arrayList2 = arrayList6;
                                            int i67 = i57;
                                            iw2 = iw5;
                                            j17 = j13;
                                            j18 = j12;
                                            cr = cr6;
                                            cr.E(i63 + 16);
                                            cr.G(16);
                                            int L8 = cr.L();
                                            int L9 = cr.L();
                                            i24 = i61;
                                            cr.G(50);
                                            int i68 = cr.f24998b;
                                            b9 = b12;
                                            str4 = str18;
                                            int i69 = 1701733238;
                                            if (b20 == 1701733238) {
                                                Pair k9 = k(cr, i63, i66);
                                                if (k9 != null) {
                                                    i69 = ((Integer) k9.first).intValue();
                                                    if (eo == null) {
                                                        i63 = i63;
                                                        eo2 = null;
                                                    } else {
                                                        i63 = i63;
                                                        eo2 = eo.a(((C2924a3) k9.second).f29781b);
                                                    }
                                                    ((C2924a3[]) qVar4.f1504c)[i24] = (C2924a3) k9.second;
                                                } else {
                                                    i63 = i63;
                                                    eo2 = eo;
                                                }
                                                cr.E(i68);
                                            } else {
                                                i63 = i63;
                                                eo2 = eo;
                                                i69 = b20;
                                            }
                                            if (i69 == 1831958048) {
                                                int i70 = i69;
                                                str5 = com.anythink.basead.exoplayer.k.o.f9241m;
                                                i25 = i70;
                                            } else {
                                                i25 = 1211250227;
                                                if (i69 == 1211250227) {
                                                    str5 = com.anythink.basead.exoplayer.k.o.f9236g;
                                                } else {
                                                    i25 = i69;
                                                    str5 = null;
                                                }
                                            }
                                            boolean z21 = z20;
                                            EO eo4 = eo2;
                                            String str23 = str;
                                            str6 = str17;
                                            i26 = L2;
                                            String str24 = str5;
                                            float f2 = 1.0f;
                                            List list = null;
                                            int i71 = -1;
                                            int i72 = -1;
                                            int i73 = 8;
                                            C2590Gf c2590Gf2 = null;
                                            int i74 = -1;
                                            int i75 = -1;
                                            int i76 = 8;
                                            boolean z23 = false;
                                            int i77 = -1;
                                            ByteBuffer byteBuffer = null;
                                            int i78 = -1;
                                            String str25 = null;
                                            int i79 = -1;
                                            int i80 = -1;
                                            C3902sE c3902sE = null;
                                            byte[] bArr = null;
                                            C3403j0 c3403j0 = null;
                                            G2 g22 = null;
                                            while (i68 - i63 < i66) {
                                                cr.E(i68);
                                                int i81 = cr.f24998b;
                                                int b21 = cr.b();
                                                int i82 = i68;
                                                if (b21 != 0) {
                                                    i30 = b21;
                                                } else {
                                                    if (cr.f24998b - i63 == i66) {
                                                        break;
                                                    }
                                                    i30 = 0;
                                                }
                                                if (i30 > 0) {
                                                    i31 = i66;
                                                    z12 = true;
                                                } else {
                                                    i31 = i66;
                                                    z12 = false;
                                                }
                                                MA.k(str21, z12);
                                                int b22 = cr.b();
                                                if (b22 == 1635148611) {
                                                    int i83 = i81 + 8;
                                                    MA.k(null, str24 == null);
                                                    cr.E(i83);
                                                    D0 a11 = D0.a(cr);
                                                    qVar4.f1502a = a11.f25036b;
                                                    if (z23) {
                                                        z17 = true;
                                                    } else {
                                                        f2 = a11.f25044k;
                                                        z17 = false;
                                                    }
                                                    ArrayList arrayList7 = a11.f25035a;
                                                    String str26 = a11.f25045l;
                                                    int i84 = a11.f25043j;
                                                    int i85 = a11.f25041g;
                                                    int i86 = a11.f25042h;
                                                    int i87 = a11.i;
                                                    i76 = a11.f25039e;
                                                    int i88 = a11.f25040f;
                                                    i33 = i25;
                                                    str11 = str21;
                                                    str25 = str26;
                                                    i78 = i84;
                                                    qVar = qVar4;
                                                    i32 = i86;
                                                    str12 = com.anythink.basead.exoplayer.k.o.f9237h;
                                                    str13 = str22;
                                                    z23 = z17;
                                                    i74 = i85;
                                                    i71 = i87;
                                                    i73 = i88;
                                                    list = arrayList7;
                                                } else {
                                                    if (b22 == 1752589123) {
                                                        int i89 = i81 + 8;
                                                        MA.k(null, str24 == null);
                                                        cr.E(i89);
                                                        C2922a1 a12 = C2922a1.a(cr, false, null);
                                                        qVar4.f1502a = a12.f29766b;
                                                        if (z23) {
                                                            z16 = true;
                                                        } else {
                                                            f2 = a12.f29775l;
                                                            z16 = false;
                                                        }
                                                        int i90 = a12.f29774k;
                                                        if (i90 != -1) {
                                                            i75 = i90;
                                                        }
                                                        List list2 = a12.f29765a;
                                                        int i91 = a12.f29776m;
                                                        int i92 = a12.f29767c;
                                                        String str27 = a12.f29777n;
                                                        int i93 = a12.f29768d;
                                                        int i94 = a12.f29769e;
                                                        int i95 = a12.f29772h;
                                                        int i96 = a12.i;
                                                        z23 = z16;
                                                        int i97 = a12.f29773j;
                                                        int i98 = a12.f29770f;
                                                        int i99 = a12.f29771g;
                                                        C2590Gf c2590Gf3 = a12.f29778o;
                                                        i33 = i25;
                                                        str11 = str21;
                                                        qVar = qVar4;
                                                        i80 = i93;
                                                        i79 = i94;
                                                        i32 = i96;
                                                        i74 = i95;
                                                        i76 = i98;
                                                        str12 = com.anythink.basead.exoplayer.k.o.i;
                                                        c2590Gf2 = c2590Gf3;
                                                        list = list2;
                                                        i78 = i91;
                                                        str25 = str27;
                                                        str13 = str22;
                                                        i73 = i99;
                                                        i71 = i97;
                                                        i77 = i92;
                                                    } else {
                                                        if (b22 == 1818785347) {
                                                            int i100 = i81 + 8;
                                                            MA.k("lhvC must follow hvcC atom", com.anythink.basead.exoplayer.k.o.i.equals(str24));
                                                            if (c2590Gf2 != null) {
                                                                z15 = ((RB) c2590Gf2.f25830u).size() >= 2;
                                                            } else {
                                                                z15 = false;
                                                                c2590Gf2 = null;
                                                            }
                                                            MA.k("must have at least two layers", z15);
                                                            cr.E(i100);
                                                            c2590Gf2.getClass();
                                                            C2922a1 a13 = C2922a1.a(cr, true, c2590Gf2);
                                                            MA.k("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", qVar4.f1502a == a13.f29766b);
                                                            int i101 = a13.f29772h;
                                                            if (i101 != -1) {
                                                                MA.k("colorSpace must be the same for both views", i74 == i101);
                                                            }
                                                            int i102 = a13.i;
                                                            if (i102 != -1) {
                                                                MA.k("colorRange must be the same for both views", i72 == i102);
                                                            }
                                                            int i103 = a13.f29773j;
                                                            if (i103 != -1) {
                                                                MA.k("colorTransfer must be the same for both views", i71 == i103);
                                                            }
                                                            MA.k("bitdepthLuma must be the same for both views", i76 == a13.f29770f);
                                                            MA.k("bitdepthChroma must be the same for both views", i73 == a13.f29771g);
                                                            if (list != null) {
                                                                PB pb = RB.f27933u;
                                                                OB ob = new OB(4);
                                                                ob.b(list);
                                                                ob.b(a13.f29765a);
                                                                list = ob.f();
                                                            } else {
                                                                MA.k("initializationData must be already set from hvcC atom", false);
                                                            }
                                                            i33 = i25;
                                                            str11 = str21;
                                                            str25 = a13.f29777n;
                                                            i32 = i72;
                                                            str12 = "video/mv-hevc";
                                                            qVar = qVar4;
                                                            str13 = str22;
                                                        } else if (b22 == 1987470147) {
                                                            int i104 = i81 + 8;
                                                            MA.k(null, str24 == null);
                                                            cr.E(i104);
                                                            J3.q a14 = J3.q.a(cr);
                                                            qVar4.f1502a = a14.f1502a;
                                                            String str28 = (String) a14.f1505d;
                                                            C3523lC c3523lC2 = (C3523lC) a14.f1504c;
                                                            i76 = a14.f1503b;
                                                            i33 = i25;
                                                            str11 = str21;
                                                            str25 = str28;
                                                            i32 = i72;
                                                            str12 = "video/vvc";
                                                            qVar = qVar4;
                                                            str13 = str22;
                                                            i78 = 16;
                                                            i73 = i76;
                                                            list = c3523lC2;
                                                        } else if (b22 == 1986361461) {
                                                            cr.E(i81 + 8);
                                                            int i105 = cr.f24998b;
                                                            str12 = str24;
                                                            C3717or c3717or = null;
                                                            while (i105 - i81 < i30) {
                                                                cr.E(i105);
                                                                int b23 = cr.b();
                                                                if (b23 > 0) {
                                                                    i38 = i72;
                                                                    z14 = true;
                                                                } else {
                                                                    i38 = i72;
                                                                    z14 = false;
                                                                }
                                                                MA.k(str21, z14);
                                                                int i106 = i105;
                                                                if (cr.b() == 1702454643) {
                                                                    cr.E(i106 + 8);
                                                                    int i107 = cr.f24998b;
                                                                    while (true) {
                                                                        if (i107 - i106 >= b23) {
                                                                            str14 = str21;
                                                                            i39 = b23;
                                                                            c3717or = null;
                                                                            break;
                                                                        }
                                                                        cr.E(i107);
                                                                        int b24 = cr.b();
                                                                        MA.k(str21, b24 > 0);
                                                                        str14 = str21;
                                                                        if (cr.b() == 1937011305) {
                                                                            cr.G(4);
                                                                            int K7 = cr.K();
                                                                            int i108 = K7 & 1;
                                                                            boolean z24 = (K7 & 2) == 2;
                                                                            boolean z25 = (K7 & 8) == 8;
                                                                            boolean z26 = 1 == i108;
                                                                            i39 = b23;
                                                                            I2 i210 = new I2();
                                                                            i210.f26176a = z26;
                                                                            i210.f26177b = z24;
                                                                            i210.f26178c = z25;
                                                                            c3717or = new C3717or(4, i210);
                                                                        } else {
                                                                            i107 += b24;
                                                                            str21 = str14;
                                                                        }
                                                                    }
                                                                } else {
                                                                    str14 = str21;
                                                                    i39 = b23;
                                                                }
                                                                i105 = i106 + i39;
                                                                i72 = i38;
                                                                str21 = str14;
                                                            }
                                                            str11 = str21;
                                                            i32 = i72;
                                                            if (c3717or == null) {
                                                                qx = null;
                                                                c10 = 3;
                                                            } else {
                                                                c10 = 3;
                                                                qx = new Qx(3, c3717or);
                                                            }
                                                            if (qx != null) {
                                                                C3717or c3717or2 = (C3717or) qx.f27895u;
                                                                if (c2590Gf2 == null) {
                                                                    c2590Gf2 = null;
                                                                } else if (((RB) c2590Gf2.f25830u).size() >= 2) {
                                                                    I2 i211 = (I2) c3717or2.f33740u;
                                                                    MA.k("both eye views must be marked as available", i211.f26176a && i211.f26177b);
                                                                    MA.k("for MV-HEVC, eye_views_reversed must be set to false", !((I2) c3717or2.f33740u).f26178c);
                                                                }
                                                                if (i75 == -1) {
                                                                    i33 = i25;
                                                                    qVar = qVar4;
                                                                    if (true != ((I2) c3717or2.f33740u).f26178c) {
                                                                        str13 = str22;
                                                                        i75 = 4;
                                                                    } else {
                                                                        i75 = 5;
                                                                        str13 = str22;
                                                                    }
                                                                } else {
                                                                    i33 = i25;
                                                                    qVar = qVar4;
                                                                    str13 = str22;
                                                                }
                                                            }
                                                            i33 = i25;
                                                            i34 = i73;
                                                            qVar = qVar4;
                                                            c2590Gf = c2590Gf2;
                                                            i35 = i76;
                                                            str13 = str22;
                                                            i73 = i34;
                                                            c2590Gf2 = c2590Gf;
                                                            i76 = i35;
                                                        } else {
                                                            str11 = str21;
                                                            str12 = str24;
                                                            i32 = i72;
                                                            c10 = 3;
                                                            if (b22 == 1685480259 || b22 == 1685485123 || b22 == 1685485379) {
                                                                i33 = i25;
                                                                i34 = i73;
                                                                qVar = qVar4;
                                                                c2590Gf = c2590Gf2;
                                                                i35 = i76;
                                                                str13 = str22;
                                                                c3902sE = C3902sE.a(cr);
                                                            } else if (b22 == 1987076931) {
                                                                int i109 = i81 + 12;
                                                                MA.k(null, str12 == null);
                                                                cr.E(i109);
                                                                byte K8 = (byte) cr.K();
                                                                byte K9 = (byte) cr.K();
                                                                int K10 = cr.K();
                                                                i73 = K10 >> 4;
                                                                int i110 = K10 >> 1;
                                                                String str29 = i25 == 1987063864 ? com.anythink.basead.exoplayer.k.o.f9238j : com.anythink.basead.exoplayer.k.o.f9239k;
                                                                if (str29.equals(com.anythink.basead.exoplayer.k.o.f9239k)) {
                                                                    byte[] bArr2 = AbstractC4305zm.f36216a;
                                                                    byte[] bArr3 = new byte[12];
                                                                    i37 = 1;
                                                                    bArr3[0] = 1;
                                                                    bArr3[1] = 1;
                                                                    bArr3[2] = K8;
                                                                    bArr3[3] = 2;
                                                                    bArr3[4] = 1;
                                                                    bArr3[5] = K9;
                                                                    bArr3[6] = 3;
                                                                    bArr3[7] = 1;
                                                                    bArr3[8] = (byte) i73;
                                                                    bArr3[9] = 4;
                                                                    bArr3[i] = 1;
                                                                    bArr3[11] = (byte) (i110 & 7);
                                                                    list = RB.j(bArr3);
                                                                } else {
                                                                    i37 = 1;
                                                                }
                                                                int i111 = K10 & 1;
                                                                int K11 = cr.K();
                                                                int K12 = cr.K();
                                                                int b25 = KJ.b(K11);
                                                                int i112 = i37 != i111 ? 2 : 1;
                                                                i71 = KJ.c(K12);
                                                                i33 = i25;
                                                                i32 = i112;
                                                                i74 = b25;
                                                                qVar = qVar4;
                                                                str12 = str29;
                                                                str13 = str22;
                                                                i76 = i73;
                                                            } else {
                                                                if (b22 == 1635135811) {
                                                                    int i113 = i30 - 8;
                                                                    byte[] bArr4 = new byte[i113];
                                                                    cr.H(bArr4, 0, i113);
                                                                    list = RB.j(bArr4);
                                                                    C0 d9 = C0.d(bArr4);
                                                                    if (d9 != null) {
                                                                        str25 = (String) d9.f24770y;
                                                                        i71 = d9.f24769x;
                                                                        i36 = d9.f24768w;
                                                                        i74 = d9.f24767v;
                                                                        i76 = d9.f24766u;
                                                                        i73 = i76;
                                                                    } else {
                                                                        i36 = i32;
                                                                    }
                                                                    i33 = i25;
                                                                    str12 = "video/av01";
                                                                    i32 = i36;
                                                                } else if (b22 == 1668050025) {
                                                                    if (byteBuffer == null) {
                                                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                                    }
                                                                    ByteBuffer byteBuffer2 = byteBuffer;
                                                                    byteBuffer2.position(21);
                                                                    byteBuffer2.putShort(cr.N());
                                                                    byteBuffer2.putShort(cr.N());
                                                                    i33 = i25;
                                                                    byteBuffer = byteBuffer2;
                                                                } else if (b22 == 1835295606) {
                                                                    if (byteBuffer == null) {
                                                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                                    }
                                                                    ByteBuffer byteBuffer3 = byteBuffer;
                                                                    short N10 = cr.N();
                                                                    short N11 = cr.N();
                                                                    short N12 = cr.N();
                                                                    short N13 = cr.N();
                                                                    i33 = i25;
                                                                    short N14 = cr.N();
                                                                    int i114 = i73;
                                                                    short N15 = cr.N();
                                                                    C2590Gf c2590Gf4 = c2590Gf2;
                                                                    short N16 = cr.N();
                                                                    int i115 = i76;
                                                                    short N17 = cr.N();
                                                                    long P10 = cr.P();
                                                                    long P11 = cr.P();
                                                                    qVar = qVar4;
                                                                    byteBuffer3.position(1);
                                                                    byteBuffer3.putShort(N14);
                                                                    byteBuffer3.putShort(N15);
                                                                    byteBuffer3.putShort(N10);
                                                                    byteBuffer3.putShort(N11);
                                                                    byteBuffer3.putShort(N12);
                                                                    byteBuffer3.putShort(N13);
                                                                    byteBuffer3.putShort(N16);
                                                                    byteBuffer3.putShort(N17);
                                                                    byteBuffer3.putShort((short) (P10 / 10000));
                                                                    byteBuffer3.putShort((short) (P11 / 10000));
                                                                    byteBuffer = byteBuffer3;
                                                                    str13 = str22;
                                                                    i73 = i114;
                                                                    c2590Gf2 = c2590Gf4;
                                                                    i76 = i115;
                                                                } else {
                                                                    i33 = i25;
                                                                    i34 = i73;
                                                                    qVar = qVar4;
                                                                    c2590Gf = c2590Gf2;
                                                                    i35 = i76;
                                                                    if (b22 == 1681012275) {
                                                                        MA.k(null, str12 == null);
                                                                        str12 = com.anythink.basead.exoplayer.k.o.f9236g;
                                                                        str13 = str22;
                                                                        i73 = i34;
                                                                        c2590Gf2 = c2590Gf;
                                                                        i76 = i35;
                                                                    } else {
                                                                        if (b22 == 1702061171) {
                                                                            MA.k(null, str12 == null);
                                                                            G2 j24 = j(i81, cr);
                                                                            String str30 = (String) j24.f25699v;
                                                                            byte[] bArr5 = (byte[]) j24.f25700w;
                                                                            if (bArr5 != null) {
                                                                                list = RB.j(bArr5);
                                                                            }
                                                                            g22 = j24;
                                                                            str12 = str30;
                                                                        } else if (b22 == 1651798644) {
                                                                            cr.E(i81 + 8);
                                                                            cr.G(4);
                                                                            c3403j0 = new C3403j0(cr.P(), cr.P());
                                                                        } else if (b22 == 1885434736) {
                                                                            cr.E(i81 + 8);
                                                                            f2 = cr.h() / cr.h();
                                                                            str13 = str22;
                                                                            i73 = i34;
                                                                            c2590Gf2 = c2590Gf;
                                                                            i76 = i35;
                                                                            z23 = true;
                                                                        } else if (b22 == 1937126244) {
                                                                            int i116 = i81 + 8;
                                                                            while (true) {
                                                                                if (i116 - i81 >= i30) {
                                                                                    bArr = null;
                                                                                    break;
                                                                                }
                                                                                cr.E(i116);
                                                                                int b26 = cr.b() + i116;
                                                                                if (cr.b() == 1886547818) {
                                                                                    bArr = Arrays.copyOfRange(cr.f24997a, i116, b26);
                                                                                    break;
                                                                                }
                                                                                i116 = b26;
                                                                            }
                                                                        } else {
                                                                            if (b22 == 1936995172) {
                                                                                int K13 = cr.K();
                                                                                cr.G(3);
                                                                                if (K13 == 0) {
                                                                                    int K14 = cr.K();
                                                                                    if (K14 == 0) {
                                                                                        str13 = str22;
                                                                                        i73 = i34;
                                                                                        c2590Gf2 = c2590Gf;
                                                                                        i76 = i35;
                                                                                        i75 = 0;
                                                                                    } else if (K14 == 1) {
                                                                                        str13 = str22;
                                                                                        i73 = i34;
                                                                                        c2590Gf2 = c2590Gf;
                                                                                        i76 = i35;
                                                                                        i75 = 1;
                                                                                    } else if (K14 == 2) {
                                                                                        str13 = str22;
                                                                                        i73 = i34;
                                                                                        c2590Gf2 = c2590Gf;
                                                                                        i76 = i35;
                                                                                        i75 = 2;
                                                                                    } else if (K14 == 3) {
                                                                                        i75 = 3;
                                                                                        str13 = str22;
                                                                                        i73 = i34;
                                                                                        c2590Gf2 = c2590Gf;
                                                                                        i76 = i35;
                                                                                    }
                                                                                }
                                                                            } else if (b22 == 1634760259) {
                                                                                int i117 = i30 - 12;
                                                                                byte[] bArr6 = new byte[i117];
                                                                                cr.E(i81 + 12);
                                                                                cr.H(bArr6, 0, i117);
                                                                                String b27 = AbstractC4305zm.b(bArr6);
                                                                                C3523lC j25 = RB.j(bArr6);
                                                                                Cr cr7 = new Cr(bArr6);
                                                                                byte[] bArr7 = cr7.f24997a;
                                                                                C4256yr c4256yr = new C4256yr(bArr7, bArr7.length);
                                                                                int i118 = 8;
                                                                                c4256yr.d(cr7.f24998b * 8);
                                                                                int i119 = 1;
                                                                                c4256yr.l(1);
                                                                                int h9 = c4256yr.h(8);
                                                                                int i120 = 0;
                                                                                int i121 = -1;
                                                                                int i122 = -1;
                                                                                int i123 = -1;
                                                                                int i124 = -1;
                                                                                int i125 = -1;
                                                                                while (i120 < h9) {
                                                                                    c4256yr.l(i119);
                                                                                    int h10 = c4256yr.h(i118);
                                                                                    int i126 = 0;
                                                                                    while (i126 < h10) {
                                                                                        c4256yr.f(6);
                                                                                        boolean g9 = c4256yr.g();
                                                                                        c4256yr.e();
                                                                                        c4256yr.l(11);
                                                                                        c4256yr.f(4);
                                                                                        i125 = c4256yr.h(4) + 8;
                                                                                        c4256yr.l(1);
                                                                                        if (g9) {
                                                                                            int h11 = c4256yr.h(i118);
                                                                                            int h12 = c4256yr.h(i118);
                                                                                            c4256yr.l(1);
                                                                                            boolean g10 = c4256yr.g();
                                                                                            i121 = KJ.b(h11);
                                                                                            int i127 = true != g10 ? 2 : 1;
                                                                                            i123 = KJ.c(h12);
                                                                                            i122 = i127;
                                                                                        }
                                                                                        i126++;
                                                                                        i124 = i125;
                                                                                        i118 = 8;
                                                                                    }
                                                                                    i120++;
                                                                                    i119 = 1;
                                                                                    i118 = 8;
                                                                                }
                                                                                KJ kj = new KJ(i121, i122, i123, null, i124, i125);
                                                                                int i128 = kj.f26653e;
                                                                                int i129 = kj.f26654f;
                                                                                int i130 = kj.f26649a;
                                                                                str25 = b27;
                                                                                list = j25;
                                                                                i76 = i128;
                                                                                i32 = kj.f26650b;
                                                                                str12 = "video/apv";
                                                                                str13 = str22;
                                                                                c2590Gf2 = c2590Gf;
                                                                                i71 = kj.f26651c;
                                                                                i74 = i130;
                                                                                i73 = i129;
                                                                            } else if (b22 == 1668246642) {
                                                                                if (i74 != -1) {
                                                                                    str13 = str22;
                                                                                } else if (i71 == -1) {
                                                                                    int b28 = cr.b();
                                                                                    if (b28 == 1852009592 || b28 == 1852009571) {
                                                                                        str13 = str22;
                                                                                        int L10 = cr.L();
                                                                                        int L11 = cr.L();
                                                                                        cr.G(2);
                                                                                        if (i30 == 19) {
                                                                                            if ((cr.K() & 128) != 0) {
                                                                                                i30 = 19;
                                                                                                z13 = true;
                                                                                                int b29 = KJ.b(L10);
                                                                                                int i131 = true == z13 ? 2 : 1;
                                                                                                i71 = KJ.c(L11);
                                                                                                i74 = b29;
                                                                                                i32 = i131;
                                                                                            } else {
                                                                                                i30 = 19;
                                                                                            }
                                                                                        }
                                                                                        z13 = false;
                                                                                        int b292 = KJ.b(L10);
                                                                                        if (true == z13) {
                                                                                        }
                                                                                        i71 = KJ.c(L11);
                                                                                        i74 = b292;
                                                                                        i32 = i131;
                                                                                    } else {
                                                                                        str13 = str22;
                                                                                        AbstractC2991bG.y(str13, "Unsupported color type: ".concat(AbstractC3399ix.g(b28)));
                                                                                        i71 = -1;
                                                                                        i74 = -1;
                                                                                        i73 = i34;
                                                                                        c2590Gf2 = c2590Gf;
                                                                                        i76 = i35;
                                                                                    }
                                                                                } else {
                                                                                    str13 = str22;
                                                                                    i74 = -1;
                                                                                }
                                                                            }
                                                                            str13 = str22;
                                                                        }
                                                                        str13 = str22;
                                                                        i73 = i34;
                                                                        c2590Gf2 = c2590Gf;
                                                                        i76 = i35;
                                                                    }
                                                                }
                                                                qVar = qVar4;
                                                                str13 = str22;
                                                            }
                                                            i73 = i34;
                                                            c2590Gf2 = c2590Gf;
                                                            i76 = i35;
                                                        }
                                                        i68 = i82 + i30;
                                                        str22 = str13;
                                                        i66 = i31;
                                                        str24 = str12;
                                                        i72 = i32;
                                                        i25 = i33;
                                                        str21 = str11;
                                                        qVar4 = qVar;
                                                    }
                                                    i68 = i82 + i30;
                                                    str22 = str13;
                                                    i66 = i31;
                                                    str24 = str12;
                                                    i72 = i32;
                                                    i25 = i33;
                                                    str21 = str11;
                                                    qVar4 = qVar;
                                                }
                                                i68 = i82 + i30;
                                                str22 = str13;
                                                i66 = i31;
                                                str24 = str12;
                                                i72 = i32;
                                                i25 = i33;
                                                str21 = str11;
                                                qVar4 = qVar;
                                            }
                                            String str31 = str24;
                                            int i132 = i72;
                                            i27 = i66;
                                            int i133 = i73;
                                            J3.q qVar5 = qVar4;
                                            int i134 = i76;
                                            str7 = str22;
                                            c9 = '\f';
                                            if (c3902sE != null) {
                                                str8 = c3902sE.f34696b;
                                                str9 = "video/dolby-vision";
                                            } else {
                                                str8 = str25;
                                                str9 = str31;
                                            }
                                            if (str9 == null) {
                                                str10 = str23;
                                                z11 = z21;
                                                i28 = i65;
                                                i29 = i67;
                                                qVar3 = qVar5;
                                            } else {
                                                C3322hP c3322hP = new C3322hP();
                                                i28 = i65;
                                                c3322hP.c(i28);
                                                c3322hP.e(str9);
                                                c3322hP.f31554j = str8;
                                                c3322hP.f31565u = L8;
                                                c3322hP.f31566v = L9;
                                                c3322hP.f31567w = i80;
                                                c3322hP.f31568x = i79;
                                                c3322hP.f31533B = f2;
                                                i29 = i67;
                                                c3322hP.f31570z = i29;
                                                z11 = z21;
                                                c3322hP.f31532A = z11;
                                                c3322hP.f31534C = bArr;
                                                c3322hP.f31535D = i75;
                                                c3322hP.f31561q = list;
                                                c3322hP.f31560p = i78;
                                                c3322hP.f31537F = i77;
                                                c3322hP.f31562r = eo4;
                                                str10 = str23;
                                                c3322hP.f31549d = str10;
                                                c3322hP.f31536E = new KJ(i74, i132, i71, byteBuffer != null ? byteBuffer.array() : null, i134, i133);
                                                C3403j0 c3403j02 = c3403j0;
                                                if (c3403j02 != null) {
                                                    c3322hP.f31553h = UC.h(c3403j02.f31940a);
                                                    c3322hP.i = UC.h(c3403j02.f31941b);
                                                } else {
                                                    G2 g23 = g22;
                                                    if (g23 != null) {
                                                        c3322hP.f31553h = UC.h(g23.f25697n);
                                                        c3322hP.i = UC.h(g23.f25698u);
                                                    }
                                                }
                                                DP dp2 = new DP(c3322hP);
                                                qVar3 = qVar5;
                                                qVar3.f1505d = dp2;
                                            }
                                        } else {
                                            if (b20 == 1836069985 || b20 == 1701733217 || b20 == 1633889587 || b20 == 1700998451 || b20 == 1633889588 || b20 == 1835823201 || b20 == 1685353315 || b20 == 1685353317 || b20 == 1685353320 || b20 == 1685353324 || b20 == 1685353336 || b20 == 1935764850 || b20 == 1935767394 || b20 == 1819304813 || b20 == 1936684916 || b20 == 1953984371 || b20 == 778924082 || b20 == 778924083 || b20 == 1835557169 || b20 == 1835560241 || b20 == 1634492771 || b20 == 1634492791 || b20 == 1970037111 || b20 == 1332770163 || b20 == 1716281667 || b20 == 1767992678 || b20 == 1768973165) {
                                                eo3 = eo;
                                                s9 = N9;
                                                i40 = b20;
                                                s10 = N8;
                                                i23 = b18;
                                                qVar2 = qVar3;
                                                i41 = b13;
                                                i42 = i61;
                                                str15 = str20;
                                                i43 = i63;
                                                i44 = b19;
                                                arrayList2 = arrayList6;
                                                i45 = i57;
                                                iw2 = iw5;
                                                j17 = j13;
                                                j18 = j12;
                                                i = 10;
                                            } else if (b20 == 1718641517) {
                                                eo3 = eo;
                                                s9 = N9;
                                                i40 = b20;
                                                s10 = N8;
                                                i23 = b18;
                                                qVar2 = qVar3;
                                                i41 = b13;
                                                i42 = i61;
                                                str15 = str20;
                                                i43 = i63;
                                                i44 = b19;
                                                arrayList2 = arrayList6;
                                                i45 = i57;
                                                iw2 = iw5;
                                                j17 = j13;
                                                j18 = j12;
                                            } else {
                                                if (b20 == 1414810956 || b20 == 1954034535 || b20 == 2004251764 || b20 == 1937010800 || b20 == 1664495672 || b20 == 1836070003 || b20 == 1952807028) {
                                                    cr6.E(i63 + 16);
                                                    if (b20 == 1414810956) {
                                                        cr2 = cr6;
                                                        i23 = b18;
                                                        str16 = str18;
                                                    } else if (b20 == 1954034535) {
                                                        int i135 = b19 - 16;
                                                        byte[] bArr8 = new byte[i135];
                                                        cr6.H(bArr8, 0, i135);
                                                        c3523lC = RB.j(bArr8);
                                                        str16 = com.anythink.basead.exoplayer.k.o.aa;
                                                        cr2 = cr6;
                                                        i23 = b18;
                                                        j19 = Long.MAX_VALUE;
                                                        c11 = 3;
                                                        if (str16 != null) {
                                                            C3322hP c3322hP2 = new C3322hP();
                                                            c3322hP2.c(b13);
                                                            c3322hP2.e(str16);
                                                            c3322hP2.f31549d = str;
                                                            c3322hP2.f31563s = j19;
                                                            c3322hP2.f31561q = c3523lC;
                                                            qVar3.f1505d = new DP(c3322hP2);
                                                        }
                                                        z11 = z20;
                                                        s9 = N9;
                                                        str10 = str;
                                                        s10 = N8;
                                                        str6 = str17;
                                                        i26 = L2;
                                                        b9 = b12;
                                                        str4 = str18;
                                                        i28 = b13;
                                                        i24 = i61;
                                                        str7 = str20;
                                                        i27 = b19;
                                                        arrayList2 = arrayList6;
                                                        i29 = i57;
                                                        iw2 = iw5;
                                                        j17 = j13;
                                                        j18 = j12;
                                                        cr = cr2;
                                                        i = 10;
                                                        c9 = '\f';
                                                    } else {
                                                        if (b20 == 2004251764) {
                                                            str16 = com.anythink.basead.exoplayer.k.o.ab;
                                                            cr2 = cr6;
                                                        } else if (b20 == 1937010800) {
                                                            cr2 = cr6;
                                                            i23 = b18;
                                                            str16 = str18;
                                                            j19 = 0;
                                                            c3523lC = null;
                                                            c11 = 3;
                                                            if (str16 != null) {
                                                            }
                                                            z11 = z20;
                                                            s9 = N9;
                                                            str10 = str;
                                                            s10 = N8;
                                                            str6 = str17;
                                                            i26 = L2;
                                                            b9 = b12;
                                                            str4 = str18;
                                                            i28 = b13;
                                                            i24 = i61;
                                                            str7 = str20;
                                                            i27 = b19;
                                                            arrayList2 = arrayList6;
                                                            i29 = i57;
                                                            iw2 = iw5;
                                                            j17 = j13;
                                                            j18 = j12;
                                                            cr = cr2;
                                                            i = 10;
                                                            c9 = '\f';
                                                        } else if (b20 == 1664495672) {
                                                            qVar3.f1503b = 1;
                                                            cr2 = cr6;
                                                            str16 = com.anythink.basead.exoplayer.k.o.ac;
                                                        } else {
                                                            if (b20 == 1836070003) {
                                                                int i136 = cr6.f24998b;
                                                                cr6.G(4);
                                                                if (cr6.b() == 1702061171) {
                                                                    byte[] bArr9 = (byte[]) j(i136, cr6).f25700w;
                                                                    if (bArr9 == null) {
                                                                        s9 = N9;
                                                                        s10 = N8;
                                                                        i23 = b18;
                                                                        str6 = str17;
                                                                        i26 = L2;
                                                                        b9 = b12;
                                                                        str4 = str18;
                                                                        i28 = b13;
                                                                        i24 = i61;
                                                                        i27 = b19;
                                                                        arrayList2 = arrayList6;
                                                                        i29 = i57;
                                                                        iw2 = iw5;
                                                                        j17 = j13;
                                                                        j18 = j12;
                                                                    } else if (bArr9.length == 64) {
                                                                        AbstractC2792Sd.H(bArr9.length == 64);
                                                                        ArrayList arrayList8 = new ArrayList(16);
                                                                        int i137 = 0;
                                                                        while (i137 < bArr9.length - 3) {
                                                                            Cr cr8 = cr6;
                                                                            byte[] bArr10 = bArr9;
                                                                            int i138 = i137;
                                                                            int m9 = UC.m(bArr9[i137], bArr9[i137 + 1], bArr10[i137 + 2], bArr10[i137 + 3]);
                                                                            String str32 = AbstractC3182eu.f30782a;
                                                                            int i139 = ((m9 >> 8) & com.anythink.basead.exoplayer.k.p.f9259b) - 128;
                                                                            int i140 = (m9 >> 16) & com.anythink.basead.exoplayer.k.p.f9259b;
                                                                            int max = Math.max(0, Math.min(((i139 * 14075) / 10000) + i140, com.anythink.basead.exoplayer.k.p.f9259b)) << 16;
                                                                            int i141 = (m9 & com.anythink.basead.exoplayer.k.p.f9259b) - 128;
                                                                            arrayList8.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(((i141 * 17790) / 10000) + i140, com.anythink.basead.exoplayer.k.p.f9259b)) | max | (Math.max(0, Math.min((i140 - ((i141 * 3455) / 10000)) - ((i139 * 7169) / 10000), com.anythink.basead.exoplayer.k.p.f9259b)) << 8))));
                                                                            i137 = i138 + 4;
                                                                            cr6 = cr8;
                                                                            bArr9 = bArr10;
                                                                            b18 = b18;
                                                                        }
                                                                        cr2 = cr6;
                                                                        i23 = b18;
                                                                        c11 = 3;
                                                                        Iterator it = arrayList8.iterator();
                                                                        StringBuilder sb = new StringBuilder();
                                                                        AbstractC2991bG.z(sb, it, ", ");
                                                                        String sb2 = sb.toString();
                                                                        StringBuilder sb3 = new StringBuilder(AbstractC5128c.j(AbstractC5128c.j(String.valueOf((int) N8).length() + 7, i, String.valueOf((int) N9)), 1, sb2));
                                                                        sb3.append("size: ");
                                                                        sb3.append((int) N8);
                                                                        sb3.append("x");
                                                                        sb3.append((int) N9);
                                                                        String p9 = D.x.p(sb3, "\npalette: ", sb2, "\n");
                                                                        String str33 = AbstractC3182eu.f30782a;
                                                                        C3523lC j26 = RB.j(p9.getBytes(StandardCharsets.UTF_8));
                                                                        str16 = com.anythink.basead.exoplayer.k.o.ae;
                                                                        c3523lC = j26;
                                                                    } else {
                                                                        s9 = N9;
                                                                        s10 = N8;
                                                                        i23 = b18;
                                                                        str6 = str17;
                                                                        i26 = L2;
                                                                        b9 = b12;
                                                                        str4 = str18;
                                                                        i28 = b13;
                                                                        i24 = i61;
                                                                        i27 = b19;
                                                                        arrayList2 = arrayList6;
                                                                        i29 = i57;
                                                                        iw2 = iw5;
                                                                        j17 = j13;
                                                                        j18 = j12;
                                                                    }
                                                                } else {
                                                                    cr2 = cr6;
                                                                    i23 = b18;
                                                                    c11 = 3;
                                                                    c3523lC = null;
                                                                    str16 = null;
                                                                }
                                                                j19 = Long.MAX_VALUE;
                                                            } else {
                                                                cr2 = cr6;
                                                                i23 = b18;
                                                                c11 = 3;
                                                                str16 = str17;
                                                                j19 = Long.MAX_VALUE;
                                                                c3523lC = null;
                                                            }
                                                            if (str16 != null) {
                                                            }
                                                            z11 = z20;
                                                            s9 = N9;
                                                            str10 = str;
                                                            s10 = N8;
                                                            str6 = str17;
                                                            i26 = L2;
                                                            b9 = b12;
                                                            str4 = str18;
                                                            i28 = b13;
                                                            i24 = i61;
                                                            str7 = str20;
                                                            i27 = b19;
                                                            arrayList2 = arrayList6;
                                                            i29 = i57;
                                                            iw2 = iw5;
                                                            j17 = j13;
                                                            j18 = j12;
                                                            cr = cr2;
                                                            i = 10;
                                                            c9 = '\f';
                                                        }
                                                        i23 = b18;
                                                    }
                                                    j19 = Long.MAX_VALUE;
                                                    c3523lC = null;
                                                    c11 = 3;
                                                    if (str16 != null) {
                                                    }
                                                    z11 = z20;
                                                    s9 = N9;
                                                    str10 = str;
                                                    s10 = N8;
                                                    str6 = str17;
                                                    i26 = L2;
                                                    b9 = b12;
                                                    str4 = str18;
                                                    i28 = b13;
                                                    i24 = i61;
                                                    str7 = str20;
                                                    i27 = b19;
                                                    arrayList2 = arrayList6;
                                                    i29 = i57;
                                                    iw2 = iw5;
                                                    j17 = j13;
                                                    j18 = j12;
                                                    cr = cr2;
                                                    i = 10;
                                                    c9 = '\f';
                                                } else if (b20 == 1835365492 || b20 == 1769222965) {
                                                    cr6.E(i63 + 16);
                                                    if (b20 == 1835365492) {
                                                        cr6.m();
                                                        String m10 = cr6.m();
                                                        if (m10 != null) {
                                                            C3322hP c3322hP3 = new C3322hP();
                                                            c3322hP3.c(b13);
                                                            c3322hP3.e(m10);
                                                            qVar3.f1505d = new DP(c3322hP3);
                                                        }
                                                    } else if (b20 == 1769222965) {
                                                        int K15 = cr6.K();
                                                        byte[] bArr11 = new byte[K15];
                                                        cr6.H(bArr11, 0, K15);
                                                        C3322hP c3322hP4 = new C3322hP();
                                                        c3322hP4.c(b13);
                                                        c3322hP4.e("application/x-itut-t35");
                                                        c3322hP4.f31561q = RB.j(bArr11);
                                                        qVar3.f1505d = new DP(c3322hP4);
                                                    }
                                                    s9 = N9;
                                                    s10 = N8;
                                                    i23 = b18;
                                                    str6 = str17;
                                                    i26 = L2;
                                                    b9 = b12;
                                                    str4 = str18;
                                                    i28 = b13;
                                                    i24 = i61;
                                                    i27 = b19;
                                                    arrayList2 = arrayList6;
                                                    i29 = i57;
                                                    iw2 = iw5;
                                                    j17 = j13;
                                                    j18 = j12;
                                                } else {
                                                    if (b20 == 1667329389) {
                                                        C3322hP c3322hP5 = new C3322hP();
                                                        c3322hP5.c(b13);
                                                        c3322hP5.e(com.anythink.basead.exoplayer.k.o.ah);
                                                        qVar3.f1505d = new DP(c3322hP5);
                                                    }
                                                    z11 = z20;
                                                    s9 = N9;
                                                    str10 = str;
                                                    s10 = N8;
                                                    i23 = b18;
                                                    str6 = str17;
                                                    i26 = L2;
                                                    b9 = b12;
                                                    str4 = str18;
                                                    i28 = b13;
                                                    i24 = i61;
                                                    str7 = str20;
                                                    i27 = b19;
                                                    arrayList2 = arrayList6;
                                                    i29 = i57;
                                                    iw2 = iw5;
                                                    j17 = j13;
                                                    j18 = j12;
                                                    c9 = '\f';
                                                    cr = cr6;
                                                }
                                                c9 = '\f';
                                                z11 = z20;
                                                cr = cr6;
                                                str10 = str;
                                                str7 = str20;
                                            }
                                            i(cr6, i40, i43, i44, i41, str, z9, eo3, qVar2, i42);
                                            cr = cr6;
                                            z11 = z20;
                                            i63 = i43;
                                            i27 = i44;
                                            str10 = str;
                                            i24 = i42;
                                            str6 = str17;
                                            i26 = L2;
                                            b9 = b12;
                                            str4 = str18;
                                            i29 = i45;
                                            str7 = str15;
                                            c9 = '\f';
                                            i28 = i41;
                                            qVar3 = qVar2;
                                        }
                                        cr.E(i63 + i27);
                                        cr6 = cr;
                                        i57 = i29;
                                        i60 = i24 + 1;
                                        str19 = str7;
                                        b13 = i28;
                                        N8 = s10;
                                        N9 = s9;
                                        b12 = b9;
                                        str18 = str4;
                                        str17 = str6;
                                        L2 = i26;
                                        b18 = i23;
                                        arrayList6 = arrayList2;
                                        iw5 = iw2;
                                        j12 = j18;
                                        j13 = j17;
                                        c13 = c9;
                                        str = str10;
                                        z20 = z11;
                                        i58 = i64;
                                    }
                                    i18 = i58;
                                    String str34 = str17;
                                    int i142 = L2;
                                    byte b30 = b12;
                                    str2 = str18;
                                    int i143 = b13;
                                    arrayList = arrayList6;
                                    long j27 = j13;
                                    long j28 = j12;
                                    iw4 = iw5;
                                    Iw j29 = iw4.j(1953654118);
                                    if (j29 == null || (i22 = j29.i(1667785072)) == null) {
                                        i19 = 8;
                                        i20 = 4;
                                    } else {
                                        Cr cr9 = i22.f29750c;
                                        i19 = 8;
                                        cr9.E(8);
                                        i20 = 4;
                                        if (cr9.B() >= 4) {
                                            i21 = cr9.b();
                                            if (!z6 || (j16 = iw4.j(1701082227)) == null || (h3 = h(j16)) == null) {
                                                sc = null;
                                                sc2 = null;
                                            } else {
                                                sc2 = (SC) h3.first;
                                                sc = (SC) h3.second;
                                            }
                                            dp = (DP) qVar3.f1505d;
                                            if (dp != null) {
                                                ua2 = ua;
                                                z22 = null;
                                                str3 = str34;
                                            } else {
                                                if (i142 != 0) {
                                                    C4315zw c4315zw = new C4315zw(i142);
                                                    C3322hP c3322hP6 = new C3322hP(dp);
                                                    O3 o32 = dp.f25173l;
                                                    c3322hP6.f31555k = o32 != null ? o32.c(c4315zw) : new O3(c4315zw);
                                                    dp = new DP(c3322hP6);
                                                }
                                                str3 = str34;
                                                boolean z27 = !Objects.equals(dp.f25176o, str3);
                                                Y2 y22 = new Y2();
                                                y22.f29413a = i143;
                                                y22.f29414b = b30;
                                                y22.f29415c = j14;
                                                y22.f29416d = j28;
                                                y22.f29417e = j27;
                                                y22.f29418f = j15;
                                                y22.a(dp);
                                                y22.b(qVar3.f1503b);
                                                y22.c((C2924a3[]) qVar3.f1504c);
                                                y22.d(qVar3.f1502a);
                                                y22.e(sc2);
                                                y22.f(sc);
                                                y22.g(z27);
                                                y22.h(i21);
                                                y22.f29419g.getClass();
                                                z22 = new Z2(y22);
                                                ua2 = ua;
                                            }
                                        }
                                    }
                                    i21 = -1;
                                    if (z6) {
                                    }
                                    sc = null;
                                    sc2 = null;
                                    dp = (DP) qVar3.f1505d;
                                    if (dp != null) {
                                    }
                                }
                            }
                            b15 = 65536;
                        }
                        b14 = 0;
                    }
                    if (b14 == 0) {
                        if (b15 == -65536) {
                            if (b16 == 65536) {
                                i4 = b16;
                                z10 = b17 != 0;
                                i10 = i4;
                            } else if (b16 == -65536) {
                                z10 = b17 != 0;
                                i10 = -65536;
                                i4 = -65536;
                            } else {
                                i4 = b16;
                                i6 = -65536;
                                b15 = -65536;
                            }
                            if (true != z10) {
                                i9 = 270;
                                i56 = b15;
                                b16 = i10;
                                cr4.G(16);
                                short N82 = cr4.N();
                                int i572 = i9;
                                cr4.G(2);
                                short N92 = cr4.N();
                                Iw iw52 = iw4;
                                int i582 = i50;
                                if ((((long) b17) * ((long) b14)) - (((long) i56) * ((long) b16)) >= 0) {
                                }
                                if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
                                }
                                long j212 = d(i51.f29750c).f26158c;
                                if (j11 != com.anythink.basead.exoplayer.b.f7168b) {
                                }
                                Iw j222 = j20.j(1835626086);
                                j222.getClass();
                                Iw j232 = j222.j(1937007212);
                                j232.getClass();
                                Zw i592 = j20.i(1835296868);
                                i592.getClass();
                                Cr cr52 = i592.f29750c;
                                cr52.E(8);
                                a9 = a(cr52.b());
                                cr52.G(a9 != 0 ? 8 : 16);
                                long P82 = cr52.P();
                                i11 = cr52.f24998b;
                                i12 = 0;
                                while (true) {
                                    if (a9 != 0) {
                                    }
                                    if (i12 < i14) {
                                    }
                                    i12++;
                                    i11 = i13;
                                    w3 = j13;
                                }
                                j15 = j9;
                                int L62 = cr52.L();
                                char[] cArr2 = {(char) (((L62 >> 10) & 31) + 96), (char) (((L62 >> 5) & 31) + 96), (char) ((L62 & 31) + 96)};
                                i16 = 0;
                                while (i16 < i15) {
                                }
                                str = new String(cArr2);
                                i17 = j232.i(1937011556);
                                String str192 = "BoxParsers";
                                if (i17 != null) {
                                }
                            } else {
                                i6 = -65536;
                                b15 = -65536;
                                b14 = 0;
                                b16 = i10;
                            }
                        } else {
                            i4 = b16;
                            i6 = b15;
                        }
                        b14 = 0;
                    } else {
                        i4 = b16;
                        i6 = b15;
                    }
                    int i144 = b14;
                    if (b14 != -65536) {
                        if (b14 == 65536) {
                            b14 = 65536;
                        } else {
                            i56 = b15;
                            i9 = 0;
                            b14 = i144;
                            cr4.G(16);
                            short N822 = cr4.N();
                            int i5722 = i9;
                            cr4.G(2);
                            short N922 = cr4.N();
                            Iw iw522 = iw4;
                            int i5822 = i50;
                            if ((((long) b17) * ((long) b14)) - (((long) i56) * ((long) b16)) >= 0) {
                            }
                            if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
                            }
                            long j2122 = d(i51.f29750c).f26158c;
                            if (j11 != com.anythink.basead.exoplayer.b.f7168b) {
                            }
                            Iw j2222 = j20.j(1835626086);
                            j2222.getClass();
                            Iw j2322 = j2222.j(1937007212);
                            j2322.getClass();
                            Zw i5922 = j20.i(1835296868);
                            i5922.getClass();
                            Cr cr522 = i5922.f29750c;
                            cr522.E(8);
                            a9 = a(cr522.b());
                            cr522.G(a9 != 0 ? 8 : 16);
                            long P822 = cr522.P();
                            i11 = cr522.f24998b;
                            i12 = 0;
                            while (true) {
                                if (a9 != 0) {
                                }
                                if (i12 < i14) {
                                }
                                i12++;
                                i11 = i13;
                                w3 = j13;
                            }
                            j15 = j9;
                            int L622 = cr522.L();
                            char[] cArr22 = {(char) (((L622 >> 10) & 31) + 96), (char) (((L622 >> 5) & 31) + 96), (char) ((L622 & 31) + 96)};
                            i16 = 0;
                            while (i16 < i15) {
                            }
                            str = new String(cArr22);
                            i17 = j2322.i(1937011556);
                            String str1922 = "BoxParsers";
                            if (i17 != null) {
                            }
                        }
                    }
                    if (i6 == 0 && i4 == 0 && b17 == -65536) {
                        i9 = 180;
                        b17 = -65536;
                        i56 = b15;
                    } else {
                        i56 = b15;
                        i9 = 0;
                    }
                    cr4.G(16);
                    short N8222 = cr4.N();
                    int i57222 = i9;
                    cr4.G(2);
                    short N9222 = cr4.N();
                    Iw iw5222 = iw4;
                    int i58222 = i50;
                    if ((((long) b17) * ((long) b14)) - (((long) i56) * ((long) b16)) >= 0) {
                    }
                    if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
                    }
                    long j21222 = d(i51.f29750c).f26158c;
                    if (j11 != com.anythink.basead.exoplayer.b.f7168b) {
                    }
                    Iw j22222 = j20.j(1835626086);
                    j22222.getClass();
                    Iw j23222 = j22222.j(1937007212);
                    j23222.getClass();
                    Zw i59222 = j20.i(1835296868);
                    i59222.getClass();
                    Cr cr5222 = i59222.f29750c;
                    cr5222.E(8);
                    a9 = a(cr5222.b());
                    cr5222.G(a9 != 0 ? 8 : 16);
                    long P8222 = cr5222.P();
                    i11 = cr5222.f24998b;
                    i12 = 0;
                    while (true) {
                        if (a9 != 0) {
                        }
                        if (i12 < i14) {
                        }
                        i12++;
                        i11 = i13;
                        w3 = j13;
                    }
                    j15 = j9;
                    int L6222 = cr5222.L();
                    char[] cArr222 = {(char) (((L6222 >> 10) & 31) + 96), (char) (((L6222 >> 5) & 31) + 96), (char) ((L6222 & 31) + 96)};
                    i16 = 0;
                    while (i16 < i15) {
                    }
                    str = new String(cArr222);
                    i17 = j23222.i(1937011556);
                    String str19222 = "BoxParsers";
                    if (i17 != null) {
                    }
                }
                Z2 z28 = (Z2) ua2.apply(z22);
                if (z28 != null) {
                    Iw j30 = iw4.j(1835297121);
                    j30.getClass();
                    Iw j31 = j30.j(1835626086);
                    j31.getClass();
                    Iw j32 = j31.j(1937007212);
                    j32.getClass();
                    C3031c3 g11 = g(z28, j32, z02);
                    arrayList3 = arrayList;
                    arrayList3.add(g11);
                } else {
                    arrayList3 = arrayList;
                }
            }
            iw3 = iw;
            i50 = i18 + 1;
            str17 = str3;
            i48 = i20;
            i46 = i;
            str18 = str2;
            b10 = -1;
            i47 = 16;
            i49 = i19;
            arrayList4 = arrayList3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ee, code lost:
    
        r9 = r13;
        r10 = r9;
        r11 = -1;
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f3, code lost:
    
        r14 = r1.f24998b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f5, code lost:
    
        if (r14 >= r8) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f7, code lost:
    
        r15 = r1.b();
        r13 = r1.b();
        r1.G(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0206, code lost:
    
        if (r13 != 1835360622) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0208, code lost:
    
        r9 = r1.l(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0211, code lost:
    
        r0 = r15 - 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0216, code lost:
    
        if (r13 != 1851878757) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0218, code lost:
    
        r10 = r1.l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021f, code lost:
    
        if (r13 != 1684108385) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0221, code lost:
    
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0222, code lost:
    
        if (r13 != 1684108385) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0224, code lost:
    
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0225, code lost:
    
        r1.G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0229, code lost:
    
        if (r9 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x022b, code lost:
    
        if (r10 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x022f, code lost:
    
        if (r11 != (-1)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0234, code lost:
    
        r1.E(r11);
        r1.G(16);
        r9 = new com.google.android.gms.internal.ads.C3084d2(r9, r10, r1.l(r12 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0231, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0304, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC3399ix.g(r14);
        r4 = new java.lang.StringBuilder(r0.length() + 32);
        r4.append("Skipped unknown metadata entry: ");
        r4.append(r0);
        com.google.android.gms.internal.ads.AbstractC2991bG.k("MetadataUtil", r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x024a, code lost:
    
        r0 = r14 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x024f, code lost:
    
        if (r0 != 6516084) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0251, code lost:
    
        r4 = r1.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x025b, code lost:
    
        if (r1.b() != 1684108385) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x025d, code lost:
    
        r1.G(8);
        r0 = r1.l(r4 - 16);
        r9 = new com.google.android.gms.internal.ads.Y1(com.anythink.basead.exoplayer.b.ar, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0271, code lost:
    
        com.google.android.gms.internal.ads.AbstractC2991bG.y("MetadataUtil", "Failed to parse comment attribute: ".concat(com.google.android.gms.internal.ads.AbstractC3399ix.g(r14)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0280, code lost:
    
        if (r0 == 7233901) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0285, code lost:
    
        if (r0 != 7631467) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028c, code lost:
    
        if (r0 == 6516589) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r1.E(r5);
        r1.G(r2);
        r5 = new java.util.ArrayList();
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0291, code lost:
    
        if (r0 != 7828084) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0298, code lost:
    
        if (r0 != 6578553) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x029a, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(r14, "TDRC", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02a5, code lost:
    
        if (r0 != 4280916) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02a7, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(r14, "TPE1", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02b2, code lost:
    
        if (r0 != 7630703) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r8 = r1.f24998b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02b4, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(r14, "TSSE", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02bf, code lost:
    
        if (r0 != 6384738) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02c1, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(r14, "TALB", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02cb, code lost:
    
        if (r0 != 7108978) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02cd, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(r14, "USLT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02d7, code lost:
    
        if (r0 != 6776174) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02d9, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(r14, "TCON", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r8 >= r7) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02e1, code lost:
    
        if (r0 != 6779504) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02e3, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(r14, "TIT1", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ed, code lost:
    
        if (r0 != 7173742) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02ef, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(r14, "MVNM", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02f9, code lost:
    
        if (r0 != 7173737) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02fb, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.H(r14, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0322, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(r14, "TCOM", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r14 = r1.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0329, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(r14, "TIT2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0095, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x033e, code lost:
    
        r1.E(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0341, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0346, code lost:
    
        if (r5.isEmpty() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r14 >= r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x034a, code lost:
    
        r13 = new com.google.android.gms.internal.ads.O3(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        com.google.android.gms.internal.ads.AbstractC2991bG.y("MetadataUtil", "Skipped empty metadata entry");
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0332, code lost:
    
        if (r9 == null) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0334, code lost:
    
        r5.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0337, code lost:
    
        r0 = true;
        r2 = 8;
        r4 = 0;
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        r8 = r8 + r14;
        r14 = r1.b();
        r11 = r14 >> 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if ((r8 - r1.f24998b) >= r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        r9 = com.google.android.gms.internal.ads.AbstractC3399ix.g(r14);
        r11 = new java.lang.StringBuilder(r9.length() + 30);
        r11.append("Skipped empty metadata entry: ");
        r11.append(r9);
        com.google.android.gms.internal.ads.AbstractC2991bG.y("MetadataUtil", r11.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x032f, code lost:
    
        r1.E(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        r10 = r11 & com.anythink.basead.exoplayer.k.p.f9259b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r10 == 169) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (r10 != 253) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r14 != 1735291493) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r2 = com.google.android.gms.internal.ads.AbstractC3030c2.a(com.google.android.gms.internal.ads.SK.K(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        r9 = new com.google.android.gms.internal.ads.C3245g2("TCON", r13, com.google.android.gms.internal.ads.RB.j(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        com.google.android.gms.internal.ads.AbstractC2991bG.y("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        if (r14 != 1684632427) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.N(1684632427, "TPOS", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        if (r14 != 1953655662) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.N(1953655662, "TRCK", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00eb, code lost:
    
        if (r14 != 1953329263) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ed, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.H(1953329263, "TBPM", r1, r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        if (r14 != 1668311404) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.H(1668311404, "TCMP", r1, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0105, code lost:
    
        if (r14 != 1668249202) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0107, code lost:
    
        r10 = r1.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        if (r1.b() != 1684108385) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        r2 = r1.b() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011b, code lost:
    
        if (r2 != 13) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011d, code lost:
    
        r11 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
    
        if (r11 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012f, code lost:
    
        r11 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 30);
        r11.append("Unrecognized cover art flags: ");
        r11.append(r2);
        com.google.android.gms.internal.ads.AbstractC2991bG.y("MetadataUtil", r11.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014d, code lost:
    
        r1.G(4);
        r10 = r10 - 16;
        r2 = new byte[r10];
        r1.H(r2, r4, r10);
        r9 = new com.google.android.gms.internal.ads.U1(r11, r13, 3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0122, code lost:
    
        if (r2 != 14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0124, code lost:
    
        r11 = "image/png";
        r2 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012c, code lost:
    
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0160, code lost:
    
        com.google.android.gms.internal.ads.AbstractC2991bG.y("MetadataUtil", "Failed to parse cover art attribute");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016a, code lost:
    
        if (r14 != 1631670868) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016c, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(1631670868, "TPE2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0177, code lost:
    
        if (r14 != 1936682605) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0179, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(1936682605, "TSOT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0184, code lost:
    
        if (r14 != 1936679276) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0186, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(1936679276, "TSOA", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0191, code lost:
    
        if (r14 != 1936679282) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0193, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(1936679282, "TSOP", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019e, code lost:
    
        if (r14 != 1936679265) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a0, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(1936679265, "TSO2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ab, code lost:
    
        if (r14 != 1936679791) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ad, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(1936679791, "TSOC", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b8, code lost:
    
        if (r14 != 1920233063) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ba, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.H(1920233063, "ITUNESADVISORY", r1, r4, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c5, code lost:
    
        if (r14 != 1885823344) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c7, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.H(1885823344, "ITUNESGAPLESS", r1, r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d2, code lost:
    
        if (r14 != 1936683886) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d4, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(1936683886, "TVSHOWSORT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01df, code lost:
    
        if (r14 != 1953919848) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e1, code lost:
    
        r9 = com.google.android.gms.internal.ads.SK.E(1953919848, "TVSHOW", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ec, code lost:
    
        if (r14 != 757935405) goto L160;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03e8  */
    /* JADX WARN: Type inference failed for: r4v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static O3 c(Zw zw) {
        int i;
        boolean z6;
        O3 o32;
        boolean z9;
        O3 o33;
        ArrayList arrayList;
        O3 o34;
        O3 o35;
        int i4;
        int i6;
        boolean z10 = true;
        Cr cr = zw.f29750c;
        int i9 = 8;
        cr.E(8);
        boolean z11 = false;
        O3 o36 = new O3(new InterfaceC3945t3[0]);
        while (cr.B() >= i9) {
            int i10 = cr.f24998b;
            int b9 = cr.b() + i10;
            int b10 = cr.b();
            String str = null;
            if (b10 == 1835365473) {
                cr.E(i10);
                cr.G(i9);
                f(cr);
                boolean z12 = z11;
                while (true) {
                    int i11 = cr.f24998b;
                    if (i11 >= b9) {
                        break;
                    }
                    int b11 = cr.b() + i11;
                    if (cr.b() == 1768715124) {
                        break;
                    }
                    cr.E(b11);
                    z10 = true;
                    i9 = 8;
                    z12 = false;
                    str = null;
                }
                O3 o37 = null;
                o36 = o36.b(o37);
                i = 8;
            } else if (b10 == 1936553057) {
                cr.E(i10);
                cr.G(12);
                while (true) {
                    int i12 = cr.f24998b;
                    if (i12 >= b9) {
                        break;
                    }
                    int b12 = cr.b();
                    if (cr.b() != 1935766900) {
                        int i13 = i12 + b12;
                    } else if (b12 >= 16) {
                        cr.G(4);
                        int i14 = 0;
                        int i15 = 0;
                        int i16 = -1;
                        while (i14 < 2) {
                            int K7 = cr.K();
                            int K8 = cr.K();
                            if (K7 == 0) {
                                i16 = K8;
                                i6 = 1;
                            } else {
                                i6 = 1;
                                if (K7 == 1) {
                                    i15 = K8;
                                }
                            }
                            i14 += i6;
                        }
                        if (i16 == 12) {
                            i4 = 240;
                        } else if (i16 == 13) {
                            i4 = 120;
                        } else if (i16 != 21) {
                            i4 = -2147483647;
                        } else {
                            i = 8;
                            if (cr.B() >= 8 && cr.f24998b + 8 <= b9) {
                                int b13 = cr.b();
                                int b14 = cr.b();
                                if (b13 >= 12 && b14 == 1936877170) {
                                    i4 = cr.f();
                                    o35 = i4 != -2147483647 ? new O3(new C3459k2(i4, i15)) : null;
                                }
                            }
                            i4 = -2147483647;
                            if (i4 != -2147483647) {
                            }
                        }
                        i = 8;
                        if (i4 != -2147483647) {
                        }
                    }
                }
                i = 8;
                o36 = o36.b(o35);
            } else {
                i = 8;
                if (b10 == -1451722374) {
                    short N8 = cr.N();
                    cr.G(2);
                    String k9 = cr.k(N8, StandardCharsets.UTF_8);
                    int max = Math.max(k9.lastIndexOf(43), k9.lastIndexOf(45));
                    try {
                        try {
                            C3777px c3777px = new C3777px(Float.parseFloat(k9.substring(0, max)), Float.parseFloat(k9.substring(max, k9.length() - 1)));
                            InterfaceC3945t3[] interfaceC3945t3Arr = new InterfaceC3945t3[1];
                            z6 = false;
                            try {
                                interfaceC3945t3Arr[0] = c3777px;
                                o34 = new O3(interfaceC3945t3Arr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                o34 = null;
                                o36 = o36.b(o34);
                                z9 = true;
                                cr.E(b9);
                                i9 = i;
                                z10 = z9;
                                z11 = z6;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z6 = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z6 = false;
                    }
                    o36 = o36.b(o34);
                } else {
                    z6 = false;
                    if (b10 == 1667788908) {
                        try {
                            cr.G(5);
                            int b15 = cr.b();
                            arrayList = new ArrayList();
                            for (int i17 = 0; i17 < b15; i17++) {
                                long d9 = cr.d() / 10000;
                                if (d9 < 0) {
                                    d9 = com.anythink.basead.exoplayer.b.f7168b;
                                }
                                o32 = null;
                                try {
                                    arrayList.add(new O1(d9, com.anythink.basead.exoplayer.b.f7168b, false, new C3323hQ(null, cr.k(cr.K(), StandardCharsets.UTF_8))));
                                } catch (IndexOutOfBoundsException unused4) {
                                    z9 = true;
                                    o33 = o32;
                                    o36 = o36.b(o33);
                                    cr.E(b9);
                                    i9 = i;
                                    z10 = z9;
                                    z11 = z6;
                                }
                            }
                            o32 = null;
                            z9 = true;
                        } catch (IndexOutOfBoundsException unused5) {
                            o32 = null;
                        }
                        if (!arrayList.isEmpty()) {
                            o33 = new O3(arrayList);
                            o36 = o36.b(o33);
                            cr.E(b9);
                            i9 = i;
                            z10 = z9;
                            z11 = z6;
                        }
                        o33 = o32;
                        o36 = o36.b(o33);
                        cr.E(b9);
                        i9 = i;
                        z10 = z9;
                        z11 = z6;
                    }
                }
                z9 = true;
                cr.E(b9);
                i9 = i;
                z10 = z9;
                z11 = z6;
            }
            z9 = true;
            z6 = false;
            cr.E(b9);
            i9 = i;
            z10 = z9;
            z11 = z6;
        }
        return o36;
    }

    public static Hx d(Cr cr) {
        long d9;
        long d10;
        cr.E(8);
        if (a(cr.b()) == 0) {
            d9 = cr.P();
            d10 = cr.P();
        } else {
            d9 = cr.d();
            d10 = cr.d();
        }
        return new Hx(d9, d10, cr.P());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        r8 = r12.b();
        r10 = r12.b();
        r9 = r9 - 16;
        r11 = new byte[r9];
        r12.H(r11, 0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        r9 = new com.google.android.gms.internal.ads.C3668nw(r11, r10, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        com.IceFishing.LiveIceFishing.k.y(r6, "Failed to parse metadata entry with key: ", "MetadataUtil");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static O3 e(Iw iw) {
        Zw i = iw.i(1751411826);
        Zw i4 = iw.i(1801812339);
        Zw i6 = iw.i(1768715124);
        if (i != null && i4 != null && i6 != null) {
            Cr cr = i.f29750c;
            cr.E(16);
            if (cr.b() == 1835299937) {
                Cr cr2 = i4.f29750c;
                cr2.E(12);
                int b9 = cr2.b();
                String[] strArr = new String[b9];
                for (int i9 = 0; i9 < b9; i9++) {
                    int b10 = cr2.b();
                    cr2.G(4);
                    strArr[i9] = cr2.k(b10 - 8, StandardCharsets.UTF_8);
                }
                Cr cr3 = i6.f29750c;
                cr3.E(8);
                ArrayList arrayList = new ArrayList();
                while (cr3.B() > 8) {
                    int b11 = cr3.b() + cr3.f24998b;
                    int b12 = cr3.b() - 1;
                    if (b12 < 0 || b12 >= b9) {
                        com.IceFishing.LiveIceFishing.k.t(b12, "Skipped metadata with unknown key index: ", "BoxParsers", new StringBuilder(String.valueOf(b12).length() + 41));
                    } else {
                        String str = strArr[b12];
                        while (true) {
                            int i10 = cr3.f24998b;
                            if (i10 >= b11) {
                                break;
                            }
                            int b13 = cr3.b();
                            if (cr3.b() == 1684108385) {
                                break;
                            }
                            cr3.E(i10 + b13);
                        }
                        C3668nw c3668nw = null;
                        if (c3668nw != null) {
                            arrayList.add(c3668nw);
                        }
                    }
                    cr3.E(b11);
                }
                if (!arrayList.isEmpty()) {
                    return new O3(arrayList);
                }
            }
        }
        return null;
    }

    public static void f(Cr cr) {
        int i = cr.f24998b;
        cr.G(4);
        if (cr.b() != 1751411826) {
            i += 4;
        }
        cr.E(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:250:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04ad  */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3031c3 g(Z2 z22, Iw iw, Z0 z02) {
        C0 c02;
        boolean z6;
        int i;
        int i4;
        int i6;
        boolean z9;
        long j6;
        DP dp;
        Z2 z23;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        long[] jArr2;
        boolean z10;
        long[] jArr3;
        boolean z11;
        long j9;
        int i9;
        int i10;
        Z2 z24;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        long[] jArr4;
        int i18;
        long j11;
        Z2 z25;
        SC sc;
        Z2 z26;
        int i19;
        Z2 z27;
        long[] jArr5;
        long[] jArr6;
        int i20;
        long[] jArr7;
        int i21;
        int i22;
        boolean z12;
        long j12;
        Z2 z28 = z22;
        Zw i23 = iw.i(1937011578);
        DP dp2 = z28.f29608g;
        if (i23 != null) {
            C3944t2 c3944t2 = new C3944t2();
            Cr cr = i23.f29750c;
            c3944t2.f34979v = cr;
            cr.E(12);
            int h3 = cr.h();
            if (com.anythink.basead.exoplayer.k.o.f9251w.equals(dp2.f25176o)) {
                int f2 = AbstractC3182eu.f(dp2.f25156K) * dp2.f25154H;
                if (h3 % f2 != 0) {
                    AbstractC2991bG.y("BoxParsers", D.x.o(new StringBuilder(String.valueOf(f2).length() + 66 + String.valueOf(h3).length()), "Audio sample size mismatch. stsd sample size: ", f2, ", stsz sample size: ", h3));
                    h3 = f2;
                }
            }
            if (h3 == 0) {
                h3 = -1;
            }
            c3944t2.f34977n = h3;
            c3944t2.f34978u = cr.h();
            c02 = c3944t2;
        } else {
            Zw i24 = iw.i(1937013298);
            if (i24 == null) {
                throw U4.a(null, "Track has no sample table size information");
            }
            c02 = new C0(i24);
        }
        int c9 = c02.c();
        if (c9 == 0) {
            return new C3031c3(z28, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (z28.f29603b == 2) {
            long j13 = z28.f29607f;
            if (j13 > 0) {
                dp2.getClass();
                C3322hP c3322hP = new C3322hP(dp2);
                float f9 = c9 / (j13 / 1000000.0f);
                AbstractC2792Sd.i(f9 == -1.0f || f9 > 0.0f);
                c3322hP.f31569y = f9;
                DP dp3 = new DP(c3322hP);
                Y2 y22 = new Y2(z28);
                y22.f29419g = dp3;
                z28 = new Z2(y22);
            }
        }
        Zw i25 = iw.i(1937007471);
        if (i25 == null) {
            i25 = iw.i(1668232756);
            i25.getClass();
            z6 = true;
        } else {
            z6 = false;
        }
        Zw i26 = iw.i(1937011555);
        i26.getClass();
        Zw i27 = iw.i(1937011827);
        i27.getClass();
        Zw i28 = iw.i(1937011571);
        Cr cr2 = i28 != null ? i28.f29750c : null;
        Zw i29 = iw.i(1668576371);
        Cr cr3 = i29 != null ? i29.f29750c : null;
        F2 f22 = new F2(i26.f29750c, i25.f29750c, z6);
        Cr cr4 = i27.f29750c;
        cr4.E(12);
        int h9 = cr4.h() - 1;
        int h10 = cr4.h();
        int h11 = cr4.h();
        if (cr3 != null) {
            cr3.E(12);
            i = cr3.h();
        } else {
            i = 0;
        }
        if (cr2 != null) {
            cr2.E(12);
            i6 = cr2.h();
            if (i6 > 0) {
                i4 = cr2.h() - 1;
            } else {
                i4 = -1;
                cr2 = null;
            }
        } else {
            i4 = -1;
            i6 = 0;
        }
        int f10 = c02.f();
        Cr cr5 = cr3;
        DP dp4 = z28.f29608g;
        if (f10 != -1) {
            String str = dp4.f25176o;
            if ((com.anythink.basead.exoplayer.k.o.f9251w.equals(str) || com.anythink.basead.exoplayer.k.o.f9253y.equals(str) || com.anythink.basead.exoplayer.k.o.f9252x.equals(str)) && h9 == 0) {
                z9 = i == 0 && i6 == 0;
                h9 = 0;
                ArrayList arrayList2 = new ArrayList();
                ?? r32 = cr2 != null ? 1 : 0;
                if (z9) {
                    long[] jArr8 = new long[c9];
                    int[] iArr3 = new int[c9];
                    int i30 = i6;
                    long[] jArr9 = new long[c9];
                    int[] iArr4 = new int[c9];
                    int i31 = i30;
                    Cr cr6 = cr2;
                    C0 c03 = c02;
                    int i32 = h9;
                    int i33 = i4;
                    long j14 = 0;
                    long j15 = 0;
                    j6 = 0;
                    int i34 = i;
                    int i35 = 0;
                    int i36 = 0;
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = h10;
                    int i40 = 0;
                    while (true) {
                        if (i40 >= c9) {
                            dp = dp4;
                            z23 = z28;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            jArr = jArr8;
                            jArr2 = jArr9;
                            break;
                        }
                        long j16 = j14;
                        boolean z13 = true;
                        while (true) {
                            if (i37 != 0) {
                                dp = dp4;
                                i18 = i37;
                                break;
                            }
                            z13 = f22.a();
                            dp = dp4;
                            if (!z13) {
                                i18 = 0;
                                break;
                            }
                            j16 = f22.f25483d;
                            i37 = f22.f25482c;
                            z28 = z28;
                            dp4 = dp;
                        }
                        z23 = z28;
                        if (!z13) {
                            AbstractC2991bG.y("BoxParsers", "Unexpected end of chunk data");
                            jArr = Arrays.copyOf(jArr8, i40);
                            int[] copyOf = Arrays.copyOf(iArr3, i40);
                            long[] copyOf2 = Arrays.copyOf(jArr9, i40);
                            iArr = copyOf;
                            iArr2 = Arrays.copyOf(iArr4, i40);
                            c9 = i40;
                            jArr2 = copyOf2;
                            break;
                        }
                        if (cr5 != null) {
                            while (true) {
                                if (i38 != 0) {
                                    break;
                                }
                                if (i34 <= 0) {
                                    i38 = 0;
                                    break;
                                }
                                i34--;
                                i38 = cr5.h();
                                i35 = cr5.b();
                            }
                            i38--;
                        }
                        int i41 = c03.i();
                        long[] jArr10 = jArr8;
                        long[] jArr11 = jArr9;
                        long j17 = i41;
                        j6 += j17;
                        if (i41 > i36) {
                            i36 = i41;
                        }
                        jArr10[i40] = j16;
                        iArr3[i40] = i41;
                        int i42 = i18;
                        jArr11[i40] = j15 + i35;
                        iArr4[i40] = r32;
                        if (i40 == i33) {
                            iArr4[i40] = 1;
                            arrayList2.add(Integer.valueOf(i40));
                        }
                        if (cr6 != null && i40 == i33 && i31 - 1 > 0) {
                            i33 = cr6.h() - 1;
                        }
                        j15 += h11;
                        int i43 = i39 - 1;
                        if (i43 != 0) {
                            i39 = i43;
                        } else if (i32 > 0) {
                            i32--;
                            i39 = cr4.h();
                            h11 = cr4.b();
                        } else {
                            i39 = 0;
                        }
                        long j18 = j16 + j17;
                        i37 = i42 - 1;
                        i40++;
                        jArr8 = jArr10;
                        jArr9 = jArr11;
                        z28 = z23;
                        j14 = j18;
                        dp4 = dp;
                    }
                    long j19 = j15 + i35;
                    if (cr5 != null) {
                        while (i34 > 0) {
                            if (cr5.h() != 0) {
                                z10 = false;
                                break;
                            }
                            cr5.b();
                            i34--;
                        }
                    }
                    z10 = true;
                    if (i31 != 0) {
                        jArr3 = jArr;
                        z11 = z10;
                        j9 = j19;
                        i9 = i37;
                        i10 = i39;
                        z24 = z23;
                        i11 = i31;
                        i12 = i32;
                        i13 = i38;
                    } else if (i39 != 0) {
                        jArr3 = jArr;
                        z11 = z10;
                        j9 = j19;
                        i9 = i37;
                        i10 = i39;
                        z24 = z23;
                        i12 = i32;
                        i13 = i38;
                        i11 = 0;
                    } else if (i37 != 0) {
                        jArr3 = jArr;
                        z11 = z10;
                        j9 = j19;
                        i9 = i37;
                        z24 = z23;
                        i12 = i32;
                        i13 = i38;
                        i11 = 0;
                        i10 = 0;
                    } else if (i32 != 0) {
                        jArr3 = jArr;
                        z11 = z10;
                        j9 = j19;
                        z24 = z23;
                        i12 = i32;
                        i13 = i38;
                        i11 = 0;
                        i10 = 0;
                        i9 = 0;
                    } else if (i38 != 0) {
                        jArr3 = jArr;
                        z11 = z10;
                        j9 = j19;
                        z24 = z23;
                        i13 = i38;
                        i11 = 0;
                        i10 = 0;
                        i9 = 0;
                        i12 = 0;
                    } else if (z10) {
                        jArr3 = jArr;
                        j9 = j19;
                        arrayList = arrayList2;
                        i15 = i36;
                        z24 = z23;
                        i14 = c9;
                        i16 = i15;
                        j10 = j9;
                        i17 = i14;
                        jArr4 = jArr3;
                    } else {
                        jArr3 = jArr;
                        j9 = j19;
                        z24 = z23;
                        z11 = false;
                        i11 = 0;
                        i10 = 0;
                        i9 = 0;
                        i12 = 0;
                        i13 = 0;
                    }
                    int i44 = z24.f29602a;
                    int length = String.valueOf(i12).length() + String.valueOf(i9).length() + String.valueOf(i10).length() + String.valueOf(i11).length() + String.valueOf(i44).length() + 66 + 35 + 26 + 33 + 36;
                    int length2 = String.valueOf(i13).length();
                    arrayList = arrayList2;
                    String str2 = true != z11 ? ", ctts invalid" : "";
                    i14 = c9;
                    StringBuilder sb = new StringBuilder(str2.length() + length + length2);
                    i15 = i36;
                    AbstractC5128c.g(sb, "Inconsistent stbl box for track ", i44, ": remainingSynchronizationSamples ", i11);
                    AbstractC5128c.g(sb, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i9);
                    AbstractC5128c.g(sb, ", remainingTimestampDeltaChanges ", i12, ", remainingSamplesAtTimestampOffset ", i13);
                    sb.append(str2);
                    AbstractC2991bG.y("BoxParsers", sb.toString());
                    i16 = i15;
                    j10 = j9;
                    i17 = i14;
                    jArr4 = jArr3;
                } else {
                    int i45 = f22.f25480a;
                    long[] jArr12 = new long[i45];
                    int[] iArr5 = new int[i45];
                    while (f22.a()) {
                        int i46 = f22.f25481b;
                        jArr12[i46] = f22.f25483d;
                        iArr5[i46] = f22.f25482c;
                    }
                    long j20 = h11;
                    int i47 = 8192 / f10;
                    int i48 = 0;
                    for (int i49 = 0; i49 < i45; i49++) {
                        int i50 = iArr5[i49];
                        String str3 = AbstractC3182eu.f30782a;
                        i48 += ((i50 + i47) - 1) / i47;
                    }
                    long[] jArr13 = new long[i48];
                    iArr = new int[i48];
                    jArr2 = new long[i48];
                    iArr2 = new int[i48];
                    int i51 = 0;
                    int i52 = 0;
                    int i53 = 0;
                    int i54 = 0;
                    int i55 = 0;
                    while (i51 < i45) {
                        int i56 = iArr5[i51];
                        long j21 = jArr12[i51];
                        int i57 = i55;
                        int i58 = i45;
                        int i59 = i54;
                        int i60 = i57;
                        int i61 = i51;
                        int i62 = i56;
                        while (i62 > 0) {
                            int min = Math.min(i47, i62);
                            jArr13[i60] = j21;
                            int i63 = i62;
                            int i64 = f10 * min;
                            iArr[i60] = i64;
                            i53 += i64;
                            int max = Math.max(i59, i64);
                            jArr2[i60] = i52 * j20;
                            iArr2[i60] = 1;
                            j21 += iArr[i60];
                            i52 += min;
                            i62 = i63 - min;
                            i60++;
                            i59 = max;
                        }
                        i51 = i61 + 1;
                        int i65 = i60;
                        i54 = i59;
                        i45 = i58;
                        i55 = i65;
                    }
                    dp = dp4;
                    j6 = i53;
                    arrayList = arrayList2;
                    j10 = j20 * i52;
                    jArr4 = jArr13;
                    i17 = i48;
                    i16 = i54;
                    z24 = z28;
                }
                int[] iArr6 = iArr;
                j11 = z24.f29607f;
                if (j11 > 0) {
                    long w3 = AbstractC3182eu.w(j6 * 8, 1000000L, j11, RoundingMode.HALF_DOWN);
                    if (w3 > 0 && w3 < 2147483647L) {
                        dp.getClass();
                        C3322hP c3322hP2 = new C3322hP(dp);
                        c3322hP2.f31553h = (int) w3;
                        DP dp5 = new DP(c3322hP2);
                        Y2 y23 = new Y2(z24);
                        y23.f29419g = dp5;
                        z25 = new Z2(y23);
                        RoundingMode roundingMode = RoundingMode.DOWN;
                        long j22 = z25.f29604c;
                        long w6 = AbstractC3182eu.w(j10, 1000000L, j22, roundingMode);
                        int[] n9 = UC.n(arrayList);
                        sc = z25.i;
                        if (sc == null) {
                            AbstractC3182eu.x(jArr2, j22);
                            return new C3031c3(z25, jArr4, iArr6, i16, jArr2, iArr2, n9, r32, w6, i17);
                        }
                        Z2 z29 = z25;
                        int[] iArr7 = iArr2;
                        int i66 = z29.f29603b;
                        DP dp6 = z29.f29608g;
                        SC sc2 = z29.f29610j;
                        int i67 = sc.f28138u;
                        int i68 = 1;
                        if (i67 == 1 && i66 == 1) {
                            int length3 = jArr2.length;
                            if (length3 >= 2) {
                                sc2.getClass();
                                long a9 = sc2.a(0);
                                long a10 = sc.a(0);
                                long j23 = z29.f29605d;
                                long w9 = a9 + AbstractC3182eu.w(a10, j22, j23, roundingMode);
                                int i69 = length3 - 1;
                                int max2 = Math.max(0, Math.min(4, i69));
                                int max3 = Math.max(0, Math.min(length3 - 4, i69));
                                if (jArr2[0] > a9 || a9 >= jArr2[max2] || jArr2[max3] >= w9 || w9 > 2 + j10) {
                                    z26 = z29;
                                    j22 = j22;
                                } else {
                                    long max4 = Math.max(0L, j10 - w9);
                                    long j24 = a9 - jArr2[0];
                                    long j25 = dp6.J;
                                    long w10 = AbstractC3182eu.w(j24, j25, j22, roundingMode);
                                    long w11 = AbstractC3182eu.w(max4, j25, j22, roundingMode);
                                    j22 = j22;
                                    if (w10 == 0) {
                                        if (w11 != 0) {
                                            j12 = 0;
                                        }
                                        z26 = z29;
                                    } else {
                                        j12 = w10;
                                    }
                                    if (j12 <= 2147483647L && w11 <= 2147483647L) {
                                        z02.f29596a = (int) j12;
                                        z02.f29597b = (int) w11;
                                        AbstractC3182eu.x(jArr2, j22);
                                        return new C3031c3(z29, jArr4, iArr6, i16, jArr2, iArr7, n9, r32, AbstractC3182eu.w(sc.a(0), 1000000L, j23, roundingMode), i17);
                                    }
                                    z26 = z29;
                                }
                                i19 = i67;
                            } else {
                                z26 = z29;
                                i19 = i67;
                            }
                            i68 = 1;
                        } else {
                            z26 = z29;
                            i19 = i67;
                        }
                        if (i19 == i68) {
                            if (sc.a(0) == 0) {
                                sc2.getClass();
                                long a11 = sc2.a(0);
                                for (int i70 = 0; i70 < jArr2.length; i70++) {
                                    jArr2[i70] = AbstractC3182eu.w(jArr2[i70] - a11, 1000000L, j22, RoundingMode.DOWN);
                                }
                                return new C3031c3(z26, jArr4, iArr6, i16, jArr2, iArr7, n9, r32, AbstractC3182eu.w(j10 - a11, 1000000L, j22, RoundingMode.DOWN), i17);
                            }
                            i68 = 1;
                        }
                        long j26 = j22;
                        Z2 z210 = z26;
                        long[] jArr14 = jArr4;
                        int i71 = i17;
                        boolean z14 = i66 == i68;
                        int[] iArr8 = new int[i19];
                        int[] iArr9 = new int[i19];
                        sc2.getClass();
                        boolean z15 = z14;
                        int i72 = 0;
                        int i73 = 0;
                        int i74 = 0;
                        boolean z16 = false;
                        while (i73 < i19) {
                            int[] iArr10 = iArr8;
                            int[] iArr11 = iArr9;
                            long a12 = sc2.a(i73);
                            if (a12 != -1) {
                                boolean z17 = z16;
                                jArr7 = jArr14;
                                long j27 = j26;
                                j26 = j27;
                                long w12 = AbstractC3182eu.w(sc.a(i73), j27, z210.f29605d, RoundingMode.DOWN) + a12;
                                i20 = i73;
                                iArr10[i20] = AbstractC3182eu.s(jArr2, a12, true);
                                int binarySearch = Arrays.binarySearch(jArr2, w12);
                                if (binarySearch < 0) {
                                    binarySearch = ~binarySearch;
                                } else {
                                    while (true) {
                                        i21 = binarySearch + 1;
                                        if (i21 >= jArr2.length || jArr2[i21] != w12) {
                                            break;
                                        }
                                        binarySearch = i21;
                                    }
                                    if (!z15) {
                                        binarySearch = i21;
                                    }
                                }
                                int i75 = binarySearch - 1;
                                int i76 = 0;
                                while (binarySearch < jArr2.length) {
                                    if (jArr2[binarySearch] >= w12) {
                                        i76++;
                                        if (i76 > dp6.f25178q) {
                                            break;
                                        }
                                    } else {
                                        i75 = binarySearch;
                                    }
                                    binarySearch++;
                                }
                                iArr11[i20] = i75 + 1;
                                int i77 = iArr10[i20];
                                while (true) {
                                    i22 = iArr10[i20];
                                    if (i22 <= 0 || (iArr7[i22] & 1) != 0) {
                                        break;
                                    }
                                    iArr10[i20] = i22 - 1;
                                }
                                if (i22 == 0) {
                                    z12 = false;
                                    if ((iArr7[0] & 1) == 0) {
                                        iArr10[i20] = i77;
                                        while (true) {
                                            i22 = iArr10[i20];
                                            if (i22 >= iArr11[i20] || (iArr7[i22] & 1) != 0) {
                                                break;
                                            }
                                            iArr10[i20] = i22 + 1;
                                        }
                                    }
                                } else {
                                    z12 = false;
                                }
                                int i78 = iArr11[i20];
                                int i79 = (i78 - i22) + i74;
                                z16 = z17 | (i72 != i22 ? true : z12);
                                i72 = i78;
                                i74 = i79;
                            } else {
                                i20 = i73;
                                jArr7 = jArr14;
                            }
                            i73 = i20 + 1;
                            iArr8 = iArr10;
                            iArr9 = iArr11;
                            jArr14 = jArr7;
                        }
                        int[] iArr12 = iArr8;
                        int[] iArr13 = iArr9;
                        long[] jArr15 = jArr14;
                        boolean z18 = z16 | (i74 != i71);
                        long[] jArr16 = z18 ? new long[i74] : jArr15;
                        int[] iArr14 = z18 ? new int[i74] : iArr6;
                        if (true == z18) {
                            i16 = 0;
                        }
                        int[] iArr15 = z18 ? new int[i74] : iArr7;
                        ArrayList arrayList3 = z18 ? new ArrayList() : arrayList;
                        long[] jArr17 = new long[i74];
                        int i80 = 0;
                        boolean z19 = false;
                        int i81 = 0;
                        long j28 = 0;
                        while (i81 < i19) {
                            long a13 = sc2.a(i81);
                            long[] jArr18 = jArr17;
                            int i82 = iArr12[i81];
                            boolean z20 = z19;
                            int i83 = iArr13[i81];
                            int i84 = i19;
                            if (z18) {
                                int i85 = i83 - i82;
                                jArr5 = jArr2;
                                jArr6 = jArr15;
                                System.arraycopy(jArr6, i82, jArr16, i80, i85);
                                System.arraycopy(iArr6, i82, iArr14, i80, i85);
                                System.arraycopy(iArr7, i82, iArr15, i80, i85);
                            } else {
                                jArr5 = jArr2;
                                jArr6 = jArr15;
                            }
                            boolean z21 = z20;
                            int i86 = i80;
                            int i87 = i16;
                            while (i82 < i83) {
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                int[] iArr16 = iArr14;
                                int[] iArr17 = iArr15;
                                long w13 = AbstractC3182eu.w(j28, 1000000L, z210.f29605d, roundingMode2);
                                long w14 = AbstractC3182eu.w(jArr5[i82] - a13, 1000000L, j26, roundingMode2);
                                z21 = (!(w14 >= 0)) | z21;
                                jArr18[i86] = w13 + w14;
                                if (z18 && iArr16[i86] > i87) {
                                    i87 = iArr6[i82];
                                }
                                if (z18 && r32 == 0) {
                                    if ((iArr17[i86] & 1) != 0) {
                                        arrayList3.add(Integer.valueOf(i86));
                                    }
                                }
                                i82++;
                                i86++;
                                iArr14 = iArr16;
                                iArr15 = iArr17;
                            }
                            j28 = sc.a(i81) + j28;
                            i81++;
                            i16 = i87;
                            z19 = z21;
                            jArr15 = jArr6;
                            jArr2 = jArr5;
                            iArr14 = iArr14;
                            jArr17 = jArr18;
                            iArr15 = iArr15;
                            i19 = i84;
                            i80 = i86;
                        }
                        int[] iArr18 = iArr14;
                        int[] iArr19 = iArr15;
                        long[] jArr19 = jArr17;
                        boolean z30 = z19;
                        long w15 = AbstractC3182eu.w(j28, 1000000L, z210.f29605d, RoundingMode.DOWN);
                        if (z30) {
                            dp6.getClass();
                            C3322hP c3322hP3 = new C3322hP(dp6);
                            c3322hP3.f31564t = true;
                            DP dp7 = new DP(c3322hP3);
                            Y2 y24 = new Y2(z210);
                            y24.f29419g = dp7;
                            z27 = new Z2(y24);
                        } else {
                            z27 = z210;
                        }
                        return new C3031c3(z27, jArr16, iArr18, i16, jArr19, iArr19, UC.n(arrayList3), r32, w15, jArr16.length);
                    }
                }
                z25 = z24;
                RoundingMode roundingMode3 = RoundingMode.DOWN;
                long j222 = z25.f29604c;
                long w62 = AbstractC3182eu.w(j10, 1000000L, j222, roundingMode3);
                int[] n92 = UC.n(arrayList);
                sc = z25.i;
                if (sc == null) {
                }
            }
        }
        z9 = false;
        ArrayList arrayList22 = new ArrayList();
        if (cr2 != null) {
        }
        if (z9) {
        }
        int[] iArr62 = iArr;
        j11 = z24.f29607f;
        if (j11 > 0) {
        }
        z25 = z24;
        RoundingMode roundingMode32 = RoundingMode.DOWN;
        long j2222 = z25.f29604c;
        long w622 = AbstractC3182eu.w(j10, 1000000L, j2222, roundingMode32);
        int[] n922 = UC.n(arrayList);
        sc = z25.i;
        if (sc == null) {
        }
    }

    public static Pair h(Iw iw) {
        Zw i = iw.i(1701606260);
        if (i == null) {
            return null;
        }
        Cr cr = i.f29750c;
        cr.E(8);
        int a9 = a(cr.b());
        int h3 = cr.h();
        long[] jArr = new long[h3];
        long[] jArr2 = new long[h3];
        int i4 = 0;
        int i6 = 0;
        for (int i9 = 0; i9 < h3; i9++) {
            long j6 = a9 == 1 ? cr.j() : cr.P();
            int i10 = i4 + 1;
            int length = jArr.length;
            if (i10 > length) {
                int i11 = length + (length >> 1) + 1;
                if (i11 < i10) {
                    int highestOneBit = Integer.highestOneBit(i4);
                    i11 = highestOneBit + highestOneBit;
                }
                if (i11 < 0) {
                    i11 = Integer.MAX_VALUE;
                }
                jArr = Arrays.copyOf(jArr, i11);
            }
            jArr[i4] = j6;
            i4++;
            long d9 = a9 == 1 ? cr.d() : cr.b();
            int i12 = i6 + 1;
            int length2 = jArr2.length;
            if (i12 > length2) {
                int i13 = length2 + (length2 >> 1) + 1;
                if (i13 < i12) {
                    int highestOneBit2 = Integer.highestOneBit(i6);
                    i13 = highestOneBit2 + highestOneBit2;
                }
                jArr2 = Arrays.copyOf(jArr2, i13 >= 0 ? i13 : Integer.MAX_VALUE);
            }
            jArr2[i6] = d9;
            i6++;
            if (cr.N() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            cr.G(2);
        }
        SC sc = SC.f28136v;
        SC sc2 = i4 == 0 ? sc : new SC(jArr, i4);
        if (i6 != 0) {
            sc = new SC(jArr2, i6);
        }
        return Pair.create(sc2, sc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:571:0x0162, code lost:
    
        if (r12 == (-1)) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x08ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(Cr cr, int i, int i4, int i6, int i9, String str, boolean z6, EO eo, J3.q qVar, int i10) {
        int i11;
        int i12;
        int L2;
        int b9;
        int i13;
        int i14;
        String str2;
        String str3;
        boolean z9;
        int i15;
        String str4;
        String str5;
        int i16;
        List list;
        int i17;
        int i18;
        Cr cr2;
        int i19;
        int i20;
        int i21;
        String str6;
        String str7;
        G2 g22;
        int i22;
        int i23;
        int i24;
        String str8;
        int i25;
        int i26;
        int i27;
        int h3;
        boolean z10;
        int i28;
        int i29;
        boolean z11;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z12;
        String str9;
        Cr cr3 = cr;
        int i34 = i;
        int i35 = i6;
        EO eo2 = eo;
        cr3.E(i4 + 16);
        if (z6) {
            int L6 = cr3.L();
            cr3.G(6);
            i11 = L6;
        } else {
            cr3.G(8);
            i11 = 0;
        }
        if (i11 == 0 || i11 == 1) {
            i12 = 2;
            L2 = cr3.L();
            cr3.G(6);
            int f2 = cr3.f();
            cr3.E(cr3.f24998b - 4);
            b9 = cr3.b();
            if (i11 == 1) {
                cr3.G(16);
            }
            i13 = f2;
            i14 = -1;
        } else {
            if (i11 != 2) {
                return;
            }
            cr3.G(16);
            int round = (int) Math.round(Double.longBitsToDouble(cr3.d()));
            int h9 = cr3.h();
            cr3.G(4);
            i12 = 2;
            int h10 = cr3.h();
            int h11 = cr3.h();
            int i36 = h11 & 1;
            int i37 = h11 & 2;
            i14 = i36 != 0 ? AbstractC3182eu.c(h10, i37 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN) : AbstractC3182eu.b(h10, i37 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            if (i14 == 0) {
                i14 = -1;
            }
            cr3.G(8);
            i13 = round;
            L2 = h9;
            b9 = 0;
        }
        int i38 = 8;
        if (i34 == 1767992678) {
            L2 = -1;
            i13 = -1;
        } else {
            if (i34 == 1935764850) {
                i13 = 8000;
            } else if (i34 == 1935767394) {
                i13 = 16000;
                i34 = 1935767394;
            }
            L2 = 1;
        }
        int i39 = cr3.f24998b;
        int i40 = 1701733217;
        if (i34 == 1701733217) {
            Pair k9 = k(cr3, i4, i35);
            if (k9 != null) {
                i40 = ((Integer) k9.first).intValue();
                eo2 = eo2 == null ? null : eo2.a(((C2924a3) k9.second).f29781b);
                ((C2924a3[]) qVar.f1504c)[i10] = (C2924a3) k9.second;
            }
            i34 = i40;
            cr3.E(i39);
        }
        String str10 = "audio/mhm1";
        String str11 = com.anythink.basead.exoplayer.k.o.f9254z;
        if (i34 == 1633889587) {
            str2 = com.anythink.basead.exoplayer.k.o.f9254z;
        } else if (i34 == 1700998451) {
            str2 = com.anythink.basead.exoplayer.k.o.f9206A;
        } else if (i34 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i34 == 1685353315) {
            str2 = com.anythink.basead.exoplayer.k.o.f9209D;
        } else if (i34 == 1685353320 || i34 == 1685353324) {
            str2 = com.anythink.basead.exoplayer.k.o.f9210E;
        } else if (i34 == 1685353317) {
            str2 = com.anythink.basead.exoplayer.k.o.f9211F;
        } else if (i34 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i34 == 1935764850) {
            str2 = com.anythink.basead.exoplayer.k.o.f9214I;
        } else if (i34 == 1935767394) {
            str2 = com.anythink.basead.exoplayer.k.o.J;
        } else {
            if (i34 != 1936684916) {
                if (i34 == 1953984371) {
                    i14 = 268435456;
                } else if (i34 != 1819304813) {
                    if (i34 == 778924082 || i34 == 778924083) {
                        str2 = com.anythink.basead.exoplayer.k.o.f9248t;
                    } else if (i34 == 1835557169) {
                        str2 = "audio/mha1";
                    } else if (i34 == 1835560241) {
                        str2 = "audio/mhm1";
                    } else if (i34 == 1634492771) {
                        str2 = com.anythink.basead.exoplayer.k.o.f9216L;
                    } else if (i34 == 1634492791) {
                        str2 = com.anythink.basead.exoplayer.k.o.f9252x;
                    } else if (i34 == 1970037111) {
                        str2 = com.anythink.basead.exoplayer.k.o.f9253y;
                    } else if (i34 == 1332770163) {
                        str2 = com.anythink.basead.exoplayer.k.o.f9213H;
                    } else if (i34 == 1716281667) {
                        str2 = com.anythink.basead.exoplayer.k.o.f9215K;
                    } else if (i34 == 1835823201) {
                        str2 = com.anythink.basead.exoplayer.k.o.f9208C;
                    } else if (i34 == 1767992678) {
                        str2 = "audio/iamf";
                        i34 = 1767992678;
                    } else {
                        str2 = null;
                    }
                }
                str2 = com.anythink.basead.exoplayer.k.o.f9251w;
            }
            i14 = i12;
            str2 = com.anythink.basead.exoplayer.k.o.f9251w;
        }
        int i41 = i13;
        int i42 = i14;
        List list2 = null;
        String str12 = null;
        G2 g23 = null;
        C3403j0 c3403j0 = null;
        while (i39 - i4 < i35) {
            cr3.E(i39);
            int b10 = cr3.b();
            int i43 = L2;
            MA.k("childAtomSize must be positive", b10 > 0);
            int b11 = cr3.b();
            if (b11 == 1835557187) {
                cr3.E(i39 + 8);
                cr3.G(1);
                int K7 = cr3.K();
                cr3.G(1);
                String format = Objects.equals(str2, str10) ? String.format("mhm1.%02X", Integer.valueOf(K7)) : String.format("mha1.%02X", Integer.valueOf(K7));
                int L8 = cr3.L();
                byte[] bArr = new byte[L8];
                str3 = str10;
                z9 = false;
                cr3.H(bArr, 0, L8);
                list2 = list2 == null ? RB.j(bArr) : RB.k(bArr, (byte[]) list2.get(0));
                L2 = i43;
                i21 = i34;
                str4 = str11;
                str12 = format;
            } else {
                str3 = str10;
                z9 = false;
                if (b11 == 1835557200) {
                    cr3.E(i39 + 8);
                    int K8 = cr3.K();
                    if (K8 > 0) {
                        byte[] bArr2 = new byte[K8];
                        cr3.H(bArr2, 0, K8);
                        if (list2 == null) {
                            list2 = RB.j(bArr2);
                            L2 = i43;
                            i21 = i34;
                            str4 = str11;
                        } else {
                            list2 = RB.k((byte[]) list2.get(0), bArr2);
                            L2 = i43;
                            i21 = i34;
                            str4 = str11;
                            str7 = str2;
                            i16 = b10;
                            i17 = i39;
                            cr2 = cr3;
                        }
                    } else {
                        L2 = i43;
                        i21 = i34;
                        str4 = str11;
                        str5 = str2;
                        i16 = b10;
                        list = list2;
                        i17 = i39;
                        i18 = i41;
                        cr2 = cr3;
                        str7 = str5;
                        i41 = i18;
                        list2 = list;
                    }
                } else {
                    if (b11 == 1702061171) {
                        L2 = i43;
                        i15 = i34;
                        str4 = str11;
                        str5 = str2;
                        i16 = b10;
                        list = list2;
                        i17 = i39;
                        i18 = i41;
                        cr2 = cr3;
                        i19 = i17;
                        i20 = -1;
                    } else if (z6 && b11 == 2002876005) {
                        int i44 = cr3.f24998b;
                        MA.k(null, i44 >= i39);
                        while (true) {
                            if (i44 - i39 < b10) {
                                cr3.E(i44);
                                int b12 = cr3.b();
                                MA.k("childAtomSize must be positive", b12 > 0);
                                int i45 = i44;
                                if (cr3.b() != 1702061171) {
                                    i44 = i45 + b12;
                                } else {
                                    L2 = i43;
                                    i15 = i34;
                                    str4 = str11;
                                    str5 = str2;
                                    i16 = b10;
                                    list = list2;
                                    i17 = i39;
                                    i18 = i41;
                                    i20 = -1;
                                    cr2 = cr3;
                                    i19 = i45;
                                }
                            } else {
                                L2 = i43;
                                i15 = i34;
                                str4 = str11;
                                str5 = str2;
                                i16 = b10;
                                list = list2;
                                i17 = i39;
                                i18 = i41;
                                i20 = -1;
                                cr2 = cr3;
                                i19 = -1;
                            }
                        }
                    } else if (b11 == 1651798644) {
                        cr3.E(i39 + 8);
                        cr3.G(4);
                        i16 = b10;
                        L2 = i43;
                        i21 = i34;
                        str4 = str11;
                        str7 = str2;
                        c3403j0 = new C3403j0(cr3.P(), cr3.P());
                        i17 = i39;
                        cr2 = cr3;
                    } else {
                        i16 = b10;
                        int[] iArr = AbstractC3066cl.f30361x;
                        int[] iArr2 = AbstractC3066cl.f30359v;
                        if (b11 == 1684103987) {
                            cr3.E(i39 + 8);
                            String num = Integer.toString(i9);
                            C4256yr c4256yr = new C4256yr();
                            c4256yr.a(cr3);
                            int i46 = iArr2[c4256yr.h(i12)];
                            c4256yr.f(i38);
                            int i47 = iArr[c4256yr.h(3)];
                            if (c4256yr.h(1) != 0) {
                                i47++;
                            }
                            int i48 = AbstractC3066cl.f30362y[c4256yr.h(5)] * 1000;
                            c4256yr.k();
                            cr3.E(c4256yr.c());
                            C3322hP c3322hP = new C3322hP();
                            c3322hP.f31546a = num;
                            c3322hP.e(str11);
                            c3322hP.f31538G = i47;
                            c3322hP.f31540I = i46;
                            c3322hP.f31562r = eo2;
                            c3322hP.f31549d = str;
                            c3322hP.f31553h = i48;
                            c3322hP.i = i48;
                            qVar.f1505d = new DP(c3322hP);
                            L2 = i43;
                            i21 = i34;
                            str4 = str11;
                            str5 = str2;
                            list = list2;
                            i17 = i39;
                        } else if (b11 == 1684366131) {
                            cr3.E(i39 + 8);
                            String num2 = Integer.toString(i9);
                            C4256yr c4256yr2 = new C4256yr();
                            c4256yr2.a(cr3);
                            int h12 = c4256yr2.h(13) * 1000;
                            str4 = str11;
                            c4256yr2.f(3);
                            int i49 = iArr2[c4256yr2.h(2)];
                            c4256yr2.f(10);
                            int i50 = iArr[c4256yr2.h(3)];
                            if (c4256yr2.h(1) != 0) {
                                i50++;
                            }
                            c4256yr2.f(3);
                            int h13 = c4256yr2.h(4);
                            c4256yr2.f(1);
                            int i51 = i50;
                            if (h13 > 0) {
                                c4256yr2.f(6);
                                i50 = c4256yr2.h(1) != 0 ? i51 + 2 : i51;
                                c4256yr2.f(1);
                            }
                            i17 = i39;
                            if (c4256yr2.b() > 7) {
                                c4256yr2.f(7);
                                if (c4256yr2.h(1) != 0) {
                                    str9 = com.anythink.basead.exoplayer.k.o.f9207B;
                                    c4256yr2.k();
                                    cr3.E(c4256yr2.c());
                                    C3322hP c3322hP2 = new C3322hP();
                                    c3322hP2.f31546a = num2;
                                    c3322hP2.e(str9);
                                    c3322hP2.f31538G = i50;
                                    c3322hP2.f31540I = i49;
                                    c3322hP2.f31562r = eo2;
                                    c3322hP2.f31549d = str;
                                    c3322hP2.i = h12;
                                    qVar.f1505d = new DP(c3322hP2);
                                    L2 = i43;
                                    i21 = i34;
                                    str5 = str2;
                                    list = list2;
                                }
                            }
                            str9 = com.anythink.basead.exoplayer.k.o.f9206A;
                            c4256yr2.k();
                            cr3.E(c4256yr2.c());
                            C3322hP c3322hP22 = new C3322hP();
                            c3322hP22.f31546a = num2;
                            c3322hP22.e(str9);
                            c3322hP22.f31538G = i50;
                            c3322hP22.f31540I = i49;
                            c3322hP22.f31562r = eo2;
                            c3322hP22.f31549d = str;
                            c3322hP22.i = h12;
                            qVar.f1505d = new DP(c3322hP22);
                            L2 = i43;
                            i21 = i34;
                            str5 = str2;
                            list = list2;
                        } else {
                            str4 = str11;
                            i17 = i39;
                            if (b11 == 1684103988) {
                                cr3.E(i17 + 8);
                                String num3 = Integer.toString(i9);
                                C4256yr c4256yr3 = new C4256yr();
                                c4256yr3.a(cr3);
                                int b13 = c4256yr3.b();
                                int h14 = c4256yr3.h(3);
                                if (h14 > 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(h14).length() + 30);
                                    sb.append("Unsupported AC-4 DSI version: ");
                                    sb.append(h14);
                                    throw U4.c(sb.toString());
                                }
                                int h15 = c4256yr3.h(7);
                                int i52 = true != c4256yr3.g() ? 44100 : 48000;
                                c4256yr3.f(4);
                                int h16 = c4256yr3.h(9);
                                int i53 = 1;
                                if (h15 > 1) {
                                    if (h14 == 0) {
                                        throw U4.c("Invalid AC-4 DSI version: 0");
                                    }
                                    if (c4256yr3.g()) {
                                        c4256yr3.f(16);
                                        if (c4256yr3.g()) {
                                            c4256yr3.f(128);
                                        }
                                    }
                                    i53 = 1;
                                }
                                if (h14 == i53) {
                                    i24 = h15;
                                    if (c4256yr3.b() < 66) {
                                        throw U4.c("Invalid AC-4 DSI bitrate.");
                                    }
                                    c4256yr3.f(66);
                                    c4256yr3.k();
                                } else {
                                    i24 = h15;
                                }
                                B0 b02 = new B0();
                                b02.f24568a = true;
                                b02.f24569b = -1;
                                b02.f24570c = -1;
                                b02.f24571d = true;
                                list = list2;
                                b02.f24572e = 2;
                                b02.f24573f = 1;
                                b02.f24574g = 0;
                                int i54 = 0;
                                while (i54 < h16) {
                                    if (h14 == 0) {
                                        boolean g9 = c4256yr3.g();
                                        int h17 = c4256yr3.h(5);
                                        str8 = str2;
                                        h3 = c4256yr3.h(5);
                                        i21 = i34;
                                        z10 = g9;
                                        i28 = h17;
                                        i29 = 0;
                                        z11 = false;
                                        i30 = 0;
                                    } else {
                                        int i55 = h16;
                                        int h18 = c4256yr3.h(8);
                                        str8 = str2;
                                        int h19 = c4256yr3.h(8);
                                        i21 = i34;
                                        int h20 = h19 == 255 ? c4256yr3.h(16) + com.anythink.basead.exoplayer.k.p.f9259b : h19;
                                        if (h18 > 2) {
                                            c4256yr3.f(h20 * 8);
                                            i54++;
                                            h16 = i55;
                                            str2 = str8;
                                            i34 = i21;
                                        } else {
                                            int b14 = (b13 - c4256yr3.b()) / 8;
                                            int i56 = h20;
                                            int h21 = c4256yr3.h(5);
                                            z11 = h21 == 31;
                                            i30 = b14;
                                            h3 = h18;
                                            i28 = h21;
                                            i29 = i56;
                                            z10 = false;
                                        }
                                    }
                                    b02.f24573f = h3;
                                    boolean z13 = z11;
                                    if (z10 || z13 || i28 != 6) {
                                        b02.f24574g = c4256yr3.h(3);
                                        if (c4256yr3.g()) {
                                            c4256yr3.f(5);
                                        }
                                        c4256yr3.f(2);
                                        int i57 = 1;
                                        if (h14 == 1) {
                                            if (h3 != 1) {
                                                if (h3 == 2) {
                                                    h3 = 2;
                                                }
                                            }
                                            c4256yr3.f(2);
                                        }
                                        c4256yr3.f(5);
                                        c4256yr3.f(10);
                                        if (h14 == 1) {
                                            if (h3 > 0) {
                                                b02.f24568a = c4256yr3.g();
                                            }
                                            if (b02.f24568a) {
                                                if (h3 != 1) {
                                                    i32 = 2;
                                                    if (h3 == 2) {
                                                        i31 = 2;
                                                    } else {
                                                        i31 = h3;
                                                        c4256yr3.f(24);
                                                        i57 = 1;
                                                    }
                                                } else {
                                                    i31 = 1;
                                                }
                                                int h22 = c4256yr3.h(5);
                                                if (h22 >= 0 && h22 <= 15) {
                                                    b02.f24569b = h22;
                                                }
                                                if (h22 < 11 || h22 > 14) {
                                                    i32 = 2;
                                                } else {
                                                    b02.f24571d = c4256yr3.g();
                                                    i32 = 2;
                                                    b02.f24572e = c4256yr3.h(2);
                                                }
                                                c4256yr3.f(24);
                                                i57 = 1;
                                            } else {
                                                i32 = 2;
                                                i31 = h3;
                                            }
                                            if (h3 == i57 || h3 == i32) {
                                                if (c4256yr3.g() && c4256yr3.g()) {
                                                    c4256yr3.f(i32);
                                                }
                                                if (c4256yr3.g()) {
                                                    c4256yr3.e();
                                                    int i58 = 8;
                                                    int h23 = c4256yr3.h(8);
                                                    int i59 = 0;
                                                    while (i59 < h23) {
                                                        c4256yr3.f(i58);
                                                        i59++;
                                                        i58 = 8;
                                                    }
                                                }
                                            }
                                        } else {
                                            i31 = h3;
                                        }
                                        if (!z10 && !z13) {
                                            c4256yr3.e();
                                            if (i28 == 0 || i28 == 1 || i28 == 2) {
                                                if (i31 == 0) {
                                                    for (int i60 = 0; i60 < 2; i60++) {
                                                        MA.F(c4256yr3, b02);
                                                    }
                                                    i31 = 0;
                                                    c4256yr3.e();
                                                    if (c4256yr3.g()) {
                                                    }
                                                    if (i31 > 0) {
                                                    }
                                                    i33 = 1;
                                                    c4256yr3.k();
                                                    if (h14 == i33) {
                                                    }
                                                    if (b02.f24568a) {
                                                    }
                                                    if (b02.f24568a) {
                                                    }
                                                    if (i25 > 0) {
                                                    }
                                                } else {
                                                    for (int i61 = 0; i61 < 2; i61++) {
                                                        MA.L(c4256yr3, b02);
                                                    }
                                                    c4256yr3.e();
                                                    if (c4256yr3.g()) {
                                                    }
                                                    if (i31 > 0) {
                                                    }
                                                    i33 = 1;
                                                    c4256yr3.k();
                                                    if (h14 == i33) {
                                                    }
                                                    if (b02.f24568a) {
                                                    }
                                                    if (b02.f24568a) {
                                                    }
                                                    if (i25 > 0) {
                                                    }
                                                }
                                            } else if (i28 != 3 && i28 != 4) {
                                                if (i28 != 5) {
                                                    int h24 = c4256yr3.h(7);
                                                    for (int i62 = 0; i62 < h24; i62++) {
                                                        c4256yr3.f(8);
                                                    }
                                                } else if (i31 == 0) {
                                                    MA.F(c4256yr3, b02);
                                                    i31 = 0;
                                                } else {
                                                    int h25 = c4256yr3.h(3);
                                                    for (int i63 = 0; i63 < h25 + 2; i63++) {
                                                        MA.L(c4256yr3, b02);
                                                    }
                                                }
                                                c4256yr3.e();
                                                if (c4256yr3.g()) {
                                                }
                                                if (i31 > 0) {
                                                }
                                                i33 = 1;
                                                c4256yr3.k();
                                                if (h14 == i33) {
                                                }
                                                if (b02.f24568a) {
                                                }
                                                if (b02.f24568a) {
                                                }
                                                if (i25 > 0) {
                                                }
                                            } else if (i31 == 0) {
                                                for (int i64 = 0; i64 < 3; i64++) {
                                                    MA.F(c4256yr3, b02);
                                                }
                                                i31 = 0;
                                                c4256yr3.e();
                                                if (c4256yr3.g()) {
                                                }
                                                if (i31 > 0) {
                                                }
                                                i33 = 1;
                                                c4256yr3.k();
                                                if (h14 == i33) {
                                                }
                                                if (b02.f24568a) {
                                                }
                                                if (b02.f24568a) {
                                                }
                                                if (i25 > 0) {
                                                }
                                            } else {
                                                for (int i65 = 0; i65 < 3; i65++) {
                                                    MA.L(c4256yr3, b02);
                                                }
                                                c4256yr3.e();
                                                if (c4256yr3.g()) {
                                                }
                                                if (i31 > 0) {
                                                }
                                                i33 = 1;
                                                c4256yr3.k();
                                                if (h14 == i33) {
                                                }
                                                if (b02.f24568a) {
                                                }
                                                if (b02.f24568a) {
                                                }
                                                if (i25 > 0) {
                                                }
                                            }
                                        } else if (i31 == 0) {
                                            MA.F(c4256yr3, b02);
                                            i31 = 0;
                                            c4256yr3.e();
                                            if (c4256yr3.g()) {
                                                h3 = i31;
                                            }
                                            if (i31 > 0) {
                                                if (c4256yr3.g()) {
                                                    if (c4256yr3.b() < 66) {
                                                        z12 = false;
                                                    } else {
                                                        c4256yr3.f(66);
                                                        z12 = true;
                                                    }
                                                    if (!z12) {
                                                        throw U4.c("Can't parse bitrate DSI.");
                                                    }
                                                }
                                                if (c4256yr3.g()) {
                                                    c4256yr3.k();
                                                    c4256yr3.l(c4256yr3.h(16));
                                                    int h26 = c4256yr3.h(5);
                                                    for (int i66 = 0; i66 < h26; i66++) {
                                                        c4256yr3.f(3);
                                                        c4256yr3.f(8);
                                                    }
                                                    i33 = 1;
                                                    c4256yr3.k();
                                                    if (h14 == i33) {
                                                        int b15 = ((b13 - c4256yr3.b()) / 8) - i30;
                                                        if (i29 < b15) {
                                                            throw U4.c("pres_bytes is smaller than presentation bytes read.");
                                                        }
                                                        c4256yr3.l(i29 - b15);
                                                    }
                                                    if (b02.f24568a && b02.f24569b == -1) {
                                                        StringBuilder sb2 = new StringBuilder(String.valueOf(i54).length() + 45);
                                                        sb2.append("Can't determine channel mode of presentation ");
                                                        sb2.append(i54);
                                                        throw U4.c(sb2.toString());
                                                    }
                                                    if (b02.f24568a) {
                                                        int i67 = b02.f24570c;
                                                        if (i67 > 0) {
                                                            i25 = i67 + 1;
                                                            if (b02.f24574g == 4 && i25 == 17) {
                                                                i25 = 21;
                                                            }
                                                        } else {
                                                            int i68 = b02.f24574g;
                                                            if (i68 != 0) {
                                                                if (i68 == 1) {
                                                                    i25 = 6;
                                                                } else if (i68 == 2) {
                                                                    i25 = 8;
                                                                } else if (i68 == 3) {
                                                                    i25 = 10;
                                                                } else if (i68 != 4) {
                                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(i68).length() + 33);
                                                                    sb3.append("AC-4 level ");
                                                                    sb3.append(i68);
                                                                    sb3.append(" has not been defined.");
                                                                    AbstractC2991bG.y("Ac4Util", sb3.toString());
                                                                } else {
                                                                    i25 = 12;
                                                                }
                                                            }
                                                            i25 = 2;
                                                        }
                                                    } else {
                                                        int i69 = b02.f24569b;
                                                        boolean z14 = b02.f24571d;
                                                        int i70 = b02.f24572e;
                                                        switch (i69) {
                                                            case 0:
                                                                i26 = 11;
                                                                i27 = 1;
                                                                break;
                                                            case 1:
                                                                i26 = 11;
                                                                i27 = 2;
                                                                break;
                                                            case 2:
                                                                i26 = 11;
                                                                i27 = 3;
                                                                break;
                                                            case 3:
                                                                i26 = 11;
                                                                i27 = 5;
                                                                break;
                                                            case 4:
                                                                i26 = 11;
                                                                i27 = 6;
                                                                break;
                                                            case 5:
                                                            case 7:
                                                            case 9:
                                                                i26 = 11;
                                                                i27 = 7;
                                                                break;
                                                            case 6:
                                                            case 8:
                                                            case 10:
                                                                i26 = 11;
                                                                i27 = 8;
                                                                break;
                                                            case 11:
                                                                i26 = 11;
                                                                i27 = 11;
                                                                break;
                                                            case 12:
                                                                i26 = 11;
                                                                i27 = 12;
                                                                break;
                                                            case 13:
                                                                i26 = 11;
                                                                i27 = 13;
                                                                break;
                                                            case 14:
                                                                i26 = 11;
                                                                i27 = 14;
                                                                break;
                                                            case 15:
                                                                i26 = 11;
                                                                i27 = 24;
                                                                break;
                                                            default:
                                                                i26 = 11;
                                                                i27 = -1;
                                                                break;
                                                        }
                                                        if (i69 == i26 || i69 == 12 || i69 == 13 || i69 == 14) {
                                                            if (!z14) {
                                                                i27 -= 2;
                                                            }
                                                            if (i70 == 0) {
                                                                i25 = i27 - 4;
                                                            } else if (i70 == 1) {
                                                                i25 = i27 - 2;
                                                            }
                                                        }
                                                        i25 = i27;
                                                    }
                                                    if (i25 > 0) {
                                                        throw U4.c("Cannot determine channel count of presentation.");
                                                    }
                                                    Object[] objArr = {Integer.valueOf(i24), Integer.valueOf(b02.f24573f), Integer.valueOf(b02.f24574g)};
                                                    String str13 = AbstractC3182eu.f30782a;
                                                    String format2 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                                    C3322hP c3322hP3 = new C3322hP();
                                                    c3322hP3.f31546a = num3;
                                                    c3322hP3.e("audio/ac4");
                                                    c3322hP3.f31538G = i25;
                                                    c3322hP3.f31540I = i52;
                                                    c3322hP3.f31562r = eo2;
                                                    c3322hP3.f31549d = str;
                                                    c3322hP3.f31554j = format2;
                                                    qVar.f1505d = new DP(c3322hP3);
                                                    cr2 = cr;
                                                    L2 = i43;
                                                    i18 = i41;
                                                    str5 = str8;
                                                    i38 = 8;
                                                }
                                            }
                                            i33 = 1;
                                            c4256yr3.k();
                                            if (h14 == i33) {
                                            }
                                            if (b02.f24568a) {
                                                StringBuilder sb22 = new StringBuilder(String.valueOf(i54).length() + 45);
                                                sb22.append("Can't determine channel mode of presentation ");
                                                sb22.append(i54);
                                                throw U4.c(sb22.toString());
                                            }
                                            if (b02.f24568a) {
                                            }
                                            if (i25 > 0) {
                                            }
                                        } else {
                                            MA.L(c4256yr3, b02);
                                            c4256yr3.e();
                                            if (c4256yr3.g()) {
                                            }
                                            if (i31 > 0) {
                                            }
                                            i33 = 1;
                                            c4256yr3.k();
                                            if (h14 == i33) {
                                            }
                                            if (b02.f24568a) {
                                            }
                                            if (b02.f24568a) {
                                            }
                                            if (i25 > 0) {
                                            }
                                        }
                                        str7 = str5;
                                        i41 = i18;
                                        list2 = list;
                                    }
                                    int h27 = c4256yr3.h(7);
                                    for (int i71 = 0; i71 < h27; i71++) {
                                        c4256yr3.f(15);
                                    }
                                    i31 = h3;
                                    if (i31 > 0) {
                                    }
                                    i33 = 1;
                                    c4256yr3.k();
                                    if (h14 == i33) {
                                    }
                                    if (b02.f24568a) {
                                    }
                                    if (b02.f24568a) {
                                    }
                                    if (i25 > 0) {
                                    }
                                }
                                i21 = i34;
                                str8 = str2;
                                if (b02.f24568a) {
                                }
                                if (i25 > 0) {
                                }
                            } else {
                                i21 = i34;
                                str7 = str2;
                                list = list2;
                                if (b11 == 1684892784) {
                                    if (b9 <= 0) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(b9).length() + 49);
                                        sb4.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                        sb4.append(b9);
                                        throw U4.a(null, sb4.toString());
                                    }
                                    cr2 = cr;
                                    i41 = b9;
                                    list2 = list;
                                    L2 = 2;
                                    i38 = 8;
                                } else if (b11 == 1684305011 || b11 == 1969517683) {
                                    i38 = 8;
                                    cr2 = cr;
                                    i15 = i21;
                                    C3322hP c3322hP4 = new C3322hP();
                                    c3322hP4.c(i9);
                                    str5 = str7;
                                    c3322hP4.e(str5);
                                    L2 = i43;
                                    c3322hP4.f31538G = L2;
                                    i18 = i41;
                                    c3322hP4.f31540I = i18;
                                    c3322hP4.f31562r = eo2;
                                    c3322hP4.f31549d = str;
                                    qVar.f1505d = new DP(c3322hP4);
                                    i21 = i15;
                                    str7 = str5;
                                    i41 = i18;
                                    list2 = list;
                                } else {
                                    if (b11 == 1682927731) {
                                        i38 = 8;
                                        int i72 = i16 - 8;
                                        byte[] bArr3 = f26400a;
                                        int length = bArr3.length;
                                        byte[] copyOf = Arrays.copyOf(bArr3, length + i72);
                                        cr2 = cr;
                                        cr2.E(i17 + 8);
                                        cr2.H(copyOf, length, i72);
                                        list2 = AbstractC3066cl.i(copyOf);
                                    } else {
                                        i38 = 8;
                                        cr2 = cr;
                                        if (b11 == 1684425825) {
                                            byte[] bArr4 = new byte[i16 - 8];
                                            bArr4[0] = 102;
                                            bArr4[1] = 76;
                                            bArr4[2] = 97;
                                            bArr4[3] = 67;
                                            cr2.E(i17 + 12);
                                            cr2.H(bArr4, 4, i16 - 12);
                                            list2 = RB.j(bArr4);
                                        } else if (b11 == 1634492771) {
                                            int i73 = i16 - 12;
                                            byte[] bArr5 = new byte[i73];
                                            cr2.E(i17 + 12);
                                            cr2.H(bArr5, 0, i73);
                                            byte[] bArr6 = AbstractC4305zm.f36216a;
                                            Cr cr4 = new Cr(bArr5);
                                            cr4.E(5);
                                            int K9 = cr4.K();
                                            cr4.E(9);
                                            int K10 = cr4.K();
                                            cr4.E(20);
                                            int[] iArr3 = {cr4.h(), K10, K9};
                                            int i74 = iArr3[0];
                                            int i75 = iArr3[1];
                                            int b16 = AbstractC3182eu.b(K9, ByteOrder.LITTLE_ENDIAN);
                                            if (b16 == 0) {
                                                b16 = -1;
                                            }
                                            list2 = RB.j(bArr5);
                                            i42 = b16;
                                            i41 = i74;
                                            L2 = i75;
                                        } else if (b11 == 1767990114) {
                                            cr2.E(i17 + 9);
                                            int a9 = UC.a(cr2.p());
                                            byte[] bArr7 = new byte[a9];
                                            cr2.H(bArr7, 0, a9);
                                            byte[] bArr8 = AbstractC4305zm.f36216a;
                                            Cr cr5 = new Cr(bArr7);
                                            String str14 = null;
                                            String str15 = null;
                                            while (cr5.B() > 0 && (str14 == null || str15 == null)) {
                                                int K11 = cr5.K();
                                                int i76 = K11 >> 3;
                                                int i77 = K11 & 2;
                                                int i78 = K11 & 1;
                                                int a10 = UC.a(cr5.p());
                                                if (i76 > 4 && i76 < 24 && i77 != 0) {
                                                    do {
                                                    } while ((cr5.K() & 128) != 0);
                                                    for (i23 = 128; (cr5.K() & i23) != 0; i23 = 128) {
                                                    }
                                                }
                                                if (i78 != 0) {
                                                    cr5.G(UC.a(cr5.p()));
                                                }
                                                int i79 = cr5.f24998b + a10;
                                                if (i76 == 31) {
                                                    cr5.G(4);
                                                    Object[] objArr2 = {Integer.valueOf(cr5.K()), Integer.valueOf(cr5.K())};
                                                    String str16 = AbstractC3182eu.f30782a;
                                                    str14 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                                } else if (i76 == 0) {
                                                    while ((cr5.K() & 128) != 0) {
                                                    }
                                                    str15 = cr5.k(4, StandardCharsets.UTF_8);
                                                    if (str15.equals("mp4a")) {
                                                        while ((cr5.K() & 128) != 0) {
                                                        }
                                                        cr5.G(2);
                                                        C4256yr c4256yr4 = new C4256yr();
                                                        c4256yr4.a(cr5);
                                                        int h28 = c4256yr4.h(5);
                                                        if (h28 == 31) {
                                                            h28 = c4256yr4.h(6) + 32;
                                                        }
                                                        StringBuilder sb5 = new StringBuilder(str15.length() + 4 + String.valueOf(h28).length());
                                                        sb5.append(str15);
                                                        sb5.append(".40.");
                                                        sb5.append(h28);
                                                        str15 = sb5.toString();
                                                        cr5.E(i79);
                                                    }
                                                }
                                                cr5.E(i79);
                                            }
                                            String p9 = (str14 == null || str15 == null) ? null : D.x.p(new StringBuilder(str14.length() + 1 + str15.length()), str14, com.anythink.core.common.d.j.f13164z, str15);
                                            L2 = i43;
                                            str12 = p9;
                                            list2 = RB.j(bArr7);
                                        } else if (b11 == 1885564227) {
                                            cr2.E(i17 + 12);
                                            ByteOrder byteOrder = (cr2.K() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int K12 = cr2.K();
                                            int b17 = i21 == 1768973165 ? AbstractC3182eu.b(K12, byteOrder) : i21 == 1718641517 ? AbstractC3182eu.c(K12, byteOrder) : i42;
                                            if (b17 == 0) {
                                                b17 = -1;
                                            }
                                            L2 = i43;
                                            i42 = b17;
                                            i21 = i21;
                                            if (b17 != -1) {
                                                str7 = com.anythink.basead.exoplayer.k.o.f9251w;
                                            }
                                            list2 = list;
                                        } else {
                                            L2 = i43;
                                            i18 = i41;
                                            str5 = str7;
                                            str7 = str5;
                                            i41 = i18;
                                            list2 = list;
                                        }
                                    }
                                    L2 = i43;
                                }
                            }
                        }
                        i18 = i41;
                        i38 = 8;
                        cr2 = cr3;
                        str7 = str5;
                        i41 = i18;
                        list2 = list;
                    }
                    if (i19 != i20) {
                        G2 j6 = j(i19, cr2);
                        str5 = (String) j6.f25699v;
                        byte[] bArr9 = (byte[]) j6.f25700w;
                        if (bArr9 == null) {
                            i21 = i15;
                            g23 = j6;
                            str7 = str5;
                            i41 = i18;
                            list2 = list;
                        } else if (com.anythink.basead.exoplayer.k.o.f9212G.equals(str5)) {
                            RC rc = AbstractC3674o1.f33620a;
                            Cr cr6 = new Cr(bArr9);
                            int i80 = 1;
                            cr6.G(1);
                            int i81 = 0;
                            while (true) {
                                g22 = j6;
                                if (cr6.B() > 0) {
                                    int I8 = cr6.I();
                                    i21 = i15;
                                    i22 = com.anythink.basead.exoplayer.k.p.f9259b;
                                    if (I8 == 255) {
                                        cr6.G(i80);
                                        i81 += com.anythink.basead.exoplayer.k.p.f9259b;
                                        j6 = g22;
                                        i15 = i21;
                                        i80 = 1;
                                    }
                                } else {
                                    i21 = i15;
                                    i22 = com.anythink.basead.exoplayer.k.p.f9259b;
                                }
                            }
                            int K13 = cr6.K() + i81;
                            int i82 = 0;
                            while (cr6.B() > 0 && cr6.I() == i22) {
                                cr6.G(1);
                                i82 += i22;
                            }
                            int K14 = cr6.K() + i82;
                            byte[] bArr10 = new byte[K13];
                            int i83 = cr6.f24998b;
                            System.arraycopy(bArr9, i83, bArr10, 0, K13);
                            int i84 = i83 + K13 + K14;
                            int length2 = bArr9.length - i84;
                            byte[] bArr11 = new byte[length2];
                            System.arraycopy(bArr9, i84, bArr11, 0, length2);
                            list2 = RB.k(bArr10, bArr11);
                            g23 = g22;
                            str7 = str5;
                            i41 = i18;
                        } else {
                            i21 = i15;
                            if (com.anythink.basead.exoplayer.k.o.f9246r.equals(str5)) {
                                C3944t2 p10 = AbstractC2659Kg.p(new C4256yr(bArr9, bArr9.length), false);
                                i18 = p10.f34977n;
                                L2 = p10.f34978u;
                                str6 = (String) p10.f34979v;
                            } else {
                                str6 = str12;
                            }
                            g23 = j6;
                            str7 = str5;
                            i41 = i18;
                            str12 = str6;
                            list2 = RB.j(bArr9);
                        }
                    }
                    i21 = i15;
                    str7 = str5;
                    i41 = i18;
                    list2 = list;
                }
                i39 = i17 + i16;
                i35 = i6;
                cr3 = cr2;
                str10 = str3;
                str11 = str4;
                str2 = str7;
                i34 = i21;
                i12 = 2;
            }
            str7 = str2;
            i16 = b10;
            i17 = i39;
            cr2 = cr3;
            i39 = i17 + i16;
            i35 = i6;
            cr3 = cr2;
            str10 = str3;
            str11 = str4;
            str2 = str7;
            i34 = i21;
            i12 = 2;
        }
        String str17 = str2;
        List list3 = list2;
        int i85 = i41;
        if (((DP) qVar.f1505d) != null || str17 == null) {
            return;
        }
        C3322hP c3322hP5 = new C3322hP();
        c3322hP5.c(i9);
        c3322hP5.e(str17);
        c3322hP5.f31554j = str12;
        c3322hP5.f31538G = L2;
        c3322hP5.f31540I = i85;
        c3322hP5.J = i42;
        c3322hP5.f31561q = list3;
        c3322hP5.f31562r = eo2;
        c3322hP5.f31549d = str;
        G2 g24 = g23;
        if (g24 != null) {
            c3322hP5.f31553h = UC.h(g24.f25697n);
            c3322hP5.i = UC.h(g24.f25698u);
        } else {
            C3403j0 c3403j02 = c3403j0;
            if (c3403j02 != null) {
                c3322hP5.f31553h = UC.h(c3403j02.f31940a);
                c3322hP5.i = UC.h(c3403j02.f31941b);
            }
        }
        qVar.f1505d = new DP(c3322hP5);
    }

    public static G2 j(int i, Cr cr) {
        cr.E(i + 12);
        cr.G(1);
        l(cr);
        cr.G(2);
        int K7 = cr.K();
        if ((K7 & 128) != 0) {
            cr.G(2);
        }
        if ((K7 & 64) != 0) {
            cr.G(cr.K());
        }
        if ((K7 & 32) != 0) {
            cr.G(2);
        }
        cr.G(1);
        l(cr);
        String e9 = H4.e(cr.K());
        if (com.anythink.basead.exoplayer.k.o.f9248t.equals(e9) || com.anythink.basead.exoplayer.k.o.f9209D.equals(e9) || com.anythink.basead.exoplayer.k.o.f9210E.equals(e9)) {
            return new G2(e9, null, -1L, -1L);
        }
        cr.G(4);
        long P8 = cr.P();
        long P9 = cr.P();
        cr.G(1);
        int l9 = l(cr);
        long j6 = P9;
        byte[] bArr = new byte[l9];
        cr.H(bArr, 0, l9);
        if (j6 <= 0) {
            j6 = -1;
        }
        return new G2(e9, bArr, j6, P8 > 0 ? P8 : -1L);
    }

    public static Pair k(Cr cr, int i, int i4) {
        Integer num;
        C2924a3 c2924a3;
        Pair create;
        int i6;
        int i9;
        Integer num2;
        boolean z6;
        int i10 = cr.f24998b;
        while (i10 - i < i4) {
            cr.E(i10);
            int b9 = cr.b();
            MA.k("childAtomSize must be positive", b9 > 0);
            if (cr.b() == 1936289382) {
                int i11 = i10 + 8;
                int i12 = 0;
                int i13 = -1;
                Integer num3 = null;
                String str = null;
                while (i11 - i10 < b9) {
                    cr.E(i11);
                    int b10 = cr.b();
                    int b11 = cr.b();
                    if (b11 == 1718775137) {
                        num3 = Integer.valueOf(cr.b());
                    } else if (b11 == 1935894637) {
                        cr.G(4);
                        str = cr.k(4, StandardCharsets.UTF_8);
                    } else if (b11 == 1935894633) {
                        i13 = i11;
                        i12 = b10;
                    }
                    i11 += b10;
                }
                byte[] bArr = null;
                if (com.anythink.basead.exoplayer.b.bd.equals(str) || com.anythink.basead.exoplayer.b.be.equals(str) || com.anythink.basead.exoplayer.b.bf.equals(str) || com.anythink.basead.exoplayer.b.bg.equals(str)) {
                    MA.k("frma atom is mandatory", num3 != null);
                    MA.k("schi atom is mandatory", i13 != -1);
                    int i14 = i13 + 8;
                    while (true) {
                        if (i14 - i13 >= i12) {
                            num = num3;
                            c2924a3 = null;
                            break;
                        }
                        cr.E(i14);
                        int b12 = cr.b();
                        if (cr.b() == 1952804451) {
                            int a9 = a(cr.b());
                            cr.G(1);
                            if (a9 == 0) {
                                cr.G(1);
                                i9 = 0;
                                i6 = 0;
                            } else {
                                int K7 = cr.K();
                                i6 = K7 & 15;
                                i9 = (K7 & 240) >> 4;
                            }
                            if (cr.K() == 1) {
                                num2 = num3;
                                z6 = true;
                            } else {
                                num2 = num3;
                                z6 = false;
                            }
                            int K8 = cr.K();
                            byte[] bArr2 = new byte[16];
                            cr.H(bArr2, 0, 16);
                            if (z6 && K8 == 0) {
                                int K9 = cr.K();
                                byte[] bArr3 = new byte[K9];
                                cr.H(bArr3, 0, K9);
                                bArr = bArr3;
                            }
                            num = num2;
                            c2924a3 = new C2924a3(z6, str, K8, bArr2, i9, i6, bArr);
                        } else {
                            i14 += b12;
                        }
                    }
                    MA.k("tenc atom is mandatory", c2924a3 != null);
                    String str2 = AbstractC3182eu.f30782a;
                    create = Pair.create(num, c2924a3);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i10 += b9;
        }
        return null;
    }

    public static int l(Cr cr) {
        int K7 = cr.K();
        int i = K7 & com.anythink.expressad.video.module.a.a.f22515R;
        while ((K7 & 128) == 128) {
            K7 = cr.K();
            i = (i << 7) | (K7 & com.anythink.expressad.video.module.a.a.f22515R);
        }
        return i;
    }
}
