package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.go.design.compose.loading.b;

/* loaded from: classes12.dex */
public abstract class s8y {
    public static final a a;

    static {
        a8d.a.getClass();
        a = a8d.b;
    }

    public static final void a(ibp0 ibp0Var, f530 f530Var, fid fidVar, int i, int i2) {
        int i3;
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1599098603);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            int i5 = r8y.a[ibp0Var.c().ordinal()];
            float f2 = 8.0f;
            float f3 = 40.0f;
            if (i5 != 1 && i5 != 2) {
                if (i5 == 3) {
                    f = 36.0f;
                } else {
                    if (i5 != 4) {
                        w511.b();
                        return;
                    }
                    f = 24.0f;
                }
                f2 = 4.0f;
                f3 = f;
            }
            b.a(ljs0.m(an91.m(f530Var, f2, 0.0f, 2), f3), null, false, null, null, null, false, btsVar, 0, 254);
        } else {
            btsVar.Y();
        }
        f530 f530Var2 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q12(i, i2, 5, ibp0Var, f530Var2);
        }
    }
}
