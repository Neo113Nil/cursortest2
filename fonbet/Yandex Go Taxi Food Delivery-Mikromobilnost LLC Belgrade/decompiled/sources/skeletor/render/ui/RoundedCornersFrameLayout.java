package skeletor.render.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.h4i0;
import defpackage.nam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0012R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lskeletor/render/ui/RoundedCornersFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "", "cornersRadius", "setRadius", "(F)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Lnam;", "drawHelper", "Lnam;", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Rect;", "value", "F", "getCornersRadius", "()F", "setCornersRadius", "", "roundTopCorners", "Z", "roundBottomCorners", "renderer_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class RoundedCornersFrameLayout extends FrameLayout {
    private float cornersRadius;
    private final nam drawHelper;
    private final Rect rect;
    private boolean roundBottomCorners;
    private boolean roundTopCorners;

    public RoundedCornersFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.drawHelper = new nam();
        this.rect = new Rect();
        this.roundTopCorners = true;
        this.roundBottomCorners = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h4i0.RoundedCornersFrameLayout, i, 0);
            float dimension = obtainStyledAttributes.getDimension(h4i0.RoundedCornersFrameLayout_cornerRadius, this.cornersRadius);
            this.roundTopCorners = obtainStyledAttributes.getBoolean(h4i0.RoundedCornersFrameLayout_roundTopCorners, true);
            this.roundBottomCorners = obtainStyledAttributes.getBoolean(h4i0.RoundedCornersFrameLayout_roundBottomCorners, true);
            setCornersRadius(dimension);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        nam namVar = this.drawHelper;
        Rect rect = this.rect;
        float f = this.cornersRadius;
        boolean z = this.roundTopCorners;
        boolean z2 = this.roundBottomCorners;
        RectF rectF = namVar.a;
        Path path = namVar.b;
        float[] fArr = namVar.c;
        if (f > 0.0f) {
            double d = 2.0f * f;
            if (rect.height() >= d && rect.width() >= d) {
                rectF.set(rect);
                if (fArr[0] != f) {
                    int length = fArr.length;
                    for (int i = 0; i < length; i++) {
                        if (i <= 3 && z) {
                            fArr[i] = f;
                        } else if (i > 3 && z2) {
                            fArr[i] = f;
                        }
                    }
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
        super.draw(canvas);
        canvas.restore();
    }

    public final float getCornersRadius() {
        return this.cornersRadius;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void setCornersRadius(float f) {
        if (this.cornersRadius == f) {
            return;
        }
        this.cornersRadius = f;
        invalidate();
    }

    public final void setRadius(float cornersRadius) {
        setCornersRadius(cornersRadius);
        invalidate();
    }

    public RoundedCornersFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ RoundedCornersFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public RoundedCornersFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }
}
