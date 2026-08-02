package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.yandex.div.state.db.StateEntry;
import defpackage.c4i0;
import defpackage.nwy0;
import defpackage.x1i0;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/yandex/taxi/design/CardComponent;", "Landroidx/cardview/widget/CardView;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "width", "height", "Lzy11;", "updatePath", "(II)V", "updateCorners", "()V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "radius", "setRadius", "(F)V", "", "corners", "[F", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "Landroid/graphics/Path;", "Landroid/graphics/RectF;", "pathRect", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "borderPaint", "Landroid/graphics/Paint;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public class CardComponent extends CardView implements nwy0 {
    private Paint borderPaint;
    private float[] corners;
    private Path path;
    private RectF pathRect;

    public CardComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.corners = new float[8];
        this.path = new Path();
        this.pathRect = new RectF();
        this.borderPaint = new Paint();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.CardComponent, i, x1i0.CardComponent);
        try {
            this.borderPaint.setStrokeWidth(obtainStyledAttributes.getDimension(c4i0.CardComponent_strokeWidth, 0.0f));
            this.borderPaint.setColor(obtainStyledAttributes.getColor(c4i0.CardComponent_strokeColor, 0));
            obtainStyledAttributes.recycle();
            this.borderPaint.setStyle(Paint.Style.STROKE);
            this.borderPaint.setAntiAlias(true);
            setLayerType(1, null);
            updateCorners();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void updateCorners() {
        float radius = getRadius();
        this.corners = new float[]{radius, radius, radius, radius, radius, radius, radius, radius};
    }

    private final void updatePath(int width, int height) {
        this.pathRect.left = getPaddingLeft();
        this.pathRect.top = getPaddingTop();
        this.pathRect.right = width - getPaddingRight();
        this.pathRect.bottom = height - getPaddingBottom();
        this.path.reset();
        this.path.addRoundRect(this.pathRect, this.corners, Path.Direction.CW);
        this.path.close();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean allowTraverse() {
        return true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.borderPaint.getColor() != 0) {
            canvas.drawPath(this.path, this.borderPaint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updatePath(w, h);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float radius) {
        super.setRadius(radius);
        updateCorners();
    }

    public CardComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CardComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CardComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.cardComponentStyle : i);
    }
}
