package ru.yandex.taxi.order.search.ui.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.b;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.e051;
import defpackage.p8h0;
import defpackage.rp31;
import defpackage.wug0;
import defpackage.zkh0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001>B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J7\u0010(\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0014¢\u0006\u0004\b*\u0010\nJ\u000f\u0010+\u001a\u00020\bH\u0014¢\u0006\u0004\b+\u0010\nJ\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b-\u0010.J\u0015\u0010\u000e\u001a\u00020\b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b\u000e\u00101R\u0014\u00102\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lru/yandex/taxi/order/search/ui/views/WidePulsingCirclesView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lzy11;", "initAnimations", "()V", "", RemoteBioParameters.X, RemoteBioParameters.Y, "setAnchorPoint", "(FF)V", "Landroid/view/View;", "view", "(Landroid/view/View;FF)V", "invalidateAnimation", "calculateScale", "()F", "", "objectAny", "", "property", "from", "to", "", "delay", "Landroid/animation/ValueAnimator;", "setupObjectAnimator", "(Ljava/lang/Object;Ljava/lang/String;FFJ)Landroid/animation/ValueAnimator;", "", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onAttachedToWindow", "onDetachedFromWindow", "visibility", "setVisibility", "(I)V", "Landroid/graphics/PointF;", "anchor", "(Landroid/graphics/PointF;)V", "leadingPulseCircle", "Landroid/view/View;", "chasingPulseCircle", "Landroid/animation/AnimatorSet;", "choreograph", "Landroid/animation/AnimatorSet;", "Landroid/view/animation/Interpolator;", "linearInterpolator", "Landroid/view/animation/Interpolator;", "lastAnchor", "Landroid/graphics/PointF;", "Companion", "e051", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WidePulsingCirclesView extends FrameLayout {
    public static final int $stable = 8;
    private static final long CHASER_DELAY = 2000;
    public static final e051 Companion = new e051();
    private static final long PULSING_DURATION = 4000;
    private final View chasingPulseCircle;
    private final AnimatorSet choreograph;
    private PointF lastAnchor;
    private final View leadingPulseCircle;
    private final Interpolator linearInterpolator;

    public WidePulsingCirclesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.choreograph = new AnimatorSet();
        this.linearInterpolator = new LinearInterpolator();
        c.q(this, zkh0.pulsing_circles_view, true);
        int i = p8h0.leading_circle;
        WeakHashMap weakHashMap = b.a;
        this.leadingPulseCircle = (View) rp31.d(this, i);
        this.chasingPulseCircle = (View) rp31.d(this, p8h0.chasing_circle);
        initAnimations();
    }

    private final float calculateScale() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i > i2) {
            i = i2;
        }
        return i / r2.getDimensionPixelSize(wug0.pulsing_circle_size);
    }

    private final void initAnimations() {
        ArrayList arrayList = new ArrayList();
        float calculateScale = calculateScale();
        arrayList.add(setupObjectAnimator(this.leadingPulseCircle, "scaleX", 1.0f, calculateScale, 0L));
        arrayList.add(setupObjectAnimator(this.leadingPulseCircle, "scaleY", 1.0f, calculateScale, 0L));
        arrayList.add(setupObjectAnimator(this.leadingPulseCircle, CaretView.ALPHA_PROPERTY, 0.5f, 0.0f, 0L));
        arrayList.add(setupObjectAnimator(this.chasingPulseCircle, "scaleX", 1.0f, calculateScale, 2000L));
        arrayList.add(setupObjectAnimator(this.chasingPulseCircle, "scaleY", 1.0f, calculateScale, 2000L));
        arrayList.add(setupObjectAnimator(this.chasingPulseCircle, CaretView.ALPHA_PROPERTY, 0.5f, 0.0f, 2000L));
        this.choreograph.playTogether(arrayList);
        invalidateAnimation();
    }

    private final void invalidateAnimation() {
        int visibility = getVisibility();
        AnimatorSet animatorSet = this.choreograph;
        if (visibility != 0) {
            animatorSet.cancel();
        } else {
            if (animatorSet.isStarted()) {
                return;
            }
            this.choreograph.start();
        }
    }

    private final void setAnchorPoint(View view, float x, float y) {
        if (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
            return;
        }
        view.setX(x - (view.getMeasuredWidth() / 2.0f));
        view.setY(y - (view.getMeasuredHeight() / 2.0f));
    }

    private final ValueAnimator setupObjectAnimator(Object objectAny, String property, float from, float to, long delay) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(objectAny, property, from, to);
        ofFloat.setDuration(4000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(this.linearInterpolator);
        ofFloat.setStartDelay(delay);
        return ofFloat;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        invalidateAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.choreograph.cancel();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        PointF pointF = this.lastAnchor;
        if (pointF != null) {
            setAnchorPoint(pointF.x, pointF.y);
        }
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        invalidateAnimation();
    }

    private final void setAnchorPoint(float x, float y) {
        setAnchorPoint(this.leadingPulseCircle, x, y);
        setAnchorPoint(this.chasingPulseCircle, x, y);
    }

    public final void setAnchorPoint(PointF anchor) {
        this.lastAnchor = anchor;
        setAnchorPoint(anchor.x, anchor.y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WidePulsingCirclesView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ WidePulsingCirclesView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
