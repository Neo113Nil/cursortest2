package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public final class pp8 {
    public final Paint a;
    public final Path b;
    public boolean c;
    public final float d;
    public final float e;
    public final float f;
    public final RectF g;
    public final /* synthetic */ tp8 h;

    public pp8(tp8 tp8Var) {
        this.h = tp8Var;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Path();
        this.d = bg3.y(Double.valueOf(0.5d), tp8Var.f());
        this.e = bg3.y(6, tp8Var.f());
        this.f = bg3.y(2, tp8Var.f());
        this.g = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
    }
}
