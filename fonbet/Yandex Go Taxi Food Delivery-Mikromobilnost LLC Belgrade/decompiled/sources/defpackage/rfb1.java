package defpackage;

import androidx.compose.material3.b;
import androidx.compose.runtime.internal.a;

/* loaded from: classes11.dex */
public abstract class rfb1 {
    public static final void a(f530 f530Var, ehr0 ehr0Var, ec8 ec8Var, b bVar, a aVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        ehr0 ehr0Var2;
        int i3;
        b bVar2;
        int i4;
        f530 f530Var3;
        b bVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1359693790);
        int i5 = i2 & 1;
        if (i5 != 0) {
            ehr0Var2 = ehr0Var;
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = i | (btsVar.k(f530Var2) ? 4 : 2);
            ehr0Var2 = ehr0Var;
        } else {
            f530Var2 = f530Var;
            ehr0Var2 = ehr0Var;
            i3 = i;
        }
        int i6 = i3 | (btsVar.k(ehr0Var2) ? 32 : 16) | (btsVar.k(ec8Var) ? 256 : 128) | 25600;
        if (btsVar.V(i6 & 1, (74899 & i6) != 74898)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                f530 f530Var4 = i5 != 0 ? c530.a : f530Var2;
                i4 = i6 & (-7169);
                f530Var3 = f530Var4;
                bVar3 = new b(x3r.e, x3r.d);
            } else {
                btsVar.Y();
                f530Var3 = f530Var2;
                i4 = i6 & (-7169);
                bVar3 = bVar;
            }
            btsVar.u();
            mnw0.a(f530Var3, ehr0Var2, ec8Var.a, ec8Var.b, 0.0f, ((y7m) bVar3.a(true, null, btsVar, 54).getValue()).a, wwg.S(-97109725, true, new k2z0(aVar, 12), btsVar), btsVar, (i4 & 112) | (i4 & 14) | 12582912 | 1572864, 16);
            f530Var2 = f530Var3;
            bVar2 = bVar3;
        } else {
            btsVar.Y();
            bVar2 = bVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xg0(f530Var2, ehr0Var, ec8Var, bVar2, aVar, i, i2, 4);
        }
    }

    public static final int b(wg6 wg6Var) {
        return ((dtr0) wg6Var.g.getValue()).a;
    }

    public static final float c(wg6 wg6Var) {
        return wg6Var.u[wg6Var.v.getIntValue() - 1];
    }

    public static final float d(wg6 wg6Var) {
        float[] fArr = wg6Var.u;
        float f = fArr[1];
        float f2 = fArr[0] - f;
        float floatValue = wg6Var.h.getFloatValue();
        if (f2 == 0.0f) {
            return 1.0f;
        }
        return y6i0.c((floatValue - f) / f2, 0.0f, 1.0f);
    }

    public static final float e(wg6 wg6Var) {
        float f = wg6Var.u[wg6Var.v.getIntValue() - 2];
        float c = c(wg6Var) - f;
        float floatValue = wg6Var.h.getFloatValue();
        if (c == 0.0f) {
            return 1.0f;
        }
        return y6i0.c((floatValue - f) / c, 0.0f, 1.0f);
    }

    public static final float f(wg6 wg6Var) {
        int i;
        float floatValue = wg6Var.h.getFloatValue();
        float[] fArr = wg6Var.u;
        yx40 yx40Var = wg6Var.v;
        int intValue = yx40Var.getIntValue() - 2;
        int intValue2 = yx40Var.getIntValue();
        int i2 = 0;
        while (true) {
            if (i2 >= intValue2) {
                i = intValue;
                break;
            }
            if (fArr[i2] <= floatValue) {
                i = i2 - 1;
                break;
            }
            i2++;
        }
        int d = y6i0.d(i, 0, intValue);
        float f = fArr[d + 1];
        float f2 = fArr[d];
        float f3 = f - f2;
        return f3 == 0.0f ? d + 1.0f : n.a(floatValue, f2, f3, d);
    }

    public static final boolean g(wg6 wg6Var) {
        return ((Boolean) wg6Var.i.getValue()).booleanValue();
    }

    public static final boolean h(wg6 wg6Var) {
        pzt0 pzt0Var;
        return ((Boolean) wg6Var.q.e.getValue()).booleanValue() || ((pzt0Var = wg6Var.r) != null && pzt0Var.isActive());
    }

    public static final lum i() {
        return new lum(new i0z(1), m1z.a, new mtw(26), n1z.a);
    }
}
