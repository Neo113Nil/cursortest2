package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* loaded from: classes2.dex */
public final /* synthetic */ class F5 implements W5 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ F5 f24901b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ F5 f24902c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ F5 f24903d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ F5 f24904e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ F5 f24905f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ F5 f24906g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ F5 f24907h;
    public static final /* synthetic */ F5 i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ F5 f24908j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ F5 f24909k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ F5 f24910l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ F5 f24911m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ F5 f24912n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ F5 f24913o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ F5 f24914p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ F5 f24915q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ F5 f24916r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ F5 f24917s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ F5 f24918t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ F5 f24919u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ F5 f24920v;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24921a;

    static {
        int i4 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i9 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i10 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i11 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i12 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i13 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i14 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        f24920v = new F5((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        f24919u = new F5((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        f24918t = new F5((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        f24917s = new F5(i14);
        f24916r = new F5(i11);
        f24915q = new F5(i12);
        F5 f52 = new F5(i13);
        int i15 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i16 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i17 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i18 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i19 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i20 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i21 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i22 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i23 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        f24914p = f52;
        f24913o = new F5(i10);
        f24912n = new F5(i15);
        f24911m = new F5(i16);
        f24910l = new F5(i17);
        f24909k = new F5(i9);
        f24908j = new F5(i18);
        i = new F5(i19);
        f24907h = new F5(i20);
        f24906g = new F5(i4);
        f24905f = new F5(i21);
        f24904e = new F5(i22);
        f24903d = new F5(i23);
        f24902c = new F5(1);
        f24901b = new F5(0);
    }

    public /* synthetic */ F5(int i4) {
        this.f24921a = i4;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        EnumC4261z5 enumC4261z5;
        long j9 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.f24921a) {
                                            case 0:
                                                Y5 y52 = (Y5) obj;
                                                V5 v52 = y52.f28787a;
                                                long m8 = v52.c().m();
                                                if (v52.c().m() != 0) {
                                                    y52.f28789c.a(m8);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    V5 v53 = ((Y5) obj).f28787a;
                                                    long m9 = v53.c().m();
                                                    C3020c6 c4 = v53.c();
                                                    C3020c6 c9 = v53.c();
                                                    List o9 = c9.o();
                                                    if (m9 < 0) {
                                                        m9 += ((ArrayList) o9).size() + 1;
                                                    }
                                                    if (m9 >= 0) {
                                                        ArrayList arrayList = (ArrayList) o9;
                                                        if (m9 < arrayList.size() + 1) {
                                                            arrayList.add((int) m9, c4);
                                                            v53.b(c9);
                                                            return Optional.empty();
                                                        }
                                                    }
                                                    throw new C2966b6();
                                                } catch (C2966b6 unused) {
                                                    enumC4261z5 = EnumC4261z5.f35470p0;
                                                    break;
                                                }
                                            case 2:
                                                Y5 y53 = (Y5) obj;
                                                V5 v54 = y53.f28787a;
                                                long m10 = v54.c().m();
                                                if (v54.c().m() == 0) {
                                                    y53.f28789c.a(m10);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                ((Y5) obj).f28787a.b(C3020c6.b(((ArrayList) r12.c().o()).size()));
                                                return Optional.empty();
                                            case 4:
                                                ((Y5) obj).f28787a.b(C3020c6.b(r12.c().n().f25735a.length));
                                                return Optional.empty();
                                            case 5:
                                                V5 v55 = ((Y5) obj).f28787a;
                                                v55.b(C3020c6.c(Math.log(v55.c().q())));
                                                return Optional.empty();
                                            case 6:
                                                V5 v56 = ((Y5) obj).f28787a;
                                                long m11 = v56.c().m();
                                                long m12 = v56.c().m();
                                                if (m11 == 0 || m12 == 0) {
                                                    j9 = 0;
                                                }
                                                v56.b(C3020c6.b(j9));
                                                return Optional.empty();
                                            case 7:
                                                V5 v57 = ((Y5) obj).f28787a;
                                                if (v57.c().m() != 0) {
                                                    j9 = 0;
                                                }
                                                v57.b(C3020c6.b(j9));
                                                return Optional.empty();
                                            case 8:
                                                V5 v58 = ((Y5) obj).f28787a;
                                                long m13 = v58.c().m();
                                                long m14 = v58.c().m();
                                                if (m13 == 0 && m14 == 0) {
                                                    j9 = 0;
                                                }
                                                v58.b(C3020c6.b(j9));
                                                return Optional.empty();
                                            case 9:
                                                Y5 y54 = (Y5) obj;
                                                V5 v59 = y54.f28787a;
                                                try {
                                                    int compare = new Z5(false).compare(v59.c(), v59.c());
                                                    V5 v510 = y54.f28787a;
                                                    if (compare >= 0) {
                                                        j9 = 0;
                                                    }
                                                    v510.b(C3020c6.b(j9));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(EnumC4261z5.f35476x);
                                                }
                                            case 10:
                                                Y5 y55 = (Y5) obj;
                                                try {
                                                    V5 v511 = y55.f28787a;
                                                    long m15 = v511.c().m();
                                                    V5 v512 = new V5();
                                                    for (int i4 = 0; i4 < v511.f28211b; i4++) {
                                                        try {
                                                            v512.b(C3020c6.j((C3020c6) v511.f28210a.get(i4)));
                                                        } catch (U5 e6) {
                                                            throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e6);
                                                        }
                                                    }
                                                    O5 o52 = y55.f28789c;
                                                    O5 o53 = new O5((J5) o52.f26649u, o52.f26648n, ((D5) o52.f26650v).i(), (T2) o52.f26651w);
                                                    new C3761pr(6);
                                                    o53.a(m15);
                                                    v511.b(C3020c6.a(new T2(23)));
                                                    return Optional.empty();
                                                } catch (M5 | N5 unused3) {
                                                    enumC4261z5 = EnumC4261z5.f35456N;
                                                    break;
                                                }
                                            case 11:
                                                try {
                                                    V5 v513 = ((Y5) obj).f28787a;
                                                    v513.b(C3020c6.a(v513.c().i((Class) v513.c().l())));
                                                    return Optional.empty();
                                                } catch (C2911a6 unused4) {
                                                    enumC4261z5 = EnumC4261z5.J;
                                                    break;
                                                }
                                            case 12:
                                                V5 v514 = ((Y5) obj).f28787a;
                                                long m16 = v514.c().m();
                                                long m17 = v514.c().m();
                                                if (m16 == 0) {
                                                    return Optional.of(EnumC4261z5.f35467Z);
                                                }
                                                v514.b(C3020c6.b(m17 % m16));
                                                return Optional.empty();
                                            case 13:
                                                V5 v515 = ((Y5) obj).f28787a;
                                                v515.b(C3020c6.c(v515.c().q() * v515.c().q()));
                                                return Optional.empty();
                                            case 14:
                                                V5 v516 = ((Y5) obj).f28787a;
                                                v516.b(C3020c6.b(v516.c().m() * v516.c().m()));
                                                return Optional.empty();
                                            case 15:
                                                V5 v517 = ((Y5) obj).f28787a;
                                                long m18 = v517.c().m();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (long j10 = 0; j10 < m18; j10++) {
                                                    arrayList2.add(v517.c());
                                                }
                                                Collections.reverse(arrayList2);
                                                v517.b(C3020c6.e(arrayList2));
                                                return Optional.empty();
                                            case 16:
                                                V5 v518 = ((Y5) obj).f28787a;
                                                v518.b(C3020c6.c(Math.pow(v518.c().q(), v518.c().q())));
                                                return Optional.empty();
                                            case 17:
                                                ((Y5) obj).f28787a.b(C3020c6.a(null));
                                                return Optional.empty();
                                            case 18:
                                                Y5 y56 = (Y5) obj;
                                                ByteBuffer wrap = ByteBuffer.wrap(y56.f28789c.h(64L).a());
                                                wrap.order(ByteOrder.LITTLE_ENDIAN);
                                                y56.f28787a.b(C3020c6.c(Double.longBitsToDouble(wrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                Y5 y57 = (Y5) obj;
                                                y57.f28787a.b(C3020c6.b(y57.f28789c.g()));
                                                return Optional.empty();
                                            default:
                                                Y5 y58 = (Y5) obj;
                                                O5 o54 = y58.f28789c;
                                                long g9 = o54.g();
                                                if (g9 >= 0 && g9 <= 2147483647L) {
                                                    if ((7 & g9) != 0) {
                                                        return Optional.of(EnumC4261z5.f35477y);
                                                    }
                                                    y58.f28787a.b(C3020c6.d(o54.h(g9)));
                                                    return Optional.empty();
                                                }
                                                return Optional.of(EnumC4261z5.f35462T);
                                        }
                                    } catch (L5 unused5) {
                                        enumC4261z5 = EnumC4261z5.f35466X;
                                    }
                                } catch (M5 e9) {
                                    e = e9;
                                    throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e);
                                }
                            } catch (U5 unused6) {
                                enumC4261z5 = EnumC4261z5.f35473u;
                            }
                        } catch (U5 e10) {
                            e = e10;
                            throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e);
                        }
                    } catch (C2911a6 unused7) {
                        enumC4261z5 = EnumC4261z5.f35461S;
                    }
                } catch (T5 unused8) {
                    enumC4261z5 = EnumC4261z5.f35460R;
                }
            } catch (N5 unused9) {
                enumC4261z5 = EnumC4261z5.f35462T;
            }
        } catch (M5 | N5 unused10) {
            enumC4261z5 = EnumC4261z5.f35446C;
        }
        return Optional.of(enumC4261z5);
    }
}
