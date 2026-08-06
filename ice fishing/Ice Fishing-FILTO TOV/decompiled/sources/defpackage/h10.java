package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class h10 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ i10 GWasM1elztuh;

    public h10(i10 i10Var) {
        this.GWasM1elztuh = i10Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        i10 i10Var = this.GWasM1elztuh;
        xwMnAITU0 xwmnaitu0 = i10Var.GWasM1elztuh;
        if (!i10Var.X1lG3V04pd) {
            int i = i10Var.Yi7zF1RB1;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    xwmnaitu0.mOu10nynGul(new dt(f > 0.0f ? 1 : 2));
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                xwmnaitu0.mOu10nynGul(new dt(f2 > 0.0f ? 1 : 2));
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
