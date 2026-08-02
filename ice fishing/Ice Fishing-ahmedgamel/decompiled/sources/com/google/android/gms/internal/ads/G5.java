package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* loaded from: classes2.dex */
public final /* synthetic */ class G5 implements Z5 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ G5 f25705b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ G5 f25706c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ G5 f25707d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ G5 f25708e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ G5 f25709f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ G5 f25710g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ G5 f25711h;
    public static final /* synthetic */ G5 i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ G5 f25712j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ G5 f25713k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ G5 f25714l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ G5 f25715m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ G5 f25716n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ G5 f25717o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ G5 f25718p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ G5 f25719q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ G5 f25720r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ G5 f25721s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ G5 f25722t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ G5 f25723u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ G5 f25724v;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25725a;

    static {
        int i4 = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i6 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i9 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i10 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i11 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i12 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i13 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        f25724v = new G5((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        f25723u = new G5((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        f25722t = new G5((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        f25721s = new G5(i13);
        f25720r = new G5(i10);
        f25719q = new G5(i11);
        G5 g52 = new G5(i12);
        int i14 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i15 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i16 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i17 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i18 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i19 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i20 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i21 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i22 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        f25718p = g52;
        f25717o = new G5(i9);
        f25716n = new G5(i14);
        f25715m = new G5(i15);
        f25714l = new G5(i16);
        f25713k = new G5(i6);
        f25712j = new G5(i17);
        i = new G5(i18);
        f25711h = new G5(i19);
        f25710g = new G5(i4);
        f25709f = new G5(i20);
        f25708e = new G5(i21);
        f25707d = new G5(i22);
        f25706c = new G5(1);
        f25705b = new G5(0);
    }

    public /* synthetic */ G5(int i4) {
        this.f25725a = i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0180, code lost:
    
        if (r1.equals("void") != false) goto L98;
     */
    @Override // java.util.function.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        B5 b52;
        long j6;
        B5 b53;
        B5 b54;
        int i4 = this.f25725a;
        long j9 = 1;
        Class<?> cls = Void.TYPE;
        long j10 = 0;
        int i6 = 0;
        try {
            try {
                try {
                    try {
                        switch (i4) {
                            case 0:
                                Y5 y52 = ((C2981b6) obj).f30002a;
                                y52.b(C3249g6.b(y52.c().m() + y52.c().m()));
                                return Optional.empty();
                            case 1:
                                Y5 y53 = ((C2981b6) obj).f30002a;
                                y53.b(C3249g6.c(y53.c().q() + y53.c().q()));
                                return Optional.empty();
                            case 2:
                                Y5 y54 = ((C2981b6) obj).f30002a;
                                y54.b(C3249g6.d(y54.c().n().d(y54.c().n())));
                                return Optional.empty();
                            case 3:
                                C2981b6 c2981b6 = (C2981b6) obj;
                                try {
                                    long h3 = c2981b6.f30004c.h();
                                    for (long j11 = 0; j11 < h3; j11++) {
                                        c2981b6.f30002a.b(C3249g6.a(null));
                                    }
                                    return Optional.empty();
                                } catch (X5 unused) {
                                    b52 = B5.f24614u;
                                    return Optional.of(b52);
                                }
                            case 4:
                                Y5 y55 = ((C2981b6) obj).f30002a;
                                y55.b(C3249g6.b(y55.c().m() & y55.c().m()));
                                return Optional.empty();
                            case 5:
                                long[] jArr = {916768482, 1259538933, 805446160, -15648283, -1266372608, 883303887, 6538657, 384868448, 102194872};
                                long j12 = jArr[0];
                                long j13 = jArr[1];
                                long j14 = jArr[2];
                                long j15 = jArr[3];
                                long j16 = jArr[4];
                                long j17 = jArr[5];
                                long j18 = jArr[6];
                                long j19 = jArr[7];
                                long j20 = (((((~j12) & j13) | j14) + (j16 | (j12 & j15))) - j17) + j18;
                                long j21 = j19 % 102194872;
                                Y5 y56 = ((C2981b6) obj).f30002a;
                                y56.b(C3249g6.b((j20 ^ j21) ^ y56.c().m()));
                                return Optional.empty();
                            case 6:
                                Y5 y57 = ((C2981b6) obj).f30002a;
                                y57.b(C3249g6.b(y57.c().m() | y57.c().m()));
                                return Optional.empty();
                            case 7:
                                Y5 y58 = ((C2981b6) obj).f30002a;
                                y58.b(C3249g6.b(y58.c().m() ^ y58.c().m()));
                                return Optional.empty();
                            case 8:
                                C2981b6 c2981b62 = (C2981b6) obj;
                                try {
                                    long m9 = c2981b62.f30002a.c().m();
                                    C3717or c3717or = c2981b62.f30003b;
                                    R5 r52 = c2981b62.f30004c;
                                    c3717or.b(r52.c(), 0L, r1.f29431b);
                                    r52.b(m9);
                                    return Optional.empty();
                                } catch (P5 | Q5 unused2) {
                                    b52 = B5.f24596L;
                                    return Optional.of(b52);
                                } catch (U5 unused3) {
                                    b52 = B5.f24606V;
                                    return Optional.of(b52);
                                }
                            case 9:
                                C2981b6 c2981b63 = (C2981b6) obj;
                                try {
                                    Y5 y59 = c2981b63.f30002a;
                                    long m10 = y59.c().m();
                                    ArrayList arrayList = (ArrayList) y59.c().o();
                                    int size = arrayList.size();
                                    Object h9 = y59.c().h();
                                    Object l9 = y59.c().l();
                                    if (l9 instanceof Method) {
                                        Method method = (Method) l9;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (h9 instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) h9).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                ArrayList arrayList2 = (ArrayList) ((C3249g6) arrayList.get(0)).o();
                                                if (arrayList2.size() == length) {
                                                    int i9 = 0;
                                                    while (i9 < arrayList2.size()) {
                                                        objArr2[i9] = ((C3249g6) arrayList2.get(i9)).i(parameterTypes2[i9]);
                                                        i9++;
                                                        j10 = j10;
                                                    }
                                                    j6 = j10;
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                j6 = 0;
                                                while (i6 < size) {
                                                    objArr[i6] = ((C3249g6) arrayList.get(i6)).i(parameterTypes[i6]);
                                                    i6++;
                                                }
                                            }
                                            try {
                                                Object invoke = method.invoke(h9, objArr);
                                                c2981b63.f30002a.b((method.getReturnType() == Void.class || method.getReturnType() == cls) ? C3249g6.a(null) : m10 != j6 ? C3249g6.g(invoke) : C3249g6.a(invoke));
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                b52 = B5.f24595K;
                                                return Optional.of(b52);
                                            }
                                        }
                                    }
                                    return Optional.of(B5.J);
                                } catch (C3088d6 unused5) {
                                    b52 = B5.J;
                                }
                                break;
                            case 10:
                                C2981b6 c2981b64 = (C2981b6) obj;
                                Y5 y510 = c2981b64.f30002a;
                                int intExact = Math.toIntExact(y510.c().m());
                                M5 n9 = y510.c().n();
                                M5 n10 = y510.c().n();
                                if (n9.f27037a.length != 16) {
                                    return Optional.of(B5.f24611j0);
                                }
                                int[] iArr = new int[4];
                                ByteBuffer.wrap(n9.a()).asIntBuffer().get(iArr);
                                I1.a aVar = new I1.a(intExact, 5, iArr);
                                byte[] a9 = n10.a();
                                byte[] bArr = new byte[8];
                                int i10 = 0;
                                while (i10 < a9.length) {
                                    if (i10 % 8 != 0) {
                                        if (i10 == 0) {
                                            i10 = 0;
                                        } else {
                                            a9[i10] = (byte) (((a9[i10] ^ bArr[i10 % 8]) << 24) >> 24);
                                            i10++;
                                        }
                                    }
                                    aVar.s(i10 >>> 3, bArr);
                                    a9[i10] = (byte) (((a9[i10] ^ bArr[i10 % 8]) << 24) >> 24);
                                    i10++;
                                }
                                c2981b64.f30002a.b(C3249g6.d(M5.e(a9)));
                                return Optional.empty();
                            case 11:
                                Y5 y511 = ((C2981b6) obj).f30002a;
                                double q8 = y511.c().q();
                                double q9 = y511.c().q();
                                if (q8 == 0.0d) {
                                    b53 = B5.f24609Z;
                                    return Optional.of(b53);
                                }
                                y511.b(C3249g6.c(q9 / q8));
                                return Optional.empty();
                            case 12:
                                Y5 y512 = ((C2981b6) obj).f30002a;
                                long m11 = y512.c().m();
                                long m12 = y512.c().m();
                                if (m11 == 0) {
                                    b53 = B5.f24609Z;
                                    return Optional.of(b53);
                                }
                                y512.b(C3249g6.b(m12 / m11));
                                return Optional.empty();
                            case 13:
                                try {
                                    ((C2981b6) obj).f30002a.c();
                                    return Optional.empty();
                                } catch (W5 unused6) {
                                    b52 = B5.f24605U;
                                    return Optional.of(b52);
                                }
                            case 14:
                                C2981b6 c2981b65 = (C2981b6) obj;
                                long m13 = c2981b65.f30002a.c().m();
                                Y5 y513 = c2981b65.f30002a;
                                y513.b(C3249g6.j(y513.d(m13)));
                                return Optional.empty();
                            case 15:
                                C2981b6 c2981b66 = (C2981b6) obj;
                                long m14 = c2981b66.f30003b.E().f28475b + c2981b66.f30002a.c().m();
                                Y5 y514 = c2981b66.f30002a;
                                y514.b(C3249g6.j(y514.d(-m14)));
                                return Optional.empty();
                            case 16:
                                C2981b6 c2981b67 = (C2981b6) obj;
                                long h10 = c2981b67.f30003b.E().f28475b + c2981b67.f30004c.h();
                                Y5 y515 = c2981b67.f30002a;
                                y515.b(C3249g6.j(y515.d(-h10)));
                                return Optional.empty();
                            case 17:
                                try {
                                    Y5 y516 = ((C2981b6) obj).f30002a;
                                    if (new C3034c6(true).compare(y516.c(), y516.c()) != 0) {
                                        j9 = 0;
                                    }
                                    y516.b(C3249g6.b(j9));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    b52 = B5.f24617x;
                                    return Optional.of(b52);
                                }
                            case 18:
                                try {
                                    Y5 y517 = ((C2981b6) obj).f30002a;
                                    String c9 = y517.c().n().c();
                                    switch (c9.hashCode()) {
                                        case -1325958191:
                                            if (c9.equals("double")) {
                                                cls = Double.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c9);
                                            break;
                                        case 104431:
                                            if (c9.equals("int")) {
                                                cls = Integer.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c9);
                                            break;
                                        case 3039496:
                                            if (c9.equals("byte")) {
                                                cls = Byte.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c9);
                                            break;
                                        case 3052374:
                                            if (c9.equals("char")) {
                                                cls = Character.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c9);
                                            break;
                                        case 3327612:
                                            if (c9.equals("long")) {
                                                cls = Long.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c9);
                                            break;
                                        case 3625364:
                                            break;
                                        case 64711720:
                                            if (c9.equals("boolean")) {
                                                cls = Boolean.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c9);
                                            break;
                                        case 97526364:
                                            if (c9.equals("float")) {
                                                cls = Float.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c9);
                                            break;
                                        case 109413500:
                                            if (c9.equals("short")) {
                                                cls = Short.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c9);
                                            break;
                                        default:
                                            cls = Class.forName(c9);
                                            break;
                                    }
                                    y517.b(C3249g6.a(cls));
                                    return Optional.empty();
                                } catch (C3088d6 unused8) {
                                    b52 = B5.f24591F;
                                    return Optional.of(b52);
                                } catch (ClassNotFoundException unused9) {
                                    b52 = B5.f24592G;
                                    return Optional.of(b52);
                                }
                            case 19:
                                try {
                                    Y5 y518 = ((C2981b6) obj).f30002a;
                                    ArrayList arrayList3 = (ArrayList) y518.c().o();
                                    Class<?>[] clsArr = new Class[arrayList3.size()];
                                    while (true) {
                                        if (i6 < arrayList3.size()) {
                                            Object l10 = ((C3249g6) arrayList3.get(i6)).l();
                                            if (l10 instanceof Class) {
                                                clsArr[i6] = (Class) l10;
                                                i6++;
                                            } else {
                                                b54 = B5.f24593H;
                                            }
                                        } else {
                                            String c10 = y518.c().n().c();
                                            Object l11 = y518.c().l();
                                            if (l11 instanceof Class) {
                                                y518.b(C3249g6.a(((Class) l11).getMethod(c10, clsArr)));
                                                return Optional.empty();
                                            }
                                            b54 = B5.f24593H;
                                        }
                                    }
                                    return Optional.of(b54);
                                } catch (C3088d6 unused10) {
                                    b52 = B5.f24593H;
                                    return Optional.of(b52);
                                } catch (NoSuchMethodException unused11) {
                                    b52 = B5.f24594I;
                                    return Optional.of(b52);
                                } catch (SecurityException unused12) {
                                    b52 = B5.f24607W;
                                    return Optional.of(b52);
                                }
                            default:
                                Y5 y519 = ((C2981b6) obj).f30002a;
                                long m15 = y519.c().m();
                                C3249g6 c11 = y519.c();
                                C3249g6 c12 = y519.c();
                                int i11 = c12.f31290g;
                                int i12 = i11 - 1;
                                if (i11 == 0) {
                                    throw null;
                                }
                                if (i12 == 3) {
                                    M5 n11 = c12.n();
                                    if (m15 < 0) {
                                        m15 += n11.f27037a.length;
                                    }
                                    if (c11.f31290g != 4) {
                                        throw new C3088d6();
                                    }
                                    if (m15 >= 0 && m15 < n11.f27037a.length) {
                                        char charAt = n11.c().charAt((int) m15);
                                        StringBuilder sb = new StringBuilder(String.valueOf(charAt).length());
                                        sb.append(charAt);
                                        c11 = C3249g6.d(M5.e(sb.toString().getBytes(Charset.forName(L5.a("Hn2H4l0=")))));
                                    }
                                } else {
                                    if (i12 != 4) {
                                        throw new C3088d6();
                                    }
                                    List o4 = c12.o();
                                    if (m15 < 0) {
                                        m15 += ((ArrayList) o4).size();
                                    }
                                    if (m15 >= 0) {
                                        ArrayList arrayList4 = (ArrayList) o4;
                                        if (m15 < arrayList4.size()) {
                                            c11 = (C3249g6) arrayList4.get((int) m15);
                                        }
                                    }
                                }
                                y519.b(c11);
                                return Optional.empty();
                        }
                    } catch (X5 e9) {
                        throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e9);
                    }
                } catch (W5 unused13) {
                    b52 = B5.f24619z;
                }
            } catch (O5 | Q5 | C3088d6 unused14) {
                b52 = B5.f24603S;
            }
        } catch (V5 | W5 unused15) {
            b52 = B5.f24602R;
        }
    }
}
