package ru.yandex.taxi.design;

import android.content.Context;
import android.graphics.Matrix;
import android.widget.OverScroller;
import defpackage.ndl0;

/* loaded from: classes5.dex */
public final class r implements Runnable {
    public final ndl0 a;
    public int b;
    public int c;
    public final /* synthetic */ ScalableImageView w;

    public r(ScalableImageView scalableImageView, int i, int i2) {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean orientationMismatch;
        this.w = scalableImageView;
        scalableImageView.setState(ImageActionState.FLING);
        Context context = scalableImageView.getContext();
        ndl0 ndl0Var = new ndl0();
        OverScroller overScroller = new OverScroller(context);
        ndl0Var.b = overScroller;
        this.a = ndl0Var;
        Matrix matrix = scalableImageView.touchMatrix;
        fArr = scalableImageView.floatMatrix;
        matrix.getValues(fArr);
        fArr2 = scalableImageView.floatMatrix;
        int i7 = (int) fArr2[2];
        fArr3 = scalableImageView.floatMatrix;
        int i8 = (int) fArr3[5];
        z = scalableImageView.isRotateImageToFitScreen;
        if (z) {
            orientationMismatch = scalableImageView.orientationMismatch(scalableImageView.getDrawable());
            if (orientationMismatch) {
                i7 -= (int) scalableImageView.getImageWidth();
            }
        }
        int i9 = i7;
        if (scalableImageView.getImageWidth() > scalableImageView.viewWidth) {
            i3 = scalableImageView.viewWidth - ((int) scalableImageView.getImageWidth());
            i4 = 0;
        } else {
            i3 = i9;
            i4 = i3;
        }
        if (scalableImageView.getImageHeight() > scalableImageView.viewHeight) {
            i5 = scalableImageView.viewHeight - ((int) scalableImageView.getImageHeight());
            i6 = 0;
        } else {
            i5 = i8;
            i6 = i5;
        }
        overScroller.fling(i9, i8, i, i2, i3, i4, i5, i6);
        this.b = i9;
        this.c = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScalableImageView scalableImageView = this.w;
        ScalableImageView.access$getTouchImageViewListener$p(scalableImageView);
        ndl0 ndl0Var = this.a;
        if (((OverScroller) ndl0Var.b).isFinished()) {
            return;
        }
        OverScroller overScroller = (OverScroller) ndl0Var.b;
        overScroller.computeScrollOffset();
        if (overScroller.computeScrollOffset()) {
            int currX = ((OverScroller) ndl0Var.b).getCurrX();
            int currY = ((OverScroller) ndl0Var.b).getCurrY();
            int i = currX - this.b;
            int i2 = currY - this.c;
            this.b = currX;
            this.c = currY;
            scalableImageView.touchMatrix.postTranslate(i, i2);
            scalableImageView.fixTrans();
            scalableImageView.setImageMatrix(scalableImageView.touchMatrix);
            scalableImageView.compatPostOnAnimation(this);
        }
    }
}
