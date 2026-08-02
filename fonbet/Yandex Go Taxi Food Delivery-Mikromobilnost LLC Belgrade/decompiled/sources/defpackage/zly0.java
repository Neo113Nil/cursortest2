package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes11.dex */
public final class zly0 {
    public final nps0 a;
    public final Rect b = new Rect();
    public final Paint c;
    public String d;
    public float e;
    public float f;

    public zly0(nps0 nps0Var) {
        this.a = nps0Var;
        Paint paint = new Paint(1);
        paint.setTextSize(nps0Var.a);
        paint.setLetterSpacing(nps0Var.b);
        paint.setColor(nps0Var.f);
        paint.setTypeface(nps0Var.c);
        paint.setStyle(Paint.Style.FILL);
        paint.setFontVariationSettings(null);
        this.c = paint;
    }
}
