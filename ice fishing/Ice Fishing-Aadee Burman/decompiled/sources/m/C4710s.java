package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import q2.C4896n;

/* renamed from: m.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4710s {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f39221b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C4710s f39222c;

    /* renamed from: a, reason: collision with root package name */
    public I0 f39223a;

    public static synchronized C4710s a() {
        C4710s c4710s;
        synchronized (C4710s.class) {
            try {
                if (f39222c == null) {
                    d();
                }
                c4710s = f39222c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4710s;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e9;
        synchronized (C4710s.class) {
            e9 = I0.e(i, mode);
        }
        return e9;
    }

    public static synchronized void d() {
        synchronized (C4710s.class) {
            if (f39222c == null) {
                C4710s c4710s = new C4710s();
                f39222c = c4710s;
                c4710s.f39223a = I0.b();
                I0 i02 = f39222c.f39223a;
                C4896n c4896n = new C4896n(6);
                synchronized (i02) {
                    i02.f39019e = c4896n;
                }
            }
        }
    }

    public static void e(Drawable drawable, i8.h hVar, int[] iArr) {
        PorterDuff.Mode mode = I0.f39012f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z3 = hVar.f38123b;
        if (!z3 && !hVar.f38122a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z3 ? (ColorStateList) hVar.f38124c : null;
        PorterDuff.Mode mode2 = hVar.f38122a ? (PorterDuff.Mode) hVar.f38125d : I0.f39012f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = I0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f39223a.c(context, i);
    }
}
