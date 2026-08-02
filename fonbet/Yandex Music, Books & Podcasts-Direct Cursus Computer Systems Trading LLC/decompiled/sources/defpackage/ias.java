package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes3.dex */
public final class ias {
    public final luq a;
    public final Rect b = new Rect();
    public final Paint c;
    public String d;
    public float e;
    public float f;

    public ias(luq luqVar) {
        this.a = luqVar;
        Paint paint = new Paint(1);
        paint.setTextSize(luqVar.a);
        paint.setLetterSpacing(luqVar.b);
        paint.setColor(luqVar.f);
        paint.setTypeface(luqVar.c);
        paint.setStyle(Paint.Style.FILL);
        if (woe.m()) {
            paint.setFontVariationSettings(null);
        }
        this.c = paint;
    }
}
