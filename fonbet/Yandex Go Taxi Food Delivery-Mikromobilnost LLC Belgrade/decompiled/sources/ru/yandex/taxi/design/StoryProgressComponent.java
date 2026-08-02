package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c4i0;
import defpackage.m810;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.tje;
import defpackage.xby;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u001e¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b(\u0010$J\u0017\u0010*\u001a\u00020\u00002\b\b\u0001\u0010)\u001a\u00020\u0006¢\u0006\u0004\b*\u0010$J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010$J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0006¢\u0006\u0004\b.\u0010$J\u0015\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0018¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0014¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010<\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00109R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00109R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010>R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010>R\u0016\u0010/\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00109R\u0016\u0010G\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010%\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010I¨\u0006J"}, d2 = {"Lru/yandex/taxi/design/StoryProgressComponent;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "Landroid/graphics/drawable/Drawable;", "createBorderDrawable", "(I)Landroid/graphics/drawable/Drawable;", "index", "Lzy11;", "applyMediaRectColor", "(I)V", "Landroid/graphics/Canvas;", "canvas", "drawMediaRect", "(Landroid/graphics/Canvas;I)V", "drawMediaProgressRect", "drawBorder", "", "calcMediaRectLeft", "(I)F", "calcMediaRectTop", "()F", "calcItemWidth", "", "isRtl", "()Z", "invalidateComponent", "()V", "setBorderColor", "(I)Lru/yandex/taxi/design/StoryProgressComponent;", "borderEnabled", "setBorderEnabled", "(Z)Lru/yandex/taxi/design/StoryProgressComponent;", "setProgressColor", "filledColor", "setProgressColorFilled", "mediaCount", "setMediaCount", "currentMedia", "setCurrentMedia", "currentMediaProgressPercent", "setCurrentMediaProgressPercent", "(F)Lru/yandex/taxi/design/StoryProgressComponent;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "draw", "(Landroid/graphics/Canvas;)V", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "spacing", "innerHeight", "borderWidth", "progressColor", CA20Status.STATUS_USER_I, "progressColorFilled", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "itemHeight", "borderDrawable", "Landroid/graphics/drawable/Drawable;", "Z", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StoryProgressComponent extends View {
    private Drawable borderDrawable;
    private boolean borderEnabled;
    private final float borderWidth;
    private final float cornerRadius;
    private int currentMedia;
    private float currentMediaProgressPercent;
    private final float innerHeight;
    private float itemHeight;
    private int mediaCount;
    private final Paint paint;
    private int progressColor;
    private int progressColorFilled;
    private final RectF rect;
    private final float spacing;

    public StoryProgressComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.cornerRadius = tje.r(mrg0.story_progress_corner_radius, getContext());
        this.spacing = tje.r(mrg0.story_progress_spacing, getContext());
        float r = tje.r(mrg0.story_progress_inner_height, getContext());
        this.innerHeight = r;
        float r2 = tje.r(mrg0.story_progress_border_width, getContext());
        this.borderWidth = r2;
        Paint paint = new Paint(1);
        this.paint = paint;
        this.rect = new RectF();
        paint.setStyle(Paint.Style.FILL);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.StoryProgressComponent, i, 0);
        try {
            this.progressColor = obtainStyledAttributes.getColor(c4i0.StoryProgressComponent_color, context.getColor(mqg0.story_progress));
            this.progressColorFilled = obtainStyledAttributes.getColor(c4i0.StoryProgressComponent_fill_color, context.getColor(mqg0.story_progress_filled));
            this.borderDrawable = createBorderDrawable(obtainStyledAttributes.getColor(c4i0.StoryProgressComponent_border_color, context.getColor(mqg0.story_progress_border)));
            boolean z = obtainStyledAttributes.getBoolean(c4i0.StoryProgressComponent_border_enabled, true);
            this.borderEnabled = z;
            if (!z) {
                r += 2.0f * r2;
            }
            this.itemHeight = r;
            obtainStyledAttributes.recycle();
            int dimensionPixelSize = getResources().getDimensionPixelSize(mrg0.go_design_s_space);
            setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            if (isInEditMode()) {
                this.mediaCount = 5;
                this.currentMedia = 1;
                this.currentMediaProgressPercent = 0.3f;
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void applyMediaRectColor(int index) {
        this.paint.setColor(index < this.currentMedia ? this.progressColorFilled : this.progressColor);
    }

    private final float calcItemWidth() {
        if (this.mediaCount == 0) {
            return 0.0f;
        }
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        return (width - ((r1 - 1) * this.spacing)) / this.mediaCount;
    }

    private final float calcMediaRectLeft(int index) {
        float f;
        int paddingLeft;
        float calcItemWidth = calcItemWidth();
        if (isRtl()) {
            if (index + 1 > this.mediaCount) {
                xby.d.w(new IllegalStateException("media index more than media count"));
                return 0.0f;
            }
            f = (calcItemWidth + this.spacing) * ((r2 - index) - 1);
            paddingLeft = getPaddingLeft();
        } else {
            f = (calcItemWidth + this.spacing) * index;
            paddingLeft = getPaddingLeft();
        }
        return f + paddingLeft;
    }

    private final float calcMediaRectTop() {
        return (getHeight() - this.itemHeight) / 2.0f;
    }

    private final Drawable createBorderDrawable(int color) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.cornerRadius);
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(m810.b(this.borderWidth), color);
        return gradientDrawable;
    }

    private final void drawBorder(Canvas canvas, int index) {
        if (this.borderEnabled) {
            int b = m810.b(calcMediaRectLeft(index));
            float calcItemWidth = calcItemWidth();
            float height = getHeight();
            float f = this.itemHeight;
            int i = (int) ((height - f) / 2.0f);
            this.borderDrawable.setBounds(b, i, (int) (b + calcItemWidth), (int) (i + f));
            this.borderDrawable.draw(canvas);
        }
    }

    private final void drawMediaProgressRect(Canvas canvas, int index) {
        if (index == this.currentMedia) {
            this.paint.setColor(this.progressColorFilled);
            float calcMediaRectLeft = calcMediaRectLeft(index);
            float calcMediaRectTop = calcMediaRectTop();
            float calcItemWidth = calcItemWidth();
            int i = (int) (this.currentMediaProgressPercent * calcItemWidth);
            boolean isRtl = isRtl();
            RectF rectF = this.rect;
            if (isRtl) {
                float f = calcMediaRectLeft + calcItemWidth;
                rectF.set(f - i, calcMediaRectTop, f, this.itemHeight + calcMediaRectTop);
            } else {
                rectF.set(calcMediaRectLeft, calcMediaRectTop, i + calcMediaRectLeft, this.itemHeight + calcMediaRectTop);
            }
            RectF rectF2 = this.rect;
            float f2 = this.cornerRadius;
            canvas.drawRoundRect(rectF2, f2, f2, this.paint);
        }
    }

    private final void drawMediaRect(Canvas canvas, int index) {
        float calcMediaRectLeft = calcMediaRectLeft(index);
        float calcMediaRectTop = calcMediaRectTop();
        this.rect.set(calcMediaRectLeft, calcMediaRectTop, calcItemWidth() + calcMediaRectLeft, this.itemHeight + calcMediaRectTop);
        RectF rectF = this.rect;
        float f = this.cornerRadius;
        canvas.drawRoundRect(rectF, f, f, this.paint);
    }

    private final boolean isRtl() {
        return xw31.n(getContext());
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int i = this.mediaCount;
        if (i == 0) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            applyMediaRectColor(i2);
            drawMediaRect(canvas, i2);
            drawMediaProgressRect(canvas, i2);
            drawBorder(canvas, i2);
        }
    }

    public final void invalidateComponent() {
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), tje.u(12, getContext()));
    }

    public final StoryProgressComponent setBorderColor(int color) {
        this.borderDrawable = createBorderDrawable(color);
        return this;
    }

    public final StoryProgressComponent setBorderEnabled(boolean borderEnabled) {
        this.borderEnabled = borderEnabled;
        float f = this.innerHeight;
        if (!borderEnabled) {
            f += 2.0f * this.borderWidth;
        }
        this.itemHeight = f;
        return this;
    }

    public final StoryProgressComponent setCurrentMedia(int currentMedia) {
        this.currentMedia = currentMedia;
        return this;
    }

    public final StoryProgressComponent setCurrentMediaProgressPercent(float currentMediaProgressPercent) {
        this.currentMediaProgressPercent = currentMediaProgressPercent;
        return this;
    }

    public final StoryProgressComponent setMediaCount(int mediaCount) {
        this.mediaCount = mediaCount;
        this.currentMedia = Math.min(this.currentMedia, mediaCount - 1);
        return this;
    }

    public final StoryProgressComponent setProgressColor(int color) {
        this.progressColor = color;
        return this;
    }

    public final StoryProgressComponent setProgressColorFilled(int filledColor) {
        this.progressColorFilled = filledColor;
        return this;
    }

    public StoryProgressComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public StoryProgressComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ StoryProgressComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
