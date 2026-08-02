package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes14.dex */
public final class qew0 {
    public final Context a;
    public float b;
    public final RectF c = new RectF();
    public final Path d = new Path();
    public final Paint e;

    public qew0(Context context) {
        this.a = context;
        Paint paint = new Paint(1);
        paint.setColor(qje.u(context.getTheme(), xng0.bgFloating));
        this.e = paint;
    }
}
