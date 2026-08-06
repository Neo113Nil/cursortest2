package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class s70 implements android.view.GestureDetector.OnGestureListener {
    public final /* synthetic */ defpackage.t70 ZpBGe2uQfcn8;

    public s70(defpackage.t70 t70Var) {
        this.ZpBGe2uQfcn8 = t70Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        defpackage.t70 t70Var = this.ZpBGe2uQfcn8;
        defpackage.o oVar = t70Var.ZpBGe2uQfcn8;
        if (!t70Var.fWTAfUmVKrZq) {
            int i = t70Var.giKS3J6vZuNy;
            if (i == 1) {
                if (java.lang.Math.abs(f) > java.lang.Math.abs(f2)) {
                    ((defpackage.gz) oVar.QiMR8OkAhezm.getFocusOwner()).QiMR8OkAhezm(f > 0.0f ? 1 : 2, false);
                    return true;
                }
            } else if (i == 2 && java.lang.Math.abs(f2) > java.lang.Math.abs(f)) {
                ((defpackage.gz) oVar.QiMR8OkAhezm.getFocusOwner()).QiMR8OkAhezm(f2 > 0.0f ? 1 : 2, false);
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
