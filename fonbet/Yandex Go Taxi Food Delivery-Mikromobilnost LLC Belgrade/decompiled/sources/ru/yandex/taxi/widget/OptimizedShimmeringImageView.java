package ru.yandex.taxi.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.mqg0;
import defpackage.qje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\n2\b\b\u0001\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/yandex/taxi/widget/OptimizedShimmeringImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "applyShimmeringColors", "()V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "color", "setCenterColor", "(I)V", BackendConfig.Restrictions.ENABLED, "setLoading", "(Z)V", "Lru/yandex/taxi/widget/OptimizedShimmeringPaint;", "loadingShimmeringPaint", "Lru/yandex/taxi/widget/OptimizedShimmeringPaint;", "isLoading", "Z", "centerColor", CA20Status.STATUS_USER_I, "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public class OptimizedShimmeringImageView extends AppCompatImageView {
    private int centerColor;
    private boolean isLoading;
    private final OptimizedShimmeringPaint loadingShimmeringPaint;

    public OptimizedShimmeringImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.loadingShimmeringPaint = new OptimizedShimmeringPaint(context);
        this.centerColor = qje.t(xng0.bgMain, context);
    }

    private final void applyShimmeringColors() {
        this.loadingShimmeringPaint.setColors(this.centerColor, getContext().getColor(mqg0.transparent));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.isLoading) {
            this.loadingShimmeringPaint.updateShimmering();
            postInvalidateOnAnimation();
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.loadingShimmeringPaint);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.isLoading) {
            this.loadingShimmeringPaint.updateOffset(this);
        }
    }

    public final void setCenterColor(int color) {
        this.centerColor = color;
        applyShimmeringColors();
    }

    public final void setLoading(boolean enabled) {
        this.isLoading = enabled;
        if (enabled) {
            applyShimmeringColors();
        }
    }

    public OptimizedShimmeringImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OptimizedShimmeringImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ OptimizedShimmeringImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
