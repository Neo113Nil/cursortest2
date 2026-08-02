package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.progressbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.yandex.div.state.db.StateEntry;
import defpackage.g8e;
import defpackage.sls;
import defpackage.vng;
import defpackage.xvp0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$IntRef;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001FB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001eJ#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u001f2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u0014H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0006H\u0007¢\u0006\u0004\b+\u0010\u001eJ\u0017\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u0010H\u0007¢\u0006\u0004\b-\u0010\u0013J\u0017\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\rH\u0014¢\u0006\u0004\b2\u0010\u000fR\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010>\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u00148\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b>\u0010<\"\u0004\b?\u0010)R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010@R\u0016\u0010$\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010@R\u0016\u0010A\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/progressbar/SearchProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/animation/ValueAnimator;", "defaultAnimator", "()Landroid/animation/ValueAnimator;", "Lzy11;", "startDefaultAnimation", "()V", "", "isImmediate", "startFirstAnimation", "(Z)V", "", "fromPosition", "toPosition", "", "duration", "step", "Lkotlin/Function0;", "onAnimationEnd", "startAnimation", "(FFJILsls;)V", "(I)V", "Lkotlin/Pair;", "getInterval", "(I)Lkotlin/Pair;", "getIntervalDuration", "(I)J", "startTime", "setDuration", "(JJ)V", "radius", "setCornerRadius", "(F)V", "color", "setColor", "skipFirstAnimation", "start", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "Landroid/graphics/Path;", "animator", "Landroid/animation/ValueAnimator;", "defaultProgress", "F", "value", "progressFraction", "setProgressFraction", "J", "started", "Z", "", "strokeCornerRadii", "[F", "CancellableAnimationListener", MetaDataField.SCREEN_FIELD}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SearchProgressBar extends View {
    public static final int $stable = 8;
    private ValueAnimator animator;
    private float defaultProgress;
    private long duration;
    private final Paint paint;
    private final Path path;
    private float progressFraction;
    private long startTime;
    private boolean started;
    private float[] strokeCornerRadii;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/progressbar/SearchProgressBar$CancellableAnimationListener;", "Landroid/animation/AnimatorListenerAdapter;", "<init>", "()V", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationCancel", "(Landroid/animation/Animator;)V", "", "value", "cancelled", "Z", "getCancelled", "()Z", MetaDataField.SCREEN_FIELD}, k = 1, mv = {2, 3, 0}, xi = 48)
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
    }

    private final ValueAnimator defaultAnimator() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 0.15f).setDuration(5000L);
        duration.addUpdateListener(new xvp0(this, 2));
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

    private final void setProgressFraction(float f) {
        this.progressFraction = f;
        invalidate();
    }

    private final void startAnimation(float fromPosition, float toPosition, long duration, final int step, final sls onAnimationEnd) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(fromPosition, toPosition).setDuration(duration);
        duration2.setInterpolator(new LinearInterpolator());
        duration2.addUpdateListener(new xvp0(this, 1));
        duration2.addListener(new CancellableAnimationListener() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.progressbar.SearchProgressBar$startAnimation$1$2
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
        long I = vng.I() + 400;
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        long j2 = this.startTime;
        long intervalDuration = getIntervalDuration(ref$IntRef.element);
        while (true) {
            long j3 = intervalDuration + j2;
            j = j2;
            j2 = j3;
            i = ref$IntRef.element;
            if (j2 > I) {
                break;
            }
            int i2 = i + 1;
            ref$IntRef.element = i2;
            intervalDuration = getIntervalDuration(i2);
        }
        float f = (I - j) / (j2 - j);
        final long j4 = j2 - I;
        Pair<Float, Float> interval = getInterval(i);
        float floatValue = ((Number) interval.getFirst()).floatValue();
        final float floatValue2 = ((Number) interval.getSecond()).floatValue();
        final float b = g8e.b(floatValue2, floatValue, f, floatValue);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, b).setDuration(isImmediate ? 0L : 400L);
        duration.setInterpolator(new LinearInterpolator());
        duration.addUpdateListener(new xvp0(this, 0));
        duration.addListener(new CancellableAnimationListener() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.progressbar.SearchProgressBar$startFirstAnimation$1$2
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

    public final void setColor(int color) {
        this.paint.setColor(color);
        invalidate();
    }

    public final void setCornerRadius(float radius) {
        this.strokeCornerRadii = new float[]{0.0f, 0.0f, radius, radius, radius, radius, 0.0f, 0.0f};
        invalidate();
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
