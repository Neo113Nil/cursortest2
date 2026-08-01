package B;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class b {
    public boolean a(View view) {
        return false;
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i6, int i9) {
        return false;
    }

    public boolean i(View view) {
        return false;
    }

    public void k(CoordinatorLayout coordinatorLayout, View view, int i, int i6, int i9, int[] iArr) {
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i9;
    }

    public Parcelable n(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean o(int i, int i6, View view) {
        return false;
    }

    public boolean q(View view, MotionEvent motionEvent) {
        return false;
    }

    public void e() {
    }

    public void b(View view) {
    }

    public void c(e eVar) {
    }

    public void l(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void m(View view, Parcelable parcelable) {
    }

    public void p(View view, View view2, int i) {
    }

    public void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i6, int[] iArr, int i9) {
    }
}
