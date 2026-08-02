package ru.yandex.taxi.design;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.g8e;
import defpackage.jxi;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.xw31;
import defpackage.y4m;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ?2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\bJ!\u0010\u001b\u001a\u00020\u00152\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\u001e\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\bJ\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\bJ\u0017\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\u0017J\u0019\u0010,\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0017¢\u0006\u0004\b.\u0010\bR\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u0014\u00104\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00100R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00100R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00100R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00100R\u0016\u0010=\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lru/yandex/taxi/design/DotsIndicatorDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "firstVisibleItem", "()I", "lastVisibleItem", "position", "", "getItemSize", "(I)F", "getStaticItemSize", "", "isScrolling", "()Z", "getItemColor", "(I)I", "dotsCount", "Lzy11;", "setDotsCount", "(I)V", "getDotsCount", "dotColor", "selectedDotColor", "setDotColors", "(II)V", "positionOffset", "setPosition", "(IF)V", "ignoreRtl", "(IFZ)V", "getIntrinsicWidth", "getIntrinsicHeight", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "itemWidth", CA20Status.STATUS_USER_I, "smallItemSize", "normalItemSize", "largeItemSize", "isRtl", "Z", "Landroid/animation/ArgbEvaluator;", "colorEvaluator", "Landroid/animation/ArgbEvaluator;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "currentPosition", "currentPositionOffset", "F", "Companion", "y4m", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DotsIndicatorDrawable extends Drawable {
    public static final y4m Companion = new y4m();
    private static final int MAX_ON_SCREEN_COUNT = 9;
    private static final int MIN_COUNT_TO_SHOW_SMALL_ITEMS = 5;
    private static final int MIN_POSITION_FOR_SCROLLING = 4;
    private final ArgbEvaluator colorEvaluator = new ArgbEvaluator();
    private int currentPosition;
    private float currentPositionOffset;
    private int dotColor;
    private int dotsCount;
    private final boolean isRtl;
    private final int itemWidth;
    private final int largeItemSize;
    private final int normalItemSize;
    private final Paint paint;
    private int selectedDotColor;
    private final int smallItemSize;

    public DotsIndicatorDrawable(Context context) {
        this.itemWidth = context.getResources().getDimensionPixelSize(mrg0.component_dots_indicator_item_width);
        this.smallItemSize = context.getResources().getDimensionPixelSize(mrg0.component_dots_indicator_small_item_size);
        this.normalItemSize = context.getResources().getDimensionPixelSize(mrg0.component_dots_indicator_normal_item_size);
        this.largeItemSize = context.getResources().getDimensionPixelSize(mrg0.component_dots_indicator_large_item_size);
        this.isRtl = xw31.n(context);
        Paint paint = new Paint();
        this.paint = paint;
        this.dotColor = context.getColor(mqg0.transparent_40_white);
        this.selectedDotColor = context.getColor(mqg0.white);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private final int firstVisibleItem() {
        if (this.dotsCount <= 9) {
            return 0;
        }
        return Math.min(Math.max(0, this.currentPosition - 4), this.dotsCount - 9);
    }

    private final int getItemColor(int position) {
        int i = this.currentPosition;
        if (position < i || position > i + 1) {
            return this.dotColor;
        }
        float f = this.currentPositionOffset;
        if (position == i) {
            f = 1.0f - f;
        }
        return ((Integer) this.colorEvaluator.evaluate(f, Integer.valueOf(this.dotColor), Integer.valueOf(this.selectedDotColor))).intValue();
    }

    private final float getItemSize(int position) {
        float staticItemSize = getStaticItemSize(position);
        float f = position == this.currentPosition ? this.largeItemSize : staticItemSize;
        if (isScrolling()) {
            staticItemSize = getStaticItemSize(position - 1);
        }
        if (position == this.currentPosition + 1) {
            staticItemSize = this.largeItemSize;
        }
        return g8e.b(staticItemSize, f, this.currentPositionOffset, f);
    }

    private final float getStaticItemSize(int position) {
        int i = this.dotsCount;
        return position < 0 ? i >= 5 ? this.smallItemSize : this.normalItemSize : (i < 5 || (position > firstVisibleItem() && position < lastVisibleItem())) ? this.normalItemSize : this.smallItemSize;
    }

    private final boolean isScrolling() {
        return this.currentPosition >= 4 && lastVisibleItem() < this.dotsCount - 1;
    }

    private final int lastVisibleItem() {
        return Math.min(firstVisibleItem() + 8, this.dotsCount - 1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int min = Math.min(lastVisibleItem() + 1, this.dotsCount - 1);
        float f = isScrolling() ? (-this.itemWidth) * this.currentPositionOffset : 0.0f;
        Rect bounds = getBounds();
        float height = (bounds.height() / 2.0f) + bounds.top;
        int firstVisibleItem = firstVisibleItem();
        if (firstVisibleItem > min) {
            return;
        }
        while (true) {
            this.paint.setColor(getItemColor(firstVisibleItem));
            float itemSize = getItemSize(firstVisibleItem);
            int i = bounds.left;
            int firstVisibleItem2 = firstVisibleItem - firstVisibleItem();
            canvas.drawCircle((this.itemWidth / 2.0f) + (firstVisibleItem2 * r9) + i + f, height, itemSize / 2.0f, this.paint);
            if (firstVisibleItem == min) {
                return;
            } else {
                firstVisibleItem++;
            }
        }
    }

    public final int getDotsCount() {
        return this.dotsCount;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.largeItemSize;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(this.dotsCount, 9) * this.itemWidth;
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setDotColors(int dotColor, int selectedDotColor) {
        this.dotColor = dotColor;
        this.selectedDotColor = selectedDotColor;
    }

    public final void setDotsCount(int dotsCount) {
        this.dotsCount = dotsCount;
    }

    public final void setPosition(int position, float positionOffset, boolean ignoreRtl) {
        if (!this.isRtl || ignoreRtl) {
            this.currentPosition = position;
            this.currentPositionOffset = positionOffset;
        } else {
            int i = this.dotsCount;
            this.currentPosition = (positionOffset == 0.0f ? i - 1 : i - 2) - position;
            this.currentPositionOffset = positionOffset > 0.0f ? 1.0f - positionOffset : 0.0f;
        }
    }

    public final void setPosition(int position, float positionOffset) {
        setPosition(position, positionOffset, false);
    }
}
