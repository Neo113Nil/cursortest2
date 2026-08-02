package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.design.compose.taxi.shared.pin.PinSize;
import java.util.ArrayList;
import java.util.Arrays;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes11.dex */
public abstract class vdb1 {
    public static final void a(ibp0 ibp0Var, dss0 dss0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2003222399);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(dss0Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 a = ljs0.a(c530.a, ibp0Var.c().getSize(), ibp0Var.c().getSize());
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, a);
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
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            d(ibp0Var, dss0Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new frs0(ibp0Var, dss0Var, i, 0);
        }
    }

    public static final void b(ibp0 ibp0Var, f530 f530Var, q0c0 q0c0Var, a aVar, fid fidVar, int i) {
        int i2;
        a aVar2;
        q0c0 q0c0Var2;
        PinSize pinSize;
        bts btsVar = (bts) fidVar;
        btsVar.g0(825376182);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(q0c0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(aVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            SlotSize c = ibp0Var.c();
            int[] iArr = t8y.a;
            int i3 = iArr[c.ordinal()];
            float f = 6.0f;
            if (i3 != 1) {
                if (i3 == 2) {
                    f = 4.0f;
                } else if (i3 != 3 && i3 != 4) {
                    w511.b();
                    return;
                }
            }
            f530 k = an91.k(f530Var, f);
            int i4 = iArr[ibp0Var.c().ordinal()];
            if (i4 == 1) {
                pinSize = PinSize.L;
            } else if (i4 == 2) {
                pinSize = PinSize.M;
            } else if (i4 == 3) {
                pinSize = PinSize.S;
            } else {
                if (i4 != 4) {
                    w511.b();
                    return;
                }
                pinSize = PinSize.XS;
            }
            jm91.a(k, pinSize, q0c0Var, aVar, btsVar, i2 & 8064);
            q0c0Var2 = q0c0Var;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            q0c0Var2 = q0c0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(ibp0Var, f530Var, q0c0Var2, aVar2, i);
        }
    }

    public static final void c(ibp0 ibp0Var, gss0 gss0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1394261684);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(gss0Var) : btsVar.e(gss0Var) ? 32 : 16;
        }
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (gss0Var instanceof dss0) {
            btsVar.e0(144322018);
            a(ibp0Var, (dss0) gss0Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else if (gss0Var instanceof fss0) {
            btsVar.e0(144323935);
            e(ibp0Var, (fss0) gss0Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            if (!(gss0Var instanceof ess0)) {
                throw unr0.y(144320330, btsVar, false);
            }
            btsVar.e0(144325751);
            nnm.s(c530.a, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(ibp0Var, gss0Var, i, 21);
        }
    }

    public static final void d(ibp0 ibp0Var, dss0 dss0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2107497306);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(dss0Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            a7u0 a7u0Var = j.h;
            tdb1.d(ibp0Var, mja1.b(dss0Var.a, null, 6), ljs0.n(c530.a, ((fwi) btsVar.m(a7u0Var)).H(dss0Var.b), ((fwi) btsVar.m(a7u0Var)).H(dss0Var.c)), null, null, null, 0.0f, 0, null, btsVar, i2 & 14, 508);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new frs0(ibp0Var, dss0Var, i, 1);
        }
    }

    public static final void e(ibp0 ibp0Var, fss0 fss0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2094496585);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(fss0Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 a = ljs0.a(c530.a, ibp0Var.c().getSize(), ibp0Var.c().getSize());
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, a);
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
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            o4b1.c(new u92(ffx.d0(fss0Var.a, 0, 0, 7)), null, null, null, mhe.e, 0.0f, null, 0, btsVar, 24624, 236);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(ibp0Var, fss0Var, i, 22);
        }
    }

    public static final ArrayList f(kf61 kf61Var) {
        ArrayList arrayList = new ArrayList();
        if (kf61Var.c() < 1.0f) {
            float b = m810.b(kf61Var.c() * 10.0f) / 10.0f;
            int i = (int) b;
            arrayList.add(new ns8(kf61Var.c(), b == ((float) i) ? b64.e(i, RemoteBioParameters.X) : String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(b)}, 1)).concat(RemoteBioParameters.X)));
        }
        arrayList.add(new ns8(1.0f, "1x"));
        if (kf61Var.a() >= 2.0f) {
            arrayList.add(new ns8(2.0f, "2x"));
        }
        return arrayList;
    }
}
