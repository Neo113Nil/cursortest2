package defpackage;

import android.util.Pair;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class ch3 {
    public static final byte[] a;

    static {
        int i = dvt.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static yg3 a(int i, d7k d7kVar) {
        d7kVar.H(i + 12);
        d7kVar.I(1);
        b(d7kVar);
        d7kVar.I(2);
        int v = d7kVar.v();
        if ((v & 128) != 0) {
            d7kVar.I(2);
        }
        if ((v & 64) != 0) {
            d7kVar.I(d7kVar.v());
        }
        if ((v & 32) != 0) {
            d7kVar.I(2);
        }
        d7kVar.I(1);
        b(d7kVar);
        String f = l5i.f(d7kVar.v());
        if ("audio/mpeg".equals(f) || "audio/vnd.dts".equals(f) || "audio/vnd.dts.hd".equals(f)) {
            return new yg3(-1L, f, -1L, null);
        }
        d7kVar.I(4);
        long x = d7kVar.x();
        long x2 = d7kVar.x();
        d7kVar.I(1);
        int b = b(d7kVar);
        byte[] bArr = new byte[b];
        d7kVar.f(bArr, 0, b);
        if (x2 <= 0) {
            x2 = -1;
        }
        return new yg3(x2, f, x > 0 ? x : -1L, bArr);
    }

    public static int b(d7k d7kVar) {
        int v = d7kVar.v();
        int i = v & 127;
        while ((v & 128) == 128) {
            v = d7kVar.v();
            i = (i << 7) | (v & 127);
        }
        return i;
    }

    public static int c(int i) {
        return (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static zfi d(d7k d7kVar) {
        long p;
        long p2;
        d7kVar.H(8);
        if (c(d7kVar.h()) == 0) {
            p = d7kVar.x();
            p2 = d7kVar.x();
        } else {
            p = d7kVar.p();
            p2 = d7kVar.p();
        }
        return new zfi(p, p2, d7kVar.x());
    }

    public static Pair e(d7k d7kVar, int i, int i2) {
        Integer num;
        lvs lvsVar;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = d7kVar.b;
        while (i5 - i < i2) {
            d7kVar.H(i5);
            int h = d7kVar.h();
            x97.q("childAtomSize must be positive", h > 0);
            if (d7kVar.h() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < h) {
                    d7kVar.H(i6);
                    int h2 = d7kVar.h();
                    int h3 = d7kVar.h();
                    if (h3 == 1718775137) {
                        num3 = Integer.valueOf(d7kVar.h());
                    } else if (h3 == 1935894637) {
                        d7kVar.I(4);
                        str = d7kVar.t(4, StandardCharsets.UTF_8);
                    } else if (h3 == 1935894633) {
                        i8 = i6;
                        i7 = h2;
                    }
                    i6 += h2;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    x97.q("frma atom is mandatory", num3 != null);
                    x97.q("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num3;
                            lvsVar = null;
                            break;
                        }
                        d7kVar.H(i9);
                        int h4 = d7kVar.h();
                        if (d7kVar.h() == 1952804451) {
                            int c = c(d7kVar.h());
                            d7kVar.I(1);
                            if (c == 0) {
                                d7kVar.I(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int v = d7kVar.v();
                                i3 = v & 15;
                                i4 = (v & 240) >> 4;
                            }
                            if (d7kVar.v() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int v2 = d7kVar.v();
                            byte[] bArr2 = new byte[16];
                            d7kVar.f(bArr2, 0, 16);
                            if (z && v2 == 0) {
                                int v3 = d7kVar.v();
                                byte[] bArr3 = new byte[v3];
                                d7kVar.f(bArr3, 0, v3);
                                bArr = bArr3;
                            }
                            num = num2;
                            lvsVar = new lvs(z, str, v2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += h4;
                        }
                    }
                    x97.q("tenc atom is mandatory", lvsVar != null);
                    int i10 = dvt.a;
                    create = Pair.create(num, lvsVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += h;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:434:0x07b9, code lost:
    
        if (r11 == 2) goto L408;
     */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x09e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0820 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0931 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:523:0x06ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ah3 f(d7k d7kVar, int i, int i2, String str, pqa pqaVar, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int B;
        int h;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        pqa pqaVar2;
        String str2;
        String str3;
        String str4;
        String str5;
        List list;
        int i14;
        int i15;
        int i16;
        String str6;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        String str7;
        int i22;
        String str8;
        List list2;
        int i23;
        List list3;
        String str9;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        z9 z9Var;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        boolean z2;
        boolean z3;
        int i40;
        int i41;
        boolean h2;
        int i42;
        boolean z4;
        int i43;
        int i44;
        String str10;
        int i45;
        long j;
        qsn qsnVar;
        d7k d7kVar2 = d7kVar;
        String str11 = str;
        pqa pqaVar3 = pqaVar;
        d7kVar2.H(12);
        int h3 = d7kVar2.h();
        ah3 ah3Var = new ah3(h3);
        int i46 = 0;
        while (i46 < h3) {
            int i47 = d7kVar2.b;
            int h4 = d7kVar2.h();
            String str12 = "childAtomSize must be positive";
            x97.q("childAtomSize must be positive", h4 > 0);
            int h5 = d7kVar2.h();
            if (h5 == 1635148593 || h5 == 1635148595 || h5 == 1701733238 || h5 == 1831958048 || h5 == 1836070006 || h5 == 1752589105 || h5 == 1751479857 || h5 == 1932670515 || h5 == 1211250227 || h5 == 1748121139 || h5 == 1987063864 || h5 == 1987063865 || h5 == 1635135537 || h5 == 1685479798 || h5 == 1685479729 || h5 == 1685481573 || h5 == 1685481521) {
                i3 = h3;
                d7kVar2 = d7kVar;
                i4 = i2;
                pqaVar3 = pqaVar;
                i5 = h5;
            } else if (h5 == 1634760241) {
                i4 = i2;
                i5 = h5;
                i3 = h3;
            } else {
                RuntimeException runtimeException = null;
                if (h5 == 1836069985 || h5 == 1701733217 || h5 == 1633889587 || h5 == 1700998451 || h5 == 1633889588 || h5 == 1835823201 || h5 == 1685353315 || h5 == 1685353317 || h5 == 1685353320 || h5 == 1685353324 || h5 == 1685353336 || h5 == 1935764850 || h5 == 1935767394 || h5 == 1819304813 || h5 == 1936684916 || h5 == 1953984371 || h5 == 778924082 || h5 == 778924083 || h5 == 1835557169 || h5 == 1835560241 || h5 == 1634492771 || h5 == 1634492791 || h5 == 1970037111 || h5 == 1332770163 || h5 == 1716281667 || h5 == 1767992678) {
                    d7kVar2.H(i47 + 16);
                    if (z) {
                        int B2 = d7kVar2.B();
                        d7kVar2.I(6);
                        i8 = B2;
                    } else {
                        d7kVar2.I(8);
                        i8 = 0;
                    }
                    if (i8 == 0 || i8 == 1) {
                        i3 = h3;
                        B = d7kVar2.B();
                        d7kVar2.I(6);
                        int w = d7kVar2.w();
                        d7kVar2.H(d7kVar2.b - 4);
                        h = d7kVar2.h();
                        if (i8 == 1) {
                            d7kVar2.I(16);
                        }
                        i9 = w;
                        i10 = -1;
                    } else if (i8 == 2) {
                        d7kVar2.I(16);
                        i3 = h3;
                        int round = (int) Math.round(Double.longBitsToDouble(d7kVar2.p()));
                        int z5 = d7kVar2.z();
                        d7kVar2.I(4);
                        int z6 = d7kVar2.z();
                        int z7 = d7kVar2.z();
                        boolean z8 = (z7 & 1) != 0;
                        boolean z9 = (z7 & 2) != 0;
                        if (z8) {
                            if (z6 == 32) {
                                i45 = 4;
                                d7kVar2.I(8);
                                i9 = round;
                                B = z5;
                                h = 0;
                                i10 = i45;
                            }
                            i45 = -1;
                            d7kVar2.I(8);
                            i9 = round;
                            B = z5;
                            h = 0;
                            i10 = i45;
                        } else {
                            if (z6 == 8) {
                                i45 = 3;
                            } else if (z6 == 16) {
                                i45 = z9 ? 268435456 : 2;
                            } else if (z6 == 24) {
                                i45 = z9 ? 1342177280 : 21;
                            } else {
                                if (z6 == 32) {
                                    i45 = z9 ? 1610612736 : 22;
                                }
                                i45 = -1;
                            }
                            d7kVar2.I(8);
                            i9 = round;
                            B = z5;
                            h = 0;
                            i10 = i45;
                        }
                        d7kVar2 = d7kVar;
                        i47 = i11;
                    } else {
                        i3 = h3;
                        i11 = i47;
                        i6 = h4;
                        i7 = i46;
                        d7kVar2 = d7kVar;
                        i47 = i11;
                    }
                    if (h5 == 1767992678) {
                        i12 = -1;
                        B = -1;
                    } else {
                        if (h5 == 1935764850) {
                            i12 = 8000;
                        } else if (h5 == 1935767394) {
                            i12 = 16000;
                        } else {
                            i12 = i9;
                        }
                        B = 1;
                    }
                    int i48 = d7kVar2.b;
                    if (h5 == 1701733217) {
                        Pair e = e(d7kVar2, i47, h4);
                        if (e != null) {
                            h5 = ((Integer) e.first).intValue();
                            pqaVar2 = pqaVar3 == null ? null : pqaVar3.a(((lvs) e.second).b);
                            i13 = i12;
                            ((lvs[]) ah3Var.d)[i46] = (lvs) e.second;
                        } else {
                            i13 = i12;
                            pqaVar2 = pqaVar3;
                        }
                        d7kVar2.H(i48);
                    } else {
                        i13 = i12;
                        pqaVar2 = pqaVar3;
                    }
                    String str13 = "audio/mhm1";
                    if (h5 == 1633889587) {
                        str2 = "audio/ac3";
                    } else if (h5 == 1700998451) {
                        str2 = "audio/eac3";
                    } else if (h5 == 1633889588) {
                        str2 = "audio/ac4";
                    } else if (h5 == 1685353315) {
                        str2 = "audio/vnd.dts";
                    } else if (h5 == 1685353320 || h5 == 1685353324) {
                        str2 = "audio/vnd.dts.hd";
                    } else if (h5 == 1685353317) {
                        str2 = "audio/vnd.dts.hd;profile=lbr";
                    } else if (h5 == 1685353336) {
                        str2 = "audio/vnd.dts.uhd;profile=p2";
                    } else if (h5 == 1935764850) {
                        str2 = "audio/3gpp";
                    } else if (h5 == 1935767394) {
                        str2 = "audio/amr-wb";
                    } else {
                        if (h5 != 1936684916) {
                            if (h5 == 1953984371) {
                                str2 = "audio/raw";
                                i10 = 268435456;
                            } else if (h5 != 1819304813) {
                                str2 = (h5 == 778924082 || h5 == 778924083) ? "audio/mpeg" : h5 == 1835557169 ? "audio/mha1" : h5 == 1835560241 ? "audio/mhm1" : h5 == 1634492771 ? "audio/alac" : h5 == 1634492791 ? "audio/g711-alaw" : h5 == 1970037111 ? "audio/g711-mlaw" : h5 == 1332770163 ? "audio/opus" : h5 == 1716281667 ? "audio/flac" : h5 == 1835823201 ? "audio/true-hd" : h5 == 1767992678 ? "audio/iamf" : null;
                            } else if (i10 != -1) {
                                str2 = "audio/raw";
                            }
                        }
                        str2 = "audio/raw";
                        i10 = 2;
                    }
                    String str14 = str2;
                    i11 = i47;
                    i7 = i46;
                    int i49 = i48;
                    String str15 = null;
                    List list4 = null;
                    yg3 yg3Var = null;
                    mgr mgrVar = null;
                    int i50 = B;
                    int i51 = i13;
                    while (i49 - i11 < h4) {
                        d7kVar2.H(i49);
                        int h6 = d7kVar2.h();
                        int i52 = i49;
                        x97.q(str12, h6 > 0);
                        int h7 = d7kVar2.h();
                        int i53 = h4;
                        if (h7 == 1835557187) {
                            d7kVar2.H(i52 + 8);
                            d7kVar2.I(1);
                            int v = d7kVar2.v();
                            d7kVar2.I(1);
                            String format = Objects.equals(str14, str13) ? String.format("mhm1.%02X", Integer.valueOf(v)) : String.format("mha1.%02X", Integer.valueOf(v));
                            int B3 = d7kVar2.B();
                            byte[] bArr = new byte[B3];
                            d7kVar2.f(bArr, 0, B3);
                            list4 = list4 == null ? yde.y(bArr) : yde.z(bArr, (byte[]) list4.get(0));
                            i16 = i10;
                            str6 = str13;
                            i23 = i50;
                            i21 = i52;
                            str15 = format;
                            str3 = str14;
                            str7 = str12;
                        } else if (h7 == 1835557200) {
                            d7kVar2.H(i52 + 8);
                            int v2 = d7kVar2.v();
                            if (v2 > 0) {
                                byte[] bArr2 = new byte[v2];
                                str3 = str14;
                                d7kVar2.f(bArr2, 0, v2);
                                list4 = list4 == null ? yde.y(bArr2) : yde.z((byte[]) list4.get(0), bArr2);
                            } else {
                                str3 = str14;
                            }
                            str7 = str12;
                            i16 = i10;
                            str6 = str13;
                            i23 = i50;
                            i21 = i52;
                        } else {
                            str3 = str14;
                            if (h7 == 1702061171) {
                                str4 = str15;
                                str5 = str12;
                                list = list4;
                                i14 = h6;
                                i15 = i51;
                                i16 = i10;
                                str6 = str13;
                                i17 = i50;
                                i18 = i52;
                                i19 = 1702061171;
                            } else if (z && h7 == 2002876005) {
                                str4 = str15;
                                str5 = str12;
                                list = list4;
                                i14 = h6;
                                i15 = i51;
                                i16 = i10;
                                str6 = str13;
                                i17 = i50;
                                i18 = i52;
                                i19 = 1702061171;
                            } else if (h7 == 1651798644) {
                                d7kVar2.H(i52 + 8);
                                d7kVar2.I(4);
                                str6 = str13;
                                str7 = str12;
                                i16 = i10;
                                mgrVar = new mgr(d7kVar2.x(), d7kVar2.x());
                                i23 = i50;
                                i21 = i52;
                                str15 = str15;
                            } else {
                                String str16 = str15;
                                str6 = str13;
                                if (h7 == 1684103987) {
                                    d7kVar2.H(i52 + 8);
                                    String num = Integer.toString(i);
                                    v94 v94Var = new v94();
                                    v94Var.p(d7kVar2);
                                    int i54 = nt0.b[v94Var.i(2)];
                                    v94Var.t(8);
                                    int i55 = nt0.d[v94Var.i(3)];
                                    if (v94Var.i(1) != 0) {
                                        i55++;
                                    }
                                    int i56 = nt0.e[v94Var.i(5)] * 1000;
                                    v94Var.c();
                                    d7kVar2.H(v94Var.f());
                                    bsc bscVar = new bsc();
                                    bscVar.a = num;
                                    bscVar.m = l5i.p("audio/ac3");
                                    bscVar.C = i55;
                                    bscVar.D = i54;
                                    bscVar.q = pqaVar2;
                                    bscVar.d = str11;
                                    bscVar.h = i56;
                                    bscVar.i = i56;
                                    ah3Var.e = new dsc(bscVar);
                                    str9 = str12;
                                    list3 = list4;
                                    i24 = h6;
                                    i27 = i51;
                                    i16 = i10;
                                } else if (h7 == 1684366131) {
                                    d7kVar2.H(i52 + 8);
                                    String num2 = Integer.toString(i);
                                    v94 v94Var2 = new v94();
                                    v94Var2.p(d7kVar2);
                                    int i57 = v94Var2.i(13) * 1000;
                                    v94Var2.t(3);
                                    int i58 = nt0.b[v94Var2.i(2)];
                                    v94Var2.t(10);
                                    int i59 = nt0.d[v94Var2.i(3)];
                                    if (v94Var2.i(1) != 0) {
                                        i59++;
                                    }
                                    v94Var2.t(3);
                                    int i60 = v94Var2.i(4);
                                    v94Var2.t(1);
                                    list3 = list4;
                                    if (i60 > 0) {
                                        v94Var2.t(6);
                                        if (v94Var2.i(1) != 0) {
                                            i59 += 2;
                                        }
                                        v94Var2.t(1);
                                    }
                                    int i61 = i59;
                                    i16 = i10;
                                    if (v94Var2.b() > 7) {
                                        v94Var2.t(7);
                                        if (v94Var2.i(1) != 0) {
                                            str10 = "audio/eac3-joc";
                                            v94Var2.c();
                                            d7kVar2.H(v94Var2.f());
                                            bsc bscVar2 = new bsc();
                                            bscVar2.a = num2;
                                            bscVar2.m = l5i.p(str10);
                                            bscVar2.C = i61;
                                            bscVar2.D = i58;
                                            bscVar2.q = pqaVar2;
                                            bscVar2.d = str11;
                                            bscVar2.i = i57;
                                            ah3Var.e = new dsc(bscVar2);
                                            str9 = str12;
                                            i24 = h6;
                                            i27 = i51;
                                        }
                                    }
                                    str10 = "audio/eac3";
                                    v94Var2.c();
                                    d7kVar2.H(v94Var2.f());
                                    bsc bscVar22 = new bsc();
                                    bscVar22.a = num2;
                                    bscVar22.m = l5i.p(str10);
                                    bscVar22.C = i61;
                                    bscVar22.D = i58;
                                    bscVar22.q = pqaVar2;
                                    bscVar22.d = str11;
                                    bscVar22.i = i57;
                                    ah3Var.e = new dsc(bscVar22);
                                    str9 = str12;
                                    i24 = h6;
                                    i27 = i51;
                                } else {
                                    list3 = list4;
                                    i16 = i10;
                                    if (h7 == 1684103988) {
                                        d7kVar2.H(i52 + 8);
                                        String num3 = Integer.toString(i);
                                        v94 v94Var3 = new v94();
                                        v94Var3.p(d7kVar2);
                                        int b = v94Var3.b();
                                        int i62 = v94Var3.i(3);
                                        if (i62 > 1) {
                                            throw r7k.c("Unsupported AC-4 DSI version: " + i62);
                                        }
                                        int i63 = v94Var3.i(7);
                                        int i64 = v94Var3.h() ? ScreenMirroringConfig.Audio.SAMPLING_RATE : RemoteCameraConfig.Mic.SAMPLING_RATE;
                                        v94Var3.t(4);
                                        int i65 = v94Var3.i(9);
                                        if (i63 > 1) {
                                            if (i62 == 0) {
                                                throw r7k.c("Invalid AC-4 DSI version: " + i62);
                                            }
                                            if (v94Var3.h()) {
                                                v94Var3.t(16);
                                                i28 = i52;
                                                if (v94Var3.h()) {
                                                    v94Var3.t(128);
                                                }
                                                if (i62 != 1) {
                                                    str9 = str12;
                                                    if (v94Var3.b() < 66) {
                                                        throw r7k.c("Invalid AC-4 DSI bitrate.");
                                                    }
                                                    v94Var3.t(66);
                                                    v94Var3.c();
                                                } else {
                                                    str9 = str12;
                                                }
                                                z9Var = new z9();
                                                z9Var.d = true;
                                                z9Var.a = -1;
                                                z9Var.b = -1;
                                                z9Var.e = true;
                                                z9Var.c = 2;
                                                z9Var.f = 0;
                                                i29 = 0;
                                                while (true) {
                                                    z9 z9Var2 = z9Var;
                                                    if (i29 < i65) {
                                                        i24 = h6;
                                                        i30 = i51;
                                                        i25 = i28;
                                                        i31 = i50;
                                                        z9Var = z9Var2;
                                                        i32 = 8;
                                                        i33 = 7;
                                                    } else if (i62 == 0) {
                                                        boolean h8 = v94Var3.h();
                                                        i24 = h6;
                                                        i25 = i28;
                                                        i37 = v94Var3.i(5);
                                                        z9Var = z9Var2;
                                                        i38 = v94Var3.i(5);
                                                        i39 = 0;
                                                        z2 = false;
                                                        z3 = h8;
                                                        i40 = 0;
                                                    } else {
                                                        i43 = i65;
                                                        int i66 = v94Var3.i(8);
                                                        i24 = h6;
                                                        int i67 = v94Var3.i(8);
                                                        if (i67 == 255) {
                                                            z9Var = z9Var2;
                                                            i44 = v94Var3.i(16) + i67;
                                                        } else {
                                                            z9Var = z9Var2;
                                                            i44 = i67;
                                                        }
                                                        if (i66 > 2) {
                                                            v94Var3.t(i44 * 8);
                                                            i29++;
                                                            i65 = i43;
                                                            h6 = i24;
                                                        } else {
                                                            int b2 = (b - v94Var3.b()) / 8;
                                                            i37 = v94Var3.i(5);
                                                            z2 = i37 == 31;
                                                            i40 = i44;
                                                            i25 = i28;
                                                            i38 = i66;
                                                            i39 = b2;
                                                            z3 = false;
                                                        }
                                                    }
                                                }
                                                i30 = i51;
                                                if (z3 && !z2 && i37 == 6) {
                                                    i41 = i38;
                                                    i31 = i50;
                                                    h2 = true;
                                                } else {
                                                    i31 = i50;
                                                    z9Var.f = v94Var3.i(3);
                                                    if (v94Var3.h()) {
                                                        v94Var3.t(5);
                                                    }
                                                    v94Var3.t(2);
                                                    if (i62 == 1 && (i38 == 1 || i38 == 2)) {
                                                        v94Var3.t(2);
                                                    }
                                                    v94Var3.t(5);
                                                    v94Var3.t(10);
                                                    if (i62 == 1) {
                                                        if (i38 > 0) {
                                                            z9Var.d = v94Var3.h();
                                                        }
                                                        if (z9Var.d) {
                                                            if (i38 != 1) {
                                                                i42 = 2;
                                                            }
                                                            int i68 = v94Var3.i(5);
                                                            if (i68 >= 0 && i68 <= 15) {
                                                                z9Var.a = i68;
                                                            }
                                                            if (i68 < 11 || i68 > 14) {
                                                                i42 = 2;
                                                            } else {
                                                                z9Var.e = v94Var3.h();
                                                                i42 = 2;
                                                                z9Var.c = v94Var3.i(2);
                                                            }
                                                            v94Var3.t(24);
                                                        } else {
                                                            i42 = 2;
                                                        }
                                                        if (i38 == 1 || i38 == i42) {
                                                            if (v94Var3.h() && v94Var3.h()) {
                                                                v94Var3.t(i42);
                                                            }
                                                            if (v94Var3.h()) {
                                                                v94Var3.s();
                                                                int i69 = 8;
                                                                int i70 = v94Var3.i(8);
                                                                i41 = i38;
                                                                int i71 = 0;
                                                                while (i71 < i70) {
                                                                    v94Var3.t(i69);
                                                                    i71++;
                                                                    i69 = 8;
                                                                }
                                                                if (z3 && !z2) {
                                                                    v94Var3.s();
                                                                    if (i37 == 0 || i37 == 1 || i37 == 2) {
                                                                        if (i41 == 0) {
                                                                            for (int i72 = 0; i72 < 2; i72++) {
                                                                                ot0.P(v94Var3, z9Var);
                                                                            }
                                                                        } else {
                                                                            for (int i73 = 0; i73 < 2; i73++) {
                                                                                ot0.Q(v94Var3, z9Var);
                                                                            }
                                                                        }
                                                                    } else if (i37 == 3 || i37 == 4) {
                                                                        if (i41 == 0) {
                                                                            for (int i74 = 0; i74 < 3; i74++) {
                                                                                ot0.P(v94Var3, z9Var);
                                                                            }
                                                                        } else {
                                                                            for (int i75 = 0; i75 < 3; i75++) {
                                                                                ot0.Q(v94Var3, z9Var);
                                                                            }
                                                                        }
                                                                    } else if (i37 != 5) {
                                                                        int i76 = v94Var3.i(7);
                                                                        for (int i77 = 0; i77 < i76; i77++) {
                                                                            v94Var3.t(8);
                                                                        }
                                                                    } else if (i41 == 0) {
                                                                        ot0.P(v94Var3, z9Var);
                                                                    } else {
                                                                        int i78 = v94Var3.i(3);
                                                                        for (int i79 = 0; i79 < i78 + 2; i79++) {
                                                                            ot0.Q(v94Var3, z9Var);
                                                                        }
                                                                    }
                                                                } else if (i41 == 0) {
                                                                    ot0.P(v94Var3, z9Var);
                                                                } else {
                                                                    ot0.Q(v94Var3, z9Var);
                                                                }
                                                                v94Var3.s();
                                                                h2 = v94Var3.h();
                                                            }
                                                        }
                                                    }
                                                    i41 = i38;
                                                    if (z3) {
                                                    }
                                                    if (i41 == 0) {
                                                    }
                                                    v94Var3.s();
                                                    h2 = v94Var3.h();
                                                }
                                                i33 = 7;
                                                if (h2) {
                                                    int i80 = v94Var3.i(7);
                                                    for (int i81 = 0; i81 < i80; i81++) {
                                                        v94Var3.t(15);
                                                    }
                                                }
                                                if (i41 > 0) {
                                                    if (v94Var3.h()) {
                                                        if (v94Var3.b() < 66) {
                                                            z4 = false;
                                                        } else {
                                                            v94Var3.t(66);
                                                            z4 = true;
                                                        }
                                                        if (!z4) {
                                                            throw r7k.c("Can't parse bitrate DSI.");
                                                        }
                                                    }
                                                    if (v94Var3.h()) {
                                                        v94Var3.c();
                                                        v94Var3.u(v94Var3.i(16));
                                                        int i82 = v94Var3.i(5);
                                                        for (int i83 = 0; i83 < i82; i83++) {
                                                            v94Var3.t(3);
                                                            v94Var3.t(8);
                                                        }
                                                    }
                                                }
                                                i32 = 8;
                                                v94Var3.c();
                                                if (i62 == 1) {
                                                    int b3 = ((b - v94Var3.b()) / 8) - i39;
                                                    if (i40 < b3) {
                                                        throw r7k.c("pres_bytes is smaller than presentation bytes read.");
                                                    }
                                                    v94Var3.u(i40 - b3);
                                                }
                                                if (z9Var.d && z9Var.a == -1) {
                                                    throw r7k.c("Can't determine channel mode of presentation " + i29);
                                                }
                                                if (z9Var.d) {
                                                    i34 = z9Var.b + 1;
                                                    if (z9Var.f == 4) {
                                                        i35 = i34 == 17 ? 21 : i34;
                                                    }
                                                    if (i34 <= 0) {
                                                        throw r7k.c("Can't determine channel count of presentation.");
                                                    }
                                                    bsc bscVar3 = new bsc();
                                                    bscVar3.a = num3;
                                                    bscVar3.m = l5i.p("audio/ac4");
                                                    bscVar3.C = i34;
                                                    bscVar3.D = i64;
                                                    bscVar3.q = pqaVar2;
                                                    bscVar3.d = str11;
                                                    ah3Var.e = new dsc(bscVar3);
                                                    i27 = i30;
                                                    i26 = i31;
                                                    i23 = i26;
                                                    i51 = i27;
                                                    str15 = str16;
                                                    list4 = list3;
                                                    str7 = str9;
                                                    h6 = i24;
                                                    i21 = i25;
                                                } else {
                                                    int i84 = z9Var.a;
                                                    boolean z10 = z9Var.e;
                                                    int i85 = z9Var.c;
                                                    switch (i84) {
                                                        case 0:
                                                            i36 = 11;
                                                            i35 = 1;
                                                            break;
                                                        case 1:
                                                            i36 = 11;
                                                            i35 = 2;
                                                            break;
                                                        case 2:
                                                            i36 = 11;
                                                            i35 = 3;
                                                            break;
                                                        case 3:
                                                            i36 = 11;
                                                            i35 = 5;
                                                            break;
                                                        case 4:
                                                            i36 = 11;
                                                            i35 = 6;
                                                            break;
                                                        case 5:
                                                        case 7:
                                                        case 9:
                                                            i35 = i33;
                                                            i36 = 11;
                                                            break;
                                                        case 6:
                                                        case 8:
                                                        case 10:
                                                            i35 = i32;
                                                            i36 = 11;
                                                            break;
                                                        case 11:
                                                            i36 = 11;
                                                            i35 = 11;
                                                            break;
                                                        case 12:
                                                            i36 = 11;
                                                            i35 = 12;
                                                            break;
                                                        case 13:
                                                            i36 = 11;
                                                            i35 = 13;
                                                            break;
                                                        case 14:
                                                            i36 = 11;
                                                            i35 = 14;
                                                            break;
                                                        case 15:
                                                            i36 = 11;
                                                            i35 = 24;
                                                            break;
                                                        default:
                                                            i36 = 11;
                                                            i35 = -1;
                                                            break;
                                                    }
                                                    if (i84 == i36 || i84 == 12 || i84 == 13 || i84 == 14) {
                                                        if (!z10) {
                                                            i35 -= 2;
                                                        }
                                                        if (i85 == 0) {
                                                            i35 -= 4;
                                                        } else if (i85 == 1) {
                                                            i35 -= 2;
                                                        }
                                                    }
                                                }
                                                i34 = i35;
                                                if (i34 <= 0) {
                                                }
                                            }
                                        }
                                        i28 = i52;
                                        if (i62 != 1) {
                                        }
                                        z9Var = new z9();
                                        z9Var.d = true;
                                        z9Var.a = -1;
                                        z9Var.b = -1;
                                        z9Var.e = true;
                                        z9Var.c = 2;
                                        z9Var.f = 0;
                                        i29 = 0;
                                        while (true) {
                                            z9 z9Var22 = z9Var;
                                            if (i29 < i65) {
                                            }
                                            v94Var3.t(i44 * 8);
                                            i29++;
                                            i65 = i43;
                                            h6 = i24;
                                        }
                                        i30 = i51;
                                        if (z3) {
                                        }
                                        i31 = i50;
                                        z9Var.f = v94Var3.i(3);
                                        if (v94Var3.h()) {
                                        }
                                        v94Var3.t(2);
                                        if (i62 == 1) {
                                            v94Var3.t(2);
                                        }
                                        v94Var3.t(5);
                                        v94Var3.t(10);
                                        if (i62 == 1) {
                                        }
                                        i41 = i38;
                                        if (z3) {
                                        }
                                        if (i41 == 0) {
                                        }
                                        v94Var3.s();
                                        h2 = v94Var3.h();
                                        i33 = 7;
                                        if (h2) {
                                        }
                                        if (i41 > 0) {
                                        }
                                        i32 = 8;
                                        v94Var3.c();
                                        if (i62 == 1) {
                                        }
                                        if (z9Var.d) {
                                            throw r7k.c("Can't determine channel mode of presentation " + i29);
                                        }
                                        if (z9Var.d) {
                                        }
                                        i34 = i35;
                                        if (i34 <= 0) {
                                        }
                                    } else {
                                        str9 = str12;
                                        i24 = h6;
                                        int i86 = i51;
                                        i23 = i50;
                                        i25 = i52;
                                        if (h7 != 1684892784) {
                                            if (h7 == 1684305011 || h7 == 1969517683) {
                                                bsc bscVar4 = new bsc();
                                                bscVar4.a = Integer.toString(i);
                                                bscVar4.m = l5i.p(str3);
                                                i26 = i23;
                                                bscVar4.C = i26;
                                                i27 = i86;
                                                bscVar4.D = i27;
                                                bscVar4.q = pqaVar2;
                                                bscVar4.d = str11;
                                                ah3Var.e = new dsc(bscVar4);
                                            } else if (h7 == 1682927731) {
                                                int i87 = i24 - 8;
                                                byte[] bArr3 = a;
                                                byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i87);
                                                d7kVar2.H(i25 + 8);
                                                d7kVar2.f(copyOf, bArr3.length, i87);
                                                list4 = u7g.A(copyOf);
                                                str15 = str16;
                                                str7 = str9;
                                                h6 = i24;
                                                i21 = i25;
                                                i51 = i86;
                                            } else {
                                                if (h7 == 1684425825) {
                                                    byte[] bArr4 = new byte[i24 - 8];
                                                    bArr4[0] = 102;
                                                    bArr4[1] = 76;
                                                    bArr4[2] = 97;
                                                    bArr4[3] = 67;
                                                    d7kVar2.H(i25 + 12);
                                                    d7kVar2.f(bArr4, 4, i24 - 12);
                                                    list4 = yde.y(bArr4);
                                                } else if (h7 == 1634492771) {
                                                    int i88 = i24 - 12;
                                                    byte[] bArr5 = new byte[i88];
                                                    d7kVar2.H(i25 + 12);
                                                    d7kVar2.f(bArr5, 0, i88);
                                                    byte[] bArr6 = ir4.a;
                                                    d7k d7kVar3 = new d7k(bArr5);
                                                    d7kVar3.H(9);
                                                    int v3 = d7kVar3.v();
                                                    d7kVar3.H(20);
                                                    Pair create = Pair.create(Integer.valueOf(d7kVar3.z()), Integer.valueOf(v3));
                                                    int intValue = ((Integer) create.first).intValue();
                                                    int intValue2 = ((Integer) create.second).intValue();
                                                    list4 = yde.y(bArr5);
                                                    i23 = intValue2;
                                                    i51 = intValue;
                                                    str15 = str16;
                                                    str7 = str9;
                                                    h6 = i24;
                                                    i21 = i25;
                                                } else if (h7 == 1767990114) {
                                                    d7kVar2.H(i25 + 9);
                                                    long j2 = 0;
                                                    int i89 = 0;
                                                    for (int i90 = 9; i89 < i90; i90 = 9) {
                                                        if (d7kVar2.b == d7kVar2.c) {
                                                            xq0.q("Attempting to read a byte over the limit.");
                                                            return null;
                                                        }
                                                        long v4 = d7kVar2.v();
                                                        j2 |= (v4 & 127) << (i89 * 7);
                                                        if ((v4 & 128) == 0) {
                                                            int s = zc4.s(j2);
                                                            byte[] bArr7 = new byte[s];
                                                            d7kVar2.f(bArr7, 0, s);
                                                            list4 = yde.y(bArr7);
                                                        } else {
                                                            i89++;
                                                        }
                                                    }
                                                    int s2 = zc4.s(j2);
                                                    byte[] bArr72 = new byte[s2];
                                                    d7kVar2.f(bArr72, 0, s2);
                                                    list4 = yde.y(bArr72);
                                                } else {
                                                    i27 = i86;
                                                    i26 = i23;
                                                }
                                                str15 = str16;
                                                str7 = str9;
                                                h6 = i24;
                                                i21 = i25;
                                                i51 = i86;
                                            }
                                            i23 = i26;
                                            i51 = i27;
                                            str15 = str16;
                                            list4 = list3;
                                            str7 = str9;
                                            h6 = i24;
                                            i21 = i25;
                                        } else {
                                            if (h <= 0) {
                                                throw r7k.a(runtimeException, "Invalid sample rate for Dolby TrueHD MLP stream: " + h);
                                            }
                                            i51 = h;
                                            str15 = str16;
                                            list4 = list3;
                                            str7 = str9;
                                            h6 = i24;
                                            i21 = i25;
                                            i23 = 2;
                                        }
                                    }
                                }
                                i26 = i50;
                                i25 = i52;
                                i23 = i26;
                                i51 = i27;
                                str15 = str16;
                                list4 = list3;
                                str7 = str9;
                                h6 = i24;
                                i21 = i25;
                            }
                            if (h7 == i19) {
                                str7 = str5;
                                h6 = i14;
                                i20 = i18;
                                i21 = i20;
                            } else {
                                i20 = d7kVar2.b;
                                i21 = i18;
                                x97.q(null, i20 >= i21);
                                while (true) {
                                    h6 = i14;
                                    if (i20 - i21 < h6) {
                                        d7kVar2.H(i20);
                                        int h9 = d7kVar2.h();
                                        str7 = str5;
                                        x97.q(str7, h9 > 0);
                                        if (d7kVar2.h() != 1702061171) {
                                            i20 += h9;
                                            str5 = str7;
                                            i14 = h6;
                                        }
                                    } else {
                                        str7 = str5;
                                        i20 = -1;
                                    }
                                }
                            }
                            if (i20 != -1) {
                                yg3 a2 = a(i20, d7kVar2);
                                str8 = (String) a2.c;
                                byte[] bArr8 = (byte[]) a2.d;
                                if (bArr8 != null) {
                                    if ("audio/vorbis".equals(str8)) {
                                        d7k d7kVar4 = new d7k(bArr8);
                                        d7kVar4.I(1);
                                        int i91 = 0;
                                        while (d7kVar4.a() > 0 && d7kVar4.e() == 255) {
                                            i91 += KotlinVersion.MAX_COMPONENT_VALUE;
                                            d7kVar4.I(1);
                                        }
                                        int v5 = d7kVar4.v() + i91;
                                        int i92 = 0;
                                        while (true) {
                                            if (d7kVar4.a() > 0) {
                                                yg3Var = a2;
                                                if (d7kVar4.e() == 255) {
                                                    i92 += KotlinVersion.MAX_COMPONENT_VALUE;
                                                    d7kVar4.I(1);
                                                    a2 = yg3Var;
                                                }
                                            } else {
                                                yg3Var = a2;
                                            }
                                        }
                                        int v6 = d7kVar4.v() + i92;
                                        byte[] bArr9 = new byte[v5];
                                        int i93 = d7kVar4.b;
                                        System.arraycopy(bArr8, i93, bArr9, 0, v5);
                                        int i94 = i93 + v5 + v6;
                                        int length = bArr8.length - i94;
                                        byte[] bArr10 = new byte[length];
                                        System.arraycopy(bArr8, i94, bArr10, 0, length);
                                        list2 = yde.z(bArr9, bArr10);
                                        i22 = i17;
                                        i51 = i15;
                                        str15 = str4;
                                    } else {
                                        yg3Var = a2;
                                        if ("audio/mp4a-latm".equals(str8)) {
                                            c1 x0 = zsd.x0(new v94(bArr8, bArr8.length), false);
                                            i51 = x0.b;
                                            i22 = x0.c;
                                            str15 = x0.a;
                                        } else {
                                            i22 = i17;
                                            i51 = i15;
                                            str15 = str4;
                                        }
                                        list2 = yde.y(bArr8);
                                    }
                                    i23 = i22;
                                    str3 = str8;
                                    list4 = list2;
                                } else {
                                    yg3Var = a2;
                                    i22 = i17;
                                    i51 = i15;
                                }
                            } else {
                                i22 = i17;
                                i51 = i15;
                                str8 = str3;
                            }
                            str15 = str4;
                            list2 = list;
                            i23 = i22;
                            str3 = str8;
                            list4 = list2;
                        }
                        i49 = i21 + h6;
                        d7kVar2 = d7kVar;
                        str12 = str7;
                        h4 = i53;
                        str14 = str3;
                        str13 = str6;
                        i10 = i16;
                        i50 = i23;
                        runtimeException = null;
                    }
                    String str17 = str15;
                    i6 = h4;
                    String str18 = str14;
                    List list5 = list4;
                    int i95 = i51;
                    int i96 = i10;
                    int i97 = i50;
                    if (((dsc) ah3Var.e) == null && str18 != null) {
                        bsc bscVar5 = new bsc();
                        bscVar5.a = Integer.toString(i);
                        bscVar5.m = l5i.p(str18);
                        bscVar5.j = str17;
                        bscVar5.C = i97;
                        bscVar5.D = i95;
                        bscVar5.E = i96;
                        bscVar5.p = list5;
                        bscVar5.q = pqaVar2;
                        bscVar5.d = str11;
                        if (yg3Var != null) {
                            yg3 yg3Var2 = yg3Var;
                            bscVar5.h = zc4.W(yg3Var2.a);
                            bscVar5.i = zc4.W(yg3Var2.b);
                        } else {
                            mgr mgrVar2 = mgrVar;
                            if (mgrVar2 != null) {
                                bscVar5.h = zc4.W(mgrVar2.a);
                                bscVar5.i = zc4.W(mgrVar2.b);
                            }
                        }
                        ah3Var.e = new dsc(bscVar5);
                    }
                    d7kVar2 = d7kVar;
                    i47 = i11;
                } else {
                    if (h5 == 1414810956 || h5 == 1954034535 || h5 == 2004251764 || h5 == 1937010800 || h5 == 1664495672) {
                        d7kVar2.H(i47 + 16);
                        String str19 = "application/ttml+xml";
                        if (h5 != 1414810956) {
                            if (h5 == 1954034535) {
                                int i98 = h4 - 16;
                                byte[] bArr11 = new byte[i98];
                                d7kVar2.f(bArr11, 0, i98);
                                str19 = "application/x-quicktime-tx3g";
                                qsnVar = yde.y(bArr11);
                                j = Long.MAX_VALUE;
                                bsc bscVar6 = new bsc();
                                bscVar6.a = Integer.toString(i);
                                bscVar6.m = l5i.p(str19);
                                bscVar6.d = str11;
                                bscVar6.r = j;
                                bscVar6.p = qsnVar;
                                ah3Var.e = new dsc(bscVar6);
                            } else if (h5 == 2004251764) {
                                str19 = "application/x-mp4-vtt";
                            } else if (h5 == 1937010800) {
                                j = 0;
                                qsnVar = null;
                                bsc bscVar62 = new bsc();
                                bscVar62.a = Integer.toString(i);
                                bscVar62.m = l5i.p(str19);
                                bscVar62.d = str11;
                                bscVar62.r = j;
                                bscVar62.p = qsnVar;
                                ah3Var.e = new dsc(bscVar62);
                            } else {
                                if (h5 != 1664495672) {
                                    e7o.n();
                                    return null;
                                }
                                ah3Var.c = 1;
                                str19 = "application/x-mp4-cea-608";
                            }
                        }
                        qsnVar = null;
                        j = Long.MAX_VALUE;
                        bsc bscVar622 = new bsc();
                        bscVar622.a = Integer.toString(i);
                        bscVar622.m = l5i.p(str19);
                        bscVar622.d = str11;
                        bscVar622.r = j;
                        bscVar622.p = qsnVar;
                        ah3Var.e = new dsc(bscVar622);
                    } else if (h5 == 1835365492) {
                        d7kVar2.H(i47 + 16);
                        if (h5 == 1835365492) {
                            d7kVar2.q();
                            String q = d7kVar2.q();
                            if (q != null) {
                                bsc bscVar7 = new bsc();
                                bscVar7.a = Integer.toString(i);
                                bscVar7.m = l5i.p(q);
                                ah3Var.e = new dsc(bscVar7);
                            }
                        }
                    } else if (h5 == 1667329389) {
                        bsc bscVar8 = new bsc();
                        bscVar8.a = Integer.toString(i);
                        bscVar8.m = l5i.p("application/x-camera-motion");
                        ah3Var.e = new dsc(bscVar8);
                    }
                    i6 = h4;
                    i7 = i46;
                    i3 = h3;
                }
                d7kVar2.H(i47 + i6);
                i46 = i7 + 1;
                str11 = str;
                pqaVar3 = pqaVar;
                h3 = i3;
            }
            h(d7kVar2, i5, i47, h4, i, str11, i4, pqaVar3, ah3Var, i46);
            i6 = h4;
            i7 = i46;
            d7kVar2.H(i47 + i6);
            i46 = i7 + 1;
            str11 = str;
            pqaVar3 = pqaVar;
            h3 = i3;
        }
        return ah3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:318:0x00de, code lost:
    
        if (r11 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x00e0, code lost:
    
        r11 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05ee A[ADDED_TO_REGION, LOOP:15: B:264:0x05ee->B:267:0x05f8, LOOP_START, PHI: r17
      0x05ee: PHI (r17v8 int) = (r17v6 int), (r17v9 int) binds: [B:263:0x05ec, B:267:0x05f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x094e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList g(ufi ufiVar, n1d n1dVar, long j, pqa pqaVar, boolean z, boolean z2, myc mycVar) {
        long j2;
        int i;
        long j3;
        int i2;
        int i3;
        long j4;
        long j5;
        long g0;
        int i4;
        int i5;
        ArrayList arrayList;
        long j6;
        int i6;
        String str;
        vfi A;
        long j7;
        long[] jArr;
        long[] jArr2;
        dsc dscVar;
        dsc dscVar2;
        myc mycVar2;
        oqs oqsVar;
        ufi z3;
        Pair create;
        long j8;
        long h;
        zg3 bh3Var;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int k;
        d7k d7kVar;
        int i10;
        long[] jArr3;
        int[] iArr;
        int i11;
        int i12;
        ArrayList arrayList2;
        long j9;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long[] jArr4;
        int[] iArr2;
        int i18;
        long j10;
        boolean z5;
        int i19;
        long[] jArr5;
        int[] iArr3;
        int i20;
        long j11;
        int i21;
        long j12;
        long[] jArr6;
        dsc dscVar3;
        int i22;
        int i23;
        boolean z6;
        int i24;
        boolean z7;
        ArrayList arrayList3;
        o0t o0tVar;
        int[] iArr4;
        int i25;
        boolean z8;
        int i26;
        o0t o0tVar2;
        ufi ufiVar2 = ufiVar;
        ArrayList arrayList4 = ufiVar2.i;
        ArrayList arrayList5 = new ArrayList();
        int i27 = 0;
        while (i27 < arrayList4.size()) {
            ufi ufiVar3 = (ufi) arrayList4.get(i27);
            if (ufiVar3.b != 1953653099) {
                arrayList = arrayList4;
                arrayList3 = arrayList5;
                i10 = i27;
            } else {
                vfi A2 = ufiVar2.A(1836476516);
                A2.getClass();
                ufi z9 = ufiVar3.z(1835297121);
                z9.getClass();
                vfi A3 = z9.A(1751411826);
                A3.getClass();
                d7k d7kVar2 = A3.g;
                d7kVar2.H(16);
                int h2 = d7kVar2.h();
                int i28 = h2 == 1936684398 ? 1 : h2 == 1986618469 ? 2 : (h2 == 1952807028 || h2 == 1935832172 || h2 == 1937072756 || h2 == 1668047728) ? 3 : h2 == 1835365473 ? 5 : -1;
                if (i28 == -1) {
                    arrayList = arrayList4;
                    oqsVar = null;
                    mycVar2 = mycVar;
                } else {
                    int i29 = 2;
                    vfi A4 = ufiVar3.A(1953196132);
                    A4.getClass();
                    d7k d7kVar3 = A4.g;
                    int i30 = 1;
                    d7kVar3.H(8);
                    int c = c(d7kVar3.h());
                    d7kVar3.I(c == 0 ? 8 : 16);
                    int h3 = d7kVar3.h();
                    d7kVar3.I(4);
                    int i31 = d7kVar3.b;
                    int i32 = c == 0 ? 4 : 8;
                    int i33 = 0;
                    while (true) {
                        if (i33 >= i32) {
                            d7kVar3.I(i32);
                            break;
                        }
                        if (d7kVar3.a[i31 + i33] != -1) {
                            j2 = c == 0 ? d7kVar3.x() : d7kVar3.A();
                        } else {
                            i33++;
                        }
                    }
                    d7kVar3.I(10);
                    int B = d7kVar3.B();
                    d7kVar3.I(4);
                    int h4 = d7kVar3.h();
                    int h5 = d7kVar3.h();
                    d7kVar3.I(4);
                    int h6 = d7kVar3.h();
                    int h7 = d7kVar3.h();
                    if (h4 == 0 && h5 == 65536) {
                        i = -65536;
                        if (h6 == -65536 && h7 == 0) {
                            i3 = 90;
                            j3 = -9223372036854775807L;
                            i2 = i3;
                            j4 = j != j3 ? j2 : j;
                            long j13 = d(A2.g).c;
                            if (j4 != j3) {
                                j5 = j13;
                                g0 = j3;
                            } else {
                                int i34 = dvt.a;
                                j5 = j13;
                                g0 = dvt.g0(j4, 1000000L, j5, RoundingMode.DOWN);
                            }
                            ufi z10 = z9.z(1835626086);
                            z10.getClass();
                            ufi z11 = z10.z(1937007212);
                            z11.getClass();
                            vfi A5 = z9.A(1835296868);
                            A5.getClass();
                            d7k d7kVar4 = A5.g;
                            d7kVar4.H(8);
                            int c2 = c(d7kVar4.h());
                            d7kVar4.I(c2 != 0 ? 8 : 16);
                            long x = d7kVar4.x();
                            int i35 = d7kVar4.b;
                            i4 = c2 != 0 ? 4 : 8;
                            i5 = 0;
                            while (true) {
                                if (i5 < i4) {
                                    arrayList = arrayList4;
                                    d7kVar4.I(i4);
                                    break;
                                }
                                arrayList = arrayList4;
                                if (d7kVar4.a[i35 + i5] != -1) {
                                    long x2 = c2 == 0 ? d7kVar4.x() : d7kVar4.A();
                                    if (x2 != 0) {
                                        int i36 = dvt.a;
                                        j6 = dvt.g0(x2, 1000000L, x, RoundingMode.DOWN);
                                    }
                                } else {
                                    i5++;
                                    arrayList4 = arrayList;
                                }
                            }
                            j6 = -9223372036854775807L;
                            int B2 = d7kVar4.B();
                            char[] cArr = {(char) (((B2 >> 10) & 31) + 96), (char) (((B2 >> 5) & 31) + 96), (char) ((B2 & 31) + 96)};
                            for (i6 = 0; i6 < 3; i6++) {
                                char c3 = cArr[i6];
                                if (c3 < 'a' || c3 > 'z') {
                                    str = null;
                                    break;
                                }
                            }
                            str = new String(cArr);
                            A = z11.A(1937011556);
                            if (A != null) {
                                throw r7k.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                            }
                            ah3 f = f(A.g, h3, i2, str, pqaVar, z2);
                            if (z || (z3 = ufiVar3.z(1701082227)) == null) {
                                j7 = g0;
                            } else {
                                vfi A6 = z3.A(1701606260);
                                if (A6 == null) {
                                    j7 = g0;
                                    create = null;
                                } else {
                                    d7k d7kVar5 = A6.g;
                                    d7kVar5.H(8);
                                    int c4 = c(d7kVar5.h());
                                    int z12 = d7kVar5.z();
                                    long[] jArr7 = new long[z12];
                                    long[] jArr8 = new long[z12];
                                    int i37 = 0;
                                    while (i37 < z12) {
                                        int i38 = i30;
                                        jArr7[i37] = c4 == i38 ? d7kVar5.A() : d7kVar5.x();
                                        if (c4 == i38) {
                                            h = d7kVar5.p();
                                            j8 = g0;
                                        } else {
                                            j8 = g0;
                                            h = d7kVar5.h();
                                        }
                                        jArr8[i37] = h;
                                        if (d7kVar5.s() != 1) {
                                            xq0.x("Unsupported media rate.");
                                            return null;
                                        }
                                        d7kVar5.I(i29);
                                        i37++;
                                        g0 = j8;
                                        i29 = 2;
                                        i30 = 1;
                                    }
                                    j7 = g0;
                                    create = Pair.create(jArr7, jArr8);
                                }
                                if (create != null) {
                                    long[] jArr9 = (long[]) create.first;
                                    jArr2 = (long[]) create.second;
                                    jArr = jArr9;
                                    dscVar = (dsc) f.e;
                                    if (dscVar != null) {
                                        mycVar2 = mycVar;
                                        oqsVar = null;
                                    } else {
                                        if (B != 0) {
                                            tfi tfiVar = new tfi(B);
                                            bsc a2 = dscVar.a();
                                            u2i u2iVar = ((dsc) f.e).l;
                                            a2.k = u2iVar != null ? u2iVar.a(tfiVar) : new u2i(tfiVar);
                                            dscVar2 = new dsc(a2);
                                        } else {
                                            dscVar2 = dscVar;
                                        }
                                        mycVar2 = mycVar;
                                        oqsVar = new oqs(h3, i28, x, j5, j7, j6, dscVar2, f.c, (lvs[]) f.d, f.b, jArr, jArr2);
                                    }
                                }
                            }
                            jArr = null;
                            jArr2 = null;
                            dscVar = (dsc) f.e;
                            if (dscVar != null) {
                            }
                        }
                    } else {
                        i = -65536;
                    }
                    if (h4 == 0 && h5 == i) {
                        if (h6 == 65536 && h7 == 0) {
                            i3 = 270;
                            j3 = -9223372036854775807L;
                            i2 = i3;
                            if (j != j3) {
                            }
                            long j132 = d(A2.g).c;
                            if (j4 != j3) {
                            }
                            ufi z102 = z9.z(1835626086);
                            z102.getClass();
                            ufi z112 = z102.z(1937007212);
                            z112.getClass();
                            vfi A52 = z9.A(1835296868);
                            A52.getClass();
                            d7k d7kVar42 = A52.g;
                            d7kVar42.H(8);
                            int c22 = c(d7kVar42.h());
                            d7kVar42.I(c22 != 0 ? 8 : 16);
                            long x3 = d7kVar42.x();
                            int i352 = d7kVar42.b;
                            if (c22 != 0) {
                            }
                            i5 = 0;
                            while (true) {
                                if (i5 < i4) {
                                }
                                i5++;
                                arrayList4 = arrayList;
                            }
                            j6 = -9223372036854775807L;
                            int B22 = d7kVar42.B();
                            char[] cArr2 = {(char) (((B22 >> 10) & 31) + 96), (char) (((B22 >> 5) & 31) + 96), (char) ((B22 & 31) + 96)};
                            while (i6 < 3) {
                            }
                            str = new String(cArr2);
                            A = z112.A(1937011556);
                            if (A != null) {
                            }
                        } else {
                            i = -65536;
                        }
                    }
                    if (h4 == i && h5 == 0 && h6 == 0 && h7 == i) {
                        i3 = 180;
                        j3 = -9223372036854775807L;
                        i2 = i3;
                        if (j != j3) {
                        }
                        long j1322 = d(A2.g).c;
                        if (j4 != j3) {
                        }
                        ufi z1022 = z9.z(1835626086);
                        z1022.getClass();
                        ufi z1122 = z1022.z(1937007212);
                        z1122.getClass();
                        vfi A522 = z9.A(1835296868);
                        A522.getClass();
                        d7k d7kVar422 = A522.g;
                        d7kVar422.H(8);
                        int c222 = c(d7kVar422.h());
                        d7kVar422.I(c222 != 0 ? 8 : 16);
                        long x32 = d7kVar422.x();
                        int i3522 = d7kVar422.b;
                        if (c222 != 0) {
                        }
                        i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                            }
                            i5++;
                            arrayList4 = arrayList;
                        }
                        j6 = -9223372036854775807L;
                        int B222 = d7kVar422.B();
                        char[] cArr22 = {(char) (((B222 >> 10) & 31) + 96), (char) (((B222 >> 5) & 31) + 96), (char) ((B222 & 31) + 96)};
                        while (i6 < 3) {
                        }
                        str = new String(cArr22);
                        A = z1122.A(1937011556);
                        if (A != null) {
                        }
                    } else {
                        j3 = -9223372036854775807L;
                        i2 = 0;
                        if (j != j3) {
                        }
                        long j13222 = d(A2.g).c;
                        if (j4 != j3) {
                        }
                        ufi z10222 = z9.z(1835626086);
                        z10222.getClass();
                        ufi z11222 = z10222.z(1937007212);
                        z11222.getClass();
                        vfi A5222 = z9.A(1835296868);
                        A5222.getClass();
                        d7k d7kVar4222 = A5222.g;
                        d7kVar4222.H(8);
                        int c2222 = c(d7kVar4222.h());
                        d7kVar4222.I(c2222 != 0 ? 8 : 16);
                        long x322 = d7kVar4222.x();
                        int i35222 = d7kVar4222.b;
                        if (c2222 != 0) {
                        }
                        i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                            }
                            i5++;
                            arrayList4 = arrayList;
                        }
                        j6 = -9223372036854775807L;
                        int B2222 = d7kVar4222.B();
                        char[] cArr222 = {(char) (((B2222 >> 10) & 31) + 96), (char) (((B2222 >> 5) & 31) + 96), (char) ((B2222 & 31) + 96)};
                        while (i6 < 3) {
                        }
                        str = new String(cArr222);
                        A = z11222.A(1937011556);
                        if (A != null) {
                        }
                    }
                }
                oqs oqsVar2 = (oqs) mycVar2.apply(oqsVar);
                if (oqsVar2 == null) {
                    arrayList3 = arrayList5;
                    i10 = i27;
                } else {
                    dsc dscVar4 = oqsVar2.g;
                    ufi z13 = ufiVar3.z(1835297121);
                    z13.getClass();
                    ufi z14 = z13.z(1835626086);
                    z14.getClass();
                    ufi z15 = z14.z(1937007212);
                    z15.getClass();
                    vfi A7 = z15.A(1937011578);
                    if (A7 != null) {
                        bh3Var = new rnj(A7, dscVar4);
                    } else {
                        vfi A8 = z15.A(1937013298);
                        if (A8 == null) {
                            throw r7k.a(null, "Track has no sample table size information");
                        }
                        bh3Var = new bh3(A8);
                    }
                    int n = bh3Var.n();
                    if (n == 0) {
                        o0tVar = new o0t(oqsVar2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        arrayList3 = arrayList5;
                        i10 = i27;
                    } else {
                        if (oqsVar2.b == 2) {
                            long j14 = oqsVar2.f;
                            if (j14 > 0) {
                                bsc a3 = dscVar4.a();
                                a3.v = n / (j14 / 1000000.0f);
                                oqsVar2 = oqsVar2.a(new dsc(a3));
                            }
                        }
                        dsc dscVar5 = oqsVar2.g;
                        vfi A9 = z15.A(1937007471);
                        if (A9 == null) {
                            A9 = z15.A(1668232756);
                            A9.getClass();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        d7k d7kVar6 = A9.g;
                        vfi A10 = z15.A(1937011555);
                        A10.getClass();
                        d7k d7kVar7 = A10.g;
                        vfi A11 = z15.A(1937011827);
                        A11.getClass();
                        d7k d7kVar8 = A11.g;
                        vfi A12 = z15.A(1937011571);
                        d7k d7kVar9 = A12 != null ? A12.g : null;
                        vfi A13 = z15.A(1668576371);
                        d7k d7kVar10 = A13 != null ? A13.g : null;
                        xg3 xg3Var = new xg3(d7kVar7, d7kVar6, z4);
                        d7kVar8.H(12);
                        int z16 = d7kVar8.z() - 1;
                        int z17 = d7kVar8.z();
                        int z18 = d7kVar8.z();
                        if (d7kVar10 != null) {
                            d7kVar10.H(12);
                            i7 = d7kVar10.z();
                        } else {
                            i7 = 0;
                        }
                        if (d7kVar9 != null) {
                            d7kVar9.H(12);
                            i8 = d7kVar9.z();
                            if (i8 > 0) {
                                i9 = d7kVar9.z() - 1;
                                k = bh3Var.k();
                                d7kVar = d7kVar10;
                                String str2 = dscVar5.n;
                                if (k == -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && z16 == 0 && i7 == 0 && i8 == 0)) {
                                    int i39 = xg3Var.a;
                                    long[] jArr10 = new long[i39];
                                    int[] iArr5 = new int[i39];
                                    while (xg3Var.a()) {
                                        int i40 = xg3Var.b;
                                        jArr10[i40] = xg3Var.d;
                                        iArr5[i40] = xg3Var.c;
                                    }
                                    long j15 = z18;
                                    int i41 = RemoteCameraConfig.Notification.ID / k;
                                    int i42 = 0;
                                    for (int i43 = 0; i43 < i39; i43++) {
                                        i42 += dvt.f(iArr5[i43], i41);
                                    }
                                    jArr4 = new long[i42];
                                    iArr2 = new int[i42];
                                    long[] jArr11 = new long[i42];
                                    int[] iArr6 = new int[i42];
                                    i10 = i27;
                                    int i44 = 0;
                                    int i45 = 0;
                                    int i46 = 0;
                                    int i47 = 0;
                                    int i48 = 0;
                                    while (i44 < i39) {
                                        int i49 = iArr5[i44];
                                        long j16 = jArr10[i44];
                                        int i50 = i48;
                                        int i51 = i39;
                                        int i52 = i47;
                                        int i53 = i50;
                                        int i54 = i44;
                                        int i55 = i49;
                                        while (i55 > 0) {
                                            int min = Math.min(i41, i55);
                                            jArr4[i53] = j16;
                                            int i56 = i55;
                                            int i57 = k * min;
                                            iArr2[i53] = i57;
                                            i46 += i57;
                                            i52 = Math.max(i52, i57);
                                            long j17 = j15;
                                            jArr11[i53] = i45 * j17;
                                            iArr6[i53] = 1;
                                            j16 += iArr2[i53];
                                            i45 += min;
                                            i55 = i56 - min;
                                            i53++;
                                            j15 = j17;
                                        }
                                        long j18 = j15;
                                        i44 = i54 + 1;
                                        int i58 = i53;
                                        i47 = i52;
                                        i39 = i51;
                                        i48 = i58;
                                        j15 = j18;
                                    }
                                    j10 = i45 * j15;
                                    j11 = i46;
                                    arrayList2 = arrayList5;
                                    iArr3 = iArr6;
                                    jArr5 = jArr11;
                                    i20 = i47;
                                } else {
                                    i10 = i27;
                                    jArr3 = new long[n];
                                    iArr = new int[n];
                                    long[] jArr12 = new long[n];
                                    int[] iArr7 = new int[n];
                                    int i59 = i7;
                                    zg3 zg3Var = bh3Var;
                                    int i60 = z17;
                                    i11 = i8;
                                    int i61 = z18;
                                    i12 = z16;
                                    int i62 = i9;
                                    int i63 = i59;
                                    arrayList2 = arrayList5;
                                    d7k d7kVar11 = d7kVar9;
                                    long j19 = 0;
                                    long j20 = 0;
                                    j9 = 0;
                                    i13 = 0;
                                    i14 = 0;
                                    int i64 = 0;
                                    i15 = 0;
                                    i16 = 0;
                                    while (true) {
                                        if (i14 < n) {
                                            i17 = i60;
                                            jArr4 = jArr3;
                                            n = n;
                                            break;
                                        }
                                        boolean z19 = true;
                                        while (i15 == 0) {
                                            z19 = xg3Var.a();
                                            if (!z19) {
                                                break;
                                            }
                                            j9 = xg3Var.d;
                                            i15 = xg3Var.c;
                                            n = n;
                                            i60 = i60;
                                        }
                                        i21 = n;
                                        i17 = i60;
                                        if (!z19) {
                                            vq1.n0("BoxParsers", "Unexpected end of chunk data");
                                            long[] copyOf = Arrays.copyOf(jArr3, i14);
                                            iArr = Arrays.copyOf(iArr, i14);
                                            jArr12 = Arrays.copyOf(jArr12, i14);
                                            iArr7 = Arrays.copyOf(iArr7, i14);
                                            n = i14;
                                            jArr4 = copyOf;
                                            break;
                                        }
                                        if (d7kVar != null) {
                                            int i65 = i16;
                                            while (i65 == 0 && i63 > 0) {
                                                i65 = d7kVar.z();
                                                i64 = d7kVar.h();
                                                i63--;
                                            }
                                            i16 = i65 - 1;
                                        }
                                        jArr3[i14] = j9;
                                        int g = zg3Var.g();
                                        iArr[i14] = g;
                                        j19 += g;
                                        if (g > i13) {
                                            i13 = g;
                                        }
                                        jArr12[i14] = j20 + i64;
                                        iArr7[i14] = d7kVar11 == null ? 1 : 0;
                                        if (i14 == i62) {
                                            iArr7[i14] = 1;
                                            i11--;
                                            if (i11 > 0) {
                                                d7kVar11.getClass();
                                                i62 = d7kVar11.z() - 1;
                                            }
                                        }
                                        j20 += i61;
                                        i60 = i17 - 1;
                                        if (i60 == 0 && i12 > 0) {
                                            i12--;
                                            i60 = d7kVar8.z();
                                            i61 = d7kVar8.h();
                                        }
                                        j9 += iArr[i14];
                                        i15--;
                                        i14++;
                                        jArr3 = jArr3;
                                        i13 = i13;
                                        n = i21;
                                    }
                                    iArr2 = iArr;
                                    i18 = i15;
                                    j10 = j20 + i64;
                                    if (d7kVar != null) {
                                        while (i63 > 0) {
                                            if (d7kVar.z() != 0) {
                                                z5 = false;
                                                break;
                                            }
                                            d7kVar.h();
                                            i63--;
                                        }
                                    }
                                    z5 = true;
                                    if (i11 != 0 && i17 == 0 && i18 == 0 && i12 == 0 && i16 == 0 && z5) {
                                        i19 = i13;
                                    } else {
                                        StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                        i19 = i13;
                                        boolean z20 = z5;
                                        hrg.w(oqsVar2.a, i11, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb);
                                        hrg.w(i17, i18, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb);
                                        sb.append(i12);
                                        sb.append(", remainingSamplesAtTimestampOffset ");
                                        sb.append(i16);
                                        sb.append(z20 ? ", ctts invalid" : "");
                                        vq1.n0("BoxParsers", sb.toString());
                                    }
                                    jArr5 = jArr12;
                                    iArr3 = iArr7;
                                    i20 = i19;
                                    j11 = j19;
                                }
                                long[] jArr13 = jArr4;
                                int[] iArr8 = iArr2;
                                j12 = oqsVar2.f;
                                if (j12 > 0) {
                                    long g02 = dvt.g0(8 * j11, 1000000L, j12, RoundingMode.HALF_DOWN);
                                    if (g02 > 0 && g02 < 2147483647L) {
                                        bsc a4 = dscVar5.a();
                                        a4.h = (int) g02;
                                        oqsVar2 = oqsVar2.a(new dsc(a4));
                                    }
                                }
                                long j21 = oqsVar2.c;
                                dsc dscVar6 = oqsVar2.g;
                                int i66 = oqsVar2.b;
                                long[] jArr14 = oqsVar2.j;
                                jArr6 = oqsVar2.i;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long g03 = dvt.g0(j10, 1000000L, j21, roundingMode);
                                if (jArr6 != null) {
                                    dvt.f0(jArr5, j21);
                                    o0tVar2 = new o0t(oqsVar2, jArr13, iArr8, i20, jArr5, iArr3, g03);
                                } else {
                                    long[] jArr15 = jArr5;
                                    if (jArr6.length == 1 && i66 == 1 && jArr15.length >= 2) {
                                        jArr14.getClass();
                                        long j22 = jArr14[0];
                                        i22 = n;
                                        long g04 = dvt.g0(jArr6[0], oqsVar2.c, oqsVar2.d, roundingMode) + j22;
                                        int length = jArr15.length - 1;
                                        int i67 = dvt.i(4, 0, length);
                                        int i68 = dvt.i(jArr15.length - 4, 0, length);
                                        long j23 = jArr15[0];
                                        if (j23 <= j22 && j22 < jArr15[i67] && jArr15[i68] < g04 && g04 <= j10) {
                                            long j24 = j10 - g04;
                                            long g05 = dvt.g0(j22 - j23, dscVar6.E, oqsVar2.c, roundingMode);
                                            dscVar3 = dscVar6;
                                            long g06 = dvt.g0(j24, dscVar6.E, oqsVar2.c, roundingMode);
                                            if ((g05 != 0 || g06 != 0) && g05 <= 2147483647L && g06 <= 2147483647L) {
                                                n1dVar.a = (int) g05;
                                                n1dVar.b = (int) g06;
                                                dvt.f0(jArr15, j21);
                                                o0tVar2 = new o0t(oqsVar2, jArr13, iArr8, i20, jArr15, iArr3, dvt.g0(jArr6[0], 1000000L, oqsVar2.d, roundingMode));
                                            }
                                        } else {
                                            dscVar3 = dscVar6;
                                            int i69 = 1;
                                            if (jArr6.length == 1) {
                                                if (jArr6[0] == 0) {
                                                    jArr14.getClass();
                                                    long j25 = jArr14[0];
                                                    for (int i70 = 0; i70 < jArr15.length; i70++) {
                                                        jArr15[i70] = dvt.g0(jArr15[i70] - j25, 1000000L, oqsVar2.c, RoundingMode.DOWN);
                                                    }
                                                    arrayList3 = arrayList2;
                                                    o0tVar = new o0t(oqsVar2, jArr13, iArr8, i20, jArr15, iArr3, dvt.g0(j10 - j25, 1000000L, oqsVar2.c, RoundingMode.DOWN));
                                                    arrayList3.add(o0tVar);
                                                } else {
                                                    i69 = 1;
                                                }
                                            }
                                            int[] iArr9 = iArr3;
                                            boolean z21 = i66 != i69;
                                            int[] iArr10 = new int[jArr6.length];
                                            int[] iArr11 = new int[jArr6.length];
                                            jArr14.getClass();
                                            int i71 = 0;
                                            i23 = 0;
                                            boolean z22 = false;
                                            int i72 = 0;
                                            while (i23 < jArr6.length) {
                                                int[] iArr12 = iArr10;
                                                int[] iArr13 = iArr11;
                                                long j26 = jArr14[i23];
                                                if (j26 != -1) {
                                                    i25 = i23;
                                                    boolean z23 = z22;
                                                    long g07 = dvt.g0(jArr6[i23], oqsVar2.c, oqsVar2.d, RoundingMode.DOWN);
                                                    iArr4 = iArr12;
                                                    iArr4[i25] = dvt.e(jArr15, j26, true);
                                                    long j27 = j26 + g07;
                                                    iArr13[i25] = dvt.a(jArr15, j27, z21);
                                                    int i73 = iArr4[i25];
                                                    while (true) {
                                                        i26 = iArr4[i25];
                                                        if (i26 < 0 || (iArr9[i26] & 1) != 0) {
                                                            break;
                                                        }
                                                        iArr4[i25] = i26 - 1;
                                                    }
                                                    if (i26 < 0) {
                                                        iArr4[i25] = i73;
                                                        while (true) {
                                                            int i74 = iArr4[i25];
                                                            if (i74 >= iArr13[i25] || (iArr9[i74] & 1) != 0) {
                                                                break;
                                                            }
                                                            iArr4[i25] = i74 + 1;
                                                        }
                                                    }
                                                    if (i66 == 2 && iArr4[i25] != iArr13[i25]) {
                                                        while (true) {
                                                            int i75 = iArr13[i25];
                                                            if (i75 >= jArr15.length - 1) {
                                                                break;
                                                            }
                                                            int i76 = i75 + 1;
                                                            if (jArr15[i76] > j27) {
                                                                break;
                                                            }
                                                            iArr13[i25] = i76;
                                                        }
                                                    }
                                                    int i77 = iArr13[i25];
                                                    int i78 = iArr4[i25];
                                                    int i79 = (i77 - i78) + i72;
                                                    z8 = z23 | (i71 != i78);
                                                    i71 = i77;
                                                    i72 = i79;
                                                } else {
                                                    iArr4 = iArr12;
                                                    i25 = i23;
                                                    z8 = z22;
                                                }
                                                i23 = i25 + 1;
                                                iArr11 = iArr13;
                                                z22 = z8;
                                                iArr10 = iArr4;
                                            }
                                            int[] iArr14 = iArr10;
                                            int[] iArr15 = iArr11;
                                            z6 = z22 | (i72 == i22);
                                            long[] jArr16 = !z6 ? new long[i72] : jArr13;
                                            int[] iArr16 = !z6 ? new int[i72] : iArr8;
                                            if (z6) {
                                                i20 = 0;
                                            }
                                            int[] iArr17 = !z6 ? new int[i72] : iArr9;
                                            long[] jArr17 = new long[i72];
                                            i24 = 0;
                                            z7 = false;
                                            int i80 = 0;
                                            long j28 = 0;
                                            int i81 = i20;
                                            while (i24 < jArr6.length) {
                                                long j29 = jArr14[i24];
                                                boolean z24 = z6;
                                                int i82 = iArr14[i24];
                                                long[] jArr18 = jArr6;
                                                int i83 = iArr15[i24];
                                                long[] jArr19 = jArr17;
                                                if (z24) {
                                                    int i84 = i83 - i82;
                                                    System.arraycopy(jArr13, i82, jArr16, i80, i84);
                                                    System.arraycopy(iArr8, i82, iArr16, i80, i84);
                                                    System.arraycopy(iArr9, i82, iArr17, i80, i84);
                                                }
                                                int i85 = i81;
                                                while (i82 < i83) {
                                                    int i86 = i82;
                                                    long[] jArr20 = jArr16;
                                                    long j30 = oqsVar2.d;
                                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                    long g08 = dvt.g0(j28, 1000000L, j30, roundingMode2);
                                                    long g09 = dvt.g0(jArr15[i86] - j29, 1000000L, oqsVar2.c, roundingMode2);
                                                    if (g09 < 0) {
                                                        z7 = true;
                                                    }
                                                    jArr19[i80] = g08 + g09;
                                                    if (z24 && iArr16[i80] > i85) {
                                                        i85 = iArr8[i86];
                                                    }
                                                    i80++;
                                                    i82 = i86 + 1;
                                                    jArr16 = jArr20;
                                                }
                                                j28 += jArr18[i24];
                                                i24++;
                                                i81 = i85;
                                                z6 = z24;
                                                jArr6 = jArr18;
                                                jArr16 = jArr16;
                                                jArr17 = jArr19;
                                            }
                                            long[] jArr21 = jArr16;
                                            long[] jArr22 = jArr17;
                                            long g010 = dvt.g0(j28, 1000000L, oqsVar2.d, RoundingMode.DOWN);
                                            if (z7) {
                                                bsc a5 = dscVar3.a();
                                                a5.s = true;
                                                oqsVar2 = oqsVar2.a(new dsc(a5));
                                            }
                                            arrayList3 = arrayList2;
                                            o0tVar = new o0t(oqsVar2, jArr21, iArr16, i81, jArr22, iArr17, g010);
                                            arrayList3.add(o0tVar);
                                        }
                                    } else {
                                        dscVar3 = dscVar6;
                                        i22 = n;
                                    }
                                    int i692 = 1;
                                    if (jArr6.length == 1) {
                                    }
                                    int[] iArr92 = iArr3;
                                    if (i66 != i692) {
                                    }
                                    int[] iArr102 = new int[jArr6.length];
                                    int[] iArr112 = new int[jArr6.length];
                                    jArr14.getClass();
                                    int i712 = 0;
                                    i23 = 0;
                                    boolean z222 = false;
                                    int i722 = 0;
                                    while (i23 < jArr6.length) {
                                    }
                                    int[] iArr142 = iArr102;
                                    int[] iArr152 = iArr112;
                                    z6 = z222 | (i722 == i22);
                                    if (!z6) {
                                    }
                                    if (!z6) {
                                    }
                                    if (z6) {
                                    }
                                    if (!z6) {
                                    }
                                    long[] jArr172 = new long[i722];
                                    i24 = 0;
                                    z7 = false;
                                    int i802 = 0;
                                    long j282 = 0;
                                    int i812 = i20;
                                    while (i24 < jArr6.length) {
                                    }
                                    long[] jArr212 = jArr16;
                                    long[] jArr222 = jArr172;
                                    long g0102 = dvt.g0(j282, 1000000L, oqsVar2.d, RoundingMode.DOWN);
                                    if (z7) {
                                    }
                                    arrayList3 = arrayList2;
                                    o0tVar = new o0t(oqsVar2, jArr212, iArr16, i812, jArr222, iArr17, g0102);
                                    arrayList3.add(o0tVar);
                                }
                                arrayList3 = arrayList2;
                                o0tVar = o0tVar2;
                            } else {
                                d7kVar9 = null;
                            }
                        } else {
                            i8 = 0;
                        }
                        i9 = -1;
                        k = bh3Var.k();
                        d7kVar = d7kVar10;
                        String str22 = dscVar5.n;
                        if (k == -1) {
                        }
                        i10 = i27;
                        jArr3 = new long[n];
                        iArr = new int[n];
                        long[] jArr122 = new long[n];
                        int[] iArr72 = new int[n];
                        int i592 = i7;
                        zg3 zg3Var2 = bh3Var;
                        int i602 = z17;
                        i11 = i8;
                        int i612 = z18;
                        i12 = z16;
                        int i622 = i9;
                        int i632 = i592;
                        arrayList2 = arrayList5;
                        d7k d7kVar112 = d7kVar9;
                        long j192 = 0;
                        long j202 = 0;
                        j9 = 0;
                        i13 = 0;
                        i14 = 0;
                        int i642 = 0;
                        i15 = 0;
                        i16 = 0;
                        while (true) {
                            if (i14 < n) {
                            }
                            j9 += iArr[i14];
                            i15--;
                            i14++;
                            jArr3 = jArr3;
                            i13 = i13;
                            n = i21;
                        }
                        iArr2 = iArr;
                        i18 = i15;
                        j10 = j202 + i642;
                        if (d7kVar != null) {
                        }
                        z5 = true;
                        if (i11 != 0) {
                        }
                        StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                        i19 = i13;
                        boolean z202 = z5;
                        hrg.w(oqsVar2.a, i11, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb2);
                        hrg.w(i17, i18, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb2);
                        sb2.append(i12);
                        sb2.append(", remainingSamplesAtTimestampOffset ");
                        sb2.append(i16);
                        sb2.append(z202 ? ", ctts invalid" : "");
                        vq1.n0("BoxParsers", sb2.toString());
                        jArr5 = jArr122;
                        iArr3 = iArr72;
                        i20 = i19;
                        j11 = j192;
                        long[] jArr132 = jArr4;
                        int[] iArr82 = iArr2;
                        j12 = oqsVar2.f;
                        if (j12 > 0) {
                        }
                        long j212 = oqsVar2.c;
                        dsc dscVar62 = oqsVar2.g;
                        int i662 = oqsVar2.b;
                        long[] jArr142 = oqsVar2.j;
                        jArr6 = oqsVar2.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        long g032 = dvt.g0(j10, 1000000L, j212, roundingMode3);
                        if (jArr6 != null) {
                        }
                        arrayList3 = arrayList2;
                        o0tVar = o0tVar2;
                    }
                    arrayList3.add(o0tVar);
                }
            }
            i27 = i10 + 1;
            arrayList5 = arrayList3;
            arrayList4 = arrayList;
            ufiVar2 = ufiVar;
        }
        return arrayList5;
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(d7k d7kVar, int i, int i2, int i3, int i4, String str, int i5, pqa pqaVar, ah3 ah3Var, int i6) {
        int i7;
        int i8;
        int i9;
        String str2;
        int i10;
        int i11;
        String str3;
        pqa pqaVar2;
        xdh xdhVar;
        int i12;
        int i13;
        List list;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        q85 q85Var;
        q85 q85Var2;
        int i26;
        String str4;
        pqa pqaVar3;
        int i27;
        rp7 rp7Var;
        int i28;
        int i29 = i2;
        int i30 = i3;
        pqa pqaVar4 = pqaVar;
        ah3 ah3Var2 = ah3Var;
        d7kVar.H(i29 + 16);
        d7kVar.I(16);
        int B = d7kVar.B();
        int B2 = d7kVar.B();
        d7kVar.I(50);
        int i31 = d7kVar.b;
        int i32 = i;
        if (i32 == 1701733238) {
            Pair e = e(d7kVar, i29, i30);
            if (e != null) {
                i32 = ((Integer) e.first).intValue();
                pqaVar4 = pqaVar4 == null ? null : pqaVar4.a(((lvs) e.second).b);
                ((lvs[]) ah3Var2.d)[i6] = (lvs) e.second;
            }
            d7kVar.H(i31);
        }
        String str5 = "video/3gpp";
        String str6 = i32 == 1831958048 ? "video/mpeg" : i32 == 1211250227 ? "video/3gpp" : null;
        float f = 1.0f;
        List list2 = null;
        String str7 = null;
        byte[] bArr = null;
        int i33 = -1;
        int i34 = -1;
        int i35 = -1;
        ByteBuffer byteBuffer = null;
        boolean z = false;
        int i36 = -1;
        int i37 = -1;
        int i38 = -1;
        int i39 = 8;
        int i40 = 8;
        mgr mgrVar = null;
        yg3 yg3Var = null;
        xdh xdhVar2 = null;
        while (i31 - i29 < i30) {
            d7kVar.H(i31);
            int i41 = d7kVar.b;
            int h = d7kVar.h();
            if (h == 0 && d7kVar.b - i29 == i30) {
                break;
            }
            String str8 = "childAtomSize must be positive";
            x97.q("childAtomSize must be positive", h > 0);
            int h2 = d7kVar.h();
            if (h2 == 1635148611) {
                x97.q(null, str6 == null);
                d7kVar.H(i41 + 8);
                rg2 a2 = rg2.a(d7kVar);
                list2 = a2.a;
                ah3Var2.b = a2.b;
                if (!z) {
                    f = a2.k;
                }
                String str9 = a2.l;
                int i42 = a2.j;
                int i43 = a2.g;
                int i44 = a2.h;
                str7 = str9;
                int i45 = a2.i;
                int i46 = a2.e;
                i11 = a2.f;
                i10 = i46;
                pqaVar2 = pqaVar4;
                i9 = i31;
                i7 = i43;
                i13 = i32;
                str2 = str5;
                i8 = i44;
                i38 = i45;
                str3 = "video/avc";
                i34 = i42;
            } else {
                int i47 = i31;
                if (h2 == 1752589123) {
                    x97.q(null, str6 == null);
                    d7kVar.H(i41 + 8);
                    hxd a3 = hxd.a(d7kVar, false, null);
                    list2 = a3.a;
                    ah3Var2.b = a3.b;
                    if (!z) {
                        f = a3.j;
                    }
                    int i48 = a3.k;
                    int i49 = a3.c;
                    String str10 = a3.l;
                    int i50 = a3.i;
                    if (i50 != -1) {
                        i33 = i50;
                    }
                    int i51 = a3.f;
                    int i52 = a3.g;
                    int i53 = a3.h;
                    int i54 = a3.d;
                    i11 = a3.e;
                    pqaVar2 = pqaVar4;
                    str3 = "video/hevc";
                    xdhVar2 = a3.m;
                    i13 = i32;
                    str2 = str5;
                    i8 = i52;
                    i7 = i51;
                    i38 = i53;
                    i9 = i47;
                    i35 = i49;
                    i34 = i48;
                    i10 = i54;
                    str7 = str10;
                } else {
                    String str11 = str5;
                    if (h2 == 1818785347) {
                        x97.q("lhvC must follow hvcC atom", "video/hevc".equals(str6));
                        xdh xdhVar3 = xdhVar2;
                        x97.q("must have at least two layers", xdhVar3 != null && ((yde) xdhVar3.a).size() >= 2);
                        d7kVar.H(i41 + 8);
                        xdhVar3.getClass();
                        hxd a4 = hxd.a(d7kVar, true, xdhVar3);
                        x97.q("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", ah3Var2.b == a4.b);
                        int i55 = a4.f;
                        int i56 = i36;
                        if (i55 != -1) {
                            x97.q("colorSpace must be the same for both views", i56 == i55);
                        }
                        int i57 = a4.g;
                        int i58 = i37;
                        if (i57 != -1) {
                            x97.q("colorRange must be the same for both views", i58 == i57);
                        }
                        int i59 = a4.h;
                        if (i59 != -1) {
                            i28 = i38;
                            x97.q("colorTransfer must be the same for both views", i28 == i59);
                        } else {
                            i28 = i38;
                        }
                        int i60 = i39;
                        int i61 = i28;
                        x97.q("bitdepthLuma must be the same for both views", i60 == a4.d);
                        int i62 = i40;
                        x97.q("bitdepthChroma must be the same for both views", i62 == a4.e);
                        if (list2 != null) {
                            tde u = yde.u();
                            u.c(list2);
                            u.c(a4.a);
                            list2 = u.f();
                        } else {
                            x97.q("initializationData must be already set from hvcC atom", false);
                        }
                        String str12 = a4.l;
                        xdhVar2 = xdhVar3;
                        pqaVar2 = pqaVar4;
                        str3 = "video/mv-hevc";
                        i7 = i56;
                        i13 = i32;
                        i38 = i61;
                        i9 = i47;
                        str2 = str11;
                        i11 = i62;
                        str7 = str12;
                        i8 = i58;
                        i10 = i60;
                    } else {
                        i7 = i36;
                        i8 = i37;
                        int i63 = i38;
                        xdh xdhVar4 = xdhVar2;
                        i9 = i47;
                        str2 = str11;
                        i10 = i39;
                        i11 = i40;
                        str3 = str6;
                        if (h2 == 1986361461) {
                            d7kVar.H(i41 + 8);
                            int i64 = d7kVar.b;
                            rp7 rp7Var2 = null;
                            while (i64 - i41 < h) {
                                d7kVar.H(i64);
                                int h3 = d7kVar.h();
                                int i65 = i64;
                                x97.q(str8, h3 > 0);
                                if (d7kVar.h() == 1702454643) {
                                    d7kVar.H(i65 + 8);
                                    int i66 = d7kVar.b;
                                    while (true) {
                                        if (i66 - i65 >= h3) {
                                            str4 = str8;
                                            pqaVar3 = pqaVar4;
                                            i27 = h3;
                                            rp7Var = null;
                                            break;
                                        }
                                        d7kVar.H(i66);
                                        int h4 = d7kVar.h();
                                        x97.q(str8, h4 > 0);
                                        str4 = str8;
                                        if (d7kVar.h() == 1937011305) {
                                            d7kVar.I(4);
                                            int v = d7kVar.v();
                                            i27 = h3;
                                            pqaVar3 = pqaVar4;
                                            rp7Var = new rp7(new hx1((v & 1) == 1, (v & 2) == 2, (v & 8) == 8));
                                        } else {
                                            i66 += h4;
                                            str8 = str4;
                                        }
                                    }
                                    rp7Var2 = rp7Var;
                                } else {
                                    str4 = str8;
                                    pqaVar3 = pqaVar4;
                                    i27 = h3;
                                }
                                i64 = i65 + i27;
                                str8 = str4;
                                pqaVar4 = pqaVar3;
                            }
                            pqaVar2 = pqaVar4;
                            jzi jziVar = rp7Var2 == null ? null : new jzi(rp7Var2);
                            if (jziVar != null) {
                                hx1 hx1Var = (hx1) ((rp7) jziVar.a).a;
                                if (xdhVar4 == null || ((yde) xdhVar4.a).size() < 2) {
                                    i26 = i33;
                                    if (i26 == -1) {
                                        i33 = hx1Var.c ? 5 : 4;
                                        xdhVar2 = xdhVar4;
                                    }
                                    i33 = i26;
                                    xdhVar2 = xdhVar4;
                                } else {
                                    x97.q("both eye views must be marked as available", hx1Var.a && hx1Var.b);
                                    x97.q("for MV-HEVC, eye_views_reversed must be set to false", !hx1Var.c);
                                }
                            }
                            i26 = i33;
                            i33 = i26;
                            xdhVar2 = xdhVar4;
                        } else {
                            pqaVar2 = pqaVar4;
                            int i67 = i33;
                            if (h2 == 1685480259 || h2 == 1685485123) {
                                xdhVar = xdhVar4;
                                i12 = i67;
                                i13 = i32;
                                list = list2;
                                i14 = i63;
                                ipc a5 = ipc.a(d7kVar);
                                if (a5 != null) {
                                    str7 = a5.b;
                                    str3 = "video/dolby-vision";
                                }
                            } else {
                                int i68 = 11;
                                int i69 = 7;
                                int i70 = 12;
                                if (h2 == 1987076931) {
                                    x97.q(null, str3 == null);
                                    String str13 = i32 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    d7kVar.H(i41 + 12);
                                    byte v2 = (byte) d7kVar.v();
                                    byte v3 = (byte) d7kVar.v();
                                    int v4 = d7kVar.v();
                                    int i71 = v4 >> 4;
                                    byte b = (byte) ((v4 >> 1) & 7);
                                    if (str13.equals("video/x-vnd.on2.vp9")) {
                                        byte[] bArr2 = ir4.a;
                                        list2 = yde.y(new byte[]{1, 1, v2, 2, 1, v3, 3, 1, (byte) i71, 4, 1, b});
                                    }
                                    boolean z2 = (v4 & 1) != 0;
                                    int v5 = d7kVar.v();
                                    int v6 = d7kVar.v();
                                    i7 = q85.f(v5);
                                    int i72 = z2 ? 1 : 2;
                                    i38 = q85.g(v6);
                                    str3 = str13;
                                    xdhVar2 = xdhVar4;
                                    i33 = i67;
                                    i13 = i32;
                                    i10 = i71;
                                    i11 = i10;
                                    i8 = i72;
                                } else if (h2 == 1635135811) {
                                    int i73 = h - 8;
                                    byte[] bArr3 = new byte[i73];
                                    d7kVar.f(bArr3, 0, i73);
                                    list2 = yde.y(bArr3);
                                    d7kVar.H(i41 + 8);
                                    byte[] bArr4 = d7kVar.a;
                                    v94 v94Var = new v94(bArr4, bArr4.length);
                                    v94Var.q(d7kVar.b * 8);
                                    v94Var.u(1);
                                    int i74 = v94Var.i(3);
                                    v94Var.t(6);
                                    boolean h5 = v94Var.h();
                                    boolean h6 = v94Var.h();
                                    int i75 = -1;
                                    if (i74 == 2 && h5) {
                                        int i76 = h6 ? 12 : 10;
                                        i18 = h6 ? 12 : 10;
                                        i16 = i76;
                                    } else if (i74 <= 2) {
                                        int i77 = h5 ? 10 : 8;
                                        i18 = h5 ? 10 : 8;
                                        i16 = i77;
                                    } else {
                                        i16 = -1;
                                        i17 = -1;
                                        v94Var.t(13);
                                        v94Var.s();
                                        i19 = v94Var.i(4);
                                        if (i19 == 1) {
                                            vq1.Y("BoxParsers", "Unsupported obu_type: " + i19);
                                            q85Var2 = new q85(-1, -1, -1, i16, i17, null);
                                        } else if (v94Var.h()) {
                                            vq1.Y("BoxParsers", "Unsupported obu_extension_flag");
                                            q85Var2 = new q85(-1, -1, -1, i16, i17, null);
                                        } else {
                                            boolean h7 = v94Var.h();
                                            v94Var.s();
                                            if (!h7 || v94Var.i(8) <= 127) {
                                                int i78 = v94Var.i(3);
                                                v94Var.s();
                                                if (v94Var.h()) {
                                                    vq1.Y("BoxParsers", "Unsupported reduced_still_picture_header");
                                                    q85Var2 = new q85(-1, -1, -1, i16, i17, null);
                                                } else if (v94Var.h()) {
                                                    vq1.Y("BoxParsers", "Unsupported timing_info_present_flag");
                                                    q85Var2 = new q85(-1, -1, -1, i16, i17, null);
                                                } else if (v94Var.h()) {
                                                    vq1.Y("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                    q85Var2 = new q85(-1, -1, -1, i16, i17, null);
                                                } else {
                                                    int i79 = 5;
                                                    int i80 = v94Var.i(5);
                                                    int i81 = 0;
                                                    while (i81 <= i80) {
                                                        v94Var.t(i70);
                                                        if (v94Var.i(i79) > i69) {
                                                            v94Var.s();
                                                        }
                                                        i81++;
                                                        i79 = 5;
                                                        i70 = 12;
                                                        i69 = 7;
                                                    }
                                                    int i82 = v94Var.i(4);
                                                    int i83 = v94Var.i(4);
                                                    v94Var.t(i82 + 1);
                                                    v94Var.t(i83 + 1);
                                                    if (v94Var.h()) {
                                                        i20 = 7;
                                                        v94Var.t(7);
                                                    } else {
                                                        i20 = 7;
                                                    }
                                                    v94Var.t(i20);
                                                    boolean h8 = v94Var.h();
                                                    if (h8) {
                                                        v94Var.t(2);
                                                    }
                                                    if (v94Var.h()) {
                                                        i22 = 2;
                                                        i21 = 1;
                                                    } else {
                                                        i21 = 1;
                                                        i22 = v94Var.i(1);
                                                    }
                                                    if (i22 > 0 && !v94Var.h()) {
                                                        v94Var.t(i21);
                                                    }
                                                    if (h8) {
                                                        v94Var.t(3);
                                                    }
                                                    v94Var.t(3);
                                                    boolean h9 = v94Var.h();
                                                    if (i78 == 2 && h9) {
                                                        v94Var.s();
                                                    }
                                                    boolean z3 = i78 != 1 && v94Var.h();
                                                    if (v94Var.h()) {
                                                        int i84 = v94Var.i(8);
                                                        int i85 = v94Var.i(8);
                                                        int i86 = (!z3 && i84 == 1 && i85 == 13 && v94Var.i(8) == 0) ? 1 : v94Var.i(1);
                                                        int f2 = q85.f(i84);
                                                        int i87 = i86 == 1 ? 1 : 2;
                                                        i23 = f2;
                                                        i24 = i17;
                                                        i25 = q85.g(i85);
                                                        i75 = i87;
                                                    } else {
                                                        i23 = -1;
                                                        i24 = i17;
                                                        i25 = -1;
                                                    }
                                                    q85Var = new q85(i23, i75, i25, i16, i24, null);
                                                    int i88 = q85Var.e;
                                                    int i89 = q85Var.f;
                                                    int i90 = q85Var.a;
                                                    int i91 = q85Var.b;
                                                    i38 = q85Var.c;
                                                    xdhVar2 = xdhVar4;
                                                    i33 = i67;
                                                    str3 = "video/av01";
                                                    i10 = i88;
                                                    i11 = i89;
                                                    i7 = i90;
                                                    i13 = i32;
                                                    i8 = i91;
                                                }
                                            } else {
                                                vq1.Y("BoxParsers", "Excessive obu_size");
                                                q85Var2 = new q85(-1, -1, -1, i16, i17, null);
                                            }
                                        }
                                        q85Var = q85Var2;
                                        int i882 = q85Var.e;
                                        int i892 = q85Var.f;
                                        int i902 = q85Var.a;
                                        int i912 = q85Var.b;
                                        i38 = q85Var.c;
                                        xdhVar2 = xdhVar4;
                                        i33 = i67;
                                        str3 = "video/av01";
                                        i10 = i882;
                                        i11 = i892;
                                        i7 = i902;
                                        i13 = i32;
                                        i8 = i912;
                                    }
                                    i17 = i18;
                                    v94Var.t(13);
                                    v94Var.s();
                                    i19 = v94Var.i(4);
                                    if (i19 == 1) {
                                    }
                                    q85Var = q85Var2;
                                    int i8822 = q85Var.e;
                                    int i8922 = q85Var.f;
                                    int i9022 = q85Var.a;
                                    int i9122 = q85Var.b;
                                    i38 = q85Var.c;
                                    xdhVar2 = xdhVar4;
                                    i33 = i67;
                                    str3 = "video/av01";
                                    i10 = i8822;
                                    i11 = i8922;
                                    i7 = i9022;
                                    i13 = i32;
                                    i8 = i9122;
                                } else if (h2 == 1668050025) {
                                    if (byteBuffer == null) {
                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                    }
                                    ByteBuffer byteBuffer2 = byteBuffer;
                                    byteBuffer2.position(21);
                                    byteBuffer2.putShort(d7kVar.s());
                                    byteBuffer2.putShort(d7kVar.s());
                                    byteBuffer = byteBuffer2;
                                    xdhVar2 = xdhVar4;
                                    i33 = i67;
                                } else {
                                    if (h2 == 1835295606) {
                                        if (byteBuffer == null) {
                                            byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                        }
                                        ByteBuffer byteBuffer3 = byteBuffer;
                                        short s = d7kVar.s();
                                        short s2 = d7kVar.s();
                                        short s3 = d7kVar.s();
                                        short s4 = d7kVar.s();
                                        short s5 = d7kVar.s();
                                        xdhVar = xdhVar4;
                                        short s6 = d7kVar.s();
                                        i13 = i32;
                                        short s7 = d7kVar.s();
                                        list = list2;
                                        short s8 = d7kVar.s();
                                        long x = d7kVar.x();
                                        long x2 = d7kVar.x();
                                        i12 = i67;
                                        byteBuffer3.position(1);
                                        byteBuffer3.putShort(s5);
                                        byteBuffer3.putShort(s6);
                                        byteBuffer3.putShort(s);
                                        byteBuffer3.putShort(s2);
                                        byteBuffer3.putShort(s3);
                                        byteBuffer3.putShort(s4);
                                        byteBuffer3.putShort(s7);
                                        byteBuffer3.putShort(s8);
                                        byteBuffer3.putShort((short) (x / 10000));
                                        byteBuffer3.putShort((short) (x2 / 10000));
                                        byteBuffer = byteBuffer3;
                                    } else {
                                        xdhVar = xdhVar4;
                                        i12 = i67;
                                        i13 = i32;
                                        list = list2;
                                        if (h2 == 1681012275) {
                                            x97.q(null, str3 == null);
                                            xdhVar2 = xdhVar;
                                            str3 = str2;
                                            i38 = i63;
                                            list2 = list;
                                            i33 = i12;
                                        } else if (h2 == 1702061171) {
                                            x97.q(null, str3 == null);
                                            yg3 a6 = a(i41, d7kVar);
                                            String str14 = (String) a6.c;
                                            byte[] bArr5 = (byte[]) a6.d;
                                            list2 = bArr5 != null ? yde.y(bArr5) : list;
                                            yg3Var = a6;
                                            str3 = str14;
                                            xdhVar2 = xdhVar;
                                            i38 = i63;
                                            i33 = i12;
                                        } else if (h2 == 1651798644) {
                                            d7kVar.H(i41 + 8);
                                            d7kVar.I(4);
                                            mgrVar = new mgr(d7kVar.x(), d7kVar.x());
                                        } else if (h2 == 1885434736) {
                                            d7kVar.H(i41 + 8);
                                            f = d7kVar.z() / d7kVar.z();
                                            xdhVar2 = xdhVar;
                                            i38 = i63;
                                            list2 = list;
                                            i33 = i12;
                                            z = true;
                                        } else if (h2 == 1937126244) {
                                            int i92 = i41 + 8;
                                            while (true) {
                                                if (i92 - i41 >= h) {
                                                    bArr = null;
                                                    break;
                                                }
                                                d7kVar.H(i92);
                                                int h10 = d7kVar.h();
                                                if (d7kVar.h() == 1886547818) {
                                                    bArr = Arrays.copyOfRange(d7kVar.a, i92, h10 + i92);
                                                    break;
                                                }
                                                i92 += h10;
                                            }
                                        } else if (h2 == 1936995172) {
                                            int v7 = d7kVar.v();
                                            d7kVar.I(3);
                                            if (v7 == 0) {
                                                int v8 = d7kVar.v();
                                                if (v8 == 0) {
                                                    i15 = 0;
                                                } else if (v8 == 1) {
                                                    i15 = 1;
                                                } else if (v8 == 2) {
                                                    i15 = 2;
                                                } else if (v8 == 3) {
                                                    i15 = 3;
                                                }
                                                xdhVar2 = xdhVar;
                                                i33 = i15;
                                                i38 = i63;
                                                list2 = list;
                                            }
                                            i15 = i12;
                                            xdhVar2 = xdhVar;
                                            i33 = i15;
                                            i38 = i63;
                                            list2 = list;
                                        } else if (h2 == 1634760259) {
                                            int i93 = h - 12;
                                            byte[] bArr6 = new byte[i93];
                                            d7kVar.H(i41 + 12);
                                            int i94 = 0;
                                            d7kVar.f(bArr6, 0, i93);
                                            qsn y = yde.y(bArr6);
                                            d7k d7kVar2 = new d7k(bArr6);
                                            v94 v94Var2 = new v94(bArr6, i93);
                                            v94Var2.q(d7kVar2.b * 8);
                                            v94Var2.u(1);
                                            int i95 = v94Var2.i(8);
                                            int i96 = 0;
                                            int i97 = -1;
                                            int i98 = -1;
                                            int i99 = -1;
                                            int i100 = -1;
                                            int i101 = -1;
                                            while (i96 < i95) {
                                                v94Var2.u(1);
                                                int i102 = v94Var2.i(8);
                                                int i103 = i100;
                                                int i104 = i99;
                                                int i105 = i98;
                                                int i106 = i97;
                                                int i107 = i94;
                                                while (i107 < i102) {
                                                    v94Var2.t(6);
                                                    boolean h11 = v94Var2.h();
                                                    v94Var2.s();
                                                    v94Var2.u(i68);
                                                    v94Var2.t(4);
                                                    i101 = v94Var2.i(4) + 8;
                                                    v94Var2.u(1);
                                                    if (h11) {
                                                        int i108 = v94Var2.i(8);
                                                        int i109 = v94Var2.i(8);
                                                        v94Var2.u(1);
                                                        boolean h12 = v94Var2.h();
                                                        i106 = q85.f(i108);
                                                        int i110 = h12 ? 1 : 2;
                                                        i104 = q85.g(i109);
                                                        i105 = i110;
                                                    }
                                                    i107++;
                                                    i103 = i101;
                                                    i68 = 11;
                                                }
                                                i96++;
                                                i97 = i106;
                                                i98 = i105;
                                                i99 = i104;
                                                i100 = i103;
                                                i94 = 0;
                                                i68 = 11;
                                            }
                                            list2 = y;
                                            i7 = i97;
                                            i8 = i98;
                                            i38 = i99;
                                            xdhVar2 = xdhVar;
                                            i11 = i100;
                                            i10 = i101;
                                            i33 = i12;
                                            str3 = "video/apv";
                                        } else if (h2 == 1668246642) {
                                            i14 = i63;
                                            if (i7 == -1 && i14 == -1) {
                                                int h13 = d7kVar.h();
                                                if (h13 == 1852009592 || h13 == 1852009571) {
                                                    int B3 = d7kVar.B();
                                                    int B4 = d7kVar.B();
                                                    d7kVar.I(2);
                                                    boolean z4 = h == 19 && (d7kVar.v() & 128) != 0;
                                                    int f3 = q85.f(B3);
                                                    int i111 = z4 ? 1 : 2;
                                                    i38 = q85.g(B4);
                                                    i7 = f3;
                                                    i8 = i111;
                                                    xdhVar2 = xdhVar;
                                                    list2 = list;
                                                    i33 = i12;
                                                } else {
                                                    vq1.n0("BoxParsers", "Unsupported color type: ".concat(ceg.d(h13)));
                                                }
                                            }
                                        } else {
                                            i14 = i63;
                                        }
                                    }
                                    xdhVar2 = xdhVar;
                                    i38 = i63;
                                    list2 = list;
                                    i33 = i12;
                                }
                            }
                            i38 = i14;
                            xdhVar2 = xdhVar;
                            list2 = list;
                            i33 = i12;
                        }
                        i13 = i32;
                        i38 = i63;
                    }
                }
                int i112 = i9 + h;
                i30 = i3;
                ah3Var2 = ah3Var;
                i36 = i7;
                str5 = str2;
                str6 = str3;
                i32 = i13;
                pqaVar4 = pqaVar2;
                i31 = i112;
                i39 = i10;
                i40 = i11;
                i37 = i8;
                i29 = i2;
            }
            int i1122 = i9 + h;
            i30 = i3;
            ah3Var2 = ah3Var;
            i36 = i7;
            str5 = str2;
            str6 = str3;
            i32 = i13;
            pqaVar4 = pqaVar2;
            i31 = i1122;
            i39 = i10;
            i40 = i11;
            i37 = i8;
            i29 = i2;
        }
        pqa pqaVar5 = pqaVar4;
        List list3 = list2;
        int i113 = i33;
        int i114 = i36;
        int i115 = i37;
        int i116 = i38;
        int i117 = i39;
        int i118 = i40;
        String str15 = str6;
        if (str15 == null) {
            return;
        }
        bsc bscVar = new bsc();
        bscVar.a = Integer.toString(i4);
        bscVar.m = l5i.p(str15);
        bscVar.j = str7;
        bscVar.t = B;
        bscVar.u = B2;
        bscVar.x = f;
        bscVar.w = i5;
        bscVar.y = bArr;
        bscVar.z = i113;
        bscVar.p = list3;
        bscVar.o = i34;
        bscVar.B = i35;
        bscVar.q = pqaVar5;
        bscVar.d = str;
        bscVar.A = new q85(i114, i115, i116, i117, i118, byteBuffer != null ? byteBuffer.array() : null);
        mgr mgrVar2 = mgrVar;
        if (mgrVar2 != null) {
            bscVar.h = zc4.W(mgrVar2.a);
            bscVar.i = zc4.W(mgrVar2.b);
        } else {
            yg3 yg3Var2 = yg3Var;
            if (yg3Var2 != null) {
                bscVar.h = zc4.W(yg3Var2.a);
                bscVar.i = zc4.W(yg3Var2.b);
            }
        }
        ah3Var.e = new dsc(bscVar);
    }
}
