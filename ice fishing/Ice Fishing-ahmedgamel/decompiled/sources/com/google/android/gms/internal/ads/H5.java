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
    public static final /* synthetic */ H5 f25987b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ H5 f25988c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ H5 f25989d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ H5 f25990e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ H5 f25991f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ H5 f25992g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ H5 f25993h;
    public static final /* synthetic */ H5 i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ H5 f25994j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ H5 f25995k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ H5 f25996l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ H5 f25997m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ H5 f25998n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ H5 f25999o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ H5 f26000p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ H5 f26001q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ H5 f26002r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ H5 f26003s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ H5 f26004t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ H5 f26005u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ H5 f26006v;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26007a;

    static {
        int i4 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i6 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i9 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i10 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i11 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i12 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i13 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        f26006v = new H5((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        f26005u = new H5((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        f26004t = new H5((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        f26003s = new H5(i13);
        f26002r = new H5(i10);
        f26001q = new H5(i11);
        H5 h52 = new H5(i12);
        int i14 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i15 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i16 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i17 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i18 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i19 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i20 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i21 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i22 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        f26000p = h52;
        f25999o = new H5(i9);
        f25998n = new H5(i14);
        f25997m = new H5(i15);
        f25996l = new H5(i16);
        f25995k = new H5(i6);
        f25994j = new H5(i17);
        i = new H5(i18);
        f25993h = new H5(i19);
        f25992g = new H5(i4);
        f25991f = new H5(i20);
        f25990e = new H5(i21);
        f25989d = new H5(i22);
        f25988c = new H5(1);
        f25987b = new H5(0);
    }

    public /* synthetic */ H5(int i4) {
        this.f26007a = i4;
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
                                        switch (this.f26007a) {
                                            case 0:
                                                C2981b6 c2981b6 = (C2981b6) obj;
                                                Y5 y52 = c2981b6.f30002a;
                                                long m9 = y52.c().m();
                                                if (y52.c().m() != 0) {
                                                    c2981b6.f30004c.b(m9);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    Y5 y53 = ((C2981b6) obj).f30002a;
                                                    long m10 = y53.c().m();
                                                    C3249g6 c9 = y53.c();
                                                    C3249g6 c10 = y53.c();
                                                    List o4 = c10.o();
                                                    if (m10 < 0) {
                                                        m10 += ((ArrayList) o4).size() + 1;
                                                    }
                                                    if (m10 >= 0) {
                                                        ArrayList arrayList = (ArrayList) o4;
                                                        if (m10 < arrayList.size() + 1) {
                                                            arrayList.add((int) m10, c9);
                                                            y53.b(c10);
                                                            return Optional.empty();
                                                        }
                                                    }
                                                    throw new C3141e6();
                                                } catch (C3141e6 unused) {
                                                    b52 = B5.f24612k0;
                                                    break;
                                                }
                                            case 2:
                                                C2981b6 c2981b62 = (C2981b6) obj;
                                                Y5 y54 = c2981b62.f30002a;
                                                long m11 = y54.c().m();
                                                if (y54.c().m() == 0) {
                                                    c2981b62.f30004c.b(m11);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                ((C2981b6) obj).f30002a.b(C3249g6.b(((ArrayList) r12.c().o()).size()));
                                                return Optional.empty();
                                            case 4:
                                                ((C2981b6) obj).f30002a.b(C3249g6.b(r12.c().n().f27037a.length));
                                                return Optional.empty();
                                            case 5:
                                                Y5 y55 = ((C2981b6) obj).f30002a;
                                                y55.b(C3249g6.c(Math.log(y55.c().q())));
                                                return Optional.empty();
                                            case 6:
                                                Y5 y56 = ((C2981b6) obj).f30002a;
                                                long m12 = y56.c().m();
                                                long m13 = y56.c().m();
                                                if (m12 == 0 || m13 == 0) {
                                                    j6 = 0;
                                                }
                                                y56.b(C3249g6.b(j6));
                                                return Optional.empty();
                                            case 7:
                                                Y5 y57 = ((C2981b6) obj).f30002a;
                                                if (y57.c().m() != 0) {
                                                    j6 = 0;
                                                }
                                                y57.b(C3249g6.b(j6));
                                                return Optional.empty();
                                            case 8:
                                                Y5 y58 = ((C2981b6) obj).f30002a;
                                                long m14 = y58.c().m();
                                                long m15 = y58.c().m();
                                                if (m14 == 0 && m15 == 0) {
                                                    j6 = 0;
                                                }
                                                y58.b(C3249g6.b(j6));
                                                return Optional.empty();
                                            case 9:
                                                C2981b6 c2981b63 = (C2981b6) obj;
                                                Y5 y59 = c2981b63.f30002a;
                                                try {
                                                    int compare = new C3034c6(false).compare(y59.c(), y59.c());
                                                    Y5 y510 = c2981b63.f30002a;
                                                    if (compare >= 0) {
                                                        j6 = 0;
                                                    }
                                                    y510.b(C3249g6.b(j6));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(B5.f24617x);
                                                }
                                            case 10:
                                                C2981b6 c2981b64 = (C2981b6) obj;
                                                try {
                                                    Y5 y511 = c2981b64.f30002a;
                                                    long m16 = y511.c().m();
                                                    Y5 y512 = new Y5();
                                                    for (int i4 = 0; i4 < y511.f29431b; i4++) {
                                                        try {
                                                            y512.b(C3249g6.j((C3249g6) y511.f29430a.get(i4)));
                                                        } catch (X5 e9) {
                                                            throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e9);
                                                        }
                                                    }
                                                    R5 r52 = c2981b64.f30004c;
                                                    R5 r53 = new R5((M5) r52.f27929u, r52.f27928n, ((F5) r52.f27930v).i(), (V2) r52.f27931w);
                                                    new C3717or(7);
                                                    r53.b(m16);
                                                    y511.b(C3249g6.a(new V2(23)));
                                                    return Optional.empty();
                                                } catch (P5 | Q5 unused3) {
                                                    b52 = B5.f24598N;
                                                    break;
                                                }
                                            case 11:
                                                try {
                                                    Y5 y513 = ((C2981b6) obj).f30002a;
                                                    y513.b(C3249g6.a(y513.c().i((Class) y513.c().l())));
                                                    return Optional.empty();
                                                } catch (C3088d6 unused4) {
                                                    b52 = B5.J;
                                                    break;
                                                }
                                            case 12:
                                                Y5 y514 = ((C2981b6) obj).f30002a;
                                                long m17 = y514.c().m();
                                                long m18 = y514.c().m();
                                                if (m17 == 0) {
                                                    return Optional.of(B5.f24609Z);
                                                }
                                                y514.b(C3249g6.b(m18 % m17));
                                                return Optional.empty();
                                            case 13:
                                                Y5 y515 = ((C2981b6) obj).f30002a;
                                                y515.b(C3249g6.c(y515.c().q() * y515.c().q()));
                                                return Optional.empty();
                                            case 14:
                                                Y5 y516 = ((C2981b6) obj).f30002a;
                                                y516.b(C3249g6.b(y516.c().m() * y516.c().m()));
                                                return Optional.empty();
                                            case 15:
                                                Y5 y517 = ((C2981b6) obj).f30002a;
                                                long m19 = y517.c().m();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (long j9 = 0; j9 < m19; j9++) {
                                                    arrayList2.add(y517.c());
                                                }
                                                Collections.reverse(arrayList2);
                                                y517.b(C3249g6.e(arrayList2));
                                                return Optional.empty();
                                            case 16:
                                                Y5 y518 = ((C2981b6) obj).f30002a;
                                                y518.b(C3249g6.c(Math.pow(y518.c().q(), y518.c().q())));
                                                return Optional.empty();
                                            case 17:
                                                ((C2981b6) obj).f30002a.b(C3249g6.a(null));
                                                return Optional.empty();
                                            case 18:
                                                C2981b6 c2981b65 = (C2981b6) obj;
                                                ByteBuffer wrap = ByteBuffer.wrap(c2981b65.f30004c.i(64L).a());
                                                wrap.order(ByteOrder.LITTLE_ENDIAN);
                                                c2981b65.f30002a.b(C3249g6.c(Double.longBitsToDouble(wrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                C2981b6 c2981b66 = (C2981b6) obj;
                                                c2981b66.f30002a.b(C3249g6.b(c2981b66.f30004c.h()));
                                                return Optional.empty();
                                            default:
                                                C2981b6 c2981b67 = (C2981b6) obj;
                                                R5 r54 = c2981b67.f30004c;
                                                long h3 = r54.h();
                                                if (h3 >= 0 && h3 <= 2147483647L) {
                                                    if ((7 & h3) != 0) {
                                                        return Optional.of(B5.f24618y);
                                                    }
                                                    c2981b67.f30002a.b(C3249g6.d(r54.i(h3)));
                                                    return Optional.empty();
                                                }
                                                return Optional.of(B5.f24604T);
                                        }
                                    } catch (P5 e10) {
                                        e = e10;
                                        throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                                    }
                                } catch (Q5 unused5) {
                                    b52 = B5.f24604T;
                                }
                            } catch (X5 e11) {
                                e = e11;
                                throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                            }
                        } catch (O5 unused6) {
                            b52 = B5.f24608X;
                        }
                    } catch (W5 unused7) {
                        b52 = B5.f24602R;
                    }
                } catch (C3088d6 unused8) {
                    b52 = B5.f24603S;
                }
            } catch (X5 unused9) {
                b52 = B5.f24614u;
            }
        } catch (P5 | Q5 unused10) {
            b52 = B5.f24588C;
        }
        return Optional.of(b52);
    }
}
