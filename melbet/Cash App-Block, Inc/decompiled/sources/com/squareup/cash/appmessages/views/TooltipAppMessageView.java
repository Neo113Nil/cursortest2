package com.squareup.cash.appmessages.views;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.TooltipAppMessageViewEvent;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.elementboundsregistry.core.BoundsRegistry$Bounds;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.util.android.Views;
import com.squareup.util.android.animation.AnimationListenerAdapter;
import com.squareup.util.android.coroutines.ViewKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class TooltipAppMessageView extends FrameLayout implements Ui {
    public final int accountSettingsOffset;
    public final int balanceAppletTileOffset;
    public Job boundsJob;
    public TooltipAppMessageViewEvent.TooltipDismissed dismissed;
    public final ElementBoundsRegistry elementBoundsRegistry;
    public Ui.EventReceiver eventReceiver;
    public final int keypadButtonItemOffset;
    public final int keypadQrButtonItemOffset;
    public String lastToken;
    public boolean readyToAnimate;
    public final int tabHugOffset;
    public TooltipAppMessageViewEvent.TargetClicked targetAction;
    public BoundsRegistry$Bounds targetBounds;
    public ElementBoundsRegistry.Element targetElement;
    public final int toolbarDiscoverMenuItemOffset;
    public final int toolbarMenuItemOffset;
    public final int toolbarMoneybotHomeMenuItemOffset;
    public TooltipAppMessageViewEvent.TooltipClicked tooltipAction;
    public Long tooltipAppearTimeMs;
    public final TooltipContainerView tooltipContainer;
    public final RealTooltipTargetLoadedCallbackRegistry tooltipTargetLoadedCallbackRegistry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipAppMessageView(Context context, ElementBoundsRegistry elementBoundsRegistry, RealTooltipTargetLoadedCallbackRegistry realTooltipTargetLoadedCallbackRegistry) {
        super(context, null);
        context.getClass();
        elementBoundsRegistry.getClass();
        realTooltipTargetLoadedCallbackRegistry.getClass();
        this.elementBoundsRegistry = elementBoundsRegistry;
        this.tooltipTargetLoadedCallbackRegistry = realTooltipTargetLoadedCallbackRegistry;
        AnimationListenerAdapter animationListenerAdapter = new AnimationListenerAdapter() { // from class: com.squareup.cash.appmessages.views.TooltipAppMessageView$animationOutListener$1
            @Override // com.squareup.util.android.animation.AnimationListenerAdapter, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                animation.getClass();
                TooltipAppMessageView.this.setVisibility(8);
            }
        };
        TooltipContainerView tooltipContainerView = new TooltipContainerView(context);
        tooltipContainerView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        tooltipContainerView.setAnimationOutListener(animationListenerAdapter);
        this.tooltipContainer = tooltipContainerView;
        this.tabHugOffset = 10;
        this.toolbarMenuItemOffset = 15;
        this.toolbarDiscoverMenuItemOffset = 5;
        this.toolbarMoneybotHomeMenuItemOffset = 10;
        this.balanceAppletTileOffset = 10;
        this.keypadButtonItemOffset = -2;
        this.accountSettingsOffset = 10;
        this.keypadQrButtonItemOffset = 5;
        setClickable(true);
        addView(tooltipContainerView);
        ViewCompat.replaceAccessibilityAction(this, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK, context.getString(R.string.tooltip_accessibility_action_click_to_dismiss), new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(this, 7));
    }

    public static final void access$revealTooltip(TooltipAppMessageView tooltipAppMessageView, TooltipAppMessageViewModel.Ready ready) {
        tooltipAppMessageView.tooltipAppearTimeMs = Long.valueOf(System.currentTimeMillis());
        tooltipAppMessageView.setVisibility(0);
        TooltipContainerView tooltipContainerView = tooltipAppMessageView.tooltipContainer;
        tooltipContainerView.getClass();
        Point point = tooltipContainerView.anchorPoint;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.6f, 1.0f, 0.6f, 1.0f, 0, point.x, 0, point.y);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(new AlphaAnimation(RecyclerView.DECELERATION_RATE, 1.0f));
        animationSet.setDuration(tooltipContainerView.animationDuration);
        tooltipContainerView.startAnimation(animationSet);
        TooltipAppMessageViewEvent.TooltipViewed tooltipViewed = ready.viewed;
        Ui.EventReceiver eventReceiver = tooltipAppMessageView.eventReceiver;
        if (eventReceiver != null) {
            eventReceiver.sendEvent(tooltipViewed);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.tooltipTargetLoadedCallbackRegistry.animateInCallback = null;
        this.readyToAnimate = false;
        this.tooltipAppearTimeMs = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r1.longValue()) >= 500) goto L26;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f = RecyclerView.DECELERATION_RATE;
        float x = motionEvent != null ? motionEvent.getX() : 0.0f;
        if (motionEvent != null) {
            f = motionEvent.getY();
        }
        BoundsRegistry$Bounds boundsRegistry$Bounds = this.targetBounds;
        TooltipContainerView tooltipContainerView = this.tooltipContainer;
        if (boundsRegistry$Bounds != null) {
            boolean contains = boundsRegistry$Bounds.contains(x, f);
            int i = (int) x;
            int i2 = (int) f;
            boolean z = Views.boundsInWindow(tooltipContainerView.contentBubble).contains(i, i2) || Views.boundsInWindow(tooltipContainerView.arrowImageView).contains(i, i2);
            if (!contains && !z) {
                Long l = this.tooltipAppearTimeMs;
                if (l != null) {
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
            if (contains) {
                setClickable(false);
                Ui.EventReceiver eventReceiver = this.eventReceiver;
                if (eventReceiver == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
                TooltipAppMessageViewEvent.TargetClicked targetClicked = this.targetAction;
                targetClicked.getClass();
                eventReceiver.sendEvent(targetClicked);
            } else {
                Ui.EventReceiver eventReceiver2 = this.eventReceiver;
                if (z) {
                    if (eventReceiver2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                    TooltipAppMessageViewEvent.TooltipClicked tooltipClicked = this.tooltipAction;
                    tooltipClicked.getClass();
                    eventReceiver2.sendEvent(tooltipClicked);
                } else {
                    if (eventReceiver2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                    TooltipAppMessageViewEvent.TooltipDismissed tooltipDismissed = this.dismissed;
                    tooltipDismissed.getClass();
                    eventReceiver2.sendEvent(tooltipDismissed);
                }
            }
        }
        tooltipContainerView.animateOut();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(TooltipAppMessageViewModel tooltipAppMessageViewModel) {
        Job whileEachAttached;
        tooltipAppMessageViewModel.getClass();
        TooltipAppMessageViewModel.Ready ready = tooltipAppMessageViewModel instanceof TooltipAppMessageViewModel.Ready ? (TooltipAppMessageViewModel.Ready) tooltipAppMessageViewModel : null;
        if (ready == null || Intrinsics.areEqual(ready.messageToken, this.lastToken)) {
            setVisibility(8);
            Job job = this.boundsJob;
            if (job != null) {
                job.cancel(null);
            }
            this.boundsJob = null;
            this.tooltipTargetLoadedCallbackRegistry.animateInCallback = null;
            this.tooltipAppearTimeMs = null;
            return;
        }
        TooltipAppMessageViewModel.Ready ready2 = (TooltipAppMessageViewModel.Ready) tooltipAppMessageViewModel;
        ElementBoundsRegistry.Element access$toElementBoundsRegistryElement = UseCaseUtil.access$toElementBoundsRegistryElement(ready2.placement);
        TooltipAppMessageViewModel.Ready.ArrowPosition arrowPosition = ready2.arrowPosition;
        if (this.targetElement == access$toElementBoundsRegistryElement) {
            return;
        }
        this.targetElement = access$toElementBoundsRegistryElement;
        whileEachAttached = ViewKt.whileEachAttached(this, EmptyCoroutineContext.INSTANCE, new BenefitsHubPresenter$models$1$1(this, access$toElementBoundsRegistryElement, ready2, arrowPosition, (Continuation) null));
        Job job2 = this.boundsJob;
        if (job2 != null) {
            job2.cancel(null);
        }
        this.boundsJob = whileEachAttached;
    }
}
