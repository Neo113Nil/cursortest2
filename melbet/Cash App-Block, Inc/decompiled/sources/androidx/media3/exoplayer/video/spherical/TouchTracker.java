package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.exoplayer.video.spherical.OrientationListener;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, OrientationListener.Listener {
    public final GestureDetector gestureDetector;
    public final SphericalGLSurfaceView.Renderer listener;
    public final PointF previousTouchPointPx = new PointF();
    public final PointF accumulatedTouchOffsetDegrees = new PointF();
    public final float pxPerDegrees = 25.0f;
    public volatile float roll = 3.1415927f;

    public TouchTracker(Context context, SphericalGLSurfaceView.Renderer renderer) {
        this.listener = renderer;
        this.gestureDetector = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.previousTouchPointPx.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // androidx.media3.exoplayer.video.spherical.OrientationListener.Listener
    public final void onOrientationChange(float f, float[] fArr) {
        this.roll = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.previousTouchPointPx.x) / this.pxPerDegrees;
        float y = motionEvent2.getY();
        PointF pointF = this.previousTouchPointPx;
        float f3 = (y - pointF.y) / this.pxPerDegrees;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.roll;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.accumulatedTouchOffsetDegrees;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = (cos * f3) + (sin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        SphericalGLSurfaceView.Renderer renderer = this.listener;
        PointF pointF3 = this.accumulatedTouchOffsetDegrees;
        synchronized (renderer) {
            float f5 = pointF3.y;
            renderer.touchPitch = f5;
            Matrix.setRotateM(renderer.touchPitchMatrix, 0, -f5, (float) Math.cos(renderer.deviceRoll), (float) Math.sin(renderer.deviceRoll), RecyclerView.DECELERATION_RATE);
            Matrix.setRotateM(renderer.touchYawMatrix, 0, -pointF3.x, RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return SphericalGLSurfaceView.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.gestureDetector.onTouchEvent(motionEvent);
    }
}
