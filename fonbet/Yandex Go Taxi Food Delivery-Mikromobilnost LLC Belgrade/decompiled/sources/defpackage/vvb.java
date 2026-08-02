package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class vvb {
    public final xvb a;
    public final ViewGroup b;
    public final Paint c;
    public wvb d;
    public Drawable e;

    /* JADX WARN: Multi-variable type inference failed */
    public vvb(xvb xvbVar) {
        this.a = xvbVar;
        View view = (View) xvbVar;
        this.b = (ViewGroup) view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(0);
    }

    public final void a(Canvas canvas) {
        Canvas canvas2;
        wvb wvbVar = this.d;
        boolean z = wvbVar == null || wvbVar.c == Float.MAX_VALUE;
        Paint paint = this.c;
        ViewGroup viewGroup = this.b;
        xvb xvbVar = this.a;
        if (z) {
            xvbVar.actualDraw(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                float width = viewGroup.getWidth();
                float height = viewGroup.getHeight();
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, width, height, paint);
            }
            canvas2 = canvas;
        } else {
            xvbVar.actualDraw(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                float width2 = viewGroup.getWidth();
                float height2 = viewGroup.getHeight();
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, width2, height2, paint);
            }
            canvas2 = canvas;
        }
        Drawable drawable = this.e;
        if (drawable == null || this.d == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        float width3 = this.d.a - (bounds.width() / 2.0f);
        float height3 = this.d.b - (bounds.height() / 2.0f);
        canvas2.translate(width3, height3);
        this.e.draw(canvas2);
        canvas2.translate(-width3, -height3);
    }

    public final wvb b() {
        wvb wvbVar = this.d;
        if (wvbVar == null) {
            return null;
        }
        wvb wvbVar2 = new wvb(wvbVar);
        if (wvbVar2.c == Float.MAX_VALUE) {
            float f = wvbVar2.a;
            float f2 = wvbVar2.b;
            ViewGroup viewGroup = this.b;
            wvbVar2.c = uh6.n(f, f2, viewGroup.getWidth(), viewGroup.getHeight());
        }
        return wvbVar2;
    }

    public final boolean c() {
        if (this.a.actualIsOpaque()) {
            wvb wvbVar = this.d;
            if (wvbVar == null || wvbVar.c == Float.MAX_VALUE) {
                return true;
            }
        }
        return false;
    }

    public final void d(Drawable drawable) {
        this.e = drawable;
        this.b.invalidate();
    }

    public final void e(int i) {
        this.c.setColor(i);
        this.b.invalidate();
    }

    public final void f(wvb wvbVar) {
        ViewGroup viewGroup = this.b;
        if (wvbVar == null) {
            this.d = null;
        } else {
            wvb wvbVar2 = this.d;
            if (wvbVar2 == null) {
                this.d = new wvb(wvbVar);
            } else {
                float f = wvbVar.a;
                float f2 = wvbVar.b;
                float f3 = wvbVar.c;
                wvbVar2.a = f;
                wvbVar2.b = f2;
                wvbVar2.c = f3;
            }
            if (wvbVar.c + 1.0E-4f >= uh6.n(wvbVar.a, wvbVar.b, viewGroup.getWidth(), viewGroup.getHeight())) {
                this.d.c = Float.MAX_VALUE;
            }
        }
        viewGroup.invalidate();
    }
}
