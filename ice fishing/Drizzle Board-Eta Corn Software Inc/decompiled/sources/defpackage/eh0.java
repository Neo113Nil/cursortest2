package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class eh0 {
    public static final d4 NCTxEWno;
    public static final kh0 qoPGr6Ce;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            qoPGr6Ce = new lh0();
        } else {
            qoPGr6Ce = new kh0();
        }
        NCTxEWno = new d4(Float.class, "translationAlpha", 10);
        new d4(Rect.class, "clipBounds", 11);
    }

    public static void NCTxEWno(View view, int i) {
        qoPGr6Ce.k3x7lurq(view, i);
    }

    public static void qoPGr6Ce(View view, int i, int i2, int i3, int i4) {
        qoPGr6Ce.eVhOlqcC(view, i, i2, i3, i4);
    }
}
