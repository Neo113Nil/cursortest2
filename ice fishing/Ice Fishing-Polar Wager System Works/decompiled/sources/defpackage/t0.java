package defpackage;

/* loaded from: classes.dex */
public final class t0 implements java.lang.Runnable {
    public final /* synthetic */ defpackage.v0 adDC3e2L;

    public t0(defpackage.v0 v0Var) {
        this.adDC3e2L = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        defpackage.v0 v0Var = this.adDC3e2L;
        v0Var.removeCallbacks(this);
        android.view.MotionEvent motionEvent = v0Var.Ay906ovssqgN;
        if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
            return;
        }
        int i = 7;
        if (actionMasked != 7 && actionMasked != 9) {
            i = 2;
        }
        v0Var.p4kuH6PDtgom(motionEvent, i, v0Var.FisHbM7NmV, false);
    }
}
