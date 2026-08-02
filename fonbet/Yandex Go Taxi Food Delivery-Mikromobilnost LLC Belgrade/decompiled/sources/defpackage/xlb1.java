package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.o;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;

/* loaded from: classes13.dex */
public abstract class xlb1 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(sls slsVar, f530 f530Var, boolean z, ButtonSize buttonSize, zls zlsVar, zls zlsVar2, zls zlsVar3, zls zlsVar4, to5 to5Var, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        ButtonSize buttonSize2;
        zls zlsVar5;
        zls zlsVar6;
        zls zlsVar7;
        to5 to5Var2;
        f530 f530Var3;
        boolean z3;
        aii0 v;
        f530 f530Var4;
        int i6;
        zls zlsVar8;
        to5 to5Var3;
        zls zlsVar9;
        zls zlsVar10;
        ButtonSize buttonSize3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-953747150);
        int i7 = i | (btsVar.e(slsVar) ? 4 : 2);
        int i8 = i2 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i7 |= btsVar.k(f530Var2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i4 = i7 | 384;
                z2 = z;
            } else {
                z2 = z;
                i4 = i7 | (btsVar.a(z2) ? 256 : 128);
            }
            i5 = i4 | 910699520;
            if (btsVar.V(i5 & 1, (306783379 & i5) == 306783378)) {
                btsVar.Y();
                buttonSize2 = buttonSize;
                zlsVar5 = zlsVar;
                zlsVar6 = zlsVar3;
                zlsVar7 = zlsVar4;
                to5Var2 = to5Var;
                f530Var3 = f530Var2;
                z3 = z2;
            } else {
                btsVar.a0();
                if ((i & 1) == 0 || btsVar.C()) {
                    f530Var4 = i8 != 0 ? c530.a : f530Var2;
                    if (i3 != 0) {
                        z2 = true;
                    }
                    ButtonSize buttonSize4 = ButtonSize.L;
                    a aVar = p8y.a;
                    a aVar2 = x901.a;
                    a aVar3 = ka01.a;
                    i6 = i5 & (-33087489);
                    zlsVar8 = aVar2;
                    to5Var3 = x4c.E;
                    zlsVar9 = aVar3;
                    zlsVar10 = aVar;
                    buttonSize3 = buttonSize4;
                } else {
                    btsVar.Y();
                    i6 = i5 & (-33087489);
                    buttonSize3 = buttonSize;
                    zlsVar10 = zlsVar;
                    zlsVar8 = zlsVar3;
                    zlsVar9 = zlsVar4;
                    to5Var3 = to5Var;
                    f530Var4 = f530Var2;
                }
                boolean z4 = z2;
                btsVar.u();
                vcb1.a(slsVar, f530Var4, z4, buttonSize3, ButtonStyle.Minor, ButtonForm.Squircle, zlsVar10, zlsVar2, zlsVar8, zlsVar9, to5Var3, btsVar, (i6 & 896) | (i6 & 14) | 221184 | (i6 & 112) | 12585984, 54, 0);
                f530Var3 = f530Var4;
                z3 = z4;
                buttonSize2 = buttonSize3;
                zlsVar5 = zlsVar10;
                zlsVar6 = zlsVar8;
                zlsVar7 = zlsVar9;
                to5Var2 = to5Var3;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new f400(slsVar, f530Var3, z3, buttonSize2, zlsVar5, zlsVar2, zlsVar6, zlsVar7, to5Var2, i, i2, 1);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        i5 = i4 | 910699520;
        if (btsVar.V(i5 & 1, (306783379 & i5) == 306783378)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final zii0 b(o.a aVar, int i, vw01 vw01Var, dry0 dry0Var, boolean z, int i2) {
        zii0 c = dry0Var != null ? dry0Var.c(vw01Var.b.r(i)) : zii0.e;
        float f = c.a;
        int f0 = aVar.f0(2.0f);
        return zii0.b(c, z ? (i2 - f) - f0 : f, z ? i2 - f : f0 + f, 0.0f, 10);
    }

    public static final lqb c(ypb ypbVar) {
        CharSequence charSequence = ypbVar.d;
        CharSequence charSequence2 = ypbVar.a;
        return charSequence != null ? new jqb(charSequence2, charSequence) : new kqb(charSequence2);
    }
}
