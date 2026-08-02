package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import io.appmetrica.analytics.BuildConfig;

/* loaded from: classes5.dex */
public abstract class rm91 {
    public static final ak00 a = new ak00(27);

    public static final void a(tre treVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        uo5 uo5Var;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1944781354);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(treVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            int i4 = e151.a[treVar.d.ordinal()];
            if (i4 == 1) {
                uo5Var = x4c.w;
            } else if (i4 == 2) {
                uo5Var = x4c.b;
            } else if (i4 == 3) {
                uo5Var = x4c.A;
            } else {
                if (i4 != 4) {
                    w511.b();
                    return;
                }
                uo5Var = x4c.C;
            }
            f530 k = an91.k(cj6Var.a(f530Var, uo5Var), 12.0f);
            ldc ldcVar = treVar.b;
            if (ldcVar == null) {
                btsVar.e0(-624089924);
                j = ((el51) btsVar.m(gl51.a)).c();
                btsVar.t(false);
            } else {
                btsVar.e0(-624091288);
                btsVar.t(false);
                j = ldcVar.a;
            }
            y3b1.a(k, j, 21.0f, 0.0f, 0.0f, 0L, wwg.S(570915132, true, new jvx0(29, treVar), btsVar), btsVar, 12585984, BuildConfig.API_LEVEL);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(treVar, f530Var, i, 23);
        }
    }

    public static final void b(int i, fid fidVar, f530 f530Var, String str) {
        f530 f530Var2;
        String str2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-376846722);
        int i2 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530Var2 = f530Var;
            str2 = str;
            y3b1.c(str2, f530Var2, ldc.f, dl51.x, btsVar, (i2 & 14) | 384 | (i2 & 112), 16);
        } else {
            f530Var2 = f530Var;
            str2 = str;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kga(str2, f530Var2, i, 6);
        }
    }

    public static final void c(Drawable drawable, Canvas canvas, float f, float f2) {
        int save = canvas.save();
        if (f != 1.0f) {
            canvas.scale(f, f, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        }
        if (f2 != 0.0f) {
            canvas.rotate(f2, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        }
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public static final Drawable d(Drawable drawable, int i) {
        Drawable mutate = drawable.mutate();
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        return mutate;
    }
}
