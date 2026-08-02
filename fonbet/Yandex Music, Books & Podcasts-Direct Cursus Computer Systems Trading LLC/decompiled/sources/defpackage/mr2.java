package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class mr2 extends LinearLayout {
    public static final /* synthetic */ int w = 0;
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;
    public int[] g;
    public int[] h;
    public float[] i;
    public int j;
    public int k;
    public int l;
    public ValueAnimator m;
    public final Paint n;
    public final Path o;
    public final RectF p;
    public final int q;
    public final int r;
    public boolean s;
    public float t;
    public int u;
    public ir2 v;

    public mr2(Context context, int i, int i2) {
        super(context);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0;
        this.j = -1;
        this.k = -1;
        this.t = 1.0f;
        this.u = -1;
        this.v = ir2.a;
        setId(R.id.tab_sliding_oval_indicator);
        setWillNotDraw(false);
        int childCount = getChildCount();
        this.l = childCount;
        if (this.s) {
            this.l = (childCount + 1) / 2;
        }
        d(this.l);
        Paint paint = new Paint();
        this.n = paint;
        paint.setAntiAlias(true);
        this.p = new RectF();
        this.q = i;
        this.r = i2;
        this.o = new Path();
        this.i = new float[8];
    }

    public final void a(int i, long j) {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.m.cancel();
            j = Math.round((1.0f - this.m.getAnimatedFraction()) * this.m.getDuration());
        }
        View childAt = getChildAt(c(i));
        if (childAt == null) {
            e();
            return;
        }
        int ordinal = this.v.ordinal();
        if (ordinal == 0) {
            final int i2 = this.j;
            final int i3 = this.k;
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (i2 == left && i3 == right) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(qr2.G);
            ofFloat.setDuration(j);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kr2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float animatedFraction = valueAnimator2.getAnimatedFraction();
                    int i4 = left;
                    int round = Math.round((i4 - r1) * animatedFraction) + i2;
                    int i5 = right;
                    int round2 = Math.round(animatedFraction * (i5 - r2)) + i3;
                    mr2 mr2Var = mr2.this;
                    if (round != mr2Var.j || round2 != mr2Var.k) {
                        mr2Var.j = round;
                        mr2Var.k = round2;
                        WeakHashMap weakHashMap = wdu.a;
                        mr2Var.postInvalidateOnAnimation();
                    }
                    WeakHashMap weakHashMap2 = wdu.a;
                    mr2Var.postInvalidateOnAnimation();
                }
            });
            ofFloat.addListener(new lr2(this, 0));
            this.u = i;
            this.m = ofFloat;
            ofFloat.start();
            return;
        }
        if (ordinal != 1) {
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.m.cancel();
            }
            this.d = i;
            this.e = 0.0f;
            e();
            f();
            return;
        }
        if (i != this.d) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.setInterpolator(qr2.G);
            ofFloat2.setDuration(j);
            ofFloat2.addUpdateListener(new hr2(1, this));
            ofFloat2.addListener(new lr2(this, 1));
            this.u = i;
            this.m = ofFloat2;
            ofFloat2.start();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (i < 0) {
            i = childCount;
        }
        if (i != 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = this.f;
            super.addView(view, i, marginLayoutParams);
            return;
        }
        if (childCount != 0) {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams2.leftMargin = this.f;
            updateViewLayout(childAt, marginLayoutParams2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams3.leftMargin = 0;
        super.addView(view, i, marginLayoutParams3);
    }

    public final void b(Canvas canvas, int i, int i2, float f, int i3, float f2) {
        if (i < 0 || i2 <= i) {
            return;
        }
        RectF rectF = this.p;
        rectF.set(i, this.q, i2, f - this.r);
        float width = rectF.width();
        float height = rectF.height();
        float[] fArr = new float[8];
        for (int i4 = 0; i4 < 8; i4++) {
            float f3 = this.i[i4];
            float f4 = 0.0f;
            if (height > 0.0f && width > 0.0f) {
                f4 = Math.min(height, width) / 2.0f;
                if (f3 != -1.0f) {
                    f4 = Math.min(f3, f4);
                }
            }
            fArr[i4] = f4;
        }
        Path path = this.o;
        path.reset();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Paint paint = this.n;
        paint.setColor(i3);
        paint.setAlpha(Math.round(paint.getAlpha() * f2));
        canvas.drawPath(path, paint);
    }

    public final int c(int i) {
        return (!this.s || i == -1) ? i : i * 2;
    }

    public final void d(int i) {
        this.l = i;
        this.g = new int[i];
        this.h = new int[i];
        for (int i2 = 0; i2 < this.l; i2++) {
            this.g[i2] = -1;
            this.h[i2] = -1;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float height = getHeight();
        if (this.c != -1) {
            int i = this.l;
            for (int i2 = 0; i2 < i; i2++) {
                b(canvas, this.g[i2], this.h[i2], height, this.c, 1.0f);
            }
        }
        if (this.b != -1) {
            int c = c(this.d);
            int c2 = c(this.u);
            int ordinal = this.v.ordinal();
            if (ordinal != 0) {
                int[] iArr = this.g;
                if (ordinal != 1) {
                    b(canvas, iArr[c], this.h[c], height, this.b, 1.0f);
                } else {
                    b(canvas, iArr[c], this.h[c], height, this.b, this.t);
                    if (this.u != -1) {
                        b(canvas, this.g[c2], this.h[c2], height, this.b, 1.0f - this.t);
                    }
                }
            } else {
                b(canvas, this.j, this.k, height, this.b, 1.0f);
            }
        }
        super.draw(canvas);
    }

    public final void e() {
        int i;
        int i2;
        int i3;
        int i4;
        int childCount = getChildCount();
        if (childCount != this.l) {
            d(childCount);
        }
        int c = c(this.d);
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt instanceof b2s) {
                if (childAt.getWidth() > 0) {
                    int left = childAt.getLeft();
                    i2 = childAt.getRight();
                    if (this.v != ir2.a || i5 != c || this.e <= 0.0f || i5 >= childCount - 1) {
                        i3 = left;
                        i4 = i3;
                        i = i2;
                    } else {
                        View childAt2 = getChildAt(this.s ? i5 + 2 : i5 + 1);
                        float left2 = this.e * childAt2.getLeft();
                        float f = this.e;
                        i4 = (int) (((1.0f - f) * left) + left2);
                        int right = (int) (((1.0f - this.e) * i2) + (f * childAt2.getRight()));
                        i3 = left;
                        i = right;
                    }
                } else {
                    i = -1;
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                }
                int[] iArr = this.g;
                int i6 = iArr[i5];
                int[] iArr2 = this.h;
                int i7 = iArr2[i5];
                if (i3 != i6 || i2 != i7) {
                    iArr[i5] = i3;
                    iArr2[i5] = i2;
                    WeakHashMap weakHashMap = wdu.a;
                    postInvalidateOnAnimation();
                }
                if (i5 == c && (i4 != this.j || i != this.k)) {
                    this.j = i4;
                    this.k = i;
                    WeakHashMap weakHashMap2 = wdu.a;
                    postInvalidateOnAnimation();
                }
            }
        }
    }

    public final void f() {
        float f = 1.0f - this.e;
        if (f != this.t) {
            this.t = f;
            int i = this.d + 1;
            if (i >= this.l) {
                i = -1;
            }
            this.u = i;
            WeakHashMap weakHashMap = wdu.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e();
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.m.cancel();
        a(this.u, Math.round((1.0f - this.m.getAnimatedFraction()) * this.m.getDuration()));
    }
}
