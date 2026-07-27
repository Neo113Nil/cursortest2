package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* loaded from: classes2.dex */
public final /* synthetic */ class H5 implements Z5 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ H5 f25215b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ H5 f25216c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ H5 f25217d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ H5 f25218e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ H5 f25219f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ H5 f25220g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ H5 f25221h;
    public static final /* synthetic */ H5 i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ H5 f25222j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ H5 f25223k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ H5 f25224l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ H5 f25225m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ H5 f25226n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ H5 f25227o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ H5 f25228p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ H5 f25229q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ H5 f25230r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ H5 f25231s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ H5 f25232t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ H5 f25233u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ H5 f25234v;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25235a;

    static {
        int i6 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i9 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i10 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i11 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i12 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i13 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i14 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        f25234v = new H5((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        f25233u = new H5((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        f25232t = new H5((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        f25231s = new H5(i14);
        f25230r = new H5(i11);
        f25229q = new H5(i12);
        H5 h52 = new H5(i13);
        int i15 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i16 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i17 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i18 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i19 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i20 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i21 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i22 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i23 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        f25228p = h52;
        f25227o = new H5(i10);
        f25226n = new H5(i15);
        f25225m = new H5(i16);
        f25224l = new H5(i17);
        f25223k = new H5(i9);
        f25222j = new H5(i18);
        i = new H5(i19);
        f25221h = new H5(i20);
        f25220g = new H5(i6);
        f25219f = new H5(i21);
        f25218e = new H5(i22);
        f25217d = new H5(i23);
        f25216c = new H5(1);
        f25215b = new H5(0);
    }

    public /* synthetic */ H5(int i6) {
        this.f25235a = i6;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        B5 b52;
        long j6 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.f25235a) {
                                            case 0:
                                                C2958b6 c2958b6 = (C2958b6) obj;
                                                Y5 y52 = c2958b6.f29214a;
                                                long m4 = y52.c().m();
                                                if (y52.c().m() != 0) {
                                                    c2958b6.f29216c.b(m4);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    Y5 y53 = ((C2958b6) obj).f29214a;
                                                    long m9 = y53.c().m();
                                                    C3226g6 c9 = y53.c();
                                                    C3226g6 c10 = y53.c();
                                                    List o6 = c10.o();
                                                    if (m9 < 0) {
                                                        m9 += ((ArrayList) o6).size() + 1;
                                                    }
                                                    if (m9 >= 0) {
                                                        ArrayList arrayList = (ArrayList) o6;
                                                        if (m9 < arrayList.size() + 1) {
                                                            arrayList.add((int) m9, c9);
                                                            y53.b(c10);
                                                            return Optional.empty();
                                                        }
                                                    }
                                                    throw new C3118e6();
                                                } catch (C3118e6 unused) {
                                                    b52 = B5.f23840p0;
                                                    break;
                                                }
                                            case 2:
                                                C2958b6 c2958b62 = (C2958b6) obj;
                                                Y5 y54 = c2958b62.f29214a;
                                                long m10 = y54.c().m();
                                                if (y54.c().m() == 0) {
                                                    c2958b62.f29216c.b(m10);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                ((C2958b6) obj).f29214a.b(C3226g6.b(((ArrayList) r12.c().o()).size()));
                                                return Optional.empty();
                                            case 4:
                                                ((C2958b6) obj).f29214a.b(C3226g6.b(r12.c().n().f26246a.length));
                                                return Optional.empty();
                                            case 5:
                                                Y5 y55 = ((C2958b6) obj).f29214a;
                                                y55.b(C3226g6.c(Math.log(y55.c().q())));
                                                return Optional.empty();
                                            case 6:
                                                Y5 y56 = ((C2958b6) obj).f29214a;
                                                long m11 = y56.c().m();
                                                long m12 = y56.c().m();
                                                if (m11 == 0 || m12 == 0) {
                                                    j6 = 0;
                                                }
                                                y56.b(C3226g6.b(j6));
                                                return Optional.empty();
                                            case 7:
                                                Y5 y57 = ((C2958b6) obj).f29214a;
                                                if (y57.c().m() != 0) {
                                                    j6 = 0;
                                                }
                                                y57.b(C3226g6.b(j6));
                                                return Optional.empty();
                                            case 8:
                                                Y5 y58 = ((C2958b6) obj).f29214a;
                                                long m13 = y58.c().m();
                                                long m14 = y58.c().m();
                                                if (m13 == 0 && m14 == 0) {
                                                    j6 = 0;
                                                }
                                                y58.b(C3226g6.b(j6));
                                                return Optional.empty();
                                            case 9:
                                                C2958b6 c2958b63 = (C2958b6) obj;
                                                Y5 y59 = c2958b63.f29214a;
                                                try {
                                                    int compare = new C3011c6(false).compare(y59.c(), y59.c());
                                                    Y5 y510 = c2958b63.f29214a;
                                                    if (compare >= 0) {
                                                        j6 = 0;
                                                    }
                                                    y510.b(C3226g6.b(j6));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(B5.f23846x);
                                                }
                                            case 10:
                                                C2958b6 c2958b64 = (C2958b6) obj;
                                                try {
                                                    Y5 y511 = c2958b64.f29214a;
                                                    long m15 = y511.c().m();
                                                    Y5 y512 = new Y5();
                                                    for (int i6 = 0; i6 < y511.f28654b; i6++) {
                                                        try {
                                                            y512.b(C3226g6.j((C3226g6) y511.f28653a.get(i6)));
                                                        } catch (X5 e9) {
                                                            throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e9);
                                                        }
                                                    }
                                                    R5 r52 = c2958b64.f29216c;
                                                    R5 r53 = new R5((M5) r52.f27173u, r52.f27172n, ((F5) r52.f27174v).i(), (V2) r52.f27175w);
                                                    new C3694or(7);
                                                    r53.b(m15);
                                                    y511.b(C3226g6.a(new V2(23)));
                                                    return Optional.empty();
                                                } catch (P5 | Q5 unused3) {
                                                    b52 = B5.f23826N;
                                                    break;
                                                }
                                            case 11:
                                                try {
                                                    Y5 y513 = ((C2958b6) obj).f29214a;
                                                    y513.b(C3226g6.a(y513.c().i((Class) y513.c().l())));
                                                    return Optional.empty();
                                                } catch (C3065d6 unused4) {
                                                    b52 = B5.J;
                                                    break;
                                                }
                                            case 12:
                                                Y5 y514 = ((C2958b6) obj).f29214a;
                                                long m16 = y514.c().m();
                                                long m17 = y514.c().m();
                                                if (m16 == 0) {
                                                    return Optional.of(B5.f23837Z);
                                                }
                                                y514.b(C3226g6.b(m17 % m16));
                                                return Optional.empty();
                                            case 13:
                                                Y5 y515 = ((C2958b6) obj).f29214a;
                                                y515.b(C3226g6.c(y515.c().q() * y515.c().q()));
                                                return Optional.empty();
                                            case 14:
                                                Y5 y516 = ((C2958b6) obj).f29214a;
                                                y516.b(C3226g6.b(y516.c().m() * y516.c().m()));
                                                return Optional.empty();
                                            case 15:
                                                Y5 y517 = ((C2958b6) obj).f29214a;
                                                long m18 = y517.c().m();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (long j9 = 0; j9 < m18; j9++) {
                                                    arrayList2.add(y517.c());
                                                }
                                                Collections.reverse(arrayList2);
                                                y517.b(C3226g6.e(arrayList2));
                                                return Optional.empty();
                                            case 16:
                                                Y5 y518 = ((C2958b6) obj).f29214a;
                                                y518.b(C3226g6.c(Math.pow(y518.c().q(), y518.c().q())));
                                                return Optional.empty();
                                            case 17:
                                                ((C2958b6) obj).f29214a.b(C3226g6.a(null));
                                                return Optional.empty();
                                            case 18:
                                                C2958b6 c2958b65 = (C2958b6) obj;
                                                ByteBuffer wrap = ByteBuffer.wrap(c2958b65.f29216c.i(64L).a());
                                                wrap.order(ByteOrder.LITTLE_ENDIAN);
                                                c2958b65.f29214a.b(C3226g6.c(Double.longBitsToDouble(wrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                C2958b6 c2958b66 = (C2958b6) obj;
                                                c2958b66.f29214a.b(C3226g6.b(c2958b66.f29216c.h()));
                                                return Optional.empty();
                                            default:
                                                C2958b6 c2958b67 = (C2958b6) obj;
                                                R5 r54 = c2958b67.f29216c;
                                                long h9 = r54.h();
                                                if (h9 >= 0 && h9 <= 2147483647L) {
                                                    if ((7 & h9) != 0) {
                                                        return Optional.of(B5.f23847y);
                                                    }
                                                    c2958b67.f29214a.b(C3226g6.d(r54.i(h9)));
                                                    return Optional.empty();
                                                }
                                                return Optional.of(B5.f23832T);
                                        }
                                    } catch (P5 e10) {
                                        e = e10;
                                        throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                                    }
                                } catch (Q5 unused5) {
                                    b52 = B5.f23832T;
                                }
                            } catch (X5 e11) {
                                e = e11;
                                throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                            }
                        } catch (O5 unused6) {
                            b52 = B5.f23836X;
                        }
                    } catch (W5 unused7) {
                        b52 = B5.f23830R;
                    }
                } catch (C3065d6 unused8) {
                    b52 = B5.f23831S;
                }
            } catch (X5 unused9) {
                b52 = B5.f23843u;
            }
        } catch (P5 | Q5 unused10) {
            b52 = B5.f23816C;
        }
        return Optional.of(b52);
    }
}
