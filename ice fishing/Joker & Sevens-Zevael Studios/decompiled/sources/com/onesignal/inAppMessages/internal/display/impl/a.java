package com.onesignal.inAppMessages.internal.display.impl;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import android.widget.RelativeLayout;
import h3.w;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends RelativeLayout {
    public static final C0024a Companion = new C0024a(null);
    private static final int EXTRA_PX_DISMISS;
    private static final int MARGIN_PX_SIZE;
    private boolean dismissing;
    private final boolean draggingDisabled;
    private p3.c mDragHelper;
    private com.onesignal.inAppMessages.internal.display.impl.b mListener;
    private b params;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.a$a, reason: collision with other inner class name */
    public static final class C0024a {
        public /* synthetic */ C0024a(pc.f fVar) {
            this();
        }

        private C0024a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b {
        public static final C0025a Companion = new C0025a(null);
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

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.inAppMessages.internal.display.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0025a {
            public /* synthetic */ C0025a(pc.f fVar) {
                this();
            }

            private C0025a() {
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

        public final void setDismissingYPos(int i10) {
            this.dismissingYPos = i10;
        }

        public final void setDismissingYVelocity(int i10) {
            this.dismissingYVelocity = i10;
        }

        public final void setDragDirection(int i10) {
            this.dragDirection = i10;
        }

        public final void setDragThresholdY(int i10) {
            this.dragThresholdY = i10;
        }

        public final void setDraggingDisabled(boolean z10) {
            this.draggingDisabled = z10;
        }

        public final void setHeight(int i10) {
            this.height = i10;
        }

        public final void setMaxXPos(int i10) {
            this.maxXPos = i10;
        }

        public final void setMaxYPos(int i10) {
            this.maxYPos = i10;
        }

        public final void setMessageHeight(int i10) {
            this.messageHeight = i10;
        }

        public final void setOffScreenYPos(int i10) {
            this.offScreenYPos = i10;
        }

        public final void setPosY(int i10) {
            this.posY = i10;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends p3.b {
        private int lastYPos;

        public c() {
        }

        public int clampViewPositionHorizontal(View view, int i10, int i11) {
            pc.j.e(view, "child");
            b bVar = a.this.params;
            pc.j.b(bVar);
            return bVar.getMaxXPos();
        }

        public int clampViewPositionVertical(View view, int i10, int i11) {
            pc.j.e(view, "child");
            b bVar = a.this.params;
            pc.j.b(bVar);
            if (bVar.getDraggingDisabled()) {
                b bVar2 = a.this.params;
                pc.j.b(bVar2);
                return bVar2.getMaxYPos();
            }
            this.lastYPos = i10;
            b bVar3 = a.this.params;
            pc.j.b(bVar3);
            if (bVar3.getDragDirection() == 1) {
                b bVar4 = a.this.params;
                pc.j.b(bVar4);
                if (i10 >= bVar4.getDragThresholdY() && a.this.mListener != null) {
                    com.onesignal.inAppMessages.internal.display.impl.b bVar5 = a.this.mListener;
                    pc.j.b(bVar5);
                    bVar5.onDragStart();
                }
                b bVar6 = a.this.params;
                pc.j.b(bVar6);
                if (i10 < bVar6.getMaxYPos()) {
                    b bVar7 = a.this.params;
                    pc.j.b(bVar7);
                    return bVar7.getMaxYPos();
                }
            } else {
                b bVar8 = a.this.params;
                pc.j.b(bVar8);
                if (i10 <= bVar8.getDragThresholdY() && a.this.mListener != null) {
                    com.onesignal.inAppMessages.internal.display.impl.b bVar9 = a.this.mListener;
                    pc.j.b(bVar9);
                    bVar9.onDragStart();
                }
                b bVar10 = a.this.params;
                pc.j.b(bVar10);
                if (i10 > bVar10.getMaxYPos()) {
                    b bVar11 = a.this.params;
                    pc.j.b(bVar11);
                    return bVar11.getMaxYPos();
                }
            }
            return i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
        
            if (r6 < r5.getDismissingYVelocity()) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
        
            if (r6 > r5.getDismissingYVelocity()) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onViewReleased(View view, float f10, float f11) {
            pc.j.e(view, "releasedChild");
            b bVar = a.this.params;
            pc.j.b(bVar);
            int maxYPos = bVar.getMaxYPos();
            if (!a.this.dismissing) {
                b bVar2 = a.this.params;
                pc.j.b(bVar2);
                if (bVar2.getDragDirection() == 1) {
                    int i10 = this.lastYPos;
                    b bVar3 = a.this.params;
                    pc.j.b(bVar3);
                    if (i10 <= bVar3.getDismissingYPos()) {
                        pc.j.b(a.this.params);
                    }
                    b bVar4 = a.this.params;
                    pc.j.b(bVar4);
                    maxYPos = bVar4.getOffScreenYPos();
                    a.this.dismissing = true;
                    if (a.this.mListener != null) {
                        com.onesignal.inAppMessages.internal.display.impl.b bVar5 = a.this.mListener;
                        pc.j.b(bVar5);
                        bVar5.onDismiss();
                    }
                } else {
                    int i11 = this.lastYPos;
                    b bVar6 = a.this.params;
                    pc.j.b(bVar6);
                    if (i11 >= bVar6.getDismissingYPos()) {
                        pc.j.b(a.this.params);
                    }
                    b bVar7 = a.this.params;
                    pc.j.b(bVar7);
                    maxYPos = bVar7.getOffScreenYPos();
                    a.this.dismissing = true;
                    if (a.this.mListener != null) {
                        com.onesignal.inAppMessages.internal.display.impl.b bVar8 = a.this.mListener;
                        pc.j.b(bVar8);
                        bVar8.onDismiss();
                    }
                }
            }
            p3.c cVar = a.this.mDragHelper;
            pc.j.b(cVar);
            b bVar9 = a.this.params;
            pc.j.b(bVar9);
            int maxXPos = bVar9.getMaxXPos();
            if (!cVar.f5447s) {
                throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
            }
            if (cVar.d(maxXPos, maxYPos, (int) cVar.f5440l.getXVelocity(cVar.f5431c), (int) cVar.f5440l.getYVelocity(cVar.f5431c))) {
                a aVar = a.this;
                Field field = w.f2829a;
                aVar.postInvalidateOnAnimation();
            }
        }

        public boolean tryCaptureView(View view, int i10) {
            pc.j.e(view, "child");
            return true;
        }
    }

    static {
        com.onesignal.common.n nVar = com.onesignal.common.n.INSTANCE;
        MARGIN_PX_SIZE = nVar.dpToPx(28);
        EXTRA_PX_DISMISS = nVar.dpToPx(64);
    }

    public a(Context context) {
        super(context);
        setClipChildren(false);
        createDragHelper();
    }

    private final void createDragHelper() {
        p3.c cVar = new p3.c(getContext(), this, new c());
        cVar.f5430b = (int) (1.0f * cVar.f5430b);
        this.mDragHelper = cVar;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        p3.c cVar = this.mDragHelper;
        pc.j.b(cVar);
        OverScroller overScroller = cVar.f5444p;
        if (cVar.f5429a == 2) {
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - cVar.f5446r.getLeft();
            int top = currY - cVar.f5446r.getTop();
            if (left != 0) {
                View view = cVar.f5446r;
                Field field = w.f2829a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = cVar.f5446r;
                Field field2 = w.f2829a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                cVar.f5445q.onViewPositionChanged(cVar.f5446r, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                cVar.f5448t.post(cVar.f5449u);
            }
        }
        if (cVar.f5429a == 2) {
            Field field3 = w.f2829a;
            postInvalidateOnAnimation();
        }
    }

    public final void dismiss() {
        this.dismissing = true;
        p3.c cVar = this.mDragHelper;
        pc.j.b(cVar);
        int left = getLeft();
        b bVar = this.params;
        pc.j.b(bVar);
        int offScreenYPos = bVar.getOffScreenYPos();
        cVar.f5446r = this;
        cVar.f5431c = -1;
        if (!cVar.d(left, offScreenYPos, 0, 0) && cVar.f5429a == 0 && cVar.f5446r != null) {
            cVar.f5446r = null;
        }
        Field field = w.f2829a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x021d, code lost:
    
        if (r10 > (r7 * r7)) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x021f, code lost:
    
        r7 = true;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        com.onesignal.inAppMessages.internal.display.impl.b bVar;
        boolean z10;
        int i10;
        pc.j.e(motionEvent, "event");
        if (this.dismissing) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (bVar = this.mListener) != null) {
            bVar.onDragEnd();
        }
        p3.c cVar = this.mDragHelper;
        pc.j.b(cVar);
        c cVar2 = cVar.f5445q;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cVar.a();
        }
        if (cVar.f5440l == null) {
            cVar.f5440l = VelocityTracker.obtain();
        }
        cVar.f5440l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View c3 = cVar.c((int) x10, (int) y10);
            cVar.g(x10, y10, pointerId);
            cVar.j(c3, pointerId);
            int i11 = cVar.f5436h[pointerId];
            return false;
        }
        if (actionMasked == 1) {
            if (cVar.f5429a == 1) {
                cVar.f();
            }
            cVar.a();
            return false;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (cVar.f5429a == 1) {
                    cVar.f5447s = true;
                    cVar2.onViewReleased(cVar.f5446r, 0.0f, 0.0f);
                    cVar.f5447s = false;
                    if (cVar.f5429a == 1) {
                        cVar.i(0);
                    }
                }
                cVar.a();
                return false;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                cVar.g(x11, y11, pointerId2);
                if (cVar.f5429a == 0) {
                    cVar.j(cVar.c((int) x11, (int) y11), pointerId2);
                    int i12 = cVar.f5436h[pointerId2];
                    return false;
                }
                int i13 = (int) x11;
                int i14 = (int) y11;
                View view = cVar.f5446r;
                if (view != null && i13 >= view.getLeft() && i13 < view.getRight() && i14 >= view.getTop() && i14 < view.getBottom()) {
                    cVar.j(cVar.f5446r, pointerId2);
                    return false;
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (cVar.f5429a == 1 && pointerId3 == cVar.f5431c) {
                    int pointerCount = motionEvent.getPointerCount();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= pointerCount) {
                            i10 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i15);
                        if (pointerId4 != cVar.f5431c) {
                            View c7 = cVar.c((int) motionEvent.getX(i15), (int) motionEvent.getY(i15));
                            View view2 = cVar.f5446r;
                            if (c7 == view2 && cVar.j(view2, pointerId4)) {
                                i10 = cVar.f5431c;
                                break;
                            }
                        }
                        i15++;
                    }
                    if (i10 == -1) {
                        cVar.f();
                    }
                }
                float[] fArr = cVar.f5432d;
                if (fArr != null) {
                    int i16 = cVar.f5439k;
                    int i17 = 1 << pointerId3;
                    if ((i16 & i17) != 0) {
                        fArr[pointerId3] = 0.0f;
                        cVar.f5433e[pointerId3] = 0.0f;
                        cVar.f5434f[pointerId3] = 0.0f;
                        cVar.f5435g[pointerId3] = 0.0f;
                        cVar.f5436h[pointerId3] = 0;
                        cVar.f5437i[pointerId3] = 0;
                        cVar.f5438j[pointerId3] = 0;
                        cVar.f5439k = (~i17) & i16;
                        return false;
                    }
                }
            }
        } else {
            if (cVar.f5429a != 1) {
                int pointerCount2 = motionEvent.getPointerCount();
                for (int i18 = 0; i18 < pointerCount2; i18++) {
                    int pointerId5 = motionEvent.getPointerId(i18);
                    if (cVar.e(pointerId5)) {
                        float x12 = motionEvent.getX(i18);
                        float y12 = motionEvent.getY(i18);
                        float f10 = x12 - cVar.f5432d[pointerId5];
                        float f11 = y12 - cVar.f5433e[pointerId5];
                        Math.abs(f10);
                        Math.abs(f11);
                        int i19 = cVar.f5436h[pointerId5];
                        Math.abs(f11);
                        Math.abs(f10);
                        int i20 = cVar.f5436h[pointerId5];
                        Math.abs(f10);
                        Math.abs(f11);
                        int i21 = cVar.f5436h[pointerId5];
                        Math.abs(f11);
                        Math.abs(f10);
                        int i22 = cVar.f5436h[pointerId5];
                        if (cVar.f5429a == 1) {
                            break;
                        }
                        View c10 = cVar.c((int) x12, (int) y12);
                        if (c10 != null) {
                            boolean z11 = cVar2.getViewHorizontalDragRange(c10) > 0;
                            boolean z12 = cVar2.getViewVerticalDragRange(c10) > 0;
                            if (z11 && z12) {
                                float f12 = (f11 * f11) + (f10 * f10);
                                int i23 = cVar.f5430b;
                            } else if (!z11) {
                            }
                            if (z10 && cVar.j(c10, pointerId5)) {
                                break;
                            }
                        }
                        z10 = false;
                        if (z10) {
                            break;
                            break;
                        }
                        continue;
                    }
                }
                cVar.h(motionEvent);
                return false;
            }
            if (cVar.e(cVar.f5431c)) {
                int findPointerIndex = motionEvent.findPointerIndex(cVar.f5431c);
                float x13 = motionEvent.getX(findPointerIndex);
                float y13 = motionEvent.getY(findPointerIndex);
                float[] fArr2 = cVar.f5434f;
                int i24 = cVar.f5431c;
                int i25 = (int) (x13 - fArr2[i24]);
                int i26 = (int) (y13 - cVar.f5435g[i24]);
                int left = cVar.f5446r.getLeft() + i25;
                int top = cVar.f5446r.getTop() + i26;
                int left2 = cVar.f5446r.getLeft();
                int top2 = cVar.f5446r.getTop();
                if (i25 != 0) {
                    left = cVar2.clampViewPositionHorizontal(cVar.f5446r, left, i25);
                    Field field = w.f2829a;
                    cVar.f5446r.offsetLeftAndRight(left - left2);
                }
                if (i26 != 0) {
                    top = cVar2.clampViewPositionVertical(cVar.f5446r, top, i26);
                    Field field2 = w.f2829a;
                    cVar.f5446r.offsetTopAndBottom(top - top2);
                }
                if (i25 != 0 || i26 != 0) {
                    cVar2.onViewPositionChanged(cVar.f5446r, left, top, left - left2, top - top2);
                }
                cVar.h(motionEvent);
                return false;
            }
        }
        return false;
    }

    public final void setListener(com.onesignal.inAppMessages.internal.display.impl.b bVar) {
        this.mListener = bVar;
    }

    public final void setParams(b bVar) {
        pc.j.e(bVar, "params");
        this.params = bVar;
        bVar.setOffScreenYPos(((Resources.getSystem().getDisplayMetrics().heightPixels - bVar.getMessageHeight()) - bVar.getPosY()) + bVar.getPosY() + bVar.getMessageHeight() + EXTRA_PX_DISMISS);
        bVar.setDismissingYVelocity(com.onesignal.common.n.INSTANCE.dpToPx(3000));
        if (bVar.getDragDirection() != 0) {
            bVar.setDismissingYPos((bVar.getMaxYPos() * 2) + (bVar.getMessageHeight() / 3));
        } else {
            bVar.setOffScreenYPos((-bVar.getMessageHeight()) - MARGIN_PX_SIZE);
            bVar.setDismissingYVelocity(-bVar.getDismissingYVelocity());
            bVar.setDismissingYPos(bVar.getOffScreenYPos() / 3);
        }
    }
}
