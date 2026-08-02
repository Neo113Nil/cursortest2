package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.github.chrisbanes.photoview.PhotoView;

/* loaded from: classes.dex */
public final class trk implements View.OnTouchListener, View.OnLayoutChangeListener {
    public final PhotoView h;
    public final GestureDetector i;
    public final ax6 j;
    public View.OnClickListener p;
    public View.OnLongClickListener q;
    public srk r;
    public final oxa v;
    public final AccelerateDecelerateInterpolator a = new AccelerateDecelerateInterpolator();
    public int b = 200;
    public float c = 1.0f;
    public float d = 1.75f;
    public float e = 3.0f;
    public boolean f = true;
    public boolean g = false;
    public final Matrix k = new Matrix();
    public final Matrix l = new Matrix();
    public final Matrix m = new Matrix();
    public final RectF n = new RectF();
    public final float[] o = new float[9];
    public int s = 2;
    public boolean t = true;
    public ImageView.ScaleType u = ImageView.ScaleType.FIT_CENTER;

    public trk(PhotoView photoView) {
        oxa oxaVar = new oxa(25, this);
        this.v = oxaVar;
        this.h = photoView;
        photoView.setOnTouchListener(this);
        photoView.addOnLayoutChangeListener(this);
        if (photoView.isInEditMode()) {
            return;
        }
        this.j = new ax6(photoView.getContext(), oxaVar);
        GestureDetector gestureDetector = new GestureDetector(photoView.getContext(), new bf3(6, this));
        this.i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new prk(this));
    }

    public final void a() {
        if (b()) {
            this.h.setImageMatrix(c());
        }
    }

    public final boolean b() {
        RectF rectF;
        float f;
        Matrix c = c();
        PhotoView photoView = this.h;
        Drawable drawable = photoView.getDrawable();
        float f2 = 0.0f;
        if (drawable != null) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            rectF = this.n;
            rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            c.mapRect(rectF);
        } else {
            rectF = null;
        }
        if (rectF == null) {
            return false;
        }
        float height = rectF.height();
        float width = rectF.width();
        float height2 = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        if (height <= height2) {
            int i = qrk.a[this.u.ordinal()];
            float f3 = rectF.top;
            if (i != 2) {
                f = (i != 3 ? (height2 - height) / 2.0f : height2 - height) - f3;
            } else {
                f = -f3;
            }
        } else {
            float f4 = rectF.top;
            if (f4 > 0.0f) {
                f = -f4;
            } else {
                float f5 = rectF.bottom;
                f = f5 < height2 ? height2 - f5 : 0.0f;
            }
        }
        float width2 = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        if (width <= width2) {
            int i2 = qrk.a[this.u.ordinal()];
            float f6 = rectF.left;
            if (i2 != 2) {
                f2 = (i2 != 3 ? (width2 - width) / 2.0f : width2 - width) - f6;
            } else {
                f2 = -f6;
            }
            this.s = 2;
        } else {
            float f7 = rectF.left;
            if (f7 > 0.0f) {
                this.s = 0;
                f2 = -f7;
            } else {
                float f8 = rectF.right;
                if (f8 < width2) {
                    f2 = width2 - f8;
                    this.s = 1;
                } else {
                    this.s = -1;
                }
            }
        }
        this.m.postTranslate(f2, f);
        return true;
    }

    public final Matrix c() {
        Matrix matrix = this.k;
        Matrix matrix2 = this.l;
        matrix2.set(matrix);
        matrix2.postConcat(this.m);
        return matrix2;
    }

    public final float d() {
        Matrix matrix = this.m;
        float[] fArr = this.o;
        matrix.getValues(fArr);
        float pow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(pow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    public final void e(float f, float f2, float f3, boolean z) {
        if (f < this.c || f > this.e) {
            xq0.x("Scale must be within the range of minScale and maxScale");
        } else if (z) {
            this.h.post(new rrk(this, d(), f, f2, f3));
        } else {
            this.m.setScale(f, f, f2, f3);
            a();
        }
    }

    public final void f() {
        boolean z = this.t;
        PhotoView photoView = this.h;
        if (z) {
            g(photoView.getDrawable());
            return;
        }
        Matrix matrix = this.m;
        matrix.reset();
        matrix.postRotate(0.0f);
        a();
        photoView.setImageMatrix(c());
        b();
    }

    public final void g(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        PhotoView photoView = this.h;
        float width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        float height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.k;
        matrix.reset();
        float f = intrinsicWidth;
        float f2 = width / f;
        float f3 = intrinsicHeight;
        float f4 = height / f3;
        ImageView.ScaleType scaleType = this.u;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((width - f) / 2.0f, (height - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f2, f4);
            matrix.postScale(max, max);
            matrix.postTranslate((width - (f * max)) / 2.0f, (height - (f3 * max)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f2, f4));
            matrix.postScale(min, min);
            matrix.postTranslate((width - (f * min)) / 2.0f, (height - (f3 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            int i = qrk.a[this.u.ordinal()];
            if (i == 1) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        Matrix matrix2 = this.m;
        matrix2.reset();
        matrix2.postRotate(0.0f);
        a();
        photoView.setImageMatrix(c());
        b();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        g(this.h.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        ax6 ax6Var;
        GestureDetector gestureDetector;
        boolean z2 = false;
        if (!this.t || ((ImageView) view).getDrawable() == null) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = null;
        if (action == 0) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            srk srkVar = this.r;
            if (srkVar != null) {
                srkVar.a.forceFinished(true);
                this.r = null;
            }
        } else if (action == 1 || action == 3) {
            float d = d();
            float f = this.c;
            PhotoView photoView = this.h;
            RectF rectF2 = this.n;
            if (d < f) {
                b();
                Matrix c = c();
                if (photoView.getDrawable() != null) {
                    rectF2.set(0.0f, 0.0f, r3.getIntrinsicWidth(), r3.getIntrinsicHeight());
                    c.mapRect(rectF2);
                    rectF = rectF2;
                }
                if (rectF != null) {
                    RectF rectF3 = rectF;
                    view.post(new rrk(this, d(), this.c, rectF3.centerX(), rectF3.centerY()));
                    z = true;
                }
            } else if (d() > this.e) {
                b();
                Matrix c2 = c();
                if (photoView.getDrawable() != null) {
                    rectF2.set(0.0f, 0.0f, r3.getIntrinsicWidth(), r3.getIntrinsicHeight());
                    c2.mapRect(rectF2);
                    rectF = rectF2;
                }
                if (rectF != null) {
                    RectF rectF4 = rectF;
                    view.post(new rrk(this, d(), this.e, rectF4.centerX(), rectF4.centerY()));
                    z = true;
                }
            }
            ax6Var = this.j;
            if (ax6Var != null) {
                ScaleGestureDetector scaleGestureDetector = ax6Var.c;
                boolean isInProgress = scaleGestureDetector.isInProgress();
                boolean z3 = ax6Var.e;
                try {
                    scaleGestureDetector.onTouchEvent(motionEvent);
                    ax6Var.a(motionEvent);
                } catch (IllegalArgumentException unused) {
                }
                boolean z4 = (isInProgress || scaleGestureDetector.isInProgress()) ? false : true;
                boolean z5 = (z3 || ax6Var.e) ? false : true;
                if (z4 && z5) {
                    z2 = true;
                }
                this.g = z2;
                z = true;
            }
            gestureDetector = this.i;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
            return z;
        }
        z = false;
        ax6Var = this.j;
        if (ax6Var != null) {
        }
        gestureDetector = this.i;
        if (gestureDetector == null) {
        }
        return z;
    }
}
