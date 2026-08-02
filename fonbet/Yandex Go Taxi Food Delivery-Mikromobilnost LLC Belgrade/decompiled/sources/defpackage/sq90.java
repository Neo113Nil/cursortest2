package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes11.dex */
public class sq90 implements x73 {
    public final Path a;
    public final Path b;
    public final Path c;
    public final RectF d;
    public final RectF e;
    public final RectF f;
    public final PointF g;
    public final PointF h;
    public final Matrix i;
    public RectF j;
    public final Paint k;
    public PathMeasure l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;

    public sq90(Path path) {
        RectF rectF = new RectF();
        this.d = rectF;
        RectF rectF2 = new RectF();
        this.e = rectF2;
        this.f = new RectF();
        this.g = new PointF(0.0f, 0.0f);
        this.h = new PointF(0.0f, 0.0f);
        this.i = new Matrix();
        this.k = new Paint(1);
        this.m = 1.0f;
        this.a = path;
        this.b = new Path(path);
        this.c = new Path(path);
        a();
        rectF2.set(rectF);
    }

    public final void a() {
        Path path = this.a;
        RectF rectF = this.d;
        path.computeBounds(rectF, true);
        float width = rectF.width();
        float height = rectF.height();
        if (width > height) {
            rectF.inset(0.0f, -((width - height) / 2.0f));
        } else if (width < height) {
            rectF.inset(-((height - width) / 2.0f), 0.0f);
        }
    }

    public final void b() {
        float f = this.m;
        if (f != 1.0f) {
            float f2 = (f + 0.0f) % 1.0f;
            if (this.l == null) {
                this.l = new PathMeasure();
            }
            this.l.setPath(this.b, false);
            float length = this.l.getLength();
            float f3 = 0.0f * length;
            float f4 = f2 * length;
            Path path = this.c;
            path.reset();
            PathMeasure pathMeasure = this.l;
            if (f3 > f4) {
                pathMeasure.getSegment(f3, length, path, true);
                this.l.getSegment(0.0f, f4, path, true);
            } else {
                pathMeasure.getSegment(f3, f4, path, true);
            }
            path.rLineTo(0.0f, 0.0f);
        }
    }

    public sq90() {
        this.d = new RectF();
        this.e = new RectF();
        this.f = new RectF();
        this.g = new PointF(0.0f, 0.0f);
        this.h = new PointF(0.0f, 0.0f);
        this.i = new Matrix();
        this.k = new Paint(1);
        this.m = 1.0f;
        this.a = new Path();
        this.b = new Path();
        this.c = new Path();
    }
}
