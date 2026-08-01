package p0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0321C f4216a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0324b f4217b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f4216a = new C0322D();
        } else {
            f4216a = new C0321C();
        }
        f4217b = new C0324b(Float.class, "translationAlpha", 5);
        new C0324b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f4216a.E(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f4216a.B(view, i);
    }
}
