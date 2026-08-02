package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* loaded from: classes2.dex */
public final /* synthetic */ class K5 implements Z5 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ K5 f26601b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ K5 f26602c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ K5 f26603d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ K5 f26604e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ K5 f26605f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ K5 f26606g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ K5 f26607h;
    public static final /* synthetic */ K5 i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ K5 f26608j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ K5 f26609k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ K5 f26610l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ K5 f26611m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ K5 f26612n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ K5 f26613o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ K5 f26614p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ K5 f26615q;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26616a;

    static {
        int i4 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i6 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i9 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i10 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i11 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i12 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i13 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i14 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i15 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i16 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i17 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i18 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        f26615q = new K5((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        f26614p = new K5((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        f26613o = new K5(i18);
        f26612n = new K5(i9);
        f26611m = new K5(i10);
        f26610l = new K5(i11);
        f26609k = new K5(i6);
        f26608j = new K5(i12);
        i = new K5(i13);
        f26607h = new K5(i14);
        f26606g = new K5(i4);
        f26605f = new K5(i15);
        f26604e = new K5(i16);
        f26603d = new K5(i17);
        f26602c = new K5(1);
        f26601b = new K5(0);
    }

    public /* synthetic */ K5(int i4) {
        this.f26616a = i4;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        B5 b52;
        C3249g6 c3249g6;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.f26616a) {
                                case 0:
                                    return ((C2981b6) obj).a();
                                case 1:
                                    try {
                                        Y5 y52 = ((C2981b6) obj).f30002a;
                                        long m9 = y52.c().m();
                                        C3249g6 c9 = y52.c();
                                        List o4 = c9.o();
                                        if (m9 < 0) {
                                            m9 += ((ArrayList) o4).size();
                                        }
                                        if (m9 >= 0) {
                                            ArrayList arrayList = (ArrayList) o4;
                                            if (m9 < arrayList.size()) {
                                                arrayList.remove((int) m9);
                                                y52.b(c9);
                                                return Optional.empty();
                                            }
                                        }
                                        throw new C3141e6();
                                    } catch (C3141e6 unused) {
                                        b52 = B5.f24612k0;
                                        break;
                                    }
                                case 2:
                                    C2981b6 c2981b6 = (C2981b6) obj;
                                    Y5 y53 = c2981b6.f30002a;
                                    C3249g6 c10 = y53.c();
                                    M5 n9 = y53.c().n();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    c10.k(byteArrayOutputStream);
                                    c2981b6.f30002a.b(C3249g6.d(n9.d(M5.e(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    C2981b6 c2981b62 = (C2981b6) obj;
                                    Y5 y54 = c2981b62.f30002a;
                                    C3249g6 c11 = y54.c();
                                    M5 n10 = y54.c().n();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    V2.u(c11.m(), new Qx(6, byteArrayOutputStream2), false);
                                    c2981b62.f30002a.b(C3249g6.d(n10.d(M5.e(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    C2981b6 c2981b63 = (C2981b6) obj;
                                    R5 r52 = c2981b63.f30004c;
                                    Y5 y55 = c2981b63.f30002a;
                                    y55.f29430a.set(y55.a(-(c2981b63.f30003b.E().f28475b + r52.h())), y55.c());
                                    return Optional.empty();
                                case 5:
                                    Y5 y56 = ((C2981b6) obj).f30002a;
                                    y56.b(C3249g6.b(y56.c().m() << ((int) y56.c().m())));
                                    return Optional.empty();
                                case 6:
                                    Y5 y57 = ((C2981b6) obj).f30002a;
                                    y57.b(C3249g6.b(y57.c().m() >>> ((int) y57.c().m())));
                                    return Optional.empty();
                                case 7:
                                    Y5 y58 = ((C2981b6) obj).f30002a;
                                    y58.b(C3249g6.c(y58.c().q() - y58.c().q()));
                                    return Optional.empty();
                                case 8:
                                    Y5 y59 = ((C2981b6) obj).f30002a;
                                    y59.b(C3249g6.b(y59.c().m() - y59.c().m()));
                                    return Optional.empty();
                                case 9:
                                    C2981b6 c2981b64 = (C2981b6) obj;
                                    Y5 y510 = c2981b64.f30002a;
                                    long m10 = y510.c().m();
                                    C3249g6 c12 = y510.c();
                                    Y5 y511 = c2981b64.f30002a;
                                    C3249g6 d9 = y511.d(m10);
                                    y511.f29430a.set(y511.a(m10), c12);
                                    y511.b(d9);
                                    return Optional.empty();
                                case 10:
                                    C2981b6 c2981b65 = (C2981b6) obj;
                                    Y5 y512 = c2981b65.f30002a;
                                    long m11 = c2981b65.f30003b.E().f28475b + y512.c().m();
                                    C3249g6 c13 = y512.c();
                                    Y5 y513 = c2981b65.f30002a;
                                    long j6 = -m11;
                                    C3249g6 d10 = y513.d(j6);
                                    y513.f29430a.set(y513.a(j6), c13);
                                    y513.b(d10);
                                    return Optional.empty();
                                case 11:
                                    C2981b6 c2981b66 = (C2981b6) obj;
                                    R5 r53 = c2981b66.f30004c;
                                    Y5 y514 = c2981b66.f30002a;
                                    long h3 = c2981b66.f30003b.E().f28475b + r53.h();
                                    C3249g6 c14 = y514.c();
                                    long j9 = -h3;
                                    C3249g6 d11 = y514.d(j9);
                                    y514.f29430a.set(y514.a(j9), c14);
                                    y514.b(d11);
                                    return Optional.empty();
                                case 12:
                                    C2981b6 c2981b67 = (C2981b6) obj;
                                    long m12 = c2981b67.f30002a.c().m();
                                    try {
                                        Y5 y515 = c2981b67.f30002a;
                                        if (m12 == 0) {
                                            c3249g6 = y515.c();
                                        } else {
                                            y515.f29431b--;
                                            c3249g6 = (C3249g6) y515.f29430a.remove(y515.a(m12));
                                        }
                                        y515.b(c3249g6);
                                        return Optional.empty();
                                    } catch (W5 unused2) {
                                        b52 = B5.f24586A;
                                        break;
                                    }
                                case 13:
                                    C2981b6 c2981b68 = (C2981b6) obj;
                                    try {
                                        Y5 y516 = c2981b68.f30002a;
                                        long m13 = y516.c().m();
                                        long m14 = y516.c().m();
                                        C3717or c3717or = c2981b68.f30003b;
                                        R5 r54 = c2981b68.f30004c;
                                        c3717or.b(r54.c(), m14, c3717or.E().f28475b);
                                        r54.b(m13);
                                        return Optional.empty();
                                    } catch (P5 | Q5 unused3) {
                                        b52 = B5.f24596L;
                                        break;
                                    } catch (U5 unused4) {
                                        b52 = B5.f24606V;
                                        break;
                                    } catch (V5 unused5) {
                                        b52 = B5.f24601Q;
                                        break;
                                    }
                                case 14:
                                    C2981b6 c2981b69 = (C2981b6) obj;
                                    try {
                                        c2981b69.f30002a.b(C3249g6.g(c2981b69.f30002a.c().l()));
                                        return Optional.empty();
                                    } catch (C3088d6 unused6) {
                                        b52 = B5.J;
                                        break;
                                    }
                                default:
                                    try {
                                        Y5 y517 = ((C2981b6) obj).f30002a;
                                        Iterator it = ((ArrayList) y517.c().o()).iterator();
                                        while (it.hasNext()) {
                                            y517.b((C3249g6) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (X5 unused7) {
                                        b52 = B5.f24614u;
                                        break;
                                    }
                            }
                        } catch (V5 | W5 unused8) {
                            b52 = B5.f24602R;
                        }
                    } catch (O5 | Q5 | C3088d6 unused9) {
                        b52 = B5.f24603S;
                    }
                } catch (X5 e9) {
                    e = e9;
                    throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                }
            } catch (W5 unused10) {
                b52 = B5.f24587B;
            }
        } catch (C3088d6 unused11) {
            b52 = B5.f24590E;
        } catch (IOException e10) {
            e = e10;
            throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
        }
        return Optional.of(b52);
    }
}
