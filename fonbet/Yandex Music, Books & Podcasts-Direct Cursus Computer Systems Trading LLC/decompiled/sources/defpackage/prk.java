package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.github.chrisbanes.photoview.PhotoView;

/* loaded from: classes.dex */
public final class prk implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ trk a;

    public prk(trk trkVar) {
        this.a = trkVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float d;
        float x;
        float y;
        float f;
        trk trkVar = this.a;
        try {
            d = trkVar.d();
            x = motionEvent.getX();
            y = motionEvent.getY();
            f = trkVar.d;
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (d < f) {
            trkVar.e(f, x, y, true);
            return true;
        }
        if (d >= f) {
            float f2 = trkVar.e;
            if (d < f2) {
                trkVar.e(f2, x, y, true);
                return true;
            }
        }
        trkVar.e(trkVar.c, x, y, true);
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        trk trkVar = this.a;
        PhotoView photoView = trkVar.h;
        View.OnClickListener onClickListener = trkVar.p;
        if (onClickListener != null) {
            onClickListener.onClick(photoView);
        }
        trkVar.b();
        Matrix c = trkVar.c();
        RectF rectF = trkVar.n;
        if (photoView.getDrawable() != null) {
            rectF.set(0.0f, 0.0f, r1.getIntrinsicWidth(), r1.getIntrinsicHeight());
            c.mapRect(rectF);
        } else {
            rectF = null;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (rectF == null || !rectF.contains(x, y)) {
            return false;
        }
        rectF.width();
        rectF.height();
        return true;
    }
}
