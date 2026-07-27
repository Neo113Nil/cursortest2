package h;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class I implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f2097a;

    public I(J j2) {
        this.f2097a = j2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r rVar;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        J j2 = this.f2097a;
        if (action == 0 && (rVar = j2.f2120z) != null && rVar.isShowing() && x2 >= 0 && x2 < j2.f2120z.getWidth() && y2 >= 0 && y2 < j2.f2120z.getHeight()) {
            j2.f2116v.postDelayed(j2.r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        j2.f2116v.removeCallbacks(j2.r);
        return false;
    }
}
