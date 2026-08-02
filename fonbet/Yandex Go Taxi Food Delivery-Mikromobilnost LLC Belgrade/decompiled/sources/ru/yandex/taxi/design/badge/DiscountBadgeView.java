package ru.yandex.taxi.design.badge;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.g4i0;
import defpackage.qje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\n*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lru/yandex/taxi/design/badge/DiscountBadgeView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "applyAttributes", "(Landroid/util/AttributeSet;I)V", "Landroid/graphics/Path;", "", RemoteBioParameters.X, "setEdgeCirclePath", "(Landroid/graphics/Path;F)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "leftCirclePath", "Landroid/graphics/Path;", "rightCirclePath", "roundRectPath", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "edgeClipRadius", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiscountBadgeView extends RobotoTextView {
    public static final int $stable = 8;
    private final Paint backgroundPaint;
    private float cornerRadius;
    private float edgeClipRadius;
    private final Path leftCirclePath;
    private final Path rightCirclePath;
    private final Path roundRectPath;

    public DiscountBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.leftCirclePath = new Path();
        this.rightCirclePath = new Path();
        this.roundRectPath = new Path();
        this.backgroundPaint = new Paint();
        applyAttributes(attributeSet, i);
    }

    private final void applyAttributes(AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, g4i0.DiscountBadgeView, defStyleAttr, 0);
        this.cornerRadius = obtainStyledAttributes.getDimension(g4i0.DiscountBadgeView_discount_corner_radius, 0.0f);
        this.edgeClipRadius = obtainStyledAttributes.getDimension(g4i0.DiscountBadgeView_edge_clip_radius, 0.0f);
        this.backgroundPaint.setColor(obtainStyledAttributes.getColor(g4i0.DiscountBadgeView_discount_background_color, qje.t(xng0.bgMinor, getContext())));
        obtainStyledAttributes.recycle();
    }

    private final void setEdgeCirclePath(Path path, float f) {
        path.reset();
        path.addCircle(f, getMeasuredHeight() / 2.0f, this.edgeClipRadius, Path.Direction.CW);
        path.close();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipOutPath(this.leftCirclePath);
        canvas.clipOutPath(this.rightCirclePath);
        canvas.clipPath(this.roundRectPath);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.backgroundPaint);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // ru.yandex.taxi.widget.RobotoTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setEdgeCirclePath(this.leftCirclePath, 0.0f);
        setEdgeCirclePath(this.rightCirclePath, getMeasuredWidth());
        Path path = this.roundRectPath;
        path.reset();
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = this.cornerRadius;
        path.addRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, f, f, Path.Direction.CW);
        path.close();
    }

    public DiscountBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DiscountBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DiscountBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
