package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes11.dex */
public abstract class ytb1 {
    public static au2 a;

    public static final void a(int i, fid fidVar, f530 f530Var, String str) {
        f530 f530Var2;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1914006502);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int length = str.length();
            c530 c530Var2 = c530.a;
            if (length > 0) {
                btsVar.e0(-181769427);
                c530Var = c530Var2;
                jeb1.f(str, an91.o(c530Var2, 0.0f, 0.0f, 16.0f, 0.0f, 11), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar, (i2 & 14) | 384, 0, 16376);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                c530Var = c530Var2;
                btsVar.e0(-181616504);
                btsVar.t(false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kga(str, f530Var2, i, 5);
        }
    }

    public static final float b(Float[] fArr) {
        return fArr[0].floatValue();
    }

    public static final float c(Float[] fArr) {
        return fArr[1].floatValue();
    }
}
