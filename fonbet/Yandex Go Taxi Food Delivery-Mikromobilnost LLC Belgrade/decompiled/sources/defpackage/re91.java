package defpackage;

import androidx.compose.animation.core.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import java.util.ArrayList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public abstract class re91 {
    public static final byte[] a = {-12, 116, -117, 3, -16, -91, 67, 7};
    public static final byte[] b = {-111, 12, -1, 102, -126, -53, 34, 107, -85, 22, -22, 109, -101, -6, Alerts.alert_decrypt_error, 102, -115, 24, -28, 98, -108};

    public static final void a(final String str, final float f, final boolean z, final sls slsVar, fid fidVar, final int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(803487924);
        int i2 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.b(f) ? 32 : 16) | (btsVar2.a(z) ? 256 : 128);
        int i3 = 1;
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new jc0(22, slsVar);
                btsVar2.o0(Q);
            }
            f530 d = q791.d(c530.a, false, null, null, (sls) Q, 15);
            boolean z2 = (i2 & 896) == 256;
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new j4j(z, slsVar);
                btsVar2.o0(Q2);
            }
            btsVar = btsVar2;
            web1.c(fnq0.b(d, false, (tls) Q2), 0.0f, false, 0.0f, null, null, wwg.S(-676107880, true, new q0(str, 18), btsVar2), null, null, wwg.S(1429695899, true, new k0(f, i3), btsVar2), null, null, false, btsVar, 806879232, 0, 7614);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(str, f, z, slsVar, i) { // from class: k4j
                public final /* synthetic */ String a;
                public final /* synthetic */ float b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ sls w;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(3073);
                    re91.a(this.a, this.b, this.c, this.w, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(dj djVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(341645696);
        int i2 = (btsVar.e(djVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            web1.c(null, 0.0f, false, 0.0f, null, null, wwg.S(1962626916, true, new i4j(djVar), btsVar), null, null, null, null, null, false, btsVar, 1573248, 0, 8123);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i4j(djVar, i);
        }
    }

    public static final void c(l1q0 l1q0Var, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        ArrayList arrayList = l1q0Var.b;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1468651089);
        int i2 = (btsVar.e(l1q0Var) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            m3u0 b2 = b.b(((Boolean) oz40Var.getValue()).booleanValue() ? 180.0f : 0.0f, null, null, null, btsVar, 0, 30);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530Var2 = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar, f530Var2);
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
            String str = l1q0Var.a;
            float floatValue = ((Number) b2.getValue()).floatValue();
            boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new w01(10, oz40Var);
                btsVar.o0(Q2);
            }
            a(str, floatValue, booleanValue, (sls) Q2, btsVar, HProv.ALG_TYPE_SECURECHANNEL);
            if (((Boolean) oz40Var.getValue()).booleanValue()) {
                btsVar.e0(1418050264);
                dk91.a(0.0f, 6, 6, 0L, btsVar, an91.o(f530Var2, 16.0f, 0.0f, 16.0f, 0.0f, 10));
                btsVar = btsVar;
                int i3 = 0;
                for (Object obj : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        scc.m();
                        throw null;
                    }
                    fj fjVar = (fj) obj;
                    if (fjVar instanceof dj) {
                        btsVar.e0(-1596194573);
                        b((dj) fjVar, btsVar, 0);
                        if (i3 != scc.f(arrayList)) {
                            btsVar.e0(-1596070325);
                            bts btsVar2 = btsVar;
                            dk91.a(0.0f, 6, 6, 0L, btsVar2, an91.o(f530Var2, 16.0f, 0.0f, 16.0f, 0.0f, 10));
                            btsVar = btsVar2;
                            btsVar.t(false);
                        } else {
                            btsVar.e0(-1595788752);
                            btsVar.t(false);
                        }
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1575496074);
                        btsVar.t(false);
                    }
                    i3 = i4;
                }
                btsVar.t(false);
            } else {
                btsVar.e0(1418866153);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mjf(l1q0Var, f530Var2, i, 14);
        }
    }

    public static final void d(f530 f530Var, hfa0 hfa0Var, z0a0 z0a0Var, String str, sls slsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1628297223);
        int i2 = i | 6 | (btsVar.e(hfa0Var) ? 32 : 16) | (btsVar.k(z0a0Var) ? 256 : 128) | (btsVar.k(str) ? 2048 : 1024);
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(slsVar) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            lea0 b2 = hfa0Var.b();
            o430 o430Var = did.a;
            c530 c530Var = c530.a;
            if (b2 == null || !b2.e()) {
                f530Var2 = c530Var;
                btsVar.e0(1242635303);
                f530 m = ljs0.m(an91.m(f530Var2, 8.0f, 0.0f, 2), 56.0f);
                boolean z = (i2 & HProv.ALG_CLASS_ALL) == 16384;
                Object Q = btsVar.Q();
                if (z || Q == o430Var) {
                    Q = new zvr(17, slsVar);
                    btsVar.o0(Q);
                }
                o4b1.b(mt71.m(x2h0.ic_payment_add_card, 0, btsVar), ohb1.e(btsVar, kyh0.scooters_offer_card_v2_a11y_payment_info_button_add), q791.b(m, null, null, false, null, new awk0(0), (sls) Q, 12), null, mhe.e, 0.0f, null, btsVar, 24584, 104);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                btsVar.e0(1242238844);
                f530 m2 = ljs0.m(c530Var, 56.0f);
                boolean z2 = (i2 & HProv.ALG_CLASS_ALL) == 16384;
                Object Q2 = btsVar.Q();
                if (z2 || Q2 == o430Var) {
                    Q2 = new zvr(16, slsVar);
                    btsVar.o0(Q2);
                }
                f530 b3 = q791.b(m2, null, null, false, null, new awk0(0), (sls) Q2, 12);
                boolean e = ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | btsVar.e(b2);
                Object Q3 = btsVar.Q();
                if (e || Q3 == o430Var) {
                    Q3 = new th40(str, z0a0Var, b2);
                    btsVar.o0(Q3);
                }
                f530Var2 = c530Var;
                androidx.compose.ui.viewinterop.b.a((tls) Q3, b3, null, btsVar, 0, 4);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(f530Var2, (Object) hfa0Var, (Object) z0a0Var, (Object) str, (Object) slsVar, i, 28);
        }
    }

    public static final void e(y9o y9oVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1897512341);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(y9oVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            so5 so5Var = x4c.H;
            o4b1.b(vfc.k(f1h0.brick_sign, 0, -1411607277, btsVar, false), null, new ypu(so5Var), null, null, 0.0f, null, btsVar, 56, 56);
            oeb1.c(btsVar, ljs0.e(c530.a, 24.0f));
            i3 = 1;
            jeb1.f(y9oVar.a, new ypu(so5Var), null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).e.d, btsVar, 0, 0, 16252);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            i3 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gb31(y9oVar, f530Var, i, i3);
        }
    }
}
