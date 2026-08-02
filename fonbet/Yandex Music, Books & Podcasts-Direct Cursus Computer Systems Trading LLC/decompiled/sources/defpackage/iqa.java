package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;

/* loaded from: classes3.dex */
public abstract class iqa {
    public final h7g a;
    public final Path b;
    public final Path c;
    public final PathMeasure d;
    public final Matrix e;

    public iqa(h7g h7gVar) {
        Path path = new Path();
        this.b = path;
        this.c = new Path();
        this.d = new PathMeasure(path, false);
        this.a = h7gVar;
        this.e = new Matrix();
    }

    public static float d(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract int a();

    public abstract void b();

    public final void c(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        this.a.d();
        m6g m6gVar = (m6g) this;
        if (m6gVar.f != rect.width()) {
            m6gVar.f = rect.width();
            m6gVar.b();
        }
        float a = m6gVar.a();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - a) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        h7g h7gVar = m6gVar.a;
        if (h7gVar.q) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = m6gVar.f / 2.0f;
        float f3 = a / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        m6gVar.g = h7gVar.a * f;
        m6gVar.h = Math.min(r1 / 2, h7gVar.a()) * f;
        m6gVar.j = h7gVar.l * f;
        m6gVar.i = Math.min(h7gVar.a / 2.0f, h7gVar.b()) * f;
        if (z || z2) {
            if ((z && h7gVar.g == 2) || (z2 && h7gVar.h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && h7gVar.h != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * h7gVar.a) / 2.0f);
            }
        }
        if (z2 && h7gVar.h == 3) {
            m6gVar.n = f;
        } else {
            m6gVar.n = 1.0f;
        }
    }
}
