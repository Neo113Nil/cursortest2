package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.check.CheckSize;
import com.yandex.go.design.compose.check.CheckState;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class q8h {
    public static final q8h a = new q8h();

    public final void a(CheckState checkState, f530 f530Var, CheckSize checkSize, sls slsVar, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar;
        f530 b;
        au2 i3;
        float f;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(852711187);
        if ((i & 6) == 0) {
            i2 = (btsVar2.c(checkState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.c(checkSize.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(slsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.a(z) ? 16384 : 8192;
        }
        int i4 = i2;
        if (btsVar2.V(i4 & 1, (i4 & 9363) != 9362)) {
            c530 c530Var = c530.a;
            if (slsVar == null) {
                btsVar2.e0(-1612391536);
                btsVar2.t(false);
                b = null;
            } else {
                btsVar2.e0(-1612391535);
                f530 d = q791.d(c530Var, z, null, new awk0(1), slsVar, 10);
                boolean z2 = (i4 & 14) == 4;
                Object Q = btsVar2.Q();
                if (z2 || Q == did.a) {
                    Q = new dye(28, checkState);
                    btsVar2.o0(Q);
                }
                b = fnq0.b(d, false, (tls) Q);
                btsVar2.t(false);
            }
            if (b == null) {
                b = c530Var;
            }
            int i5 = p8h.a[checkState.ordinal()];
            if (i5 == 1) {
                i3 = wkb1.i();
            } else if (i5 == 2) {
                i3 = null;
            } else {
                if (i5 != 3) {
                    w511.b();
                    return;
                }
                i3 = bmb1.b();
            }
            int i6 = p8h.b[checkSize.ordinal()];
            if (i6 == 1) {
                f = 8.0f;
            } else {
                if (i6 != 2) {
                    w511.b();
                    return;
                }
                f = 6.0f;
            }
            f530 c = q6a1.c(ymb1.l(ljs0.i(f530Var, checkSize.getControlSize()), cyk0.c(f)), z);
            CheckState checkState2 = CheckState.Unchecked;
            f530 k = r6b1.b(bzk0.c(c, checkState == checkState2 ? AppColor$Palette.ControlMinor : AppColor$Palette.Control, qke.q), checkState == checkState2 && z, r6b1.c(btsVar2), f, 24).k(b);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d3 = b.d(btsVar2, k);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, d2);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d3);
            if (i3 != null) {
                btsVar2.e0(-766125285);
                btsVar = btsVar2;
                sya1.a(i3, cj6.a.a(ljs0.i(c530Var, checkSize.getIconSize()), x4c.y), null, AppColor$Palette.TextOnControl, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 4);
                btsVar.t(false);
            } else {
                btsVar = btsVar2;
                btsVar.e0(-765938603);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ye5(this, checkState, f530Var, checkSize, slsVar, z, i);
        }
    }
}
