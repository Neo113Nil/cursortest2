package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.state.db.StateEntry;
import defpackage.c4i0;
import defpackage.mrg0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/yandex/taxi/widget/SingleShimmeringBar;", "Landroid/view/View;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "edgeColor", "Lzy11;", "applyShimmeringColors", "(I)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lru/yandex/taxi/widget/SingleShimmeringPaint;", "paint", "Lru/yandex/taxi/widget/SingleShimmeringPaint;", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "Landroid/graphics/Path;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SingleShimmeringBar extends View implements nwy0 {
    private final SingleShimmeringPaint paint;
    private final Path path;

    public SingleShimmeringBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SingleShimmeringPaint singleShimmeringPaint = new SingleShimmeringPaint(getContext());
        this.paint = singleShimmeringPaint;
        this.path = new Path();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.SingleShimmeringBar, i, 0);
        if (obtainStyledAttributes.hasValue(c4i0.SingleShimmeringBar_shimmeringAngle)) {
            singleShimmeringPaint.setAngle(obtainStyledAttributes.getFloat(c4i0.SingleShimmeringBar_shimmeringAngle, 0.0f));
        }
        if (obtainStyledAttributes.hasValue(c4i0.SingleShimmeringBar_shimmeringWidth)) {
            singleShimmeringPaint.setGradientWidth(obtainStyledAttributes.getLayoutDimension(c4i0.SingleShimmeringBar_shimmeringWidth, 0));
        }
        if (obtainStyledAttributes.hasValue(c4i0.SingleShimmeringBar_shimmeringDuration)) {
            singleShimmeringPaint.setDuration(obtainStyledAttributes.getInt(c4i0.SingleShimmeringBar_shimmeringDuration, 0));
        }
        int color = obtainStyledAttributes.getColor(c4i0.SingleShimmeringBar_edgeColor, qje.t(xng0.bgMinor, getContext()));
        obtainStyledAttributes.recycle();
        singleShimmeringPaint.setPathEffect(new CornerPathEffect(tje.r(mrg0.go_design_s_space, getContext())));
        applyShimmeringColors(color);
    }

    private final void applyShimmeringColors(int edgeColor) {
        this.paint.setColors(qje.t(xng0.bgMain, getContext()), edgeColor);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        applyShimmeringColors(this.paint.getEdgeColor());
        invalidate();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.paint.updateShimmering();
        canvas.drawPath(this.path, this.paint);
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.path.reset();
        this.path.moveTo(getPaddingLeft(), getPaddingTop());
        this.path.lineTo(getWidth() - getPaddingRight(), getPaddingTop());
        this.path.lineTo(getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.path.lineTo(getPaddingLeft(), getHeight() - getPaddingBottom());
        this.path.lineTo(getPaddingLeft(), getPaddingTop());
        this.path.close();
        this.paint.updateOffset(this);
    }

    public SingleShimmeringBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SingleShimmeringBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ SingleShimmeringBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
