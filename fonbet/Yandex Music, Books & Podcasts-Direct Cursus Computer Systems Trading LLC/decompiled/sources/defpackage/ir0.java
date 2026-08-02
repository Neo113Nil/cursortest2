package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* loaded from: classes.dex */
public final class ir0 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static ir0 c;
    public w2o a;

    public static synchronized ir0 a() {
        ir0 ir0Var;
        synchronized (ir0.class) {
            try {
                if (c == null) {
                    d();
                }
                ir0Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ir0Var;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter f;
        synchronized (ir0.class) {
            f = w2o.f(i, mode);
        }
        return f;
    }

    public static synchronized void d() {
        synchronized (ir0.class) {
            if (c == null) {
                ir0 ir0Var = new ir0();
                c = ir0Var;
                ir0Var.a = w2o.c();
                w2o w2oVar = c.a;
                mmo mmoVar = new mmo(3);
                synchronized (w2oVar) {
                    w2oVar.e = mmoVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, kj3 kj3Var, int[] iArr) {
        PorterDuff.Mode mode = w2o.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = kj3Var.c;
        if (!z && !kj3Var.b) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? (ColorStateList) kj3Var.d : null;
        PorterDuff.Mode mode2 = kj3Var.b ? (PorterDuff.Mode) kj3Var.e : w2o.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = w2o.f(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.d(context, i);
    }
}
