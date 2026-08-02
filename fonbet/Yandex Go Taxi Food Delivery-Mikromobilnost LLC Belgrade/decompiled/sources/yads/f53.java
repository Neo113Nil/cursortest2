package yads;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import defpackage.d971;

/* loaded from: classes7.dex */
public final class f53 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ d971 a;

    public f53(d971 d971Var) {
        this.a = d971Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.a.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a.a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        return true;
    }
}
