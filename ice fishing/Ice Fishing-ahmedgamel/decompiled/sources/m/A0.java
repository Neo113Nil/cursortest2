package m;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class A0 implements View.OnTouchListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ B0 f39029n;

    public A0(B0 b02) {
        this.f39029n = b02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C4737z c4737z;
        int action = motionEvent.getAction();
        int x9 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        B0 b02 = this.f39029n;
        if (action == 0 && (c4737z = b02.f39053S) != null && c4737z.isShowing() && x9 >= 0 && x9 < b02.f39053S.getWidth() && y7 >= 0 && y7 < b02.f39053S.getHeight()) {
            b02.f39049O.postDelayed(b02.f39045K, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        b02.f39049O.removeCallbacks(b02.f39045K);
        return false;
    }
}
