package ru.yandex.taxi.widget.progress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.fjf0;
import defpackage.hjy;
import defpackage.ma90;
import defpackage.mqg0;
import defpackage.na90;
import defpackage.ny61;
import defpackage.oa90;
import defpackage.tje;
import defpackage.vwh0;
import defpackage.y6i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 .2\u00020\u0001:\u0002/0B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\n2\b\b\u0001\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\n2\b\b\u0001\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0015J\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lru/yandex/taxi/widget/progress/LinearSegmentedProgressView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "createSegments", "()V", "hideAllAnimations", "drawSolidColorLinearSegmentedProgressView", "Lna90;", "gradient", "drawGradientLinearSegmentedProgressView", "(Lna90;)V", "totalProgress", "setTotalProgress", "(I)V", "currentProgress", "setCurrentProgress", "color", "setColor", "setProgressColor", "dashWidth", "setDashWidth", "hideAnimation", "showAnimation", "Loa90;", "paintMode", "setBonusTypeVisualIdentity", "(Loa90;)V", CA20Status.STATUS_USER_I, "progressColor", "segmentHeight", "dashHeight", "marginRight", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "Lfjf0;", "progressInfo", "Lfjf0;", "Companion", "SolidColorProgressSegment", "hjy", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinearSegmentedProgressView extends LinearLayout {
    public static final int $stable = 8;
    private static final int DASH_HEIGHT_DP = 8;
    private static final int DEFAULT_DASH_WIDTH_DP = 2;
    private static final int DEFAULT_HEIGHT_DP = 4;
    private static final int DEFAULT_TOTAL_PROGRESS = 5;
    private static final int MARGIN_RIGHT_DP = 16;
    private int color;
    private final float cornerRadius;
    private final int dashHeight;
    private int dashWidth;
    private final int marginRight;
    private int progressColor;
    private fjf0 progressInfo;
    private final int segmentHeight;
    public static final hjy Companion = new hjy();
    private static final int DEFAULT_COLOR = mqg0.component_gray_175;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/widget/progress/LinearSegmentedProgressView$SolidColorProgressSegment;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "", "height", "color", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "<init>", "(Landroid/content/Context;IIF)V", "Lzy11;", "setColor", "(I)V", "showAnimation", "()V", "hideAnimation", "Landroidx/cardview/widget/CardView;", "cardView", "Landroidx/cardview/widget/CardView;", "Lcom/airbnb/lottie/LottieAnimationView;", "animation", "Lcom/airbnb/lottie/LottieAnimationView;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SolidColorProgressSegment extends FrameLayout {
        public static final int $stable = 8;
        private final LottieAnimationView animation;
        private final CardView cardView;

        public SolidColorProgressSegment(Context context, int i, int i2, float f) {
            super(context);
            CardView cardView = new CardView(context);
            cardView.setCardBackgroundColor(i2);
            cardView.setRadius(f);
            addView(cardView, -1, i);
            ((FrameLayout.LayoutParams) cardView.getLayoutParams()).gravity = 16;
            this.cardView = cardView;
            LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
            lottieAnimationView.setAnimation(vwh0.ic_progress_animation);
            addView(lottieAnimationView, -2, -2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lottieAnimationView.getLayoutParams();
            layoutParams.gravity = 8388629;
            lottieAnimationView.setLayoutParams(layoutParams);
            lottieAnimationView.setVisibility(4);
            lottieAnimationView.setRepeatMode(1);
            lottieAnimationView.loop(true);
            this.animation = lottieAnimationView;
        }

        public final void hideAnimation() {
            this.animation.setVisibility(4);
        }

        public final void setColor(int color) {
            this.cardView.setCardBackgroundColor(color);
        }

        public final void showAnimation() {
            this.animation.setVisibility(0);
            this.animation.playAnimation();
        }
    }

    public LinearSegmentedProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.color = getContext().getColor(DEFAULT_COLOR);
        this.segmentHeight = tje.v(getContext(), 4.0f);
        this.dashWidth = tje.v(getContext(), 2.0f);
        this.dashHeight = tje.v(getContext(), 8.0f);
        this.marginRight = tje.v(getContext(), 16.0f);
        this.cornerRadius = tje.w(1, getContext());
        this.progressInfo = new fjf0();
        setOrientation(0);
    }

    private final void createSegments() {
        removeAllViews();
        int i = this.progressInfo.a;
        for (int i2 = 0; i2 < i; i2++) {
            SolidColorProgressSegment solidColorProgressSegment = new SolidColorProgressSegment(getContext(), this.segmentHeight, this.color, this.cornerRadius);
            addView(solidColorProgressSegment, -2, -1);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) solidColorProgressSegment.getLayoutParams();
            layoutParams.weight = 1.0f;
            layoutParams.setMarginEnd(this.dashWidth);
        }
    }

    private final void drawGradientLinearSegmentedProgressView(na90 gradient) {
        removeAllViews();
        Context context = getContext();
        fjf0 fjf0Var = this.progressInfo;
        GradientLinearSegmentedProgressView gradientLinearSegmentedProgressView = new GradientLinearSegmentedProgressView(context, fjf0Var.a, fjf0Var.b, this.dashWidth, this.dashHeight, this.segmentHeight, this.cornerRadius, gradient, this.color);
        addView(gradientLinearSegmentedProgressView, -1, -2);
        ((LinearLayout.LayoutParams) gradientLinearSegmentedProgressView.getLayoutParams()).setMargins(0, 0, this.marginRight, 0);
    }

    private final void drawSolidColorLinearSegmentedProgressView() {
        createSegments();
        hideAllAnimations();
        fjf0 fjf0Var = this.progressInfo;
        fjf0Var.b = y6i0.d(fjf0Var.b, 0, fjf0Var.a);
        setProgressColor(this.progressColor);
        fjf0 fjf0Var2 = this.progressInfo;
        int i = fjf0Var2.b;
        if (i <= 0 || i >= fjf0Var2.a) {
            return;
        }
        ((SolidColorProgressSegment) getChildAt(i - 1)).showAnimation();
    }

    private final void hideAllAnimations() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((SolidColorProgressSegment) getChildAt(i)).hideAnimation();
        }
    }

    public final void hideAnimation() {
        hideAllAnimations();
    }

    public final void setBonusTypeVisualIdentity(oa90 paintMode) {
        if (!(paintMode instanceof ma90)) {
            ny61.u();
        } else {
            this.progressColor = 0;
            drawSolidColorLinearSegmentedProgressView();
        }
    }

    public final void setColor(int color) {
        this.color = color;
        fjf0 fjf0Var = this.progressInfo;
        int i = fjf0Var.a;
        for (int i2 = fjf0Var.b; i2 < i; i2++) {
            ((SolidColorProgressSegment) getChildAt(i2)).setColor(color);
        }
    }

    public final void setCurrentProgress(int currentProgress) {
        fjf0 fjf0Var = this.progressInfo;
        fjf0Var.b = y6i0.d(currentProgress, 0, fjf0Var.a);
    }

    public final void setDashWidth(int dashWidth) {
        this.dashWidth = dashWidth;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.setMarginEnd(dashWidth);
            childAt.setLayoutParams(layoutParams);
        }
    }

    public final void setProgressColor(int color) {
        this.progressColor = color;
        int i = this.progressInfo.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((SolidColorProgressSegment) getChildAt(i2)).setColor(this.progressColor);
        }
    }

    public final void setTotalProgress(int totalProgress) {
        this.progressInfo.a = totalProgress;
    }

    public final void showAnimation() {
        setCurrentProgress(this.progressInfo.b);
    }

    public LinearSegmentedProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LinearSegmentedProgressView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ LinearSegmentedProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
