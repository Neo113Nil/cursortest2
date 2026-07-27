package m;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class A0 implements View.OnTouchListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ B0 f39228n;

    public A0(B0 b02) {
        this.f39228n = b02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C4772z c4772z;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y6 = (int) motionEvent.getY();
        B0 b02 = this.f39228n;
        if (action == 0 && (c4772z = b02.f39252S) != null && c4772z.isShowing() && x3 >= 0 && x3 < b02.f39252S.getWidth() && y6 >= 0 && y6 < b02.f39252S.getHeight()) {
            b02.f39248O.postDelayed(b02.f39244K, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        b02.f39248O.removeCallbacks(b02.f39244K);
        return false;
    }
}
