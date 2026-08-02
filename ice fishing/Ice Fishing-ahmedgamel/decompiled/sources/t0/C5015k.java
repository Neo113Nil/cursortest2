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
public final class C5015k extends AbstractC4985A {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f40743C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f40744D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f40745A;

    /* renamed from: B, reason: collision with root package name */
    public final r3.b f40746B;

    /* renamed from: a, reason: collision with root package name */
    public final int f40747a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40748b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f40749c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f40750d;

    /* renamed from: e, reason: collision with root package name */
    public final int f40751e;

    /* renamed from: f, reason: collision with root package name */
    public final int f40752f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f40753g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f40754h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f40755j;

    /* renamed from: k, reason: collision with root package name */
    public int f40756k;

    /* renamed from: l, reason: collision with root package name */
    public int f40757l;

    /* renamed from: m, reason: collision with root package name */
    public float f40758m;

    /* renamed from: n, reason: collision with root package name */
    public int f40759n;

    /* renamed from: o, reason: collision with root package name */
    public int f40760o;

    /* renamed from: p, reason: collision with root package name */
    public float f40761p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f40764s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f40771z;

    /* renamed from: q, reason: collision with root package name */
    public int f40762q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f40763r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f40765t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f40766u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f40767v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f40768w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f40769x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f40770y = new int[2];

    public C5015k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i4, int i6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f40771z = ofFloat;
        this.f40745A = 0;
        r3.b bVar = new r3.b(5, this);
        this.f40746B = bVar;
        C5013i c5013i = new C5013i(this);
        this.f40749c = stateListDrawable;
        this.f40750d = drawable;
        this.f40753g = stateListDrawable2;
        this.f40754h = drawable2;
        this.f40751e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f40752f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f40755j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f40747a = i4;
        this.f40748b = i6;
        stateListDrawable.setAlpha(com.anythink.basead.exoplayer.k.p.f9259b);
        drawable.setAlpha(com.anythink.basead.exoplayer.k.p.f9259b);
        ofFloat.addListener(new C5014j(this));
        ofFloat.addUpdateListener(new J3.C(2, this));
        RecyclerView recyclerView2 = this.f40764s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC4987C abstractC4987C = recyclerView2.f5185E;
            if (abstractC4987C != null) {
                abstractC4987C.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f5187F;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f40764s;
            recyclerView3.f5189G.remove(this);
            if (recyclerView3.f5191H == this) {
                recyclerView3.f5191H = null;
            }
            ArrayList arrayList2 = this.f40764s.f5188F0;
            if (arrayList2 != null) {
                arrayList2.remove(c5013i);
            }
            this.f40764s.removeCallbacks(bVar);
        }
        this.f40764s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f40764s.f5189G.add(this);
            this.f40764s.h(c5013i);
        }
    }

    public static int e(float f2, float f9, int[] iArr, int i, int i4, int i6) {
        int i9 = iArr[1] - iArr[0];
        if (i9 != 0) {
            int i10 = i - i6;
            int i11 = (int) (((f9 - f2) / i9) * i10);
            int i12 = i4 + i11;
            if (i12 < i10 && i12 >= 0) {
                return i11;
            }
        }
        return 0;
    }

    @Override // t0.AbstractC4985A
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f40762q;
        RecyclerView recyclerView2 = this.f40764s;
        if (i != recyclerView2.getWidth() || this.f40763r != recyclerView2.getHeight()) {
            this.f40762q = recyclerView2.getWidth();
            this.f40763r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f40745A != 0) {
            if (this.f40765t) {
                int i4 = this.f40762q;
                int i6 = this.f40751e;
                int i9 = i4 - i6;
                int i10 = this.f40757l;
                int i11 = this.f40756k;
                int i12 = i10 - (i11 / 2);
                StateListDrawable stateListDrawable = this.f40749c;
                stateListDrawable.setBounds(0, 0, i6, i11);
                int i13 = this.f40763r;
                int i14 = this.f40752f;
                Drawable drawable = this.f40750d;
                drawable.setBounds(0, 0, i14, i13);
                WeakHashMap weakHashMap = O.X.f2142a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i6, i12);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i6, -i12);
                } else {
                    canvas.translate(i9, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i12);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i9, -i12);
                }
            }
            if (this.f40766u) {
                int i15 = this.f40763r;
                int i16 = this.i;
                int i17 = i15 - i16;
                int i18 = this.f40760o;
                int i19 = this.f40759n;
                int i20 = i18 - (i19 / 2);
                StateListDrawable stateListDrawable2 = this.f40753g;
                stateListDrawable2.setBounds(0, 0, i19, i16);
                int i21 = this.f40762q;
                int i22 = this.f40755j;
                Drawable drawable2 = this.f40754h;
                drawable2.setBounds(0, 0, i21, i22);
                canvas.translate(0.0f, i17);
                drawable2.draw(canvas);
                canvas.translate(i20, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i20, -i17);
            }
        }
    }

    public final boolean c(float f2, float f9) {
        if (f9 < this.f40763r - this.i) {
            return false;
        }
        int i = this.f40760o;
        int i4 = this.f40759n;
        return f2 >= ((float) (i - (i4 / 2))) && f2 <= ((float) ((i4 / 2) + i));
    }

    public final boolean d(float f2, float f9) {
        RecyclerView recyclerView = this.f40764s;
        WeakHashMap weakHashMap = O.X.f2142a;
        boolean z6 = recyclerView.getLayoutDirection() == 1;
        int i = this.f40751e;
        if (!z6 ? f2 >= this.f40762q - i : f2 <= i / 2) {
            int i4 = this.f40757l;
            int i6 = this.f40756k / 2;
            if (f9 >= i4 - i6 && f9 <= i6 + i4) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        r3.b bVar = this.f40746B;
        StateListDrawable stateListDrawable = this.f40749c;
        if (i == 2 && this.f40767v != 2) {
            stateListDrawable.setState(f40743C);
            this.f40764s.removeCallbacks(bVar);
        }
        if (i == 0) {
            this.f40764s.invalidate();
        } else {
            g();
        }
        if (this.f40767v == 2 && i != 2) {
            stateListDrawable.setState(f40744D);
            this.f40764s.removeCallbacks(bVar);
            this.f40764s.postDelayed(bVar, 1200);
        } else if (i == 1) {
            this.f40764s.removeCallbacks(bVar);
            this.f40764s.postDelayed(bVar, 1500);
        }
        this.f40767v = i;
    }

    public final void g() {
        int i = this.f40745A;
        ValueAnimator valueAnimator = this.f40771z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f40745A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
