package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class ulb1 {
    public static au2 a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, boolean z, ButtonSize buttonSize, sls slsVar, zls zlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        boolean z2;
        int i4;
        ButtonSize buttonSize2;
        boolean z3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-422454770);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= btsVar.a(z2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= btsVar.c(buttonSize == null ? -1 : buttonSize.ordinal()) ? 256 : 128;
            }
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.e(slsVar) ? 2048 : 1024;
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar.e(zlsVar) ? 16384 : 8192;
            }
            if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
                btsVar.Y();
                buttonSize2 = buttonSize;
                z3 = z2;
            } else {
                f530 f530Var3 = i5 != 0 ? c530.a : f530Var2;
                boolean z4 = i6 != 0 ? true : z2;
                ButtonSize buttonSize3 = i4 != 0 ? ButtonSize.L : buttonSize;
                int i7 = i3 << 6;
                d17.c(f530Var3, z4, buttonSize3, ButtonStyle.Minor, ButtonForm.Squircle, slsVar, zlsVar, btsVar, (i3 & 14) | 27648 | (i3 & 112) | (i3 & 896) | (458752 & i7) | (i7 & 3670016), 0);
                f530Var2 = f530Var3;
                z3 = z4;
                buttonSize2 = buttonSize3;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new cpr(f530Var2, z3, buttonSize2, slsVar, zlsVar, i, i2, 2);
                return;
            }
            return;
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(f530 f530Var, boolean z, ButtonSize buttonSize, sls slsVar, a aVar, fid fidVar, int i) {
        int i2;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-153888674);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.c(buttonSize == null ? -1 : buttonSize.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.e(aVar) ? 16384 : 8192;
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = (i3 & 14) | 27648 | (i3 & 112) | (i3 & 896);
            int i5 = i3 << 6;
            d17.c(f530Var, true, buttonSize, ButtonStyle.Minor, ButtonForm.Circle, slsVar, aVar, btsVar, i4 | (458752 & i5) | (i5 & 3670016), 0);
            z2 = true;
        } else {
            btsVar.Y();
            z2 = z;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(f530Var, z2, buttonSize, slsVar, aVar, i);
        }
    }
}
