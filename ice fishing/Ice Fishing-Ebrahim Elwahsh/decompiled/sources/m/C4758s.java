package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import q2.C4903n;

/* renamed from: m.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4758s {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f39492b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C4758s f39493c;

    /* renamed from: a, reason: collision with root package name */
    public I0 f39494a;

    public static synchronized C4758s a() {
        C4758s c4758s;
        synchronized (C4758s.class) {
            try {
                if (f39493c == null) {
                    d();
                }
                c4758s = f39493c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4758s;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e6;
        synchronized (C4758s.class) {
            e6 = I0.e(i, mode);
        }
        return e6;
    }

    public static synchronized void d() {
        synchronized (C4758s.class) {
            if (f39493c == null) {
                C4758s c4758s = new C4758s();
                f39493c = c4758s;
                c4758s.f39494a = I0.b();
                I0 i02 = f39493c.f39494a;
                C4903n c4903n = new C4903n(6);
                synchronized (i02) {
                    i02.f39286e = c4903n;
                }
            }
        }
    }

    public static void e(Drawable drawable, e8.h hVar, int[] iArr) {
        PorterDuff.Mode mode = I0.f39279f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z8 = hVar.f37400b;
        if (!z8 && !hVar.f37399a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z8 ? (ColorStateList) hVar.f37401c : null;
        PorterDuff.Mode mode2 = hVar.f37399a ? (PorterDuff.Mode) hVar.f37402d : I0.f39279f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = I0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f39494a.c(context, i);
    }
}
