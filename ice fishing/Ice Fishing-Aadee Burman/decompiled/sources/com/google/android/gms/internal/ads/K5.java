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
    public static final /* synthetic */ K5 f25849b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ K5 f25850c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ K5 f25851d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ K5 f25852e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ K5 f25853f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ K5 f25854g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ K5 f25855h;
    public static final /* synthetic */ K5 i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ K5 f25856j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ K5 f25857k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ K5 f25858l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ K5 f25859m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ K5 f25860n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ K5 f25861o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ K5 f25862p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ K5 f25863q;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25864a;

    static {
        int i6 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i9 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i10 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i11 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i12 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i13 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i14 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i15 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i16 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i17 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i18 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i19 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        f25863q = new K5((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        f25862p = new K5((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        f25861o = new K5(i19);
        f25860n = new K5(i10);
        f25859m = new K5(i11);
        f25858l = new K5(i12);
        f25857k = new K5(i9);
        f25856j = new K5(i13);
        i = new K5(i14);
        f25855h = new K5(i15);
        f25854g = new K5(i6);
        f25853f = new K5(i16);
        f25852e = new K5(i17);
        f25851d = new K5(i18);
        f25850c = new K5(1);
        f25849b = new K5(0);
    }

    public /* synthetic */ K5(int i6) {
        this.f25864a = i6;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        B5 b52;
        C3226g6 c3226g6;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.f25864a) {
                                case 0:
                                    return ((C2958b6) obj).a();
                                case 1:
                                    try {
                                        Y5 y52 = ((C2958b6) obj).f29214a;
                                        long m4 = y52.c().m();
                                        C3226g6 c9 = y52.c();
                                        List o6 = c9.o();
                                        if (m4 < 0) {
                                            m4 += ((ArrayList) o6).size();
                                        }
                                        if (m4 >= 0) {
                                            ArrayList arrayList = (ArrayList) o6;
                                            if (m4 < arrayList.size()) {
                                                arrayList.remove((int) m4);
                                                y52.b(c9);
                                                return Optional.empty();
                                            }
                                        }
                                        throw new C3118e6();
                                    } catch (C3118e6 unused) {
                                        b52 = B5.f23840p0;
                                        break;
                                    }
                                case 2:
                                    C2958b6 c2958b6 = (C2958b6) obj;
                                    Y5 y53 = c2958b6.f29214a;
                                    C3226g6 c10 = y53.c();
                                    M5 n9 = y53.c().n();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    c10.k(byteArrayOutputStream);
                                    c2958b6.f29214a.b(C3226g6.d(n9.d(M5.e(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    C2958b6 c2958b62 = (C2958b6) obj;
                                    Y5 y54 = c2958b62.f29214a;
                                    C3226g6 c11 = y54.c();
                                    M5 n10 = y54.c().n();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    V2.u(c11.m(), new Qx(6, byteArrayOutputStream2), false);
                                    c2958b62.f29214a.b(C3226g6.d(n10.d(M5.e(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    C2958b6 c2958b63 = (C2958b6) obj;
                                    R5 r52 = c2958b63.f29216c;
                                    Y5 y55 = c2958b63.f29214a;
                                    y55.f28653a.set(y55.a(-(c2958b63.f29215b.E().f27692b + r52.h())), y55.c());
                                    return Optional.empty();
                                case 5:
                                    Y5 y56 = ((C2958b6) obj).f29214a;
                                    y56.b(C3226g6.b(y56.c().m() << ((int) y56.c().m())));
                                    return Optional.empty();
                                case 6:
                                    Y5 y57 = ((C2958b6) obj).f29214a;
                                    y57.b(C3226g6.b(y57.c().m() >>> ((int) y57.c().m())));
                                    return Optional.empty();
                                case 7:
                                    Y5 y58 = ((C2958b6) obj).f29214a;
                                    y58.b(C3226g6.c(y58.c().q() - y58.c().q()));
                                    return Optional.empty();
                                case 8:
                                    Y5 y59 = ((C2958b6) obj).f29214a;
                                    y59.b(C3226g6.b(y59.c().m() - y59.c().m()));
                                    return Optional.empty();
                                case 9:
                                    C2958b6 c2958b64 = (C2958b6) obj;
                                    Y5 y510 = c2958b64.f29214a;
                                    long m9 = y510.c().m();
                                    C3226g6 c12 = y510.c();
                                    Y5 y511 = c2958b64.f29214a;
                                    C3226g6 d2 = y511.d(m9);
                                    y511.f28653a.set(y511.a(m9), c12);
                                    y511.b(d2);
                                    return Optional.empty();
                                case 10:
                                    C2958b6 c2958b65 = (C2958b6) obj;
                                    Y5 y512 = c2958b65.f29214a;
                                    long m10 = c2958b65.f29215b.E().f27692b + y512.c().m();
                                    C3226g6 c13 = y512.c();
                                    Y5 y513 = c2958b65.f29214a;
                                    long j6 = -m10;
                                    C3226g6 d9 = y513.d(j6);
                                    y513.f28653a.set(y513.a(j6), c13);
                                    y513.b(d9);
                                    return Optional.empty();
                                case 11:
                                    C2958b6 c2958b66 = (C2958b6) obj;
                                    R5 r53 = c2958b66.f29216c;
                                    Y5 y514 = c2958b66.f29214a;
                                    long h9 = c2958b66.f29215b.E().f27692b + r53.h();
                                    C3226g6 c14 = y514.c();
                                    long j9 = -h9;
                                    C3226g6 d10 = y514.d(j9);
                                    y514.f28653a.set(y514.a(j9), c14);
                                    y514.b(d10);
                                    return Optional.empty();
                                case 12:
                                    C2958b6 c2958b67 = (C2958b6) obj;
                                    long m11 = c2958b67.f29214a.c().m();
                                    try {
                                        Y5 y515 = c2958b67.f29214a;
                                        if (m11 == 0) {
                                            c3226g6 = y515.c();
                                        } else {
                                            y515.f28654b--;
                                            c3226g6 = (C3226g6) y515.f28653a.remove(y515.a(m11));
                                        }
                                        y515.b(c3226g6);
                                        return Optional.empty();
                                    } catch (W5 unused2) {
                                        b52 = B5.f23814A;
                                        break;
                                    }
                                case 13:
                                    C2958b6 c2958b68 = (C2958b6) obj;
                                    try {
                                        Y5 y516 = c2958b68.f29214a;
                                        long m12 = y516.c().m();
                                        long m13 = y516.c().m();
                                        C3694or c3694or = c2958b68.f29215b;
                                        R5 r54 = c2958b68.f29216c;
                                        c3694or.b(r54.c(), m13, c3694or.E().f27692b);
                                        r54.b(m12);
                                        return Optional.empty();
                                    } catch (P5 | Q5 unused3) {
                                        b52 = B5.f23824L;
                                        break;
                                    } catch (U5 unused4) {
                                        b52 = B5.f23834V;
                                        break;
                                    } catch (V5 unused5) {
                                        b52 = B5.f23829Q;
                                        break;
                                    }
                                case 14:
                                    C2958b6 c2958b69 = (C2958b6) obj;
                                    try {
                                        c2958b69.f29214a.b(C3226g6.g(c2958b69.f29214a.c().l()));
                                        return Optional.empty();
                                    } catch (C3065d6 unused6) {
                                        b52 = B5.J;
                                        break;
                                    }
                                default:
                                    try {
                                        Y5 y517 = ((C2958b6) obj).f29214a;
                                        Iterator it = ((ArrayList) y517.c().o()).iterator();
                                        while (it.hasNext()) {
                                            y517.b((C3226g6) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (X5 unused7) {
                                        b52 = B5.f23843u;
                                        break;
                                    }
                            }
                        } catch (V5 | W5 unused8) {
                            b52 = B5.f23830R;
                        }
                    } catch (O5 | Q5 | C3065d6 unused9) {
                        b52 = B5.f23831S;
                    }
                } catch (X5 e9) {
                    e = e9;
                    throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                }
            } catch (W5 unused10) {
                b52 = B5.f23815B;
            }
        } catch (C3065d6 unused11) {
            b52 = B5.f23818E;
        } catch (IOException e10) {
            e = e10;
            throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
        }
        return Optional.of(b52);
    }
}
