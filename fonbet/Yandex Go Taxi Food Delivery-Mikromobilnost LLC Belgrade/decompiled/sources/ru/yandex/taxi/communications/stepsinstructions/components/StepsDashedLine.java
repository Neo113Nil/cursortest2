package ru.yandex.taxi.communications.stepsinstructions.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/yandex/taxi/communications/stepsinstructions/components/StepsDashedLine;", "Landroid/view/View;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "dotHeight", "F", "firstAndLastDotMargin", "dotWidth", "numberOfDots", CA20Status.STATUS_USER_I, "dotMarginPx", "Landroid/graphics/Paint;", "dotPaint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StepsDashedLine extends View implements nwy0 {
    public static final int $stable = 8;
    private float dotHeight;
    private final float dotMarginPx;
    private Paint dotPaint;
    private float dotWidth;
    private float firstAndLastDotMargin;
    private int numberOfDots;
    private final RectF rect;

    public StepsDashedLine(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float x = tje.x(getContext(), 10.0f);
        this.dotHeight = x;
        this.firstAndLastDotMargin = x;
        this.dotWidth = tje.x(getContext(), 4.0f);
        this.dotMarginPx = tje.x(getContext(), 4.0f);
        Paint paint = new Paint();
        paint.setColor(qje.t(xng0.line, getContext()));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.dotPaint = paint;
        this.rect = new RectF();
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.dotPaint.setColor(qje.t(xng0.line, getContext()));
        invalidate();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        float width = getWidth() / 2;
        float f2 = this.dotWidth;
        float f3 = width - (f2 / 2.0f);
        float f4 = f2 + f3;
        float f5 = this.firstAndLastDotMargin;
        int i = this.numberOfDots;
        int i2 = 0;
        while (i2 < i) {
            if (i2 == 0) {
                f = this.dotHeight;
            } else {
                f5 += this.dotMarginPx;
                f = this.dotHeight;
            }
            float f6 = f + f5;
            this.rect.set(f3, f5, f4, f6);
            canvas.drawRoundRect(this.rect, tje.x(getContext(), 1.5f), tje.x(getContext(), 1.5f), this.dotPaint);
            i2++;
            f5 = f6;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float f = h;
        int rint = (int) Math.rint(f / (this.dotHeight + this.dotMarginPx));
        this.numberOfDots = rint;
        float f2 = this.dotHeight;
        float f3 = this.dotMarginPx;
        this.firstAndLastDotMargin = ((f - ((f2 + f3) * rint)) + f3) / 2.0f;
    }

    public StepsDashedLine(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public StepsDashedLine(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ StepsDashedLine(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
