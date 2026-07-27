package m;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class A0 implements View.OnTouchListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ B0 f38961n;

    public A0(B0 b02) {
        this.f38961n = b02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C4724z c4724z;
        int action = motionEvent.getAction();
        int x9 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        B0 b02 = this.f38961n;
        if (action == 0 && (c4724z = b02.f38985S) != null && c4724z.isShowing() && x9 >= 0 && x9 < b02.f38985S.getWidth() && y7 >= 0 && y7 < b02.f38985S.getHeight()) {
            b02.f38981O.postDelayed(b02.f38977K, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        b02.f38981O.removeCallbacks(b02.f38977K);
        return false;
    }
}
