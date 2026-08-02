package ru.yandex.taxi.order.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import defpackage.cma1;
import defpackage.jg;
import defpackage.jl40;
import defpackage.k5;
import defpackage.m501;
import defpackage.n4h0;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.ut1;
import defpackage.vng;
import defpackage.vt1;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001+B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u001d\u0010\u0012\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lru/yandex/taxi/order/view/AllRatingReasonsView;", "Landroid/widget/LinearLayout;", "Lru/yandex/taxi/order/feedback/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lzy11;", "updateItemsAndExpand", "()V", "collapseReasonsContainer", "expandReasonsContainer", "cancelAnimation", "", "Lr8i0;", Constants.KEY_DATA, "setData", "(Ljava/util/List;)V", "Ls8i0;", "onClickListener", "setOnReasonClickListener", "(Ls8i0;)V", "animateFirstData", "Ljava/util/List;", "onReasonClickListener", "Ls8i0;", "", "canAnimate", "Z", "Landroid/animation/Animator;", "animator", "Landroid/animation/Animator;", "Lru/yandex/taxi/order/feedback/FeedbackStrategy$FeedbackType;", "getRatingType", "()Lru/yandex/taxi/order/feedback/FeedbackStrategy$FeedbackType;", "ratingType", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Companion", "vt1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AllRatingReasonsView extends LinearLayout implements ru.yandex.taxi.order.feedback.b {
    public static final int $stable = 8;
    public static final vt1 Companion = new vt1();
    private static final String TAG = "AllRatingReasonsView";
    private Animator animator;
    private boolean canAnimate;
    private List<r8i0> data;
    private s8i0 onReasonClickListener;

    public AllRatingReasonsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        setShowDividers(2);
        setDividerDrawable(vng.t(n4h0.divider_with_insets, getContext()));
        this.data = EmptyList.a;
        this.onReasonClickListener = new m501(6);
    }

    private final void cancelAnimation() {
        Animator animator = this.animator;
        if (animator != null) {
            animator.removeAllListeners();
        }
        Animator animator2 = this.animator;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.animator = null;
    }

    private final void collapseReasonsContainer() {
        cancelAnimation();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!this.canAnimate) {
            layoutParams.height = 0;
            setLayoutParams(layoutParams);
            return;
        }
        ValueAnimator f = cma1.f(layoutParams.height, 0, new ut1(layoutParams, this, 1));
        this.animator = f;
        f.setDuration(300L);
        Animator animator = this.animator;
        if (animator != null) {
            animator.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collapseReasonsContainer$lambda$0(ViewGroup.LayoutParams layoutParams, AllRatingReasonsView allRatingReasonsView, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        allRatingReasonsView.setLayoutParams(layoutParams);
    }

    private final void expandReasonsContainer() {
        cancelAnimation();
        int i = 0;
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), 0));
        int measuredHeight = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!this.canAnimate) {
            this.canAnimate = true;
            layoutParams.height = measuredHeight;
            setLayoutParams(layoutParams);
            return;
        }
        ValueAnimator f = cma1.f(0, measuredHeight, new ut1(layoutParams, this, i));
        this.animator = f;
        f.setDuration(300L);
        Animator animator = this.animator;
        if (animator != null) {
            animator.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void expandReasonsContainer$lambda$0(ViewGroup.LayoutParams layoutParams, AllRatingReasonsView allRatingReasonsView, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        allRatingReasonsView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemsAndExpand() {
        removeAllViews();
        for (r8i0 r8i0Var : this.data) {
            RatingReasonView ratingReasonView = new RatingReasonView(getContext(), null, 0, 6, null);
            ratingReasonView.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -2));
            ratingReasonView.setData(r8i0Var);
            ratingReasonView.setOnClickListener(new k5(6, this, r8i0Var));
            addView(ratingReasonView);
        }
        expandReasonsContainer();
        this.canAnimate = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateItemsAndExpand$lambda$0(AllRatingReasonsView allRatingReasonsView, r8i0 r8i0Var, View view) {
        RatingReasonView ratingReasonView = (RatingReasonView) view;
        ratingReasonView.toggle();
        allRatingReasonsView.onReasonClickListener.c(r8i0Var.a, ratingReasonView.getIsChecked());
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public void animateFirstData() {
        this.canAnimate = true;
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public FeedbackStrategy.FeedbackType getRatingType() {
        return FeedbackStrategy.FeedbackType.ALL_RATING;
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public View getView() {
        return this;
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public void setData(List<r8i0> data) {
        if (jl40.l(this.data, data)) {
            return;
        }
        this.data = data;
        collapseReasonsContainer();
        Animator animator = this.animator;
        if (animator != null) {
            if (getChildCount() <= 0) {
                animator = null;
            }
            if (animator != null) {
                animator.addListener(new AnimUtils$AnimationEndListener(new jg(12, this)));
                return;
            }
        }
        updateItemsAndExpand();
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public void setOnReasonClickListener(s8i0 onClickListener) {
        this.onReasonClickListener = onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AllRatingReasonsView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AllRatingReasonsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
