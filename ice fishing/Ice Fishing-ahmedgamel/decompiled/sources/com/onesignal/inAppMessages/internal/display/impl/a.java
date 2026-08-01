package com.onesignal.inAppMessages.internal.display.impl;

import O.X;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class a extends RelativeLayout {
    public static final C0202a Companion = new C0202a(null);
    private static final int EXTRA_PX_DISMISS;
    private static final int MARGIN_PX_SIZE;
    private boolean dismissing;
    private final boolean draggingDisabled;
    private W.e mDragHelper;
    private com.onesignal.inAppMessages.internal.display.impl.b mListener;
    private b params;

    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.a$a, reason: collision with other inner class name */
    public static final class C0202a {
        public /* synthetic */ C0202a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0202a() {
        }
    }

    public static final class b {
        public static final C0203a Companion = new C0203a(null);
        public static final int DRAGGABLE_DIRECTION_DOWN = 1;
        public static final int DRAGGABLE_DIRECTION_UP = 0;
        private int dismissingYPos;
        private int dismissingYVelocity;
        private int dragDirection;
        private int dragThresholdY;
        private boolean draggingDisabled;
        private int height;
        private int maxXPos;
        private int maxYPos;
        private int messageHeight;
        private int offScreenYPos;
        private int posY;

        /* renamed from: com.onesignal.inAppMessages.internal.display.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0203a {
            public /* synthetic */ C0203a(kotlin.jvm.internal.e eVar) {
                this();
            }

            private C0203a() {
            }
        }

        public final int getDismissingYPos() {
            return this.dismissingYPos;
        }

        public final int getDismissingYVelocity() {
            return this.dismissingYVelocity;
        }

        public final int getDragDirection() {
            return this.dragDirection;
        }

        public final int getDragThresholdY() {
            return this.dragThresholdY;
        }

        public final boolean getDraggingDisabled() {
            return this.draggingDisabled;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getMaxXPos() {
            return this.maxXPos;
        }

        public final int getMaxYPos() {
            return this.maxYPos;
        }

        public final int getMessageHeight() {
            return this.messageHeight;
        }

        public final int getOffScreenYPos() {
            return this.offScreenYPos;
        }

        public final int getPosY() {
            return this.posY;
        }

        public final void setDismissingYPos(int i) {
            this.dismissingYPos = i;
        }

        public final void setDismissingYVelocity(int i) {
            this.dismissingYVelocity = i;
        }

        public final void setDragDirection(int i) {
            this.dragDirection = i;
        }

        public final void setDragThresholdY(int i) {
            this.dragThresholdY = i;
        }

        public final void setDraggingDisabled(boolean z3) {
            this.draggingDisabled = z3;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        public final void setMaxXPos(int i) {
            this.maxXPos = i;
        }

        public final void setMaxYPos(int i) {
            this.maxYPos = i;
        }

        public final void setMessageHeight(int i) {
            this.messageHeight = i;
        }

        public final void setOffScreenYPos(int i) {
            this.offScreenYPos = i;
        }

        public final void setPosY(int i) {
            this.posY = i;
        }
    }

    public static final class c extends W.d {
        private int lastYPos;

        public c() {
        }

        @Override // W.d
        public int clampViewPositionHorizontal(View child, int i, int i6) {
            kotlin.jvm.internal.h.e(child, "child");
            b bVar = a.this.params;
            kotlin.jvm.internal.h.b(bVar);
            return bVar.getMaxXPos();
        }

        @Override // W.d
        public int clampViewPositionVertical(View child, int i, int i6) {
            kotlin.jvm.internal.h.e(child, "child");
            b bVar = a.this.params;
            kotlin.jvm.internal.h.b(bVar);
            if (bVar.getDraggingDisabled()) {
                b bVar2 = a.this.params;
                kotlin.jvm.internal.h.b(bVar2);
                return bVar2.getMaxYPos();
            }
            this.lastYPos = i;
            b bVar3 = a.this.params;
            kotlin.jvm.internal.h.b(bVar3);
            if (bVar3.getDragDirection() == 1) {
                b bVar4 = a.this.params;
                kotlin.jvm.internal.h.b(bVar4);
                if (i >= bVar4.getDragThresholdY() && a.this.mListener != null) {
                    com.onesignal.inAppMessages.internal.display.impl.b bVar5 = a.this.mListener;
                    kotlin.jvm.internal.h.b(bVar5);
                    bVar5.onDragStart();
                }
                b bVar6 = a.this.params;
                kotlin.jvm.internal.h.b(bVar6);
                if (i < bVar6.getMaxYPos()) {
                    b bVar7 = a.this.params;
                    kotlin.jvm.internal.h.b(bVar7);
                    return bVar7.getMaxYPos();
                }
            } else {
                b bVar8 = a.this.params;
                kotlin.jvm.internal.h.b(bVar8);
                if (i <= bVar8.getDragThresholdY() && a.this.mListener != null) {
                    com.onesignal.inAppMessages.internal.display.impl.b bVar9 = a.this.mListener;
                    kotlin.jvm.internal.h.b(bVar9);
                    bVar9.onDragStart();
                }
                b bVar10 = a.this.params;
                kotlin.jvm.internal.h.b(bVar10);
                if (i > bVar10.getMaxYPos()) {
                    b bVar11 = a.this.params;
                    kotlin.jvm.internal.h.b(bVar11);
                    return bVar11.getMaxYPos();
                }
            }
            return i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
        
            if (r5 < r4.getDismissingYVelocity()) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
        
            if (r5 > r4.getDismissingYVelocity()) goto L10;
         */
        @Override // W.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onViewReleased(View releasedChild, float f3, float f9) {
            kotlin.jvm.internal.h.e(releasedChild, "releasedChild");
            b bVar = a.this.params;
            kotlin.jvm.internal.h.b(bVar);
            int maxYPos = bVar.getMaxYPos();
            if (!a.this.dismissing) {
                b bVar2 = a.this.params;
                kotlin.jvm.internal.h.b(bVar2);
                if (bVar2.getDragDirection() == 1) {
                    int i = this.lastYPos;
                    b bVar3 = a.this.params;
                    kotlin.jvm.internal.h.b(bVar3);
                    if (i <= bVar3.getDismissingYPos()) {
                        kotlin.jvm.internal.h.b(a.this.params);
                    }
                    b bVar4 = a.this.params;
                    kotlin.jvm.internal.h.b(bVar4);
                    maxYPos = bVar4.getOffScreenYPos();
                    a.this.dismissing = true;
                    if (a.this.mListener != null) {
                        com.onesignal.inAppMessages.internal.display.impl.b bVar5 = a.this.mListener;
                        kotlin.jvm.internal.h.b(bVar5);
                        bVar5.onDismiss();
                    }
                } else {
                    int i6 = this.lastYPos;
                    b bVar6 = a.this.params;
                    kotlin.jvm.internal.h.b(bVar6);
                    if (i6 >= bVar6.getDismissingYPos()) {
                        kotlin.jvm.internal.h.b(a.this.params);
                    }
                    b bVar7 = a.this.params;
                    kotlin.jvm.internal.h.b(bVar7);
                    maxYPos = bVar7.getOffScreenYPos();
                    a.this.dismissing = true;
                    if (a.this.mListener != null) {
                        com.onesignal.inAppMessages.internal.display.impl.b bVar8 = a.this.mListener;
                        kotlin.jvm.internal.h.b(bVar8);
                        bVar8.onDismiss();
                    }
                }
            }
            W.e eVar = a.this.mDragHelper;
            kotlin.jvm.internal.h.b(eVar);
            b bVar9 = a.this.params;
            kotlin.jvm.internal.h.b(bVar9);
            if (eVar.q(bVar9.getMaxXPos(), maxYPos)) {
                a aVar = a.this;
                WeakHashMap weakHashMap = X.f2054a;
                aVar.postInvalidateOnAnimation();
            }
        }

        @Override // W.d
        public boolean tryCaptureView(View child, int i) {
            kotlin.jvm.internal.h.e(child, "child");
            return true;
        }
    }

    static {
        com.onesignal.common.m mVar = com.onesignal.common.m.INSTANCE;
        MARGIN_PX_SIZE = mVar.dpToPx(28);
        EXTRA_PX_DISMISS = mVar.dpToPx(64);
    }

    public a(Context context) {
        super(context);
        setClipChildren(false);
        createDragHelper();
    }

    private final void createDragHelper() {
        W.e eVar = new W.e(getContext(), this, new c());
        eVar.f3380b = (int) (1.0f * eVar.f3380b);
        this.mDragHelper = eVar;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        W.e eVar = this.mDragHelper;
        kotlin.jvm.internal.h.b(eVar);
        if (eVar.g()) {
            WeakHashMap weakHashMap = X.f2054a;
            postInvalidateOnAnimation();
        }
    }

    public final void dismiss() {
        this.dismissing = true;
        W.e eVar = this.mDragHelper;
        kotlin.jvm.internal.h.b(eVar);
        int left = getLeft();
        b bVar = this.params;
        kotlin.jvm.internal.h.b(bVar);
        eVar.s(left, bVar.getOffScreenYPos(), this);
        WeakHashMap weakHashMap = X.f2054a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        com.onesignal.inAppMessages.internal.display.impl.b bVar;
        kotlin.jvm.internal.h.e(event, "event");
        if (this.dismissing) {
            return true;
        }
        int action = event.getAction();
        if ((action == 0 || action == 5) && (bVar = this.mListener) != null) {
            kotlin.jvm.internal.h.b(bVar);
            bVar.onDragEnd();
        }
        W.e eVar = this.mDragHelper;
        kotlin.jvm.internal.h.b(eVar);
        eVar.k(event);
        return false;
    }

    public final void setListener(com.onesignal.inAppMessages.internal.display.impl.b bVar) {
        this.mListener = bVar;
    }

    public final void setParams(b params) {
        kotlin.jvm.internal.h.e(params, "params");
        this.params = params;
        params.setOffScreenYPos(((Resources.getSystem().getDisplayMetrics().heightPixels - params.getMessageHeight()) - params.getPosY()) + params.getPosY() + params.getMessageHeight() + EXTRA_PX_DISMISS);
        params.setDismissingYVelocity(com.onesignal.common.m.INSTANCE.dpToPx(3000));
        if (params.getDragDirection() != 0) {
            params.setDismissingYPos((params.getMaxYPos() * 2) + (params.getMessageHeight() / 3));
        } else {
            params.setOffScreenYPos((-params.getMessageHeight()) - MARGIN_PX_SIZE);
            params.setDismissingYVelocity(-params.getDismissingYVelocity());
            params.setDismissingYPos(params.getOffScreenYPos() / 3);
        }
    }
}
