package com.gamericefishpro.space.m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.n.w0;
import com.gamericefishpro.space.n.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public int A;
    public final int[] B;
    public final /* synthetic */ int C;
    public final /* synthetic */ View D;
    public final float d;
    public final int e;
    public final int i;
    public final View v;
    public y0 w;
    public y0 y;
    public boolean z;

    public a(View view) {
        this.B = new int[2];
        this.v = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.e = tapTimeout;
        this.i = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        y0 y0Var = this.y;
        View view = this.v;
        if (y0Var != null) {
            view.removeCallbacks(y0Var);
        }
        y0 y0Var2 = this.w;
        if (y0Var2 != null) {
            view.removeCallbacks(y0Var2);
        }
    }

    public final k b() {
        com.gamericefishpro.space.n.f fVar;
        switch (this.C) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b bVar = ((ActionMenuItemView) this.D).F;
                if (bVar == null || (fVar = ((com.gamericefishpro.space.n.g) bVar).a.L) == null) {
                    return null;
                }
                return fVar.a();
            default:
                com.gamericefishpro.space.n.f fVar2 = ((com.gamericefishpro.space.n.h) this.D).v.K;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.a();
        }
    }

    public final boolean c() {
        k kVarB;
        switch (this.C) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.D;
                h hVar = actionMenuItemView.D;
                return hVar != null && hVar.b(actionMenuItemView.A) && (kVarB = b()) != null && kVarB.j();
            default:
                ((com.gamericefishpro.space.n.h) this.D).v.j();
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        com.gamericefishpro.space.n.i iVar;
        boolean z2;
        k kVarB;
        w0 w0Var;
        boolean z3 = this.z;
        View view2 = this.v;
        if (z3) {
            k kVarB2 = b();
            if (kVarB2 == null || !kVarB2.j() || (w0Var = (w0) kVarB2.e()) == null || !w0Var.isShown()) {
                switch (this.C) {
                    case 1:
                        iVar = ((com.gamericefishpro.space.n.h) this.D).v;
                        if (iVar.M != null) {
                            iVar.e();
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        break;
                    default:
                        kVarB = b();
                        if (kVarB != null && kVarB.j()) {
                            kVarB.dismiss();
                        }
                        z2 = true;
                        break;
                }
                if (z2) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.B;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                w0Var.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = w0Var.b(motionEventObtainNoHistory, this.A);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z4) {
                    z = true;
                } else {
                    switch (this.C) {
                        case 1:
                            iVar = ((com.gamericefishpro.space.n.h) this.D).v;
                            if (iVar.M != null) {
                                iVar.e();
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            break;
                        default:
                            kVarB = b();
                            if (kVarB != null) {
                                kVarB.dismiss();
                            }
                            z2 = true;
                            break;
                    }
                    if (z2) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.A = motionEvent.getPointerId(0);
                    if (this.w == null) {
                        this.w = new y0(this, 0);
                    }
                    view2.postDelayed(this.w, this.e);
                    if (this.y == null) {
                        this.y = new y0(this, 1);
                    }
                    view2.postDelayed(this.y, this.i);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.A);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.d;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = c();
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.z = z;
        return z || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.z = false;
        this.A = -1;
        y0 y0Var = this.w;
        if (y0Var != null) {
            this.v.removeCallbacks(y0Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.C = 0;
        this.D = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(com.gamericefishpro.space.n.h hVar, com.gamericefishpro.space.n.h hVar2) {
        this(hVar2);
        this.C = 1;
        this.D = hVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
