package defpackage;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class sxi {
    public final ViewGroup a;
    public boolean b;
    public final float c;
    public float d;
    public float e;

    public sxi(ViewGroup viewGroup, float f) {
        this.a = viewGroup;
        WeakHashMap weakHashMap = wdu.a;
        ndu.m(viewGroup, true);
        this.c = f;
    }

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.d = motionEvent.getX();
            this.e = motionEvent.getY();
            return;
        }
        ViewGroup viewGroup = this.a;
        if (action != 1) {
            if (action == 2) {
                float abs = Math.abs(motionEvent.getX() - this.d);
                float abs2 = Math.abs(motionEvent.getY() - this.e);
                if (this.b || abs < this.c || abs <= abs2) {
                    return;
                }
                this.b = true;
                WeakHashMap weakHashMap = wdu.a;
                ndu.p(viewGroup, 1);
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.b = false;
        WeakHashMap weakHashMap2 = wdu.a;
        ndu.q(viewGroup);
    }
}
