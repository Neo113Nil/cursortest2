package t0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: t0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5016k extends AbstractC4987B {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f40693C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f40694D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f40695A;

    /* renamed from: B, reason: collision with root package name */
    public final p3.b f40696B;

    /* renamed from: a, reason: collision with root package name */
    public final int f40697a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40698b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f40699c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f40700d;

    /* renamed from: e, reason: collision with root package name */
    public final int f40701e;

    /* renamed from: f, reason: collision with root package name */
    public final int f40702f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f40703g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f40704h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f40705j;

    /* renamed from: k, reason: collision with root package name */
    public int f40706k;

    /* renamed from: l, reason: collision with root package name */
    public int f40707l;

    /* renamed from: m, reason: collision with root package name */
    public float f40708m;

    /* renamed from: n, reason: collision with root package name */
    public int f40709n;

    /* renamed from: o, reason: collision with root package name */
    public int f40710o;

    /* renamed from: p, reason: collision with root package name */
    public float f40711p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f40714s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f40721z;

    /* renamed from: q, reason: collision with root package name */
    public int f40712q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f40713r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f40715t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f40716u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f40717v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f40718w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f40719x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f40720y = new int[2];

    public C5016k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i6, int i9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f40721z = ofFloat;
        this.f40695A = 0;
        p3.b bVar = new p3.b(5, this);
        this.f40696B = bVar;
        C5014i c5014i = new C5014i(this);
        this.f40699c = stateListDrawable;
        this.f40700d = drawable;
        this.f40703g = stateListDrawable2;
        this.f40704h = drawable2;
        this.f40701e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f40702f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f40705j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f40697a = i6;
        this.f40698b = i9;
        stateListDrawable.setAlpha(com.anythink.basead.exoplayer.k.p.f8473b);
        drawable.setAlpha(com.anythink.basead.exoplayer.k.p.f8473b);
        ofFloat.addListener(new C5015j(this));
        ofFloat.addUpdateListener(new H3.C(2, this));
        RecyclerView recyclerView2 = this.f40714s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC4990E abstractC4990E = recyclerView2.f5218E;
            if (abstractC4990E != null) {
                abstractC4990E.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f5220F;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f40714s;
            recyclerView3.f5222G.remove(this);
            if (recyclerView3.f5224H == this) {
                recyclerView3.f5224H = null;
            }
            ArrayList arrayList2 = this.f40714s.f5230K0;
            if (arrayList2 != null) {
                arrayList2.remove(c5014i);
            }
            this.f40714s.removeCallbacks(bVar);
        }
        this.f40714s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f40714s.f5222G.add(this);
            this.f40714s.h(c5014i);
        }
    }

    public static int e(float f3, float f9, int[] iArr, int i, int i6, int i9) {
        int i10 = iArr[1] - iArr[0];
        if (i10 != 0) {
            int i11 = i - i9;
            int i12 = (int) (((f9 - f3) / i10) * i11);
            int i13 = i6 + i12;
            if (i13 < i11 && i13 >= 0) {
                return i12;
            }
        }
        return 0;
    }

    @Override // t0.AbstractC4987B
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f40712q;
        RecyclerView recyclerView2 = this.f40714s;
        if (i != recyclerView2.getWidth() || this.f40713r != recyclerView2.getHeight()) {
            this.f40712q = recyclerView2.getWidth();
            this.f40713r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f40695A != 0) {
            if (this.f40715t) {
                int i6 = this.f40712q;
                int i9 = this.f40701e;
                int i10 = i6 - i9;
                int i11 = this.f40707l;
                int i12 = this.f40706k;
                int i13 = i11 - (i12 / 2);
                StateListDrawable stateListDrawable = this.f40699c;
                stateListDrawable.setBounds(0, 0, i9, i12);
                int i14 = this.f40713r;
                int i15 = this.f40702f;
                Drawable drawable = this.f40700d;
                drawable.setBounds(0, 0, i15, i14);
                WeakHashMap weakHashMap = O.X.f2054a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i9, i13);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i9, -i13);
                } else {
                    canvas.translate(i10, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i13);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i10, -i13);
                }
            }
            if (this.f40716u) {
                int i16 = this.f40713r;
                int i17 = this.i;
                int i18 = i16 - i17;
                int i19 = this.f40710o;
                int i20 = this.f40709n;
                int i21 = i19 - (i20 / 2);
                StateListDrawable stateListDrawable2 = this.f40703g;
                stateListDrawable2.setBounds(0, 0, i20, i17);
                int i22 = this.f40712q;
                int i23 = this.f40705j;
                Drawable drawable2 = this.f40704h;
                drawable2.setBounds(0, 0, i22, i23);
                canvas.translate(0.0f, i18);
                drawable2.draw(canvas);
                canvas.translate(i21, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i21, -i18);
            }
        }
    }

    public final boolean c(float f3, float f9) {
        if (f9 < this.f40713r - this.i) {
            return false;
        }
        int i = this.f40710o;
        int i6 = this.f40709n;
        return f3 >= ((float) (i - (i6 / 2))) && f3 <= ((float) ((i6 / 2) + i));
    }

    public final boolean d(float f3, float f9) {
        RecyclerView recyclerView = this.f40714s;
        WeakHashMap weakHashMap = O.X.f2054a;
        boolean z3 = recyclerView.getLayoutDirection() == 1;
        int i = this.f40701e;
        if (!z3 ? f3 >= this.f40712q - i : f3 <= i / 2) {
            int i6 = this.f40707l;
            int i9 = this.f40706k / 2;
            if (f9 >= i6 - i9 && f9 <= i9 + i6) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        p3.b bVar = this.f40696B;
        StateListDrawable stateListDrawable = this.f40699c;
        if (i == 2 && this.f40717v != 2) {
            stateListDrawable.setState(f40693C);
            this.f40714s.removeCallbacks(bVar);
        }
        if (i == 0) {
            this.f40714s.invalidate();
        } else {
            g();
        }
        if (this.f40717v == 2 && i != 2) {
            stateListDrawable.setState(f40694D);
            this.f40714s.removeCallbacks(bVar);
            this.f40714s.postDelayed(bVar, 1200);
        } else if (i == 1) {
            this.f40714s.removeCallbacks(bVar);
            this.f40714s.postDelayed(bVar, 1500);
        }
        this.f40717v = i;
    }

    public final void g() {
        int i = this.f40695A;
        ValueAnimator valueAnimator = this.f40721z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f40695A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
