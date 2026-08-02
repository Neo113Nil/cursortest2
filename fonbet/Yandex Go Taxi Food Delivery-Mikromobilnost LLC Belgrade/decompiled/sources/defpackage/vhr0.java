package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class vhr0 {
    public final int a;
    public boolean b = true;
    public final Matrix c = new Matrix();
    public final Path d = new Path();
    public final Region e = new Region();
    public final Paint f;

    public vhr0(int i, int i2) {
        this.a = i;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i2);
        this.f = paint;
    }

    public abstract void a(List list);

    public abstract boolean b();

    public abstract void c(Rect rect, Path path, Matrix matrix);

    public abstract void d(Canvas canvas, Paint paint);

    public abstract void e();
}
