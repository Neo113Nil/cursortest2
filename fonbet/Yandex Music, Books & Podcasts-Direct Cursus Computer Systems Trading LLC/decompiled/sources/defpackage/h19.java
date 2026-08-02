package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes3.dex */
public final class h19 extends GestureDetector.SimpleOnGestureListener {
    public final boolean a;
    public qs6 b;
    public uif c;

    public h19(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ?? r1 = this.c;
        if (r1 == 0) {
            return false;
        }
        r1.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (this.a) {
            return false;
        }
        return (this.c == null && this.b == null) ? false : true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        qs6 qs6Var;
        if (this.c == null || (qs6Var = this.b) == null) {
            return false;
        }
        qs6Var.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        qs6 qs6Var;
        if (this.c != null || (qs6Var = this.b) == null) {
            return false;
        }
        qs6Var.invoke();
        return true;
    }
}
