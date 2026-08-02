package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.TextFormat;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class r4z0 {
    public static final so5 a = x4c.I;

    public static final void a(kd3 kd3Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(355770662);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(kd3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            zgb1.a(kd3Var.a, an91.o(c530.a, 12.0f, 0.0f, 12.0f, 12.0f, 2), 0, false, null, null, false, null, btsVar, 48, 252);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(kd3Var, i, 11);
        }
    }

    public static final void b(a4b1 a4b1Var, float f, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2083384637);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(a4b1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.b(f) ? 256 : 128;
        }
        int i4 = i2;
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            boolean z = a4b1Var instanceof oki0;
            c530 c530Var = c530.a;
            o430 o430Var = did.a;
            if (z) {
                btsVar.e0(-460551921);
                f530 e = sm91.e(cj6Var.a(c530Var, x4c.w), 4.0f, -4.0f);
                Object Q = btsVar.Q();
                if (Q == o430Var) {
                    Q = new f0z0(5);
                    btsVar.o0(Q);
                }
                rm91.b(0, btsVar, fnq0.a(e, (tls) Q), ((oki0) a4b1Var).a);
                btsVar.t(false);
            } else if (a4b1Var instanceof tre) {
                btsVar.e0(677888005);
                tre treVar = (tre) a4b1Var;
                f530 o = an91.o(c530Var, 0.0f, f, 0.0f, 0.0f, 13);
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new f0z0(5);
                    btsVar.o0(Q2);
                }
                rm91.a(treVar, fnq0.a(o, (tls) Q2), btsVar, i4 & HProv.PP_DELETE_SAVED_PASSWD);
                btsVar.t(false);
            } else {
                btsVar.e0(677893793);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i740(a4b1Var, f, i, 2);
        }
    }

    public static final void c(s37 s37Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        long j;
        p37 p37Var = s37Var.c;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1156205937);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar2.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(s37Var) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            lhg lhgVar = (lhg) btsVar2.m(mhg.a);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new pxy0(4, s37Var);
                btsVar2.o0(Q);
            }
            l27 l27Var = new l27((tls) Q);
            wa6 wa6Var = p37Var != null ? p37Var.c : null;
            float f = wa6Var != null ? (float) wa6Var.b : 0.5f;
            ldc ldcVar = wa6Var != null ? new ldc(wa6Var.a) : null;
            if (ldcVar == null) {
                btsVar2.e0(1282639667);
                j = ((el51) btsVar2.m(gl51.a)).l();
                btsVar2.t(false);
            } else {
                btsVar2.e0(1282638396);
                btsVar2.t(false);
                j = ldcVar.a;
            }
            xa6 a2 = eab1.a(f, j);
            f530 a3 = cj6Var.a(ljs0.w(ljs0.e(an91.k(c530.a, 12.0f), 32.0f), 3), x4c.A);
            String str = s37Var.b.a;
            long j2 = p37Var != null ? p37Var.a : ldc.l;
            byk0 c = p37Var != null ? cyk0.c(p37Var.b) : null;
            if (c == null) {
                btsVar2.e0(1282659600);
                c = ((YandexShapes) btsVar2.m(qm51.a)).b();
            } else {
                btsVar2.e0(1282656438);
            }
            btsVar2.t(false);
            boolean e = btsVar2.e(lhgVar) | (i4 == 32);
            Object Q2 = btsVar2.Q();
            if (e || Q2 == o430Var) {
                Q2 = new i5y0(16, lhgVar, s37Var);
                btsVar2.o0(Q2);
            }
            btsVar = btsVar2;
            a.f((sls) Q2, a3, c, j2, 0L, a2, null, false, str, null, l27Var, wwg.S(-954263402, true, new jvx0(6, s37Var), btsVar2), btsVar, 0, 1488);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(s37Var, i, 10);
        }
    }

    public static final void d(int i, long j, fid fidVar, f530 f530Var) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-310153965);
        int i2 = (btsVar.d(j) ? 32 : 16) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            f530Var2 = f530Var;
            o4b1.b(mt71.m(szg0.ic_lock_inv, 0, btsVar), null, f530Var2, null, null, 0.0f, new c36(j, 5), btsVar, 432, 56);
        } else {
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z82(f530Var2, j, i);
        }
    }

    public static final void e(ef70 ef70Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-516956113);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(ef70Var) ? 32 : 16;
        }
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (ef70Var.a != null) {
            btsVar.e0(1113265080);
            u3b1.j(an91.o(cj6Var.a(c530.a, x4c.C), 0.0f, 0.0f, 8.0f, 8.0f, 3), 0.0f, 0L, wwg.S(-1736321982, true, new jvx0(7, ef70Var), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
            btsVar.t(false);
        } else {
            btsVar.e0(1113475539);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(ef70Var, i, 14);
        }
    }

    public static final void f(final xjf0 xjf0Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        CharSequence charSequence = xjf0Var.b;
        dif0 dif0Var = xjf0Var.a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1546963546);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(xjf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final int i3 = 1;
        final int i4 = 0;
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else {
            if (dif0Var == null && charSequence == null) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls() { // from class: q4z0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            xjf0 xjf0Var2 = xjf0Var;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    r4z0.f(xjf0Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    r4z0.f(xjf0Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            f530 o = an91.o(c530.a, 12.0f, 0.0f, 12.0f, 12.0f, 2);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o2);
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, d.d, d);
            if (dif0Var == null) {
                btsVar.e0(-1850997498);
                btsVar.t(false);
            } else {
                btsVar.e0(-1850997497);
                u7a1.c(dif0Var, btsVar, 0);
                btsVar.t(false);
            }
            if (charSequence == null) {
                btsVar.e0(-1850931685);
                btsVar.t(false);
            } else {
                btsVar.e0(-1850931684);
                zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar, 0, 254);
                btsVar.t(false);
            }
            btsVar.t(true);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls() { // from class: q4z0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    xjf0 xjf0Var2 = xjf0Var;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            r4z0.f(xjf0Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            r4z0.f(xjf0Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void g(kqf0 kqf0Var, fid fidVar, int i) {
        int i2;
        long j;
        long j2;
        ldc ldcVar = kqf0Var.b;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-915416433);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(kqf0Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object obj = kqf0Var.c;
            if (obj == null) {
                obj = a;
            }
            uo5 uo5Var = jl40.l(obj, x4c.G) ? x4c.A : jl40.l(obj, x4c.H) ? x4c.B : x4c.C;
            c530 c530Var = c530.a;
            f530 m = an91.m(cj6Var.a(c530Var, uo5Var), 5.0f, 0.0f, 2);
            lhl0 a2 = khl0.a(new i43(2.0f, true, new quz(11)), x4c.F, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            Boolean bool = kqf0Var.d;
            if (bool != null ? bool.booleanValue() : false) {
                btsVar.e0(-353901229);
                if (ldcVar == null) {
                    btsVar.e0(-288508645);
                    j2 = ((el51) btsVar.m(gl51.a)).j();
                    btsVar.t(false);
                } else {
                    btsVar.e0(-288509854);
                    btsVar.t(false);
                    j2 = ldcVar.a;
                }
                d(6, j2, btsVar, an91.o(c530Var, 0.0f, 0.0f, 0.0f, 5.0f, 7));
                btsVar.t(false);
            } else {
                btsVar.e0(-353741393);
                btsVar.t(false);
            }
            if (kqf0Var.a != null) {
                btsVar.e0(-353702705);
                String str = kqf0Var.a;
                if (ldcVar == null) {
                    btsVar.e0(-288500517);
                    j = ((el51) btsVar.m(gl51.a)).n();
                    btsVar.t(false);
                } else {
                    btsVar.e0(-288501726);
                    btsVar.t(false);
                    j = ldcVar.a;
                }
                ymb1.h(str, null, j, null, null, 0L, 0L, 0L, 0, false, 0, null, null, btsVar, 0, 65530);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                btsVar.e0(-353548945);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(kqf0Var, i, 12);
        }
    }

    public static final void h(int i, long j, fid fidVar, f530 f530Var) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1133578567);
        int i2 = (btsVar.d(j) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            pi6.a(m4m0.b(ljs0.e(f530Var, 6.0f), j, cyk0.a), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hpm(j, f530Var, i, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        if (defpackage.jl40.l(r6.Q(), java.lang.Integer.valueOf(r13)) == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(ugg0 ugg0Var, fid fidVar, int i) {
        int i2;
        ldc ldcVar;
        boolean z;
        bts btsVar;
        ldc ldcVar2;
        long j;
        ldc ldcVar3;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        ldc ldcVar4 = ugg0Var.h;
        float f = ugg0Var.e;
        ldc ldcVar5 = ugg0Var.g;
        ldc ldcVar6 = ugg0Var.f;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-446831449);
        dmw0 dmw0Var = btsVar2.a;
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = i | (btsVar2.k(cj6Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(ugg0Var) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            uo5 uo5Var = x4c.A;
            c530 c530Var = c530.a;
            f530 o = an91.o(ljs0.c(cj6Var.a(c530Var, uo5Var), 1.0f), 12.0f, 0.0f, 12.0f, 12.0f, 2);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a2 = qic.a(g43Var, so5Var, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d = b.d(btsVar2, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o2);
            wls wlsVar3 = d.g;
            if (btsVar2.S) {
                ldcVar = ldcVar4;
            } else {
                ldcVar = ldcVar4;
            }
            b64.z(hashCode, btsVar2, hashCode, wlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d);
            f530 c = ljs0.c(c530Var, 1.0f);
            uo5 uo5Var2 = x4c.b;
            z910 d2 = pi6.d(uo5Var2, false);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o3 = btsVar2.o();
            f530 d3 = b.d(btsVar2, c);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, d2);
            qje.W(btsVar2, wlsVar2, o3);
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar2, hashCode2, wlsVar3);
            }
            qje.W(btsVar2, wlsVar4, d3);
            f530 a3 = cj6Var.a(c530Var, uo5Var2);
            sic a4 = qic.a(g43Var, so5Var, btsVar2, 48);
            int hashCode3 = Long.hashCode(btsVar2.T);
            r1b0 o4 = btsVar2.o();
            f530 d4 = b.d(btsVar2, a3);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, a4);
            qje.W(btsVar2, wlsVar2, o4);
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode3))) {
                b64.z(hashCode3, btsVar2, hashCode3, wlsVar3);
            }
            qje.W(btsVar2, wlsVar4, d4);
            String str = ugg0Var.c;
            if (ldcVar6 == null) {
                btsVar2.e0(2106819713);
                long n = ((el51) btsVar2.m(gl51.a)).n();
                z = false;
                btsVar2.t(false);
                btsVar = btsVar2;
                j = n;
                ldcVar2 = ldcVar6;
            } else {
                z = false;
                btsVar2.e0(2106818380);
                btsVar2.t(false);
                btsVar = btsVar2;
                ldcVar2 = ldcVar6;
                j = ldcVar2.a;
            }
            lzr lzrVar = lzr.D;
            boolean z2 = z;
            ymb1.j(str, null, j, null, lzrVar, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65514);
            bts btsVar3 = btsVar;
            String str2 = ugg0Var.d;
            if (ldcVar5 == null) {
                btsVar3.e0(2106827147);
                long b = ldc.b(((el51) btsVar3.m(gl51.a)).n(), 0.5f, 0.0f, 0.0f, 0.0f, 14);
                btsVar3.t(z2);
                j2 = b;
                ldcVar3 = ldcVar5;
            } else {
                btsVar3.e0(2106825566);
                btsVar3.t(z2);
                ldcVar3 = ldcVar5;
                j2 = ldcVar3.a;
            }
            ldc ldcVar7 = ldcVar3;
            ymb1.f(str2, null, j2, null, null, null, 0L, 0L, uh6.w(0.02d), null, 0, false, 0, null, null, btsVar3, 100663296, 0, 65274);
            btsVar3.t(true);
            f530 a5 = cj6Var.a(c530Var, x4c.w);
            sic a6 = qic.a(g43Var, x4c.I, btsVar3, 48);
            int hashCode4 = Long.hashCode(btsVar3.T);
            r1b0 o5 = btsVar3.o();
            f530 d5 = b.d(btsVar3, a5);
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar);
            } else {
                btsVar3.r0();
            }
            qje.W(btsVar3, wlsVar, a6);
            qje.W(btsVar3, wlsVar2, o5);
            if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode4))) {
                b64.z(hashCode4, btsVar3, hashCode4, wlsVar3);
            }
            qje.W(btsVar3, wlsVar4, d5);
            String str3 = ugg0Var.a;
            if (ldcVar2 == null) {
                btsVar3.e0(-1843686888);
                j3 = ((el51) btsVar3.m(gl51.a)).n();
                btsVar3.t(z2);
            } else {
                btsVar3.e0(-1843688221);
                btsVar3.t(z2);
                j3 = ldcVar2.a;
            }
            ymb1.j(str3, null, j3, null, lzrVar, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar3, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65514);
            String str4 = ugg0Var.b;
            if (ldcVar7 == null) {
                btsVar3.e0(-1843679422);
                j4 = ldc.b(((el51) btsVar3.m(gl51.a)).n(), 0.5f, 0.0f, 0.0f, 0.0f, 14);
                btsVar3.t(z2);
            } else {
                btsVar3.e0(-1843681003);
                btsVar3.t(z2);
                j4 = ldcVar7.a;
            }
            ymb1.f(str4, null, j4, null, null, null, 0L, 0L, uh6.w(0.02d), null, 0, false, 0, null, null, btsVar3, 100663296, 0, 65274);
            btsVar2 = btsVar3;
            btsVar2.t(true);
            btsVar2.t(true);
            oeb1.c(btsVar2, ljs0.e(c530Var, 2.0f));
            if (f <= 0.0f || 1.0f <= f) {
                ldc ldcVar8 = ldcVar;
                btsVar2.e0(-1979894787);
                if (ldcVar8 == null) {
                    btsVar2.e0(-1310790385);
                    j5 = ldc.b(((el51) btsVar2.m(gl51.a)).n(), 0.2f, 0.0f, 0.0f, 0.0f, 14);
                    btsVar2.t(z2);
                } else {
                    btsVar2.e0(-1310791904);
                    btsVar2.t(z2);
                    j5 = ldcVar8.a;
                }
                h(48, j5, btsVar2, ljs0.c(c530Var, 1.0f));
                btsVar2.t(z2);
            } else {
                btsVar2.e0(-1979678965);
                f530 c2 = ljs0.c(c530Var, 1.0f);
                lhl0 a7 = khl0.a(lr20.a, x4c.D, btsVar2, z2 ? 1 : 0);
                int hashCode5 = Long.hashCode(btsVar2.T);
                r1b0 o6 = btsVar2.o();
                f530 d6 = b.d(btsVar2, c2);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar, a7);
                qje.W(btsVar2, wlsVar2, o6);
                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode5))) {
                    b64.z(hashCode5, btsVar2, hashCode5, wlsVar3);
                }
                qje.W(btsVar2, wlsVar4, d6);
                ldc ldcVar9 = ugg0Var.i;
                if (ldcVar9 == null) {
                    btsVar2.e0(-565967529);
                    j6 = ldc.b(((el51) btsVar2.m(gl51.a)).n(), 0.2f, 0.0f, 0.0f, 0.0f, 14);
                    btsVar2.t(z2);
                } else {
                    btsVar2.e0(-565969978);
                    btsVar2.t(z2);
                    j6 = ldcVar9.a;
                }
                if (f <= 0.0d) {
                    gxv.a("invalid weight; must be greater than zero");
                }
                h(z2 ? 1 : 0, j6, btsVar2, new x2y(f > Float.MAX_VALUE ? Float.MAX_VALUE : f, true));
                oeb1.c(btsVar2, ljs0.q(c530Var, 4.0f));
                if (ldcVar == null) {
                    btsVar2.e0(-565959337);
                    j7 = ldc.b(((el51) btsVar2.m(gl51.a)).n(), 0.2f, 0.0f, 0.0f, 0.0f, 14);
                    btsVar2.t(z2);
                } else {
                    btsVar2.e0(-565960856);
                    btsVar2.t(z2);
                    j7 = ldcVar.a;
                }
                float f2 = 1.0f - f;
                if (f2 <= 0.0d) {
                    gxv.a("invalid weight; must be greater than zero");
                }
                h(z2 ? 1 : 0, j7, btsVar2, new x2y(f2 <= Float.MAX_VALUE ? f2 : Float.MAX_VALUE, true));
                btsVar2.t(true);
                btsVar2.t(z2);
            }
            btsVar2.t(true);
        } else {
            btsVar2.Y();
        }
        aii0 v = btsVar2.v();
        if (v != null) {
            v.d = new gaf0(ugg0Var, i, 15);
        }
    }

    public static final void j(nox0 nox0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1826633807);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(nox0Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            v4v v4vVar = nox0Var.a;
            c530 c530Var = c530.a;
            if (v4vVar != null) {
                btsVar.e0(12211341);
                f530 o = an91.o(cj6Var.a(ljs0.n(c530Var, 82.0f, 40.0f), x4c.A), 12.0f, 0.0f, 0.0f, 0.0f, 14);
                z910 d = pi6.d(x4c.b, false);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d2 = b.d(btsVar, o);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, d);
                qje.W(btsVar, d.e, o2);
                wls wlsVar = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar);
                }
                qje.W(btsVar, d.d, d2);
                s3b1.f(nox0Var.a, cj6Var.b(c530Var), null, btsVar, 0, 4);
                btsVar.t(true);
                btsVar.t(false);
            } else {
                btsVar.e0(12524627);
                btsVar.t(false);
            }
            if (nox0Var.b != null) {
                btsVar.e0(12566508);
                s3b1.f(nox0Var.b, an91.o(cj6Var.a(c530Var, x4c.C), 0.0f, 0.0f, 12.0f, 8.0f, 3), null, btsVar, 0, 4);
                btsVar.t(false);
            } else {
                btsVar.e0(12757747);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(nox0Var, i, 16);
        }
    }

    public static final void k(n4z0 n4z0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-4545265);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(n4z0Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 o = an91.o(cj6Var.a(ljs0.c(c530.a, 1.0f), x4c.b), 12.0f, 12.0f, 12.0f, 0.0f, 8);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
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
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o2);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            x2y d2 = n.d(btsVar, d, wlsVar4, 1.0f, true);
            sic a3 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, d2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            zgb1.a(n4z0Var.a, null, 8388611, false, null, null, false, null, btsVar, 384, 250);
            CharSequence charSequence = n4z0Var.b;
            if (charSequence == null) {
                btsVar.e0(-1034646615);
                btsVar.t(false);
            } else {
                btsVar.e0(-1034646614);
                zgb1.a(charSequence, null, 8388611, false, null, null, false, null, btsVar, 384, 250);
                btsVar.t(false);
            }
            btsVar.t(true);
            CharSequence charSequence2 = n4z0Var.c;
            if (charSequence2 == null) {
                btsVar.e0(-1856988589);
                btsVar.t(false);
            } else {
                btsVar.e0(-1856988588);
                zgb1.a(charSequence2, null, 8388611, false, null, null, false, null, btsVar, 384, 250);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(n4z0Var, i, 13);
        }
    }

    public static final void l(mcu mcuVar, fid fidVar, int i) {
        int i2;
        long j;
        long j2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2069684047);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = i | (btsVar.k(cj6Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(mcuVar) ? 32 : 16;
        }
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (mcuVar instanceof n4z0) {
            btsVar.e0(-592945473);
            k((n4z0) mcuVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            if (!(mcuVar instanceof w4z0)) {
                throw unr0.y(396513794, btsVar, false);
            }
            btsVar.e0(-592839918);
            f530 n = an91.n(cj6Var.a(c530.a, x4c.b), 12.0f, 11.0f, 12.0f, 11.0f);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, n);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            w4z0 w4z0Var = (w4z0) mcuVar;
            String str = w4z0Var.a;
            ldc ldcVar = w4z0Var.c;
            if (ldcVar == null) {
                btsVar.e0(1742757870);
                j = ((el51) btsVar.m(gl51.a)).n();
                btsVar.t(false);
            } else {
                btsVar.e0(1742756630);
                btsVar.t(false);
                j = ldcVar.a;
            }
            ymb1.e(str, null, j, null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65514);
            btsVar = btsVar;
            if (w4z0Var.b != null) {
                btsVar.e0(-1808948103);
                String str2 = w4z0Var.b;
                ldc ldcVar2 = w4z0Var.d;
                if (ldcVar2 == null) {
                    btsVar.e0(1742766830);
                    j2 = ((el51) btsVar.m(gl51.a)).n();
                    btsVar.t(false);
                } else {
                    btsVar.e0(1742765497);
                    btsVar.t(false);
                    j2 = ldcVar2.a;
                }
                ymb1.f(str2, null, j2, null, null, null, 0L, 0L, uh6.w(0.02d), null, 0, false, 2, null, null, btsVar, 100663296, HProv.ALG_TYPE_SECURECHANNEL, 57082);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                btsVar.e0(-1808668452);
                btsVar.t(false);
            }
            btsVar.t(true);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new p4z0(mcuVar, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final void m(mcu mcuVar, fid fidVar, int i) {
        int i2;
        ?? r1;
        bts btsVar;
        boolean z;
        long j;
        long j2;
        c530 c530Var;
        bts btsVar2;
        bts btsVar3;
        boolean z2;
        boolean z3;
        long j3;
        long j4;
        bts btsVar4;
        bts btsVar5;
        boolean z4;
        bts btsVar6 = (bts) fidVar;
        btsVar6.g0(-226375473);
        dmw0 dmw0Var = btsVar6.a;
        if ((i & 6) == 0) {
            i2 = i | (btsVar6.k(mcuVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (btsVar6.V(i2 & 1, (i2 & 3) != 2)) {
            k3r k3rVar = ljs0.b;
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar6.T);
            r1b0 o = btsVar6.o();
            f530 d2 = b.d(btsVar6, k3rVar);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar6.i0();
            if (btsVar6.S) {
                btsVar6.n(slsVar);
            } else {
                btsVar6.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar6, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar6, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar6.S || !jl40.l(btsVar6.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar6, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar6, wlsVar4, d2);
            c530 c530Var2 = c530.a;
            f530 a2 = cj6.a.a(an91.m(ljs0.g(c530Var2, 120.0f, 0.0f, 2), 24.0f, 0.0f, 2), x4c.A);
            if (mcuVar instanceof n4z0) {
                btsVar6.e0(101611049);
                z910 d3 = pi6.d(uo5Var, false);
                int hashCode2 = Long.hashCode(btsVar6.T);
                r1b0 o2 = btsVar6.o();
                f530 d4 = b.d(btsVar6, a2);
                btsVar6.i0();
                if (btsVar6.S) {
                    btsVar6.n(slsVar);
                } else {
                    btsVar6.r0();
                }
                qje.W(btsVar6, wlsVar, d3);
                qje.W(btsVar6, wlsVar2, o2);
                if (btsVar6.S || !jl40.l(btsVar6.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar6, hashCode2, wlsVar3);
                }
                qje.W(btsVar6, wlsVar4, d4);
                k((n4z0) mcuVar, btsVar6, ((i2 << 3) & 112) | 6);
                z2 = true;
                btsVar6.t(true);
                btsVar6.t(false);
                z4 = false;
                btsVar5 = btsVar6;
            } else {
                if (!(mcuVar instanceof w4z0)) {
                    throw unr0.y(1388751126, btsVar6, false);
                }
                btsVar6.e0(101861498);
                sic a3 = qic.a(lr20.c, x4c.G, btsVar6, 0);
                int hashCode3 = Long.hashCode(btsVar6.T);
                r1b0 o3 = btsVar6.o();
                f530 d5 = b.d(btsVar6, a2);
                btsVar6.i0();
                if (btsVar6.S) {
                    btsVar6.n(slsVar);
                } else {
                    btsVar6.r0();
                }
                qje.W(btsVar6, wlsVar, a3);
                qje.W(btsVar6, wlsVar2, o3);
                if (btsVar6.S || !jl40.l(btsVar6.Q(), Integer.valueOf(hashCode3))) {
                    b64.z(hashCode3, btsVar6, hashCode3, wlsVar3);
                }
                qje.W(btsVar6, wlsVar4, d5);
                w4z0 w4z0Var = (w4z0) mcuVar;
                ldc ldcVar = w4z0Var.d;
                String str = w4z0Var.b;
                ldc ldcVar2 = w4z0Var.c;
                if (w4z0Var.e == TextFormat.MARKDOWN) {
                    btsVar6.e0(-1419626613);
                    String str2 = w4z0Var.a;
                    f530 o4 = an91.o(c530Var2, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    c530 c530Var3 = c530Var2;
                    if (ldcVar2 == null) {
                        btsVar6.e0(2032422228);
                        j3 = ((el51) btsVar6.m(gl51.a)).n();
                        z3 = false;
                        btsVar6.t(false);
                    } else {
                        z3 = false;
                        btsVar6.e0(2032420988);
                        btsVar6.t(false);
                        j3 = ldcVar2.a;
                    }
                    a7u0 a7u0Var = an51.a;
                    boolean z5 = z3;
                    mib1.a(str2, o4, j3, 0L, 0L, 0L, 0, false, 2, null, ((zm51) btsVar6.m(a7u0Var)).e, btsVar6, 48);
                    bts btsVar7 = btsVar6;
                    if (str == null) {
                        btsVar7.e0(-1419222715);
                        btsVar7.t(z5);
                        btsVar4 = btsVar7;
                    } else {
                        btsVar7.e0(-1419222714);
                        f530 o5 = an91.o(c530Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        c530Var3 = c530Var3;
                        if (ldcVar == null) {
                            btsVar7.e0(-368466958);
                            j4 = ((el51) btsVar7.m(gl51.a)).o();
                            btsVar7.t(z5);
                        } else {
                            btsVar7.e0(-368468291);
                            btsVar7.t(z5);
                            j4 = ldcVar.a;
                        }
                        mib1.a(str, o5, j4, 0L, 0L, 0L, 0, false, 5, null, ((zm51) btsVar7.m(a7u0Var)).g, btsVar7, 48);
                        bts btsVar8 = btsVar7;
                        btsVar8.t(z5);
                        btsVar4 = btsVar8;
                    }
                    btsVar4.t(z5);
                    c530Var = c530Var3;
                    z = z5;
                    btsVar3 = btsVar4;
                } else {
                    z = false;
                    btsVar6.e0(-1418757311);
                    String str3 = w4z0Var.a;
                    f530 o6 = an91.o(c530Var2, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    if (ldcVar2 == null) {
                        btsVar6.e0(2032450196);
                        j = ((el51) btsVar6.m(gl51.a)).n();
                        btsVar6.t(false);
                    } else {
                        btsVar6.e0(2032448956);
                        btsVar6.t(false);
                        j = ldcVar2.a;
                    }
                    ymb1.c(str3, o6, j, null, null, 0L, 0L, 0L, null, 0, false, 2, null, null, btsVar6, 48, HProv.ALG_TYPE_SECURECHANNEL, 57336);
                    bts btsVar9 = btsVar6;
                    if (str == null) {
                        btsVar9.e0(-1418423566);
                        btsVar9.t(false);
                        c530Var = c530Var2;
                        btsVar2 = btsVar9;
                    } else {
                        btsVar9.e0(-1418423565);
                        f530 o7 = an91.o(c530Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        if (ldcVar == null) {
                            btsVar9.e0(809736059);
                            j2 = ((el51) btsVar9.m(gl51.a)).o();
                            btsVar9.t(false);
                        } else {
                            btsVar9.e0(809734726);
                            btsVar9.t(false);
                            j2 = ldcVar.a;
                        }
                        c530Var = c530Var2;
                        ymb1.f(str, o7, j2, null, null, null, 0L, 0L, 0L, null, 0, false, 5, null, null, btsVar9, 48, HProv.ALG_TYPE_SECURECHANNEL, 57336);
                        bts btsVar10 = btsVar9;
                        btsVar10.t(false);
                        btsVar2 = btsVar10;
                    }
                    btsVar2.t(false);
                    btsVar3 = btsVar2;
                }
                oeb1.c(btsVar3, ljs0.e(c530Var, 24.0f));
                z2 = true;
                btsVar3.t(true);
                btsVar3.t(z);
                z4 = z;
                btsVar5 = btsVar3;
            }
            btsVar5.t(z2);
            r1 = z4;
            btsVar = btsVar5;
        } else {
            r1 = 0;
            btsVar6.Y();
            btsVar = btsVar6;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new p4z0(mcuVar, i, r1);
        }
    }
}
