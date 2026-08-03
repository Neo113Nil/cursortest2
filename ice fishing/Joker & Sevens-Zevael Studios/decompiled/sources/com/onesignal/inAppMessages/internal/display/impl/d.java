package com.onesignal.inAppMessages.internal.display.impl;

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
import com.onesignal.common.AndroidUtils;
import com.onesignal.inAppMessages.internal.display.impl.a;
import com.onesignal.inAppMessages.internal.display.impl.n;
import yc.a0;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
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
    private final n.c displayPosition;
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
    private static final int DRAG_THRESHOLD_PX_SIZE = com.onesignal.common.n.INSTANCE.dpToPx(4);

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ com.onesignal.common.threading.c $waiter;

        public b(com.onesignal.common.threading.c cVar) {
            this.$waiter = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            pc.j.e(animator, "animation");
            d.this.cleanupViewsAfterDismiss();
            this.$waiter.wake();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c implements Animation.AnimationListener {
        final /* synthetic */ r.a $messageViewCardView;
        final /* synthetic */ d this$0;

        public c(r.a aVar, d dVar) {
            this.$messageViewCardView = aVar;
            this.this$0 = dVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            pc.j.e(animation, "animation");
            if (this.this$0.messageController != null) {
                com.onesignal.inAppMessages.internal.display.impl.e eVar = this.this$0.messageController;
                pc.j.b(eVar);
                eVar.onMessageWasDisplayed();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            pc.j.e(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            pc.j.e(animation, "animation");
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.d$d, reason: collision with other inner class name */
    public static final class C0027d extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0027d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.delayShowUntilAvailable(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends hc.j implements oc.e {
        int label;

        public e(fc.d dVar) {
            super(2, dVar);
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return d.this.new e(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        
            if (r7.animateAndDismissLayout(r0, r6) == r3) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
        
            if (yc.a0.f(600, r6) == r3) goto L19;
         */
        @Override // hc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            gc.a aVar = gc.a.f2559g;
            if (i10 == 0) {
                v6.a.W(obj);
                this.label = 1;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return ac.o.f277a;
                }
                v6.a.W(obj);
            }
            if (!d.this.hasBackground || d.this.parentRelativeLayout == null) {
                d.this.cleanupViewsAfterDismiss();
            } else {
                d dVar = d.this;
                RelativeLayout relativeLayout = dVar.parentRelativeLayout;
                pc.j.b(relativeLayout);
                this.label = 2;
            }
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((e) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f implements com.onesignal.inAppMessages.internal.display.impl.g {
        public f() {
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.g
        public void onDismiss(Boolean bool) {
            if (pc.j.a(bool, Boolean.TRUE)) {
                return;
            }
            com.onesignal.debug.internal.logging.b.debug$default("PopupWindowListener.onDismiss called by the system.", null, 2, null);
            com.onesignal.inAppMessages.internal.display.impl.e eVar = d.this.messageController;
            if (eVar != null) {
                eVar.onMessageWasDismissed();
            }
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g implements com.onesignal.inAppMessages.internal.display.impl.b {

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends hc.j implements oc.c {
            int label;
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, fc.d dVar2) {
                super(1, dVar2);
                this.this$0 = dVar;
            }

            @Override // hc.a
            public final fc.d create(fc.d dVar) {
                return new a(this.this$0, dVar);
            }

            @Override // oc.c
            public final Object invoke(fc.d dVar) {
                return ((a) create(dVar)).invokeSuspend(ac.o.f277a);
            }

            @Override // hc.a
            public final Object invokeSuspend(Object obj) {
                int i10 = this.label;
                if (i10 == 0) {
                    v6.a.W(obj);
                    d dVar = this.this$0;
                    this.label = 1;
                    Object finishAfterDelay = dVar.finishAfterDelay(this);
                    gc.a aVar = gc.a.f2559g;
                    if (finishAfterDelay == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            }
        }

        public g() {
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.b
        public void onDismiss() {
            if (d.this.messageController != null) {
                com.onesignal.inAppMessages.internal.display.impl.e eVar = d.this.messageController;
                pc.j.b(eVar);
                eVar.onMessageWillDismiss();
            }
            com.onesignal.common.threading.b.suspendifyOnThread$default(0, new a(d.this, null), 1, null);
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

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class h extends hc.j implements oc.e {
        final /* synthetic */ n.c $displayLocation;
        final /* synthetic */ RelativeLayout.LayoutParams $draggableRelativeLayoutParams;
        final /* synthetic */ RelativeLayout.LayoutParams $relativeLayoutParams;
        final /* synthetic */ a.b $webViewLayoutParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, a.b bVar, n.c cVar, fc.d dVar) {
            super(2, dVar);
            this.$relativeLayoutParams = layoutParams;
            this.$draggableRelativeLayoutParams = layoutParams2;
            this.$webViewLayoutParams = bVar;
            this.$displayLocation = cVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return d.this.new h(this.$relativeLayoutParams, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams, this.$displayLocation, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            ac.o oVar = ac.o.f277a;
            if (i10 == 0) {
                v6.a.W(obj);
                if (d.this.webView == null) {
                    return oVar;
                }
                WebView webView = d.this.webView;
                pc.j.b(webView);
                webView.setLayoutParams(this.$relativeLayoutParams);
                d dVar = d.this;
                Activity activity = dVar.currentActivity;
                pc.j.b(activity);
                dVar.setUpDraggableLayout(activity, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams);
                d dVar2 = d.this;
                Activity activity2 = dVar2.currentActivity;
                pc.j.b(activity2);
                dVar2.setUpParentRelativeLayout(activity2);
                d dVar3 = d.this;
                RelativeLayout relativeLayout = dVar3.parentRelativeLayout;
                pc.j.b(relativeLayout);
                dVar3.createPopupWindow(relativeLayout);
                if (d.this.messageController != null) {
                    d dVar4 = d.this;
                    n.c cVar = this.$displayLocation;
                    com.onesignal.inAppMessages.internal.display.impl.a aVar = dVar4.draggableRelativeLayout;
                    pc.j.b(aVar);
                    RelativeLayout relativeLayout2 = d.this.parentRelativeLayout;
                    pc.j.b(relativeLayout2);
                    dVar4.animateInAppMessage(cVar, aVar, relativeLayout2);
                }
                d dVar5 = d.this;
                this.label = 1;
                Object startDismissTimerIfNeeded = dVar5.startDismissTimerIfNeeded(this);
                gc.a aVar2 = gc.a.f2559g;
                if (startDismissTimerIfNeeded == aVar2) {
                    return aVar2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return oVar;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((h) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class i extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public i(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.startDismissTimerIfNeeded(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class j extends hc.j implements oc.e {
        final /* synthetic */ int $pageHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i10, fc.d dVar) {
            super(2, dVar);
            this.$pageHeight = i10;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return d.this.new j(this.$pageHeight, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            WebView webView = d.this.webView;
            ac.o oVar = ac.o.f277a;
            if (webView == null) {
                com.onesignal.debug.internal.logging.b.warn$default("WebView height update skipped, new height will be used once it is displayed.", null, 2, null);
                return oVar;
            }
            WebView webView2 = d.this.webView;
            pc.j.b(webView2);
            ViewGroup.LayoutParams layoutParams = webView2.getLayoutParams();
            if (layoutParams == null) {
                com.onesignal.debug.internal.logging.b.warn$default("WebView height update skipped because of null layoutParams, new height will be used once it is displayed.", null, 2, null);
                return oVar;
            }
            layoutParams.height = this.$pageHeight;
            WebView webView3 = d.this.webView;
            pc.j.b(webView3);
            webView3.setLayoutParams(layoutParams);
            if (d.this.draggableRelativeLayout != null) {
                com.onesignal.inAppMessages.internal.display.impl.a aVar = d.this.draggableRelativeLayout;
                pc.j.b(aVar);
                d dVar = d.this;
                aVar.setParams(dVar.createDraggableLayoutParams(this.$pageHeight, dVar.getDisplayPosition(), d.this.disableDragDismiss));
            }
            return oVar;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((j) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    public d(WebView webView, com.onesignal.inAppMessages.internal.d dVar, boolean z10, boolean z11) {
        double doubleValue;
        pc.j.e(dVar, "messageContent");
        this.webView = webView;
        this.messageContent = dVar;
        this.disableDragDismiss = z10;
        this.hideGrayOverlay = z11;
        this.pageWidth = -1;
        this.pageHeight = dVar.getPageHeight();
        com.onesignal.common.n nVar = com.onesignal.common.n.INSTANCE;
        this.marginPxSizeLeft = nVar.dpToPx(24);
        this.marginPxSizeRight = nVar.dpToPx(24);
        this.marginPxSizeTop = nVar.dpToPx(24);
        this.marginPxSizeBottom = nVar.dpToPx(24);
        n.c displayLocation = dVar.getDisplayLocation();
        pc.j.b(displayLocation);
        this.displayPosition = displayLocation;
        if (dVar.getDisplayDuration() == null) {
            doubleValue = 0.0d;
        } else {
            Double displayDuration = dVar.getDisplayDuration();
            pc.j.b(displayDuration);
            doubleValue = displayDuration.doubleValue();
        }
        this.displayDuration = doubleValue;
        this.hasBackground = !displayLocation.isBanner();
        this.popupWindowListener = new f();
        setMarginsFromContent(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateAndDismissLayout(View view, fc.d dVar) {
        com.onesignal.common.threading.c cVar = new com.onesignal.common.threading.c();
        animateBackgroundColor(view, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, getOverlayColor(), 0, new b(cVar)).start();
        Object waitForWake = cVar.waitForWake(dVar);
        return waitForWake == gc.a.f2559g ? waitForWake : ac.o.f277a;
    }

    private final ValueAnimator animateBackgroundColor(View view, int i10, int i11, int i12, Animator.AnimatorListener animatorListener) {
        return k.INSTANCE.animateViewColor(view, i10, i11, i12, animatorListener);
    }

    private final void animateBottom(View view, int i10, Animation.AnimationListener animationListener) {
        k.INSTANCE.animateViewByTranslation(view, i10 + this.marginPxSizeBottom, 0.0f, 1000, new l(0.1d, 8.0d), animationListener).start();
    }

    private final void animateCenter(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation animateViewSmallToLarge = k.INSTANCE.animateViewSmallToLarge(view, 1000, new l(0.1d, 8.0d), animationListener);
        ValueAnimator animateBackgroundColor = animateBackgroundColor(view2, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, 0, getOverlayColor(), animatorListener);
        animateViewSmallToLarge.start();
        animateBackgroundColor.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateInAppMessage(n.c cVar, View view, View view2) {
        pc.j.b(view);
        r.a aVar = (r.a) view.findViewWithTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        pc.j.d(aVar, "messageViewCardView");
        Animation.AnimationListener createAnimationListener = createAnimationListener(aVar);
        int i10 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i10 == 1) {
            WebView webView = this.webView;
            pc.j.b(webView);
            animateTop(aVar, webView.getHeight(), createAnimationListener);
        } else if (i10 == 2) {
            WebView webView2 = this.webView;
            pc.j.b(webView2);
            animateBottom(aVar, webView2.getHeight(), createAnimationListener);
        } else if (i10 == 3 || i10 == 4) {
            animateCenter(view, view2, createAnimationListener, null);
        }
    }

    private final void animateTop(View view, int i10, Animation.AnimationListener animationListener) {
        k.INSTANCE.animateViewByTranslation(view, (-i10) - this.marginPxSizeTop, 0.0f, 1000, new l(0.1d, 8.0d), animationListener).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanupViewsAfterDismiss() {
        removeAllViews();
        com.onesignal.inAppMessages.internal.display.impl.e eVar = this.messageController;
        if (eVar != null) {
            eVar.onMessageWasDismissed();
        }
    }

    private final Animation.AnimationListener createAnimationListener(r.a aVar) {
        return new c(aVar, this);
    }

    private final r.a createCardView(Context context) {
        r.a aVar = new r.a(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.displayPosition == n.c.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        aVar.setLayoutParams(layoutParams);
        if (getHideDropShadow(context)) {
            aVar.setCardElevation(0.0f);
        } else {
            aVar.setCardElevation(com.onesignal.common.n.INSTANCE.dpToPx(5));
        }
        aVar.setRadius(com.onesignal.common.n.INSTANCE.dpToPx(8));
        aVar.setClipChildren(false);
        aVar.setClipToPadding(false);
        aVar.setPreventCornerOverlap(false);
        aVar.setCardBackgroundColor(0);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.b createDraggableLayoutParams(int i10, n.c cVar, boolean z10) {
        a.b bVar = new a.b();
        bVar.setMaxXPos(this.marginPxSizeRight);
        bVar.setMaxYPos(this.marginPxSizeTop);
        bVar.setDraggingDisabled(z10);
        bVar.setMessageHeight(i10);
        bVar.setHeight(getDisplayYSize());
        int i11 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i11 == 1) {
            bVar.setDragThresholdY(this.marginPxSizeTop - DRAG_THRESHOLD_PX_SIZE);
        } else if (i11 == 2) {
            bVar.setPosY(getDisplayYSize() - i10);
            bVar.setDragThresholdY(this.marginPxSizeBottom + DRAG_THRESHOLD_PX_SIZE);
        } else if (i11 == 3) {
            int displayYSize = (getDisplayYSize() / 2) - (i10 / 2);
            bVar.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize);
            bVar.setMaxYPos(displayYSize);
            bVar.setPosY(displayYSize);
        } else if (i11 == 4) {
            int displayYSize2 = getDisplayYSize() - (this.marginPxSizeBottom + this.marginPxSizeTop);
            bVar.setMessageHeight(displayYSize2);
            int displayYSize3 = (getDisplayYSize() / 2) - (displayYSize2 / 2);
            bVar.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize3);
            bVar.setMaxYPos(displayYSize3);
            bVar.setPosY(displayYSize3);
        }
        bVar.setDragDirection(cVar == n.c.TOP_BANNER ? 0 : 1);
        return bVar;
    }

    private final RelativeLayout.LayoutParams createParentRelativeLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.pageWidth, -1);
        int i10 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
        if (i10 == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i10 != 3 && i10 != 4) {
            return layoutParams;
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPopupWindow(RelativeLayout relativeLayout) {
        boolean z10 = this.hasBackground;
        com.onesignal.inAppMessages.internal.display.impl.h hVar = new com.onesignal.inAppMessages.internal.display.impl.h(relativeLayout, z10 ? -1 : this.pageWidth, z10 ? -1 : -2, false, this.popupWindowListener);
        this.popupWindow = hVar;
        hVar.setBackgroundDrawable(new ColorDrawable(0));
        com.onesignal.inAppMessages.internal.display.impl.h hVar2 = this.popupWindow;
        int i10 = 1;
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
            i10 = 0;
        } else {
            int i11 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
            if (i11 == 1) {
                i10 = 49;
            } else if (i11 == 2) {
                i10 = 81;
            } else if (i11 != 3 && i11 != 4) {
                throw new ac.d();
            }
        }
        int i12 = this.messageContent.isFullBleed() ? 1000 : 1003;
        com.onesignal.inAppMessages.internal.display.impl.h hVar5 = this.popupWindow;
        pc.j.b(hVar5);
        hVar5.setWindowLayoutType(i12);
        com.onesignal.inAppMessages.internal.display.impl.h hVar6 = this.popupWindow;
        if (hVar6 != null) {
            Activity activity = this.currentActivity;
            pc.j.b(activity);
            hVar6.showAtLocation(activity.getWindow().getDecorView().getRootView(), i10, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayShowUntilAvailable(Activity activity, fc.d dVar) {
        C0027d c0027d;
        int i10;
        d dVar2;
        if (dVar instanceof C0027d) {
            c0027d = (C0027d) dVar;
            int i11 = c0027d.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0027d.label = i11 - Integer.MIN_VALUE;
                Object obj = c0027d.result;
                i10 = c0027d.label;
                ac.o oVar = ac.o.f277a;
                gc.a aVar = gc.a.f2559g;
                if (i10 == 0) {
                    if (i10 == 1) {
                        v6.a.W(obj);
                        return oVar;
                    }
                    if (i10 != 2) {
                        if (i10 == 3) {
                            v6.a.W(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    activity = (Activity) c0027d.L$1;
                    dVar2 = (d) c0027d.L$0;
                    v6.a.W(obj);
                    c0027d.L$0 = null;
                    c0027d.L$1 = null;
                    c0027d.label = 3;
                    return dVar2.delayShowUntilAvailable(activity, c0027d) != aVar ? aVar : oVar;
                }
                v6.a.W(obj);
                if (AndroidUtils.INSTANCE.isActivityFullyReady(activity) && this.parentRelativeLayout == null) {
                    c0027d.label = 1;
                    if (showInAppMessageView(activity, c0027d) != aVar) {
                        return oVar;
                    }
                } else {
                    c0027d.L$0 = this;
                    c0027d.L$1 = activity;
                    c0027d.label = 2;
                    if (a0.f(200L, c0027d) != aVar) {
                        dVar2 = this;
                        c0027d.L$0 = null;
                        c0027d.L$1 = null;
                        c0027d.label = 3;
                        if (dVar2.delayShowUntilAvailable(activity, c0027d) != aVar) {
                        }
                    }
                }
            }
        }
        c0027d = new C0027d(dVar);
        Object obj2 = c0027d.result;
        i10 = c0027d.label;
        ac.o oVar2 = ac.o.f277a;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 == 0) {
        }
    }

    private final void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishAfterDelay(fc.d dVar) {
        fd.e eVar = i0.f8859a;
        Object A = a0.A(dd.o.f1880a, new e(null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }

    private final int getDisplayYSize() {
        com.onesignal.common.n nVar = com.onesignal.common.n.INSTANCE;
        Activity activity = this.currentActivity;
        pc.j.b(activity);
        return nVar.getWindowHeight(activity);
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
        this.marginPxSizeTop = dVar.getUseHeightMargin() ? com.onesignal.common.n.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeBottom = dVar.getUseHeightMargin() ? com.onesignal.common.n.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeLeft = dVar.getUseWidthMargin() ? com.onesignal.common.n.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeRight = dVar.getUseWidthMargin() ? com.onesignal.common.n.INSTANCE.dpToPx(24) : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpDraggableLayout(Context context, RelativeLayout.LayoutParams layoutParams, a.b bVar) {
        com.onesignal.inAppMessages.internal.display.impl.a aVar = new com.onesignal.inAppMessages.internal.display.impl.a(context);
        this.draggableRelativeLayout = aVar;
        if (layoutParams != null) {
            aVar.setLayoutParams(layoutParams);
        }
        com.onesignal.inAppMessages.internal.display.impl.a aVar2 = this.draggableRelativeLayout;
        pc.j.b(aVar2);
        aVar2.setParams(bVar);
        com.onesignal.inAppMessages.internal.display.impl.a aVar3 = this.draggableRelativeLayout;
        pc.j.b(aVar3);
        aVar3.setListener(new g());
        WebView webView = this.webView;
        pc.j.b(webView);
        if (webView.getParent() != null) {
            WebView webView2 = this.webView;
            pc.j.b(webView2);
            ViewParent parent = webView2.getParent();
            pc.j.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeAllViews();
        }
        r.a createCardView = createCardView(context);
        createCardView.setTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        createCardView.addView(this.webView);
        com.onesignal.inAppMessages.internal.display.impl.a aVar4 = this.draggableRelativeLayout;
        pc.j.b(aVar4);
        aVar4.setPadding(this.marginPxSizeLeft, this.marginPxSizeTop, this.marginPxSizeRight, this.marginPxSizeBottom);
        com.onesignal.inAppMessages.internal.display.impl.a aVar5 = this.draggableRelativeLayout;
        pc.j.b(aVar5);
        aVar5.setClipChildren(false);
        com.onesignal.inAppMessages.internal.display.impl.a aVar6 = this.draggableRelativeLayout;
        pc.j.b(aVar6);
        aVar6.setClipToPadding(false);
        com.onesignal.inAppMessages.internal.display.impl.a aVar7 = this.draggableRelativeLayout;
        pc.j.b(aVar7);
        aVar7.addView(createCardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpParentRelativeLayout(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.parentRelativeLayout = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout relativeLayout2 = this.parentRelativeLayout;
        pc.j.b(relativeLayout2);
        relativeLayout2.setClipChildren(false);
        RelativeLayout relativeLayout3 = this.parentRelativeLayout;
        pc.j.b(relativeLayout3);
        relativeLayout3.setClipToPadding(false);
        RelativeLayout relativeLayout4 = this.parentRelativeLayout;
        pc.j.b(relativeLayout4);
        relativeLayout4.addView(this.draggableRelativeLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showDraggableView(n.c cVar, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, a.b bVar, fc.d dVar) {
        fd.e eVar = i0.f8859a;
        Object A = a0.A(dd.o.f1880a, new h(layoutParams, layoutParams2, bVar, cVar, null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startDismissTimerIfNeeded(fc.d dVar) {
        i iVar;
        int i10;
        d dVar2;
        d dVar3;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i11 = iVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.label = i11 - Integer.MIN_VALUE;
                Object obj = iVar.result;
                i10 = iVar.label;
                ac.o oVar = ac.o.f277a;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    double d10 = this.displayDuration;
                    if (d10 > 0.0d && !this.isDismissTimerSet) {
                        this.isDismissTimerSet = true;
                        iVar.L$0 = this;
                        iVar.label = 1;
                        if (a0.f(((long) d10) * 1000, iVar) != aVar) {
                            dVar2 = this;
                        }
                        return aVar;
                    }
                    return oVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar3 = (d) iVar.L$0;
                    v6.a.W(obj);
                    dVar3.isDismissTimerSet = false;
                    return oVar;
                }
                dVar2 = (d) iVar.L$0;
                v6.a.W(obj);
                if (!dVar2.cancelDismissTimer) {
                    dVar2.cancelDismissTimer = false;
                    return oVar;
                }
                com.onesignal.inAppMessages.internal.display.impl.e eVar = dVar2.messageController;
                if (eVar != null) {
                    pc.j.b(eVar);
                    eVar.onMessageWillDismiss();
                }
                if (dVar2.currentActivity == null) {
                    dVar2.shouldDismissWhenActive = true;
                    return oVar;
                }
                iVar.L$0 = dVar2;
                iVar.label = 2;
                if (dVar2.dismissAndAwaitNextMessage(iVar) != aVar) {
                    dVar3 = dVar2;
                    dVar3.isDismissTimerSet = false;
                    return oVar;
                }
                return aVar;
            }
        }
        iVar = new i(dVar);
        Object obj2 = iVar.result;
        i10 = iVar.label;
        ac.o oVar2 = ac.o.f277a;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        if (!dVar2.cancelDismissTimer) {
        }
    }

    public final Object checkIfShouldDismiss(fc.d dVar) {
        boolean z10 = this.shouldDismissWhenActive;
        ac.o oVar = ac.o.f277a;
        if (z10) {
            this.shouldDismissWhenActive = false;
            Object finishAfterDelay = finishAfterDelay(dVar);
            if (finishAfterDelay == gc.a.f2559g) {
                return finishAfterDelay;
            }
        }
        return oVar;
    }

    public final Object dismissAndAwaitNextMessage(fc.d dVar) {
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.draggableRelativeLayout;
        ac.o oVar = ac.o.f277a;
        if (aVar == null) {
            com.onesignal.debug.internal.logging.b.error$default("No host presenter to trigger dismiss animation, counting as dismissed already", null, 2, null);
            dereferenceViews();
            return oVar;
        }
        pc.j.b(aVar);
        aVar.dismiss();
        Object finishAfterDelay = finishAfterDelay(dVar);
        return finishAfterDelay == gc.a.f2559g ? finishAfterDelay : oVar;
    }

    public final n.c getDisplayPosition() {
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
        pc.j.e(webView, "webView");
        this.webView = webView;
        webView.setBackgroundColor(0);
    }

    public final Object showInAppMessageView(Activity activity, fc.d dVar) {
        this.currentActivity = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.pageHeight);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams createParentRelativeLayoutParams = this.hasBackground ? createParentRelativeLayoutParams() : null;
        n.c cVar = this.displayPosition;
        Object showDraggableView = showDraggableView(cVar, layoutParams, createParentRelativeLayoutParams, createDraggableLayoutParams(this.pageHeight, cVar, this.disableDragDismiss), dVar);
        return showDraggableView == gc.a.f2559g ? showDraggableView : ac.o.f277a;
    }

    public final Object showView(Activity activity, fc.d dVar) {
        Object delayShowUntilAvailable = delayShowUntilAvailable(activity, dVar);
        return delayShowUntilAvailable == gc.a.f2559g ? delayShowUntilAvailable : ac.o.f277a;
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.currentActivity + ", pageWidth=" + this.pageWidth + ", pageHeight=" + this.pageHeight + ", displayDuration=" + this.displayDuration + ", hasBackground=" + this.hasBackground + ", shouldDismissWhenActive=" + this.shouldDismissWhenActive + ", isDragging=" + this.isDragging + ", disableDragDismiss=" + this.disableDragDismiss + ", displayLocation=" + this.displayPosition + ", webView=" + this.webView + '}';
    }

    public final Object updateHeight(int i10, fc.d dVar) {
        this.pageHeight = i10;
        fd.e eVar = i0.f8859a;
        Object A = a0.A(dd.o.f1880a, new j(i10, null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }
}
