package ru.yandex.taxi.design;

import android.graphics.PointF;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.g8e;

/* loaded from: classes5.dex */
public final class q implements Runnable {
    public final PointF A;
    public final PointF B;
    public final /* synthetic */ ScalableImageView C;
    public final long a;
    public final float b;
    public final float c;
    public final float w;
    public final float x;
    public final boolean y;
    public final AccelerateDecelerateInterpolator z = new AccelerateDecelerateInterpolator();

    public q(ScalableImageView scalableImageView, float f, float f2, float f3, boolean z) {
        this.C = scalableImageView;
        scalableImageView.setState(ImageActionState.ANIMATE_ZOOM);
        this.a = System.currentTimeMillis();
        this.b = scalableImageView.getCurrentZoom();
        this.c = f;
        this.y = z;
        PointF transformCoordTouchToBitmap = scalableImageView.transformCoordTouchToBitmap(f2, f3, false);
        float f4 = transformCoordTouchToBitmap.x;
        this.w = f4;
        float f5 = transformCoordTouchToBitmap.y;
        this.x = f5;
        this.A = scalableImageView.transformCoordBitmapToTouch(f4, f5);
        this.B = new PointF(scalableImageView.viewWidth / 2, scalableImageView.viewHeight / 2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScalableImageView scalableImageView = this.C;
        if (scalableImageView.getDrawable() == null) {
            scalableImageView.setState(ImageActionState.NONE);
            return;
        }
        float interpolation = this.z.getInterpolation(Math.min(1.0f, (System.currentTimeMillis() - this.a) / 500.0f));
        this.C.scaleImage(((interpolation * (this.c - r3)) + this.b) / scalableImageView.getCurrentZoom(), this.w, this.x, this.y);
        PointF pointF = this.A;
        float f = pointF.x;
        PointF pointF2 = this.B;
        float b = g8e.b(pointF2.x, f, interpolation, f);
        float f2 = pointF.y;
        float b2 = g8e.b(pointF2.y, f2, interpolation, f2);
        PointF transformCoordBitmapToTouch = scalableImageView.transformCoordBitmapToTouch(this.w, this.x);
        scalableImageView.touchMatrix.postTranslate(b - transformCoordBitmapToTouch.x, b2 - transformCoordBitmapToTouch.y);
        scalableImageView.fixScaleTrans();
        scalableImageView.setImageMatrix(scalableImageView.touchMatrix);
        ScalableImageView.access$getTouchImageViewListener$p(scalableImageView);
        if (interpolation < 1.0f) {
            scalableImageView.compatPostOnAnimation(this);
        } else {
            scalableImageView.setState(ImageActionState.NONE);
        }
    }
}
