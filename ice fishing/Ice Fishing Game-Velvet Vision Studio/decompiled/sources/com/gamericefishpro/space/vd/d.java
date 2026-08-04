package com.gamericefishpro.space.vd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.onesignal.common.AndroidUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final int ACTIVITY_BACKGROUND_COLOR_EMPTY = 0;
    private static final int ACTIVITY_FINISH_AFTER_DISMISS_DELAY_MS = 600;
    private static final int ACTIVITY_INIT_DELAY = 200;
    private static final int IN_APP_BACKGROUND_ANIMATION_DURATION_MS = 400;
    private static final int IN_APP_BANNER_ANIMATION_DURATION_MS = 1000;
    private static final int IN_APP_CENTER_ANIMATION_DURATION_MS = 1000;
    private static final String IN_APP_MESSAGE_CARD_VIEW_TAG = "IN_APP_MESSAGE_CARD_VIEW_TAG";
    private boolean cancelDismissTimer;
    private Activity currentActivity;
    private final boolean disableDragDismiss;
    private final double displayDuration;
    private final m.c displayPosition;
    private com.gamericefishpro.space.vd.a draggableRelativeLayout;
    private final boolean hasBackground;
    private final boolean hideGrayOverlay;
    private boolean isDismissTimerSet;
    private boolean isDragging;
    private int marginPxSizeBottom;
    private int marginPxSizeLeft;
    private int marginPxSizeRight;
    private int marginPxSizeTop;
    private final com.gamericefishpro.space.qd.d messageContent;
    private com.gamericefishpro.space.vd.e messageController;
    private int pageHeight;
    private final int pageWidth;
    private RelativeLayout parentRelativeLayout;
    private com.gamericefishpro.space.vd.h popupWindow;
    private final f popupWindowListener;
    private boolean shouldDismissWhenActive;
    private WebView webView;
    public static final a Companion = new a(null);
    private static final int ACTIVITY_BACKGROUND_COLOR_FULL = Color.parseColor("#BB000000");
    private static final int DRAG_THRESHOLD_PX_SIZE = com.gamericefishpro.space.yb.k.INSTANCE.dpToPx(4);

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ com.gamericefishpro.space.ic.c $waiter;

        public b(com.gamericefishpro.space.ic.c cVar) {
            this.$waiter = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            d.this.cleanupViewsAfterDismiss();
            this.$waiter.wake();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c implements Animation.AnimationListener {
        final /* synthetic */ com.gamericefishpro.space.s.a $messageViewCardView;
        final /* synthetic */ d this$0;

        public c(com.gamericefishpro.space.s.a aVar, d dVar) {
            this.$messageViewCardView = aVar;
            this.this$0 = dVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (this.this$0.messageController != null) {
                com.gamericefishpro.space.vd.e eVar = this.this$0.messageController;
                Intrinsics.b(eVar);
                eVar.onMessageWasDisplayed();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.vd.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0065d extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0065d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.delayShowUntilAvailable(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.vh.i implements Function2 {
        int label;

        public e(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return d.this.new e(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((e) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        
            if (r6.animateAndDismissLayout(r1, r5) == r0) goto L19;
         */
        @Override // com.gamericefishpro.space.vh.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                this.label = 1;
                if (a0.i(600L, this) != aVar) {
                }
                return aVar;
            }
            if (i == 1) {
                com.gamericefishpro.space.wa.b.P(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
            if (!d.this.hasBackground || d.this.parentRelativeLayout == null) {
                d.this.cleanupViewsAfterDismiss();
            } else {
                d dVar = d.this;
                RelativeLayout relativeLayout = dVar.parentRelativeLayout;
                Intrinsics.b(relativeLayout);
                this.label = 2;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f implements com.gamericefishpro.space.vd.g {
        public f() {
        }

        @Override // com.gamericefishpro.space.vd.g
        public void onDismiss(Boolean bool) {
            if (Intrinsics.a(bool, Boolean.TRUE)) {
                return;
            }
            com.gamericefishpro.space.od.b.debug$default("PopupWindowListener.onDismiss called by the system.", null, 2, null);
            com.gamericefishpro.space.vd.e eVar = d.this.messageController;
            if (eVar != null) {
                eVar.onMessageWasDismissed();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class g implements com.gamericefishpro.space.vd.b {

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.vh.i implements Function1 {
            int label;
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, com.gamericefishpro.space.th.a aVar) {
                super(1, aVar);
                this.this$0 = dVar;
            }

            @Override // com.gamericefishpro.space.vh.a
            public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
                return new a(this.this$0, aVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(com.gamericefishpro.space.th.a aVar) {
                return ((a) create(aVar)).invokeSuspend(Unit.a);
            }

            @Override // com.gamericefishpro.space.vh.a
            public final Object invokeSuspend(Object obj) {
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.label;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    d dVar = this.this$0;
                    this.label = 1;
                    if (dVar.finishAfterDelay(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            }
        }

        public g() {
        }

        @Override // com.gamericefishpro.space.vd.b
        public void onDismiss() {
            if (d.this.messageController != null) {
                com.gamericefishpro.space.vd.e eVar = d.this.messageController;
                Intrinsics.b(eVar);
                eVar.onMessageWillDismiss();
            }
            com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new a(d.this, null), 1, null);
        }

        @Override // com.gamericefishpro.space.vd.b
        public void onDragEnd() {
            d.this.isDragging = false;
        }

        @Override // com.gamericefishpro.space.vd.b
        public void onDragStart() {
            d.this.isDragging = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class h extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ m.c $displayLocation;
        final /* synthetic */ RelativeLayout.LayoutParams $draggableRelativeLayoutParams;
        final /* synthetic */ RelativeLayout.LayoutParams $relativeLayoutParams;
        final /* synthetic */ com.gamericefishpro.space.vd.a.b $webViewLayoutParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, com.gamericefishpro.space.vd.a.b bVar, m.c cVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$relativeLayoutParams = layoutParams;
            this.$draggableRelativeLayoutParams = layoutParams2;
            this.$webViewLayoutParams = bVar;
            this.$displayLocation = cVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return d.this.new h(this.$relativeLayoutParams, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams, this.$displayLocation, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((h) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                if (d.this.webView == null) {
                    return Unit.a;
                }
                WebView webView = d.this.webView;
                Intrinsics.b(webView);
                webView.setLayoutParams(this.$relativeLayoutParams);
                d dVar = d.this;
                Activity activity = dVar.currentActivity;
                Intrinsics.b(activity);
                dVar.setUpDraggableLayout(activity, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams);
                d dVar2 = d.this;
                Activity activity2 = dVar2.currentActivity;
                Intrinsics.b(activity2);
                dVar2.setUpParentRelativeLayout(activity2);
                d dVar3 = d.this;
                RelativeLayout relativeLayout = dVar3.parentRelativeLayout;
                Intrinsics.b(relativeLayout);
                dVar3.createPopupWindow(relativeLayout);
                if (d.this.messageController != null) {
                    d dVar4 = d.this;
                    m.c cVar = this.$displayLocation;
                    com.gamericefishpro.space.vd.a aVar2 = dVar4.draggableRelativeLayout;
                    Intrinsics.b(aVar2);
                    RelativeLayout relativeLayout2 = d.this.parentRelativeLayout;
                    Intrinsics.b(relativeLayout2);
                    dVar4.animateInAppMessage(cVar, aVar2, relativeLayout2);
                }
                d dVar5 = d.this;
                this.label = 1;
                if (dVar5.startDismissTimerIfNeeded(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class i extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public i(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.startDismissTimerIfNeeded(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class j extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ int $pageHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$pageHeight = i;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return d.this.new j(this.$pageHeight, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((j) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            if (d.this.webView == null) {
                com.gamericefishpro.space.od.b.warn$default("WebView height update skipped, new height will be used once it is displayed.", null, 2, null);
                return Unit.a;
            }
            WebView webView = d.this.webView;
            Intrinsics.b(webView);
            ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
            if (layoutParams == null) {
                com.gamericefishpro.space.od.b.warn$default("WebView height update skipped because of null layoutParams, new height will be used once it is displayed.", null, 2, null);
                return Unit.a;
            }
            layoutParams.height = this.$pageHeight;
            WebView webView2 = d.this.webView;
            Intrinsics.b(webView2);
            webView2.setLayoutParams(layoutParams);
            if (d.this.draggableRelativeLayout != null) {
                com.gamericefishpro.space.vd.a aVar2 = d.this.draggableRelativeLayout;
                Intrinsics.b(aVar2);
                d dVar = d.this;
                aVar2.setParams(dVar.createDraggableLayoutParams(this.$pageHeight, dVar.getDisplayPosition(), d.this.disableDragDismiss));
            }
            return Unit.a;
        }
    }

    public d(WebView webView, com.gamericefishpro.space.qd.d messageContent, boolean z, boolean z2) {
        double dDoubleValue;
        Intrinsics.checkNotNullParameter(messageContent, "messageContent");
        this.webView = webView;
        this.messageContent = messageContent;
        this.disableDragDismiss = z;
        this.hideGrayOverlay = z2;
        this.pageWidth = -1;
        this.pageHeight = messageContent.getPageHeight();
        com.gamericefishpro.space.yb.k kVar = com.gamericefishpro.space.yb.k.INSTANCE;
        this.marginPxSizeLeft = kVar.dpToPx(24);
        this.marginPxSizeRight = kVar.dpToPx(24);
        this.marginPxSizeTop = kVar.dpToPx(24);
        this.marginPxSizeBottom = kVar.dpToPx(24);
        m.c displayLocation = messageContent.getDisplayLocation();
        Intrinsics.b(displayLocation);
        this.displayPosition = displayLocation;
        if (messageContent.getDisplayDuration() == null) {
            dDoubleValue = 0.0d;
        } else {
            Double displayDuration = messageContent.getDisplayDuration();
            Intrinsics.b(displayDuration);
            dDoubleValue = displayDuration.doubleValue();
        }
        this.displayDuration = dDoubleValue;
        this.hasBackground = !displayLocation.isBanner();
        this.popupWindowListener = new f();
        setMarginsFromContent(messageContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateAndDismissLayout(View view, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.ic.c cVar = new com.gamericefishpro.space.ic.c();
        animateBackgroundColor(view, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, getOverlayColor(), 0, new b(cVar)).start();
        Object objWaitForWake = cVar.waitForWake(aVar);
        return objWaitForWake == com.gamericefishpro.space.uh.a.d ? objWaitForWake : Unit.a;
    }

    private final ValueAnimator animateBackgroundColor(View view, int i2, int i3, int i4, Animator.AnimatorListener animatorListener) {
        return com.gamericefishpro.space.vd.j.INSTANCE.animateViewColor(view, i2, i3, i4, animatorListener);
    }

    private final void animateBottom(View view, int i2, Animation.AnimationListener animationListener) {
        com.gamericefishpro.space.vd.j.INSTANCE.animateViewByTranslation(view, i2 + this.marginPxSizeBottom, 0.0f, 1000, new k(0.1d, 8.0d), animationListener).start();
    }

    private final void animateCenter(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation animationAnimateViewSmallToLarge = com.gamericefishpro.space.vd.j.INSTANCE.animateViewSmallToLarge(view, 1000, new k(0.1d, 8.0d), animationListener);
        ValueAnimator valueAnimatorAnimateBackgroundColor = animateBackgroundColor(view2, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, 0, getOverlayColor(), animatorListener);
        animationAnimateViewSmallToLarge.start();
        valueAnimatorAnimateBackgroundColor.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateInAppMessage(m.c cVar, View view, View view2) {
        Intrinsics.b(view);
        com.gamericefishpro.space.s.a aVar = (com.gamericefishpro.space.s.a) view.findViewWithTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        Intrinsics.b(aVar);
        Animation.AnimationListener animationListenerCreateAnimationListener = createAnimationListener(aVar);
        int i2 = com.gamericefishpro.space.vd.f.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i2 == 1) {
            WebView webView = this.webView;
            Intrinsics.b(webView);
            animateTop(aVar, webView.getHeight(), animationListenerCreateAnimationListener);
        } else if (i2 == 2) {
            WebView webView2 = this.webView;
            Intrinsics.b(webView2);
            animateBottom(aVar, webView2.getHeight(), animationListenerCreateAnimationListener);
        } else if (i2 == 3 || i2 == 4) {
            animateCenter(view, view2, animationListenerCreateAnimationListener, null);
        }
    }

    private final void animateTop(View view, int i2, Animation.AnimationListener animationListener) {
        com.gamericefishpro.space.vd.j.INSTANCE.animateViewByTranslation(view, (-i2) - this.marginPxSizeTop, 0.0f, 1000, new k(0.1d, 8.0d), animationListener).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanupViewsAfterDismiss() {
        removeAllViews();
        com.gamericefishpro.space.vd.e eVar = this.messageController;
        if (eVar != null) {
            eVar.onMessageWasDismissed();
        }
    }

    private final Animation.AnimationListener createAnimationListener(com.gamericefishpro.space.s.a aVar) {
        return new c(aVar, this);
    }

    private final com.gamericefishpro.space.s.a createCardView(Context context) {
        com.gamericefishpro.space.s.a aVar = new com.gamericefishpro.space.s.a(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.displayPosition == m.c.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        aVar.setLayoutParams(layoutParams);
        if (getHideDropShadow(context)) {
            aVar.setCardElevation(0.0f);
        } else {
            aVar.setCardElevation(com.gamericefishpro.space.yb.k.INSTANCE.dpToPx(5));
        }
        aVar.setRadius(com.gamericefishpro.space.yb.k.INSTANCE.dpToPx(8));
        aVar.setClipChildren(false);
        aVar.setClipToPadding(false);
        aVar.setPreventCornerOverlap(false);
        aVar.setCardBackgroundColor(0);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.gamericefishpro.space.vd.a.b createDraggableLayoutParams(int i2, m.c cVar, boolean z) {
        com.gamericefishpro.space.vd.a.b bVar = new com.gamericefishpro.space.vd.a.b();
        bVar.setMaxXPos(this.marginPxSizeRight);
        bVar.setMaxYPos(this.marginPxSizeTop);
        bVar.setDraggingDisabled(z);
        bVar.setMessageHeight(i2);
        bVar.setHeight(getDisplayYSize());
        int i3 = com.gamericefishpro.space.vd.f.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i3 == 1) {
            bVar.setDragThresholdY(this.marginPxSizeTop - DRAG_THRESHOLD_PX_SIZE);
        } else if (i3 == 2) {
            bVar.setPosY(getDisplayYSize() - i2);
            bVar.setDragThresholdY(this.marginPxSizeBottom + DRAG_THRESHOLD_PX_SIZE);
        } else if (i3 == 3) {
            int displayYSize = (getDisplayYSize() / 2) - (i2 / 2);
            bVar.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize);
            bVar.setMaxYPos(displayYSize);
            bVar.setPosY(displayYSize);
        } else if (i3 == 4) {
            int displayYSize2 = getDisplayYSize() - (this.marginPxSizeBottom + this.marginPxSizeTop);
            bVar.setMessageHeight(displayYSize2);
            int displayYSize3 = (getDisplayYSize() / 2) - (displayYSize2 / 2);
            bVar.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize3);
            bVar.setMaxYPos(displayYSize3);
            bVar.setPosY(displayYSize3);
        }
        bVar.setDragDirection(cVar == m.c.TOP_BANNER ? 0 : 1);
        return bVar;
    }

    private final RelativeLayout.LayoutParams createParentRelativeLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.pageWidth, -1);
        int i2 = com.gamericefishpro.space.vd.f.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
        if (i2 == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i2 != 3 && i2 != 4) {
            return layoutParams;
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPopupWindow(RelativeLayout relativeLayout) {
        boolean z = this.hasBackground;
        com.gamericefishpro.space.vd.h hVar = new com.gamericefishpro.space.vd.h(relativeLayout, z ? -1 : this.pageWidth, z ? -1 : -2, false, this.popupWindowListener);
        this.popupWindow = hVar;
        hVar.setBackgroundDrawable(new ColorDrawable(0));
        com.gamericefishpro.space.vd.h hVar2 = this.popupWindow;
        int i2 = 1;
        if (hVar2 != null) {
            hVar2.setTouchable(true);
        }
        com.gamericefishpro.space.vd.h hVar3 = this.popupWindow;
        if (hVar3 != null) {
            hVar3.setFocusable(!this.displayPosition.isBanner());
        }
        com.gamericefishpro.space.vd.h hVar4 = this.popupWindow;
        if (hVar4 != null) {
            hVar4.setClippingEnabled(false);
        }
        if (this.hasBackground) {
            i2 = 0;
        } else {
            int i3 = com.gamericefishpro.space.vd.f.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
            if (i3 == 1) {
                i2 = 49;
            } else if (i3 == 2) {
                i2 = 81;
            } else if (i3 != 3 && i3 != 4) {
                throw new com.gamericefishpro.space.oh.k();
            }
        }
        int i4 = this.messageContent.isFullBleed() ? 1000 : 1003;
        com.gamericefishpro.space.vd.h hVar5 = this.popupWindow;
        Intrinsics.b(hVar5);
        hVar5.setWindowLayoutType(i4);
        com.gamericefishpro.space.vd.h hVar6 = this.popupWindow;
        if (hVar6 != null) {
            Activity activity = this.currentActivity;
            Intrinsics.b(activity);
            hVar6.showAtLocation(activity.getWindow().getDecorView().getRootView(), i2, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (showInAppMessageView(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r2.delayShowUntilAvailable(r7, r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayShowUntilAvailable(Activity activity, com.gamericefishpro.space.th.a aVar) {
        C0065d c0065d;
        d dVar;
        if (aVar instanceof C0065d) {
            c0065d = (C0065d) aVar;
            int i2 = c0065d.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0065d.label = i2 - Integer.MIN_VALUE;
            } else {
                c0065d = new C0065d(aVar);
            }
        } else {
            c0065d = new C0065d(aVar);
        }
        Object obj = c0065d.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = c0065d.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            if (AndroidUtils.INSTANCE.isActivityFullyReady(activity) && this.parentRelativeLayout == null) {
                c0065d.label = 1;
            } else {
                c0065d.L$0 = this;
                c0065d.L$1 = activity;
                c0065d.label = 2;
                if (a0.i(200L, c0065d) != aVar2) {
                    dVar = this;
                    c0065d.L$0 = null;
                    c0065d.L$1 = null;
                    c0065d.label = 3;
                }
            }
            return aVar2;
        }
        if (i3 == 1) {
            com.gamericefishpro.space.wa.b.P(obj);
            return Unit.a;
        }
        if (i3 == 2) {
            activity = (Activity) c0065d.L$1;
            dVar = (d) c0065d.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            c0065d.L$0 = null;
            c0065d.L$1 = null;
            c0065d.label = 3;
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return Unit.a;
    }

    private final void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishAfterDelay(com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = a0.D(com.gamericefishpro.space.ui.m.a, new e(null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    private final int getDisplayYSize() {
        com.gamericefishpro.space.yb.k kVar = com.gamericefishpro.space.yb.k.INSTANCE;
        Activity activity = this.currentActivity;
        Intrinsics.b(activity);
        return kVar.getWindowHeight(activity);
    }

    private final boolean getHideDropShadow(Context context) {
        return AndroidUtils.INSTANCE.getManifestMetaBoolean(context, "com.onesignal.inAppMessageHideDropShadow");
    }

    private final int getOverlayColor() {
        if (this.hideGrayOverlay) {
            return 0;
        }
        return ACTIVITY_BACKGROUND_COLOR_FULL;
    }

    private final void setMarginsFromContent(com.gamericefishpro.space.qd.d dVar) {
        this.marginPxSizeTop = dVar.getUseHeightMargin() ? com.gamericefishpro.space.yb.k.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeBottom = dVar.getUseHeightMargin() ? com.gamericefishpro.space.yb.k.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeLeft = dVar.getUseWidthMargin() ? com.gamericefishpro.space.yb.k.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeRight = dVar.getUseWidthMargin() ? com.gamericefishpro.space.yb.k.INSTANCE.dpToPx(24) : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpDraggableLayout(Context context, RelativeLayout.LayoutParams layoutParams, com.gamericefishpro.space.vd.a.b bVar) {
        com.gamericefishpro.space.vd.a aVar = new com.gamericefishpro.space.vd.a(context);
        this.draggableRelativeLayout = aVar;
        if (layoutParams != null) {
            aVar.setLayoutParams(layoutParams);
        }
        com.gamericefishpro.space.vd.a aVar2 = this.draggableRelativeLayout;
        Intrinsics.b(aVar2);
        aVar2.setParams(bVar);
        com.gamericefishpro.space.vd.a aVar3 = this.draggableRelativeLayout;
        Intrinsics.b(aVar3);
        aVar3.setListener(new g());
        WebView webView = this.webView;
        Intrinsics.b(webView);
        if (webView.getParent() != null) {
            WebView webView2 = this.webView;
            Intrinsics.b(webView2);
            ViewParent parent = webView2.getParent();
            Intrinsics.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeAllViews();
        }
        com.gamericefishpro.space.s.a aVarCreateCardView = createCardView(context);
        aVarCreateCardView.setTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        aVarCreateCardView.addView(this.webView);
        com.gamericefishpro.space.vd.a aVar4 = this.draggableRelativeLayout;
        Intrinsics.b(aVar4);
        aVar4.setPadding(this.marginPxSizeLeft, this.marginPxSizeTop, this.marginPxSizeRight, this.marginPxSizeBottom);
        com.gamericefishpro.space.vd.a aVar5 = this.draggableRelativeLayout;
        Intrinsics.b(aVar5);
        aVar5.setClipChildren(false);
        com.gamericefishpro.space.vd.a aVar6 = this.draggableRelativeLayout;
        Intrinsics.b(aVar6);
        aVar6.setClipToPadding(false);
        com.gamericefishpro.space.vd.a aVar7 = this.draggableRelativeLayout;
        Intrinsics.b(aVar7);
        aVar7.addView(aVarCreateCardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpParentRelativeLayout(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.parentRelativeLayout = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout relativeLayout2 = this.parentRelativeLayout;
        Intrinsics.b(relativeLayout2);
        relativeLayout2.setClipChildren(false);
        RelativeLayout relativeLayout3 = this.parentRelativeLayout;
        Intrinsics.b(relativeLayout3);
        relativeLayout3.setClipToPadding(false);
        RelativeLayout relativeLayout4 = this.parentRelativeLayout;
        Intrinsics.b(relativeLayout4);
        relativeLayout4.addView(this.draggableRelativeLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showDraggableView(m.c cVar, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, com.gamericefishpro.space.vd.a.b bVar, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = a0.D(com.gamericefishpro.space.ui.m.a, new h(layoutParams, layoutParams2, bVar, cVar, null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object startDismissTimerIfNeeded(com.gamericefishpro.space.th.a aVar) {
        i iVar;
        d dVar;
        d dVar2;
        if (aVar instanceof i) {
            iVar = (i) aVar;
            int i2 = iVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.label = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(aVar);
            }
        } else {
            iVar = new i(aVar);
        }
        Object obj = iVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = iVar.label;
        if (i3 != 0) {
            if (i3 == 1) {
                dVar = (d) iVar.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar2 = (d) iVar.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
            }
            dVar2.isDismissTimerSet = false;
            return Unit.a;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        double d = this.displayDuration;
        if (d <= 0.0d || this.isDismissTimerSet) {
            return Unit.a;
        }
        this.isDismissTimerSet = true;
        iVar.L$0 = this;
        iVar.label = 1;
        if (a0.i(((long) d) * ((long) 1000), iVar) != aVar2) {
            dVar = this;
        }
        return aVar2;
        if (dVar.cancelDismissTimer) {
            dVar.cancelDismissTimer = false;
            return Unit.a;
        }
        com.gamericefishpro.space.vd.e eVar = dVar.messageController;
        if (eVar != null) {
            Intrinsics.b(eVar);
            eVar.onMessageWillDismiss();
        }
        if (dVar.currentActivity != null) {
            iVar.L$0 = dVar;
            iVar.label = 2;
            if (dVar.dismissAndAwaitNextMessage(iVar) != aVar2) {
                dVar2 = dVar;
                dVar2.isDismissTimerSet = false;
            }
            return aVar2;
        }
        dVar.shouldDismissWhenActive = true;
        return Unit.a;
    }

    public final Object checkIfShouldDismiss(com.gamericefishpro.space.th.a aVar) {
        if (!this.shouldDismissWhenActive) {
            return Unit.a;
        }
        this.shouldDismissWhenActive = false;
        Object objFinishAfterDelay = finishAfterDelay(aVar);
        return objFinishAfterDelay == com.gamericefishpro.space.uh.a.d ? objFinishAfterDelay : Unit.a;
    }

    public final Object dismissAndAwaitNextMessage(com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.vd.a aVar2 = this.draggableRelativeLayout;
        if (aVar2 == null) {
            com.gamericefishpro.space.od.b.error$default("No host presenter to trigger dismiss animation, counting as dismissed already", null, 2, null);
            dereferenceViews();
            return Unit.a;
        }
        Intrinsics.b(aVar2);
        aVar2.dismiss();
        Object objFinishAfterDelay = finishAfterDelay(aVar);
        return objFinishAfterDelay == com.gamericefishpro.space.uh.a.d ? objFinishAfterDelay : Unit.a;
    }

    public final m.c getDisplayPosition() {
        return this.displayPosition;
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    public final void removeAllViews() {
        com.gamericefishpro.space.od.b.debug$default("InAppMessageView.removeAllViews()", null, 2, null);
        com.gamericefishpro.space.vd.h hVar = this.popupWindow;
        if (hVar != null) {
            hVar.setWasDismissedManually(Boolean.TRUE);
        }
        if (this.isDismissTimerSet) {
            this.cancelDismissTimer = true;
        }
        com.gamericefishpro.space.vd.a aVar = this.draggableRelativeLayout;
        if (aVar != null) {
            aVar.removeAllViews();
        }
        com.gamericefishpro.space.vd.h hVar2 = this.popupWindow;
        if (hVar2 != null) {
            hVar2.dismiss();
        }
        dereferenceViews();
    }

    public final void setMessageController(com.gamericefishpro.space.vd.e eVar) {
        this.messageController = eVar;
    }

    public final void setWebView(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
    }

    public final Object showInAppMessageView(Activity activity, com.gamericefishpro.space.th.a aVar) {
        this.currentActivity = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.pageHeight);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams layoutParamsCreateParentRelativeLayoutParams = this.hasBackground ? createParentRelativeLayoutParams() : null;
        m.c cVar = this.displayPosition;
        Object objShowDraggableView = showDraggableView(cVar, layoutParams, layoutParamsCreateParentRelativeLayoutParams, createDraggableLayoutParams(this.pageHeight, cVar, this.disableDragDismiss), aVar);
        return objShowDraggableView == com.gamericefishpro.space.uh.a.d ? objShowDraggableView : Unit.a;
    }

    public final Object showView(Activity activity, com.gamericefishpro.space.th.a aVar) {
        Object objDelayShowUntilAvailable = delayShowUntilAvailable(activity, aVar);
        return objDelayShowUntilAvailable == com.gamericefishpro.space.uh.a.d ? objDelayShowUntilAvailable : Unit.a;
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.currentActivity + ", pageWidth=" + this.pageWidth + ", pageHeight=" + this.pageHeight + ", displayDuration=" + this.displayDuration + ", hasBackground=" + this.hasBackground + ", shouldDismissWhenActive=" + this.shouldDismissWhenActive + ", isDragging=" + this.isDragging + ", disableDragDismiss=" + this.disableDragDismiss + ", displayLocation=" + this.displayPosition + ", webView=" + this.webView + '}';
    }

    public final Object updateHeight(int i2, com.gamericefishpro.space.th.a aVar) {
        this.pageHeight = i2;
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = a0.D(com.gamericefishpro.space.ui.m.a, new j(i2, null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }
}
