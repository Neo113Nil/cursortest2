package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.go.design.compose.loading.b;
import com.yandex.go.design.compose.slot.body.BodyAlign;

/* loaded from: classes11.dex */
public abstract class y76 {
    public static final a a;

    static {
        k3d.a.getClass();
        a = k3d.b;
        a aVar = k3d.c;
        a aVar2 = k3d.d;
    }

    public static final void a(ebp0 ebp0Var, f530 f530Var, BodyAlign bodyAlign, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-245416028);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ebp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.c(bodyAlign == null ? -1 : bodyAlign.ordinal()) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            jt1 alignment = bodyAlign.getAlignment();
            ebp0Var.getClass();
            cj6 cj6Var = cj6.a;
            c530 c530Var = c530.a;
            f530 b = ljs0.b(ljs0.e(cj6Var.a(c530Var, alignment), 16.0f), 16.0f, 0.0f, 2);
            int i4 = x76.a[bodyAlign.ordinal()];
            if (i4 == 1) {
                f = 0.87f;
            } else if (i4 == 2) {
                f = 0.67f;
            } else {
                if (i4 != 3) {
                    w511.b();
                    return;
                }
                f = 0.93f;
            }
            b.a(ljs0.c(b, f), null, false, null, null, null, false, btsVar, 0, 254);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0((Object) ebp0Var, f530Var2, (Object) bodyAlign, i, 21);
        }
    }
}
