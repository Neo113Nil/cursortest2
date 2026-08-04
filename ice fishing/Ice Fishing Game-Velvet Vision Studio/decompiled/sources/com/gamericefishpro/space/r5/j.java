package com.gamericefishpro.space.r5;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z {
    public static final int[] x = {R.attr.state_pressed};
    public static final int[] y = new int[0];
    public final int a;
    public final StateListDrawable b;
    public final Drawable c;
    public final int d;
    public final int e;
    public final StateListDrawable f;
    public final Drawable g;
    public final int h;
    public final int i;
    public float j;
    public float k;
    public final RecyclerView n;
    public final ValueAnimator u;
    public int v;
    public final com.gamericefishpro.space.h4.b w;
    public int l = 0;
    public int m = 0;
    public final boolean o = false;
    public final boolean p = false;
    public int q = 0;
    public int r = 0;
    public final int[] s = new int[2];
    public final int[] t = new int[2];

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.u = valueAnimatorOfFloat;
        this.v = 0;
        com.gamericefishpro.space.h4.b bVar = new com.gamericefishpro.space.h4.b(16, this);
        this.w = bVar;
        h hVar = new h();
        this.b = stateListDrawable;
        this.c = drawable;
        this.f = stateListDrawable2;
        this.g = drawable2;
        this.d = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.e = Math.max(i, drawable.getIntrinsicWidth());
        this.h = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.i = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new i(this));
        valueAnimatorOfFloat.addUpdateListener(new com.gamericefishpro.space.na.x(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.E;
            b0 b0Var = recyclerView2.C;
            if (b0Var != null) {
                b0Var.b("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.v();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.n;
            recyclerView3.F.remove(this);
            if (recyclerView3.G == this) {
                recyclerView3.G = null;
            }
            ArrayList arrayList2 = this.n.u0;
            if (arrayList2 != null) {
                arrayList2.remove(hVar);
            }
            this.n.removeCallbacks(bVar);
        }
        this.n = recyclerView;
        ArrayList arrayList3 = recyclerView.E;
        b0 b0Var2 = recyclerView.C;
        if (b0Var2 != null) {
            b0Var2.b("Cannot add item decoration during a scroll  or layout");
        }
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.v();
        recyclerView.requestLayout();
        this.n.F.add(this);
        RecyclerView recyclerView4 = this.n;
        if (recyclerView4.u0 == null) {
            recyclerView4.u0 = new ArrayList();
        }
        recyclerView4.u0.add(hVar);
    }

    public static int e(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // com.gamericefishpro.space.r5.z
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.l;
        RecyclerView recyclerView2 = this.n;
        if (i != recyclerView2.getWidth() || this.m != recyclerView2.getHeight()) {
            this.l = recyclerView2.getWidth();
            this.m = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.v != 0) {
            if (this.o) {
                int i2 = this.l;
                int i3 = this.d;
                int i4 = i2 - i3;
                int i5 = 0 - (0 / 2);
                StateListDrawable stateListDrawable = this.b;
                stateListDrawable.setBounds(0, 0, i3, 0);
                int i6 = this.e;
                int i7 = this.m;
                Drawable drawable = this.c;
                drawable.setBounds(0, 0, i6, i7);
                Field field = com.gamericefishpro.space.d4.l0.a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i5);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i5);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i5);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i5);
                }
            }
            if (this.p) {
                int i8 = this.m;
                int i9 = this.h;
                int i10 = i8 - i9;
                int i11 = 0 - (0 / 2);
                StateListDrawable stateListDrawable2 = this.f;
                stateListDrawable2.setBounds(0, 0, 0, i9);
                int i12 = this.l;
                int i13 = this.i;
                Drawable drawable2 = this.g;
                drawable2.setBounds(0, 0, i12, i13);
                canvas.translate(0.0f, i10);
                drawable2.draw(canvas);
                canvas.translate(i11, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i11, -i10);
            }
        }
    }

    public final boolean c(float f, float f2) {
        return f2 >= ((float) (this.m - this.h)) && f >= ((float) (0 - (0 / 2))) && f <= ((float) ((0 / 2) + 0));
    }

    public final boolean d(float f, float f2) {
        Field field = com.gamericefishpro.space.d4.l0.a;
        int layoutDirection = this.n.getLayoutDirection();
        int i = this.d;
        if (layoutDirection != 1 ? f >= this.l - i : f <= i) {
            int i2 = 0 / 2;
            if (f2 >= 0 - i2 && f2 <= i2 + 0) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        com.gamericefishpro.space.h4.b bVar = this.w;
        StateListDrawable stateListDrawable = this.b;
        if (i == 2 && this.q != 2) {
            stateListDrawable.setState(x);
            this.n.removeCallbacks(bVar);
        }
        if (i == 0) {
            this.n.invalidate();
        } else {
            g();
        }
        if (this.q == 2 && i != 2) {
            stateListDrawable.setState(y);
            this.n.removeCallbacks(bVar);
            this.n.postDelayed(bVar, 1200);
        } else if (i == 1) {
            this.n.removeCallbacks(bVar);
            this.n.postDelayed(bVar, 1500);
        }
        this.q = i;
    }

    public final void g() {
        int i = this.v;
        ValueAnimator valueAnimator = this.u;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
