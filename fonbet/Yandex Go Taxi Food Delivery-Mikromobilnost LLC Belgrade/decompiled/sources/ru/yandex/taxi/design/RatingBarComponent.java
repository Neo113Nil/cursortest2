package ru.yandex.taxi.design;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.c4i0;
import defpackage.cuz;
import defpackage.dzg0;
import defpackage.eng0;
import defpackage.hes0;
import defpackage.hg;
import defpackage.k4o;
import defpackage.mrg0;
import defpackage.ndh0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.rwh0;
import defpackage.six;
import defpackage.tje;
import defpackage.vno;
import defpackage.vtz;
import defpackage.w511;
import defpackage.w7i0;
import defpackage.wtn;
import defpackage.xmf0;
import defpackage.xng0;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0081\u00010B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\b\b\u0001\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u000eJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0007¢\u0006\u0004\b$\u0010\u000eJ\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\b&\u0010\u000eJ\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\f¢\u0006\u0004\b/\u0010\u001fJ\u0015\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\f2\u0006\u00101\u001a\u000200¢\u0006\u0004\b4\u00103J\u0017\u00106\u001a\u00020\f2\b\b\u0001\u00105\u001a\u00020\u0007¢\u0006\u0004\b6\u0010\u000eJ\u0017\u00108\u001a\u00020\f2\b\b\u0001\u00107\u001a\u00020\u0007¢\u0006\u0004\b8\u0010\u000eJ\u000f\u00109\u001a\u00020'H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\f2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\fH\u0002¢\u0006\u0004\bA\u0010\u001fJ\u0019\u0010B\u001a\u00020\f2\b\b\u0001\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\bB\u0010\u000eJ\u000f\u0010C\u001a\u00020\fH\u0002¢\u0006\u0004\bC\u0010\u001fJ\u0019\u0010D\u001a\u00020\f2\b\b\u0001\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\bD\u0010\u000eJ\u000f\u0010E\u001a\u00020\fH\u0002¢\u0006\u0004\bE\u0010\u001fJ\u000f\u0010F\u001a\u00020\fH\u0002¢\u0006\u0004\bF\u0010\u001fJ\u0019\u0010H\u001a\u00020G2\b\b\u0001\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\fH\u0002¢\u0006\u0004\bM\u0010\u001fJ\u0017\u0010O\u001a\u00020\f2\u0006\u0010N\u001a\u00020 H\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007H\u0002¢\u0006\u0004\bR\u0010\u000eJ/\u0010U\u001a\u00020Y2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020 2\u0006\u0010V\u001a\u00020\u00072\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bU\u0010ZJ\u001f\u0010\\\u001a\u00020\f2\u0006\u0010%\u001a\u00020 2\u0006\u0010[\u001a\u00020'H\u0002¢\u0006\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010_R\u0016\u0010a\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001e\u0010d\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001e\u0010f\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u001e\u0010i\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010bR\u0016\u0010l\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010_R\u0016\u0010m\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010_R\u0016\u0010n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010_R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010oR\u001e\u0010q\u001a\n\u0012\u0004\u0012\u00020p\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010oR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u0002000t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010w\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010xR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010zR\u0018\u0010{\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010}\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010|R\u0018\u0010~\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010|R\u0017\u0010\u007f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0082\u0001"}, d2 = {"Lru/yandex/taxi/design/RatingBarComponent;", "Landroid/widget/LinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "attrRes", "Lzy11;", "setStarColor", "(I)V", "setSelectedStarColor", "Landroid/graphics/drawable/Drawable;", "selectedStar", "unselectedStar", "setStarsDrawable", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", C0553n3.g, "setSelectedStarsBackground", "(Landroid/graphics/drawable/Drawable;)V", "Lru/yandex/taxi/design/RatingBarComponent$AnimationType;", "type", "setAnimationType", "(Lru/yandex/taxi/design/RatingBarComponent$AnimationType;)V", "animationColor", "initWithLottieAnimation", "setDefaultStars", "()V", "", "getRating", "()F", "rating", "setRating", "score", "startSelectionAnimation", "", "starsClickable", "setStarsClickable", "(Z)V", "Landroid/widget/ImageView$ScaleType;", "scaleType", "setStarScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "stopAnimation", "Lw7i0;", "listener", "addOnRatingBarChangeListener", "(Lw7i0;)V", "removeOnRatingBarChangeListener", "selectStarsColor", "setSelectedColor", "starColor", "setColor", "applyThemeForChildrenByDefault", "()Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "initializeAttributes", "(Landroid/util/AttributeSet;Landroid/content/Context;)V", "init", "initOrUpdateWithAnimation", "createStarsViewsIfNeed", "createLottieAnimationViewsOrUpdateColorIfExists", "createContainerWithAnimationStarsIfNeed", "clearView", "Lcom/airbnb/lottie/LottieAnimationView;", "createStarAnimation", "(I)Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/widget/ImageView;", "createStar", "()Landroid/widget/ImageView;", "refreshStars", "newRating", "updateRatingValue", "(F)V", "starIndex", "animateLottieAnimationIfNeed", "Landroid/view/View;", "view", "scale", "translationY", "Landroid/view/animation/Interpolator;", "interpolator", "Landroid/view/ViewPropertyAnimator;", "(Landroid/view/View;FILandroid/view/animation/Interpolator;)Landroid/view/ViewPropertyAnimator;", "fromUser", "notifyListeners", "(FZ)V", "starScaleOffset", CA20Status.STATUS_USER_I, "maxStars", "currentRating", "F", "", "starsViews", "[Landroid/widget/ImageView;", "lottieAnimationViews", "[Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/widget/FrameLayout;", "containersWithAnimationStars", "[Landroid/widget/FrameLayout;", "starPadding", "starWidth", "starHeight", "starWeight", "Z", "", "contentDescriptions", "[Ljava/lang/CharSequence;", "isCustomStars", "", "listeners", "Ljava/util/Set;", "accelerate", "Landroid/view/animation/Interpolator;", "decelerate", "Landroid/widget/ImageView$ScaleType;", "selectStarDrawable", "Landroid/graphics/drawable/Drawable;", "starDrawable", "selectedStarsBackground", "currentAnimationType", "Lru/yandex/taxi/design/RatingBarComponent$AnimationType;", "AnimationType", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RatingBarComponent extends LinearLayout implements nwy0 {
    private final Interpolator accelerate;
    private FrameLayout[] containersWithAnimationStars;
    private CharSequence[] contentDescriptions;
    private AnimationType currentAnimationType;
    private float currentRating;
    private final Interpolator decelerate;
    private boolean isCustomStars;
    private final Set<w7i0> listeners;
    private LottieAnimationView[] lottieAnimationViews;
    private int maxStars;
    private ImageView.ScaleType scaleType;
    private Drawable selectStarDrawable;
    private Drawable selectedStarsBackground;
    private Drawable starDrawable;
    private int starHeight;
    private float starPadding;
    private final int starScaleOffset;
    private int starWeight;
    private int starWidth;
    private boolean starsClickable;
    private ImageView[] starsViews;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/design/RatingBarComponent$AnimationType;", "", "ONE_SELECTED", "ALL_SELECTED", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class AnimationType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType ALL_SELECTED;
        public static final AnimationType ONE_SELECTED;

        static {
            AnimationType animationType = new AnimationType("ONE_SELECTED", 0);
            ONE_SELECTED = animationType;
            AnimationType animationType2 = new AnimationType("ALL_SELECTED", 1);
            ALL_SELECTED = animationType2;
            AnimationType[] animationTypeArr = {animationType, animationType2};
            $VALUES = animationTypeArr;
            $ENTRIES = kotlin.enums.a.a(animationTypeArr);
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    public RatingBarComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.starScaleOffset = -tje.r(mrg0.rating_bar_translation_y, getContext());
        this.maxStars = 5;
        this.starsClickable = true;
        this.listeners = new HashSet();
        this.accelerate = new AccelerateInterpolator();
        this.decelerate = new DecelerateInterpolator();
        this.scaleType = ImageView.ScaleType.FIT_CENTER;
        this.currentAnimationType = AnimationType.ONE_SELECTED;
        this.starDrawable = getResources().getDrawable(dzg0.ic_rating_star, null).mutate();
        this.selectStarDrawable = getResources().getDrawable(dzg0.ic_rating_star, null).mutate();
        initializeAttributes(attributeSet, context);
        init();
    }

    private final void animateLottieAnimationIfNeed(int starIndex) {
        LottieAnimationView[] lottieAnimationViewArr = this.lottieAnimationViews;
        if (lottieAnimationViewArr == null || lottieAnimationViewArr.length <= starIndex) {
            return;
        }
        lottieAnimationViewArr[starIndex].playAnimation();
    }

    private final void clearView() {
        FrameLayout[] frameLayoutArr = this.containersWithAnimationStars;
        if (frameLayoutArr != null) {
            for (FrameLayout frameLayout : frameLayoutArr) {
                frameLayout.removeAllViews();
            }
        }
        removeAllViews();
    }

    private final void createContainerWithAnimationStarsIfNeed() {
        if (this.containersWithAnimationStars != null) {
            return;
        }
        int i = this.maxStars;
        FrameLayout[] frameLayoutArr = new FrameLayout[i];
        for (int i2 = 0; i2 < i; i2++) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            frameLayoutArr[i2] = frameLayout;
        }
        this.containersWithAnimationStars = frameLayoutArr;
    }

    private final void createLottieAnimationViewsOrUpdateColorIfExists(int animationColor) {
        LottieAnimationView[] lottieAnimationViewArr = this.lottieAnimationViews;
        int i = 0;
        if (lottieAnimationViewArr != null && lottieAnimationViewArr.length != 0) {
            int i2 = this.maxStars;
            while (i < i2) {
                lottieAnimationViewArr[i].addValueCallback(new six("**"), (six) cuz.I, (hes0) new vno(animationColor, 3));
                i++;
            }
            return;
        }
        int i3 = this.maxStars;
        LottieAnimationView[] lottieAnimationViewArr2 = new LottieAnimationView[i3];
        while (i < i3) {
            lottieAnimationViewArr2[i] = createStarAnimation(animationColor);
            i++;
        }
        this.lottieAnimationViews = lottieAnimationViewArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorFilter createLottieAnimationViewsOrUpdateColorIfExists$lambda$0(int i, vtz vtzVar) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    private final ImageView createStar() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.starWidth, this.starHeight);
        int i = this.starWeight;
        if (i > -1) {
            layoutParams.weight = i;
        }
        float f = this.starPadding;
        appCompatImageView.setPadding((int) f, 0, (int) f, 0);
        appCompatImageView.setAdjustViewBounds(true);
        appCompatImageView.setScaleType(this.scaleType);
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setBackgroundColor(0);
        appCompatImageView.setImageDrawable(this.starDrawable);
        hg.a(appCompatImageView);
        return appCompatImageView;
    }

    private final LottieAnimationView createStarAnimation(int animationColor) {
        final LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
        lottieAnimationView.setLayoutParams(new LinearLayout.LayoutParams(this.starWidth, this.starHeight));
        lottieAnimationView.setAnimation(rwh0.animation_star);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.setAlpha(0.0f);
        lottieAnimationView.setClickable(false);
        lottieAnimationView.addValueCallback(new six("**"), (six) cuz.I, (hes0) new vno(animationColor, 4));
        lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.design.RatingBarComponent$createStarAnimation$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                LottieAnimationView.this.setAlpha(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                LottieAnimationView.this.setAlpha(1.0f);
            }
        });
        return lottieAnimationView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorFilter createStarAnimation$lambda$0(int i, vtz vtzVar) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    private final void createStarsViewsIfNeed() {
        ImageView[] imageViewArr = this.starsViews;
        if (imageViewArr == null || imageViewArr.length == 0) {
            int i = this.maxStars;
            ImageView[] imageViewArr2 = new ImageView[i];
            int i2 = 0;
            while (i2 < i) {
                ImageView createStar = createStar();
                int i3 = i2 + 1;
                createStar.setOnClickListener(new wtn(this, i3, 4));
                CharSequence[] charSequenceArr = this.contentDescriptions;
                if (charSequenceArr != null && charSequenceArr.length > i2) {
                    createStar.setContentDescription(charSequenceArr[i2]);
                }
                imageViewArr2[i2] = createStar;
                i2 = i3;
            }
            this.starsViews = imageViewArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createStarsViewsIfNeed$lambda$0(RatingBarComponent ratingBarComponent, int i, View view) {
        if (ratingBarComponent.starsClickable) {
            float f = i;
            ratingBarComponent.updateRatingValue(f);
            ratingBarComponent.notifyListeners(f, true);
        }
    }

    private final void init() {
        createStarsViewsIfNeed();
        ImageView[] imageViewArr = this.starsViews;
        if (imageViewArr == null) {
            return;
        }
        for (ImageView imageView : imageViewArr) {
            addView(imageView);
        }
        refreshStars();
    }

    private final void initOrUpdateWithAnimation(int animationColor) {
        LottieAnimationView[] lottieAnimationViewArr;
        FrameLayout[] frameLayoutArr;
        clearView();
        createStarsViewsIfNeed();
        createLottieAnimationViewsOrUpdateColorIfExists(animationColor);
        createContainerWithAnimationStarsIfNeed();
        ImageView[] imageViewArr = this.starsViews;
        if (imageViewArr == null || (lottieAnimationViewArr = this.lottieAnimationViews) == null || (frameLayoutArr = this.containersWithAnimationStars) == null) {
            return;
        }
        int i = this.maxStars;
        for (int i2 = 0; i2 < i; i2++) {
            frameLayoutArr[i2].addView(imageViewArr[i2]);
            frameLayoutArr[i2].addView(lottieAnimationViewArr[i2]);
            addView(frameLayoutArr[i2]);
        }
        refreshStars();
    }

    private final void initializeAttributes(AttributeSet attrs, Context context) {
        int q;
        int q2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, c4i0.RatingBarComponent);
        try {
            this.maxStars = obtainStyledAttributes.getInt(c4i0.RatingBarComponent_maxValue, 5);
            this.currentRating = obtainStyledAttributes.getFloat(c4i0.RatingBarComponent_value, 0.0f);
            this.starPadding = obtainStyledAttributes.getDimension(c4i0.RatingBarComponent_starPadding, 0.0f);
            if (attrs == null) {
                setSelectedStarColor(xng0.controlMain);
                setStarColor(eng0.colorSecondary);
            } else {
                int i = xng0.controlMain;
                if (qje.C("selectedStarColor", attrs) && (q2 = qje.q(attrs, "http://schemas.android.com/apk/res-auto", "selectedStarColor")) != 0) {
                    i = q2;
                }
                setSelectedStarColor(i);
                int i2 = xng0.controlMinor;
                if (qje.C("starColor", attrs) && (q = qje.q(attrs, "http://schemas.android.com/apk/res-auto", "starColor")) != 0) {
                    i2 = q;
                }
                setStarColor(i2);
            }
            this.starWidth = (int) obtainStyledAttributes.getDimension(c4i0.RatingBarComponent_starWidth, -2.0f);
            this.starHeight = (int) obtainStyledAttributes.getDimension(c4i0.RatingBarComponent_starHeight, -2.0f);
            this.starWeight = obtainStyledAttributes.getInt(c4i0.RatingBarComponent_starWeight, -1);
            this.contentDescriptions = obtainStyledAttributes.getTextArray(c4i0.RatingBarComponent_contentDescriptions);
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void notifyListeners(float score, boolean fromUser) {
        Iterator<w7i0> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().h(score, fromUser);
        }
    }

    private final void refreshStars() {
        ImageView[] imageViewArr = this.starsViews;
        if (imageViewArr == null) {
            return;
        }
        int i = this.maxStars;
        for (int i2 = 0; i2 < i; i2++) {
            imageViewArr[i2].setImageDrawable(null);
            if (i2 < ((int) this.currentRating)) {
                imageViewArr[i2].setImageDrawable(this.selectStarDrawable);
                imageViewArr[i2].setBackground(this.selectedStarsBackground);
            } else {
                imageViewArr[i2].setImageDrawable(this.starDrawable);
                imageViewArr[i2].setBackground(null);
            }
            ImageView imageView = imageViewArr[i2];
            boolean z = true;
            if (i2 != ((int) this.currentRating) - 1) {
                z = false;
            }
            imageView.setSelected(z);
        }
    }

    private final ViewPropertyAnimator scale(View view, float scale, int translationY, Interpolator interpolator) {
        return view.animate().scaleX(scale).scaleY(scale).translationY(translationY).setDuration(175L).setInterpolator(interpolator).withLayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startSelectionAnimation$lambda$0(RatingBarComponent ratingBarComponent, View view) {
        ratingBarComponent.scale(view, 1.0f, 0, ratingBarComponent.decelerate);
    }

    private final void updateRatingValue(float newRating) {
        this.currentRating = newRating;
        refreshStars();
    }

    public final void addOnRatingBarChangeListener(w7i0 listener) {
        this.listeners.add(listener);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        if (this.isCustomStars) {
            return;
        }
        Object tag = getTag(ndh0.control_main_id);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        Drawable drawable = this.selectStarDrawable;
        if (drawable != null && num != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(qje.t(num.intValue(), getContext()), PorterDuff.Mode.SRC_IN));
        }
        Object tag2 = getTag(ndh0.control_minor_id);
        Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
        Drawable drawable2 = this.starDrawable;
        if (drawable2 != null && num2 != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(qje.t(num2.intValue(), getContext()), PorterDuff.Mode.SRC_IN));
        }
        refreshStars();
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    /* renamed from: getRating, reason: from getter */
    public final float getCurrentRating() {
        return this.currentRating;
    }

    public final void initWithLottieAnimation(int animationColor) {
        initOrUpdateWithAnimation(animationColor);
    }

    public final void removeOnRatingBarChangeListener(w7i0 listener) {
        this.listeners.remove(listener);
    }

    public final void setAnimationType(AnimationType type) {
        this.currentAnimationType = type;
    }

    public final void setColor(int starColor) {
        setTag(ndh0.control_main_id, null);
        Drawable drawable = this.starDrawable;
        if (drawable != null) {
            drawable.setColorFilter(starColor, PorterDuff.Mode.SRC_IN);
        }
        refreshStars();
    }

    public final void setDefaultStars() {
        this.starDrawable = getResources().getDrawable(dzg0.ic_rating_star, null).mutate();
        this.selectStarDrawable = getResources().getDrawable(dzg0.ic_rating_star, null).mutate();
        Drawable drawable = this.starDrawable;
        if (drawable != null) {
            drawable.setColorFilter(qje.t(xng0.controlMinor, getContext()), PorterDuff.Mode.SRC_IN);
        }
        Drawable drawable2 = this.selectStarDrawable;
        if (drawable2 != null) {
            drawable2.setColorFilter(qje.t(xng0.controlMain, getContext()), PorterDuff.Mode.SRC_IN);
        }
        this.currentAnimationType = AnimationType.ONE_SELECTED;
        this.selectedStarsBackground = null;
        this.isCustomStars = false;
        clearView();
        init();
    }

    public final void setRating(int rating) {
        float f = rating;
        updateRatingValue(f);
        notifyListeners(f, false);
    }

    public final void setSelectedColor(int selectStarsColor) {
        setTag(ndh0.control_minor_id, null);
        Drawable drawable = this.selectStarDrawable;
        if (drawable != null) {
            drawable.setColorFilter(selectStarsColor, PorterDuff.Mode.SRC_IN);
        }
        refreshStars();
    }

    public final void setSelectedStarColor(int attrRes) {
        setTag(ndh0.control_main_id, Integer.valueOf(attrRes));
        Drawable drawable = this.selectStarDrawable;
        if (drawable != null) {
            drawable.setColorFilter(qje.t(attrRes, getContext()), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public final void setSelectedStarsBackground(Drawable background) {
        this.selectedStarsBackground = background;
        refreshStars();
    }

    public final void setStarColor(int attrRes) {
        setTag(ndh0.control_minor_id, Integer.valueOf(attrRes));
        Drawable drawable = this.starDrawable;
        if (drawable != null) {
            drawable.setColorFilter(qje.t(attrRes, getContext()), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public final void setStarScaleType(ImageView.ScaleType scaleType) {
        this.scaleType = scaleType;
        ImageView[] imageViewArr = this.starsViews;
        if (imageViewArr == null) {
            return;
        }
        for (ImageView imageView : imageViewArr) {
            imageView.setScaleType(scaleType);
        }
    }

    public final void setStarsClickable(boolean starsClickable) {
        this.starsClickable = starsClickable;
    }

    public final void setStarsDrawable(Drawable selectedStar, Drawable unselectedStar) {
        this.selectStarDrawable = selectedStar;
        this.starDrawable = unselectedStar;
        this.isCustomStars = true;
        refreshStars();
    }

    public final void startSelectionAnimation(int score) {
        int i;
        if (1 > score || score > this.maxStars) {
            return;
        }
        int i2 = n.a[this.currentAnimationType.ordinal()];
        if (i2 == 1) {
            i = score - 1;
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            i = 0;
        }
        ImageView[] imageViewArr = this.starsViews;
        if (imageViewArr == null) {
            return;
        }
        int i3 = (int) this.currentRating;
        while (i < i3) {
            ImageView imageView = imageViewArr[i];
            scale(imageView, 1.5f, this.starScaleOffset, this.accelerate).withEndAction(new xmf0(9, this, imageView)).start();
            animateLottieAnimationIfNeed(i);
            i++;
        }
    }

    public final void stopAnimation() {
        LottieAnimationView[] lottieAnimationViewArr = this.lottieAnimationViews;
        if (lottieAnimationViewArr == null) {
            return;
        }
        for (LottieAnimationView lottieAnimationView : lottieAnimationViewArr) {
            lottieAnimationView.cancelAnimation();
        }
    }

    public RatingBarComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RatingBarComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RatingBarComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
