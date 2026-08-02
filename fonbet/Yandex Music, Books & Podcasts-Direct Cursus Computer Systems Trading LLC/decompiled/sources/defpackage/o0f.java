package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0f implements cpn {
    public final /* synthetic */ s0f a;

    public o0f(s0f s0fVar) {
        this.a = s0fVar;
    }

    @Override // defpackage.cpn
    public final void c(boolean z) {
        if (z) {
            this.a.q(null, 0);
        }
    }

    @Override // defpackage.cpn
    public final void d(MotionEvent motionEvent) {
        s0f s0fVar = this.a;
        dsd dsdVar = s0fVar.s;
        s0fVar.x.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = s0fVar.t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (s0fVar.l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(s0fVar.l);
        if (findPointerIndex >= 0) {
            s0fVar.j(actionMasked, findPointerIndex, motionEvent);
        }
        opn opnVar = s0fVar.c;
        if (opnVar == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    s0fVar.r(s0fVar.o, findPointerIndex, motionEvent);
                    s0fVar.p(opnVar);
                    s0fVar.r.removeCallbacks(dsdVar);
                    dsdVar.run();
                    s0fVar.r.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == s0fVar.l) {
                    s0fVar.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    s0fVar.r(s0fVar.o, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = s0fVar.t;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        s0fVar.q(null, 0);
        s0fVar.l = -1;
    }

    @Override // defpackage.cpn
    public final boolean e(MotionEvent motionEvent) {
        int findPointerIndex;
        s0f s0fVar = this.a;
        s0fVar.x.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        p0f p0fVar = null;
        if (actionMasked == 0) {
            s0fVar.l = motionEvent.getPointerId(0);
            s0fVar.d = motionEvent.getX();
            s0fVar.e = motionEvent.getY();
            VelocityTracker velocityTracker = s0fVar.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            s0fVar.t = VelocityTracker.obtain();
            if (s0fVar.c == null) {
                ArrayList arrayList = s0fVar.p;
                if (!arrayList.isEmpty()) {
                    View m = s0fVar.m(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        p0f p0fVar2 = (p0f) arrayList.get(size);
                        if (p0fVar2.e.a == m) {
                            p0fVar = p0fVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (p0fVar != null) {
                    opn opnVar = p0fVar.e;
                    s0fVar.d -= p0fVar.i;
                    s0fVar.e -= p0fVar.j;
                    s0fVar.l(opnVar, true);
                    if (s0fVar.a.remove(opnVar.a)) {
                        s0fVar.m.d(s0fVar.r, opnVar);
                    }
                    s0fVar.q(opnVar, p0fVar.f);
                    s0fVar.r(s0fVar.o, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            s0fVar.l = -1;
            s0fVar.q(null, 0);
        } else {
            int i = s0fVar.l;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                s0fVar.j(actionMasked, findPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = s0fVar.t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return s0fVar.c != null;
    }
}
