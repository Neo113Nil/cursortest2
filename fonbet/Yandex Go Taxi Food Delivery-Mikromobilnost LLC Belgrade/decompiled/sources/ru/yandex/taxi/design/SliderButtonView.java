package ru.yandex.taxi.design;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import defpackage.bps0;
import defpackage.c4i0;
import defpackage.cps0;
import defpackage.dps0;
import defpackage.dzg0;
import defpackage.eaj0;
import defpackage.eja1;
import defpackage.eps0;
import defpackage.f9e0;
import defpackage.g8e;
import defpackage.k4o;
import defpackage.kdc;
import defpackage.lhc;
import defpackage.mmp0;
import defpackage.mps0;
import defpackage.mrg0;
import defpackage.ndh0;
import defpackage.ny6;
import defpackage.qje;
import defpackage.rp31;
import defpackage.sph0;
import defpackage.t8;
import defpackage.tje;
import defpackage.up11;
import defpackage.vf2;
import defpackage.vng;
import defpackage.w511;
import defpackage.wor0;
import defpackage.xng0;
import defpackage.xw31;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 ±\u00012\u00020\u0001:\t\u0096\u0001\u009d\u0001²\u0001³\u0001hB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0013¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b+\u0010*J\u0017\u0010-\u001a\u00020\u000e2\b\b\u0001\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020/¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u001f¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u001f¢\u0006\u0004\b5\u00104J\u0015\u00106\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u001f¢\u0006\u0004\b6\u00104J\u0015\u00107\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u001f¢\u0006\u0004\b7\u00104J\u0015\u00108\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u001f¢\u0006\u0004\b8\u00104J\u0015\u00109\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u001f¢\u0006\u0004\b9\u00104J\r\u0010:\u001a\u00020\u000e¢\u0006\u0004\b:\u0010#J\r\u0010;\u001a\u00020\u000e¢\u0006\u0004\b;\u0010#J\r\u0010<\u001a\u00020\u000e¢\u0006\u0004\b<\u0010#J\r\u0010=\u001a\u00020\u000e¢\u0006\u0004\b=\u0010#J\u0017\u0010>\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b@\u0010?J\u0017\u0010A\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010?J\u0017\u0010B\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bB\u0010?J\u000f\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bC\u0010#J\u0017\u0010F\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000eH\u0002¢\u0006\u0004\bH\u0010#J\u001f\u0010L\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u00062\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u000eH\u0002¢\u0006\u0004\bN\u0010#J\u0017\u0010P\u001a\u00020D2\u0006\u0010O\u001a\u00020DH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u000eH\u0002¢\u0006\u0004\bR\u0010#J\u001f\u0010V\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020SH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u001fH\u0002¢\u0006\u0004\bX\u0010!J\u000f\u0010Y\u001a\u00020\u000eH\u0002¢\u0006\u0004\bY\u0010#R\u0014\u0010Z\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010]R\u0014\u0010_\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010]R\u0014\u0010`\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010]R\u0014\u0010a\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010]R\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u00060hR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010mR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010qR\u0014\u0010s\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010qR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010w\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010y\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010xR\u0018\u0010z\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010|\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010{R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010[R\u001a\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0085\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010]R\u0018\u0010\u0086\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010]R\u0019\u0010\u0087\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008b\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0088\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010[R\u0018\u0010\u0095\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010[R,\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R,\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R\u001b\u0010¤\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001b\u0010¦\u0001\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001b\u0010¨\u0001\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010§\u0001R\u0018\u0010©\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b©\u0001\u0010]R\u0017\u0010¬\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u0017\u0010®\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010«\u0001R\u0017\u0010°\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010«\u0001¨\u0006´\u0001"}, d2 = {"Lru/yandex/taxi/design/SliderButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "w", "h", "oldw", "oldh", "Lzy11;", "onSizeChanged", "(IIII)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "dispatchHoverEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "gainFocus", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "onDetachedFromWindow", "()V", "hideToggle", "setHideToggleWhenSlided", "(Z)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setStartIcon", "(Landroid/graphics/drawable/Drawable;)V", "setProgressIcon", "color", "setTrackBackgroundColor", "(I)V", "Lkdc;", "setTextColor", "(Lkdc;)V", "text", "setTitleIdle", "(Ljava/lang/CharSequence;)V", "setSubtitleIdle", "setTitleProgress", "setSubtitleProgress", "setTextDone", "setSubtitleDone", "showProgressState", "showDoneState", "showIdleState", "startBounceAnimation", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "actionDown", "actionMove", "actionUp", "resetTouch", "", "currentX", "startDemoMoveAnimation", "(F)V", "slideToStart", "percent", "", RemoteBioParameters.TIME, "slideToEnd", "(IJ)V", "hideToggleButton", "value", "calibrate", "(F)F", "updateUiState", "Landroid/widget/ImageView;", "from", "to", "startIconTransition", "(Landroid/widget/ImageView;Landroid/widget/ImageView;)V", "getActiveItemsContentDescription", "cancelSliderBounceAnimation", "isLayoutDirectionRtl", "Z", "startMargin", "F", "toggleHeight", "onTapTriggerHeight", "transitionWidth", "sliderBounceAnimationWidth", "Landroid/animation/ArgbEvaluator;", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "Landroid/graphics/RectF;", "fullViewRect", "Landroid/graphics/RectF;", "Lru/yandex/taxi/design/s;", "wheelTouchHelper", "Lru/yandex/taxi/design/s;", "Landroid/view/View;", "sliderBackground", "Landroid/view/View;", "sliderTrackContainer", "Lru/yandex/taxi/design/ListItemComponent;", "sliderComponentIdle", "Lru/yandex/taxi/design/ListItemComponent;", "sliderComponentProgress", "sliderComponentDone", "Landroid/widget/FrameLayout;", "sliderToggle", "Landroid/widget/FrameLayout;", "sliderToggleArrowIcon", "Landroid/widget/ImageView;", "sliderToggleDoneIcon", "toggleStartDrawable", "Landroid/graphics/drawable/Drawable;", "toggleDoneDrawable", "Landroid/graphics/drawable/GradientDrawable;", "trackGradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "toggleGradientDrawable", "hideToggleWhenSlided", "Lru/yandex/taxi/design/SliderButtonView$State;", "currentState", "Lru/yandex/taxi/design/SliderButtonView$State;", "sliderTrackCornersRadius", "sliderToggleCornersRadius", "trackBackgroundColor", CA20Status.STATUS_USER_I, "Landroid/animation/ValueAnimator;", "sliderToggleHideAnimation", "Landroid/animation/ValueAnimator;", "Landroid/view/ViewPropertyAnimator;", "xAnimation", "Landroid/view/ViewPropertyAnimator;", "iconsTransitionAnimator", "Landroid/animation/AnimatorSet;", "sliderBounceAnimatorSet", "Landroid/animation/AnimatorSet;", "sliderBounceCounter", "sliderBounceAnimationCancelled", "toggleCloserToDone", "Leps0;", "slideFinishedListener", "Leps0;", "getSlideFinishedListener", "()Leps0;", "setSlideFinishedListener", "(Leps0;)V", "Lcps0;", "sliderActionsListener", "Lcps0;", "getSliderActionsListener", "()Lcps0;", "setSliderActionsListener", "(Lcps0;)V", "touchEventStartTimestamp", "Ljava/lang/Long;", "startX", "Ljava/lang/Float;", "startY", "dx", "getCurrentProgress", "()F", "currentProgress", "getMinProgress", "minProgress", "getMaxProgress", "maxProgress", "Companion", "State", "dps0", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SliderButtonView extends ConstraintLayout {

    @Deprecated
    public static final float ALPHA_VALUE_IN_DEFAULT_STATE = 1.0f;

    @Deprecated
    public static final float ALPHA_VALUE_IN_PROGRESS_STATE = 0.5f;
    private static final dps0 Companion = new dps0();

    @Deprecated
    public static final long SLIDER_BACKWARD_TRANSLATION_DELAY = 200;

    @Deprecated
    public static final long SLIDER_BACKWARD_TRANSLATION_DURATION = 500;

    @Deprecated
    public static final int SLIDER_BOUNCE_REPETITIONS = 2;

    @Deprecated
    public static final long SLIDER_FORWARD_TRANSLATION_DELAY = 150;

    @Deprecated
    public static final long SLIDER_FORWARD_TRANSLATION_DURATION = 500;

    @Deprecated
    public static final long TOGGLE_ICON_HIDING_DURATION_MS = 300;

    @Deprecated
    public static final long TOGGLE_ICON_TRANSITION_DURATION_MS = 300;

    @Deprecated
    public static final long TOGGLE_SLIDE_TO_DEFAULT_STATE_DURATION = 120;

    @Deprecated
    public static final long TOGGLE_VALID_TAP_TOUCH_DURATION_MS = 300;

    @Deprecated
    public static final float TRANSITION_PROGRESS = 0.7f;

    @Deprecated
    public static final int VIRTUAL_BUTTON_ID = 0;

    @Deprecated
    public static final int VIRTUAL_INVALID_ID = -1;
    private final ArgbEvaluator argbEvaluator;
    private State currentState;
    private float dx;
    private final RectF fullViewRect;
    private boolean hideToggleWhenSlided;
    private ValueAnimator iconsTransitionAnimator;
    private final boolean isLayoutDirectionRtl;
    private final float onTapTriggerHeight;
    private eps0 slideFinishedListener;
    private cps0 sliderActionsListener;
    private final View sliderBackground;
    private boolean sliderBounceAnimationCancelled;
    private final float sliderBounceAnimationWidth;
    private AnimatorSet sliderBounceAnimatorSet;
    private int sliderBounceCounter;
    private final ListItemComponent sliderComponentDone;
    private final ListItemComponent sliderComponentIdle;
    private final ListItemComponent sliderComponentProgress;
    private final FrameLayout sliderToggle;
    private final ImageView sliderToggleArrowIcon;
    private float sliderToggleCornersRadius;
    private final ImageView sliderToggleDoneIcon;
    private ValueAnimator sliderToggleHideAnimation;
    private final View sliderTrackContainer;
    private float sliderTrackCornersRadius;
    private final float startMargin;
    private Float startX;
    private Float startY;
    private boolean toggleCloserToDone;
    private Drawable toggleDoneDrawable;
    private final GradientDrawable toggleGradientDrawable;
    private final float toggleHeight;
    private Drawable toggleStartDrawable;
    private Long touchEventStartTimestamp;
    private int trackBackgroundColor;
    private final GradientDrawable trackGradientDrawable;
    private final float transitionWidth;
    private final s wheelTouchHelper;
    private ViewPropertyAnimator xAnimation;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/design/SliderButtonView$State;", "", "IDLE", "PROGRESS", "DONE", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State DONE;
        public static final State IDLE;
        public static final State PROGRESS;

        static {
            State state = new State("IDLE", 0);
            IDLE = state;
            State state2 = new State("PROGRESS", 1);
            PROGRESS = state2;
            State state3 = new State("DONE", 2);
            DONE = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public SliderButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean n = xw31.n(context);
        this.isLayoutDirectionRtl = n;
        this.startMargin = tje.w(4, getContext());
        this.toggleHeight = tje.w(56, getContext());
        this.onTapTriggerHeight = tje.w(14, getContext());
        this.transitionWidth = n ? -tje.w(28, getContext()) : tje.w(28, getContext());
        this.sliderBounceAnimationWidth = n ? -tje.w(48, getContext()) : tje.w(48, getContext());
        this.argbEvaluator = new ArgbEvaluator();
        this.fullViewRect = new RectF();
        s sVar = new s(this, this);
        this.wheelTouchHelper = sVar;
        ru.yandex.taxi.design.utils.c.q(this, sph0.view_slider_button, true);
        int i2 = ndh0.slider_background;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        View view = (View) rp31.d(this, i2);
        this.sliderBackground = view;
        this.sliderTrackContainer = (View) rp31.d(this, ndh0.slider_track_container);
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, ndh0.slider_component_idle));
        this.sliderComponentIdle = listItemComponent;
        ListItemComponent listItemComponent2 = (ListItemComponent) ((View) rp31.d(this, ndh0.slider_component_progress));
        this.sliderComponentProgress = listItemComponent2;
        ListItemComponent listItemComponent3 = (ListItemComponent) ((View) rp31.d(this, ndh0.slider_component_done));
        this.sliderComponentDone = listItemComponent3;
        FrameLayout frameLayout = (FrameLayout) ((View) rp31.d(this, ndh0.slider_toggle));
        this.sliderToggle = frameLayout;
        ImageView imageView = (ImageView) ((View) rp31.d(this, ndh0.slider_toggle_arrow_icon));
        this.sliderToggleArrowIcon = imageView;
        this.sliderToggleDoneIcon = (ImageView) ((View) rp31.d(this, ndh0.slider_toggle_done_icon));
        this.toggleStartDrawable = vng.t(dzg0.ic_slider_arrow, getContext());
        this.toggleDoneDrawable = vng.t(dzg0.ic_done_mark, getContext());
        Drawable t = vng.t(dzg0.bg_slider_main, getContext());
        GradientDrawable gradientDrawable = (GradientDrawable) (t != null ? t.mutate() : null);
        this.trackGradientDrawable = gradientDrawable;
        Drawable t2 = vng.t(dzg0.bg_slider_toggle, getContext());
        GradientDrawable gradientDrawable2 = (GradientDrawable) (t2 != null ? t2.mutate() : null);
        this.toggleGradientDrawable = gradientDrawable2;
        this.hideToggleWhenSlided = true;
        this.currentState = State.IDLE;
        this.sliderTrackCornersRadius = tje.r(mrg0.slider_component_background_corners_radius, getContext());
        this.sliderToggleCornersRadius = tje.r(mrg0.slider_component_toggle_corners_radius, getContext());
        this.trackBackgroundColor = qje.u(context.getTheme(), xng0.controlMain);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.SliderButtonView, i, 0);
        listItemComponent.setTitle(obtainStyledAttributes.getString(c4i0.SliderButtonView_sliderText));
        listItemComponent.setSubtitle(obtainStyledAttributes.getString(c4i0.SliderButtonView_sliderSubtitle));
        listItemComponent.setVerticalPadding(0);
        listItemComponent.setOnClickListener(new eaj0(22, this));
        listItemComponent.setImportantForAccessibility(4);
        listItemComponent2.setTitle(obtainStyledAttributes.getString(c4i0.SliderButtonView_sliderLoadingText));
        listItemComponent2.setSubtitle(obtainStyledAttributes.getString(c4i0.SliderButtonView_sliderLoadingSubtitle));
        listItemComponent2.setVerticalPadding(0);
        listItemComponent2.setImportantForAccessibility(4);
        listItemComponent3.setTitle(obtainStyledAttributes.getString(c4i0.SliderButtonView_sliderDoneText));
        listItemComponent3.setSubtitle(obtainStyledAttributes.getString(c4i0.SliderButtonView_sliderDoneSubtitle));
        listItemComponent3.setVerticalPadding(0);
        listItemComponent3.setImportantForAccessibility(4);
        this.sliderTrackCornersRadius = obtainStyledAttributes.getDimension(c4i0.SliderButtonView_sliderTrackCornersRadius, this.sliderTrackCornersRadius);
        this.sliderToggleCornersRadius = obtainStyledAttributes.getDimension(c4i0.SliderButtonView_sliderToggleCornersRadius, this.sliderToggleCornersRadius);
        Drawable drawable = obtainStyledAttributes.getDrawable(c4i0.SliderButtonView_sliderIcon);
        drawable = drawable == null ? this.toggleStartDrawable : drawable;
        this.toggleStartDrawable = drawable;
        imageView.setImageDrawable(drawable);
        obtainStyledAttributes.recycle();
        TextView title = listItemComponent.title();
        int[] iArr = up11.a;
        title.setTypeface(eja1.w(3, 0));
        listItemComponent2.title().setTypeface(eja1.w(3, 0));
        listItemComponent3.title().setTypeface(eja1.w(3, 0));
        gradientDrawable.setCornerRadius(this.sliderTrackCornersRadius);
        view.setBackground(gradientDrawable);
        gradientDrawable2.setCornerRadius(this.sliderToggleCornersRadius);
        frameLayout.setBackground(gradientDrawable2);
        androidx.core.view.b.p(this, sVar);
        frameLayout.setX(getMinProgress());
        frameLayout.setOnTouchListener(new t8(19, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SliderButtonView sliderButtonView, View view) {
        sliderButtonView.cancelSliderBounceAnimation();
        cps0 cps0Var = sliderButtonView.sliderActionsListener;
        if (cps0Var != null) {
            ((f9e0) ((mps0) ((wor0) cps0Var).a).T.a).d();
        }
        sliderButtonView.startDemoMoveAnimation(sliderButtonView.getMinProgress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(SliderButtonView sliderButtonView, View view, MotionEvent motionEvent) {
        if (sliderButtonView.currentState != State.IDLE) {
            return false;
        }
        sliderButtonView.handleTouchEvent(motionEvent);
        return true;
    }

    private final void actionDown(MotionEvent event) {
        this.touchEventStartTimestamp = Long.valueOf(System.currentTimeMillis());
        this.startX = Float.valueOf(event.getRawX());
        this.startY = Float.valueOf(event.getRawY());
        this.dx = this.sliderToggle.getX() - event.getRawX();
        ViewPropertyAnimator viewPropertyAnimator = this.xAnimation;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        cancelSliderBounceAnimation();
    }

    private final void actionMove(MotionEvent event) {
        getParent().requestDisallowInterceptTouchEvent(true);
        Float f = this.startX;
        Float f2 = this.startY;
        if (f == null || f2 == null) {
            return;
        }
        float abs = Math.abs(event.getRawX() - f.floatValue());
        float abs2 = Math.abs(event.getRawY() - f2.floatValue());
        if (abs2 >= this.toggleHeight && abs * 0.7f <= abs2) {
            slideToStart();
            resetTouch();
        } else {
            this.sliderToggle.animate().x(calibrate(event.getRawX() + this.dx)).setDuration(0L).setUpdateListener(new bps0(this, 4)).start();
        }
    }

    private final void actionUp(MotionEvent event) {
        long currentTimeMillis = System.currentTimeMillis();
        Long l = this.touchEventStartTimestamp;
        long longValue = currentTimeMillis - (l != null ? l.longValue() : 0L);
        int currentProgress = (int) (getCurrentProgress() * 100.0f);
        if (getCurrentProgress() > 0.7f) {
            slideToEnd(currentProgress, longValue);
            return;
        }
        float rawX = event.getRawX();
        boolean z = longValue < 300;
        Float f = this.startX;
        boolean z2 = Math.abs((f != null ? f.floatValue() : 0.0f) - rawX) < this.onTapTriggerHeight;
        if (z && z2) {
            cps0 cps0Var = this.sliderActionsListener;
            if (cps0Var != null) {
                ((f9e0) ((mps0) ((wor0) cps0Var).a).T.a).d();
            }
            startDemoMoveAnimation(calibrate(event.getRawX() + this.dx));
            return;
        }
        cps0 cps0Var2 = this.sliderActionsListener;
        if (cps0Var2 != null) {
            ((f9e0) ((mps0) ((wor0) cps0Var2).a).T.a).f(currentProgress, longValue);
        }
        slideToStart();
    }

    private final float calibrate(float value) {
        float maxProgress = this.isLayoutDirectionRtl ? getMaxProgress() : getMinProgress();
        if (value < maxProgress) {
            return maxProgress;
        }
        float minProgress = this.isLayoutDirectionRtl ? getMinProgress() : getMaxProgress();
        return value > minProgress ? minProgress : value;
    }

    private final void cancelSliderBounceAnimation() {
        AnimatorSet animatorSet = this.sliderBounceAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.sliderBounceAnimatorSet = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence getActiveItemsContentDescription() {
        int i = t.a[this.currentState.ordinal()];
        if (i == 1) {
            return g8e.p(this.sliderComponentIdle.getTitleText(), " ", this.sliderComponentIdle.getSubtitleText());
        }
        if (i == 2) {
            return g8e.p(this.sliderComponentProgress.getTitleText(), " ", this.sliderComponentProgress.getSubtitleText());
        }
        if (i == 3) {
            return g8e.p(this.sliderComponentDone.getTitleText(), " ", this.sliderComponentDone.getSubtitleText());
        }
        w511.b();
        return null;
    }

    private final float getCurrentProgress() {
        float x;
        float maxProgress;
        float minProgress;
        if (this.isLayoutDirectionRtl) {
            x = getMinProgress() - this.sliderToggle.getX();
            maxProgress = getMinProgress();
            minProgress = getMaxProgress();
        } else {
            x = this.sliderToggle.getX() - getMinProgress();
            maxProgress = getMaxProgress();
            minProgress = getMinProgress();
        }
        return x / (maxProgress - minProgress);
    }

    private final float getMaxProgress() {
        return this.isLayoutDirectionRtl ? this.startMargin : (getWidth() - this.sliderToggle.getWidth()) - this.startMargin;
    }

    private final float getMinProgress() {
        return this.isLayoutDirectionRtl ? (getWidth() - this.sliderToggle.getWidth()) - this.startMargin : this.startMargin;
    }

    private final void handleTouchEvent(MotionEvent event) {
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            actionDown(event);
            return;
        }
        if (actionMasked == 1) {
            actionUp(event);
        } else if (actionMasked == 2) {
            actionMove(event);
        } else {
            if (actionMasked != 3) {
                return;
            }
            slideToStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideToggleButton() {
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
        duration.addUpdateListener(new bps0(this, 1));
        duration.start();
        this.sliderToggleHideAnimation = duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideToggleButton$lambda$0$0(SliderButtonView sliderButtonView, ValueAnimator valueAnimator) {
        sliderButtonView.sliderToggle.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void resetTouch() {
        this.startX = null;
        this.startY = null;
        this.touchEventStartTimestamp = null;
    }

    private final void slideToEnd(final int percent, final long time) {
        ViewPropertyAnimator listener = this.sliderToggle.animate().x(getMaxProgress()).setDuration(120L).setInterpolator(new LinearInterpolator()).setUpdateListener(new bps0(this, 2)).setListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.design.SliderButtonView$slideToEnd$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                boolean z;
                eps0 slideFinishedListener = SliderButtonView.this.getSlideFinishedListener();
                if (slideFinishedListener != null) {
                    slideFinishedListener.p(percent, time);
                }
                z = SliderButtonView.this.hideToggleWhenSlided;
                if (z) {
                    SliderButtonView.this.hideToggleButton();
                }
                SliderButtonView.this.showProgressState();
            }
        });
        listener.start();
        this.xAnimation = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void slideToStart() {
        this.xAnimation = this.sliderToggle.animate().x(getMinProgress()).setDuration(120L).setInterpolator(new LinearInterpolator()).setUpdateListener(new bps0(this, 0));
    }

    private final void startDemoMoveAnimation(float currentX) {
        this.xAnimation = this.sliderToggle.animate().x(currentX + this.transitionWidth).setDuration(120L).setInterpolator(new AccelerateInterpolator()).setUpdateListener(new bps0(this, 3)).withEndAction(new mmp0(25, this));
    }

    private final void startIconTransition(ImageView from, ImageView to) {
        to.setAlpha(0.0f);
        to.setVisibility(0);
        ValueAnimator valueAnimator = this.iconsTransitionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.addUpdateListener(new vf2(19, from, to));
        duration.start();
        this.iconsTransitionAnimator = duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startIconTransition$lambda$0$0(ImageView imageView, ImageView imageView2, ValueAnimator valueAnimator) {
        imageView.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
        imageView2.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUiState() {
        float currentProgress = getCurrentProgress();
        boolean z = this.toggleCloserToDone;
        if (currentProgress > 0.7f) {
            if (!z) {
                startIconTransition(this.sliderToggleArrowIcon, this.sliderToggleDoneIcon);
                this.toggleCloserToDone = true;
            }
        } else if (z) {
            startIconTransition(this.sliderToggleDoneIcon, this.sliderToggleArrowIcon);
            this.toggleCloserToDone = false;
        }
        this.trackGradientDrawable.setColor(((Integer) this.argbEvaluator.evaluate(getCurrentProgress(), Integer.valueOf(lhc.f(this.trackBackgroundColor, Math.abs((int) (1.0f * 255.0f)) & 255)), Integer.valueOf(lhc.f(this.trackBackgroundColor, Math.abs((int) (255.0f * 0.5f)) & 255)))).intValue());
        this.sliderBackground.setBackground(this.trackGradientDrawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        return !this.wheelTouchHelper.c(event) && super.dispatchHoverEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        return !this.wheelTouchHelper.d(event) && super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ny6.class.getName();
    }

    public final eps0 getSlideFinishedListener() {
        return this.slideFinishedListener;
    }

    public final cps0 getSliderActionsListener() {
        return this.sliderActionsListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPropertyAnimator viewPropertyAnimator = this.xAnimation;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setListener(null);
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.xAnimation;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        this.wheelTouchHelper.j(gainFocus, direction, previouslyFocusedRect);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.fullViewRect.set(0.0f, 0.0f, w, h);
    }

    public final void setHideToggleWhenSlided(boolean hideToggle) {
        this.hideToggleWhenSlided = hideToggle;
    }

    public final void setProgressIcon(Drawable drawable) {
        this.toggleDoneDrawable = drawable;
        this.sliderToggleDoneIcon.setImageDrawable(drawable);
    }

    public final void setSlideFinishedListener(eps0 eps0Var) {
        this.slideFinishedListener = eps0Var;
    }

    public final void setSliderActionsListener(cps0 cps0Var) {
        this.sliderActionsListener = cps0Var;
    }

    public final void setStartIcon(Drawable drawable) {
        this.toggleStartDrawable = drawable;
        this.sliderToggleArrowIcon.setImageDrawable(drawable);
    }

    public final void setSubtitleDone(CharSequence text) {
        this.sliderComponentDone.setSubtitle(text);
    }

    public final void setSubtitleIdle(CharSequence text) {
        this.sliderComponentIdle.setSubtitle(text);
    }

    public final void setSubtitleProgress(CharSequence text) {
        this.sliderComponentProgress.setSubtitle(text);
    }

    public final void setTextColor(kdc color) {
        this.sliderComponentIdle.setTitleTextColor(color);
        this.sliderComponentIdle.setSubtitleTextColor(color);
        this.sliderComponentProgress.setTitleTextColor(color);
        this.sliderComponentProgress.setSubtitleTextColor(color);
        this.sliderComponentDone.setTitleTextColor(color);
        this.sliderComponentDone.setSubtitleTextColor(color);
    }

    public final void setTextDone(CharSequence text) {
        this.sliderComponentDone.setTitle(text);
    }

    public final void setTitleIdle(CharSequence text) {
        this.sliderComponentIdle.setTitle(text);
    }

    public final void setTitleProgress(CharSequence text) {
        this.sliderComponentProgress.setTitle(text);
    }

    public final void setTrackBackgroundColor(int color) {
        this.trackBackgroundColor = color;
        this.trackGradientDrawable.setColor(color);
        this.sliderBackground.setBackground(this.trackGradientDrawable);
    }

    public final void showDoneState() {
        this.currentState = State.DONE;
        this.sliderComponentIdle.setVisibility(8);
        this.sliderComponentDone.setVisibility(0);
        this.sliderComponentProgress.stopProgressAnimation();
        this.sliderComponentProgress.setVisibility(8);
        this.trackGradientDrawable.setColor(this.trackBackgroundColor);
        this.sliderToggleArrowIcon.setImageDrawable(this.toggleDoneDrawable);
        this.sliderBackground.setBackground(this.trackGradientDrawable);
        this.sliderTrackContainer.setAlpha(0.5f);
        this.sliderToggle.setX(getMaxProgress());
    }

    public final void showIdleState() {
        this.currentState = State.IDLE;
        this.sliderComponentIdle.setVisibility(0);
        this.sliderComponentDone.setVisibility(8);
        this.sliderComponentProgress.stopProgressAnimation();
        this.sliderComponentProgress.setVisibility(8);
        this.sliderToggleArrowIcon.setImageDrawable(this.toggleStartDrawable);
        this.sliderTrackContainer.setAlpha(1.0f);
        this.sliderToggle.setAlpha(1.0f);
        this.sliderToggle.setX(getMinProgress());
        ViewPropertyAnimator viewPropertyAnimator = this.xAnimation;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setListener(null);
        }
        updateUiState();
    }

    public final void showProgressState() {
        this.currentState = State.PROGRESS;
        this.sliderComponentIdle.setVisibility(8);
        this.sliderComponentDone.setVisibility(8);
        this.sliderComponentProgress.setVisibility(0);
        this.trackGradientDrawable.setColor(this.trackBackgroundColor);
        this.sliderBackground.setBackground(this.trackGradientDrawable);
        this.sliderTrackContainer.setAlpha(0.5f);
        this.sliderToggle.setX(getMaxProgress());
        this.sliderComponentProgress.startProgressAnimation(Integer.valueOf(this.trackBackgroundColor), 800);
        this.sliderToggleArrowIcon.setImageDrawable(this.toggleDoneDrawable);
    }

    public final void startBounceAnimation() {
        FrameLayout frameLayout = this.sliderToggle;
        float[] fArr = {this.sliderBounceAnimationWidth};
        Property property = View.TRANSLATION_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, fArr);
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setStartDelay(150L);
        ofFloat.setDuration(500L);
        boolean z = this.isLayoutDirectionRtl;
        float f = this.startMargin;
        if (z) {
            f = -f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.sliderToggle, (Property<FrameLayout, Float>) property, f);
        ofFloat2.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat2.setStartDelay(200L);
        ofFloat2.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        this.sliderBounceAnimatorSet = animatorSet;
        animatorSet.start();
        AnimatorSet animatorSet2 = this.sliderBounceAnimatorSet;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.design.SliderButtonView$startBounceAnimation$$inlined$doOnCancel$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    SliderButtonView.this.sliderBounceAnimationCancelled = true;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
        AnimatorSet animatorSet3 = this.sliderBounceAnimatorSet;
        if (animatorSet3 != null) {
            animatorSet3.addListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.design.SliderButtonView$startBounceAnimation$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    int i;
                    boolean z2;
                    int i2;
                    SliderButtonView sliderButtonView = SliderButtonView.this;
                    i = sliderButtonView.sliderBounceCounter;
                    sliderButtonView.sliderBounceCounter = i + 1;
                    z2 = SliderButtonView.this.sliderBounceAnimationCancelled;
                    if (z2) {
                        return;
                    }
                    i2 = SliderButtonView.this.sliderBounceCounter;
                    if (i2 < 2) {
                        animator.start();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
    }

    public SliderButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SliderButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ SliderButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.sliderComponentStyle : i);
    }
}
