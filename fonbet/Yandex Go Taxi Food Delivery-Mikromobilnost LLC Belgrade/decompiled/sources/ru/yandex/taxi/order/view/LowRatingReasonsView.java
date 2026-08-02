package ru.yandex.taxi.order.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.jl40;
import defpackage.n4h0;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.vng;
import defpackage.vsn;
import defpackage.vuz;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/yandex/taxi/order/view/LowRatingReasonsView;", "Landroid/widget/LinearLayout;", "Lru/yandex/taxi/order/feedback/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lr8i0;", Constants.KEY_DATA, "Lzy11;", "setData", "(Ljava/util/List;)V", "Ls8i0;", "onClickListener", "setOnReasonClickListener", "(Ls8i0;)V", "animateFirstData", "()V", "Ljava/util/List;", "onReasonClickListener", "Ls8i0;", "Lru/yandex/taxi/order/feedback/FeedbackStrategy$FeedbackType;", "getRatingType", "()Lru/yandex/taxi/order/feedback/FeedbackStrategy$FeedbackType;", "ratingType", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LowRatingReasonsView extends LinearLayout implements ru.yandex.taxi.order.feedback.b {
    public static final int $stable = 8;
    private List<r8i0> data;
    private s8i0 onReasonClickListener;

    public LowRatingReasonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.data = EmptyList.a;
        this.onReasonClickListener = new vuz();
        setOrientation(1);
        setShowDividers(2);
        setDividerDrawable(vng.t(n4h0.divider_with_insets, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$0(LowRatingReasonsView lowRatingReasonsView, r8i0 r8i0Var, View view) {
        RatingReasonView ratingReasonView = (RatingReasonView) view;
        ratingReasonView.toggle();
        lowRatingReasonsView.onReasonClickListener.c(r8i0Var.a, ratingReasonView.getIsChecked());
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public void animateFirstData() {
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public FeedbackStrategy.FeedbackType getRatingType() {
        return FeedbackStrategy.FeedbackType.LOW_RATING;
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
        removeAllViews();
        for (r8i0 r8i0Var : data) {
            RatingReasonView ratingReasonView = new RatingReasonView(getContext(), null, 0, 6, null);
            ratingReasonView.setData(r8i0Var);
            ratingReasonView.setOnClickListener(new vsn(29, this, r8i0Var));
            addView(ratingReasonView);
        }
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public void setOnReasonClickListener(s8i0 onClickListener) {
        this.onReasonClickListener = onClickListener;
    }

    public LowRatingReasonsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LowRatingReasonsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ LowRatingReasonsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
