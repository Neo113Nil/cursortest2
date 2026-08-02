package ru.yandex.taxi.widget.buttons;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.cma1;
import defpackage.mqg0;
import defpackage.qje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.ShimmeringPaint;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/yandex/taxi/widget/buttons/LoadingCircleButtonImageView;", "Lru/yandex/taxi/widget/buttons/CircleButtonImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "onDraw", "(Landroid/graphics/Canvas;)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", BackendConfig.Restrictions.ENABLED, "setLoading", "(Z)V", "fadeIn", "()V", "Lru/yandex/taxi/widget/ShimmeringPaint;", "loadingShimmeringPaint", "Lru/yandex/taxi/widget/ShimmeringPaint;", "isLoading", "Z", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoadingCircleButtonImageView extends CircleButtonImageView {
    private boolean isLoading;
    private final ShimmeringPaint loadingShimmeringPaint;

    public LoadingCircleButtonImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.loadingShimmeringPaint = new ShimmeringPaint(getContext());
    }

    public final void fadeIn() {
        setAlpha(0.1f);
        cma1.b(1.0f, this);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.isLoading) {
            this.loadingShimmeringPaint.updateShimmering();
            postInvalidateOnAnimation();
            float width = getWidth() / 2.0f;
            canvas.drawCircle(width, width, width, this.loadingShimmeringPaint);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.isLoading) {
            this.loadingShimmeringPaint.updateOffset(this);
        }
    }

    public final void setLoading(boolean enabled) {
        this.isLoading = enabled;
        if (enabled) {
            this.loadingShimmeringPaint.setColors(qje.t(xng0.bgMain, getContext()), getContext().getColor(mqg0.transparent));
        }
    }

    public /* synthetic */ LoadingCircleButtonImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public LoadingCircleButtonImageView(Context context) {
        this(context, null);
    }

    public LoadingCircleButtonImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
