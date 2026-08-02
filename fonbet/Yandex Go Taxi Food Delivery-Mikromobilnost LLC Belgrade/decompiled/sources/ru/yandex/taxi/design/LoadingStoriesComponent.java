package ru.yandex.taxi.design;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.dzg0;
import defpackage.mrg0;
import defpackage.tje;
import defpackage.vng;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.ShimmeringPaint;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!¨\u0006%"}, d2 = {"Lru/yandex/taxi/design/LoadingStoriesComponent;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "changed", "left", "top", "right", "bottom", "Lzy11;", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "getCardWidth", "()I", "getCardHeight", "Lru/yandex/taxi/widget/ShimmeringPaint;", "paint", "Lru/yandex/taxi/widget/ShimmeringPaint;", "Landroid/graphics/drawable/Drawable;", "cardDrawable", "Landroid/graphics/drawable/Drawable;", "padding", CA20Status.STATUS_USER_I, "cardWidth", "cardHeight", "spaceWidth", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoadingStoriesComponent extends View {
    private final Drawable cardDrawable;
    private final int cardHeight;
    private final int cardWidth;
    private final int padding;
    private final ShimmeringPaint paint;
    private final int spaceWidth;

    public LoadingStoriesComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.paint = new ShimmeringPaint(context);
        Drawable t = vng.t(dzg0.icon_bubble, getContext());
        this.cardDrawable = t;
        this.padding = tje.r(mrg0.stories_left_padding, getContext());
        int r = tje.r(mrg0.story_card_width, getContext());
        this.cardWidth = r;
        int r2 = tje.r(mrg0.story_card_height, getContext());
        this.cardHeight = r2;
        this.spaceWidth = tje.r(mrg0.go_design_s_space, getContext());
        if (t != null) {
            t.setBounds(0, 0, r, r2);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.cardDrawable != null) {
            canvas.save();
            canvas.translate(this.padding, 0.0f);
            int i = this.padding;
            while (i < getWidth()) {
                this.cardDrawable.draw(canvas);
                canvas.translate(this.cardWidth + this.spaceWidth, 0.0f);
                i += this.cardWidth + this.spaceWidth;
            }
            canvas.restore();
        }
        this.paint.updateShimmering();
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        canvas.drawPaint(this.paint);
        canvas.restore();
        postInvalidateOnAnimation();
    }

    public int getCardHeight() {
        return this.cardHeight;
    }

    public int getCardWidth() {
        return this.cardWidth;
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.paint.updateOffset(this);
    }

    public LoadingStoriesComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LoadingStoriesComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ LoadingStoriesComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.loadingStoriesComponentStyle : i);
    }
}
