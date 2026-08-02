package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class t9q0 {
    public static final byk0 a = cyk0.c(16.0f);

    public static final void a(v9q0 v9q0Var, boolean z, sls slsVar, a aVar, fid fidVar, int i) {
        int i2;
        sls slsVar2;
        f530 f530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1418399916);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(v9q0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        c530 c530Var = c530.a;
        if (i3 == 0) {
            i2 |= btsVar.k(c530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            slsVar2 = slsVar;
            i2 |= btsVar.e(slsVar2) ? 2048 : 1024;
        } else {
            slsVar2 = slsVar;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(aVar) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            ety0 ety0Var = xya1.e(btsVar).g.a;
            ety0 ety0Var2 = xya1.e(btsVar).g.b;
            if (z) {
                btsVar.e0(1663982060);
                igr0 a2 = dbb1.a(btsVar);
                byk0 byk0Var = a;
                f530Var = bzk0.c(hbb1.b(c530Var, a2, byk0Var, false, 12), AppColor$Palette.BgFloating, byk0Var);
                btsVar.t(false);
            } else {
                btsVar.e0(1664121188);
                btsVar.t(false);
                f530Var = c530Var;
            }
            f530 m = an91.m(q791.b(v9q0Var.a(c530Var, 1.0f, true).k(ljs0.b).k(f530Var), null, null, false, null, new awk0(0), slsVar2, 12), 16.0f, 0.0f, 2);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, m);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            boolean z2 = (i2 & 896) == 256;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Object u9q0Var = new u9q0(z ? AppColor$Palette.Text : AppColor$Palette.TextMinor, z ? ety0Var2 : ety0Var);
                btsVar.o0(u9q0Var);
                Q = u9q0Var;
            }
            aVar.invoke((u9q0) Q, btsVar, Integer.valueOf((i2 >> 9) & 112));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(v9q0Var, z, slsVar, aVar, i);
        }
    }
}
