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

/* loaded from: classes2.dex */
public abstract class J2 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f25647a;

    static {
        String str = AbstractC3159eu.f29993a;
        f25647a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int a(int i) {
        return (i >> 24) & com.anythink.basead.exoplayer.k.p.f8473b;
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
    public static ArrayList b(Iw iw, Z0 z02, long j6, EO eo, boolean z3, boolean z6, UA ua) {
        long j9;
        long j10;
        int i;
        int i6;
        int i9;
        int i10;
        boolean z9;
        int i11;
        long j11;
        long j12;
        long w6;
        int a9;
        int i12;
        int i13;
        int i14;
        int i15;
        long j13;
        long j14;
        long j15;
        int i16;
        int i17;
        String str;
        Zw i18;
        int i19;
        String str2;
        ArrayList arrayList;
        int i20;
        int i21;
        int i22;
        SC sc;
        SC sc2;
        DP dp;
        String str3;
        Z2 z22;
        UA ua2;
        Iw j16;
        Pair h9;
        Zw i23;
        short s9;
        short s10;
        int i24;
        ArrayList arrayList2;
        Iw iw2;
        long j17;
        long j18;
        Cr cr;
        int i25;
        byte b9;
        String str4;
        EO eo2;
        int i26;
        String str5;
        String str6;
        int i27;
        int i28;
        String str7;
        char c9;
        String str8;
        String str9;
        int i29;
        int i30;
        boolean z10;
        String str10;
        int i31;
        int i32;
        boolean z11;
        String str11;
        String str12;
        int i33;
        char c10;
        int i34;
        int i35;
        H3.q qVar;
        C2570Gf c2570Gf;
        int i36;
        String str13;
        boolean z12;
        int i37;
        int i38;
        Qx qx;
        int i39;
        boolean z13;
        String str14;
        int i40;
        boolean z14;
        boolean z15;
        boolean z16;
        EO eo3;
        int i41;
        H3.q qVar2;
        int i42;
        int i43;
        String str15;
        int i44;
        int i45;
        int i46;
        Cr cr2;
        char c11;
        String str16;
        long j19;
        C3500lC c3500lC;
        boolean z17;
        boolean z18;
        ArrayList arrayList3;
        Iw iw3 = iw;
        String str17 = "text/x-unknown";
        String str18 = com.anythink.basead.exoplayer.k.o.f8443Z;
        byte b10 = -1;
        int i47 = 10;
        int i48 = 16;
        int i49 = 4;
        int i50 = 8;
        ArrayList arrayList4 = new ArrayList();
        int i51 = 0;
        while (true) {
            ArrayList arrayList5 = iw3.f25621e;
            if (i51 >= arrayList5.size()) {
                return arrayList4;
            }
            Iw iw4 = (Iw) arrayList5.get(i51);
            if (iw4.f31138b != 1953653099) {
                arrayList3 = arrayList4;
                i19 = i51;
                i = i47;
                str3 = str17;
                str2 = str18;
                i20 = i50;
                i21 = i49;
            } else {
                Zw i52 = iw3.i(1836476516);
                i52.getClass();
                Iw j20 = iw4.j(1835297121);
                j20.getClass();
                Zw i53 = j20.i(1751411826);
                i53.getClass();
                Cr cr3 = i53.f28980c;
                cr3.E(i48);
                int b11 = cr3.b();
                byte b12 = b11 == 1936684398 ? (byte) 1 : b11 == 1986618469 ? (byte) 2 : (b11 == 1952807028 || b11 == 1935832172 || b11 == 1937072756 || b11 == 1668047728 || b11 == 1937072752) ? (byte) 3 : b11 == 1835365473 ? (byte) 5 : b10;
                if (b12 == b10) {
                    ua2 = ua;
                    arrayList = arrayList4;
                    i19 = i51;
                    i = i47;
                    str3 = str17;
                    str2 = str18;
                    i20 = i50;
                    z22 = null;
                    i21 = i49;
                } else {
                    Zw i54 = iw4.i(1953196132);
                    i54.getClass();
                    Cr cr4 = i54.f28980c;
                    cr4.E(i50);
                    int a10 = a(cr4.b());
                    if (a10 != 0) {
                        i50 = 16;
                    }
                    cr4.G(i50);
                    int b13 = cr4.b();
                    cr4.G(i49);
                    int i55 = cr4.f24253b;
                    int i56 = 0;
                    while (true) {
                        if (a10 != 0) {
                            i49 = 8;
                        }
                        j9 = com.anythink.basead.exoplayer.b.f6382b;
                        if (i56 >= i49) {
                            cr4.G(i49);
                            break;
                        }
                        if (cr4.f24252a[i55 + i56] != b10) {
                            j10 = a10 == 0 ? cr4.P() : cr4.j();
                        } else {
                            i56++;
                            i49 = 4;
                        }
                    }
                    cr4.G(i47);
                    int L6 = cr4.L();
                    cr4.G(4);
                    int b14 = cr4.b();
                    i = i47;
                    int b15 = cr4.b();
                    cr4.G(4);
                    int b16 = cr4.b();
                    int b17 = cr4.b();
                    int i57 = com.anythink.basead.exoplayer.b.aX;
                    ArrayList arrayList6 = arrayList4;
                    if (b14 == 0) {
                        if (b15 == 65536) {
                            if (b16 != -65536) {
                                if (b16 == 65536) {
                                    z17 = b17 != 0;
                                    z18 = true;
                                    b16 = 65536;
                                }
                                b15 = 65536;
                            } else if (b17 == 0) {
                                z17 = false;
                                z18 = true;
                            } else {
                                z17 = true;
                                z18 = true;
                            }
                            if (z18 != z17) {
                                i10 = 90;
                                b14 = 0;
                                cr4.G(16);
                                short N8 = cr4.N();
                                int i58 = i10;
                                cr4.G(2);
                                short N9 = cr4.N();
                                Iw iw5 = iw4;
                                int i59 = i51;
                                boolean z19 = (((long) b17) * ((long) b14)) - (((long) i57) * ((long) b16)) >= 0;
                                j11 = j6 != com.anythink.basead.exoplayer.b.f6382b ? j10 : j6;
                                long j21 = d(i52.f28980c).f25415c;
                                if (j11 != com.anythink.basead.exoplayer.b.f6382b) {
                                    j12 = j21;
                                    w6 = -9223372036854775807L;
                                } else {
                                    j12 = j21;
                                    w6 = AbstractC3159eu.w(j11, 1000000L, j12, RoundingMode.DOWN);
                                }
                                Iw j22 = j20.j(1835626086);
                                j22.getClass();
                                Iw j23 = j22.j(1937007212);
                                j23.getClass();
                                Zw i60 = j20.i(1835296868);
                                i60.getClass();
                                Cr cr5 = i60.f28980c;
                                cr5.E(8);
                                a9 = a(cr5.b());
                                cr5.G(a9 != 0 ? 8 : 16);
                                long P8 = cr5.P();
                                i12 = cr5.f24253b;
                                i13 = 0;
                                while (true) {
                                    if (a9 != 0) {
                                        i14 = i12;
                                        i15 = 4;
                                    } else {
                                        i14 = i12;
                                        i15 = 8;
                                    }
                                    if (i13 < i15) {
                                        j13 = w6;
                                        j14 = P8;
                                        cr5.G(i15);
                                        break;
                                    }
                                    j13 = w6;
                                    if (cr5.f24252a[i14 + i13] != -1) {
                                        long P9 = a9 == 0 ? cr5.P() : cr5.j();
                                        if (P9 == 0) {
                                            j15 = -9223372036854775807L;
                                            j14 = P8;
                                        } else {
                                            j9 = AbstractC3159eu.w(P9, 1000000L, P8, RoundingMode.DOWN);
                                            j14 = P8;
                                        }
                                    } else {
                                        i13++;
                                        i12 = i14;
                                        w6 = j13;
                                    }
                                }
                                j15 = j9;
                                int L8 = cr5.L();
                                char[] cArr = {(char) (((L8 >> 10) & 31) + 96), (char) (((L8 >> 5) & 31) + 96), (char) ((L8 & 31) + 96)};
                                i17 = 0;
                                for (i16 = 3; i17 < i16; i16 = 3) {
                                    char c12 = cArr[i17];
                                    if (c12 < 'a' || c12 > 'z') {
                                        str = null;
                                        break;
                                    }
                                    i17++;
                                }
                                str = new String(cArr);
                                i18 = j23.i(1937011556);
                                String str19 = "BoxParsers";
                                if (i18 != null) {
                                    AbstractC2968bG.y("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                                    ua2 = ua;
                                    i19 = i59;
                                    str3 = str17;
                                    str2 = str18;
                                    arrayList = arrayList6;
                                    iw4 = iw5;
                                    i20 = 8;
                                    z22 = null;
                                    i21 = 4;
                                } else {
                                    Cr cr6 = i18.f28980c;
                                    char c13 = '\f';
                                    cr6.E(12);
                                    int b18 = cr6.b();
                                    H3.q qVar3 = new H3.q();
                                    qVar3.f1148c = new C2901a3[b18];
                                    qVar3.f1147b = 0;
                                    int i61 = 0;
                                    while (i61 < b18) {
                                        int i62 = i61;
                                        int i63 = cr6.f24253b;
                                        String str20 = str19;
                                        int b19 = cr6.b();
                                        int i64 = i63;
                                        String str21 = "childAtomSize must be positive";
                                        MA.k("childAtomSize must be positive", b19 > 0);
                                        int b20 = cr6.b();
                                        int i65 = i59;
                                        if (b20 == 1635148593 || b20 == 1635148595 || b20 == 1701733238 || b20 == 1831958048 || b20 == 1836070006 || b20 == 1752589105 || b20 == 1751479857 || b20 == 1987470129 || b20 == 1987471665 || b20 == 1932670515 || b20 == 1211250227 || b20 == 1748121139 || b20 == 1987063864 || b20 == 1987063865 || b20 == 1635135537 || b20 == 1685479798 || b20 == 1685479729 || b20 == 1685481573 || b20 == 1685481521 || b20 == 1634760241 || b20 == 1684108849) {
                                            s9 = N9;
                                            s10 = N8;
                                            i24 = b18;
                                            H3.q qVar4 = qVar3;
                                            int i66 = b13;
                                            String str22 = str20;
                                            int i67 = b19;
                                            arrayList2 = arrayList6;
                                            int i68 = i58;
                                            iw2 = iw5;
                                            j17 = j13;
                                            j18 = j12;
                                            cr = cr6;
                                            cr.E(i64 + 16);
                                            cr.G(16);
                                            int L9 = cr.L();
                                            int L10 = cr.L();
                                            i25 = i62;
                                            cr.G(50);
                                            int i69 = cr.f24253b;
                                            b9 = b12;
                                            str4 = str18;
                                            int i70 = 1701733238;
                                            if (b20 == 1701733238) {
                                                Pair k9 = k(cr, i64, i67);
                                                if (k9 != null) {
                                                    i70 = ((Integer) k9.first).intValue();
                                                    if (eo == null) {
                                                        i64 = i64;
                                                        eo2 = null;
                                                    } else {
                                                        i64 = i64;
                                                        eo2 = eo.a(((C2901a3) k9.second).f29011b);
                                                    }
                                                    ((C2901a3[]) qVar4.f1148c)[i25] = (C2901a3) k9.second;
                                                } else {
                                                    i64 = i64;
                                                    eo2 = eo;
                                                }
                                                cr.E(i69);
                                            } else {
                                                i64 = i64;
                                                eo2 = eo;
                                                i70 = b20;
                                            }
                                            if (i70 == 1831958048) {
                                                int i71 = i70;
                                                str5 = com.anythink.basead.exoplayer.k.o.f8455m;
                                                i26 = i71;
                                            } else {
                                                i26 = 1211250227;
                                                if (i70 == 1211250227) {
                                                    str5 = com.anythink.basead.exoplayer.k.o.f8450g;
                                                } else {
                                                    i26 = i70;
                                                    str5 = null;
                                                }
                                            }
                                            boolean z20 = z19;
                                            EO eo4 = eo2;
                                            String str23 = str;
                                            str6 = str17;
                                            i27 = L6;
                                            String str24 = str5;
                                            float f3 = 1.0f;
                                            List list = null;
                                            int i72 = -1;
                                            int i73 = -1;
                                            int i74 = 8;
                                            C2570Gf c2570Gf2 = null;
                                            int i75 = -1;
                                            int i76 = -1;
                                            int i77 = 8;
                                            boolean z21 = false;
                                            int i78 = -1;
                                            ByteBuffer byteBuffer = null;
                                            int i79 = -1;
                                            String str25 = null;
                                            int i80 = -1;
                                            int i81 = -1;
                                            C3879sE c3879sE = null;
                                            byte[] bArr = null;
                                            C3380j0 c3380j0 = null;
                                            G2 g22 = null;
                                            while (i69 - i64 < i67) {
                                                cr.E(i69);
                                                int i82 = cr.f24253b;
                                                int b21 = cr.b();
                                                int i83 = i69;
                                                if (b21 != 0) {
                                                    i31 = b21;
                                                } else {
                                                    if (cr.f24253b - i64 == i67) {
                                                        break;
                                                    }
                                                    i31 = 0;
                                                }
                                                if (i31 > 0) {
                                                    i32 = i67;
                                                    z11 = true;
                                                } else {
                                                    i32 = i67;
                                                    z11 = false;
                                                }
                                                MA.k(str21, z11);
                                                int b22 = cr.b();
                                                if (b22 == 1635148611) {
                                                    int i84 = i82 + 8;
                                                    MA.k(null, str24 == null);
                                                    cr.E(i84);
                                                    D0 a11 = D0.a(cr);
                                                    qVar4.f1146a = a11.f24291b;
                                                    if (z21) {
                                                        z16 = true;
                                                    } else {
                                                        f3 = a11.f24299k;
                                                        z16 = false;
                                                    }
                                                    ArrayList arrayList7 = a11.f24290a;
                                                    String str26 = a11.f24300l;
                                                    int i85 = a11.f24298j;
                                                    int i86 = a11.f24296g;
                                                    int i87 = a11.f24297h;
                                                    int i88 = a11.i;
                                                    i77 = a11.f24294e;
                                                    int i89 = a11.f24295f;
                                                    i34 = i26;
                                                    str11 = str21;
                                                    str25 = str26;
                                                    i79 = i85;
                                                    qVar = qVar4;
                                                    i33 = i87;
                                                    str12 = com.anythink.basead.exoplayer.k.o.f8451h;
                                                    str13 = str22;
                                                    z21 = z16;
                                                    i75 = i86;
                                                    i72 = i88;
                                                    i74 = i89;
                                                    list = arrayList7;
                                                } else {
                                                    if (b22 == 1752589123) {
                                                        int i90 = i82 + 8;
                                                        MA.k(null, str24 == null);
                                                        cr.E(i90);
                                                        C2899a1 a12 = C2899a1.a(cr, false, null);
                                                        qVar4.f1146a = a12.f28996b;
                                                        if (z21) {
                                                            z15 = true;
                                                        } else {
                                                            f3 = a12.f29005l;
                                                            z15 = false;
                                                        }
                                                        int i91 = a12.f29004k;
                                                        if (i91 != -1) {
                                                            i76 = i91;
                                                        }
                                                        List list2 = a12.f28995a;
                                                        int i92 = a12.f29006m;
                                                        int i93 = a12.f28997c;
                                                        String str27 = a12.f29007n;
                                                        int i94 = a12.f28998d;
                                                        int i95 = a12.f28999e;
                                                        int i96 = a12.f29002h;
                                                        int i97 = a12.i;
                                                        z21 = z15;
                                                        int i98 = a12.f29003j;
                                                        int i99 = a12.f29000f;
                                                        int i100 = a12.f29001g;
                                                        C2570Gf c2570Gf3 = a12.f29008o;
                                                        i34 = i26;
                                                        str11 = str21;
                                                        qVar = qVar4;
                                                        i81 = i94;
                                                        i80 = i95;
                                                        i33 = i97;
                                                        i75 = i96;
                                                        i77 = i99;
                                                        str12 = com.anythink.basead.exoplayer.k.o.i;
                                                        c2570Gf2 = c2570Gf3;
                                                        list = list2;
                                                        i79 = i92;
                                                        str25 = str27;
                                                        str13 = str22;
                                                        i74 = i100;
                                                        i72 = i98;
                                                        i78 = i93;
                                                    } else {
                                                        if (b22 == 1818785347) {
                                                            int i101 = i82 + 8;
                                                            MA.k("lhvC must follow hvcC atom", com.anythink.basead.exoplayer.k.o.i.equals(str24));
                                                            if (c2570Gf2 != null) {
                                                                z14 = ((RB) c2570Gf2.f25042u).size() >= 2;
                                                            } else {
                                                                z14 = false;
                                                                c2570Gf2 = null;
                                                            }
                                                            MA.k("must have at least two layers", z14);
                                                            cr.E(i101);
                                                            c2570Gf2.getClass();
                                                            C2899a1 a13 = C2899a1.a(cr, true, c2570Gf2);
                                                            MA.k("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", qVar4.f1146a == a13.f28996b);
                                                            int i102 = a13.f29002h;
                                                            if (i102 != -1) {
                                                                MA.k("colorSpace must be the same for both views", i75 == i102);
                                                            }
                                                            int i103 = a13.i;
                                                            if (i103 != -1) {
                                                                MA.k("colorRange must be the same for both views", i73 == i103);
                                                            }
                                                            int i104 = a13.f29003j;
                                                            if (i104 != -1) {
                                                                MA.k("colorTransfer must be the same for both views", i72 == i104);
                                                            }
                                                            MA.k("bitdepthLuma must be the same for both views", i77 == a13.f29000f);
                                                            MA.k("bitdepthChroma must be the same for both views", i74 == a13.f29001g);
                                                            if (list != null) {
                                                                PB pb = RB.f27177u;
                                                                OB ob = new OB(4);
                                                                ob.b(list);
                                                                ob.b(a13.f28995a);
                                                                list = ob.f();
                                                            } else {
                                                                MA.k("initializationData must be already set from hvcC atom", false);
                                                            }
                                                            i34 = i26;
                                                            str11 = str21;
                                                            str25 = a13.f29007n;
                                                            i33 = i73;
                                                            str12 = "video/mv-hevc";
                                                            qVar = qVar4;
                                                            str13 = str22;
                                                        } else if (b22 == 1987470147) {
                                                            int i105 = i82 + 8;
                                                            MA.k(null, str24 == null);
                                                            cr.E(i105);
                                                            H3.q a14 = H3.q.a(cr);
                                                            qVar4.f1146a = a14.f1146a;
                                                            String str28 = (String) a14.f1149d;
                                                            C3500lC c3500lC2 = (C3500lC) a14.f1148c;
                                                            i77 = a14.f1147b;
                                                            i34 = i26;
                                                            str11 = str21;
                                                            str25 = str28;
                                                            i33 = i73;
                                                            str12 = "video/vvc";
                                                            qVar = qVar4;
                                                            str13 = str22;
                                                            i79 = 16;
                                                            i74 = i77;
                                                            list = c3500lC2;
                                                        } else if (b22 == 1986361461) {
                                                            cr.E(i82 + 8);
                                                            int i106 = cr.f24253b;
                                                            str12 = str24;
                                                            C3694or c3694or = null;
                                                            while (i106 - i82 < i31) {
                                                                cr.E(i106);
                                                                int b23 = cr.b();
                                                                if (b23 > 0) {
                                                                    i39 = i73;
                                                                    z13 = true;
                                                                } else {
                                                                    i39 = i73;
                                                                    z13 = false;
                                                                }
                                                                MA.k(str21, z13);
                                                                int i107 = i106;
                                                                if (cr.b() == 1702454643) {
                                                                    cr.E(i107 + 8);
                                                                    int i108 = cr.f24253b;
                                                                    while (true) {
                                                                        if (i108 - i107 >= b23) {
                                                                            str14 = str21;
                                                                            i40 = b23;
                                                                            c3694or = null;
                                                                            break;
                                                                        }
                                                                        cr.E(i108);
                                                                        int b24 = cr.b();
                                                                        MA.k(str21, b24 > 0);
                                                                        str14 = str21;
                                                                        if (cr.b() == 1937011305) {
                                                                            cr.G(4);
                                                                            int K7 = cr.K();
                                                                            int i109 = K7 & 1;
                                                                            boolean z23 = (K7 & 2) == 2;
                                                                            boolean z24 = (K7 & 8) == 8;
                                                                            boolean z25 = 1 == i109;
                                                                            i40 = b23;
                                                                            I2 i210 = new I2();
                                                                            i210.f25433a = z25;
                                                                            i210.f25434b = z23;
                                                                            i210.f25435c = z24;
                                                                            c3694or = new C3694or(4, i210);
                                                                        } else {
                                                                            i108 += b24;
                                                                            str21 = str14;
                                                                        }
                                                                    }
                                                                } else {
                                                                    str14 = str21;
                                                                    i40 = b23;
                                                                }
                                                                i106 = i107 + i40;
                                                                i73 = i39;
                                                                str21 = str14;
                                                            }
                                                            str11 = str21;
                                                            i33 = i73;
                                                            if (c3694or == null) {
                                                                qx = null;
                                                                c10 = 3;
                                                            } else {
                                                                c10 = 3;
                                                                qx = new Qx(3, c3694or);
                                                            }
                                                            if (qx != null) {
                                                                C3694or c3694or2 = (C3694or) qx.f27139u;
                                                                if (c2570Gf2 == null) {
                                                                    c2570Gf2 = null;
                                                                } else if (((RB) c2570Gf2.f25042u).size() >= 2) {
                                                                    I2 i211 = (I2) c3694or2.f32954u;
                                                                    MA.k("both eye views must be marked as available", i211.f25433a && i211.f25434b);
                                                                    MA.k("for MV-HEVC, eye_views_reversed must be set to false", !((I2) c3694or2.f32954u).f25435c);
                                                                }
                                                                if (i76 == -1) {
                                                                    i34 = i26;
                                                                    qVar = qVar4;
                                                                    if (true != ((I2) c3694or2.f32954u).f25435c) {
                                                                        str13 = str22;
                                                                        i76 = 4;
                                                                    } else {
                                                                        i76 = 5;
                                                                        str13 = str22;
                                                                    }
                                                                } else {
                                                                    i34 = i26;
                                                                    qVar = qVar4;
                                                                    str13 = str22;
                                                                }
                                                            }
                                                            i34 = i26;
                                                            i35 = i74;
                                                            qVar = qVar4;
                                                            c2570Gf = c2570Gf2;
                                                            i36 = i77;
                                                            str13 = str22;
                                                            i74 = i35;
                                                            c2570Gf2 = c2570Gf;
                                                            i77 = i36;
                                                        } else {
                                                            str11 = str21;
                                                            str12 = str24;
                                                            i33 = i73;
                                                            c10 = 3;
                                                            if (b22 == 1685480259 || b22 == 1685485123 || b22 == 1685485379) {
                                                                i34 = i26;
                                                                i35 = i74;
                                                                qVar = qVar4;
                                                                c2570Gf = c2570Gf2;
                                                                i36 = i77;
                                                                str13 = str22;
                                                                c3879sE = C3879sE.a(cr);
                                                            } else if (b22 == 1987076931) {
                                                                int i110 = i82 + 12;
                                                                MA.k(null, str12 == null);
                                                                cr.E(i110);
                                                                byte K8 = (byte) cr.K();
                                                                byte K9 = (byte) cr.K();
                                                                int K10 = cr.K();
                                                                i74 = K10 >> 4;
                                                                int i111 = K10 >> 1;
                                                                String str29 = i26 == 1987063864 ? com.anythink.basead.exoplayer.k.o.f8452j : com.anythink.basead.exoplayer.k.o.f8453k;
                                                                if (str29.equals(com.anythink.basead.exoplayer.k.o.f8453k)) {
                                                                    byte[] bArr2 = AbstractC4228ym.f35218a;
                                                                    byte[] bArr3 = new byte[12];
                                                                    i38 = 1;
                                                                    bArr3[0] = 1;
                                                                    bArr3[1] = 1;
                                                                    bArr3[2] = K8;
                                                                    bArr3[3] = 2;
                                                                    bArr3[4] = 1;
                                                                    bArr3[5] = K9;
                                                                    bArr3[6] = 3;
                                                                    bArr3[7] = 1;
                                                                    bArr3[8] = (byte) i74;
                                                                    bArr3[9] = 4;
                                                                    bArr3[i] = 1;
                                                                    bArr3[11] = (byte) (i111 & 7);
                                                                    list = RB.j(bArr3);
                                                                } else {
                                                                    i38 = 1;
                                                                }
                                                                int i112 = K10 & 1;
                                                                int K11 = cr.K();
                                                                int K12 = cr.K();
                                                                int b25 = KJ.b(K11);
                                                                int i113 = i38 != i112 ? 2 : 1;
                                                                i72 = KJ.c(K12);
                                                                i34 = i26;
                                                                i33 = i113;
                                                                i75 = b25;
                                                                qVar = qVar4;
                                                                str12 = str29;
                                                                str13 = str22;
                                                                i77 = i74;
                                                            } else {
                                                                if (b22 == 1635135811) {
                                                                    int i114 = i31 - 8;
                                                                    byte[] bArr4 = new byte[i114];
                                                                    cr.H(bArr4, 0, i114);
                                                                    list = RB.j(bArr4);
                                                                    C0 d2 = C0.d(bArr4);
                                                                    if (d2 != null) {
                                                                        str25 = (String) d2.f24007y;
                                                                        i72 = d2.f24006x;
                                                                        i37 = d2.f24005w;
                                                                        i75 = d2.f24004v;
                                                                        i77 = d2.f24003u;
                                                                        i74 = i77;
                                                                    } else {
                                                                        i37 = i33;
                                                                    }
                                                                    i34 = i26;
                                                                    str12 = "video/av01";
                                                                    i33 = i37;
                                                                } else if (b22 == 1668050025) {
                                                                    if (byteBuffer == null) {
                                                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                                    }
                                                                    ByteBuffer byteBuffer2 = byteBuffer;
                                                                    byteBuffer2.position(21);
                                                                    byteBuffer2.putShort(cr.N());
                                                                    byteBuffer2.putShort(cr.N());
                                                                    i34 = i26;
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
                                                                    i34 = i26;
                                                                    short N14 = cr.N();
                                                                    int i115 = i74;
                                                                    short N15 = cr.N();
                                                                    C2570Gf c2570Gf4 = c2570Gf2;
                                                                    short N16 = cr.N();
                                                                    int i116 = i77;
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
                                                                    i74 = i115;
                                                                    c2570Gf2 = c2570Gf4;
                                                                    i77 = i116;
                                                                } else {
                                                                    i34 = i26;
                                                                    i35 = i74;
                                                                    qVar = qVar4;
                                                                    c2570Gf = c2570Gf2;
                                                                    i36 = i77;
                                                                    if (b22 == 1681012275) {
                                                                        MA.k(null, str12 == null);
                                                                        str12 = com.anythink.basead.exoplayer.k.o.f8450g;
                                                                        str13 = str22;
                                                                        i74 = i35;
                                                                        c2570Gf2 = c2570Gf;
                                                                        i77 = i36;
                                                                    } else {
                                                                        if (b22 == 1702061171) {
                                                                            MA.k(null, str12 == null);
                                                                            G2 j24 = j(i82, cr);
                                                                            String str30 = (String) j24.f24909v;
                                                                            byte[] bArr5 = (byte[]) j24.f24910w;
                                                                            if (bArr5 != null) {
                                                                                list = RB.j(bArr5);
                                                                            }
                                                                            g22 = j24;
                                                                            str12 = str30;
                                                                        } else if (b22 == 1651798644) {
                                                                            cr.E(i82 + 8);
                                                                            cr.G(4);
                                                                            c3380j0 = new C3380j0(cr.P(), cr.P());
                                                                        } else if (b22 == 1885434736) {
                                                                            cr.E(i82 + 8);
                                                                            f3 = cr.h() / cr.h();
                                                                            str13 = str22;
                                                                            i74 = i35;
                                                                            c2570Gf2 = c2570Gf;
                                                                            i77 = i36;
                                                                            z21 = true;
                                                                        } else if (b22 == 1937126244) {
                                                                            int i117 = i82 + 8;
                                                                            while (true) {
                                                                                if (i117 - i82 >= i31) {
                                                                                    bArr = null;
                                                                                    break;
                                                                                }
                                                                                cr.E(i117);
                                                                                int b26 = cr.b() + i117;
                                                                                if (cr.b() == 1886547818) {
                                                                                    bArr = Arrays.copyOfRange(cr.f24252a, i117, b26);
                                                                                    break;
                                                                                }
                                                                                i117 = b26;
                                                                            }
                                                                        } else {
                                                                            if (b22 == 1936995172) {
                                                                                int K13 = cr.K();
                                                                                cr.G(3);
                                                                                if (K13 == 0) {
                                                                                    int K14 = cr.K();
                                                                                    if (K14 == 0) {
                                                                                        str13 = str22;
                                                                                        i74 = i35;
                                                                                        c2570Gf2 = c2570Gf;
                                                                                        i77 = i36;
                                                                                        i76 = 0;
                                                                                    } else if (K14 == 1) {
                                                                                        str13 = str22;
                                                                                        i74 = i35;
                                                                                        c2570Gf2 = c2570Gf;
                                                                                        i77 = i36;
                                                                                        i76 = 1;
                                                                                    } else if (K14 == 2) {
                                                                                        str13 = str22;
                                                                                        i74 = i35;
                                                                                        c2570Gf2 = c2570Gf;
                                                                                        i77 = i36;
                                                                                        i76 = 2;
                                                                                    } else if (K14 == 3) {
                                                                                        i76 = 3;
                                                                                        str13 = str22;
                                                                                        i74 = i35;
                                                                                        c2570Gf2 = c2570Gf;
                                                                                        i77 = i36;
                                                                                    }
                                                                                }
                                                                            } else if (b22 == 1634760259) {
                                                                                int i118 = i31 - 12;
                                                                                byte[] bArr6 = new byte[i118];
                                                                                cr.E(i82 + 12);
                                                                                cr.H(bArr6, 0, i118);
                                                                                String b27 = AbstractC4228ym.b(bArr6);
                                                                                C3500lC j25 = RB.j(bArr6);
                                                                                Cr cr7 = new Cr(bArr6);
                                                                                byte[] bArr7 = cr7.f24252a;
                                                                                C4233yr c4233yr = new C4233yr(bArr7, bArr7.length);
                                                                                int i119 = 8;
                                                                                c4233yr.d(cr7.f24253b * 8);
                                                                                int i120 = 1;
                                                                                c4233yr.l(1);
                                                                                int h10 = c4233yr.h(8);
                                                                                int i121 = 0;
                                                                                int i122 = -1;
                                                                                int i123 = -1;
                                                                                int i124 = -1;
                                                                                int i125 = -1;
                                                                                int i126 = -1;
                                                                                while (i121 < h10) {
                                                                                    c4233yr.l(i120);
                                                                                    int h11 = c4233yr.h(i119);
                                                                                    int i127 = 0;
                                                                                    while (i127 < h11) {
                                                                                        c4233yr.f(6);
                                                                                        boolean g4 = c4233yr.g();
                                                                                        c4233yr.e();
                                                                                        c4233yr.l(11);
                                                                                        c4233yr.f(4);
                                                                                        i126 = c4233yr.h(4) + 8;
                                                                                        c4233yr.l(1);
                                                                                        if (g4) {
                                                                                            int h12 = c4233yr.h(i119);
                                                                                            int h13 = c4233yr.h(i119);
                                                                                            c4233yr.l(1);
                                                                                            boolean g9 = c4233yr.g();
                                                                                            i122 = KJ.b(h12);
                                                                                            int i128 = true != g9 ? 2 : 1;
                                                                                            i124 = KJ.c(h13);
                                                                                            i123 = i128;
                                                                                        }
                                                                                        i127++;
                                                                                        i125 = i126;
                                                                                        i119 = 8;
                                                                                    }
                                                                                    i121++;
                                                                                    i120 = 1;
                                                                                    i119 = 8;
                                                                                }
                                                                                KJ kj = new KJ(i122, i123, i124, null, i125, i126);
                                                                                int i129 = kj.f25901e;
                                                                                int i130 = kj.f25902f;
                                                                                int i131 = kj.f25897a;
                                                                                str25 = b27;
                                                                                list = j25;
                                                                                i77 = i129;
                                                                                i33 = kj.f25898b;
                                                                                str12 = "video/apv";
                                                                                str13 = str22;
                                                                                c2570Gf2 = c2570Gf;
                                                                                i72 = kj.f25899c;
                                                                                i75 = i131;
                                                                                i74 = i130;
                                                                            } else if (b22 == 1668246642) {
                                                                                if (i75 != -1) {
                                                                                    str13 = str22;
                                                                                } else if (i72 == -1) {
                                                                                    int b28 = cr.b();
                                                                                    if (b28 == 1852009592 || b28 == 1852009571) {
                                                                                        str13 = str22;
                                                                                        int L11 = cr.L();
                                                                                        int L12 = cr.L();
                                                                                        cr.G(2);
                                                                                        if (i31 == 19) {
                                                                                            if ((cr.K() & 128) != 0) {
                                                                                                i31 = 19;
                                                                                                z12 = true;
                                                                                                int b29 = KJ.b(L11);
                                                                                                int i132 = true == z12 ? 2 : 1;
                                                                                                i72 = KJ.c(L12);
                                                                                                i75 = b29;
                                                                                                i33 = i132;
                                                                                            } else {
                                                                                                i31 = 19;
                                                                                            }
                                                                                        }
                                                                                        z12 = false;
                                                                                        int b292 = KJ.b(L11);
                                                                                        if (true == z12) {
                                                                                        }
                                                                                        i72 = KJ.c(L12);
                                                                                        i75 = b292;
                                                                                        i33 = i132;
                                                                                    } else {
                                                                                        str13 = str22;
                                                                                        AbstractC2968bG.y(str13, "Unsupported color type: ".concat(AbstractC3376ix.g(b28)));
                                                                                        i72 = -1;
                                                                                        i75 = -1;
                                                                                        i74 = i35;
                                                                                        c2570Gf2 = c2570Gf;
                                                                                        i77 = i36;
                                                                                    }
                                                                                } else {
                                                                                    str13 = str22;
                                                                                    i75 = -1;
                                                                                }
                                                                            }
                                                                            str13 = str22;
                                                                        }
                                                                        str13 = str22;
                                                                        i74 = i35;
                                                                        c2570Gf2 = c2570Gf;
                                                                        i77 = i36;
                                                                    }
                                                                }
                                                                qVar = qVar4;
                                                                str13 = str22;
                                                            }
                                                            i74 = i35;
                                                            c2570Gf2 = c2570Gf;
                                                            i77 = i36;
                                                        }
                                                        i69 = i83 + i31;
                                                        str22 = str13;
                                                        i67 = i32;
                                                        str24 = str12;
                                                        i73 = i33;
                                                        i26 = i34;
                                                        str21 = str11;
                                                        qVar4 = qVar;
                                                    }
                                                    i69 = i83 + i31;
                                                    str22 = str13;
                                                    i67 = i32;
                                                    str24 = str12;
                                                    i73 = i33;
                                                    i26 = i34;
                                                    str21 = str11;
                                                    qVar4 = qVar;
                                                }
                                                i69 = i83 + i31;
                                                str22 = str13;
                                                i67 = i32;
                                                str24 = str12;
                                                i73 = i33;
                                                i26 = i34;
                                                str21 = str11;
                                                qVar4 = qVar;
                                            }
                                            String str31 = str24;
                                            int i133 = i73;
                                            i28 = i67;
                                            int i134 = i74;
                                            H3.q qVar5 = qVar4;
                                            int i135 = i77;
                                            str7 = str22;
                                            c9 = '\f';
                                            if (c3879sE != null) {
                                                str8 = c3879sE.f33928b;
                                                str9 = "video/dolby-vision";
                                            } else {
                                                str8 = str25;
                                                str9 = str31;
                                            }
                                            if (str9 == null) {
                                                str10 = str23;
                                                z10 = z20;
                                                i29 = i66;
                                                i30 = i68;
                                                qVar3 = qVar5;
                                            } else {
                                                C3299hP c3299hP = new C3299hP();
                                                i29 = i66;
                                                c3299hP.c(i29);
                                                c3299hP.e(str9);
                                                c3299hP.f30788j = str8;
                                                c3299hP.f30799u = L9;
                                                c3299hP.f30800v = L10;
                                                c3299hP.f30801w = i81;
                                                c3299hP.f30802x = i80;
                                                c3299hP.f30767B = f3;
                                                i30 = i68;
                                                c3299hP.f30804z = i30;
                                                z10 = z20;
                                                c3299hP.f30766A = z10;
                                                c3299hP.f30768C = bArr;
                                                c3299hP.f30769D = i76;
                                                c3299hP.f30795q = list;
                                                c3299hP.f30794p = i79;
                                                c3299hP.f30771F = i78;
                                                c3299hP.f30796r = eo4;
                                                str10 = str23;
                                                c3299hP.f30783d = str10;
                                                c3299hP.f30770E = new KJ(i75, i133, i72, byteBuffer != null ? byteBuffer.array() : null, i135, i134);
                                                C3380j0 c3380j02 = c3380j0;
                                                if (c3380j02 != null) {
                                                    c3299hP.f30787h = UC.h(c3380j02.f31153a);
                                                    c3299hP.i = UC.h(c3380j02.f31154b);
                                                } else {
                                                    G2 g23 = g22;
                                                    if (g23 != null) {
                                                        c3299hP.f30787h = UC.h(g23.f24907n);
                                                        c3299hP.i = UC.h(g23.f24908u);
                                                    }
                                                }
                                                DP dp2 = new DP(c3299hP);
                                                qVar3 = qVar5;
                                                qVar3.f1149d = dp2;
                                            }
                                        } else {
                                            if (b20 == 1836069985 || b20 == 1701733217 || b20 == 1633889587 || b20 == 1700998451 || b20 == 1633889588 || b20 == 1835823201 || b20 == 1685353315 || b20 == 1685353317 || b20 == 1685353320 || b20 == 1685353324 || b20 == 1685353336 || b20 == 1935764850 || b20 == 1935767394 || b20 == 1819304813 || b20 == 1936684916 || b20 == 1953984371 || b20 == 778924082 || b20 == 778924083 || b20 == 1835557169 || b20 == 1835560241 || b20 == 1634492771 || b20 == 1634492791 || b20 == 1970037111 || b20 == 1332770163 || b20 == 1716281667 || b20 == 1767992678 || b20 == 1768973165) {
                                                eo3 = eo;
                                                s9 = N9;
                                                i41 = b20;
                                                s10 = N8;
                                                i24 = b18;
                                                qVar2 = qVar3;
                                                i42 = b13;
                                                i43 = i62;
                                                str15 = str20;
                                                i44 = i64;
                                                i45 = b19;
                                                arrayList2 = arrayList6;
                                                i46 = i58;
                                                iw2 = iw5;
                                                j17 = j13;
                                                j18 = j12;
                                                i = 10;
                                            } else if (b20 == 1718641517) {
                                                eo3 = eo;
                                                s9 = N9;
                                                i41 = b20;
                                                s10 = N8;
                                                i24 = b18;
                                                qVar2 = qVar3;
                                                i42 = b13;
                                                i43 = i62;
                                                str15 = str20;
                                                i44 = i64;
                                                i45 = b19;
                                                arrayList2 = arrayList6;
                                                i46 = i58;
                                                iw2 = iw5;
                                                j17 = j13;
                                                j18 = j12;
                                            } else {
                                                if (b20 == 1414810956 || b20 == 1954034535 || b20 == 2004251764 || b20 == 1937010800 || b20 == 1664495672 || b20 == 1836070003 || b20 == 1952807028) {
                                                    cr6.E(i64 + 16);
                                                    if (b20 == 1414810956) {
                                                        cr2 = cr6;
                                                        i24 = b18;
                                                        str16 = str18;
                                                    } else if (b20 == 1954034535) {
                                                        int i136 = b19 - 16;
                                                        byte[] bArr8 = new byte[i136];
                                                        cr6.H(bArr8, 0, i136);
                                                        c3500lC = RB.j(bArr8);
                                                        str16 = com.anythink.basead.exoplayer.k.o.aa;
                                                        cr2 = cr6;
                                                        i24 = b18;
                                                        j19 = Long.MAX_VALUE;
                                                        c11 = 3;
                                                        if (str16 != null) {
                                                            C3299hP c3299hP2 = new C3299hP();
                                                            c3299hP2.c(b13);
                                                            c3299hP2.e(str16);
                                                            c3299hP2.f30783d = str;
                                                            c3299hP2.f30797s = j19;
                                                            c3299hP2.f30795q = c3500lC;
                                                            qVar3.f1149d = new DP(c3299hP2);
                                                        }
                                                        z10 = z19;
                                                        s9 = N9;
                                                        str10 = str;
                                                        s10 = N8;
                                                        str6 = str17;
                                                        i27 = L6;
                                                        b9 = b12;
                                                        str4 = str18;
                                                        i29 = b13;
                                                        i25 = i62;
                                                        str7 = str20;
                                                        i28 = b19;
                                                        arrayList2 = arrayList6;
                                                        i30 = i58;
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
                                                            i24 = b18;
                                                            str16 = str18;
                                                            j19 = 0;
                                                            c3500lC = null;
                                                            c11 = 3;
                                                            if (str16 != null) {
                                                            }
                                                            z10 = z19;
                                                            s9 = N9;
                                                            str10 = str;
                                                            s10 = N8;
                                                            str6 = str17;
                                                            i27 = L6;
                                                            b9 = b12;
                                                            str4 = str18;
                                                            i29 = b13;
                                                            i25 = i62;
                                                            str7 = str20;
                                                            i28 = b19;
                                                            arrayList2 = arrayList6;
                                                            i30 = i58;
                                                            iw2 = iw5;
                                                            j17 = j13;
                                                            j18 = j12;
                                                            cr = cr2;
                                                            i = 10;
                                                            c9 = '\f';
                                                        } else if (b20 == 1664495672) {
                                                            qVar3.f1147b = 1;
                                                            cr2 = cr6;
                                                            str16 = com.anythink.basead.exoplayer.k.o.ac;
                                                        } else {
                                                            if (b20 == 1836070003) {
                                                                int i137 = cr6.f24253b;
                                                                cr6.G(4);
                                                                if (cr6.b() == 1702061171) {
                                                                    byte[] bArr9 = (byte[]) j(i137, cr6).f24910w;
                                                                    if (bArr9 == null) {
                                                                        s9 = N9;
                                                                        s10 = N8;
                                                                        i24 = b18;
                                                                        str6 = str17;
                                                                        i27 = L6;
                                                                        b9 = b12;
                                                                        str4 = str18;
                                                                        i29 = b13;
                                                                        i25 = i62;
                                                                        i28 = b19;
                                                                        arrayList2 = arrayList6;
                                                                        i30 = i58;
                                                                        iw2 = iw5;
                                                                        j17 = j13;
                                                                        j18 = j12;
                                                                    } else if (bArr9.length == 64) {
                                                                        AbstractC2772Sd.H(bArr9.length == 64);
                                                                        ArrayList arrayList8 = new ArrayList(16);
                                                                        int i138 = 0;
                                                                        while (i138 < bArr9.length - 3) {
                                                                            Cr cr8 = cr6;
                                                                            byte[] bArr10 = bArr9;
                                                                            int i139 = i138;
                                                                            int m4 = UC.m(bArr9[i138], bArr9[i138 + 1], bArr10[i138 + 2], bArr10[i138 + 3]);
                                                                            String str32 = AbstractC3159eu.f29993a;
                                                                            int i140 = ((m4 >> 8) & com.anythink.basead.exoplayer.k.p.f8473b) - 128;
                                                                            int i141 = (m4 >> 16) & com.anythink.basead.exoplayer.k.p.f8473b;
                                                                            int max = Math.max(0, Math.min(((i140 * 14075) / 10000) + i141, com.anythink.basead.exoplayer.k.p.f8473b)) << 16;
                                                                            int i142 = (m4 & com.anythink.basead.exoplayer.k.p.f8473b) - 128;
                                                                            arrayList8.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(((i142 * 17790) / 10000) + i141, com.anythink.basead.exoplayer.k.p.f8473b)) | max | (Math.max(0, Math.min((i141 - ((i142 * 3455) / 10000)) - ((i140 * 7169) / 10000), com.anythink.basead.exoplayer.k.p.f8473b)) << 8))));
                                                                            i138 = i139 + 4;
                                                                            cr6 = cr8;
                                                                            bArr9 = bArr10;
                                                                            b18 = b18;
                                                                        }
                                                                        cr2 = cr6;
                                                                        i24 = b18;
                                                                        c11 = 3;
                                                                        Iterator it = arrayList8.iterator();
                                                                        StringBuilder sb = new StringBuilder();
                                                                        AbstractC2968bG.z(sb, it, ", ");
                                                                        String sb2 = sb.toString();
                                                                        StringBuilder sb3 = new StringBuilder(u1.h.a(u1.h.a(String.valueOf((int) N8).length() + 7, i, String.valueOf((int) N9)), 1, sb2));
                                                                        sb3.append("size: ");
                                                                        sb3.append((int) N8);
                                                                        sb3.append("x");
                                                                        sb3.append((int) N9);
                                                                        String s11 = D.y.s(sb3, "\npalette: ", sb2, "\n");
                                                                        String str33 = AbstractC3159eu.f29993a;
                                                                        C3500lC j26 = RB.j(s11.getBytes(StandardCharsets.UTF_8));
                                                                        str16 = com.anythink.basead.exoplayer.k.o.ae;
                                                                        c3500lC = j26;
                                                                    } else {
                                                                        s9 = N9;
                                                                        s10 = N8;
                                                                        i24 = b18;
                                                                        str6 = str17;
                                                                        i27 = L6;
                                                                        b9 = b12;
                                                                        str4 = str18;
                                                                        i29 = b13;
                                                                        i25 = i62;
                                                                        i28 = b19;
                                                                        arrayList2 = arrayList6;
                                                                        i30 = i58;
                                                                        iw2 = iw5;
                                                                        j17 = j13;
                                                                        j18 = j12;
                                                                    }
                                                                } else {
                                                                    cr2 = cr6;
                                                                    i24 = b18;
                                                                    c11 = 3;
                                                                    c3500lC = null;
                                                                    str16 = null;
                                                                }
                                                                j19 = Long.MAX_VALUE;
                                                            } else {
                                                                cr2 = cr6;
                                                                i24 = b18;
                                                                c11 = 3;
                                                                str16 = str17;
                                                                j19 = Long.MAX_VALUE;
                                                                c3500lC = null;
                                                            }
                                                            if (str16 != null) {
                                                            }
                                                            z10 = z19;
                                                            s9 = N9;
                                                            str10 = str;
                                                            s10 = N8;
                                                            str6 = str17;
                                                            i27 = L6;
                                                            b9 = b12;
                                                            str4 = str18;
                                                            i29 = b13;
                                                            i25 = i62;
                                                            str7 = str20;
                                                            i28 = b19;
                                                            arrayList2 = arrayList6;
                                                            i30 = i58;
                                                            iw2 = iw5;
                                                            j17 = j13;
                                                            j18 = j12;
                                                            cr = cr2;
                                                            i = 10;
                                                            c9 = '\f';
                                                        }
                                                        i24 = b18;
                                                    }
                                                    j19 = Long.MAX_VALUE;
                                                    c3500lC = null;
                                                    c11 = 3;
                                                    if (str16 != null) {
                                                    }
                                                    z10 = z19;
                                                    s9 = N9;
                                                    str10 = str;
                                                    s10 = N8;
                                                    str6 = str17;
                                                    i27 = L6;
                                                    b9 = b12;
                                                    str4 = str18;
                                                    i29 = b13;
                                                    i25 = i62;
                                                    str7 = str20;
                                                    i28 = b19;
                                                    arrayList2 = arrayList6;
                                                    i30 = i58;
                                                    iw2 = iw5;
                                                    j17 = j13;
                                                    j18 = j12;
                                                    cr = cr2;
                                                    i = 10;
                                                    c9 = '\f';
                                                } else if (b20 == 1835365492 || b20 == 1769222965) {
                                                    cr6.E(i64 + 16);
                                                    if (b20 == 1835365492) {
                                                        cr6.m();
                                                        String m9 = cr6.m();
                                                        if (m9 != null) {
                                                            C3299hP c3299hP3 = new C3299hP();
                                                            c3299hP3.c(b13);
                                                            c3299hP3.e(m9);
                                                            qVar3.f1149d = new DP(c3299hP3);
                                                        }
                                                    } else if (b20 == 1769222965) {
                                                        int K15 = cr6.K();
                                                        byte[] bArr11 = new byte[K15];
                                                        cr6.H(bArr11, 0, K15);
                                                        C3299hP c3299hP4 = new C3299hP();
                                                        c3299hP4.c(b13);
                                                        c3299hP4.e("application/x-itut-t35");
                                                        c3299hP4.f30795q = RB.j(bArr11);
                                                        qVar3.f1149d = new DP(c3299hP4);
                                                    }
                                                    s9 = N9;
                                                    s10 = N8;
                                                    i24 = b18;
                                                    str6 = str17;
                                                    i27 = L6;
                                                    b9 = b12;
                                                    str4 = str18;
                                                    i29 = b13;
                                                    i25 = i62;
                                                    i28 = b19;
                                                    arrayList2 = arrayList6;
                                                    i30 = i58;
                                                    iw2 = iw5;
                                                    j17 = j13;
                                                    j18 = j12;
                                                } else {
                                                    if (b20 == 1667329389) {
                                                        C3299hP c3299hP5 = new C3299hP();
                                                        c3299hP5.c(b13);
                                                        c3299hP5.e(com.anythink.basead.exoplayer.k.o.ah);
                                                        qVar3.f1149d = new DP(c3299hP5);
                                                    }
                                                    z10 = z19;
                                                    s9 = N9;
                                                    str10 = str;
                                                    s10 = N8;
                                                    i24 = b18;
                                                    str6 = str17;
                                                    i27 = L6;
                                                    b9 = b12;
                                                    str4 = str18;
                                                    i29 = b13;
                                                    i25 = i62;
                                                    str7 = str20;
                                                    i28 = b19;
                                                    arrayList2 = arrayList6;
                                                    i30 = i58;
                                                    iw2 = iw5;
                                                    j17 = j13;
                                                    j18 = j12;
                                                    c9 = '\f';
                                                    cr = cr6;
                                                }
                                                c9 = '\f';
                                                z10 = z19;
                                                cr = cr6;
                                                str10 = str;
                                                str7 = str20;
                                            }
                                            i(cr6, i41, i44, i45, i42, str, z6, eo3, qVar2, i43);
                                            cr = cr6;
                                            z10 = z19;
                                            i64 = i44;
                                            i28 = i45;
                                            str10 = str;
                                            i25 = i43;
                                            str6 = str17;
                                            i27 = L6;
                                            b9 = b12;
                                            str4 = str18;
                                            i30 = i46;
                                            str7 = str15;
                                            c9 = '\f';
                                            i29 = i42;
                                            qVar3 = qVar2;
                                        }
                                        cr.E(i64 + i28);
                                        cr6 = cr;
                                        i58 = i30;
                                        i61 = i25 + 1;
                                        str19 = str7;
                                        b13 = i29;
                                        N8 = s10;
                                        N9 = s9;
                                        b12 = b9;
                                        str18 = str4;
                                        str17 = str6;
                                        L6 = i27;
                                        b18 = i24;
                                        arrayList6 = arrayList2;
                                        iw5 = iw2;
                                        j12 = j18;
                                        j13 = j17;
                                        c13 = c9;
                                        str = str10;
                                        z19 = z10;
                                        i59 = i65;
                                    }
                                    i19 = i59;
                                    String str34 = str17;
                                    int i143 = L6;
                                    byte b30 = b12;
                                    str2 = str18;
                                    int i144 = b13;
                                    arrayList = arrayList6;
                                    long j27 = j13;
                                    long j28 = j12;
                                    iw4 = iw5;
                                    Iw j29 = iw4.j(1953654118);
                                    if (j29 == null || (i23 = j29.i(1667785072)) == null) {
                                        i20 = 8;
                                        i21 = 4;
                                    } else {
                                        Cr cr9 = i23.f28980c;
                                        i20 = 8;
                                        cr9.E(8);
                                        i21 = 4;
                                        if (cr9.B() >= 4) {
                                            i22 = cr9.b();
                                            if (!z3 || (j16 = iw4.j(1701082227)) == null || (h9 = h(j16)) == null) {
                                                sc = null;
                                                sc2 = null;
                                            } else {
                                                sc2 = (SC) h9.first;
                                                sc = (SC) h9.second;
                                            }
                                            dp = (DP) qVar3.f1149d;
                                            if (dp != null) {
                                                ua2 = ua;
                                                z22 = null;
                                                str3 = str34;
                                            } else {
                                                if (i143 != 0) {
                                                    C4292zw c4292zw = new C4292zw(i143);
                                                    C3299hP c3299hP6 = new C3299hP(dp);
                                                    O3 o32 = dp.f24428l;
                                                    c3299hP6.f30789k = o32 != null ? o32.c(c4292zw) : new O3(c4292zw);
                                                    dp = new DP(c3299hP6);
                                                }
                                                str3 = str34;
                                                boolean z26 = !Objects.equals(dp.f24431o, str3);
                                                Y2 y22 = new Y2();
                                                y22.f28636a = i144;
                                                y22.f28637b = b30;
                                                y22.f28638c = j14;
                                                y22.f28639d = j28;
                                                y22.f28640e = j27;
                                                y22.f28641f = j15;
                                                y22.a(dp);
                                                y22.b(qVar3.f1147b);
                                                y22.c((C2901a3[]) qVar3.f1148c);
                                                y22.d(qVar3.f1146a);
                                                y22.e(sc2);
                                                y22.f(sc);
                                                y22.g(z26);
                                                y22.h(i22);
                                                y22.f28642g.getClass();
                                                z22 = new Z2(y22);
                                                ua2 = ua;
                                            }
                                        }
                                    }
                                    i22 = -1;
                                    if (z3) {
                                    }
                                    sc = null;
                                    sc2 = null;
                                    dp = (DP) qVar3.f1149d;
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
                                i6 = b16;
                                z9 = b17 != 0;
                                i11 = i6;
                            } else if (b16 == -65536) {
                                z9 = b17 != 0;
                                i11 = -65536;
                                i6 = -65536;
                            } else {
                                i6 = b16;
                                i9 = -65536;
                                b15 = -65536;
                            }
                            if (true != z9) {
                                i10 = 270;
                                i57 = b15;
                                b16 = i11;
                                cr4.G(16);
                                short N82 = cr4.N();
                                int i582 = i10;
                                cr4.G(2);
                                short N92 = cr4.N();
                                Iw iw52 = iw4;
                                int i592 = i51;
                                if ((((long) b17) * ((long) b14)) - (((long) i57) * ((long) b16)) >= 0) {
                                }
                                if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
                                }
                                long j212 = d(i52.f28980c).f25415c;
                                if (j11 != com.anythink.basead.exoplayer.b.f6382b) {
                                }
                                Iw j222 = j20.j(1835626086);
                                j222.getClass();
                                Iw j232 = j222.j(1937007212);
                                j232.getClass();
                                Zw i602 = j20.i(1835296868);
                                i602.getClass();
                                Cr cr52 = i602.f28980c;
                                cr52.E(8);
                                a9 = a(cr52.b());
                                cr52.G(a9 != 0 ? 8 : 16);
                                long P82 = cr52.P();
                                i12 = cr52.f24253b;
                                i13 = 0;
                                while (true) {
                                    if (a9 != 0) {
                                    }
                                    if (i13 < i15) {
                                    }
                                    i13++;
                                    i12 = i14;
                                    w6 = j13;
                                }
                                j15 = j9;
                                int L82 = cr52.L();
                                char[] cArr2 = {(char) (((L82 >> 10) & 31) + 96), (char) (((L82 >> 5) & 31) + 96), (char) ((L82 & 31) + 96)};
                                i17 = 0;
                                while (i17 < i16) {
                                }
                                str = new String(cArr2);
                                i18 = j232.i(1937011556);
                                String str192 = "BoxParsers";
                                if (i18 != null) {
                                }
                            } else {
                                i9 = -65536;
                                b15 = -65536;
                                b14 = 0;
                                b16 = i11;
                            }
                        } else {
                            i6 = b16;
                            i9 = b15;
                        }
                        b14 = 0;
                    } else {
                        i6 = b16;
                        i9 = b15;
                    }
                    int i145 = b14;
                    if (b14 != -65536) {
                        if (b14 == 65536) {
                            b14 = 65536;
                        } else {
                            i57 = b15;
                            i10 = 0;
                            b14 = i145;
                            cr4.G(16);
                            short N822 = cr4.N();
                            int i5822 = i10;
                            cr4.G(2);
                            short N922 = cr4.N();
                            Iw iw522 = iw4;
                            int i5922 = i51;
                            if ((((long) b17) * ((long) b14)) - (((long) i57) * ((long) b16)) >= 0) {
                            }
                            if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
                            }
                            long j2122 = d(i52.f28980c).f25415c;
                            if (j11 != com.anythink.basead.exoplayer.b.f6382b) {
                            }
                            Iw j2222 = j20.j(1835626086);
                            j2222.getClass();
                            Iw j2322 = j2222.j(1937007212);
                            j2322.getClass();
                            Zw i6022 = j20.i(1835296868);
                            i6022.getClass();
                            Cr cr522 = i6022.f28980c;
                            cr522.E(8);
                            a9 = a(cr522.b());
                            cr522.G(a9 != 0 ? 8 : 16);
                            long P822 = cr522.P();
                            i12 = cr522.f24253b;
                            i13 = 0;
                            while (true) {
                                if (a9 != 0) {
                                }
                                if (i13 < i15) {
                                }
                                i13++;
                                i12 = i14;
                                w6 = j13;
                            }
                            j15 = j9;
                            int L822 = cr522.L();
                            char[] cArr22 = {(char) (((L822 >> 10) & 31) + 96), (char) (((L822 >> 5) & 31) + 96), (char) ((L822 & 31) + 96)};
                            i17 = 0;
                            while (i17 < i16) {
                            }
                            str = new String(cArr22);
                            i18 = j2322.i(1937011556);
                            String str1922 = "BoxParsers";
                            if (i18 != null) {
                            }
                        }
                    }
                    if (i9 == 0 && i6 == 0 && b17 == -65536) {
                        i10 = 180;
                        b17 = -65536;
                        i57 = b15;
                    } else {
                        i57 = b15;
                        i10 = 0;
                    }
                    cr4.G(16);
                    short N8222 = cr4.N();
                    int i58222 = i10;
                    cr4.G(2);
                    short N9222 = cr4.N();
                    Iw iw5222 = iw4;
                    int i59222 = i51;
                    if ((((long) b17) * ((long) b14)) - (((long) i57) * ((long) b16)) >= 0) {
                    }
                    if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
                    }
                    long j21222 = d(i52.f28980c).f25415c;
                    if (j11 != com.anythink.basead.exoplayer.b.f6382b) {
                    }
                    Iw j22222 = j20.j(1835626086);
                    j22222.getClass();
                    Iw j23222 = j22222.j(1937007212);
                    j23222.getClass();
                    Zw i60222 = j20.i(1835296868);
                    i60222.getClass();
                    Cr cr5222 = i60222.f28980c;
                    cr5222.E(8);
                    a9 = a(cr5222.b());
                    cr5222.G(a9 != 0 ? 8 : 16);
                    long P8222 = cr5222.P();
                    i12 = cr5222.f24253b;
                    i13 = 0;
                    while (true) {
                        if (a9 != 0) {
                        }
                        if (i13 < i15) {
                        }
                        i13++;
                        i12 = i14;
                        w6 = j13;
                    }
                    j15 = j9;
                    int L8222 = cr5222.L();
                    char[] cArr222 = {(char) (((L8222 >> 10) & 31) + 96), (char) (((L8222 >> 5) & 31) + 96), (char) ((L8222 & 31) + 96)};
                    i17 = 0;
                    while (i17 < i16) {
                    }
                    str = new String(cArr222);
                    i18 = j23222.i(1937011556);
                    String str19222 = "BoxParsers";
                    if (i18 != null) {
                    }
                }
                Z2 z27 = (Z2) ua2.apply(z22);
                if (z27 != null) {
                    Iw j30 = iw4.j(1835297121);
                    j30.getClass();
                    Iw j31 = j30.j(1835626086);
                    j31.getClass();
                    Iw j32 = j31.j(1937007212);
                    j32.getClass();
                    C3008c3 g10 = g(z27, j32, z02);
                    arrayList3 = arrayList;
                    arrayList3.add(g10);
                } else {
                    arrayList3 = arrayList;
                }
            }
            iw3 = iw;
            i51 = i19 + 1;
            str17 = str3;
            i49 = i21;
            i47 = i;
            str18 = str2;
            b10 = -1;
            i48 = 16;
            i50 = i20;
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
    
        r14 = r1.f24253b;
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
        r9 = new com.google.android.gms.internal.ads.C3061d2(r9, r10, r1.l(r12 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0231, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0304, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC3376ix.g(r14);
        r4 = new java.lang.StringBuilder(r0.length() + 32);
        r4.append("Skipped unknown metadata entry: ");
        r4.append(r0);
        com.google.android.gms.internal.ads.AbstractC2968bG.k("MetadataUtil", r4.toString());
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
    
        com.google.android.gms.internal.ads.AbstractC2968bG.y("MetadataUtil", "Failed to parse comment attribute: ".concat(com.google.android.gms.internal.ads.AbstractC3376ix.g(r14)));
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
    
        r8 = r1.f24253b;
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
    
        com.google.android.gms.internal.ads.AbstractC2968bG.y("MetadataUtil", "Skipped empty metadata entry");
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
    
        if ((r8 - r1.f24253b) >= r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        r9 = com.google.android.gms.internal.ads.AbstractC3376ix.g(r14);
        r11 = new java.lang.StringBuilder(r9.length() + 30);
        r11.append("Skipped empty metadata entry: ");
        r11.append(r9);
        com.google.android.gms.internal.ads.AbstractC2968bG.y("MetadataUtil", r11.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x032f, code lost:
    
        r1.E(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        r10 = r11 & com.anythink.basead.exoplayer.k.p.f8473b;
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
    
        r2 = com.google.android.gms.internal.ads.AbstractC3007c2.a(com.google.android.gms.internal.ads.SK.K(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        r9 = new com.google.android.gms.internal.ads.C3222g2("TCON", r13, com.google.android.gms.internal.ads.RB.j(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        com.google.android.gms.internal.ads.AbstractC2968bG.y("MetadataUtil", "Failed to parse standard genre code");
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
        com.google.android.gms.internal.ads.AbstractC2968bG.y("MetadataUtil", r11.toString());
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
    
        com.google.android.gms.internal.ads.AbstractC2968bG.y("MetadataUtil", "Failed to parse cover art attribute");
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
        boolean z3;
        O3 o32;
        boolean z6;
        O3 o33;
        ArrayList arrayList;
        O3 o34;
        O3 o35;
        int i6;
        int i9;
        boolean z9 = true;
        Cr cr = zw.f28980c;
        int i10 = 8;
        cr.E(8);
        boolean z10 = false;
        O3 o36 = new O3(new InterfaceC3922t3[0]);
        while (cr.B() >= i10) {
            int i11 = cr.f24253b;
            int b9 = cr.b() + i11;
            int b10 = cr.b();
            String str = null;
            if (b10 == 1835365473) {
                cr.E(i11);
                cr.G(i10);
                f(cr);
                boolean z11 = z10;
                while (true) {
                    int i12 = cr.f24253b;
                    if (i12 >= b9) {
                        break;
                    }
                    int b11 = cr.b() + i12;
                    if (cr.b() == 1768715124) {
                        break;
                    }
                    cr.E(b11);
                    z9 = true;
                    i10 = 8;
                    z11 = false;
                    str = null;
                }
                O3 o37 = null;
                o36 = o36.b(o37);
                i = 8;
            } else if (b10 == 1936553057) {
                cr.E(i11);
                cr.G(12);
                while (true) {
                    int i13 = cr.f24253b;
                    if (i13 >= b9) {
                        break;
                    }
                    int b12 = cr.b();
                    if (cr.b() != 1935766900) {
                        int i14 = i13 + b12;
                    } else if (b12 >= 16) {
                        cr.G(4);
                        int i15 = 0;
                        int i16 = 0;
                        int i17 = -1;
                        while (i15 < 2) {
                            int K7 = cr.K();
                            int K8 = cr.K();
                            if (K7 == 0) {
                                i17 = K8;
                                i9 = 1;
                            } else {
                                i9 = 1;
                                if (K7 == 1) {
                                    i16 = K8;
                                }
                            }
                            i15 += i9;
                        }
                        if (i17 == 12) {
                            i6 = 240;
                        } else if (i17 == 13) {
                            i6 = 120;
                        } else if (i17 != 21) {
                            i6 = -2147483647;
                        } else {
                            i = 8;
                            if (cr.B() >= 8 && cr.f24253b + 8 <= b9) {
                                int b13 = cr.b();
                                int b14 = cr.b();
                                if (b13 >= 12 && b14 == 1936877170) {
                                    i6 = cr.f();
                                    o35 = i6 != -2147483647 ? new O3(new C3436k2(i6, i16)) : null;
                                }
                            }
                            i6 = -2147483647;
                            if (i6 != -2147483647) {
                            }
                        }
                        i = 8;
                        if (i6 != -2147483647) {
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
                            C3754px c3754px = new C3754px(Float.parseFloat(k9.substring(0, max)), Float.parseFloat(k9.substring(max, k9.length() - 1)));
                            InterfaceC3922t3[] interfaceC3922t3Arr = new InterfaceC3922t3[1];
                            z3 = false;
                            try {
                                interfaceC3922t3Arr[0] = c3754px;
                                o34 = new O3(interfaceC3922t3Arr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                o34 = null;
                                o36 = o36.b(o34);
                                z6 = true;
                                cr.E(b9);
                                i10 = i;
                                z9 = z6;
                                z10 = z3;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z3 = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z3 = false;
                    }
                    o36 = o36.b(o34);
                } else {
                    z3 = false;
                    if (b10 == 1667788908) {
                        try {
                            cr.G(5);
                            int b15 = cr.b();
                            arrayList = new ArrayList();
                            for (int i18 = 0; i18 < b15; i18++) {
                                long d2 = cr.d() / 10000;
                                if (d2 < 0) {
                                    d2 = com.anythink.basead.exoplayer.b.f6382b;
                                }
                                o32 = null;
                                try {
                                    arrayList.add(new O1(d2, com.anythink.basead.exoplayer.b.f6382b, false, new C3138eQ(null, cr.k(cr.K(), StandardCharsets.UTF_8))));
                                } catch (IndexOutOfBoundsException unused4) {
                                    z6 = true;
                                    o33 = o32;
                                    o36 = o36.b(o33);
                                    cr.E(b9);
                                    i10 = i;
                                    z9 = z6;
                                    z10 = z3;
                                }
                            }
                            o32 = null;
                            z6 = true;
                        } catch (IndexOutOfBoundsException unused5) {
                            o32 = null;
                        }
                        if (!arrayList.isEmpty()) {
                            o33 = new O3(arrayList);
                            o36 = o36.b(o33);
                            cr.E(b9);
                            i10 = i;
                            z9 = z6;
                            z10 = z3;
                        }
                        o33 = o32;
                        o36 = o36.b(o33);
                        cr.E(b9);
                        i10 = i;
                        z9 = z6;
                        z10 = z3;
                    }
                }
                z6 = true;
                cr.E(b9);
                i10 = i;
                z9 = z6;
                z10 = z3;
            }
            z6 = true;
            z3 = false;
            cr.E(b9);
            i10 = i;
            z9 = z6;
            z10 = z3;
        }
        return o36;
    }

    public static Hx d(Cr cr) {
        long d2;
        long d9;
        cr.E(8);
        if (a(cr.b()) == 0) {
            d2 = cr.P();
            d9 = cr.P();
        } else {
            d2 = cr.d();
            d9 = cr.d();
        }
        return new Hx(d2, d9, cr.P());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        r8 = r12.b();
        r10 = r12.b();
        r9 = r9 - 16;
        r11 = new byte[r9];
        r12.H(r11, 0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        r9 = new com.google.android.gms.internal.ads.C3591mw(r11, r10, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        com.anythink.basead.exoplayer.f.f.v(r6, "Failed to parse metadata entry with key: ", "MetadataUtil");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static O3 e(Iw iw) {
        Zw i = iw.i(1751411826);
        Zw i6 = iw.i(1801812339);
        Zw i9 = iw.i(1768715124);
        if (i != null && i6 != null && i9 != null) {
            Cr cr = i.f28980c;
            cr.E(16);
            if (cr.b() == 1835299937) {
                Cr cr2 = i6.f28980c;
                cr2.E(12);
                int b9 = cr2.b();
                String[] strArr = new String[b9];
                for (int i10 = 0; i10 < b9; i10++) {
                    int b10 = cr2.b();
                    cr2.G(4);
                    strArr[i10] = cr2.k(b10 - 8, StandardCharsets.UTF_8);
                }
                Cr cr3 = i9.f28980c;
                cr3.E(8);
                ArrayList arrayList = new ArrayList();
                while (cr3.B() > 8) {
                    int b11 = cr3.b() + cr3.f24253b;
                    int b12 = cr3.b() - 1;
                    if (b12 < 0 || b12 >= b9) {
                        com.anythink.basead.exoplayer.f.f.q(b12, "Skipped metadata with unknown key index: ", "BoxParsers", new StringBuilder(String.valueOf(b12).length() + 41));
                    } else {
                        String str = strArr[b12];
                        while (true) {
                            int i11 = cr3.f24253b;
                            if (i11 >= b11) {
                                break;
                            }
                            int b13 = cr3.b();
                            if (cr3.b() == 1684108385) {
                                break;
                            }
                            cr3.E(i11 + b13);
                        }
                        C3591mw c3591mw = null;
                        if (c3591mw != null) {
                            arrayList.add(c3591mw);
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
        int i = cr.f24253b;
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
    public static C3008c3 g(Z2 z22, Iw iw, Z0 z02) {
        C0 c02;
        boolean z3;
        int i;
        int i6;
        int i9;
        boolean z6;
        long j6;
        DP dp;
        Z2 z23;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        long[] jArr2;
        boolean z9;
        long[] jArr3;
        boolean z10;
        long j9;
        int i10;
        int i11;
        Z2 z24;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList;
        int i15;
        int i16;
        int i17;
        long j10;
        int i18;
        long[] jArr4;
        int i19;
        long j11;
        Z2 z25;
        SC sc;
        Z2 z26;
        int i20;
        Z2 z27;
        long[] jArr5;
        long[] jArr6;
        int i21;
        long[] jArr7;
        int i22;
        int i23;
        boolean z11;
        long j12;
        Z2 z28 = z22;
        Zw i24 = iw.i(1937011578);
        DP dp2 = z28.f28828g;
        if (i24 != null) {
            C3921t2 c3921t2 = new C3921t2();
            Cr cr = i24.f28980c;
            c3921t2.f34193v = cr;
            cr.E(12);
            int h9 = cr.h();
            if (com.anythink.basead.exoplayer.k.o.f8465w.equals(dp2.f24431o)) {
                int f3 = AbstractC3159eu.f(dp2.f24411K) * dp2.f24409H;
                if (h9 % f3 != 0) {
                    AbstractC2968bG.y("BoxParsers", D.y.r(new StringBuilder(String.valueOf(f3).length() + 66 + String.valueOf(h9).length()), "Audio sample size mismatch. stsd sample size: ", f3, ", stsz sample size: ", h9));
                    h9 = f3;
                }
            }
            if (h9 == 0) {
                h9 = -1;
            }
            c3921t2.f34191n = h9;
            c3921t2.f34192u = cr.h();
            c02 = c3921t2;
        } else {
            Zw i25 = iw.i(1937013298);
            if (i25 == null) {
                throw U4.a(null, "Track has no sample table size information");
            }
            c02 = new C0(i25);
        }
        int c9 = c02.c();
        if (c9 == 0) {
            return new C3008c3(z28, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (z28.f28823b == 2) {
            long j13 = z28.f28827f;
            if (j13 > 0) {
                dp2.getClass();
                C3299hP c3299hP = new C3299hP(dp2);
                float f9 = c9 / (j13 / 1000000.0f);
                AbstractC2772Sd.i(f9 == -1.0f || f9 > 0.0f);
                c3299hP.f30803y = f9;
                DP dp3 = new DP(c3299hP);
                Y2 y22 = new Y2(z28);
                y22.f28642g = dp3;
                z28 = new Z2(y22);
            }
        }
        Zw i26 = iw.i(1937007471);
        if (i26 == null) {
            i26 = iw.i(1668232756);
            i26.getClass();
            z3 = true;
        } else {
            z3 = false;
        }
        Zw i27 = iw.i(1937011555);
        i27.getClass();
        Zw i28 = iw.i(1937011827);
        i28.getClass();
        Zw i29 = iw.i(1937011571);
        Cr cr2 = i29 != null ? i29.f28980c : null;
        Zw i30 = iw.i(1668576371);
        Cr cr3 = i30 != null ? i30.f28980c : null;
        F2 f22 = new F2(i27.f28980c, i26.f28980c, z3);
        Cr cr4 = i28.f28980c;
        cr4.E(12);
        int h10 = cr4.h() - 1;
        int h11 = cr4.h();
        int h12 = cr4.h();
        if (cr3 != null) {
            cr3.E(12);
            i = cr3.h();
        } else {
            i = 0;
        }
        if (cr2 != null) {
            cr2.E(12);
            i9 = cr2.h();
            if (i9 > 0) {
                i6 = cr2.h() - 1;
            } else {
                i6 = -1;
                cr2 = null;
            }
        } else {
            i6 = -1;
            i9 = 0;
        }
        int f10 = c02.f();
        Cr cr5 = cr3;
        DP dp4 = z28.f28828g;
        if (f10 != -1) {
            String str = dp4.f24431o;
            if ((com.anythink.basead.exoplayer.k.o.f8465w.equals(str) || com.anythink.basead.exoplayer.k.o.f8467y.equals(str) || com.anythink.basead.exoplayer.k.o.f8466x.equals(str)) && h10 == 0) {
                z6 = i == 0 && i9 == 0;
                h10 = 0;
                ArrayList arrayList2 = new ArrayList();
                ?? r32 = cr2 != null ? 1 : 0;
                if (z6) {
                    long[] jArr8 = new long[c9];
                    int[] iArr3 = new int[c9];
                    int i31 = i9;
                    long[] jArr9 = new long[c9];
                    int[] iArr4 = new int[c9];
                    int i32 = i31;
                    Cr cr6 = cr2;
                    C0 c03 = c02;
                    int i33 = h10;
                    int i34 = i6;
                    long j14 = 0;
                    long j15 = 0;
                    j6 = 0;
                    int i35 = i;
                    int i36 = 0;
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = 0;
                    int i40 = h11;
                    int i41 = 0;
                    while (true) {
                        if (i41 >= c9) {
                            dp = dp4;
                            z23 = z28;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            jArr = jArr8;
                            jArr2 = jArr9;
                            break;
                        }
                        long j16 = j14;
                        boolean z12 = true;
                        while (true) {
                            if (i38 != 0) {
                                dp = dp4;
                                i19 = i38;
                                break;
                            }
                            z12 = f22.a();
                            dp = dp4;
                            if (!z12) {
                                i19 = 0;
                                break;
                            }
                            j16 = f22.f24727d;
                            i38 = f22.f24726c;
                            z28 = z28;
                            dp4 = dp;
                        }
                        z23 = z28;
                        if (!z12) {
                            AbstractC2968bG.y("BoxParsers", "Unexpected end of chunk data");
                            jArr = Arrays.copyOf(jArr8, i41);
                            int[] copyOf = Arrays.copyOf(iArr3, i41);
                            long[] copyOf2 = Arrays.copyOf(jArr9, i41);
                            iArr = copyOf;
                            iArr2 = Arrays.copyOf(iArr4, i41);
                            c9 = i41;
                            jArr2 = copyOf2;
                            break;
                        }
                        if (cr5 != null) {
                            while (true) {
                                if (i39 != 0) {
                                    break;
                                }
                                if (i35 <= 0) {
                                    i39 = 0;
                                    break;
                                }
                                i35--;
                                i39 = cr5.h();
                                i36 = cr5.b();
                            }
                            i39--;
                        }
                        int i42 = c03.i();
                        long[] jArr10 = jArr8;
                        long[] jArr11 = jArr9;
                        long j17 = i42;
                        j6 += j17;
                        if (i42 > i37) {
                            i37 = i42;
                        }
                        jArr10[i41] = j16;
                        iArr3[i41] = i42;
                        int i43 = i19;
                        jArr11[i41] = j15 + i36;
                        iArr4[i41] = r32;
                        if (i41 == i34) {
                            iArr4[i41] = 1;
                            arrayList2.add(Integer.valueOf(i41));
                        }
                        if (cr6 != null && i41 == i34 && i32 - 1 > 0) {
                            i34 = cr6.h() - 1;
                        }
                        j15 += h12;
                        int i44 = i40 - 1;
                        if (i44 != 0) {
                            i40 = i44;
                        } else if (i33 > 0) {
                            i33--;
                            i40 = cr4.h();
                            h12 = cr4.b();
                        } else {
                            i40 = 0;
                        }
                        long j18 = j16 + j17;
                        i38 = i43 - 1;
                        i41++;
                        jArr8 = jArr10;
                        jArr9 = jArr11;
                        z28 = z23;
                        j14 = j18;
                        dp4 = dp;
                    }
                    long j19 = j15 + i36;
                    if (cr5 != null) {
                        while (i35 > 0) {
                            if (cr5.h() != 0) {
                                z9 = false;
                                break;
                            }
                            cr5.b();
                            i35--;
                        }
                    }
                    z9 = true;
                    if (i32 != 0) {
                        jArr3 = jArr;
                        z10 = z9;
                        j9 = j19;
                        i10 = i38;
                        i11 = i40;
                        z24 = z23;
                        i12 = i32;
                        i13 = i33;
                        i14 = i39;
                    } else if (i40 != 0) {
                        jArr3 = jArr;
                        z10 = z9;
                        j9 = j19;
                        i10 = i38;
                        i11 = i40;
                        z24 = z23;
                        i13 = i33;
                        i14 = i39;
                        i12 = 0;
                    } else if (i38 != 0) {
                        jArr3 = jArr;
                        z10 = z9;
                        j9 = j19;
                        i10 = i38;
                        z24 = z23;
                        i13 = i33;
                        i14 = i39;
                        i12 = 0;
                        i11 = 0;
                    } else if (i33 != 0) {
                        jArr3 = jArr;
                        z10 = z9;
                        j9 = j19;
                        z24 = z23;
                        i13 = i33;
                        i14 = i39;
                        i12 = 0;
                        i11 = 0;
                        i10 = 0;
                    } else if (i39 != 0) {
                        jArr3 = jArr;
                        z10 = z9;
                        j9 = j19;
                        z24 = z23;
                        i14 = i39;
                        i12 = 0;
                        i11 = 0;
                        i10 = 0;
                        i13 = 0;
                    } else if (z9) {
                        jArr3 = jArr;
                        j9 = j19;
                        arrayList = arrayList2;
                        i16 = i37;
                        z24 = z23;
                        i15 = c9;
                        i17 = i16;
                        j10 = j9;
                        i18 = i15;
                        jArr4 = jArr3;
                    } else {
                        jArr3 = jArr;
                        j9 = j19;
                        z24 = z23;
                        z10 = false;
                        i12 = 0;
                        i11 = 0;
                        i10 = 0;
                        i13 = 0;
                        i14 = 0;
                    }
                    int i45 = z24.f28822a;
                    int length = String.valueOf(i13).length() + String.valueOf(i10).length() + String.valueOf(i11).length() + String.valueOf(i12).length() + String.valueOf(i45).length() + 66 + 35 + 26 + 33 + 36;
                    int length2 = String.valueOf(i14).length();
                    arrayList = arrayList2;
                    String str2 = true != z10 ? ", ctts invalid" : "";
                    i15 = c9;
                    StringBuilder sb = new StringBuilder(str2.length() + length + length2);
                    i16 = i37;
                    u1.h.h(sb, "Inconsistent stbl box for track ", i45, ": remainingSynchronizationSamples ", i12);
                    u1.h.h(sb, ", remainingSamplesAtTimestampDelta ", i11, ", remainingSamplesInChunk ", i10);
                    u1.h.h(sb, ", remainingTimestampDeltaChanges ", i13, ", remainingSamplesAtTimestampOffset ", i14);
                    sb.append(str2);
                    AbstractC2968bG.y("BoxParsers", sb.toString());
                    i17 = i16;
                    j10 = j9;
                    i18 = i15;
                    jArr4 = jArr3;
                } else {
                    int i46 = f22.f24724a;
                    long[] jArr12 = new long[i46];
                    int[] iArr5 = new int[i46];
                    while (f22.a()) {
                        int i47 = f22.f24725b;
                        jArr12[i47] = f22.f24727d;
                        iArr5[i47] = f22.f24726c;
                    }
                    long j20 = h12;
                    int i48 = 8192 / f10;
                    int i49 = 0;
                    for (int i50 = 0; i50 < i46; i50++) {
                        int i51 = iArr5[i50];
                        String str3 = AbstractC3159eu.f29993a;
                        i49 += ((i51 + i48) - 1) / i48;
                    }
                    long[] jArr13 = new long[i49];
                    iArr = new int[i49];
                    jArr2 = new long[i49];
                    iArr2 = new int[i49];
                    int i52 = 0;
                    int i53 = 0;
                    int i54 = 0;
                    int i55 = 0;
                    int i56 = 0;
                    while (i52 < i46) {
                        int i57 = iArr5[i52];
                        long j21 = jArr12[i52];
                        int i58 = i56;
                        int i59 = i46;
                        int i60 = i55;
                        int i61 = i58;
                        int i62 = i52;
                        int i63 = i57;
                        while (i63 > 0) {
                            int min = Math.min(i48, i63);
                            jArr13[i61] = j21;
                            int i64 = i63;
                            int i65 = f10 * min;
                            iArr[i61] = i65;
                            i54 += i65;
                            int max = Math.max(i60, i65);
                            jArr2[i61] = i53 * j20;
                            iArr2[i61] = 1;
                            j21 += iArr[i61];
                            i53 += min;
                            i63 = i64 - min;
                            i61++;
                            i60 = max;
                        }
                        i52 = i62 + 1;
                        int i66 = i61;
                        i55 = i60;
                        i46 = i59;
                        i56 = i66;
                    }
                    dp = dp4;
                    j6 = i54;
                    arrayList = arrayList2;
                    j10 = j20 * i53;
                    jArr4 = jArr13;
                    i18 = i49;
                    i17 = i55;
                    z24 = z28;
                }
                int[] iArr6 = iArr;
                j11 = z24.f28827f;
                if (j11 > 0) {
                    long w6 = AbstractC3159eu.w(j6 * 8, 1000000L, j11, RoundingMode.HALF_DOWN);
                    if (w6 > 0 && w6 < 2147483647L) {
                        dp.getClass();
                        C3299hP c3299hP2 = new C3299hP(dp);
                        c3299hP2.f30787h = (int) w6;
                        DP dp5 = new DP(c3299hP2);
                        Y2 y23 = new Y2(z24);
                        y23.f28642g = dp5;
                        z25 = new Z2(y23);
                        RoundingMode roundingMode = RoundingMode.DOWN;
                        long j22 = z25.f28824c;
                        long w9 = AbstractC3159eu.w(j10, 1000000L, j22, roundingMode);
                        int[] n9 = UC.n(arrayList);
                        sc = z25.i;
                        if (sc == null) {
                            AbstractC3159eu.x(jArr2, j22);
                            return new C3008c3(z25, jArr4, iArr6, i17, jArr2, iArr2, n9, r32, w9, i18);
                        }
                        Z2 z29 = z25;
                        int[] iArr7 = iArr2;
                        int i67 = z29.f28823b;
                        DP dp6 = z29.f28828g;
                        SC sc2 = z29.f28830j;
                        int i68 = sc.f27424u;
                        int i69 = 1;
                        if (i68 == 1 && i67 == 1) {
                            int length3 = jArr2.length;
                            if (length3 >= 2) {
                                sc2.getClass();
                                long a9 = sc2.a(0);
                                long a10 = sc.a(0);
                                long j23 = z29.f28825d;
                                long w10 = a9 + AbstractC3159eu.w(a10, j22, j23, roundingMode);
                                int i70 = length3 - 1;
                                int max2 = Math.max(0, Math.min(4, i70));
                                int max3 = Math.max(0, Math.min(length3 - 4, i70));
                                if (jArr2[0] > a9 || a9 >= jArr2[max2] || jArr2[max3] >= w10 || w10 > 2 + j10) {
                                    z26 = z29;
                                    j22 = j22;
                                } else {
                                    long max4 = Math.max(0L, j10 - w10);
                                    long j24 = a9 - jArr2[0];
                                    long j25 = dp6.J;
                                    long w11 = AbstractC3159eu.w(j24, j25, j22, roundingMode);
                                    long w12 = AbstractC3159eu.w(max4, j25, j22, roundingMode);
                                    j22 = j22;
                                    if (w11 == 0) {
                                        if (w12 != 0) {
                                            j12 = 0;
                                        }
                                        z26 = z29;
                                    } else {
                                        j12 = w11;
                                    }
                                    if (j12 <= 2147483647L && w12 <= 2147483647L) {
                                        z02.f28816a = (int) j12;
                                        z02.f28817b = (int) w12;
                                        AbstractC3159eu.x(jArr2, j22);
                                        return new C3008c3(z29, jArr4, iArr6, i17, jArr2, iArr7, n9, r32, AbstractC3159eu.w(sc.a(0), 1000000L, j23, roundingMode), i18);
                                    }
                                    z26 = z29;
                                }
                                i20 = i68;
                            } else {
                                z26 = z29;
                                i20 = i68;
                            }
                            i69 = 1;
                        } else {
                            z26 = z29;
                            i20 = i68;
                        }
                        if (i20 == i69) {
                            if (sc.a(0) == 0) {
                                sc2.getClass();
                                long a11 = sc2.a(0);
                                for (int i71 = 0; i71 < jArr2.length; i71++) {
                                    jArr2[i71] = AbstractC3159eu.w(jArr2[i71] - a11, 1000000L, j22, RoundingMode.DOWN);
                                }
                                return new C3008c3(z26, jArr4, iArr6, i17, jArr2, iArr7, n9, r32, AbstractC3159eu.w(j10 - a11, 1000000L, j22, RoundingMode.DOWN), i18);
                            }
                            i69 = 1;
                        }
                        long j26 = j22;
                        Z2 z210 = z26;
                        long[] jArr14 = jArr4;
                        int i72 = i18;
                        boolean z13 = i67 == i69;
                        int[] iArr8 = new int[i20];
                        int[] iArr9 = new int[i20];
                        sc2.getClass();
                        boolean z14 = z13;
                        int i73 = 0;
                        int i74 = 0;
                        int i75 = 0;
                        boolean z15 = false;
                        while (i74 < i20) {
                            int[] iArr10 = iArr8;
                            int[] iArr11 = iArr9;
                            long a12 = sc2.a(i74);
                            if (a12 != -1) {
                                boolean z16 = z15;
                                jArr7 = jArr14;
                                long j27 = j26;
                                j26 = j27;
                                long w13 = AbstractC3159eu.w(sc.a(i74), j27, z210.f28825d, RoundingMode.DOWN) + a12;
                                i21 = i74;
                                iArr10[i21] = AbstractC3159eu.s(jArr2, a12, true);
                                int binarySearch = Arrays.binarySearch(jArr2, w13);
                                if (binarySearch < 0) {
                                    binarySearch = ~binarySearch;
                                } else {
                                    while (true) {
                                        i22 = binarySearch + 1;
                                        if (i22 >= jArr2.length || jArr2[i22] != w13) {
                                            break;
                                        }
                                        binarySearch = i22;
                                    }
                                    if (!z14) {
                                        binarySearch = i22;
                                    }
                                }
                                int i76 = binarySearch - 1;
                                int i77 = 0;
                                while (binarySearch < jArr2.length) {
                                    if (jArr2[binarySearch] >= w13) {
                                        i77++;
                                        if (i77 > dp6.f24433q) {
                                            break;
                                        }
                                    } else {
                                        i76 = binarySearch;
                                    }
                                    binarySearch++;
                                }
                                iArr11[i21] = i76 + 1;
                                int i78 = iArr10[i21];
                                while (true) {
                                    i23 = iArr10[i21];
                                    if (i23 <= 0 || (iArr7[i23] & 1) != 0) {
                                        break;
                                    }
                                    iArr10[i21] = i23 - 1;
                                }
                                if (i23 == 0) {
                                    z11 = false;
                                    if ((iArr7[0] & 1) == 0) {
                                        iArr10[i21] = i78;
                                        while (true) {
                                            i23 = iArr10[i21];
                                            if (i23 >= iArr11[i21] || (iArr7[i23] & 1) != 0) {
                                                break;
                                            }
                                            iArr10[i21] = i23 + 1;
                                        }
                                    }
                                } else {
                                    z11 = false;
                                }
                                int i79 = iArr11[i21];
                                int i80 = (i79 - i23) + i75;
                                z15 = z16 | (i73 != i23 ? true : z11);
                                i73 = i79;
                                i75 = i80;
                            } else {
                                i21 = i74;
                                jArr7 = jArr14;
                            }
                            i74 = i21 + 1;
                            iArr8 = iArr10;
                            iArr9 = iArr11;
                            jArr14 = jArr7;
                        }
                        int[] iArr12 = iArr8;
                        int[] iArr13 = iArr9;
                        long[] jArr15 = jArr14;
                        boolean z17 = z15 | (i75 != i72);
                        long[] jArr16 = z17 ? new long[i75] : jArr15;
                        int[] iArr14 = z17 ? new int[i75] : iArr6;
                        if (true == z17) {
                            i17 = 0;
                        }
                        int[] iArr15 = z17 ? new int[i75] : iArr7;
                        ArrayList arrayList3 = z17 ? new ArrayList() : arrayList;
                        long[] jArr17 = new long[i75];
                        int i81 = 0;
                        boolean z18 = false;
                        int i82 = 0;
                        long j28 = 0;
                        while (i82 < i20) {
                            long a13 = sc2.a(i82);
                            long[] jArr18 = jArr17;
                            int i83 = iArr12[i82];
                            boolean z19 = z18;
                            int i84 = iArr13[i82];
                            int i85 = i20;
                            if (z17) {
                                int i86 = i84 - i83;
                                jArr5 = jArr2;
                                jArr6 = jArr15;
                                System.arraycopy(jArr6, i83, jArr16, i81, i86);
                                System.arraycopy(iArr6, i83, iArr14, i81, i86);
                                System.arraycopy(iArr7, i83, iArr15, i81, i86);
                            } else {
                                jArr5 = jArr2;
                                jArr6 = jArr15;
                            }
                            boolean z20 = z19;
                            int i87 = i81;
                            int i88 = i17;
                            while (i83 < i84) {
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                int[] iArr16 = iArr14;
                                int[] iArr17 = iArr15;
                                long w14 = AbstractC3159eu.w(j28, 1000000L, z210.f28825d, roundingMode2);
                                long w15 = AbstractC3159eu.w(jArr5[i83] - a13, 1000000L, j26, roundingMode2);
                                z20 = (!(w15 >= 0)) | z20;
                                jArr18[i87] = w14 + w15;
                                if (z17 && iArr16[i87] > i88) {
                                    i88 = iArr6[i83];
                                }
                                if (z17 && r32 == 0) {
                                    if ((iArr17[i87] & 1) != 0) {
                                        arrayList3.add(Integer.valueOf(i87));
                                    }
                                }
                                i83++;
                                i87++;
                                iArr14 = iArr16;
                                iArr15 = iArr17;
                            }
                            j28 = sc.a(i82) + j28;
                            i82++;
                            i17 = i88;
                            z18 = z20;
                            jArr15 = jArr6;
                            jArr2 = jArr5;
                            iArr14 = iArr14;
                            jArr17 = jArr18;
                            iArr15 = iArr15;
                            i20 = i85;
                            i81 = i87;
                        }
                        int[] iArr18 = iArr14;
                        int[] iArr19 = iArr15;
                        long[] jArr19 = jArr17;
                        boolean z21 = z18;
                        long w16 = AbstractC3159eu.w(j28, 1000000L, z210.f28825d, RoundingMode.DOWN);
                        if (z21) {
                            dp6.getClass();
                            C3299hP c3299hP3 = new C3299hP(dp6);
                            c3299hP3.f30798t = true;
                            DP dp7 = new DP(c3299hP3);
                            Y2 y24 = new Y2(z210);
                            y24.f28642g = dp7;
                            z27 = new Z2(y24);
                        } else {
                            z27 = z210;
                        }
                        return new C3008c3(z27, jArr16, iArr18, i17, jArr19, iArr19, UC.n(arrayList3), r32, w16, jArr16.length);
                    }
                }
                z25 = z24;
                RoundingMode roundingMode3 = RoundingMode.DOWN;
                long j222 = z25.f28824c;
                long w92 = AbstractC3159eu.w(j10, 1000000L, j222, roundingMode3);
                int[] n92 = UC.n(arrayList);
                sc = z25.i;
                if (sc == null) {
                }
            }
        }
        z6 = false;
        ArrayList arrayList22 = new ArrayList();
        if (cr2 != null) {
        }
        if (z6) {
        }
        int[] iArr62 = iArr;
        j11 = z24.f28827f;
        if (j11 > 0) {
        }
        z25 = z24;
        RoundingMode roundingMode32 = RoundingMode.DOWN;
        long j2222 = z25.f28824c;
        long w922 = AbstractC3159eu.w(j10, 1000000L, j2222, roundingMode32);
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
        Cr cr = i.f28980c;
        cr.E(8);
        int a9 = a(cr.b());
        int h9 = cr.h();
        long[] jArr = new long[h9];
        long[] jArr2 = new long[h9];
        int i6 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < h9; i10++) {
            long j6 = a9 == 1 ? cr.j() : cr.P();
            int i11 = i6 + 1;
            int length = jArr.length;
            if (i11 > length) {
                int i12 = length + (length >> 1) + 1;
                if (i12 < i11) {
                    int highestOneBit = Integer.highestOneBit(i6);
                    i12 = highestOneBit + highestOneBit;
                }
                if (i12 < 0) {
                    i12 = Integer.MAX_VALUE;
                }
                jArr = Arrays.copyOf(jArr, i12);
            }
            jArr[i6] = j6;
            i6++;
            long d2 = a9 == 1 ? cr.d() : cr.b();
            int i13 = i9 + 1;
            int length2 = jArr2.length;
            if (i13 > length2) {
                int i14 = length2 + (length2 >> 1) + 1;
                if (i14 < i13) {
                    int highestOneBit2 = Integer.highestOneBit(i9);
                    i14 = highestOneBit2 + highestOneBit2;
                }
                jArr2 = Arrays.copyOf(jArr2, i14 >= 0 ? i14 : Integer.MAX_VALUE);
            }
            jArr2[i9] = d2;
            i9++;
            if (cr.N() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            cr.G(2);
        }
        SC sc = SC.f27422v;
        SC sc2 = i6 == 0 ? sc : new SC(jArr, i6);
        if (i9 != 0) {
            sc = new SC(jArr2, i9);
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
    public static void i(Cr cr, int i, int i6, int i9, int i10, String str, boolean z3, EO eo, H3.q qVar, int i11) {
        int i12;
        int i13;
        int L6;
        int b9;
        int i14;
        int i15;
        String str2;
        String str3;
        boolean z6;
        int i16;
        String str4;
        String str5;
        int i17;
        List list;
        int i18;
        int i19;
        Cr cr2;
        int i20;
        int i21;
        int i22;
        String str6;
        String str7;
        G2 g22;
        int i23;
        int i24;
        int i25;
        String str8;
        int i26;
        int i27;
        int i28;
        int h9;
        boolean z9;
        int i29;
        int i30;
        boolean z10;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z11;
        String str9;
        Cr cr3 = cr;
        int i35 = i;
        int i36 = i9;
        EO eo2 = eo;
        cr3.E(i6 + 16);
        if (z3) {
            int L8 = cr3.L();
            cr3.G(6);
            i12 = L8;
        } else {
            cr3.G(8);
            i12 = 0;
        }
        if (i12 == 0 || i12 == 1) {
            i13 = 2;
            L6 = cr3.L();
            cr3.G(6);
            int f3 = cr3.f();
            cr3.E(cr3.f24253b - 4);
            b9 = cr3.b();
            if (i12 == 1) {
                cr3.G(16);
            }
            i14 = f3;
            i15 = -1;
        } else {
            if (i12 != 2) {
                return;
            }
            cr3.G(16);
            int round = (int) Math.round(Double.longBitsToDouble(cr3.d()));
            int h10 = cr3.h();
            cr3.G(4);
            i13 = 2;
            int h11 = cr3.h();
            int h12 = cr3.h();
            int i37 = h12 & 1;
            int i38 = h12 & 2;
            i15 = i37 != 0 ? AbstractC3159eu.c(h11, i38 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN) : AbstractC3159eu.b(h11, i38 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            if (i15 == 0) {
                i15 = -1;
            }
            cr3.G(8);
            i14 = round;
            L6 = h10;
            b9 = 0;
        }
        int i39 = 8;
        if (i35 == 1767992678) {
            L6 = -1;
            i14 = -1;
        } else {
            if (i35 == 1935764850) {
                i14 = 8000;
            } else if (i35 == 1935767394) {
                i14 = 16000;
                i35 = 1935767394;
            }
            L6 = 1;
        }
        int i40 = cr3.f24253b;
        int i41 = 1701733217;
        if (i35 == 1701733217) {
            Pair k9 = k(cr3, i6, i36);
            if (k9 != null) {
                i41 = ((Integer) k9.first).intValue();
                eo2 = eo2 == null ? null : eo2.a(((C2901a3) k9.second).f29011b);
                ((C2901a3[]) qVar.f1148c)[i11] = (C2901a3) k9.second;
            }
            i35 = i41;
            cr3.E(i40);
        }
        String str10 = "audio/mhm1";
        String str11 = com.anythink.basead.exoplayer.k.o.f8468z;
        if (i35 == 1633889587) {
            str2 = com.anythink.basead.exoplayer.k.o.f8468z;
        } else if (i35 == 1700998451) {
            str2 = com.anythink.basead.exoplayer.k.o.f8420A;
        } else if (i35 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i35 == 1685353315) {
            str2 = com.anythink.basead.exoplayer.k.o.f8423D;
        } else if (i35 == 1685353320 || i35 == 1685353324) {
            str2 = com.anythink.basead.exoplayer.k.o.f8424E;
        } else if (i35 == 1685353317) {
            str2 = com.anythink.basead.exoplayer.k.o.f8425F;
        } else if (i35 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i35 == 1935764850) {
            str2 = com.anythink.basead.exoplayer.k.o.f8428I;
        } else if (i35 == 1935767394) {
            str2 = com.anythink.basead.exoplayer.k.o.J;
        } else {
            if (i35 != 1936684916) {
                if (i35 == 1953984371) {
                    i15 = 268435456;
                } else if (i35 != 1819304813) {
                    if (i35 == 778924082 || i35 == 778924083) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8462t;
                    } else if (i35 == 1835557169) {
                        str2 = "audio/mha1";
                    } else if (i35 == 1835560241) {
                        str2 = "audio/mhm1";
                    } else if (i35 == 1634492771) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8430L;
                    } else if (i35 == 1634492791) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8466x;
                    } else if (i35 == 1970037111) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8467y;
                    } else if (i35 == 1332770163) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8427H;
                    } else if (i35 == 1716281667) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8429K;
                    } else if (i35 == 1835823201) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8422C;
                    } else if (i35 == 1767992678) {
                        str2 = "audio/iamf";
                        i35 = 1767992678;
                    } else {
                        str2 = null;
                    }
                }
                str2 = com.anythink.basead.exoplayer.k.o.f8465w;
            }
            i15 = i13;
            str2 = com.anythink.basead.exoplayer.k.o.f8465w;
        }
        int i42 = i14;
        int i43 = i15;
        List list2 = null;
        String str12 = null;
        G2 g23 = null;
        C3380j0 c3380j0 = null;
        while (i40 - i6 < i36) {
            cr3.E(i40);
            int b10 = cr3.b();
            int i44 = L6;
            MA.k("childAtomSize must be positive", b10 > 0);
            int b11 = cr3.b();
            if (b11 == 1835557187) {
                cr3.E(i40 + 8);
                cr3.G(1);
                int K7 = cr3.K();
                cr3.G(1);
                String format = Objects.equals(str2, str10) ? String.format("mhm1.%02X", Integer.valueOf(K7)) : String.format("mha1.%02X", Integer.valueOf(K7));
                int L9 = cr3.L();
                byte[] bArr = new byte[L9];
                str3 = str10;
                z6 = false;
                cr3.H(bArr, 0, L9);
                list2 = list2 == null ? RB.j(bArr) : RB.k(bArr, (byte[]) list2.get(0));
                L6 = i44;
                i22 = i35;
                str4 = str11;
                str12 = format;
            } else {
                str3 = str10;
                z6 = false;
                if (b11 == 1835557200) {
                    cr3.E(i40 + 8);
                    int K8 = cr3.K();
                    if (K8 > 0) {
                        byte[] bArr2 = new byte[K8];
                        cr3.H(bArr2, 0, K8);
                        if (list2 == null) {
                            list2 = RB.j(bArr2);
                            L6 = i44;
                            i22 = i35;
                            str4 = str11;
                        } else {
                            list2 = RB.k((byte[]) list2.get(0), bArr2);
                            L6 = i44;
                            i22 = i35;
                            str4 = str11;
                            str7 = str2;
                            i17 = b10;
                            i18 = i40;
                            cr2 = cr3;
                        }
                    } else {
                        L6 = i44;
                        i22 = i35;
                        str4 = str11;
                        str5 = str2;
                        i17 = b10;
                        list = list2;
                        i18 = i40;
                        i19 = i42;
                        cr2 = cr3;
                        str7 = str5;
                        i42 = i19;
                        list2 = list;
                    }
                } else {
                    if (b11 == 1702061171) {
                        L6 = i44;
                        i16 = i35;
                        str4 = str11;
                        str5 = str2;
                        i17 = b10;
                        list = list2;
                        i18 = i40;
                        i19 = i42;
                        cr2 = cr3;
                        i20 = i18;
                        i21 = -1;
                    } else if (z3 && b11 == 2002876005) {
                        int i45 = cr3.f24253b;
                        MA.k(null, i45 >= i40);
                        while (true) {
                            if (i45 - i40 < b10) {
                                cr3.E(i45);
                                int b12 = cr3.b();
                                MA.k("childAtomSize must be positive", b12 > 0);
                                int i46 = i45;
                                if (cr3.b() != 1702061171) {
                                    i45 = i46 + b12;
                                } else {
                                    L6 = i44;
                                    i16 = i35;
                                    str4 = str11;
                                    str5 = str2;
                                    i17 = b10;
                                    list = list2;
                                    i18 = i40;
                                    i19 = i42;
                                    i21 = -1;
                                    cr2 = cr3;
                                    i20 = i46;
                                }
                            } else {
                                L6 = i44;
                                i16 = i35;
                                str4 = str11;
                                str5 = str2;
                                i17 = b10;
                                list = list2;
                                i18 = i40;
                                i19 = i42;
                                i21 = -1;
                                cr2 = cr3;
                                i20 = -1;
                            }
                        }
                    } else if (b11 == 1651798644) {
                        cr3.E(i40 + 8);
                        cr3.G(4);
                        i17 = b10;
                        L6 = i44;
                        i22 = i35;
                        str4 = str11;
                        str7 = str2;
                        c3380j0 = new C3380j0(cr3.P(), cr3.P());
                        i18 = i40;
                        cr2 = cr3;
                    } else {
                        i17 = b10;
                        int[] iArr = AbstractC3043cl.f29576x;
                        int[] iArr2 = AbstractC3043cl.f29574v;
                        if (b11 == 1684103987) {
                            cr3.E(i40 + 8);
                            String num = Integer.toString(i10);
                            C4233yr c4233yr = new C4233yr();
                            c4233yr.a(cr3);
                            int i47 = iArr2[c4233yr.h(i13)];
                            c4233yr.f(i39);
                            int i48 = iArr[c4233yr.h(3)];
                            if (c4233yr.h(1) != 0) {
                                i48++;
                            }
                            int i49 = AbstractC3043cl.f29577y[c4233yr.h(5)] * 1000;
                            c4233yr.k();
                            cr3.E(c4233yr.c());
                            C3299hP c3299hP = new C3299hP();
                            c3299hP.f30780a = num;
                            c3299hP.e(str11);
                            c3299hP.f30772G = i48;
                            c3299hP.f30774I = i47;
                            c3299hP.f30796r = eo2;
                            c3299hP.f30783d = str;
                            c3299hP.f30787h = i49;
                            c3299hP.i = i49;
                            qVar.f1149d = new DP(c3299hP);
                            L6 = i44;
                            i22 = i35;
                            str4 = str11;
                            str5 = str2;
                            list = list2;
                            i18 = i40;
                        } else if (b11 == 1684366131) {
                            cr3.E(i40 + 8);
                            String num2 = Integer.toString(i10);
                            C4233yr c4233yr2 = new C4233yr();
                            c4233yr2.a(cr3);
                            int h13 = c4233yr2.h(13) * 1000;
                            str4 = str11;
                            c4233yr2.f(3);
                            int i50 = iArr2[c4233yr2.h(2)];
                            c4233yr2.f(10);
                            int i51 = iArr[c4233yr2.h(3)];
                            if (c4233yr2.h(1) != 0) {
                                i51++;
                            }
                            c4233yr2.f(3);
                            int h14 = c4233yr2.h(4);
                            c4233yr2.f(1);
                            int i52 = i51;
                            if (h14 > 0) {
                                c4233yr2.f(6);
                                i51 = c4233yr2.h(1) != 0 ? i52 + 2 : i52;
                                c4233yr2.f(1);
                            }
                            i18 = i40;
                            if (c4233yr2.b() > 7) {
                                c4233yr2.f(7);
                                if (c4233yr2.h(1) != 0) {
                                    str9 = com.anythink.basead.exoplayer.k.o.f8421B;
                                    c4233yr2.k();
                                    cr3.E(c4233yr2.c());
                                    C3299hP c3299hP2 = new C3299hP();
                                    c3299hP2.f30780a = num2;
                                    c3299hP2.e(str9);
                                    c3299hP2.f30772G = i51;
                                    c3299hP2.f30774I = i50;
                                    c3299hP2.f30796r = eo2;
                                    c3299hP2.f30783d = str;
                                    c3299hP2.i = h13;
                                    qVar.f1149d = new DP(c3299hP2);
                                    L6 = i44;
                                    i22 = i35;
                                    str5 = str2;
                                    list = list2;
                                }
                            }
                            str9 = com.anythink.basead.exoplayer.k.o.f8420A;
                            c4233yr2.k();
                            cr3.E(c4233yr2.c());
                            C3299hP c3299hP22 = new C3299hP();
                            c3299hP22.f30780a = num2;
                            c3299hP22.e(str9);
                            c3299hP22.f30772G = i51;
                            c3299hP22.f30774I = i50;
                            c3299hP22.f30796r = eo2;
                            c3299hP22.f30783d = str;
                            c3299hP22.i = h13;
                            qVar.f1149d = new DP(c3299hP22);
                            L6 = i44;
                            i22 = i35;
                            str5 = str2;
                            list = list2;
                        } else {
                            str4 = str11;
                            i18 = i40;
                            if (b11 == 1684103988) {
                                cr3.E(i18 + 8);
                                String num3 = Integer.toString(i10);
                                C4233yr c4233yr3 = new C4233yr();
                                c4233yr3.a(cr3);
                                int b13 = c4233yr3.b();
                                int h15 = c4233yr3.h(3);
                                if (h15 > 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(h15).length() + 30);
                                    sb.append("Unsupported AC-4 DSI version: ");
                                    sb.append(h15);
                                    throw U4.c(sb.toString());
                                }
                                int h16 = c4233yr3.h(7);
                                int i53 = true != c4233yr3.g() ? 44100 : 48000;
                                c4233yr3.f(4);
                                int h17 = c4233yr3.h(9);
                                int i54 = 1;
                                if (h16 > 1) {
                                    if (h15 == 0) {
                                        throw U4.c("Invalid AC-4 DSI version: 0");
                                    }
                                    if (c4233yr3.g()) {
                                        c4233yr3.f(16);
                                        if (c4233yr3.g()) {
                                            c4233yr3.f(128);
                                        }
                                    }
                                    i54 = 1;
                                }
                                if (h15 == i54) {
                                    i25 = h16;
                                    if (c4233yr3.b() < 66) {
                                        throw U4.c("Invalid AC-4 DSI bitrate.");
                                    }
                                    c4233yr3.f(66);
                                    c4233yr3.k();
                                } else {
                                    i25 = h16;
                                }
                                B0 b02 = new B0();
                                b02.f23796a = true;
                                b02.f23797b = -1;
                                b02.f23798c = -1;
                                b02.f23799d = true;
                                list = list2;
                                b02.f23800e = 2;
                                b02.f23801f = 1;
                                b02.f23802g = 0;
                                int i55 = 0;
                                while (i55 < h17) {
                                    if (h15 == 0) {
                                        boolean g4 = c4233yr3.g();
                                        int h18 = c4233yr3.h(5);
                                        str8 = str2;
                                        h9 = c4233yr3.h(5);
                                        i22 = i35;
                                        z9 = g4;
                                        i29 = h18;
                                        i30 = 0;
                                        z10 = false;
                                        i31 = 0;
                                    } else {
                                        int i56 = h17;
                                        int h19 = c4233yr3.h(8);
                                        str8 = str2;
                                        int h20 = c4233yr3.h(8);
                                        i22 = i35;
                                        int h21 = h20 == 255 ? c4233yr3.h(16) + com.anythink.basead.exoplayer.k.p.f8473b : h20;
                                        if (h19 > 2) {
                                            c4233yr3.f(h21 * 8);
                                            i55++;
                                            h17 = i56;
                                            str2 = str8;
                                            i35 = i22;
                                        } else {
                                            int b14 = (b13 - c4233yr3.b()) / 8;
                                            int i57 = h21;
                                            int h22 = c4233yr3.h(5);
                                            z10 = h22 == 31;
                                            i31 = b14;
                                            h9 = h19;
                                            i29 = h22;
                                            i30 = i57;
                                            z9 = false;
                                        }
                                    }
                                    b02.f23801f = h9;
                                    boolean z12 = z10;
                                    if (z9 || z12 || i29 != 6) {
                                        b02.f23802g = c4233yr3.h(3);
                                        if (c4233yr3.g()) {
                                            c4233yr3.f(5);
                                        }
                                        c4233yr3.f(2);
                                        int i58 = 1;
                                        if (h15 == 1) {
                                            if (h9 != 1) {
                                                if (h9 == 2) {
                                                    h9 = 2;
                                                }
                                            }
                                            c4233yr3.f(2);
                                        }
                                        c4233yr3.f(5);
                                        c4233yr3.f(10);
                                        if (h15 == 1) {
                                            if (h9 > 0) {
                                                b02.f23796a = c4233yr3.g();
                                            }
                                            if (b02.f23796a) {
                                                if (h9 != 1) {
                                                    i33 = 2;
                                                    if (h9 == 2) {
                                                        i32 = 2;
                                                    } else {
                                                        i32 = h9;
                                                        c4233yr3.f(24);
                                                        i58 = 1;
                                                    }
                                                } else {
                                                    i32 = 1;
                                                }
                                                int h23 = c4233yr3.h(5);
                                                if (h23 >= 0 && h23 <= 15) {
                                                    b02.f23797b = h23;
                                                }
                                                if (h23 < 11 || h23 > 14) {
                                                    i33 = 2;
                                                } else {
                                                    b02.f23799d = c4233yr3.g();
                                                    i33 = 2;
                                                    b02.f23800e = c4233yr3.h(2);
                                                }
                                                c4233yr3.f(24);
                                                i58 = 1;
                                            } else {
                                                i33 = 2;
                                                i32 = h9;
                                            }
                                            if (h9 == i58 || h9 == i33) {
                                                if (c4233yr3.g() && c4233yr3.g()) {
                                                    c4233yr3.f(i33);
                                                }
                                                if (c4233yr3.g()) {
                                                    c4233yr3.e();
                                                    int i59 = 8;
                                                    int h24 = c4233yr3.h(8);
                                                    int i60 = 0;
                                                    while (i60 < h24) {
                                                        c4233yr3.f(i59);
                                                        i60++;
                                                        i59 = 8;
                                                    }
                                                }
                                            }
                                        } else {
                                            i32 = h9;
                                        }
                                        if (!z9 && !z12) {
                                            c4233yr3.e();
                                            if (i29 == 0 || i29 == 1 || i29 == 2) {
                                                if (i32 == 0) {
                                                    for (int i61 = 0; i61 < 2; i61++) {
                                                        MA.F(c4233yr3, b02);
                                                    }
                                                    i32 = 0;
                                                    c4233yr3.e();
                                                    if (c4233yr3.g()) {
                                                    }
                                                    if (i32 > 0) {
                                                    }
                                                    i34 = 1;
                                                    c4233yr3.k();
                                                    if (h15 == i34) {
                                                    }
                                                    if (b02.f23796a) {
                                                    }
                                                    if (b02.f23796a) {
                                                    }
                                                    if (i26 > 0) {
                                                    }
                                                } else {
                                                    for (int i62 = 0; i62 < 2; i62++) {
                                                        MA.L(c4233yr3, b02);
                                                    }
                                                    c4233yr3.e();
                                                    if (c4233yr3.g()) {
                                                    }
                                                    if (i32 > 0) {
                                                    }
                                                    i34 = 1;
                                                    c4233yr3.k();
                                                    if (h15 == i34) {
                                                    }
                                                    if (b02.f23796a) {
                                                    }
                                                    if (b02.f23796a) {
                                                    }
                                                    if (i26 > 0) {
                                                    }
                                                }
                                            } else if (i29 != 3 && i29 != 4) {
                                                if (i29 != 5) {
                                                    int h25 = c4233yr3.h(7);
                                                    for (int i63 = 0; i63 < h25; i63++) {
                                                        c4233yr3.f(8);
                                                    }
                                                } else if (i32 == 0) {
                                                    MA.F(c4233yr3, b02);
                                                    i32 = 0;
                                                } else {
                                                    int h26 = c4233yr3.h(3);
                                                    for (int i64 = 0; i64 < h26 + 2; i64++) {
                                                        MA.L(c4233yr3, b02);
                                                    }
                                                }
                                                c4233yr3.e();
                                                if (c4233yr3.g()) {
                                                }
                                                if (i32 > 0) {
                                                }
                                                i34 = 1;
                                                c4233yr3.k();
                                                if (h15 == i34) {
                                                }
                                                if (b02.f23796a) {
                                                }
                                                if (b02.f23796a) {
                                                }
                                                if (i26 > 0) {
                                                }
                                            } else if (i32 == 0) {
                                                for (int i65 = 0; i65 < 3; i65++) {
                                                    MA.F(c4233yr3, b02);
                                                }
                                                i32 = 0;
                                                c4233yr3.e();
                                                if (c4233yr3.g()) {
                                                }
                                                if (i32 > 0) {
                                                }
                                                i34 = 1;
                                                c4233yr3.k();
                                                if (h15 == i34) {
                                                }
                                                if (b02.f23796a) {
                                                }
                                                if (b02.f23796a) {
                                                }
                                                if (i26 > 0) {
                                                }
                                            } else {
                                                for (int i66 = 0; i66 < 3; i66++) {
                                                    MA.L(c4233yr3, b02);
                                                }
                                                c4233yr3.e();
                                                if (c4233yr3.g()) {
                                                }
                                                if (i32 > 0) {
                                                }
                                                i34 = 1;
                                                c4233yr3.k();
                                                if (h15 == i34) {
                                                }
                                                if (b02.f23796a) {
                                                }
                                                if (b02.f23796a) {
                                                }
                                                if (i26 > 0) {
                                                }
                                            }
                                        } else if (i32 == 0) {
                                            MA.F(c4233yr3, b02);
                                            i32 = 0;
                                            c4233yr3.e();
                                            if (c4233yr3.g()) {
                                                h9 = i32;
                                            }
                                            if (i32 > 0) {
                                                if (c4233yr3.g()) {
                                                    if (c4233yr3.b() < 66) {
                                                        z11 = false;
                                                    } else {
                                                        c4233yr3.f(66);
                                                        z11 = true;
                                                    }
                                                    if (!z11) {
                                                        throw U4.c("Can't parse bitrate DSI.");
                                                    }
                                                }
                                                if (c4233yr3.g()) {
                                                    c4233yr3.k();
                                                    c4233yr3.l(c4233yr3.h(16));
                                                    int h27 = c4233yr3.h(5);
                                                    for (int i67 = 0; i67 < h27; i67++) {
                                                        c4233yr3.f(3);
                                                        c4233yr3.f(8);
                                                    }
                                                    i34 = 1;
                                                    c4233yr3.k();
                                                    if (h15 == i34) {
                                                        int b15 = ((b13 - c4233yr3.b()) / 8) - i31;
                                                        if (i30 < b15) {
                                                            throw U4.c("pres_bytes is smaller than presentation bytes read.");
                                                        }
                                                        c4233yr3.l(i30 - b15);
                                                    }
                                                    if (b02.f23796a && b02.f23797b == -1) {
                                                        StringBuilder sb2 = new StringBuilder(String.valueOf(i55).length() + 45);
                                                        sb2.append("Can't determine channel mode of presentation ");
                                                        sb2.append(i55);
                                                        throw U4.c(sb2.toString());
                                                    }
                                                    if (b02.f23796a) {
                                                        int i68 = b02.f23798c;
                                                        if (i68 > 0) {
                                                            i26 = i68 + 1;
                                                            if (b02.f23802g == 4 && i26 == 17) {
                                                                i26 = 21;
                                                            }
                                                        } else {
                                                            int i69 = b02.f23802g;
                                                            if (i69 != 0) {
                                                                if (i69 == 1) {
                                                                    i26 = 6;
                                                                } else if (i69 == 2) {
                                                                    i26 = 8;
                                                                } else if (i69 == 3) {
                                                                    i26 = 10;
                                                                } else if (i69 != 4) {
                                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(i69).length() + 33);
                                                                    sb3.append("AC-4 level ");
                                                                    sb3.append(i69);
                                                                    sb3.append(" has not been defined.");
                                                                    AbstractC2968bG.y("Ac4Util", sb3.toString());
                                                                } else {
                                                                    i26 = 12;
                                                                }
                                                            }
                                                            i26 = 2;
                                                        }
                                                    } else {
                                                        int i70 = b02.f23797b;
                                                        boolean z13 = b02.f23799d;
                                                        int i71 = b02.f23800e;
                                                        switch (i70) {
                                                            case 0:
                                                                i27 = 11;
                                                                i28 = 1;
                                                                break;
                                                            case 1:
                                                                i27 = 11;
                                                                i28 = 2;
                                                                break;
                                                            case 2:
                                                                i27 = 11;
                                                                i28 = 3;
                                                                break;
                                                            case 3:
                                                                i27 = 11;
                                                                i28 = 5;
                                                                break;
                                                            case 4:
                                                                i27 = 11;
                                                                i28 = 6;
                                                                break;
                                                            case 5:
                                                            case 7:
                                                            case 9:
                                                                i27 = 11;
                                                                i28 = 7;
                                                                break;
                                                            case 6:
                                                            case 8:
                                                            case 10:
                                                                i27 = 11;
                                                                i28 = 8;
                                                                break;
                                                            case 11:
                                                                i27 = 11;
                                                                i28 = 11;
                                                                break;
                                                            case 12:
                                                                i27 = 11;
                                                                i28 = 12;
                                                                break;
                                                            case 13:
                                                                i27 = 11;
                                                                i28 = 13;
                                                                break;
                                                            case 14:
                                                                i27 = 11;
                                                                i28 = 14;
                                                                break;
                                                            case 15:
                                                                i27 = 11;
                                                                i28 = 24;
                                                                break;
                                                            default:
                                                                i27 = 11;
                                                                i28 = -1;
                                                                break;
                                                        }
                                                        if (i70 == i27 || i70 == 12 || i70 == 13 || i70 == 14) {
                                                            if (!z13) {
                                                                i28 -= 2;
                                                            }
                                                            if (i71 == 0) {
                                                                i26 = i28 - 4;
                                                            } else if (i71 == 1) {
                                                                i26 = i28 - 2;
                                                            }
                                                        }
                                                        i26 = i28;
                                                    }
                                                    if (i26 > 0) {
                                                        throw U4.c("Cannot determine channel count of presentation.");
                                                    }
                                                    Object[] objArr = {Integer.valueOf(i25), Integer.valueOf(b02.f23801f), Integer.valueOf(b02.f23802g)};
                                                    String str13 = AbstractC3159eu.f29993a;
                                                    String format2 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                                    C3299hP c3299hP3 = new C3299hP();
                                                    c3299hP3.f30780a = num3;
                                                    c3299hP3.e("audio/ac4");
                                                    c3299hP3.f30772G = i26;
                                                    c3299hP3.f30774I = i53;
                                                    c3299hP3.f30796r = eo2;
                                                    c3299hP3.f30783d = str;
                                                    c3299hP3.f30788j = format2;
                                                    qVar.f1149d = new DP(c3299hP3);
                                                    cr2 = cr;
                                                    L6 = i44;
                                                    i19 = i42;
                                                    str5 = str8;
                                                    i39 = 8;
                                                }
                                            }
                                            i34 = 1;
                                            c4233yr3.k();
                                            if (h15 == i34) {
                                            }
                                            if (b02.f23796a) {
                                                StringBuilder sb22 = new StringBuilder(String.valueOf(i55).length() + 45);
                                                sb22.append("Can't determine channel mode of presentation ");
                                                sb22.append(i55);
                                                throw U4.c(sb22.toString());
                                            }
                                            if (b02.f23796a) {
                                            }
                                            if (i26 > 0) {
                                            }
                                        } else {
                                            MA.L(c4233yr3, b02);
                                            c4233yr3.e();
                                            if (c4233yr3.g()) {
                                            }
                                            if (i32 > 0) {
                                            }
                                            i34 = 1;
                                            c4233yr3.k();
                                            if (h15 == i34) {
                                            }
                                            if (b02.f23796a) {
                                            }
                                            if (b02.f23796a) {
                                            }
                                            if (i26 > 0) {
                                            }
                                        }
                                        str7 = str5;
                                        i42 = i19;
                                        list2 = list;
                                    }
                                    int h28 = c4233yr3.h(7);
                                    for (int i72 = 0; i72 < h28; i72++) {
                                        c4233yr3.f(15);
                                    }
                                    i32 = h9;
                                    if (i32 > 0) {
                                    }
                                    i34 = 1;
                                    c4233yr3.k();
                                    if (h15 == i34) {
                                    }
                                    if (b02.f23796a) {
                                    }
                                    if (b02.f23796a) {
                                    }
                                    if (i26 > 0) {
                                    }
                                }
                                i22 = i35;
                                str8 = str2;
                                if (b02.f23796a) {
                                }
                                if (i26 > 0) {
                                }
                            } else {
                                i22 = i35;
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
                                    i42 = b9;
                                    list2 = list;
                                    L6 = 2;
                                    i39 = 8;
                                } else if (b11 == 1684305011 || b11 == 1969517683) {
                                    i39 = 8;
                                    cr2 = cr;
                                    i16 = i22;
                                    C3299hP c3299hP4 = new C3299hP();
                                    c3299hP4.c(i10);
                                    str5 = str7;
                                    c3299hP4.e(str5);
                                    L6 = i44;
                                    c3299hP4.f30772G = L6;
                                    i19 = i42;
                                    c3299hP4.f30774I = i19;
                                    c3299hP4.f30796r = eo2;
                                    c3299hP4.f30783d = str;
                                    qVar.f1149d = new DP(c3299hP4);
                                    i22 = i16;
                                    str7 = str5;
                                    i42 = i19;
                                    list2 = list;
                                } else {
                                    if (b11 == 1682927731) {
                                        i39 = 8;
                                        int i73 = i17 - 8;
                                        byte[] bArr3 = f25647a;
                                        int length = bArr3.length;
                                        byte[] copyOf = Arrays.copyOf(bArr3, length + i73);
                                        cr2 = cr;
                                        cr2.E(i18 + 8);
                                        cr2.H(copyOf, length, i73);
                                        list2 = AbstractC3043cl.i(copyOf);
                                    } else {
                                        i39 = 8;
                                        cr2 = cr;
                                        if (b11 == 1684425825) {
                                            byte[] bArr4 = new byte[i17 - 8];
                                            bArr4[0] = 102;
                                            bArr4[1] = 76;
                                            bArr4[2] = 97;
                                            bArr4[3] = 67;
                                            cr2.E(i18 + 12);
                                            cr2.H(bArr4, 4, i17 - 12);
                                            list2 = RB.j(bArr4);
                                        } else if (b11 == 1634492771) {
                                            int i74 = i17 - 12;
                                            byte[] bArr5 = new byte[i74];
                                            cr2.E(i18 + 12);
                                            cr2.H(bArr5, 0, i74);
                                            byte[] bArr6 = AbstractC4228ym.f35218a;
                                            Cr cr4 = new Cr(bArr5);
                                            cr4.E(5);
                                            int K9 = cr4.K();
                                            cr4.E(9);
                                            int K10 = cr4.K();
                                            cr4.E(20);
                                            int[] iArr3 = {cr4.h(), K10, K9};
                                            int i75 = iArr3[0];
                                            int i76 = iArr3[1];
                                            int b16 = AbstractC3159eu.b(K9, ByteOrder.LITTLE_ENDIAN);
                                            if (b16 == 0) {
                                                b16 = -1;
                                            }
                                            list2 = RB.j(bArr5);
                                            i43 = b16;
                                            i42 = i75;
                                            L6 = i76;
                                        } else if (b11 == 1767990114) {
                                            cr2.E(i18 + 9);
                                            int a9 = UC.a(cr2.p());
                                            byte[] bArr7 = new byte[a9];
                                            cr2.H(bArr7, 0, a9);
                                            byte[] bArr8 = AbstractC4228ym.f35218a;
                                            Cr cr5 = new Cr(bArr7);
                                            String str14 = null;
                                            String str15 = null;
                                            while (cr5.B() > 0 && (str14 == null || str15 == null)) {
                                                int K11 = cr5.K();
                                                int i77 = K11 >> 3;
                                                int i78 = K11 & 2;
                                                int i79 = K11 & 1;
                                                int a10 = UC.a(cr5.p());
                                                if (i77 > 4 && i77 < 24 && i78 != 0) {
                                                    do {
                                                    } while ((cr5.K() & 128) != 0);
                                                    for (i24 = 128; (cr5.K() & i24) != 0; i24 = 128) {
                                                    }
                                                }
                                                if (i79 != 0) {
                                                    cr5.G(UC.a(cr5.p()));
                                                }
                                                int i80 = cr5.f24253b + a10;
                                                if (i77 == 31) {
                                                    cr5.G(4);
                                                    Object[] objArr2 = {Integer.valueOf(cr5.K()), Integer.valueOf(cr5.K())};
                                                    String str16 = AbstractC3159eu.f29993a;
                                                    str14 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                                } else if (i77 == 0) {
                                                    while ((cr5.K() & 128) != 0) {
                                                    }
                                                    str15 = cr5.k(4, StandardCharsets.UTF_8);
                                                    if (str15.equals("mp4a")) {
                                                        while ((cr5.K() & 128) != 0) {
                                                        }
                                                        cr5.G(2);
                                                        C4233yr c4233yr4 = new C4233yr();
                                                        c4233yr4.a(cr5);
                                                        int h29 = c4233yr4.h(5);
                                                        if (h29 == 31) {
                                                            h29 = c4233yr4.h(6) + 32;
                                                        }
                                                        StringBuilder sb5 = new StringBuilder(str15.length() + 4 + String.valueOf(h29).length());
                                                        sb5.append(str15);
                                                        sb5.append(".40.");
                                                        sb5.append(h29);
                                                        str15 = sb5.toString();
                                                        cr5.E(i80);
                                                    }
                                                }
                                                cr5.E(i80);
                                            }
                                            String s9 = (str14 == null || str15 == null) ? null : D.y.s(new StringBuilder(str14.length() + 1 + str15.length()), str14, com.anythink.core.common.d.j.f12378z, str15);
                                            L6 = i44;
                                            str12 = s9;
                                            list2 = RB.j(bArr7);
                                        } else if (b11 == 1885564227) {
                                            cr2.E(i18 + 12);
                                            ByteOrder byteOrder = (cr2.K() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int K12 = cr2.K();
                                            int b17 = i22 == 1768973165 ? AbstractC3159eu.b(K12, byteOrder) : i22 == 1718641517 ? AbstractC3159eu.c(K12, byteOrder) : i43;
                                            if (b17 == 0) {
                                                b17 = -1;
                                            }
                                            L6 = i44;
                                            i43 = b17;
                                            i22 = i22;
                                            if (b17 != -1) {
                                                str7 = com.anythink.basead.exoplayer.k.o.f8465w;
                                            }
                                            list2 = list;
                                        } else {
                                            L6 = i44;
                                            i19 = i42;
                                            str5 = str7;
                                            str7 = str5;
                                            i42 = i19;
                                            list2 = list;
                                        }
                                    }
                                    L6 = i44;
                                }
                            }
                        }
                        i19 = i42;
                        i39 = 8;
                        cr2 = cr3;
                        str7 = str5;
                        i42 = i19;
                        list2 = list;
                    }
                    if (i20 != i21) {
                        G2 j6 = j(i20, cr2);
                        str5 = (String) j6.f24909v;
                        byte[] bArr9 = (byte[]) j6.f24910w;
                        if (bArr9 == null) {
                            i22 = i16;
                            g23 = j6;
                            str7 = str5;
                            i42 = i19;
                            list2 = list;
                        } else if (com.anythink.basead.exoplayer.k.o.f8426G.equals(str5)) {
                            RC rc = AbstractC3651o1.f32833a;
                            Cr cr6 = new Cr(bArr9);
                            int i81 = 1;
                            cr6.G(1);
                            int i82 = 0;
                            while (true) {
                                g22 = j6;
                                if (cr6.B() > 0) {
                                    int I8 = cr6.I();
                                    i22 = i16;
                                    i23 = com.anythink.basead.exoplayer.k.p.f8473b;
                                    if (I8 == 255) {
                                        cr6.G(i81);
                                        i82 += com.anythink.basead.exoplayer.k.p.f8473b;
                                        j6 = g22;
                                        i16 = i22;
                                        i81 = 1;
                                    }
                                } else {
                                    i22 = i16;
                                    i23 = com.anythink.basead.exoplayer.k.p.f8473b;
                                }
                            }
                            int K13 = cr6.K() + i82;
                            int i83 = 0;
                            while (cr6.B() > 0 && cr6.I() == i23) {
                                cr6.G(1);
                                i83 += i23;
                            }
                            int K14 = cr6.K() + i83;
                            byte[] bArr10 = new byte[K13];
                            int i84 = cr6.f24253b;
                            System.arraycopy(bArr9, i84, bArr10, 0, K13);
                            int i85 = i84 + K13 + K14;
                            int length2 = bArr9.length - i85;
                            byte[] bArr11 = new byte[length2];
                            System.arraycopy(bArr9, i85, bArr11, 0, length2);
                            list2 = RB.k(bArr10, bArr11);
                            g23 = g22;
                            str7 = str5;
                            i42 = i19;
                        } else {
                            i22 = i16;
                            if (com.anythink.basead.exoplayer.k.o.f8460r.equals(str5)) {
                                C3921t2 p9 = AbstractC2639Kg.p(new C4233yr(bArr9, bArr9.length), false);
                                i19 = p9.f34191n;
                                L6 = p9.f34192u;
                                str6 = (String) p9.f34193v;
                            } else {
                                str6 = str12;
                            }
                            g23 = j6;
                            str7 = str5;
                            i42 = i19;
                            str12 = str6;
                            list2 = RB.j(bArr9);
                        }
                    }
                    i22 = i16;
                    str7 = str5;
                    i42 = i19;
                    list2 = list;
                }
                i40 = i18 + i17;
                i36 = i9;
                cr3 = cr2;
                str10 = str3;
                str11 = str4;
                str2 = str7;
                i35 = i22;
                i13 = 2;
            }
            str7 = str2;
            i17 = b10;
            i18 = i40;
            cr2 = cr3;
            i40 = i18 + i17;
            i36 = i9;
            cr3 = cr2;
            str10 = str3;
            str11 = str4;
            str2 = str7;
            i35 = i22;
            i13 = 2;
        }
        String str17 = str2;
        List list3 = list2;
        int i86 = i42;
        if (((DP) qVar.f1149d) != null || str17 == null) {
            return;
        }
        C3299hP c3299hP5 = new C3299hP();
        c3299hP5.c(i10);
        c3299hP5.e(str17);
        c3299hP5.f30788j = str12;
        c3299hP5.f30772G = L6;
        c3299hP5.f30774I = i86;
        c3299hP5.J = i43;
        c3299hP5.f30795q = list3;
        c3299hP5.f30796r = eo2;
        c3299hP5.f30783d = str;
        G2 g24 = g23;
        if (g24 != null) {
            c3299hP5.f30787h = UC.h(g24.f24907n);
            c3299hP5.i = UC.h(g24.f24908u);
        } else {
            C3380j0 c3380j02 = c3380j0;
            if (c3380j02 != null) {
                c3299hP5.f30787h = UC.h(c3380j02.f31153a);
                c3299hP5.i = UC.h(c3380j02.f31154b);
            }
        }
        qVar.f1149d = new DP(c3299hP5);
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
        if (com.anythink.basead.exoplayer.k.o.f8462t.equals(e9) || com.anythink.basead.exoplayer.k.o.f8423D.equals(e9) || com.anythink.basead.exoplayer.k.o.f8424E.equals(e9)) {
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

    public static Pair k(Cr cr, int i, int i6) {
        Integer num;
        C2901a3 c2901a3;
        Pair create;
        int i9;
        int i10;
        Integer num2;
        boolean z3;
        int i11 = cr.f24253b;
        while (i11 - i < i6) {
            cr.E(i11);
            int b9 = cr.b();
            MA.k("childAtomSize must be positive", b9 > 0);
            if (cr.b() == 1936289382) {
                int i12 = i11 + 8;
                int i13 = 0;
                int i14 = -1;
                Integer num3 = null;
                String str = null;
                while (i12 - i11 < b9) {
                    cr.E(i12);
                    int b10 = cr.b();
                    int b11 = cr.b();
                    if (b11 == 1718775137) {
                        num3 = Integer.valueOf(cr.b());
                    } else if (b11 == 1935894637) {
                        cr.G(4);
                        str = cr.k(4, StandardCharsets.UTF_8);
                    } else if (b11 == 1935894633) {
                        i14 = i12;
                        i13 = b10;
                    }
                    i12 += b10;
                }
                byte[] bArr = null;
                if (com.anythink.basead.exoplayer.b.bd.equals(str) || com.anythink.basead.exoplayer.b.be.equals(str) || com.anythink.basead.exoplayer.b.bf.equals(str) || com.anythink.basead.exoplayer.b.bg.equals(str)) {
                    MA.k("frma atom is mandatory", num3 != null);
                    MA.k("schi atom is mandatory", i14 != -1);
                    int i15 = i14 + 8;
                    while (true) {
                        if (i15 - i14 >= i13) {
                            num = num3;
                            c2901a3 = null;
                            break;
                        }
                        cr.E(i15);
                        int b12 = cr.b();
                        if (cr.b() == 1952804451) {
                            int a9 = a(cr.b());
                            cr.G(1);
                            if (a9 == 0) {
                                cr.G(1);
                                i10 = 0;
                                i9 = 0;
                            } else {
                                int K7 = cr.K();
                                i9 = K7 & 15;
                                i10 = (K7 & 240) >> 4;
                            }
                            if (cr.K() == 1) {
                                num2 = num3;
                                z3 = true;
                            } else {
                                num2 = num3;
                                z3 = false;
                            }
                            int K8 = cr.K();
                            byte[] bArr2 = new byte[16];
                            cr.H(bArr2, 0, 16);
                            if (z3 && K8 == 0) {
                                int K9 = cr.K();
                                byte[] bArr3 = new byte[K9];
                                cr.H(bArr3, 0, K9);
                                bArr = bArr3;
                            }
                            num = num2;
                            c2901a3 = new C2901a3(z3, str, K8, bArr2, i10, i9, bArr);
                        } else {
                            i15 += b12;
                        }
                    }
                    MA.k("tenc atom is mandatory", c2901a3 != null);
                    String str2 = AbstractC3159eu.f29993a;
                    create = Pair.create(num, c2901a3);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i11 += b9;
        }
        return null;
    }

    public static int l(Cr cr) {
        int K7 = cr.K();
        int i = K7 & com.anythink.expressad.video.module.a.a.f21728R;
        while ((K7 & 128) == 128) {
            K7 = cr.K();
            i = (i << 7) | (K7 & com.anythink.expressad.video.module.a.a.f21728R);
        }
        return i;
    }
}
