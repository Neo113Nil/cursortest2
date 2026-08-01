package m;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class D0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f3802a;

    public D0(E0 e02) {
        this.f3802a = e02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0236B c0236b;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        E0 e02 = this.f3802a;
        if (action == 0 && (c0236b = e02.f3828z) != null && c0236b.isShowing() && x2 >= 0 && x2 < e02.f3828z.getWidth() && y2 >= 0 && y2 < e02.f3828z.getHeight()) {
            e02.f3824v.postDelayed(e02.f3820r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        e02.f3824v.removeCallbacks(e02.f3820r);
        return false;
    }
}
