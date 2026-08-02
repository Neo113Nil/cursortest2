package ru.yandex.taxi.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import defpackage.tje;
import defpackage.ucj;
import defpackage.xw31;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 -2\u00020\u0001:\u0001.B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JW\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010)\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*¨\u0006/"}, d2 = {"Lru/yandex/taxi/widget/DiagonallyStrikethroughSpan;", "Landroid/text/style/ReplacementSpan;", "Landroid/content/Context;", "context", "", "strikethroughColor", "textColor", "<init>", "(Landroid/content/Context;II)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "width", "setStrokeWidth", "(F)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/content/Context;", CA20Status.STATUS_USER_I, "tiltStartRatio", "F", "tiltEndRatio", "strokeWidth", "Companion", "ucj", "media_utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiagonallyStrikethroughSpan extends ReplacementSpan {
    public static final ucj Companion = new ucj();
    private static final float DEFAULT_STROKE_WIDTH_DP = 1.5f;
    private final Context context;
    private final int strikethroughColor;
    private float strokeWidth;
    private final int textColor;
    private final float tiltStartRatio = 0.5f;
    private final float tiltEndRatio = 1.5f;

    public DiagonallyStrikethroughSpan(Context context, int i, int i2) {
        this.context = context;
        this.strikethroughColor = i;
        this.textColor = i2;
        this.strokeWidth = tje.x(context, 1.5f);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        Paint paint2;
        Rect rect = new Rect();
        paint.getTextBounds(text.toString(), start, end, rect);
        boolean n = xw31.n(this.context);
        int color = paint.getColor();
        float strokeWidth = paint.getStrokeWidth();
        paint.setColor(this.textColor);
        float f = y;
        canvas.drawText(text, start, end, x, f, paint);
        paint.setStrokeWidth(this.strokeWidth);
        paint.setColor(this.strikethroughColor);
        if (n) {
            canvas.drawLine(x + rect.right, (rect.exactCenterY() * this.tiltEndRatio) + f, x + rect.left, (rect.exactCenterY() * this.tiltStartRatio) + f, paint);
            paint2 = paint;
        } else {
            canvas.drawLine(x + rect.left, (rect.exactCenterY() * this.tiltStartRatio) + f, x + rect.right, (rect.exactCenterY() * this.tiltEndRatio) + f, paint);
            paint2 = paint;
        }
        paint2.setColor(color);
        paint2.setStrokeWidth(strokeWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DiagonallyStrikethroughSpan.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DiagonallyStrikethroughSpan diagonallyStrikethroughSpan = (DiagonallyStrikethroughSpan) other;
        return this.strikethroughColor == diagonallyStrikethroughSpan.strikethroughColor && this.textColor == diagonallyStrikethroughSpan.textColor;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        if (fm != null) {
            paint.getFontMetricsInt(fm);
        }
        return (int) paint.measureText(text, start, end);
    }

    public int hashCode() {
        return (this.strikethroughColor * 31) + this.textColor;
    }

    public final void setStrokeWidth(float width) {
        this.strokeWidth = width;
    }
}
