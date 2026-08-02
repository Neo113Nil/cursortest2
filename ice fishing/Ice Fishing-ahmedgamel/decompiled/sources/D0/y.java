package D0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final D f515a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0289b f516b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f515a = new E();
        } else {
            f515a = new D();
        }
        f516b = new C0289b(Float.class, "translationAlpha", 5);
        new C0289b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i4, int i6, int i9) {
        f515a.Q(view, i, i4, i6, i9);
    }

    public static void b(View view, int i) {
        f515a.I(view, i);
    }
}
