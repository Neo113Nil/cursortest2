package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class zps extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, dxj, exj {
    public final GestureDetector e;
    public final Object g;
    public final /* synthetic */ int a = 0;
    public final PointF b = new PointF();
    public final PointF c = new PointF();
    public final float d = 25.0f;
    public volatile float f = 3.1415927f;

    public zps(Context context, j6r j6rVar) {
        this.g = j6rVar;
        this.e = new GestureDetector(context, this);
    }

    @Override // defpackage.dxj, defpackage.exj
    public final void a(float f, float[] fArr) {
        switch (this.a) {
            case 0:
                this.f = -f;
                break;
            default:
                this.f = -f;
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                this.b.set(motionEvent.getX(), motionEvent.getY());
                break;
            default:
                this.b.set(motionEvent.getX(), motionEvent.getY());
                break;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.a) {
            case 0:
                float x = (motionEvent2.getX() - this.b.x) / this.d;
                float y = motionEvent2.getY();
                PointF pointF = this.b;
                float f3 = (y - pointF.y) / this.d;
                pointF.set(motionEvent2.getX(), motionEvent2.getY());
                double d = this.f;
                float cos = (float) Math.cos(d);
                float sin = (float) Math.sin(d);
                PointF pointF2 = this.c;
                pointF2.x -= (cos * x) - (sin * f3);
                float f4 = (cos * f3) + (sin * x) + pointF2.y;
                pointF2.y = f4;
                pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
                j6r j6rVar = (j6r) this.g;
                PointF pointF3 = this.c;
                synchronized (j6rVar) {
                    float f5 = pointF3.y;
                    j6rVar.g = f5;
                    Matrix.setRotateM(j6rVar.e, 0, -f5, (float) Math.cos(j6rVar.h), (float) Math.sin(j6rVar.h), 0.0f);
                    Matrix.setRotateM(j6rVar.f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
                }
                return true;
            default:
                float x2 = (motionEvent2.getX() - this.b.x) / this.d;
                float y2 = motionEvent2.getY();
                PointF pointF4 = this.b;
                float f6 = (y2 - pointF4.y) / this.d;
                pointF4.set(motionEvent2.getX(), motionEvent2.getY());
                double d2 = this.f;
                float cos2 = (float) Math.cos(d2);
                float sin2 = (float) Math.sin(d2);
                PointF pointF5 = this.c;
                pointF5.x -= (cos2 * x2) - (sin2 * f6);
                float f7 = (cos2 * f6) + (sin2 * x2) + pointF5.y;
                pointF5.y = f7;
                pointF5.y = Math.max(-45.0f, Math.min(45.0f, f7));
                j6r j6rVar2 = (j6r) this.g;
                PointF pointF6 = this.c;
                synchronized (j6rVar2) {
                    float f8 = pointF6.y;
                    j6rVar2.g = f8;
                    Matrix.setRotateM(j6rVar2.e, 0, -f8, (float) Math.cos(j6rVar2.h), (float) Math.sin(j6rVar2.h), 0.0f);
                    Matrix.setRotateM(j6rVar2.f, 0, -pointF6.x, 0.0f, 1.0f, 0.0f);
                }
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return ((k6r) ((j6r) this.g).l).performClick();
            default:
                return ((l6r) ((j6r) this.g).l).performClick();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
        }
        return this.e.onTouchEvent(motionEvent);
    }

    public zps(Context context, j6r j6rVar, byte b) {
        this.g = j6rVar;
        this.e = new GestureDetector(context, this);
    }
}
