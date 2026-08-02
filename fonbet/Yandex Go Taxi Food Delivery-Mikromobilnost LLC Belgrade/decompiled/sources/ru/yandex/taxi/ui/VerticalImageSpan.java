package ru.yandex.taxi.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012JY\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/ui/VerticalImageSpan;", "Landroid/text/style/ImageSpan;", "Landroid/graphics/drawable/Drawable;", "image", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/graphics/Paint$FontMetricsInt;", "", "getCenterY", "(Landroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VerticalImageSpan extends ImageSpan {
    public VerticalImageSpan(Drawable drawable) {
        super(drawable);
    }

    private final int getCenterY(Paint.FontMetricsInt fontMetricsInt) {
        int i = fontMetricsInt.ascent;
        return x4e.c(fontMetricsInt.descent, i, 2, i);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        float centerY = (y + getCenterY(paint.getFontMetricsInt())) - (getDrawable().getBounds().height() / 2);
        int save = canvas.save();
        canvas.translate(x, centerY);
        try {
            getDrawable().draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        Rect bounds = getDrawable().getBounds();
        if (fm != null) {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int height = bounds.height();
            int centerY = getCenterY(fontMetricsInt) - (height / 2);
            fm.top = centerY;
            int i = height + centerY;
            fm.bottom = i;
            fm.ascent = centerY;
            fm.descent = i;
        }
        return bounds.right;
    }
}
