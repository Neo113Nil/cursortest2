package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public abstract class frv {
    public static final jyr a = btf.b(new h8v(20));

    public static Point a() {
        WindowManager j = l1b.j((Context) l18.b.c(hag.I(Context.class)));
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = j.getMaximumWindowMetrics().getBounds();
            bounds.getClass();
            return new Point(bounds.width(), bounds.height());
        }
        Point point = new Point();
        j.getDefaultDisplay().getRealSize(point);
        return point;
    }

    public static final int b() {
        Point point = (Point) a.getValue();
        return Math.min(point.x, point.y);
    }
}
