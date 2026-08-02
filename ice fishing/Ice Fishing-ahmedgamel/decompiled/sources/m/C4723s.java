package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import s2.C4945n;

/* renamed from: m.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4723s {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f39290b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C4723s f39291c;

    /* renamed from: a, reason: collision with root package name */
    public I0 f39292a;

    public static synchronized C4723s a() {
        C4723s c4723s;
        synchronized (C4723s.class) {
            try {
                if (f39291c == null) {
                    d();
                }
                c4723s = f39291c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4723s;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e9;
        synchronized (C4723s.class) {
            e9 = I0.e(i, mode);
        }
        return e9;
    }

    public static synchronized void d() {
        synchronized (C4723s.class) {
            if (f39291c == null) {
                C4723s c4723s = new C4723s();
                f39291c = c4723s;
                c4723s.f39292a = I0.b();
                I0 i02 = f39291c.f39292a;
                C4945n c4945n = new C4945n(6);
                synchronized (i02) {
                    i02.f39087e = c4945n;
                }
            }
        }
    }

    public static void e(Drawable drawable, i8.h hVar, int[] iArr) {
        PorterDuff.Mode mode = I0.f39080f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z6 = hVar.f38242b;
        if (!z6 && !hVar.f38241a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z6 ? (ColorStateList) hVar.f38243c : null;
        PorterDuff.Mode mode2 = hVar.f38241a ? (PorterDuff.Mode) hVar.f38244d : I0.f39080f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = I0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f39292a.c(context, i);
    }
}
