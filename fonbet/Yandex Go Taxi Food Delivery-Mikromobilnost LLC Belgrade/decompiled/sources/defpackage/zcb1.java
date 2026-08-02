package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes5.dex */
public abstract class zcb1 {
    public static final void a(final f530 f530Var, final d37 d37Var, final sls slsVar, final long j, final long j2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-391493297);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(d37Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.d(j) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.d(j2) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            xab1.a(f530Var, null, wwg.S(814401061, true, new zls() { // from class: k57
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    int i3 = 1;
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                        f530 c = ljs0.c(ljs0.e(c530.a, 56.0f), 1.0f);
                        d37 d37Var2 = d37.this;
                        a.a(slsVar, c, null, j, 0L, null, d37Var2.c, null, null, null, wwg.S(1471961756, true, new q07(d37Var2, j2, i3), btsVar2), btsVar2, 0, 3828);
                        if (d37Var2.d) {
                            btsVar2.e0(-447673444);
                            ocb1.c(ljs0.e(ljs0.c(f530Var, 1.0f), 56.0f), 0.0f, 0L, ldc.l, null, 0, null, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, HProv.PP_INFO);
                            btsVar2.t(false);
                        } else {
                            btsVar2.e0(-447518723);
                            btsVar2.t(false);
                        }
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, (i2 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new l57(f530Var, d37Var, slsVar, j, j2, i);
        }
    }

    public static final void b(r57 r57Var, sls slsVar, sls slsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1394712736);
        int i2 = i | (btsVar.k(r57Var) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.e(slsVar2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 k = an91.k(c530.a, 8.0f);
            lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            x2y x2yVar = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            d37 d37Var = r57Var.a;
            a7u0 a7u0Var = gl51.a;
            a(x2yVar, d37Var, slsVar, ((el51) btsVar.m(a7u0Var)).g(), ((el51) btsVar.m(a7u0Var)).q(), btsVar, (i2 << 3) & 896);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            a(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), r57Var.b, slsVar2, ((el51) btsVar.m(a7u0Var)).f(), ((el51) btsVar.m(a7u0Var)).p(), btsVar, i2 & 896);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(r57Var, slsVar, slsVar2, i, 19);
        }
    }

    public static final void c(f530 f530Var, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1854833411);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = ees0.a;
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            nnm.p(6, aVar, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zsm(f530Var, aVar, i, 3);
        }
    }

    public static final long d(long j, boolean z, int i, float f) {
        int i2 = ((z || i == 2 || i == 4 || i == 5) && n8e.e(j)) ? n8e.i(j) : Integer.MAX_VALUE;
        if (n8e.k(j) != i2) {
            i2 = y6i0.d(jlb1.a(f), n8e.k(j), i2);
        }
        return qje.m(0, i2, 0, n8e.h(j));
    }
}
