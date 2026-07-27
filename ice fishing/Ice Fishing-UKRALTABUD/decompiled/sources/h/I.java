package h;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class I implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f2088a;

    public I(J j2) {
        this.f2088a = j2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r rVar;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        J j2 = this.f2088a;
        if (action == 0 && (rVar = j2.f2091A) != null && rVar.isShowing() && x2 >= 0 && x2 < j2.f2091A.getWidth() && y2 >= 0 && y2 < j2.f2091A.getHeight()) {
            j2.f2108w.postDelayed(j2.f2104s, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        j2.f2108w.removeCallbacks(j2.f2104s);
        return false;
    }
}
