package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.address.address_map_picker.ui.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public final /* synthetic */ class t01 implements zls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tls b;
    public final /* synthetic */ b31 c;

    public /* synthetic */ t01(b31 b31Var, tls tlsVar) {
        this.c = b31Var;
        this.b = tlsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g43 g43Var = lr20.c;
        c530 c530Var = c530.a;
        Object obj4 = did.a;
        final b31 b31Var = this.c;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                boolean V = btsVar.V(intValue & 1, (intValue & 17) != 16);
                dmw0 dmw0Var = btsVar.a;
                if (V) {
                    Object Q = btsVar.Q();
                    if (Q == obj4) {
                        Q = new j01(2);
                        btsVar.o0(Q);
                    }
                    f530 b = fnq0.b(c530Var, false, (tls) Q);
                    sic a = qic.a(g43Var, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, b);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar, wlsVar, a);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar, wlsVar2, o);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar, wlsVar3, valueOf);
                    tls tlsVar = d.h;
                    qje.M(btsVar, tlsVar);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar, wlsVar4, d);
                    String str = b31Var.k;
                    tls tlsVar2 = this.b;
                    if (str == null) {
                        btsVar.e0(1764885038);
                        btsVar.t(false);
                        r2 = 1;
                    } else {
                        btsVar.e0(1764885039);
                        Object Q2 = btsVar.Q();
                        if (Q2 == obj4) {
                            Q2 = new j01(3);
                            btsVar.o0(Q2);
                        }
                        f530 b2 = fnq0.b(c530Var, false, (tls) Q2);
                        z910 d2 = pi6.d(x4c.b, false);
                        int hashCode2 = Long.hashCode(btsVar.T);
                        r1b0 o2 = btsVar.o();
                        f530 d3 = b.d(btsVar, b2);
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, wlsVar, d2);
                        qje.W(btsVar, wlsVar2, o2);
                        vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
                        qje.W(btsVar, wlsVar4, d3);
                        String str2 = b31Var.l;
                        if (str2 == null) {
                            str2 = "";
                        }
                        a.e(str, str2, tlsVar2, btsVar, 0);
                        r2 = 1;
                        btsVar.t(true);
                        btsVar.t(false);
                    }
                    rab1.b(null, wwg.S(1413645954, r2, new sg0(r2, tlsVar2), btsVar), null, null, null, wwg.S(1511125246, r2, new q0v(5, b31Var, tlsVar2), btsVar), null, btsVar, 196656, 93);
                    btsVar.t(r2);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                boolean V2 = btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16);
                dmw0 dmw0Var2 = btsVar2.a;
                if (!V2) {
                    btsVar2.Y();
                    return zy11Var;
                }
                tls tlsVar3 = this.b;
                boolean k = btsVar2.k(tlsVar3);
                Object Q3 = btsVar2.Q();
                if (k || Q3 == obj4) {
                    Q3 = new a0(3, tlsVar3);
                    btsVar2.o0(Q3);
                }
                f530 c = ljs0.c(eja1.y(c530Var, (tls) Q3), 1.0f);
                sic a2 = qic.a(g43Var, x4c.G, btsVar2, 0);
                int hashCode3 = Long.hashCode(btsVar2.T);
                r1b0 o3 = btsVar2.o();
                f530 d4 = b.d(btsVar2, c);
                ohd.G1.getClass();
                sls slsVar2 = d.b;
                if (dmw0Var2 == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar2);
                } else {
                    btsVar2.r0();
                }
                wls wlsVar5 = d.f;
                qje.W(btsVar2, wlsVar5, a2);
                wls wlsVar6 = d.e;
                qje.W(btsVar2, wlsVar6, o3);
                Integer valueOf2 = Integer.valueOf(hashCode3);
                wls wlsVar7 = d.g;
                qje.W(btsVar2, wlsVar7, valueOf2);
                tls tlsVar4 = d.h;
                qje.M(btsVar2, tlsVar4);
                wls wlsVar8 = d.d;
                qje.W(btsVar2, wlsVar8, d4);
                f530 n = an91.n(c530Var, 16.0f, 20.0f, 16.0f, 12.0f);
                Object Q4 = btsVar2.Q();
                if (Q4 == obj4) {
                    Q4 = new j01(1);
                    btsVar2.o0(Q4);
                }
                jeb1.f(b31Var.b, fnq0.b(n, false, (tls) Q4), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).e.d, btsVar2, 0, 0, 16380);
                final int i2 = 0;
                epa1.a(b31Var.c, b31Var.d, b31Var.e, b31Var.f, b31Var.a, tlsVar3, wwg.S(846947896, true, new zls() { // from class: s01
                    @Override // defpackage.zls
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i3 = i2;
                        zy11 zy11Var2 = zy11.a;
                        b31 b31Var2 = b31Var;
                        switch (i3) {
                            case 0:
                                ibp0 ibp0Var = (ibp0) obj5;
                                fid fidVar3 = (fid) obj6;
                                int intValue3 = ((Integer) obj7).intValue();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    udb1.c(ibp0Var, b31Var2.m ? y9b1.b() : u2b1.a(), null, null, btsVar3, intValue3 & 14, 14);
                                    break;
                                }
                            case 1:
                                fid fidVar4 = (fid) obj6;
                                int intValue4 = ((Integer) obj7).intValue();
                                bts btsVar4 = (bts) fidVar4;
                                if (!btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    jeb1.f(b31Var2.g, an91.m(c530.a, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.e(btsVar4).g.b, btsVar4, 805306416, 48, 13820);
                                    break;
                                }
                            default:
                                fid fidVar5 = (fid) obj6;
                                int intValue5 = ((Integer) obj7).intValue();
                                bts btsVar5 = (bts) fidVar5;
                                if (!btsVar5.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                                    btsVar5.Y();
                                    break;
                                } else {
                                    sya1.a(y9b1.b(), null, ((hfp) b31Var2.j).a, null, btsVar5, 0, 10);
                                    break;
                                }
                        }
                        return zy11Var2;
                    }
                }, btsVar2), btsVar2, 12582912);
                f530 k2 = an91.k(ljs0.c(c530Var, 1.0f), 8.0f);
                lhl0 a3 = khl0.a(new i43(4.0f, true, new quz(11)), x4c.E, btsVar2, 54);
                int hashCode4 = Long.hashCode(btsVar2.T);
                r1b0 o4 = btsVar2.o();
                f530 d5 = b.d(btsVar2, k2);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar2);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar5, a3);
                qje.W(btsVar2, wlsVar6, o4);
                vfc.v(hashCode4, btsVar2, wlsVar7, btsVar2, tlsVar4);
                x2y d6 = n.d(btsVar2, d5, wlsVar8, 1.0f, true);
                boolean k3 = btsVar2.k(tlsVar3);
                Object Q5 = btsVar2.Q();
                if (k3 || Q5 == obj4) {
                    Q5 = new o0(12, tlsVar3);
                    btsVar2.o0(Q5);
                }
                final int i3 = 1;
                ohb1.b(d6, false, null, (sls) Q5, wwg.S(-1987942862, true, new zls() { // from class: s01
                    @Override // defpackage.zls
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i32 = i3;
                        zy11 zy11Var2 = zy11.a;
                        b31 b31Var2 = b31Var;
                        switch (i32) {
                            case 0:
                                ibp0 ibp0Var = (ibp0) obj5;
                                fid fidVar3 = (fid) obj6;
                                int intValue3 = ((Integer) obj7).intValue();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    udb1.c(ibp0Var, b31Var2.m ? y9b1.b() : u2b1.a(), null, null, btsVar3, intValue3 & 14, 14);
                                    break;
                                }
                            case 1:
                                fid fidVar4 = (fid) obj6;
                                int intValue4 = ((Integer) obj7).intValue();
                                bts btsVar4 = (bts) fidVar4;
                                if (!btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    jeb1.f(b31Var2.g, an91.m(c530.a, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.e(btsVar4).g.b, btsVar4, 805306416, 48, 13820);
                                    break;
                                }
                            default:
                                fid fidVar5 = (fid) obj6;
                                int intValue5 = ((Integer) obj7).intValue();
                                bts btsVar5 = (bts) fidVar5;
                                if (!btsVar5.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                                    btsVar5.Y();
                                    break;
                                } else {
                                    sya1.a(y9b1.b(), null, ((hfp) b31Var2.j).a, null, btsVar5, 0, 10);
                                    break;
                                }
                        }
                        return zy11Var2;
                    }
                }, btsVar2), btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                if (b31Var.j instanceof hfp) {
                    btsVar2.e0(-1972706740);
                    boolean k4 = btsVar2.k(tlsVar3);
                    Object Q6 = btsVar2.Q();
                    if (k4 || Q6 == obj4) {
                        Q6 = new o0(13, tlsVar3);
                        btsVar2.o0(Q6);
                    }
                    sls slsVar3 = (sls) Q6;
                    final int i4 = 2;
                    ulb1.a(null, false, null, slsVar3, wwg.S(-638390661, true, new zls() { // from class: s01
                        @Override // defpackage.zls
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i32 = i4;
                            zy11 zy11Var2 = zy11.a;
                            b31 b31Var2 = b31Var;
                            switch (i32) {
                                case 0:
                                    ibp0 ibp0Var = (ibp0) obj5;
                                    fid fidVar3 = (fid) obj6;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    if ((intValue3 & 6) == 0) {
                                        intValue3 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                                    }
                                    bts btsVar3 = (bts) fidVar3;
                                    if (!btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        udb1.c(ibp0Var, b31Var2.m ? y9b1.b() : u2b1.a(), null, null, btsVar3, intValue3 & 14, 14);
                                        break;
                                    }
                                case 1:
                                    fid fidVar4 = (fid) obj6;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    bts btsVar4 = (bts) fidVar4;
                                    if (!btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        jeb1.f(b31Var2.g, an91.m(c530.a, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.e(btsVar4).g.b, btsVar4, 805306416, 48, 13820);
                                        break;
                                    }
                                default:
                                    fid fidVar5 = (fid) obj6;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    bts btsVar5 = (bts) fidVar5;
                                    if (!btsVar5.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                                        btsVar5.Y();
                                        break;
                                    } else {
                                        sya1.a(y9b1.b(), null, ((hfp) b31Var2.j).a, null, btsVar5, 0, 10);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar2), btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
                    btsVar2.t(false);
                } else {
                    btsVar2.e0(-1972407869);
                    btsVar2.t(false);
                }
                btsVar2.t(true);
                btsVar2.t(true);
                return zy11Var;
        }
    }

    public /* synthetic */ t01(tls tlsVar, b31 b31Var) {
        this.b = tlsVar;
        this.c = b31Var;
    }
}
