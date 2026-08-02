package ru.yandex.taxi.design;

import android.graphics.PointF;
import android.view.animation.LinearInterpolator;
import defpackage.g8e;

/* loaded from: classes5.dex */
public final class p implements Runnable {
    public final /* synthetic */ ScalableImageView A;
    public final int a;
    public final long b;
    public final float c;
    public final float w;
    public final PointF x;
    public final PointF y;
    public final LinearInterpolator z = new LinearInterpolator();

    public p(ScalableImageView scalableImageView, float f, PointF pointF, int i) {
        this.A = scalableImageView;
        scalableImageView.setState(ImageActionState.ANIMATE_ZOOM);
        this.b = System.currentTimeMillis();
        this.c = scalableImageView.getCurrentZoom();
        this.w = f;
        this.a = i;
        this.x = scalableImageView.getScrollPosition();
        this.y = pointF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float interpolation = this.z.getInterpolation(Math.min(1.0f, (System.currentTimeMillis() - this.b) / this.a));
        float f = this.c;
        float b = g8e.b(this.w, f, interpolation, f);
        PointF pointF = this.x;
        float f2 = pointF.x;
        PointF pointF2 = this.y;
        float b2 = g8e.b(pointF2.x, f2, interpolation, f2);
        float f3 = pointF.y;
        float b3 = g8e.b(pointF2.y, f3, interpolation, f3);
        ScalableImageView scalableImageView = this.A;
        scalableImageView.setZoom(b, b2, b3);
        if (interpolation < 1.0f) {
            scalableImageView.compatPostOnAnimation(this);
        } else {
            scalableImageView.setState(ImageActionState.NONE);
        }
    }
}
