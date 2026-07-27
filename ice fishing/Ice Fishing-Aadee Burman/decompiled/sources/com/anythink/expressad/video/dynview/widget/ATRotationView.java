package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ATRotationView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    Runnable f21339a;

    /* renamed from: b, reason: collision with root package name */
    private Camera f21340b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f21341c;

    /* renamed from: d, reason: collision with root package name */
    private int f21342d;

    /* renamed from: e, reason: collision with root package name */
    private int f21343e;

    /* renamed from: f, reason: collision with root package name */
    private int f21344f;

    /* renamed from: g, reason: collision with root package name */
    private int f21345g;

    /* renamed from: h, reason: collision with root package name */
    private int f21346h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f21347j;

    /* renamed from: k, reason: collision with root package name */
    private int f21348k;

    /* renamed from: l, reason: collision with root package name */
    private float f21349l;

    /* renamed from: m, reason: collision with root package name */
    private float f21350m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21351n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21352o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21353p;

    public ATRotationView(Context context) {
        super(context);
        this.f21344f = 40;
        this.f21345g = 20;
        this.f21346h = 0;
        this.i = 0;
        this.f21348k = 0;
        this.f21349l = 0.5f;
        this.f21350m = 0.9f;
        this.f21351n = true;
        this.f21352o = false;
        this.f21353p = false;
        this.f21339a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    private void a() {
        this.f21340b = new Camera();
        this.f21341c = new Matrix();
        setWillNotDraw(false);
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int i = ((this.f21346h * this.f21342d) / 2) / this.f21344f;
        a(canvas, i, height, 0);
        a(canvas, i, height, 1);
        if (Math.abs(this.f21346h) > this.f21344f / 2) {
            a(canvas, i, height, 3);
            a(canvas, i, height, 2);
        } else {
            a(canvas, i, height, 2);
            a(canvas, i, height, 3);
        }
    }

    private void c(int i) {
        this.i = i;
        int a9 = Math.abs(this.f21346h) > this.f21344f / 2 ? a(2) : a(3);
        if (this.f21348k != a9) {
            this.f21348k = a9;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f21352o) {
            int height = getHeight() / 2;
            int i = ((this.f21346h * this.f21342d) / 2) / this.f21344f;
            a(canvas, i, height, 0);
            a(canvas, i, height, 1);
            if (Math.abs(this.f21346h) > this.f21344f / 2) {
                a(canvas, i, height, 3);
                a(canvas, i, height, 2);
                return;
            } else {
                a(canvas, i, height, 2);
                a(canvas, i, height, 3);
                return;
            }
        }
        int width = getWidth() / 2;
        int i6 = ((this.f21346h * this.f21343e) / 2) / this.f21344f;
        b(canvas, i6, width, 0);
        b(canvas, i6, width, 1);
        if (Math.abs(this.f21346h) > this.f21344f / 2) {
            b(canvas, i6, width, 3);
            b(canvas, i6, width, 2);
        } else {
            b(canvas, i6, width, 2);
            b(canvas, i6, width, 3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        int i11 = i9 - i;
        float f3 = i11;
        float f9 = this.f21349l;
        int i12 = (int) (((1.0f - f9) * f3) / 2.0f);
        int i13 = i10 - i6;
        float f10 = i13;
        float f11 = this.f21350m;
        int i14 = (int) (((1.0f - f11) * f10) / 2.0f);
        this.f21342d = (int) (f10 * f11);
        this.f21343e = (int) (f3 * f9);
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            childAt.layout(i12, i14, i11 - i12, i13 - i14);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i16 = layoutParams.width;
            int i17 = this.f21343e;
            if (i16 != i17) {
                layoutParams.width = i17;
                layoutParams.height = this.f21342d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z3) {
        if (z3) {
            postDelayed(this.f21339a, 1000 / this.f21345g);
        }
        this.f21351n = z3;
    }

    public void setHeightRatio(float f3) {
        this.f21350m = f3;
    }

    public void setRotateV(boolean z3) {
        this.f21352o = z3;
        invalidate();
    }

    public void setWidthRatio(float f3) {
        this.f21349l = f3;
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int i = ((this.f21346h * this.f21343e) / 2) / this.f21344f;
        b(canvas, i, width, 0);
        b(canvas, i, width, 1);
        if (Math.abs(this.f21346h) > this.f21344f / 2) {
            b(canvas, i, width, 3);
            b(canvas, i, width, 2);
        } else {
            b(canvas, i, width, 2);
            b(canvas, i, width, 3);
        }
    }

    private void b() {
        int a9;
        if (getChildCount() == 0) {
            return;
        }
        int i = this.f21346h - 1;
        this.f21346h = i;
        int i6 = this.i;
        this.f21347j = i6;
        int i9 = this.f21344f;
        int i10 = i6 - (i / i9);
        int i11 = i % i9;
        this.f21346h = i11;
        this.i = i10;
        if (Math.abs(i11) > this.f21344f / 2) {
            a9 = a(2);
        } else {
            a9 = a(3);
        }
        if (this.f21348k != a9) {
            this.f21348k = a9;
        }
        invalidate();
        if (this.f21351n) {
            postDelayed(this.f21339a, 1000 / this.f21345g);
        }
    }

    private void a(int i, int i6, int i9) {
        float f3 = (-i) / 2.0f;
        if (i9 == 0) {
            this.f21340b.translate(0.0f, f3, 0.0f);
            float f9 = -i6;
            this.f21340b.rotateX(f9);
            this.f21340b.translate(0.0f, f3, 0.0f);
            this.f21340b.translate(0.0f, f3, 0.0f);
            this.f21340b.rotateX(f9);
            this.f21340b.translate(0.0f, f3, 0.0f);
            return;
        }
        if (i9 == 1) {
            this.f21340b.translate(0.0f, f3, 0.0f);
            this.f21340b.rotateX(i6);
            this.f21340b.translate(0.0f, f3, 0.0f);
        } else if (i9 != 2) {
            if (i9 != 3) {
                return;
            }
            this.f21340b.rotateX(0.0f);
        } else {
            this.f21340b.translate(0.0f, f3, 0.0f);
            this.f21340b.rotateX(-i6);
            this.f21340b.translate(0.0f, f3, 0.0f);
        }
    }

    public ATRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21344f = 40;
        this.f21345g = 20;
        this.f21346h = 0;
        this.i = 0;
        this.f21348k = 0;
        this.f21349l = 0.5f;
        this.f21350m = 0.9f;
        this.f21351n = true;
        this.f21352o = false;
        this.f21353p = false;
        this.f21339a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    private void b(int i) {
        int a9;
        int i6 = this.f21344f;
        int i9 = this.f21347j - (i / i6);
        int i10 = i % i6;
        this.f21346h = i10;
        this.i = i9;
        if (Math.abs(i10) > this.f21344f / 2) {
            a9 = a(2);
        } else {
            a9 = a(3);
        }
        if (this.f21348k != a9) {
            this.f21348k = a9;
        }
        invalidate();
    }

    private void a(Canvas canvas, int i, int i6, int i9) {
        canvas.save();
        this.f21340b.save();
        this.f21341c.reset();
        float f3 = i;
        this.f21340b.translate(0.0f, f3, 0.0f);
        this.f21340b.rotateX(this.f21346h);
        this.f21340b.translate(0.0f, f3, 0.0f);
        if (i == 0) {
            if (this.f21353p) {
                a(this.f21342d, this.f21344f, i9);
            } else {
                a(-this.f21342d, -this.f21344f, i9);
            }
        } else if (i > 0) {
            a(this.f21342d, this.f21344f, i9);
        } else if (i < 0) {
            a(-this.f21342d, -this.f21344f, i9);
        }
        this.f21340b.getMatrix(this.f21341c);
        this.f21340b.restore();
        this.f21341c.preTranslate((-getWidth()) / 2, -i6);
        this.f21341c.postTranslate(getWidth() / 2, i6);
        canvas.concat(this.f21341c);
        View childAt = getChildAt(a(i9));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public ATRotationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21344f = 40;
        this.f21345g = 20;
        this.f21346h = 0;
        this.i = 0;
        this.f21348k = 0;
        this.f21349l = 0.5f;
        this.f21350m = 0.9f;
        this.f21351n = true;
        this.f21352o = false;
        this.f21353p = false;
        this.f21339a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    private void b(int i, int i6, int i9) {
        if (i9 == 0) {
            float f3 = (-i) / 2;
            this.f21340b.translate(f3, 0.0f, 0.0f);
            float f9 = -i6;
            this.f21340b.rotateY(f9);
            this.f21340b.translate(f3, 0.0f, 0.0f);
            this.f21340b.translate(f3, 0.0f, 0.0f);
            this.f21340b.rotateY(f9);
            this.f21340b.translate(f3, 0.0f, 0.0f);
            return;
        }
        if (i9 == 1) {
            float f10 = i / 2;
            this.f21340b.translate(f10, 0.0f, 0.0f);
            this.f21340b.rotateY(i6);
            this.f21340b.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i9 != 2) {
            if (i9 != 3) {
                return;
            }
            this.f21340b.rotateY(0.0f);
        } else {
            float f11 = (-i) / 2;
            this.f21340b.translate(f11, 0.0f, 0.0f);
            this.f21340b.rotateY(-i6);
            this.f21340b.translate(f11, 0.0f, 0.0f);
        }
    }

    private int a(int i) {
        int i6;
        int i9;
        int i10;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    i6 = i != 3 ? 0 : this.i;
                } else if (this.f21353p) {
                    i9 = this.i;
                    i6 = i9 - 1;
                } else {
                    i10 = this.i;
                    i6 = i10 + 1;
                }
            } else if (this.f21353p) {
                i10 = this.i;
                i6 = i10 + 1;
            } else {
                i9 = this.i;
                i6 = i9 - 1;
            }
        } else if (this.f21353p) {
            i6 = this.i - 2;
        } else {
            i6 = this.i + 2;
        }
        int childCount = i6 % getChildCount();
        return childCount >= 0 ? childCount : getChildCount() + childCount;
    }

    private void b(Canvas canvas, int i, int i6, int i9) {
        canvas.save();
        this.f21340b.save();
        this.f21341c.reset();
        float f3 = i;
        this.f21340b.translate(f3, 0.0f, 0.0f);
        this.f21340b.rotateY(this.f21346h);
        this.f21340b.translate(f3, 0.0f, 0.0f);
        if (i == 0) {
            if (this.f21353p) {
                b(this.f21343e, this.f21344f, i9);
            } else {
                b(-this.f21343e, -this.f21344f, i9);
            }
        } else if (i > 0) {
            b(this.f21343e, this.f21344f, i9);
        } else if (i < 0) {
            b(-this.f21343e, -this.f21344f, i9);
        }
        this.f21340b.getMatrix(this.f21341c);
        this.f21340b.restore();
        this.f21341c.preTranslate(-i6, (-getHeight()) / 2);
        this.f21341c.postTranslate(i6, getHeight() / 2);
        canvas.concat(this.f21341c);
        View childAt = getChildAt(a(i9));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public static /* synthetic */ void a(ATRotationView aTRotationView) {
        int a9;
        if (aTRotationView.getChildCount() != 0) {
            int i = aTRotationView.f21346h - 1;
            aTRotationView.f21346h = i;
            int i6 = aTRotationView.i;
            aTRotationView.f21347j = i6;
            int i9 = aTRotationView.f21344f;
            int i10 = i6 - (i / i9);
            int i11 = i % i9;
            aTRotationView.f21346h = i11;
            aTRotationView.i = i10;
            if (Math.abs(i11) > aTRotationView.f21344f / 2) {
                a9 = aTRotationView.a(2);
            } else {
                a9 = aTRotationView.a(3);
            }
            if (aTRotationView.f21348k != a9) {
                aTRotationView.f21348k = a9;
            }
            aTRotationView.invalidate();
            if (aTRotationView.f21351n) {
                aTRotationView.postDelayed(aTRotationView.f21339a, 1000 / aTRotationView.f21345g);
            }
        }
    }
}
