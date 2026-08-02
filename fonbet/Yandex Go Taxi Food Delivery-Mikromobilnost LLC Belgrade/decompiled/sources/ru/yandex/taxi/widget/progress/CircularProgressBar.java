package ru.yandex.taxi.widget.progress;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import defpackage.c4i0;
import defpackage.mvb;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import defpackage.yi;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010 J/\u0010%\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010 J/\u0010(\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010 J\u000f\u0010)\u001a\u00020\rH\u0014¢\u0006\u0004\b)\u0010\u0011J\u0017\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010<\u001a\n ;*\u0004\u0018\u00010:0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/yandex/taxi/widget/progress/CircularProgressBar;", "Landroid/view/View;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "attrs", "Lzy11;", "applyThemedAttributes", "(Landroid/util/AttributeSet;Landroid/content/res/TypedArray;)V", "ensureOval", "()V", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "left", "top", "right", "bottom", "setPadding", "start", "end", "setPaddingRelative", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "allowTraverse", "()Z", "Landroid/graphics/RectF;", "oval", "Landroid/graphics/RectF;", "", "startAngle", "F", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "rotateAnimator", "Landroid/animation/ValueAnimator;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CircularProgressBar extends View implements nwy0 {
    private RectF oval;
    private final Paint paint;
    private final ValueAnimator rotateAnimator;
    private float startAngle;

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        paint.setColor(qje.t(xng0.controlMain, getContext()));
        paint.setStrokeWidth(tje.x(getContext(), 3.0f));
        paint.setStyle(Paint.Style.STROKE);
        this.paint = paint;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(600L);
        ofFloat.addUpdateListener(new yi(13, this));
        this.rotateAnimator = ofFloat;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c4i0.CircularProgressBar);
        try {
            paint.setStrokeWidth(obtainStyledAttributes.getDimension(c4i0.CircularProgressBar_component_stroke_width, tje.x(getContext(), 3.0f)));
            applyThemedAttributes(attributeSet, obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void applyThemedAttributes(AttributeSet attributeSet, TypedArray attrs) {
        if (attributeSet == null) {
            this.paint.setColor(qje.t(xng0.controlMain, getContext()));
            return;
        }
        int i = c4i0.CircularProgressBar_component_stroke_color;
        int i2 = xng0.controlMain;
        final int i3 = 0;
        Consumer consumer = new Consumer(this) { // from class: evb
            public final /* synthetic */ CircularProgressBar b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i4 = i3;
                CircularProgressBar circularProgressBar = this.b;
                Integer num = (Integer) obj;
                switch (i4) {
                    case 0:
                        CircularProgressBar.applyThemedAttributes$lambda$0(circularProgressBar, num);
                        break;
                    default:
                        CircularProgressBar.applyThemedAttributes$lambda$1(circularProgressBar, num);
                        break;
                }
            }
        };
        final int i4 = 1;
        qje.S(attributeSet, attrs, "component_stroke_color", i, i2, consumer, new Consumer(this) { // from class: evb
            public final /* synthetic */ CircularProgressBar b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i4;
                CircularProgressBar circularProgressBar = this.b;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        CircularProgressBar.applyThemedAttributes$lambda$0(circularProgressBar, num);
                        break;
                    default:
                        CircularProgressBar.applyThemedAttributes$lambda$1(circularProgressBar, num);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyThemedAttributes$lambda$0(CircularProgressBar circularProgressBar, Integer num) {
        circularProgressBar.setTag(mvb.a, num);
        circularProgressBar.paint.setColor(qje.t(num.intValue(), circularProgressBar.getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyThemedAttributes$lambda$1(CircularProgressBar circularProgressBar, Integer num) {
        circularProgressBar.paint.setColor(circularProgressBar.getContext().getColor(num.intValue()));
    }

    private final void ensureOval() {
        float x = tje.x(getContext(), 3.0f) / 2.0f;
        this.oval = new RectF(getPaddingLeft() + 0.0f + x, getPaddingTop() + 0.0f + x, (getWidth() - getPaddingRight()) - x, (getHeight() - getPaddingBottom()) - x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rotateAnimator$lambda$0$0(CircularProgressBar circularProgressBar, ValueAnimator valueAnimator) {
        circularProgressBar.startAngle = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        circularProgressBar.invalidate();
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public boolean getIsTrackingsRedesignEnabled() {
        return false;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        Object tag = getTag(mvb.a);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            this.paint.setColor(qje.t(num.intValue(), getContext()));
        }
        invalidate();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.rotateAnimator.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.rotateAnimator.cancel();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.oval == null) {
            ensureOval();
        }
        canvas.drawArc(this.oval, this.startAngle, 90.0f, false, this.paint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int x = (int) tje.x(getContext(), 64.0f);
        setMeasuredDimension(View.resolveSizeAndState(x, widthMeasureSpec, 0), View.resolveSizeAndState(x, heightMeasureSpec, 0));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        ensureOval();
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(left, top, right, bottom);
        ensureOval();
    }

    @Override // android.view.View
    public void setPaddingRelative(int start, int top, int end, int bottom) {
        super.setPaddingRelative(start, top, end, bottom);
        ensureOval();
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CircularProgressBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CircularProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.circularProgressBarStyle : i);
    }
}
