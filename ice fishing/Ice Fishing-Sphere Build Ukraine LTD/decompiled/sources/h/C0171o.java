package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import d0.C0114d;

/* renamed from: h.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171o {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2243b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0171o f2244c;

    /* renamed from: a, reason: collision with root package name */
    public O f2245a;

    public static synchronized void b() {
        synchronized (C0171o.class) {
            if (f2244c == null) {
                C0171o c0171o = new C0171o();
                f2244c = c0171o;
                c0171o.f2245a = O.b();
                O o2 = f2244c.f2245a;
                C0114d c0114d = new C0114d();
                synchronized (o2) {
                    o2.f2133e = c0114d;
                }
            }
        }
    }

    public static void c(Drawable drawable, j0 j0Var, int[] iArr) {
        PorterDuff.Mode mode = O.f2126f;
        if (AbstractC0180y.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z2 = j0Var.f2220d;
        if (!z2 && !j0Var.f2219c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? j0Var.f2217a : null;
        PorterDuff.Mode mode2 = j0Var.f2219c ? j0Var.f2218b : O.f2126f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = O.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable a(Context context, int i2) {
        return this.f2245a.c(context, i2);
    }
}
