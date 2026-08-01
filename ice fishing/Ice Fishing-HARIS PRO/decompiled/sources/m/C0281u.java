package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: m.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f4026b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0281u f4027c;

    /* renamed from: a, reason: collision with root package name */
    public L0 f4028a;

    public static synchronized C0281u a() {
        C0281u c0281u;
        synchronized (C0281u.class) {
            try {
                if (f4027c == null) {
                    d();
                }
                c0281u = f4027c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0281u;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        synchronized (C0281u.class) {
            e = L0.e(i, mode);
        }
        return e;
    }

    public static synchronized void d() {
        synchronized (C0281u.class) {
            if (f4027c == null) {
                C0281u c0281u = new C0281u();
                f4027c = c0281u;
                c0281u.f4028a = L0.b();
                L0 l02 = f4027c.f4028a;
                C0279t c0279t = new C0279t();
                synchronized (l02) {
                    l02.e = c0279t;
                }
            }
        }
    }

    public static void e(Drawable drawable, S0 s0, int[] iArr) {
        PorterDuff.Mode mode = L0.f3846f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = s0.f3885d;
        if (!z2 && !s0.f3884c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? s0.f3882a : null;
        PorterDuff.Mode mode2 = s0.f3884c ? s0.f3883b : L0.f3846f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = L0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f4028a.c(context, i);
    }
}
