package ru.yandex.taxi.summary.promotions.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import defpackage.mqg0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import defpackage.y6i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0017¨\u0006#"}, d2 = {"Lru/yandex/taxi/summary/promotions/ui/PromotionCircularProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "current", "total", "Lzy11;", "setProgress", "(II)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "currentValue", CA20Status.STATUS_USER_I, "totalValue", "Landroid/graphics/Paint;", "trackPaint", "Landroid/graphics/Paint;", "progressPaint", "textPaint", "Landroid/graphics/RectF;", "arcRect", "Landroid/graphics/RectF;", "defaultSizePx", "strokeWidthPx", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PromotionCircularProgressView extends View {
    private final RectF arcRect;
    private int currentValue;
    private final int defaultSizePx;
    private final Paint progressPaint;
    private final int strokeWidthPx;
    private final Paint textPaint;
    private int totalValue;
    private final Paint trackPaint;

    public PromotionCircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.totalValue = 1;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.trackPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.BUTT);
        this.progressPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint3.setTextAlign(Paint.Align.CENTER);
        this.textPaint = paint3;
        this.arcRect = new RectF();
        this.defaultSizePx = tje.v(getContext(), 40.0f);
        int v = tje.v(getContext(), 4.0f);
        this.strokeWidthPx = v;
        float f = v;
        paint.setStrokeWidth(f);
        paint2.setStrokeWidth(f);
        paint3.setTextSize(tje.x(getContext(), 13.0f));
        paint.setColor(qje.t(xng0.controlMinor, getContext()));
        paint2.setColor(getContext().getColor(mqg0.component_green_toxic));
        paint3.setColor(qje.t(xng0.textMain, getContext()));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = (Math.min(getWidth(), getHeight()) / 2.0f) - (this.strokeWidthPx / 2.0f);
        this.arcRect.set(width - min, height - min, width + min, min + height);
        canvas.drawOval(this.arcRect, this.trackPaint);
        canvas.drawArc(this.arcRect, -90.0f, (this.currentValue / this.totalValue) * 360.0f, false, this.progressPaint);
        canvas.drawText(this.currentValue + "/" + this.totalValue, width, height - ((this.textPaint.ascent() + this.textPaint.descent()) / 2.0f), this.textPaint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSize(this.defaultSizePx, widthMeasureSpec), View.resolveSize(this.defaultSizePx, heightMeasureSpec));
    }

    public final void setProgress(int current, int total) {
        if (total <= 0) {
            total = 1;
        }
        this.currentValue = y6i0.d(current, 0, total);
        this.totalValue = total;
        invalidate();
    }

    public PromotionCircularProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PromotionCircularProgressView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PromotionCircularProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
