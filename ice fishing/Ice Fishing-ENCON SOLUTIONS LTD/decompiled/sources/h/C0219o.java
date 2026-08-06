package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* renamed from: h.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219o {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3310b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0219o f3311c;

    /* renamed from: a, reason: collision with root package name */
    public N f3312a;

    public static synchronized void b() {
        synchronized (C0219o.class) {
            if (f3311c == null) {
                C0219o c0219o = new C0219o();
                f3311c = c0219o;
                c0219o.f3312a = N.b();
                N n2 = f3311c.f3312a;
                Q0.c cVar = new Q0.c();
                synchronized (n2) {
                    n2.f3192e = cVar;
                }
            }
        }
    }

    public static void c(Drawable drawable, J1.h hVar, int[] iArr) {
        PorterDuff.Mode mode = N.f3185f;
        if (AbstractC0227x.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z2 = hVar.f867b;
        if (!z2 && !hVar.f866a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) hVar.f868c : null;
        PorterDuff.Mode mode2 = hVar.f866a ? (PorterDuff.Mode) hVar.f869d : N.f3185f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = N.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable a(Context context, int i2) {
        return this.f3312a.c(context, i2);
    }
}
