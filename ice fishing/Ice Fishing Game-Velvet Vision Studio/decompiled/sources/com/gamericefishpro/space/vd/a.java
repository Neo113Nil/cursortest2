package com.gamericefishpro.space.vd;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.gamericefishpro.space.d4.l0;
import java.lang.reflect.Field;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends RelativeLayout {
    public static final C0062a Companion = new C0062a(null);
    private static final int EXTRA_PX_DISMISS;
    private static final int MARGIN_PX_SIZE;
    private boolean dismissing;
    private final boolean draggingDisabled;
    private com.gamericefishpro.space.k4.e mDragHelper;
    private com.gamericefishpro.space.vd.b mListener;
    private b params;

    /* JADX INFO: renamed from: com.gamericefishpro.space.vd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0062a {
        public /* synthetic */ C0062a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0062a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b {
        public static final C0063a Companion = new C0063a(null);
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

        /* JADX INFO: renamed from: com.gamericefishpro.space.vd.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class C0063a {
            public /* synthetic */ C0063a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0063a() {
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

        public final void setDraggingDisabled(boolean z) {
            this.draggingDisabled = z;
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

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.k4.d {
        private int lastYPos;

        public c() {
        }

        @Override // com.gamericefishpro.space.k4.d
        public int clampViewPositionHorizontal(View child, int i, int i2) {
            Intrinsics.checkNotNullParameter(child, "child");
            b bVar = a.this.params;
            Intrinsics.b(bVar);
            return bVar.getMaxXPos();
        }

        @Override // com.gamericefishpro.space.k4.d
        public int clampViewPositionVertical(View child, int i, int i2) {
            Intrinsics.checkNotNullParameter(child, "child");
            b bVar = a.this.params;
            Intrinsics.b(bVar);
            if (bVar.getDraggingDisabled()) {
                b bVar2 = a.this.params;
                Intrinsics.b(bVar2);
                return bVar2.getMaxYPos();
            }
            this.lastYPos = i;
            b bVar3 = a.this.params;
            Intrinsics.b(bVar3);
            if (bVar3.getDragDirection() == 1) {
                b bVar4 = a.this.params;
                Intrinsics.b(bVar4);
                if (i >= bVar4.getDragThresholdY() && a.this.mListener != null) {
                    com.gamericefishpro.space.vd.b bVar5 = a.this.mListener;
                    Intrinsics.b(bVar5);
                    bVar5.onDragStart();
                }
                b bVar6 = a.this.params;
                Intrinsics.b(bVar6);
                if (i < bVar6.getMaxYPos()) {
                    b bVar7 = a.this.params;
                    Intrinsics.b(bVar7);
                    return bVar7.getMaxYPos();
                }
            } else {
                b bVar8 = a.this.params;
                Intrinsics.b(bVar8);
                if (i <= bVar8.getDragThresholdY() && a.this.mListener != null) {
                    com.gamericefishpro.space.vd.b bVar9 = a.this.mListener;
                    Intrinsics.b(bVar9);
                    bVar9.onDragStart();
                }
                b bVar10 = a.this.params;
                Intrinsics.b(bVar10);
                if (i > bVar10.getMaxYPos()) {
                    b bVar11 = a.this.params;
                    Intrinsics.b(bVar11);
                    return bVar11.getMaxYPos();
                }
            }
            return i;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004d  */
        /* JADX WARN: Code duplicated, block: B:12:0x0067  */
        /* JADX WARN: Code duplicated, block: B:17:0x0097  */
        /* JADX WARN: Code duplicated, block: B:19:0x00b1  */
        @Override // com.gamericefishpro.space.k4.d
        public void onViewReleased(View releasedChild, float f, float f2) {
            Intrinsics.checkNotNullParameter(releasedChild, "releasedChild");
            b bVar = a.this.params;
            Intrinsics.b(bVar);
            int maxYPos = bVar.getMaxYPos();
            if (!a.this.dismissing) {
                b bVar2 = a.this.params;
                Intrinsics.b(bVar2);
                if (bVar2.getDragDirection() == 1) {
                    int i = this.lastYPos;
                    b bVar3 = a.this.params;
                    Intrinsics.b(bVar3);
                    if (i <= bVar3.getDismissingYPos()) {
                        b bVar4 = a.this.params;
                        Intrinsics.b(bVar4);
                        if (f2 > bVar4.getDismissingYVelocity()) {
                            b bVar5 = a.this.params;
                            Intrinsics.b(bVar5);
                            maxYPos = bVar5.getOffScreenYPos();
                            a.this.dismissing = true;
                            if (a.this.mListener != null) {
                                com.gamericefishpro.space.vd.b bVar6 = a.this.mListener;
                                Intrinsics.b(bVar6);
                                bVar6.onDismiss();
                            }
                        }
                    } else {
                        b bVar7 = a.this.params;
                        Intrinsics.b(bVar7);
                        maxYPos = bVar7.getOffScreenYPos();
                        a.this.dismissing = true;
                        if (a.this.mListener != null) {
                            com.gamericefishpro.space.vd.b bVar8 = a.this.mListener;
                            Intrinsics.b(bVar8);
                            bVar8.onDismiss();
                        }
                    }
                } else {
                    int i2 = this.lastYPos;
                    b bVar9 = a.this.params;
                    Intrinsics.b(bVar9);
                    if (i2 >= bVar9.getDismissingYPos()) {
                        b bVar10 = a.this.params;
                        Intrinsics.b(bVar10);
                        if (f2 < bVar10.getDismissingYVelocity()) {
                            b bVar11 = a.this.params;
                            Intrinsics.b(bVar11);
                            maxYPos = bVar11.getOffScreenYPos();
                            a.this.dismissing = true;
                            if (a.this.mListener != null) {
                                com.gamericefishpro.space.vd.b bVar12 = a.this.mListener;
                                Intrinsics.b(bVar12);
                                bVar12.onDismiss();
                            }
                        }
                    } else {
                        b bVar13 = a.this.params;
                        Intrinsics.b(bVar13);
                        maxYPos = bVar13.getOffScreenYPos();
                        a.this.dismissing = true;
                        if (a.this.mListener != null) {
                            com.gamericefishpro.space.vd.b bVar14 = a.this.mListener;
                            Intrinsics.b(bVar14);
                            bVar14.onDismiss();
                        }
                    }
                }
            }
            com.gamericefishpro.space.k4.e eVar = a.this.mDragHelper;
            Intrinsics.b(eVar);
            b bVar15 = a.this.params;
            Intrinsics.b(bVar15);
            if (eVar.o(bVar15.getMaxXPos(), maxYPos)) {
                a aVar = a.this;
                Field field = l0.a;
                aVar.postInvalidateOnAnimation();
            }
        }

        @Override // com.gamericefishpro.space.k4.d
        public boolean tryCaptureView(View child, int i) {
            Intrinsics.checkNotNullParameter(child, "child");
            return true;
        }
    }

    static {
        com.gamericefishpro.space.yb.k kVar = com.gamericefishpro.space.yb.k.INSTANCE;
        MARGIN_PX_SIZE = kVar.dpToPx(28);
        EXTRA_PX_DISMISS = kVar.dpToPx(64);
    }

    public a(Context context) {
        super(context);
        setClipChildren(false);
        createDragHelper();
    }

    private final void createDragHelper() {
        com.gamericefishpro.space.k4.e eVar = new com.gamericefishpro.space.k4.e(getContext(), this, new c());
        eVar.b = (int) (1.0f * eVar.b);
        this.mDragHelper = eVar;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        com.gamericefishpro.space.k4.e eVar = this.mDragHelper;
        Intrinsics.b(eVar);
        if (eVar.f()) {
            Field field = l0.a;
            postInvalidateOnAnimation();
        }
    }

    public final void dismiss() {
        this.dismissing = true;
        com.gamericefishpro.space.k4.e eVar = this.mDragHelper;
        Intrinsics.b(eVar);
        int left = getLeft();
        b bVar = this.params;
        Intrinsics.b(bVar);
        eVar.q(this, left, bVar.getOffScreenYPos());
        Field field = l0.a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        com.gamericefishpro.space.vd.b bVar;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.dismissing) {
            return true;
        }
        int action = event.getAction();
        if ((action == 0 || action == 5) && (bVar = this.mListener) != null) {
            Intrinsics.b(bVar);
            bVar.onDragEnd();
        }
        com.gamericefishpro.space.k4.e eVar = this.mDragHelper;
        Intrinsics.b(eVar);
        eVar.j(event);
        return false;
    }

    public final void setListener(com.gamericefishpro.space.vd.b bVar) {
        this.mListener = bVar;
    }

    public final void setParams(b params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
        params.setOffScreenYPos(((Resources.getSystem().getDisplayMetrics().heightPixels - params.getMessageHeight()) - params.getPosY()) + params.getPosY() + params.getMessageHeight() + EXTRA_PX_DISMISS);
        params.setDismissingYVelocity(com.gamericefishpro.space.yb.k.INSTANCE.dpToPx(3000));
        if (params.getDragDirection() != 0) {
            params.setDismissingYPos((params.getMaxYPos() * 2) + (params.getMessageHeight() / 3));
        } else {
            params.setOffScreenYPos((-params.getMessageHeight()) - MARGIN_PX_SIZE);
            params.setDismissingYVelocity(-params.getDismissingYVelocity());
            params.setDismissingYPos(params.getOffScreenYPos() / 3);
        }
    }
}
