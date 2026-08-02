package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class rps0 {
    public static int a(Drawable drawable) {
        Rect bounds;
        if (drawable == null || (bounds = drawable.getBounds()) == null) {
            return 0;
        }
        return bounds.height();
    }

    public static int b(Drawable drawable) {
        Rect bounds;
        if (drawable == null || (bounds = drawable.getBounds()) == null) {
            return 0;
        }
        return bounds.width();
    }
}
