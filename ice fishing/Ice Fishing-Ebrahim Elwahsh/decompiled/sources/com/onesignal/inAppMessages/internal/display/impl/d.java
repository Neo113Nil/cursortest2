package com.onesignal.inAppMessages.internal.display.impl;

import E7.p;
import O7.AbstractC0399y;
import O7.F;
import O7.InterfaceC0397w;
import T7.o;
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
import androidx.cardview.widget.CardView;
import com.onesignal.common.AndroidUtils;
import com.onesignal.inAppMessages.internal.display.impl.a;
import com.onesignal.inAppMessages.internal.display.impl.m;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
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
    private com.onesignal.inAppMessages.internal.display.impl.a draggableRelativeLayout;
    private final boolean hasBackground;
    private final boolean hideGrayOverlay;
    private boolean isDismissTimerSet;
    private boolean isDragging;
    private int marginPxSizeBottom;
    private int marginPxSizeLeft;
    private int marginPxSizeRight;
    private int marginPxSizeTop;
    private final com.onesignal.inAppMessages.internal.d messageContent;
    private com.onesignal.inAppMessages.internal.display.impl.e messageController;
    private int pageHeight;
    private final int pageWidth;
    private RelativeLayout parentRelativeLayout;
    private com.onesignal.inAppMessages.internal.display.impl.h popupWindow;
    private final f popupWindowListener;
    private boolean shouldDismissWhenActive;
    private WebView webView;
    public static final a Companion = new a(null);
    private static final int ACTIVITY_BACKGROUND_COLOR_FULL = Color.parseColor("#BB000000");
    private static final int DRAG_THRESHOLD_PX_SIZE = com.onesignal.common.m.INSTANCE.dpToPx(4);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ com.onesignal.common.threading.e $waiter;

        public b(com.onesignal.common.threading.e eVar) {
            this.$waiter = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.h.e(animation, "animation");
            d.this.cleanupViewsAfterDismiss();
            this.$waiter.wake();
        }
    }

    public static final class c implements Animation.AnimationListener {
        final /* synthetic */ CardView $messageViewCardView;
        final /* synthetic */ d this$0;

        public c(CardView cardView, d dVar) {
            this.$messageViewCardView = cardView;
            this.this$0 = dVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            kotlin.jvm.internal.h.e(animation, "animation");
            if (this.this$0.messageController != null) {
                com.onesignal.inAppMessages.internal.display.impl.e eVar = this.this$0.messageController;
                kotlin.jvm.internal.h.b(eVar);
                eVar.onMessageWasDisplayed();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            kotlin.jvm.internal.h.e(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            kotlin.jvm.internal.h.e(animation, "animation");
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.d$d, reason: collision with other inner class name */
    public static final class C0204d extends AbstractC5219c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0204d(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.delayShowUntilAvailable(null, this);
        }
    }

    public static final class e extends x7.h implements p {
        int label;

        public e(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return d.this.new e(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((e) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        
            if (r6.animateAndDismissLayout(r1, r5) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
        
            if (O7.AbstractC0399y.f(600, r5) == r0) goto L19;
         */
        @Override // x7.AbstractC5217a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                    return v.f40183a;
                }
                com.bumptech.glide.f.r(obj);
            }
            if (!d.this.hasBackground || d.this.parentRelativeLayout == null) {
                d.this.cleanupViewsAfterDismiss();
            } else {
                d dVar = d.this;
                RelativeLayout relativeLayout = dVar.parentRelativeLayout;
                kotlin.jvm.internal.h.b(relativeLayout);
                this.label = 2;
            }
            return v.f40183a;
        }
    }

    public static final class f implements com.onesignal.inAppMessages.internal.display.impl.g {
        public f() {
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.g
        public void onDismiss(Boolean bool) {
            if (kotlin.jvm.internal.h.a(bool, Boolean.TRUE)) {
                return;
            }
            com.onesignal.debug.internal.logging.b.debug$default("PopupWindowListener.onDismiss called by the system.", null, 2, null);
            com.onesignal.inAppMessages.internal.display.impl.e eVar = d.this.messageController;
            if (eVar != null) {
                eVar.onMessageWasDismissed();
            }
        }
    }

    public static final class g implements com.onesignal.inAppMessages.internal.display.impl.b {

        public static final class a extends x7.h implements E7.l {
            int label;
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, InterfaceC5133d interfaceC5133d) {
                super(1, interfaceC5133d);
                this.this$0 = dVar;
            }

            @Override // x7.AbstractC5217a
            public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
                return new a(this.this$0, interfaceC5133d);
            }

            @Override // x7.AbstractC5217a
            public final Object invokeSuspend(Object obj) {
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                int i = this.label;
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    d dVar = this.this$0;
                    this.label = 1;
                    if (dVar.finishAfterDelay(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                return v.f40183a;
            }

            @Override // E7.l
            public final Object invoke(InterfaceC5133d interfaceC5133d) {
                return ((a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
            }
        }

        public g() {
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.b
        public void onDismiss() {
            if (d.this.messageController != null) {
                com.onesignal.inAppMessages.internal.display.impl.e eVar = d.this.messageController;
                kotlin.jvm.internal.h.b(eVar);
                eVar.onMessageWillDismiss();
            }
            com.onesignal.common.threading.c.suspendifyOnIO(new a(d.this, null));
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.b
        public void onDragEnd() {
            d.this.isDragging = false;
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.b
        public void onDragStart() {
            d.this.isDragging = true;
        }
    }

    public static final class h extends x7.h implements p {
        final /* synthetic */ m.c $displayLocation;
        final /* synthetic */ RelativeLayout.LayoutParams $draggableRelativeLayoutParams;
        final /* synthetic */ RelativeLayout.LayoutParams $relativeLayoutParams;
        final /* synthetic */ a.b $webViewLayoutParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, a.b bVar, m.c cVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$relativeLayoutParams = layoutParams;
            this.$draggableRelativeLayoutParams = layoutParams2;
            this.$webViewLayoutParams = bVar;
            this.$displayLocation = cVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return d.this.new h(this.$relativeLayoutParams, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams, this.$displayLocation, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((h) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            v vVar = v.f40183a;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                if (d.this.webView == null) {
                    return vVar;
                }
                WebView webView = d.this.webView;
                kotlin.jvm.internal.h.b(webView);
                webView.setLayoutParams(this.$relativeLayoutParams);
                d dVar = d.this;
                Activity activity = dVar.currentActivity;
                kotlin.jvm.internal.h.b(activity);
                dVar.setUpDraggableLayout(activity, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams);
                d dVar2 = d.this;
                Activity activity2 = dVar2.currentActivity;
                kotlin.jvm.internal.h.b(activity2);
                dVar2.setUpParentRelativeLayout(activity2);
                d dVar3 = d.this;
                RelativeLayout relativeLayout = dVar3.parentRelativeLayout;
                kotlin.jvm.internal.h.b(relativeLayout);
                dVar3.createPopupWindow(relativeLayout);
                if (d.this.messageController != null) {
                    d dVar4 = d.this;
                    m.c cVar = this.$displayLocation;
                    com.onesignal.inAppMessages.internal.display.impl.a aVar = dVar4.draggableRelativeLayout;
                    kotlin.jvm.internal.h.b(aVar);
                    RelativeLayout relativeLayout2 = d.this.parentRelativeLayout;
                    kotlin.jvm.internal.h.b(relativeLayout2);
                    dVar4.animateInAppMessage(cVar, aVar, relativeLayout2);
                }
                d dVar5 = d.this;
                this.label = 1;
                if (dVar5.startDismissTimerIfNeeded(this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return vVar;
        }
    }

    public static final class i extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public i(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.startDismissTimerIfNeeded(this);
        }
    }

    public static final class j extends x7.h implements p {
        final /* synthetic */ int $pageHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$pageHeight = i;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return d.this.new j(this.$pageHeight, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((j) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            WebView webView = d.this.webView;
            v vVar = v.f40183a;
            if (webView == null) {
                com.onesignal.debug.internal.logging.b.warn$default("WebView height update skipped, new height will be used once it is displayed.", null, 2, null);
                return vVar;
            }
            WebView webView2 = d.this.webView;
            kotlin.jvm.internal.h.b(webView2);
            ViewGroup.LayoutParams layoutParams = webView2.getLayoutParams();
            if (layoutParams == null) {
                com.onesignal.debug.internal.logging.b.warn$default("WebView height update skipped because of null layoutParams, new height will be used once it is displayed.", null, 2, null);
                return vVar;
            }
            layoutParams.height = this.$pageHeight;
            WebView webView3 = d.this.webView;
            kotlin.jvm.internal.h.b(webView3);
            webView3.setLayoutParams(layoutParams);
            if (d.this.draggableRelativeLayout != null) {
                com.onesignal.inAppMessages.internal.display.impl.a aVar = d.this.draggableRelativeLayout;
                kotlin.jvm.internal.h.b(aVar);
                d dVar = d.this;
                aVar.setParams(dVar.createDraggableLayoutParams(this.$pageHeight, dVar.getDisplayPosition(), d.this.disableDragDismiss));
            }
            return vVar;
        }
    }

    public d(WebView webView, com.onesignal.inAppMessages.internal.d messageContent, boolean z8, boolean z9) {
        double doubleValue;
        kotlin.jvm.internal.h.e(messageContent, "messageContent");
        this.webView = webView;
        this.messageContent = messageContent;
        this.disableDragDismiss = z8;
        this.hideGrayOverlay = z9;
        this.pageWidth = -1;
        this.pageHeight = messageContent.getPageHeight();
        com.onesignal.common.m mVar = com.onesignal.common.m.INSTANCE;
        this.marginPxSizeLeft = mVar.dpToPx(24);
        this.marginPxSizeRight = mVar.dpToPx(24);
        this.marginPxSizeTop = mVar.dpToPx(24);
        this.marginPxSizeBottom = mVar.dpToPx(24);
        m.c displayLocation = messageContent.getDisplayLocation();
        kotlin.jvm.internal.h.b(displayLocation);
        this.displayPosition = displayLocation;
        if (messageContent.getDisplayDuration() == null) {
            doubleValue = 0.0d;
        } else {
            Double displayDuration = messageContent.getDisplayDuration();
            kotlin.jvm.internal.h.b(displayDuration);
            doubleValue = displayDuration.doubleValue();
        }
        this.displayDuration = doubleValue;
        this.hasBackground = !displayLocation.isBanner();
        this.popupWindowListener = new f();
        setMarginsFromContent(messageContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateAndDismissLayout(View view, InterfaceC5133d interfaceC5133d) {
        com.onesignal.common.threading.e eVar = new com.onesignal.common.threading.e();
        animateBackgroundColor(view, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, getOverlayColor(), 0, new b(eVar)).start();
        Object waitForWake = eVar.waitForWake(interfaceC5133d);
        return waitForWake == EnumC5179a.f41704n ? waitForWake : v.f40183a;
    }

    private final ValueAnimator animateBackgroundColor(View view, int i4, int i9, int i10, Animator.AnimatorListener animatorListener) {
        return com.onesignal.inAppMessages.internal.display.impl.j.INSTANCE.animateViewColor(view, i4, i9, i10, animatorListener);
    }

    private final void animateBottom(View view, int i4, Animation.AnimationListener animationListener) {
        com.onesignal.inAppMessages.internal.display.impl.j.INSTANCE.animateViewByTranslation(view, i4 + this.marginPxSizeBottom, 0.0f, 1000, new k(0.1d, 8.0d), animationListener).start();
    }

    private final void animateCenter(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation animateViewSmallToLarge = com.onesignal.inAppMessages.internal.display.impl.j.INSTANCE.animateViewSmallToLarge(view, 1000, new k(0.1d, 8.0d), animationListener);
        ValueAnimator animateBackgroundColor = animateBackgroundColor(view2, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, 0, getOverlayColor(), animatorListener);
        animateViewSmallToLarge.start();
        animateBackgroundColor.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateInAppMessage(m.c cVar, View view, View view2) {
        kotlin.jvm.internal.h.b(view);
        CardView cardView = (CardView) view.findViewWithTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        kotlin.jvm.internal.h.b(cardView);
        Animation.AnimationListener createAnimationListener = createAnimationListener(cardView);
        int i4 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i4 == 1) {
            WebView webView = this.webView;
            kotlin.jvm.internal.h.b(webView);
            animateTop(cardView, webView.getHeight(), createAnimationListener);
        } else if (i4 == 2) {
            WebView webView2 = this.webView;
            kotlin.jvm.internal.h.b(webView2);
            animateBottom(cardView, webView2.getHeight(), createAnimationListener);
        } else if (i4 == 3 || i4 == 4) {
            animateCenter(view, view2, createAnimationListener, null);
        }
    }

    private final void animateTop(View view, int i4, Animation.AnimationListener animationListener) {
        com.onesignal.inAppMessages.internal.display.impl.j.INSTANCE.animateViewByTranslation(view, (-i4) - this.marginPxSizeTop, 0.0f, 1000, new k(0.1d, 8.0d), animationListener).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanupViewsAfterDismiss() {
        removeAllViews();
        com.onesignal.inAppMessages.internal.display.impl.e eVar = this.messageController;
        if (eVar != null) {
            eVar.onMessageWasDismissed();
        }
    }

    private final Animation.AnimationListener createAnimationListener(CardView cardView) {
        return new c(cardView, this);
    }

    private final CardView createCardView(Context context) {
        CardView cardView = new CardView(context, null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.displayPosition == m.c.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        cardView.setLayoutParams(layoutParams);
        if (getHideDropShadow(context)) {
            cardView.setCardElevation(0.0f);
        } else {
            cardView.setCardElevation(com.onesignal.common.m.INSTANCE.dpToPx(5));
        }
        cardView.setRadius(com.onesignal.common.m.INSTANCE.dpToPx(8));
        cardView.setClipChildren(false);
        cardView.setClipToPadding(false);
        cardView.setPreventCornerOverlap(false);
        cardView.setCardBackgroundColor(0);
        return cardView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.b createDraggableLayoutParams(int i4, m.c cVar, boolean z8) {
        a.b bVar = new a.b();
        bVar.setMaxXPos(this.marginPxSizeRight);
        bVar.setMaxYPos(this.marginPxSizeTop);
        bVar.setDraggingDisabled(z8);
        bVar.setMessageHeight(i4);
        bVar.setHeight(getDisplayYSize());
        int i9 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i9 == 1) {
            bVar.setDragThresholdY(this.marginPxSizeTop - DRAG_THRESHOLD_PX_SIZE);
        } else if (i9 == 2) {
            bVar.setPosY(getDisplayYSize() - i4);
            bVar.setDragThresholdY(this.marginPxSizeBottom + DRAG_THRESHOLD_PX_SIZE);
        } else if (i9 == 3) {
            int displayYSize = (getDisplayYSize() / 2) - (i4 / 2);
            bVar.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize);
            bVar.setMaxYPos(displayYSize);
            bVar.setPosY(displayYSize);
        } else if (i9 == 4) {
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
        int i4 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
        if (i4 == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i4 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i4 != 3 && i4 != 4) {
            return layoutParams;
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPopupWindow(RelativeLayout relativeLayout) {
        boolean z8 = this.hasBackground;
        com.onesignal.inAppMessages.internal.display.impl.h hVar = new com.onesignal.inAppMessages.internal.display.impl.h(relativeLayout, z8 ? -1 : this.pageWidth, z8 ? -1 : -2, false, this.popupWindowListener);
        this.popupWindow = hVar;
        hVar.setBackgroundDrawable(new ColorDrawable(0));
        com.onesignal.inAppMessages.internal.display.impl.h hVar2 = this.popupWindow;
        int i4 = 1;
        if (hVar2 != null) {
            hVar2.setTouchable(true);
        }
        com.onesignal.inAppMessages.internal.display.impl.h hVar3 = this.popupWindow;
        if (hVar3 != null) {
            hVar3.setFocusable(!this.displayPosition.isBanner());
        }
        com.onesignal.inAppMessages.internal.display.impl.h hVar4 = this.popupWindow;
        if (hVar4 != null) {
            hVar4.setClippingEnabled(false);
        }
        if (this.hasBackground) {
            i4 = 0;
        } else {
            int i9 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
            if (i9 == 1) {
                i4 = 49;
            } else if (i9 == 2) {
                i4 = 81;
            } else if (i9 != 3 && i9 != 4) {
                throw new B0.c();
            }
        }
        int i10 = this.messageContent.isFullBleed() ? 1000 : 1003;
        com.onesignal.inAppMessages.internal.display.impl.h hVar5 = this.popupWindow;
        kotlin.jvm.internal.h.b(hVar5);
        U.l.d(hVar5, i10);
        com.onesignal.inAppMessages.internal.display.impl.h hVar6 = this.popupWindow;
        if (hVar6 != null) {
            Activity activity = this.currentActivity;
            kotlin.jvm.internal.h.b(activity);
            hVar6.showAtLocation(activity.getWindow().getDecorView().getRootView(), i4, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayShowUntilAvailable(Activity activity, InterfaceC5133d interfaceC5133d) {
        C0204d c0204d;
        int i4;
        d dVar;
        if (interfaceC5133d instanceof C0204d) {
            c0204d = (C0204d) interfaceC5133d;
            int i9 = c0204d.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0204d.label = i9 - Integer.MIN_VALUE;
                Object obj = c0204d.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = c0204d.label;
                v vVar = v.f40183a;
                if (i4 == 0) {
                    if (i4 == 1) {
                        com.bumptech.glide.f.r(obj);
                        return vVar;
                    }
                    if (i4 != 2) {
                        if (i4 == 3) {
                            com.bumptech.glide.f.r(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    activity = (Activity) c0204d.L$1;
                    dVar = (d) c0204d.L$0;
                    com.bumptech.glide.f.r(obj);
                    c0204d.L$0 = null;
                    c0204d.L$1 = null;
                    c0204d.label = 3;
                    return dVar.delayShowUntilAvailable(activity, c0204d) != enumC5179a ? enumC5179a : vVar;
                }
                com.bumptech.glide.f.r(obj);
                if (AndroidUtils.INSTANCE.isActivityFullyReady(activity) && this.parentRelativeLayout == null) {
                    c0204d.label = 1;
                    if (showInAppMessageView(activity, c0204d) != enumC5179a) {
                        return vVar;
                    }
                } else {
                    c0204d.L$0 = this;
                    c0204d.L$1 = activity;
                    c0204d.label = 2;
                    if (AbstractC0399y.f(200L, c0204d) != enumC5179a) {
                        dVar = this;
                        c0204d.L$0 = null;
                        c0204d.L$1 = null;
                        c0204d.label = 3;
                        if (dVar.delayShowUntilAvailable(activity, c0204d) != enumC5179a) {
                        }
                    }
                }
            }
        }
        c0204d = new C0204d(interfaceC5133d);
        Object obj2 = c0204d.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = c0204d.label;
        v vVar2 = v.f40183a;
        if (i4 == 0) {
        }
    }

    private final void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishAfterDelay(InterfaceC5133d interfaceC5133d) {
        V7.e eVar = F.f2551a;
        Object y6 = AbstractC0399y.y(o.f3162a, new e(null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : v.f40183a;
    }

    private final int getDisplayYSize() {
        com.onesignal.common.m mVar = com.onesignal.common.m.INSTANCE;
        Activity activity = this.currentActivity;
        kotlin.jvm.internal.h.b(activity);
        return mVar.getWindowHeight(activity);
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

    private final void setMarginsFromContent(com.onesignal.inAppMessages.internal.d dVar) {
        this.marginPxSizeTop = dVar.getUseHeightMargin() ? com.onesignal.common.m.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeBottom = dVar.getUseHeightMargin() ? com.onesignal.common.m.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeLeft = dVar.getUseWidthMargin() ? com.onesignal.common.m.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeRight = dVar.getUseWidthMargin() ? com.onesignal.common.m.INSTANCE.dpToPx(24) : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpDraggableLayout(Context context, RelativeLayout.LayoutParams layoutParams, a.b bVar) {
        com.onesignal.inAppMessages.internal.display.impl.a aVar = new com.onesignal.inAppMessages.internal.display.impl.a(context);
        this.draggableRelativeLayout = aVar;
        if (layoutParams != null) {
            aVar.setLayoutParams(layoutParams);
        }
        com.onesignal.inAppMessages.internal.display.impl.a aVar2 = this.draggableRelativeLayout;
        kotlin.jvm.internal.h.b(aVar2);
        aVar2.setParams(bVar);
        com.onesignal.inAppMessages.internal.display.impl.a aVar3 = this.draggableRelativeLayout;
        kotlin.jvm.internal.h.b(aVar3);
        aVar3.setListener(new g());
        WebView webView = this.webView;
        kotlin.jvm.internal.h.b(webView);
        if (webView.getParent() != null) {
            WebView webView2 = this.webView;
            kotlin.jvm.internal.h.b(webView2);
            ViewParent parent = webView2.getParent();
            kotlin.jvm.internal.h.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeAllViews();
        }
        CardView createCardView = createCardView(context);
        createCardView.setTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        createCardView.addView(this.webView);
        com.onesignal.inAppMessages.internal.display.impl.a aVar4 = this.draggableRelativeLayout;
        kotlin.jvm.internal.h.b(aVar4);
        aVar4.setPadding(this.marginPxSizeLeft, this.marginPxSizeTop, this.marginPxSizeRight, this.marginPxSizeBottom);
        com.onesignal.inAppMessages.internal.display.impl.a aVar5 = this.draggableRelativeLayout;
        kotlin.jvm.internal.h.b(aVar5);
        aVar5.setClipChildren(false);
        com.onesignal.inAppMessages.internal.display.impl.a aVar6 = this.draggableRelativeLayout;
        kotlin.jvm.internal.h.b(aVar6);
        aVar6.setClipToPadding(false);
        com.onesignal.inAppMessages.internal.display.impl.a aVar7 = this.draggableRelativeLayout;
        kotlin.jvm.internal.h.b(aVar7);
        aVar7.addView(createCardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpParentRelativeLayout(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.parentRelativeLayout = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout relativeLayout2 = this.parentRelativeLayout;
        kotlin.jvm.internal.h.b(relativeLayout2);
        relativeLayout2.setClipChildren(false);
        RelativeLayout relativeLayout3 = this.parentRelativeLayout;
        kotlin.jvm.internal.h.b(relativeLayout3);
        relativeLayout3.setClipToPadding(false);
        RelativeLayout relativeLayout4 = this.parentRelativeLayout;
        kotlin.jvm.internal.h.b(relativeLayout4);
        relativeLayout4.addView(this.draggableRelativeLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showDraggableView(m.c cVar, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, a.b bVar, InterfaceC5133d interfaceC5133d) {
        V7.e eVar = F.f2551a;
        Object y6 = AbstractC0399y.y(o.f3162a, new h(layoutParams, layoutParams2, bVar, cVar, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : v.f40183a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startDismissTimerIfNeeded(InterfaceC5133d interfaceC5133d) {
        i iVar;
        int i4;
        d dVar;
        d dVar2;
        if (interfaceC5133d instanceof i) {
            iVar = (i) interfaceC5133d;
            int i9 = iVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                iVar.label = i9 - Integer.MIN_VALUE;
                Object obj = iVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = iVar.label;
                v vVar = v.f40183a;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    double d2 = this.displayDuration;
                    if (d2 > 0.0d && !this.isDismissTimerSet) {
                        this.isDismissTimerSet = true;
                        iVar.L$0 = this;
                        iVar.label = 1;
                        if (AbstractC0399y.f(((long) d2) * 1000, iVar) != enumC5179a) {
                            dVar = this;
                        }
                        return enumC5179a;
                    }
                    return vVar;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar2 = (d) iVar.L$0;
                    com.bumptech.glide.f.r(obj);
                    dVar2.isDismissTimerSet = false;
                    return vVar;
                }
                dVar = (d) iVar.L$0;
                com.bumptech.glide.f.r(obj);
                if (!dVar.cancelDismissTimer) {
                    dVar.cancelDismissTimer = false;
                    return vVar;
                }
                com.onesignal.inAppMessages.internal.display.impl.e eVar = dVar.messageController;
                if (eVar != null) {
                    kotlin.jvm.internal.h.b(eVar);
                    eVar.onMessageWillDismiss();
                }
                if (dVar.currentActivity == null) {
                    dVar.shouldDismissWhenActive = true;
                    return vVar;
                }
                iVar.L$0 = dVar;
                iVar.label = 2;
                if (dVar.dismissAndAwaitNextMessage(iVar) != enumC5179a) {
                    dVar2 = dVar;
                    dVar2.isDismissTimerSet = false;
                    return vVar;
                }
                return enumC5179a;
            }
        }
        iVar = new i(interfaceC5133d);
        Object obj2 = iVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = iVar.label;
        v vVar2 = v.f40183a;
        if (i4 != 0) {
        }
        if (!dVar.cancelDismissTimer) {
        }
    }

    public final Object checkIfShouldDismiss(InterfaceC5133d interfaceC5133d) {
        boolean z8 = this.shouldDismissWhenActive;
        v vVar = v.f40183a;
        if (z8) {
            this.shouldDismissWhenActive = false;
            Object finishAfterDelay = finishAfterDelay(interfaceC5133d);
            if (finishAfterDelay == EnumC5179a.f41704n) {
                return finishAfterDelay;
            }
        }
        return vVar;
    }

    public final Object dismissAndAwaitNextMessage(InterfaceC5133d interfaceC5133d) {
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.draggableRelativeLayout;
        v vVar = v.f40183a;
        if (aVar == null) {
            com.onesignal.debug.internal.logging.b.info$default("No host presenter to trigger dismiss animation, counting as dismissed already", null, 2, null);
            dereferenceViews();
            return vVar;
        }
        kotlin.jvm.internal.h.b(aVar);
        aVar.dismiss();
        Object finishAfterDelay = finishAfterDelay(interfaceC5133d);
        return finishAfterDelay == EnumC5179a.f41704n ? finishAfterDelay : vVar;
    }

    public final m.c getDisplayPosition() {
        return this.displayPosition;
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    public final void removeAllViews() {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessageView.removeAllViews()", null, 2, null);
        com.onesignal.inAppMessages.internal.display.impl.h hVar = this.popupWindow;
        if (hVar != null) {
            hVar.setWasDismissedManually(Boolean.TRUE);
        }
        if (this.isDismissTimerSet) {
            this.cancelDismissTimer = true;
        }
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.draggableRelativeLayout;
        if (aVar != null) {
            aVar.removeAllViews();
        }
        com.onesignal.inAppMessages.internal.display.impl.h hVar2 = this.popupWindow;
        if (hVar2 != null) {
            hVar2.dismiss();
        }
        dereferenceViews();
    }

    public final void setMessageController(com.onesignal.inAppMessages.internal.display.impl.e eVar) {
        this.messageController = eVar;
    }

    public final void setWebView(WebView webView) {
        kotlin.jvm.internal.h.e(webView, "webView");
        this.webView = webView;
        webView.setBackgroundColor(0);
    }

    public final Object showInAppMessageView(Activity activity, InterfaceC5133d interfaceC5133d) {
        this.currentActivity = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.pageHeight);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams createParentRelativeLayoutParams = this.hasBackground ? createParentRelativeLayoutParams() : null;
        m.c cVar = this.displayPosition;
        Object showDraggableView = showDraggableView(cVar, layoutParams, createParentRelativeLayoutParams, createDraggableLayoutParams(this.pageHeight, cVar, this.disableDragDismiss), interfaceC5133d);
        return showDraggableView == EnumC5179a.f41704n ? showDraggableView : v.f40183a;
    }

    public final Object showView(Activity activity, InterfaceC5133d interfaceC5133d) {
        Object delayShowUntilAvailable = delayShowUntilAvailable(activity, interfaceC5133d);
        return delayShowUntilAvailable == EnumC5179a.f41704n ? delayShowUntilAvailable : v.f40183a;
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.currentActivity + ", pageWidth=" + this.pageWidth + ", pageHeight=" + this.pageHeight + ", displayDuration=" + this.displayDuration + ", hasBackground=" + this.hasBackground + ", shouldDismissWhenActive=" + this.shouldDismissWhenActive + ", isDragging=" + this.isDragging + ", disableDragDismiss=" + this.disableDragDismiss + ", displayLocation=" + this.displayPosition + ", webView=" + this.webView + '}';
    }

    public final Object updateHeight(int i4, InterfaceC5133d interfaceC5133d) {
        this.pageHeight = i4;
        V7.e eVar = F.f2551a;
        Object y6 = AbstractC0399y.y(o.f3162a, new j(i4, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : v.f40183a;
    }
}
