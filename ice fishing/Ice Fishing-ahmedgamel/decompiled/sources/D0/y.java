package D0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final D f619a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0301b f620b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f619a = new E();
        } else {
            f619a = new D();
        }
        f620b = new C0301b(Float.class, "translationAlpha", 5);
        new C0301b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i6, int i9, int i10) {
        f619a.q(view, i, i6, i9, i10);
    }

    public static void b(View view, int i) {
        f619a.m(view, i);
    }
}
