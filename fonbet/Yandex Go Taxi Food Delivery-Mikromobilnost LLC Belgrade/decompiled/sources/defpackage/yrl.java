package defpackage;

import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class yrl {
    public static final AppColor$Palette a = AppColor$Palette.Line;
    public static final float b;
    public static final float c;

    static {
        AppColor$Palette appColor$Palette = AppColor$Palette.Text;
        b = 16.0f;
        c = 56.0f;
    }

    public static final void a(f530 f530Var, float f, wp2 wp2Var, qor qorVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-921201118);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.b(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(wp2Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(qorVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            long n = tje.n(wp2Var, btsVar);
            float w0 = ((fwi) btsVar.m(j.h)).w0(f);
            f530 g = s1a1.g(f530Var, 1.0f);
            boolean d = btsVar.d(n) | ((i2 & 7168) == 2048) | btsVar.b(w0);
            Object Q = btsVar.Q();
            if (d || Q == did.a) {
                Q = new eg2(qorVar, n, w0);
                btsVar.o0(Q);
            }
            qeb1.a(0, btsVar, (tls) Q, g);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xrl(f, i, 0, f530Var, wp2Var, qorVar);
        }
    }

    public static final void b(int i, int i2, fid fidVar, f530 f530Var) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1699094283);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 432;
        int i6 = 1;
        if (btsVar.V(i5 & 1, (i5 & 147) != 146)) {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            a(ljs0.c(f530Var, 1.0f), 0.5f, a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pta(f530Var, i, i2, i6);
        }
    }

    public static final void c(f530 f530Var, qor qorVar, fid fidVar, int i, int i2) {
        int i3;
        int i4;
        qor qorVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1738406439);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 432;
        } else {
            i4 = (btsVar.k(qorVar) ? 256 : 128) | i6;
        }
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                f530Var = c530.a;
            }
            if (i7 != 0) {
                qorVar = null;
            }
            qor qorVar3 = qorVar;
            a(an91.m(ljs0.c(f530Var, 1.0f), b, 0.0f, 2), 0.5f, a, qorVar3, btsVar, (i4 << 3) & 7168);
            qorVar2 = qorVar3;
        } else {
            btsVar.Y();
            qorVar2 = qorVar;
        }
        f530 f530Var2 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new url(f530Var2, qorVar2, i, i2, 2);
        }
    }

    public static final void d(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1826715543);
        int i2 = i | 438;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            a(an91.o(ljs0.c(c530Var, 1.0f), c, 0.0f, 0.0f, 0.0f, 14), 0.5f, a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL);
            f530Var = c530Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 16);
        }
    }

    public static final void e(f530 f530Var, qor qorVar, fid fidVar, int i, int i2) {
        int i3;
        int i4;
        qor qorVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(552505161);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 432;
        } else {
            i4 = (btsVar.k(qorVar) ? 256 : 128) | i6;
        }
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                f530Var = c530.a;
            }
            if (i7 != 0) {
                qorVar = null;
            }
            qor qorVar3 = qorVar;
            a(an91.o(ljs0.c(f530Var, 1.0f), c, 0.0f, b, 0.0f, 10), 0.5f, a, qorVar3, btsVar, (i4 << 3) & 7168);
            qorVar2 = qorVar3;
        } else {
            btsVar.Y();
            qorVar2 = qorVar;
        }
        f530 f530Var2 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new url(f530Var2, qorVar2, i, i2, 1);
        }
    }
}
