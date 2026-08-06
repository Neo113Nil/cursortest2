package defpackage;

/* loaded from: classes.dex */
public final class r50 implements android.view.GestureDetector.OnGestureListener {
    public final /* synthetic */ defpackage.s50 IHQe1A4L2xu;

    public r50(defpackage.s50 s50Var) {
        this.IHQe1A4L2xu = s50Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        defpackage.s50 s50Var = this.IHQe1A4L2xu;
        defpackage.r0 r0Var = s50Var.IHQe1A4L2xu;
        if (!s50Var.r1MBDhnF) {
            int i = s50Var.oh6vYeIP;
            if (i == 1) {
                if (java.lang.Math.abs(f) > java.lang.Math.abs(f2)) {
                    r0Var.AARZUJiTa(new defpackage.sx(f > 0.0f ? 1 : 2));
                    return true;
                }
            } else if (i == 2 && java.lang.Math.abs(f2) > java.lang.Math.abs(f)) {
                r0Var.AARZUJiTa(new defpackage.sx(f2 > 0.0f ? 1 : 2));
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(android.view.MotionEvent motionEvent) {
    }
}
