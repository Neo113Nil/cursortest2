package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.github.chrisbanes.photoview.PhotoView;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class ax6 {
    public int a = -1;
    public int b = 0;
    public final ScaleGestureDetector c;
    public VelocityTracker d;
    public boolean e;
    public float f;
    public float g;
    public final float h;
    public final float i;
    public final oxa j;

    public ax6(Context context, oxa oxaVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h = viewConfiguration.getScaledTouchSlop();
        this.j = oxaVar;
        this.c = new ScaleGestureDetector(context, new zw6(this));
    }

    public final void a(MotionEvent motionEvent) {
        float x;
        float y;
        float x2;
        float y2;
        int i;
        int i2;
        int i3;
        int i4;
        float x3;
        float y3;
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action != 0) {
            oxa oxaVar = this.j;
            if (action == 1) {
                this.a = -1;
                if (this.e && this.d != null) {
                    try {
                        x2 = motionEvent.getX(this.b);
                    } catch (Exception unused) {
                        x2 = motionEvent.getX();
                    }
                    this.f = x2;
                    try {
                        y2 = motionEvent.getY(this.b);
                    } catch (Exception unused2) {
                        y2 = motionEvent.getY();
                    }
                    this.g = y2;
                    this.d.addMovement(motionEvent);
                    this.d.computeCurrentVelocity(1000);
                    float xVelocity = this.d.getXVelocity();
                    float yVelocity = this.d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.i) {
                        trk trkVar = (trk) oxaVar.b;
                        PhotoView photoView = trkVar.h;
                        srk srkVar = new srk(trkVar, photoView.getContext());
                        trkVar.r = srkVar;
                        int width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
                        int height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
                        int i5 = (int) (-xVelocity);
                        int i6 = (int) (-yVelocity);
                        trkVar.b();
                        Matrix c = trkVar.c();
                        RectF rectF = trkVar.n;
                        if (photoView.getDrawable() != null) {
                            rectF.set(0.0f, 0.0f, r13.getIntrinsicWidth(), r13.getIntrinsicHeight());
                            c.mapRect(rectF);
                        } else {
                            rectF = null;
                        }
                        if (rectF != null) {
                            int round = Math.round(-rectF.left);
                            float f = width;
                            if (f < rectF.width()) {
                                i = Math.round(rectF.width() - f);
                                i2 = 0;
                            } else {
                                i = round;
                                i2 = i;
                            }
                            int round2 = Math.round(-rectF.top);
                            float f2 = height;
                            if (f2 < rectF.height()) {
                                i3 = Math.round(rectF.height() - f2);
                                i4 = 0;
                            } else {
                                i3 = round2;
                                i4 = i3;
                            }
                            srkVar.b = round;
                            srkVar.c = round2;
                            if (round != i || round2 != i3) {
                                srkVar.a.fling(round, round2, i5, i6, i2, i, i4, i3, 0, 0);
                            }
                        }
                        photoView.post(trkVar.r);
                    }
                }
                VelocityTracker velocityTracker = this.d;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.d = null;
                }
            } else if (action == 2) {
                try {
                    x3 = motionEvent.getX(this.b);
                } catch (Exception unused3) {
                    x3 = motionEvent.getX();
                }
                try {
                    y3 = motionEvent.getY(this.b);
                } catch (Exception unused4) {
                    y3 = motionEvent.getY();
                }
                float f3 = x3 - this.f;
                float f4 = y3 - this.g;
                if (!this.e) {
                    this.e = Math.sqrt((double) ((f4 * f4) + (f3 * f3))) >= ((double) this.h);
                }
                if (this.e) {
                    trk trkVar2 = (trk) oxaVar.b;
                    ax6 ax6Var = trkVar2.j;
                    if (!ax6Var.c.isInProgress()) {
                        trkVar2.m.postTranslate(f3, f4);
                        trkVar2.a();
                        ViewParent parent = trkVar2.h.getParent();
                        if (trkVar2.f && !ax6Var.c.isInProgress() && !trkVar2.g) {
                            int i7 = trkVar2.s;
                            if ((i7 == 2 || ((i7 == 0 && f3 >= 1.0f) || (i7 == 1 && f3 <= -1.0f))) && parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        } else if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f = x3;
                    this.g = y3;
                    VelocityTracker velocityTracker2 = this.d;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.a = -1;
                VelocityTracker velocityTracker3 = this.d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.d = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.a) {
                    int i8 = action2 != 0 ? 0 : 1;
                    this.a = motionEvent.getPointerId(i8);
                    this.f = motionEvent.getX(i8);
                    this.g = motionEvent.getY(i8);
                }
            }
        } else {
            this.a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x = motionEvent.getX(this.b);
            } catch (Exception unused5) {
                x = motionEvent.getX();
            }
            this.f = x;
            try {
                y = motionEvent.getY(this.b);
            } catch (Exception unused6) {
                y = motionEvent.getY();
            }
            this.g = y;
            this.e = false;
        }
        int i9 = this.a;
        this.b = motionEvent.findPointerIndex(i9 != -1 ? i9 : 0);
    }
}
