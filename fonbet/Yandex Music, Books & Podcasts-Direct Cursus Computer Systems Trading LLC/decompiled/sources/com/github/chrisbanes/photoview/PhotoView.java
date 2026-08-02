package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import defpackage.iqj;
import defpackage.kqj;
import defpackage.lqj;
import defpackage.qqj;
import defpackage.rqj;
import defpackage.rut;
import defpackage.trk;
import defpackage.u7g;
import defpackage.xq0;
import defpackage.xqj;
import defpackage.yqj;

/* loaded from: classes.dex */
public class PhotoView extends ImageView {
    public final trk a;
    public ImageView.ScaleType b;

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new trk(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.b = null;
        }
    }

    public trk getAttacher() {
        return this.a;
    }

    public RectF getDisplayRect() {
        trk trkVar = this.a;
        trkVar.b();
        Matrix c = trkVar.c();
        RectF rectF = trkVar.n;
        if (trkVar.h.getDrawable() == null) {
            return null;
        }
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        c.mapRect(rectF);
        return rectF;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.a.l;
    }

    public float getMaximumScale() {
        return this.a.e;
    }

    public float getMediumScale() {
        return this.a.d;
    }

    public float getMinimumScale() {
        return this.a.c;
    }

    public float getScale() {
        return this.a.d();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.a.u;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.a.f = z;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.a.f();
        }
        return frame;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        trk trkVar = this.a;
        if (trkVar != null) {
            trkVar.f();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        trk trkVar = this.a;
        if (trkVar != null) {
            trkVar.f();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        trk trkVar = this.a;
        if (trkVar != null) {
            trkVar.f();
        }
    }

    public void setMaximumScale(float f) {
        trk trkVar = this.a;
        u7g.B(trkVar.c, trkVar.d, f);
        trkVar.e = f;
    }

    public void setMediumScale(float f) {
        trk trkVar = this.a;
        u7g.B(trkVar.c, f, trkVar.e);
        trkVar.d = f;
    }

    public void setMinimumScale(float f) {
        trk trkVar = this.a;
        u7g.B(f, trkVar.d, trkVar.e);
        trkVar.c = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.p = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.a.i.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.a.q = onLongClickListener;
    }

    public void setOnMatrixChangeListener(iqj iqjVar) {
        this.a.getClass();
    }

    public void setOnOutsidePhotoTapListener(kqj kqjVar) {
        this.a.getClass();
    }

    public void setOnPhotoTapListener(lqj lqjVar) {
        this.a.getClass();
    }

    public void setOnScaleChangeListener(qqj qqjVar) {
        this.a.getClass();
    }

    public void setOnSingleFlingListener(rqj rqjVar) {
        this.a.getClass();
    }

    public void setOnViewDragListener(xqj xqjVar) {
        this.a.getClass();
    }

    public void setOnViewTapListener(yqj yqjVar) {
        this.a.getClass();
    }

    public void setRotationBy(float f) {
        trk trkVar = this.a;
        trkVar.m.postRotate(f % 360.0f);
        trkVar.a();
    }

    public void setRotationTo(float f) {
        trk trkVar = this.a;
        trkVar.m.setRotate(f % 360.0f);
        trkVar.a();
    }

    public void setScale(float f) {
        trk trkVar = this.a;
        PhotoView photoView = trkVar.h;
        trkVar.e(f, photoView.getRight() / 2, photoView.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        trk trkVar = this.a;
        if (trkVar == null) {
            this.b = scaleType;
            return;
        }
        trkVar.getClass();
        if (scaleType == null) {
            return;
        }
        if (rut.a[scaleType.ordinal()] == 1) {
            xq0.q("Matrix scale type is not supported");
        } else if (scaleType != trkVar.u) {
            trkVar.u = scaleType;
            trkVar.f();
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.a.b = i;
    }

    public void setZoomable(boolean z) {
        trk trkVar = this.a;
        trkVar.t = z;
        trkVar.f();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context) {
        this(context, null);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new trk(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.b = null;
        }
    }
}
