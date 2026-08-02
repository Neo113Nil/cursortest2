package ru.yandex.taxi.scooters.presentation.route_navigation.route_summary;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.go.design.view.GoView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.q0h0;
import defpackage.tje;
import defpackage.unr0;
import defpackage.vqg0;
import defpackage.xw31;
import defpackage.y6i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u0016\u0010%\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0016\u0010&\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u0016\u0010'\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u0016\u0010(\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0018R*\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00168\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/yandex/taxi/scooters/presentation/route_navigation/route_summary/ScootersSummaryRouteLineView;", "Lcom/yandex/go/design/view/GoView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/drawable/Drawable;", "progressArrowDrawable", "Landroid/graphics/drawable/Drawable;", "", "heightOfLine", "F", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "arrowBaseOffset", "traveledDistanceColor", CA20Status.STATUS_USER_I, "remainingDistanceColor", "Landroid/graphics/Path;", "clipPath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "routeLinePaint", "Landroid/graphics/Paint;", "routeLineStartX", "routeLineStartY", "routeLineProgressX", "routeLineEndX", "routeLineEndY", "value", "progress", "getProgress", "()F", "setProgress", "(F)V", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersSummaryRouteLineView extends GoView {
    public static final int $stable = 8;
    private final float arrowBaseOffset;
    private final Path clipPath;
    private final float cornerRadius;
    private final float heightOfLine;
    private float progress;
    private final Drawable progressArrowDrawable;
    private final int remainingDistanceColor;
    private float routeLineEndX;
    private float routeLineEndY;
    private final Paint routeLinePaint;
    private float routeLineProgressX;
    private float routeLineStartX;
    private float routeLineStartY;
    private final int traveledDistanceColor;

    public ScootersSummaryRouteLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        Drawable y = tje.y(q0h0.ic_scooters_route_arrow_small, getContext());
        y.setBounds(0, 0, y.getIntrinsicWidth(), y.getIntrinsicHeight());
        this.progressArrowDrawable = y;
        this.heightOfLine = tje.w(6, getContext());
        this.cornerRadius = tje.w(3, getContext());
        this.arrowBaseOffset = y.getIntrinsicWidth() * 0.3f;
        this.traveledDistanceColor = getContext().getColor(vqg0.scooter_traveled_distance_color);
        this.remainingDistanceColor = getContext().getColor(vqg0.scooter_remaining_distance_color);
        this.clipPath = new Path();
        this.routeLinePaint = unr0.f(true);
    }

    public final float getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        float intrinsicWidth = this.progressArrowDrawable.getIntrinsicWidth() / 2.0f;
        this.routeLineStartX = intrinsicWidth;
        this.routeLineStartY = (getHeight() / 2.0f) - (this.heightOfLine / 2.0f);
        this.routeLineEndX = getWidth() - intrinsicWidth;
        this.routeLineEndY = (this.heightOfLine / 2.0f) + (getHeight() / 2.0f);
        float f = this.routeLineStartX;
        float f2 = this.routeLineEndX;
        float f3 = ((f2 - f) * this.progress) + f;
        this.routeLineProgressX = f3;
        float f4 = f3 - intrinsicWidth;
        float c = y6i0.c(this.arrowBaseOffset + f4, f, f2);
        Path path = this.clipPath;
        float f5 = this.routeLineStartX;
        float f6 = this.routeLineStartY;
        float f7 = this.routeLineEndX;
        float f8 = this.routeLineEndY;
        float f9 = this.cornerRadius;
        path.addRoundRect(f5, f6, f7, f8, f9, f9, Path.Direction.CW);
        int save = canvas2.save();
        canvas2.clipPath(path);
        try {
            if (xw31.n(getContext())) {
                canvas2.scale(-1.0f, 1.0f, canvas2.getWidth() / 2.0f, canvas2.getHeight() / 2.0f);
            }
            float f10 = this.routeLineStartX;
            float f11 = this.routeLineStartY;
            float f12 = this.routeLineEndY;
            Paint paint = this.routeLinePaint;
            paint.setColor(this.traveledDistanceColor);
            canvas2.drawRect(f10, f11, c, f12, paint);
            try {
                float f13 = this.routeLineStartY;
                float f14 = this.routeLineEndX;
                float f15 = this.routeLineEndY;
                Paint paint2 = this.routeLinePaint;
                paint2.setColor(this.remainingDistanceColor);
                canvas2 = canvas;
                canvas2.drawRect(c, f13, f14, f15, paint2);
                canvas2.restoreToCount(save);
                save = canvas2.save();
                try {
                    if (xw31.n(getContext())) {
                        canvas2.scale(-1.0f, 1.0f, canvas2.getWidth() / 2.0f, canvas2.getHeight() / 2.0f);
                    }
                    canvas2.translate(f4, 0.0f);
                    this.progressArrowDrawable.draw(canvas2);
                    canvas2.restoreToCount(save);
                } finally {
                    canvas2.restoreToCount(save);
                }
            } catch (Throwable th) {
                th = th;
                canvas2 = canvas;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec), this.progressArrowDrawable.getIntrinsicHeight());
    }

    public final void setProgress(float f) {
        this.progress = f;
        invalidate();
    }

    public ScootersSummaryRouteLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ScootersSummaryRouteLineView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ScootersSummaryRouteLineView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
