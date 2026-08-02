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
    Runnable f22126a;

    /* renamed from: b, reason: collision with root package name */
    private Camera f22127b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f22128c;

    /* renamed from: d, reason: collision with root package name */
    private int f22129d;

    /* renamed from: e, reason: collision with root package name */
    private int f22130e;

    /* renamed from: f, reason: collision with root package name */
    private int f22131f;

    /* renamed from: g, reason: collision with root package name */
    private int f22132g;

    /* renamed from: h, reason: collision with root package name */
    private int f22133h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f22134j;

    /* renamed from: k, reason: collision with root package name */
    private int f22135k;

    /* renamed from: l, reason: collision with root package name */
    private float f22136l;

    /* renamed from: m, reason: collision with root package name */
    private float f22137m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f22138n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22139o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f22140p;

    public ATRotationView(Context context) {
        super(context);
        this.f22131f = 40;
        this.f22132g = 20;
        this.f22133h = 0;
        this.i = 0;
        this.f22135k = 0;
        this.f22136l = 0.5f;
        this.f22137m = 0.9f;
        this.f22138n = true;
        this.f22139o = false;
        this.f22140p = false;
        this.f22126a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    private void a() {
        this.f22127b = new Camera();
        this.f22128c = new Matrix();
        setWillNotDraw(false);
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int i = ((this.f22133h * this.f22129d) / 2) / this.f22131f;
        a(canvas, i, height, 0);
        a(canvas, i, height, 1);
        if (Math.abs(this.f22133h) > this.f22131f / 2) {
            a(canvas, i, height, 3);
            a(canvas, i, height, 2);
        } else {
            a(canvas, i, height, 2);
            a(canvas, i, height, 3);
        }
    }

    private void c(int i) {
        this.i = i;
        int a9 = Math.abs(this.f22133h) > this.f22131f / 2 ? a(2) : a(3);
        if (this.f22135k != a9) {
            this.f22135k = a9;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f22139o) {
            int height = getHeight() / 2;
            int i = ((this.f22133h * this.f22129d) / 2) / this.f22131f;
            a(canvas, i, height, 0);
            a(canvas, i, height, 1);
            if (Math.abs(this.f22133h) > this.f22131f / 2) {
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
        int i4 = ((this.f22133h * this.f22130e) / 2) / this.f22131f;
        b(canvas, i4, width, 0);
        b(canvas, i4, width, 1);
        if (Math.abs(this.f22133h) > this.f22131f / 2) {
            b(canvas, i4, width, 3);
            b(canvas, i4, width, 2);
        } else {
            b(canvas, i4, width, 2);
            b(canvas, i4, width, 3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        int i10 = i6 - i;
        float f2 = i10;
        float f9 = this.f22136l;
        int i11 = (int) (((1.0f - f9) * f2) / 2.0f);
        int i12 = i9 - i4;
        float f10 = i12;
        float f11 = this.f22137m;
        int i13 = (int) (((1.0f - f11) * f10) / 2.0f);
        this.f22129d = (int) (f10 * f11);
        this.f22130e = (int) (f2 * f9);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(i11, i13, i10 - i11, i12 - i13);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = this.f22130e;
            if (i15 != i16) {
                layoutParams.width = i16;
                layoutParams.height = this.f22129d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z6) {
        if (z6) {
            postDelayed(this.f22126a, 1000 / this.f22132g);
        }
        this.f22138n = z6;
    }

    public void setHeightRatio(float f2) {
        this.f22137m = f2;
    }

    public void setRotateV(boolean z6) {
        this.f22139o = z6;
        invalidate();
    }

    public void setWidthRatio(float f2) {
        this.f22136l = f2;
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int i = ((this.f22133h * this.f22130e) / 2) / this.f22131f;
        b(canvas, i, width, 0);
        b(canvas, i, width, 1);
        if (Math.abs(this.f22133h) > this.f22131f / 2) {
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
        int i = this.f22133h - 1;
        this.f22133h = i;
        int i4 = this.i;
        this.f22134j = i4;
        int i6 = this.f22131f;
        int i9 = i4 - (i / i6);
        int i10 = i % i6;
        this.f22133h = i10;
        this.i = i9;
        if (Math.abs(i10) > this.f22131f / 2) {
            a9 = a(2);
        } else {
            a9 = a(3);
        }
        if (this.f22135k != a9) {
            this.f22135k = a9;
        }
        invalidate();
        if (this.f22138n) {
            postDelayed(this.f22126a, 1000 / this.f22132g);
        }
    }

    private void a(int i, int i4, int i6) {
        float f2 = (-i) / 2.0f;
        if (i6 == 0) {
            this.f22127b.translate(0.0f, f2, 0.0f);
            float f9 = -i4;
            this.f22127b.rotateX(f9);
            this.f22127b.translate(0.0f, f2, 0.0f);
            this.f22127b.translate(0.0f, f2, 0.0f);
            this.f22127b.rotateX(f9);
            this.f22127b.translate(0.0f, f2, 0.0f);
            return;
        }
        if (i6 == 1) {
            this.f22127b.translate(0.0f, f2, 0.0f);
            this.f22127b.rotateX(i4);
            this.f22127b.translate(0.0f, f2, 0.0f);
        } else if (i6 != 2) {
            if (i6 != 3) {
                return;
            }
            this.f22127b.rotateX(0.0f);
        } else {
            this.f22127b.translate(0.0f, f2, 0.0f);
            this.f22127b.rotateX(-i4);
            this.f22127b.translate(0.0f, f2, 0.0f);
        }
    }

    public ATRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22131f = 40;
        this.f22132g = 20;
        this.f22133h = 0;
        this.i = 0;
        this.f22135k = 0;
        this.f22136l = 0.5f;
        this.f22137m = 0.9f;
        this.f22138n = true;
        this.f22139o = false;
        this.f22140p = false;
        this.f22126a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    private void b(int i) {
        int a9;
        int i4 = this.f22131f;
        int i6 = this.f22134j - (i / i4);
        int i9 = i % i4;
        this.f22133h = i9;
        this.i = i6;
        if (Math.abs(i9) > this.f22131f / 2) {
            a9 = a(2);
        } else {
            a9 = a(3);
        }
        if (this.f22135k != a9) {
            this.f22135k = a9;
        }
        invalidate();
    }

    private void a(Canvas canvas, int i, int i4, int i6) {
        canvas.save();
        this.f22127b.save();
        this.f22128c.reset();
        float f2 = i;
        this.f22127b.translate(0.0f, f2, 0.0f);
        this.f22127b.rotateX(this.f22133h);
        this.f22127b.translate(0.0f, f2, 0.0f);
        if (i == 0) {
            if (this.f22140p) {
                a(this.f22129d, this.f22131f, i6);
            } else {
                a(-this.f22129d, -this.f22131f, i6);
            }
        } else if (i > 0) {
            a(this.f22129d, this.f22131f, i6);
        } else if (i < 0) {
            a(-this.f22129d, -this.f22131f, i6);
        }
        this.f22127b.getMatrix(this.f22128c);
        this.f22127b.restore();
        this.f22128c.preTranslate((-getWidth()) / 2, -i4);
        this.f22128c.postTranslate(getWidth() / 2, i4);
        canvas.concat(this.f22128c);
        View childAt = getChildAt(a(i6));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public ATRotationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22131f = 40;
        this.f22132g = 20;
        this.f22133h = 0;
        this.i = 0;
        this.f22135k = 0;
        this.f22136l = 0.5f;
        this.f22137m = 0.9f;
        this.f22138n = true;
        this.f22139o = false;
        this.f22140p = false;
        this.f22126a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    private void b(int i, int i4, int i6) {
        if (i6 == 0) {
            float f2 = (-i) / 2;
            this.f22127b.translate(f2, 0.0f, 0.0f);
            float f9 = -i4;
            this.f22127b.rotateY(f9);
            this.f22127b.translate(f2, 0.0f, 0.0f);
            this.f22127b.translate(f2, 0.0f, 0.0f);
            this.f22127b.rotateY(f9);
            this.f22127b.translate(f2, 0.0f, 0.0f);
            return;
        }
        if (i6 == 1) {
            float f10 = i / 2;
            this.f22127b.translate(f10, 0.0f, 0.0f);
            this.f22127b.rotateY(i4);
            this.f22127b.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i6 != 2) {
            if (i6 != 3) {
                return;
            }
            this.f22127b.rotateY(0.0f);
        } else {
            float f11 = (-i) / 2;
            this.f22127b.translate(f11, 0.0f, 0.0f);
            this.f22127b.rotateY(-i4);
            this.f22127b.translate(f11, 0.0f, 0.0f);
        }
    }

    private int a(int i) {
        int i4;
        int i6;
        int i9;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    i4 = i != 3 ? 0 : this.i;
                } else if (this.f22140p) {
                    i6 = this.i;
                    i4 = i6 - 1;
                } else {
                    i9 = this.i;
                    i4 = i9 + 1;
                }
            } else if (this.f22140p) {
                i9 = this.i;
                i4 = i9 + 1;
            } else {
                i6 = this.i;
                i4 = i6 - 1;
            }
        } else if (this.f22140p) {
            i4 = this.i - 2;
        } else {
            i4 = this.i + 2;
        }
        int childCount = i4 % getChildCount();
        return childCount >= 0 ? childCount : getChildCount() + childCount;
    }

    private void b(Canvas canvas, int i, int i4, int i6) {
        canvas.save();
        this.f22127b.save();
        this.f22128c.reset();
        float f2 = i;
        this.f22127b.translate(f2, 0.0f, 0.0f);
        this.f22127b.rotateY(this.f22133h);
        this.f22127b.translate(f2, 0.0f, 0.0f);
        if (i == 0) {
            if (this.f22140p) {
                b(this.f22130e, this.f22131f, i6);
            } else {
                b(-this.f22130e, -this.f22131f, i6);
            }
        } else if (i > 0) {
            b(this.f22130e, this.f22131f, i6);
        } else if (i < 0) {
            b(-this.f22130e, -this.f22131f, i6);
        }
        this.f22127b.getMatrix(this.f22128c);
        this.f22127b.restore();
        this.f22128c.preTranslate(-i4, (-getHeight()) / 2);
        this.f22128c.postTranslate(i4, getHeight() / 2);
        canvas.concat(this.f22128c);
        View childAt = getChildAt(a(i6));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public static /* synthetic */ void a(ATRotationView aTRotationView) {
        int a9;
        if (aTRotationView.getChildCount() != 0) {
            int i = aTRotationView.f22133h - 1;
            aTRotationView.f22133h = i;
            int i4 = aTRotationView.i;
            aTRotationView.f22134j = i4;
            int i6 = aTRotationView.f22131f;
            int i9 = i4 - (i / i6);
            int i10 = i % i6;
            aTRotationView.f22133h = i10;
            aTRotationView.i = i9;
            if (Math.abs(i10) > aTRotationView.f22131f / 2) {
                a9 = aTRotationView.a(2);
            } else {
                a9 = aTRotationView.a(3);
            }
            if (aTRotationView.f22135k != a9) {
                aTRotationView.f22135k = a9;
            }
            aTRotationView.invalidate();
            if (aTRotationView.f22138n) {
                aTRotationView.postDelayed(aTRotationView.f22126a, 1000 / aTRotationView.f22132g);
            }
        }
    }
}
