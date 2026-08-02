package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;

/* loaded from: classes6.dex */
public final class xg20 {
    public final Paint a;
    public final Paint b;
    public final TextPaint c;
    public final int d;
    public final int e;
    public final int f;

    public xg20(zuj0 zuj0Var) {
        Paint paint = new Paint();
        this.a = paint;
        Paint paint2 = new Paint();
        this.b = paint2;
        TextPaint textPaint = new TextPaint();
        this.c = textPaint;
        avj0 avj0Var = (avj0) zuj0Var;
        this.d = avj0Var.c(xrg0.middle_map_point_size);
        this.e = avj0Var.c(xrg0.middle_map_point_border_size);
        this.f = avj0Var.a(xqg0.map_point_destination_color);
        int a = avj0Var.a(xqg0.map_point_destination_color);
        this.f = a;
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint2.setAntiAlias(true);
        paint2.setColor(-1);
        int[] iArr = up11.a;
        textPaint.setTypeface(eja1.w(3, 0));
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(avj0Var.b(xrg0.middle_paint_text_size));
    }
}
