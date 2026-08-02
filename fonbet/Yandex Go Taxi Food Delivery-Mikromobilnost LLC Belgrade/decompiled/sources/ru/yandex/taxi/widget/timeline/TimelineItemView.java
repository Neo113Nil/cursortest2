package ru.yandex.taxi.widget.timeline;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoView;
import defpackage.acz0;
import defpackage.hbp0;
import defpackage.hpo0;
import defpackage.k4o;
import defpackage.l8x;
import defpackage.nac;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.pav;
import defpackage.tje;
import defpackage.w511;
import defpackage.xbz0;
import defpackage.ytz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001pBÝ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\f\u001a\u00020\u0006\u0012\b\b\u0001\u0010\r\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010*J/\u00100\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020!2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020!2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b7\u00106J\u001f\u00108\u001a\u00020!2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00106J\u001f\u00109\u001a\u00020!2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u00106J#\u0010>\u001a\u00020!2\b\u0010;\u001a\u0004\u0018\u00010:2\b\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b>\u0010?J#\u0010C\u001a\u00020!2\b\u0010@\u001a\u0004\u0018\u00010:2\b\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ \u0010E\u001a\u00020!2\u0006\u0010@\u001a\u00020:2\u0006\u0010B\u001a\u00020AH\u0082@¢\u0006\u0004\bE\u0010FJ\u001f\u0010I\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010(\u001a\u00020\u0018H\u0000¢\u0006\u0004\bG\u0010HJK\u0010L\u001a\u00020!2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\bJ\u0010KJ'\u0010O\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0000¢\u0006\u0004\bM\u0010NJ+\u0010T\u001a\u00020!2\u0006\u0010Q\u001a\u00020P2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010B\u001a\u0004\u0018\u00010AH\u0000¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010UR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010VR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010VR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010VR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010VR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010VR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010VR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010VR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010VR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010VR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010WR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010WR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010WR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010WR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010WR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010WR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010XR\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010VR\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010VR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010VR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010[R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010kR\u0018\u0010n\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010kR\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010VR\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010VR\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010VR\u0016\u0010o\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bo\u0010V¨\u0006q"}, d2 = {"Lru/yandex/taxi/widget/timeline/TimelineItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lhbp0;", "scopeDelegate", "", "timelineItemViewSizePx", "outlinePassedRadiusPx", "outlineCurrentRadiusPx", "outlinePendingRadiusPx", "frontPassedRadiusPx", "frontCurrentRadiusPx", "frontPendingRadiusPx", "iconPassedRadiusPx", "iconCurrentRadiusPx", "iconPendingRadiusPx", "Landroid/graphics/drawable/Drawable;", "outlinePassedBackground", "outlineCurrentBackground", "outlinePendingBackground", "frontPassedBackground", "frontCurrentBackground", "frontPendingBackground", "", "applyAnimation", "iconPassedTintColor", "iconCurrentTintColor", "iconPendingTintColor", "<init>", "(Landroid/content/Context;Lhbp0;IIIIIIIIIILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ZIII)V", "Landroid/view/View;", "container", "Lzy11;", "setChildLayoutParams", "(Landroid/view/View;)V", "Lru/yandex/taxi/widget/timeline/TimelineItemView$Status;", ACSPConstants.STATUS, "updateBackgroundForStatus", "(Lru/yandex/taxi/widget/timeline/TimelineItemView$Status;)V", "shouldAnimate", "makePassed", "(Z)V", "makeCurrent", "makePending", "outlineRadiusPx", "frontRadiusPx", "iconRadiusPx", "startAnimations", "(ZIII)V", "", "duration", "newRadiusPx", "startOutlineScaleAnimation", "(JI)V", "startFrontScaleAnimation", "startIconScaleAnimation", "startLottieScaleAnimation", "", "imageUrl", "Lpav;", "imageLoader", "setIcon", "(Ljava/lang/String;Lpav;)V", "lottieAnimationUrl", "Lytz;", "lottieLoader", "setLottieAnimation", "(Ljava/lang/String;Lytz;)V", "setLottieAnimationForCurrentItem", "(Ljava/lang/String;Lytz;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setStatus$taxi_design", "(Lru/yandex/taxi/widget/timeline/TimelineItemView$Status;Z)V", "setStatus", "setBackground$taxi_design", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "setBackground", "setIconTintColor$taxi_design", "(III)V", "setIconTintColor", "Lxbz0;", "timelineItemData", "setData$taxi_design", "(Lxbz0;Lpav;Lytz;)V", "setData", "Lhbp0;", CA20Status.STATUS_USER_I, "Landroid/graphics/drawable/Drawable;", "Z", "Lcom/yandex/go/design/view/GoView;", "outlineContainer", "Lcom/yandex/go/design/view/GoView;", "frontContainer", "Landroid/widget/ImageView;", "iconContainer", "Landroid/widget/ImageView;", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieContainer", "Lcom/airbnb/lottie/LottieAnimationView;", "Ll8x;", "lottieJob", "Ll8x;", "Ljava/lang/Runnable;", "lottieJobRunnable", "Ljava/lang/Runnable;", "Landroid/animation/ValueAnimator;", "outlineAnimator", "Landroid/animation/ValueAnimator;", "frontAnimator", "iconAnimator", "lottieAnimator", "lottieRadiusPx", "Status", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimelineItemView extends FrameLayout {
    public static final int $stable = 8;
    private final boolean applyAnimation;
    private ValueAnimator frontAnimator;
    private final GoView frontContainer;
    private Drawable frontCurrentBackground;
    private final int frontCurrentRadiusPx;
    private Drawable frontPassedBackground;
    private final int frontPassedRadiusPx;
    private Drawable frontPendingBackground;
    private final int frontPendingRadiusPx;
    private int frontRadiusPx;
    private ValueAnimator iconAnimator;
    private final ImageView iconContainer;
    private final int iconCurrentRadiusPx;
    private int iconCurrentTintColor;
    private final int iconPassedRadiusPx;
    private int iconPassedTintColor;
    private final int iconPendingRadiusPx;
    private int iconPendingTintColor;
    private int iconRadiusPx;
    private ValueAnimator lottieAnimator;
    private final LottieAnimationView lottieContainer;
    private l8x lottieJob;
    private Runnable lottieJobRunnable;
    private int lottieRadiusPx;
    private ValueAnimator outlineAnimator;
    private final GoView outlineContainer;
    private Drawable outlineCurrentBackground;
    private final int outlineCurrentRadiusPx;
    private Drawable outlinePassedBackground;
    private final int outlinePassedRadiusPx;
    private Drawable outlinePendingBackground;
    private final int outlinePendingRadiusPx;
    private int outlineRadiusPx;
    private final hbp0 scopeDelegate;
    private final int timelineItemViewSizePx;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/widget/timeline/TimelineItemView$Status;", "", "PASSED", "CURRENT", "PENDING", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status CURRENT;
        public static final Status PASSED;
        public static final Status PENDING;

        static {
            Status status = new Status("PASSED", 0);
            PASSED = status;
            Status status2 = new Status("CURRENT", 1);
            CURRENT = status2;
            Status status3 = new Status("PENDING", 2);
            PENDING = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = kotlin.enums.a.a(statusArr);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public TimelineItemView(Context context, hbp0 hbp0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6, boolean z, int i11, int i12, int i13) {
        super(context);
        this.scopeDelegate = hbp0Var;
        this.timelineItemViewSizePx = i;
        this.outlinePassedRadiusPx = i2;
        this.outlineCurrentRadiusPx = i3;
        this.outlinePendingRadiusPx = i4;
        this.frontPassedRadiusPx = i5;
        this.frontCurrentRadiusPx = i6;
        this.frontPendingRadiusPx = i7;
        this.iconPassedRadiusPx = i8;
        this.iconCurrentRadiusPx = i9;
        this.iconPendingRadiusPx = i10;
        this.outlinePassedBackground = drawable;
        this.outlineCurrentBackground = drawable2;
        this.outlinePendingBackground = drawable3;
        this.frontPassedBackground = drawable4;
        this.frontCurrentBackground = drawable5;
        this.frontPendingBackground = drawable6;
        this.applyAnimation = z;
        this.iconPassedTintColor = i11;
        this.iconCurrentTintColor = i12;
        this.iconPendingTintColor = i13;
        GoView goView = new GoView(context, null, 0, 0, 14, null);
        this.outlineContainer = goView;
        GoView goView2 = new GoView(context, null, 0, 0, 14, null);
        this.frontContainer = goView2;
        ImageView imageView = new ImageView(context);
        this.iconContainer = imageView;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.lottieContainer = lottieAnimationView;
        setChildLayoutParams(goView);
        setChildLayoutParams(goView2);
        setChildLayoutParams(imageView);
        setChildLayoutParams(lottieAnimationView);
        addView(goView);
        addView(goView2);
        addView(imageView);
        addView(lottieAnimationView);
    }

    private final void makeCurrent(boolean shouldAnimate) {
        setSelected(true);
        startAnimations(this.applyAnimation && shouldAnimate, this.outlineCurrentRadiusPx, this.frontCurrentRadiusPx, this.iconCurrentRadiusPx);
        this.iconContainer.setImageTintList(ColorStateList.valueOf(this.iconCurrentTintColor));
    }

    private final void makePassed(boolean shouldAnimate) {
        boolean z = false;
        setSelected(false);
        if (this.applyAnimation && shouldAnimate) {
            z = true;
        }
        startAnimations(z, this.outlinePassedRadiusPx, this.frontPassedRadiusPx, this.iconPassedRadiusPx);
        this.iconContainer.setImageTintList(ColorStateList.valueOf(this.iconPassedTintColor));
    }

    private final void makePending(boolean shouldAnimate) {
        boolean z = false;
        setSelected(false);
        if (this.applyAnimation && shouldAnimate) {
            z = true;
        }
        startAnimations(z, this.outlinePendingRadiusPx, this.frontPendingRadiusPx, this.iconPendingRadiusPx);
        this.iconContainer.setImageTintList(ColorStateList.valueOf(this.iconPendingTintColor));
    }

    private final void setChildLayoutParams(View container) {
        container.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    private final void setIcon(String imageUrl, pav imageLoader) {
        if (imageUrl == null || imageLoader == null) {
            this.iconContainer.setImageDrawable(null);
        } else {
            ((nac) imageLoader.a(this.iconContainer)).c(imageUrl);
        }
    }

    private final void setLottieAnimation(String lottieAnimationUrl, ytz lottieLoader) {
        if (!isSelected() || lottieAnimationUrl == null || lottieLoader == null) {
            this.iconContainer.setVisibility(0);
            this.lottieContainer.setVisibility(8);
            this.lottieContainer.setRepeatCount(0);
            return;
        }
        Runnable runnable = this.lottieJobRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        hpo0 hpo0Var = new hpo0(13, this, lottieAnimationUrl, lottieLoader);
        this.lottieJobRunnable = hpo0Var;
        post(hpo0Var);
        this.iconContainer.setVisibility(8);
        this.lottieContainer.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setLottieAnimation$lambda$0(TimelineItemView timelineItemView, String str, ytz ytzVar) {
        timelineItemView.lottieJobRunnable = null;
        timelineItemView.lottieJob = tje.N(timelineItemView.scopeDelegate.c(), null, null, new TimelineItemView$setLottieAnimation$2$1(timelineItemView, str, ytzVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setLottieAnimationForCurrentItem(String str, ytz ytzVar, Continuation<? super zy11> continuation) {
        TimelineItemView$setLottieAnimationForCurrentItem$1 timelineItemView$setLottieAnimationForCurrentItem$1;
        int i;
        nsz nszVar;
        if (continuation instanceof TimelineItemView$setLottieAnimationForCurrentItem$1) {
            timelineItemView$setLottieAnimationForCurrentItem$1 = (TimelineItemView$setLottieAnimationForCurrentItem$1) continuation;
            int i2 = timelineItemView$setLottieAnimationForCurrentItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                timelineItemView$setLottieAnimationForCurrentItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = timelineItemView$setLottieAnimationForCurrentItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = timelineItemView$setLottieAnimationForCurrentItem$1.label;
                if (i != 0) {
                    b.b(obj);
                    timelineItemView$setLottieAnimationForCurrentItem$1.L$0 = null;
                    timelineItemView$setLottieAnimationForCurrentItem$1.L$1 = null;
                    timelineItemView$setLottieAnimationForCurrentItem$1.label = 1;
                    obj = ((com.yandex.go.lottie_loader.a) ytzVar).a(str, timelineItemView$setLottieAnimationForCurrentItem$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                nszVar = (nsz) obj;
                if (nszVar != null) {
                    this.lottieContainer.setComposition(nszVar);
                    this.lottieContainer.setRepeatMode(1);
                    this.lottieContainer.setRepeatCount(-1);
                    this.lottieContainer.playAnimation();
                }
                return zy11.a;
            }
        }
        timelineItemView$setLottieAnimationForCurrentItem$1 = new TimelineItemView$setLottieAnimationForCurrentItem$1(this, continuation);
        Object obj2 = timelineItemView$setLottieAnimationForCurrentItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = timelineItemView$setLottieAnimationForCurrentItem$1.label;
        if (i != 0) {
        }
        nszVar = (nsz) obj2;
        if (nszVar != null) {
        }
        return zy11.a;
    }

    private final void startAnimations(boolean applyAnimation, int outlineRadiusPx, int frontRadiusPx, int iconRadiusPx) {
        ValueAnimator valueAnimator = this.outlineAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.frontAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.iconAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.lottieAnimator;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        long j = applyAnimation ? 300L : 0L;
        startOutlineScaleAnimation(j, outlineRadiusPx);
        startFrontScaleAnimation(j, frontRadiusPx);
        startIconScaleAnimation(j, iconRadiusPx);
        startLottieScaleAnimation(j, iconRadiusPx);
    }

    private final void startFrontScaleAnimation(long duration, final int newRadiusPx) {
        float f = this.timelineItemViewSizePx / 2.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.frontRadiusPx / f, newRadiusPx / f);
        this.frontAnimator = ofFloat;
        ofFloat.addUpdateListener(new acz0(this, 0));
        ofFloat.setDuration(duration);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.widget.timeline.TimelineItemView$startFrontScaleAnimation$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                TimelineItemView.this.frontRadiusPx = newRadiusPx;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startFrontScaleAnimation$lambda$0(TimelineItemView timelineItemView, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        timelineItemView.frontContainer.setScaleX(floatValue);
        timelineItemView.frontContainer.setScaleY(floatValue);
    }

    private final void startIconScaleAnimation(long duration, final int newRadiusPx) {
        float f = this.timelineItemViewSizePx / 2.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.iconRadiusPx / f, newRadiusPx / f);
        this.iconAnimator = ofFloat;
        ofFloat.addUpdateListener(new acz0(this, 2));
        ofFloat.setDuration(duration);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.widget.timeline.TimelineItemView$startIconScaleAnimation$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                TimelineItemView.this.iconRadiusPx = newRadiusPx;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startIconScaleAnimation$lambda$0(TimelineItemView timelineItemView, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        timelineItemView.iconContainer.setScaleX(floatValue);
        timelineItemView.iconContainer.setScaleY(floatValue);
    }

    private final void startLottieScaleAnimation(long duration, final int newRadiusPx) {
        float f = this.timelineItemViewSizePx / 2.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.lottieRadiusPx / f, newRadiusPx / f);
        this.lottieAnimator = ofFloat;
        ofFloat.addUpdateListener(new acz0(this, 3));
        ofFloat.setDuration(duration);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.widget.timeline.TimelineItemView$startLottieScaleAnimation$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                TimelineItemView.this.lottieRadiusPx = newRadiusPx;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLottieScaleAnimation$lambda$0(TimelineItemView timelineItemView, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        timelineItemView.lottieContainer.setScaleX(floatValue);
        timelineItemView.lottieContainer.setScaleY(floatValue);
    }

    private final void startOutlineScaleAnimation(long duration, final int newRadiusPx) {
        float f = this.timelineItemViewSizePx / 2.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.outlineRadiusPx / f, newRadiusPx / f);
        this.outlineAnimator = ofFloat;
        ofFloat.addUpdateListener(new acz0(this, 1));
        ofFloat.setDuration(duration);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.widget.timeline.TimelineItemView$startOutlineScaleAnimation$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                TimelineItemView.this.outlineRadiusPx = newRadiusPx;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startOutlineScaleAnimation$lambda$0(TimelineItemView timelineItemView, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        timelineItemView.outlineContainer.setScaleX(floatValue);
        timelineItemView.outlineContainer.setScaleY(floatValue);
    }

    private final void updateBackgroundForStatus(Status status) {
        int[] iArr = a.a;
        int i = iArr[status.ordinal()];
        if (i == 1) {
            this.outlineContainer.setBackground(this.outlinePassedBackground);
        } else if (i == 2) {
            this.outlineContainer.setBackground(this.outlineCurrentBackground);
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            this.outlineContainer.setBackground(this.outlinePendingBackground);
        }
        int i2 = iArr[status.ordinal()];
        if (i2 == 1) {
            this.frontContainer.setBackground(this.frontPassedBackground);
            return;
        }
        if (i2 == 2) {
            this.frontContainer.setBackground(this.frontCurrentBackground);
        } else if (i2 == 3) {
            this.frontContainer.setBackground(this.frontPendingBackground);
        } else {
            w511.b();
        }
    }

    public final void setBackground$taxi_design(Drawable outlinePassedBackground, Drawable outlineCurrentBackground, Drawable outlinePendingBackground, Drawable frontPassedBackground, Drawable frontCurrentBackground, Drawable frontPendingBackground) {
        this.outlinePassedBackground = outlinePassedBackground;
        this.outlineCurrentBackground = outlineCurrentBackground;
        this.outlinePendingBackground = outlinePendingBackground;
        this.frontPassedBackground = frontPassedBackground;
        this.frontCurrentBackground = frontCurrentBackground;
        this.frontPendingBackground = frontPendingBackground;
    }

    public final void setData$taxi_design(xbz0 timelineItemData, pav imageLoader, ytz lottieLoader) {
        l8x l8xVar = this.lottieJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        setIcon(timelineItemData.b, imageLoader);
        setLottieAnimation(timelineItemData.c, lottieLoader);
    }

    public final void setIconTintColor$taxi_design(int iconPassedTintColor, int iconCurrentTintColor, int iconPendingTintColor) {
        this.iconPassedTintColor = iconPassedTintColor;
        this.iconCurrentTintColor = iconCurrentTintColor;
        this.iconPendingTintColor = iconPendingTintColor;
    }

    public final void setStatus$taxi_design(Status status, boolean shouldAnimate) {
        updateBackgroundForStatus(status);
        int i = a.a[status.ordinal()];
        if (i == 1) {
            makePassed(shouldAnimate);
            return;
        }
        if (i == 2) {
            makeCurrent(shouldAnimate);
        } else if (i == 3) {
            makePending(shouldAnimate);
        } else {
            w511.b();
        }
    }
}
