package ru.yandex.taxi.plus.design.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.i3y;
import defpackage.m39;
import defpackage.ufd;
import defpackage.we8;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.plus.design.gradient.delegate.CashbackRenderType;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010 \u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\n2\b\b\u0001\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0013¢\u0006\u0004\b*\u0010\u0016J\r\u0010+\u001a\u00020\n¢\u0006\u0004\b+\u0010\fJ\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010\fR\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0016\u0010)\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00107R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/yandex/taxi/plus/design/view/CashbackClipFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateLayerType", "()V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "hardware", "clipShimmeringToDrawable", "(Z)V", "Lru/yandex/taxi/plus/design/gradient/delegate/CashbackRenderType;", "renderType", "updateCashbackType", "(Lru/yandex/taxi/plus/design/gradient/delegate/CashbackRenderType;)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "paintColor", "setSolidPaintColor", "(I)V", "useSolidPaint", "setUseSolidPaint", "disableGradient", "enableGradient", "Lm39;", "drawDelegate$delegate", "Li3y;", "getDrawDelegate", "()Lm39;", "drawDelegate", "Landroid/graphics/Rect;", "currentDrawRect", "Landroid/graphics/Rect;", "hardwareClip", "Z", "isGradientEnabled", "Landroid/graphics/Paint;", "solidPaint", "Landroid/graphics/Paint;", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashbackClipFrameLayout extends FrameLayout {
    private final Rect currentDrawRect;

    /* renamed from: drawDelegate$delegate, reason: from kotlin metadata */
    private final i3y drawDelegate;
    private boolean hardwareClip;
    private boolean isGradientEnabled;
    private Paint solidPaint;
    private boolean useSolidPaint;

    public CashbackClipFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.drawDelegate = a.a(new we8(13));
        updateLayerType();
        this.currentDrawRect = new Rect();
        this.isGradientEnabled = true;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.solidPaint = paint;
    }

    public static /* synthetic */ void clipShimmeringToDrawable$default(CashbackClipFrameLayout cashbackClipFrameLayout, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        cashbackClipFrameLayout.clipShimmeringToDrawable(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m39 drawDelegate_delegate$lambda$0() {
        return new ufd();
    }

    private final m39 getDrawDelegate() {
        return (m39) this.drawDelegate.getValue();
    }

    private final void updateLayerType() {
        if (this.hardwareClip) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public final void clipShimmeringToDrawable(boolean hardware) {
        this.hardwareClip = hardware;
        updateLayerType();
    }

    public final void disableGradient() {
        this.isGradientEnabled = false;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.isGradientEnabled) {
            getDrawDelegate().c(canvas, this.currentDrawRect);
            if (this.useSolidPaint) {
                canvas.drawRect(this.currentDrawRect, this.solidPaint);
            } else {
                getDrawDelegate().c(canvas, this.currentDrawRect);
            }
        }
    }

    public final void enableGradient() {
        this.isGradientEnabled = true;
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.currentDrawRect.set(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        getDrawDelegate().a(w, h);
    }

    public final void setSolidPaintColor(int paintColor) {
        this.solidPaint.setColor(paintColor);
    }

    public final void setUseSolidPaint(boolean useSolidPaint) {
        this.useSolidPaint = useSolidPaint;
    }

    public final void updateCashbackType(CashbackRenderType renderType) {
        getDrawDelegate().f(renderType);
        invalidate();
    }

    public CashbackClipFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CashbackClipFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CashbackClipFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
