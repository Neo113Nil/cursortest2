package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n0 implements View.OnTouchListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f4394g;

    public n0(o0 o0Var) {
        this.f4394g = o0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        o0 o0Var = this.f4394g;
        k0 k0Var = o0Var.f4413t;
        Handler handler = o0Var.f4417x;
        r rVar = o0Var.B;
        int action = motionEvent.getAction();
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (action == 0 && rVar != null && rVar.isShowing() && x10 >= 0 && x10 < rVar.getWidth() && y10 >= 0 && y10 < rVar.getHeight()) {
            handler.postDelayed(k0Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(k0Var);
        return false;
    }
}
