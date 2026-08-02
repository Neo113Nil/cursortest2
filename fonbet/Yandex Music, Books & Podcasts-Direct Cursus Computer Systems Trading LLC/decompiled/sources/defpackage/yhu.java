package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class yhu {
    public static final aiu a;
    public static final mb4 b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new biu();
        } else {
            a = new aiu();
        }
        b = new mb4(Float.class, "translationAlpha", 14);
        new mb4(Rect.class, "clipBounds", 15);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.O(view, i, i2, i3, i4);
    }

    public static void b(int i, View view) {
        a.P(i, view);
    }
}
