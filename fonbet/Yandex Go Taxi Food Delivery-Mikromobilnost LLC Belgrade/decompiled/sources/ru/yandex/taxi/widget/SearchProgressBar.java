package ru.yandex.taxi.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.yandex.div.state.db.StateEntry;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b7p0;
import defpackage.g4i0;
import defpackage.g8e;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.sls;
import defpackage.tje;
import defpackage.wuj0;
import defpackage.xng0;
import defpackage.yvp0;
import defpackage.zvp0;
import defpackage.zy11;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$IntRef;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SearchProgressBar;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0014\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001XB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0014¢\u0006\u0004\b&\u0010\u001dJ\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u00102\b\b\u0001\u0010,\u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0010H\u0002¢\u0006\u0004\b/\u0010\u001dJ\u0017\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u000bH\u0003¢\u0006\u0004\b1\u0010!J\u000f\u00102\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u0010\u001dJA\u00108\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u00072\u0010\b\u0002\u00107\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u000106H\u0003¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u0010.J#\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0:2\u0006\u00105\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u0007H\u0002¢\u0006\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010J\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u000e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bJ\u0010H\"\u0004\bK\u0010\u0012R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010LR\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010LR\u0016\u0010M\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR$\u0010W\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010.¨\u0006Y"}, d2 = {"Lru/yandex/taxi/widget/SearchProgressBar;", "Landroid/view/View;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isStarted", "()Z", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Lzy11;", "setStrokeCornerRadius", "(F)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "duration", "startTime", "setDuration", "(JJ)V", "stopWithoutAnimation", "()V", "stopAndHide", "start", "skipFirstAnimation", "(Z)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "Landroid/animation/ValueAnimator;", "defaultAnimator", "()Landroid/animation/ValueAnimator;", "applyAttributes", "(Landroid/util/AttributeSet;I)V", "attr", "setStrokeColorAttr", "(I)V", "startDefaultAnimation", "isImmediate", "startFirstAnimation", "reset", "fromPosition", "toPosition", "step", "Lkotlin/Function0;", "onAnimationEnd", "startAnimation", "(FFJILsls;)V", "Lkotlin/Pair;", "getInterval", "(I)Lkotlin/Pair;", "getIntervalDuration", "(I)J", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "Landroid/graphics/Path;", "animator", "Landroid/animation/ValueAnimator;", "defaultProgress", "F", "value", "progressFraction", "setProgressFraction", "J", "started", "Z", "", "strokeCornerRadii", "[F", "strokeColorRes", "Ljava/lang/Integer;", "getStrokeColor", "()I", "setStrokeColor", "strokeColor", "CancellableAnimationListener", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SearchProgressBar extends View implements nwy0 {
    public static final int $stable = 8;
    private ValueAnimator animator;
    private float defaultProgress;
    private long duration;
    private final Paint paint;
    private final Path path;
    private float progressFraction;
    private long startTime;
    private boolean started;
    private Integer strokeColorRes;
    private float[] strokeCornerRadii;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/widget/SearchProgressBar$CancellableAnimationListener;", "Landroid/animation/AnimatorListenerAdapter;", "<init>", "()V", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationCancel", "(Landroid/animation/Animator;)V", "", "value", "cancelled", "Z", "getCancelled", "()Z", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static class CancellableAnimationListener extends AnimatorListenerAdapter {
        private boolean cancelled;

        public final boolean getCancelled() {
            return this.cancelled;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            this.cancelled = true;
        }
    }

    public SearchProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.paint = new Paint(1);
        this.path = new Path();
        this.strokeCornerRadii = new float[0];
        setMinimumHeight(tje.u(6, getContext()));
        applyAttributes(attributeSet, i);
    }

    private final void applyAttributes(AttributeSet attributeSet, int defStyleAttr) {
        if (attributeSet == null) {
            setStrokeColorAttr(xng0.controlMain);
            setStrokeCornerRadius(tje.u(10, getContext()));
            return;
        }
        final int i = 0;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g4i0.SearchProgressBar, defStyleAttr, 0);
        try {
            final int i2 = 1;
            qje.S(attributeSet, obtainStyledAttributes, "component_search_progress_stroke_color", zvp0.b, xng0.controlMain, new Consumer(this) { // from class: wvp0
                public final /* synthetic */ SearchProgressBar b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i3 = i;
                    SearchProgressBar searchProgressBar = this.b;
                    Integer num = (Integer) obj;
                    switch (i3) {
                        case 0:
                            searchProgressBar.setStrokeColorAttr(num.intValue());
                            break;
                        default:
                            SearchProgressBar.applyAttributes$lambda$0(searchProgressBar, num);
                            break;
                    }
                }
            }, new Consumer(this) { // from class: wvp0
                public final /* synthetic */ SearchProgressBar b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i3 = i2;
                    SearchProgressBar searchProgressBar = this.b;
                    Integer num = (Integer) obj;
                    switch (i3) {
                        case 0:
                            searchProgressBar.setStrokeColorAttr(num.intValue());
                            break;
                        default:
                            SearchProgressBar.applyAttributes$lambda$0(searchProgressBar, num);
                            break;
                    }
                }
            });
            setStrokeCornerRadius(obtainStyledAttributes.getDimension(g4i0.SearchProgressBar_component_search_progress_stroke_corner_radius, (int) TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics())));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyAttributes$lambda$0(SearchProgressBar searchProgressBar, Integer num) {
        searchProgressBar.strokeColorRes = num;
        Resources resources = searchProgressBar.getResources();
        int intValue = num.intValue();
        Resources.Theme theme = searchProgressBar.getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        searchProgressBar.setStrokeColor(resources.getColor(intValue, theme));
    }

    private final ValueAnimator defaultAnimator() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 0.15f).setDuration(5000L);
        duration.addUpdateListener(new yvp0(this, 0));
        return duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void defaultAnimator$lambda$0$0(SearchProgressBar searchProgressBar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        searchProgressBar.defaultProgress = floatValue;
        searchProgressBar.setProgressFraction(floatValue);
    }

    private final Pair<Float, Float> getInterval(int step) {
        float f;
        float f2 = 0.0f;
        if (step >= 0) {
            int i = 0;
            float f3 = 0.5f;
            while (true) {
                f = f2 + f3;
                f3 *= 0.5f;
                if (i == step) {
                    break;
                }
                i++;
                f2 = f;
            }
        } else {
            f = 0.0f;
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f));
    }

    private final long getIntervalDuration(int step) {
        return (long) (Math.pow(2.0d, step) * (this.duration / 2.0d));
    }

    private final void reset() {
        this.started = false;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.defaultProgress = 0.0f;
        setProgressFraction(0.0f);
        this.duration = 0L;
        this.startTime = 0L;
    }

    private final void setProgressFraction(float f) {
        this.progressFraction = f;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStrokeColorAttr(int attr) {
        setTag(zvp0.a, Integer.valueOf(attr));
        setStrokeColor(qje.t(attr, getContext()));
    }

    private final void startAnimation(float fromPosition, float toPosition, long duration, final int step, final sls onAnimationEnd) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(fromPosition, toPosition).setDuration(duration);
        duration2.setInterpolator(new LinearInterpolator());
        duration2.addUpdateListener(new yvp0(this, 2));
        duration2.addListener(new CancellableAnimationListener() { // from class: ru.yandex.taxi.widget.SearchProgressBar$startAnimation$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                if (getCancelled()) {
                    return;
                }
                sls slsVar = sls.this;
                if (slsVar != null) {
                    slsVar.invoke();
                }
                int i = step;
                if (i >= 0) {
                    this.startAnimation(i + 1);
                }
            }
        });
        duration2.start();
        this.animator = duration2;
    }

    public static /* synthetic */ void startAnimation$default(SearchProgressBar searchProgressBar, float f, float f2, long j, int i, sls slsVar, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            slsVar = null;
        }
        searchProgressBar.startAnimation(f, f2, j, i, slsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimation$lambda$0$0(SearchProgressBar searchProgressBar, ValueAnimator valueAnimator) {
        searchProgressBar.setProgressFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void startDefaultAnimation() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator defaultAnimator = defaultAnimator();
        this.animator = defaultAnimator;
        if (defaultAnimator != null) {
            defaultAnimator.start();
        }
    }

    private final void startFirstAnimation(boolean isImmediate) {
        long j;
        int i;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        long currentTimeMillis = System.currentTimeMillis() + 400;
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        long j2 = this.startTime;
        long intervalDuration = getIntervalDuration(ref$IntRef.element);
        while (true) {
            long j3 = intervalDuration + j2;
            j = j2;
            j2 = j3;
            i = ref$IntRef.element;
            if (j2 > currentTimeMillis) {
                break;
            }
            int i2 = i + 1;
            ref$IntRef.element = i2;
            intervalDuration = getIntervalDuration(i2);
        }
        float f = (currentTimeMillis - j) / (j2 - j);
        final long j4 = j2 - currentTimeMillis;
        Pair<Float, Float> interval = getInterval(i);
        float floatValue = ((Number) interval.getFirst()).floatValue();
        final float floatValue2 = ((Number) interval.getSecond()).floatValue();
        final float b = g8e.b(floatValue2, floatValue, f, floatValue);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, b).setDuration(isImmediate ? 0L : 400L);
        duration.setInterpolator(new LinearInterpolator());
        duration.addUpdateListener(new yvp0(this, 1));
        duration.addListener(new CancellableAnimationListener() { // from class: ru.yandex.taxi.widget.SearchProgressBar$startFirstAnimation$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                SearchProgressBar.startAnimation$default(SearchProgressBar.this, b, floatValue2, j4, ref$IntRef.element, null, 16, null);
                if (getCancelled()) {
                    return;
                }
                SearchProgressBar.startAnimation$default(SearchProgressBar.this, b, floatValue2, j4, ref$IntRef.element, null, 16, null);
            }
        });
        duration.start();
        this.animator = duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startFirstAnimation$lambda$0$0(SearchProgressBar searchProgressBar, ValueAnimator valueAnimator) {
        searchProgressBar.setProgressFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 stopAndHide$lambda$0(SearchProgressBar searchProgressBar) {
        searchProgressBar.setVisibility(8);
        searchProgressBar.reset();
        return zy11.a;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        Object tag = getTag(zvp0.a);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            setStrokeColorAttr(num.intValue());
            return;
        }
        Integer num2 = this.strokeColorRes;
        if (num2 != null) {
            int intValue = num2.intValue();
            Resources resources = getResources();
            Resources.Theme theme = getContext().getTheme();
            ThreadLocal threadLocal = wuj0.a;
            setStrokeColor(resources.getColor(intValue, theme));
        }
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final int getStrokeColor() {
        return this.paint.getColor();
    }

    /* renamed from: isStarted, reason: from getter */
    public final boolean getStarted() {
        return this.started;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        if (Float.floatToIntBits(this.defaultProgress) == Float.floatToIntBits(this.progressFraction)) {
            f = width * this.progressFraction;
        } else {
            float f2 = width;
            float f3 = this.defaultProgress;
            f = ((f2 - (f3 * f2)) * this.progressFraction) + (f2 * f3);
        }
        float f4 = f;
        this.path.reset();
        float f5 = width - f4;
        Path path = this.path;
        if (f5 < 50.0f) {
            path.addRect(getPaddingLeft(), getPaddingTop(), f4, getHeight() - getPaddingBottom(), Path.Direction.CW);
        } else {
            path.addRoundRect(getPaddingLeft(), getPaddingTop(), f4, getHeight() - getPaddingBottom(), this.strokeCornerRadii, Path.Direction.CW);
        }
        canvas.drawPath(this.path, this.paint);
    }

    public final void setDuration(long duration, long startTime) {
        if (this.duration == duration && this.startTime == startTime) {
            return;
        }
        this.duration = Math.max(duration, 15000L);
        this.startTime = startTime;
        if (this.started) {
            startFirstAnimation(false);
        }
    }

    public final void setStrokeColor(int i) {
        this.paint.setColor(i);
        invalidate();
    }

    public final void setStrokeCornerRadius(float cornerRadius) {
        this.strokeCornerRadii = new float[]{0.0f, 0.0f, cornerRadius, cornerRadius, cornerRadius, cornerRadius, 0.0f, 0.0f};
        invalidate();
    }

    public final void start(boolean skipFirstAnimation) {
        if (this.started) {
            return;
        }
        this.started = true;
        if (this.duration == 0 || this.startTime == 0) {
            startDefaultAnimation();
        } else {
            startFirstAnimation(skipFirstAnimation);
        }
    }

    public final void stopAndHide() {
        startAnimation(this.progressFraction, 1.0f, 300L, -1, new b7p0(7, this));
    }

    public final void stopWithoutAnimation() {
        reset();
    }

    public final void start() {
        start(false);
    }

    public SearchProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SearchProgressBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ SearchProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAnimation(int step) {
        Pair<Float, Float> interval = getInterval(step);
        startAnimation$default(this, ((Number) interval.getFirst()).floatValue(), ((Number) interval.getSecond()).floatValue(), getIntervalDuration(step), step, null, 16, null);
    }
}
