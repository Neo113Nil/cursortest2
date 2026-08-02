package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class r0f extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ s0f b;

    public r0f(s0f s0fVar) {
        this.b = s0fVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (this.a) {
            s0f s0fVar = this.b;
            View m = s0fVar.m(motionEvent);
            n8n n8nVar = s0fVar.m;
            if (m == null || s0fVar.r.a0(m) == null) {
                return;
            }
            RecyclerView recyclerView = s0fVar.r;
            n8nVar.getClass();
            if ((n8n.e(200723, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i = s0fVar.l;
                if (pointerId == i) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    s0fVar.d = x;
                    s0fVar.e = y;
                    s0fVar.i = 0.0f;
                    s0fVar.h = 0.0f;
                    n8nVar.getClass();
                }
            }
        }
    }
}
