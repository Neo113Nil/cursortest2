package com.squareup.cash.appmessages.views;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.impl.UseCaseAdditionSimulator;
import androidx.recyclerview.widget.RecyclerView;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.InAppNotificationModel;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.lottie.CashLottieAnimationView;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.contour.ContourLayout;
import com.squareup.protos.cash.ui.Color;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.util.android.coroutines.ViewKt;
import com.squareup.util.android.drawable.RoundedRectShadowOutlineProvider;
import com.squareup.util.android.drawable.RoundedRectShadowOutlineProvider$Radius$Res;
import com.squareup.util.android.drawable.ViewShadowInfo;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class InAppNotificationView extends ContourLayout {
    public AppMessageViewEvent.AppMessageActionTaken action;
    public final AppCompatImageView chevron;
    public AppMessageViewEvent.AppMessageActionTaken dismissed;
    public float endPosition;
    public Function1 eventReceiver;
    public final CashLottieAnimationView image;
    public Job job;
    public String lastToken;
    public ObjectAnimator slideAnimator;
    public float startPosition;
    public final RealAppMessageImageLoader staticImageLoader;
    public final ThemeInfo themeInfo;
    public final AppCompatTextView title;

    public final class BackgroundDrawable extends ShapeDrawable {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppNotificationView(Context context, RealAppMessageImageLoader realAppMessageImageLoader) {
        super(context, null);
        context.getClass();
        realAppMessageImageLoader.getClass();
        this.staticImageLoader = realAppMessageImageLoader;
        this.image = new CashLottieAnimationView(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        Strings.applyStyle(appCompatTextView, TextStyles.smallBody);
        this.title = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R.drawable.mooncake_chevron_right);
        this.chevron = appCompatImageView;
        this.themeInfo = ThemeHelpersKt.themeInfo(this);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = Views.dip(context, 20.0f);
        }
        float[] fArr2 = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr2[i2] = Views.dip(context, 20.0f);
        }
        BackgroundDrawable backgroundDrawable = new BackgroundDrawable(new RoundRectShape(fArr, null, fArr2));
        backgroundDrawable.setTint(this.themeInfo.colorPalette.elevatedBackground);
        setBackground(backgroundDrawable);
        RoundedRectShadowOutlineProvider$Radius$Res roundedRectShadowOutlineProvider$Radius$Res = new RoundedRectShadowOutlineProvider$Radius$Res(R.dimen.in_app_notification_view_shadow_radius);
        Resources resources = getResources();
        resources.getClass();
        setOutlineProvider(new RoundedRectShadowOutlineProvider(roundedRectShadowOutlineProvider$Radius$Res, new ViewShadowInfo(resources, R.dimen.in_app_notification_view_shadow_offset, R.dimen.in_app_notification_view_shadow_alpha, R.dimen.in_app_notification_view_elevation)));
        CashLottieAnimationView cashLottieAnimationView = this.image;
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new InAppNotificationView$$ExternalSyntheticLambda0(this, 4));
        leftTo.widthOf(1, new InAppNotificationView$$ExternalSyntheticLambda0(this, 6));
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new InAppNotificationView$$ExternalSyntheticLambda0(this, 7));
        byteArrayProtoReader32.heightOf(1, new InAppNotificationView$$ExternalSyntheticLambda0(this, 8));
        ContourLayout.layoutBy$default(this, cashLottieAnimationView, leftTo, byteArrayProtoReader32);
        AppCompatTextView appCompatTextView2 = this.title;
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new InAppNotificationView$$ExternalSyntheticLambda0(this, 9));
        leftTo2.rightTo(1, new InAppNotificationView$$ExternalSyntheticLambda0(this, 10));
        ContourLayout.layoutBy$default(this, appCompatTextView2, leftTo2, ContourLayout.centerVerticallyTo(new SvgDecoder$$ExternalSyntheticLambda0(14)));
        AppCompatImageView appCompatImageView2 = this.chevron;
        ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new InAppNotificationView$$ExternalSyntheticLambda0(this, 1));
        rightTo.widthOf(1, new InAppNotificationView$$ExternalSyntheticLambda0(this, 2));
        ContourLayout.layoutBy$default(this, appCompatImageView2, rightTo, ContourLayout.centerVerticallyTo(new SvgDecoder$$ExternalSyntheticLambda0(13)));
        contourHeightOf(new InAppNotificationView$$ExternalSyntheticLambda0(this, 5));
    }

    public final void changeVisibility(final int i) {
        float f;
        if (getVisibility() == i) {
            return;
        }
        ObjectAnimator objectAnimator = this.slideAnimator;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        float f2 = -400.0f;
        if (i == 0) {
            setVisibility(0);
            f = RecyclerView.DECELERATION_RATE;
        } else {
            f = -400.0f;
            f2 = this.endPosition;
        }
        Property property = View.TRANSLATION_Y;
        property.getClass();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<InAppNotificationView, Float>) property, f2, f);
        ofFloat.setStartDelay(0L);
        ofFloat.setDuration(300L);
        ofFloat.setRepeatCount(0);
        ofFloat.setRepeatMode(1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.squareup.cash.appmessages.views.InAppNotificationView$changeVisibility$$inlined$objectAnimatorFor$default$1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.squareup.cash.appmessages.views.InAppNotificationView$changeVisibility$$inlined$objectAnimatorFor$default$2
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                InAppNotificationView.this.setVisibility(i);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.squareup.cash.appmessages.views.InAppNotificationView$changeVisibility$$inlined$objectAnimatorFor$default$3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            }
        });
        this.slideAnimator = ofFloat;
        ofFloat.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.slideAnimator;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.startPosition = motionEvent.getRawY();
            Job job = this.job;
            if (job != null) {
                job.cancel(null);
            }
        } else {
            if (action == 1) {
                if (this.startPosition - motionEvent.getRawY() < 10.0f) {
                    performClick();
                } else {
                    AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = this.dismissed;
                    if (appMessageActionTaken != null) {
                        Function1 function1 = this.eventReceiver;
                        if (function1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                        function1.invoke(appMessageActionTaken);
                    }
                }
                this.endPosition = Math.min(RecyclerView.DECELERATION_RATE, motionEvent.getRawY() - this.startPosition);
                return true;
            }
            if (action == 2) {
                setTranslationY(Math.min(RecyclerView.DECELERATION_RATE, motionEvent.getRawY() - this.startPosition));
                return true;
            }
        }
        return true;
    }

    public final void setEventReceiver(Function1<? super AppMessageViewEvent, Unit> function1) {
        function1.getClass();
        this.eventReceiver = function1;
        setOnClickListener(new View.OnClickListener() { // from class: com.squareup.cash.appmessages.views.InAppNotificationView$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InAppNotificationView inAppNotificationView = InAppNotificationView.this;
                AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = inAppNotificationView.action;
                if (appMessageActionTaken != null) {
                    Function1 function12 = inAppNotificationView.eventReceiver;
                    if (function12 != null) {
                        function12.invoke(appMessageActionTaken);
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                }
            }
        });
    }

    public final void setModel(InAppNotificationModel inAppNotificationModel) {
        Job whileEachAttached;
        Integer forTheme;
        inAppNotificationModel.getClass();
        Continuation continuation = null;
        InAppNotificationModel.Ready ready = inAppNotificationModel instanceof InAppNotificationModel.Ready ? (InAppNotificationModel.Ready) inAppNotificationModel : null;
        if (Intrinsics.areEqual(ready != null ? ready.token : null, this.lastToken)) {
            return;
        }
        this.lastToken = ready != null ? ready.token : null;
        this.action = ready != null ? ready.action : null;
        this.dismissed = ready != null ? ready.dismiss : null;
        if (ready == null) {
            changeVisibility(8);
            Job job = this.job;
            if (job != null) {
                job.cancel(null);
                return;
            }
            return;
        }
        changeVisibility(0);
        AppMessageViewEvent.AppMessageViewed appMessageViewed = ready.viewed;
        Function1 function1 = this.eventReceiver;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
            throw null;
        }
        function1.invoke(appMessageViewed);
        AppMessageImage appMessageImage = ready.image;
        boolean z = appMessageImage instanceof AppMessageImage.Static;
        CashLottieAnimationView cashLottieAnimationView = this.image;
        if (z) {
            UseCaseAdditionSimulator.render(cashLottieAnimationView, this.staticImageLoader, (AppMessageImage.Static) appMessageImage, new InAppNotificationView$$ExternalSyntheticLambda0(this, 0));
        } else if (appMessageImage instanceof AppMessageImage.Animated) {
            UseCaseAdditionSimulator.render(cashLottieAnimationView, (AppMessageImage.Animated) appMessageImage, new InAppNotificationView$$ExternalSyntheticLambda0(this, 3));
        } else {
            if (appMessageImage != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            cashLottieAnimationView.setVisibility(8);
        }
        String str = ready.description;
        AppCompatTextView appCompatTextView = this.title;
        appCompatTextView.setText(str);
        Color color = ready.color;
        ThemeInfo themeInfo = this.themeInfo;
        appCompatTextView.setTextColor((color == null || (forTheme = ThemablesKt.forTheme(color, themeInfo)) == null) ? themeInfo.colorPalette.label : forTheme.intValue());
        this.chevron.setVisibility(ready.showChevron ? 0 : 8);
        Long l = ready.duration;
        if (l != null) {
            whileEachAttached = ViewKt.whileEachAttached(this, EmptyCoroutineContext.INSTANCE, new ToastKt$Toast$9$1(this, l, ready, continuation, 8));
            this.job = whileEachAttached;
        } else {
            Job job2 = this.job;
            if (job2 != null) {
                job2.cancel(null);
            }
        }
    }
}
