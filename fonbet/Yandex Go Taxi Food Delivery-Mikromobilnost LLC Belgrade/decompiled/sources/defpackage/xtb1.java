package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class xtb1 {
    public static au2 a;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Integer num, obm obmVar, Integer num2, f530 f530Var, fid fidVar, int i, int i2) {
        Integer num3;
        int i3;
        f530 f530Var2;
        Integer num4;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(479899884);
        int i4 = (btsVar.k(num) ? 4 : 2) | i | (btsVar.e(obmVar) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            num3 = num2;
        } else {
            num3 = num2;
            i3 = i4 | (btsVar.k(num3) ? 256 : 128);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 2048 : 1024;
            if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
                btsVar.Y();
                num4 = num3;
            } else {
                c36 c36Var = null;
                num4 = i5 != 0 ? null : num3;
                if (i6 != 0) {
                    f530Var2 = c530.a;
                }
                if (num != null) {
                    btsVar.e0(-1248511499);
                    int intValue = num.intValue();
                    up2 up2Var = num4 != null ? new up2(rzo.d(num4.intValue())) : null;
                    int i7 = ((i3 >> 6) & 112) | (i3 & 14) | 384;
                    pa90 a2 = wya1.a(intValue, i7 & 14, btsVar);
                    if (up2Var == null) {
                        btsVar.e0(-1411607277);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1411607276);
                        c36Var = tse0.e(tje.n(up2Var, btsVar), 5, btsVar, false);
                    }
                    o4b1.b(a2, null, f530Var2, null, null, 0.0f, c36Var, btsVar, 56 | ((i7 << 3) & 896), 56);
                    btsVar.t(false);
                } else if (obmVar != null) {
                    btsVar.e0(-1248308666);
                    boolean k = btsVar.k(obmVar.a) | ((i3 & 896) == 256);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Drawable drawable = obmVar.b;
                        drawable.mutate();
                        if (num4 != null) {
                            drawable.setTintList(ColorStateList.valueOf(num4.intValue()));
                        }
                        Q = new u92(ffx.d0(drawable, 0, 0, 7));
                        btsVar.o0(Q);
                    }
                    o4b1.b(new a16((l8v) Q), null, f530Var2, null, null, 0.0f, null, btsVar, 56 | ((i3 >> 3) & 896), 120);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1247889546);
                    btsVar.t(false);
                }
            }
            f530 f530Var3 = f530Var2;
            v = btsVar.v();
            if (v == null) {
                v.d = new p91(num, obmVar, num4, f530Var3, i, i2);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
        }
        f530 f530Var32 = f530Var2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final boolean b(Object obj, String str) {
        return Objects.equals(obj, str);
    }

    public static final au2 c() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("CrossL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 g = tse0.g(10.58f, 12.0f, 4.0f, 5.42f);
        g.h(5.42f, 4.0f);
        g.h(12.0f, 10.58f);
        g.h(18.58f, 4.0f);
        g.h(20.0f, 5.42f);
        g.h(13.42f, 12.0f);
        g.h(20.0f, 18.58f);
        g.h(18.58f, 20.0f);
        g.h(12.0f, 13.42f);
        tse0.u(g, 5.42f, 20.0f, 4.0f, 18.58f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", g.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final int d(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static final boolean e(Object obj, Object obj2) {
        return !Objects.equals(obj, obj2);
    }
}
