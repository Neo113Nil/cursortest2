package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* loaded from: classes2.dex */
public final /* synthetic */ class H5 implements W5 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ H5 f25288b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ H5 f25289c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ H5 f25290d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ H5 f25291e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ H5 f25292f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ H5 f25293g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ H5 f25294h;
    public static final /* synthetic */ H5 i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ H5 f25295j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ H5 f25296k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ H5 f25297l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ H5 f25298m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ H5 f25299n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ H5 f25300o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ H5 f25301p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ H5 f25302q;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25303a;

    static {
        int i4 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
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
        f25302q = new H5((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        f25301p = new H5((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        f25300o = new H5(i19);
        f25299n = new H5(i10);
        f25298m = new H5(i11);
        f25297l = new H5(i12);
        f25296k = new H5(i9);
        f25295j = new H5(i13);
        i = new H5(i14);
        f25294h = new H5(i15);
        f25293g = new H5(i4);
        f25292f = new H5(i16);
        f25291e = new H5(i17);
        f25290d = new H5(i18);
        f25289c = new H5(1);
        f25288b = new H5(0);
    }

    public /* synthetic */ H5(int i4) {
        this.f25303a = i4;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        EnumC4261z5 enumC4261z5;
        C3020c6 c3020c6;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.f25303a) {
                                case 0:
                                    return ((Y5) obj).a();
                                case 1:
                                    try {
                                        V5 v52 = ((Y5) obj).f28787a;
                                        long m8 = v52.c().m();
                                        C3020c6 c4 = v52.c();
                                        List o9 = c4.o();
                                        if (m8 < 0) {
                                            m8 += ((ArrayList) o9).size();
                                        }
                                        if (m8 >= 0) {
                                            ArrayList arrayList = (ArrayList) o9;
                                            if (m8 < arrayList.size()) {
                                                arrayList.remove((int) m8);
                                                v52.b(c4);
                                                return Optional.empty();
                                            }
                                        }
                                        throw new C2966b6();
                                    } catch (C2966b6 unused) {
                                        enumC4261z5 = EnumC4261z5.f35470p0;
                                        break;
                                    }
                                case 2:
                                    Y5 y52 = (Y5) obj;
                                    V5 v53 = y52.f28787a;
                                    C3020c6 c9 = v53.c();
                                    J5 n9 = v53.c().n();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    c9.k(byteArrayOutputStream);
                                    y52.f28787a.b(C3020c6.d(n9.d(J5.e(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    Y5 y53 = (Y5) obj;
                                    V5 v54 = y53.f28787a;
                                    C3020c6 c10 = v54.c();
                                    J5 n10 = v54.c().n();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    T2.u(c10.m(), new Rx(6, byteArrayOutputStream2), false);
                                    y53.f28787a.b(C3020c6.d(n10.d(J5.e(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    Y5 y54 = (Y5) obj;
                                    O5 o52 = y54.f28789c;
                                    V5 v55 = y54.f28787a;
                                    v55.f28210a.set(v55.a(-(y54.f28788b.E().f27116b + o52.g())), v55.c());
                                    return Optional.empty();
                                case 5:
                                    V5 v56 = ((Y5) obj).f28787a;
                                    v56.b(C3020c6.b(v56.c().m() << ((int) v56.c().m())));
                                    return Optional.empty();
                                case 6:
                                    V5 v57 = ((Y5) obj).f28787a;
                                    v57.b(C3020c6.b(v57.c().m() >>> ((int) v57.c().m())));
                                    return Optional.empty();
                                case 7:
                                    V5 v58 = ((Y5) obj).f28787a;
                                    v58.b(C3020c6.c(v58.c().q() - v58.c().q()));
                                    return Optional.empty();
                                case 8:
                                    V5 v59 = ((Y5) obj).f28787a;
                                    v59.b(C3020c6.b(v59.c().m() - v59.c().m()));
                                    return Optional.empty();
                                case 9:
                                    Y5 y55 = (Y5) obj;
                                    V5 v510 = y55.f28787a;
                                    long m9 = v510.c().m();
                                    C3020c6 c11 = v510.c();
                                    V5 v511 = y55.f28787a;
                                    C3020c6 d2 = v511.d(m9);
                                    v511.f28210a.set(v511.a(m9), c11);
                                    v511.b(d2);
                                    return Optional.empty();
                                case 10:
                                    Y5 y56 = (Y5) obj;
                                    V5 v512 = y56.f28787a;
                                    long m10 = y56.f28788b.E().f27116b + v512.c().m();
                                    C3020c6 c12 = v512.c();
                                    V5 v513 = y56.f28787a;
                                    long j9 = -m10;
                                    C3020c6 d3 = v513.d(j9);
                                    v513.f28210a.set(v513.a(j9), c12);
                                    v513.b(d3);
                                    return Optional.empty();
                                case 11:
                                    Y5 y57 = (Y5) obj;
                                    O5 o53 = y57.f28789c;
                                    V5 v514 = y57.f28787a;
                                    long g9 = y57.f28788b.E().f27116b + o53.g();
                                    C3020c6 c13 = v514.c();
                                    long j10 = -g9;
                                    C3020c6 d9 = v514.d(j10);
                                    v514.f28210a.set(v514.a(j10), c13);
                                    v514.b(d9);
                                    return Optional.empty();
                                case 12:
                                    Y5 y58 = (Y5) obj;
                                    long m11 = y58.f28787a.c().m();
                                    try {
                                        V5 v515 = y58.f28787a;
                                        if (m11 == 0) {
                                            c3020c6 = v515.c();
                                        } else {
                                            v515.f28211b--;
                                            c3020c6 = (C3020c6) v515.f28210a.remove(v515.a(m11));
                                        }
                                        v515.b(c3020c6);
                                        return Optional.empty();
                                    } catch (T5 unused2) {
                                        enumC4261z5 = EnumC4261z5.f35444A;
                                        break;
                                    }
                                case 13:
                                    Y5 y59 = (Y5) obj;
                                    try {
                                        V5 v516 = y59.f28787a;
                                        long m12 = v516.c().m();
                                        long m13 = v516.c().m();
                                        C3761pr c3761pr = y59.f28788b;
                                        O5 o54 = y59.f28789c;
                                        c3761pr.z(o54.c(), m13, c3761pr.E().f27116b);
                                        o54.a(m12);
                                        return Optional.empty();
                                    } catch (M5 | N5 unused3) {
                                        enumC4261z5 = EnumC4261z5.f35454L;
                                        break;
                                    } catch (R5 unused4) {
                                        enumC4261z5 = EnumC4261z5.f35464V;
                                        break;
                                    } catch (S5 unused5) {
                                        enumC4261z5 = EnumC4261z5.f35459Q;
                                        break;
                                    }
                                case 14:
                                    Y5 y510 = (Y5) obj;
                                    try {
                                        y510.f28787a.b(C3020c6.g(y510.f28787a.c().l()));
                                        return Optional.empty();
                                    } catch (C2911a6 unused6) {
                                        enumC4261z5 = EnumC4261z5.J;
                                        break;
                                    }
                                default:
                                    try {
                                        V5 v517 = ((Y5) obj).f28787a;
                                        Iterator it = ((ArrayList) v517.c().o()).iterator();
                                        while (it.hasNext()) {
                                            v517.b((C3020c6) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (U5 unused7) {
                                        enumC4261z5 = EnumC4261z5.f35473u;
                                        break;
                                    }
                            }
                        } catch (T5 unused8) {
                            enumC4261z5 = EnumC4261z5.f35445B;
                        }
                    } catch (S5 | T5 unused9) {
                        enumC4261z5 = EnumC4261z5.f35460R;
                    }
                } catch (U5 e6) {
                    e = e6;
                    throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e);
                }
            } catch (L5 | N5 | C2911a6 unused10) {
                enumC4261z5 = EnumC4261z5.f35461S;
            }
        } catch (C2911a6 unused11) {
            enumC4261z5 = EnumC4261z5.f35448E;
        } catch (IOException e9) {
            e = e9;
            throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e);
        }
        return Optional.of(enumC4261z5);
    }
}
