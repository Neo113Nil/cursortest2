package com.gamericefishpro.space.g3;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.gamericefishpro.space.d4.d0;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.d4.o1;
import com.gamericefishpro.space.t0.f1;
import com.gamericefishpro.space.t0.p1;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.gamericefishpro.space.i2.a implements com.gamericefishpro.space.d4.p {
    public final Window B;
    public final f1 C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;

    public n(Context context, Window window) {
        super(context);
        this.B = window;
        this.C = com.gamericefishpro.space.t0.i.v(m.a);
        Field field = l0.a;
        d0.i(this, this);
        l0.n(this, new com.gamericefishpro.space.f3.b(this, 1));
    }

    @Override // com.gamericefishpro.space.i2.a
    public final void a(com.gamericefishpro.space.t0.r rVar, int i) {
        rVar.b0(1735448596);
        int i2 = (rVar.h(this) ? 4 : 2) | i;
        if (rVar.S(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) this.C.getValue()).invoke(rVar, 0);
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new e(this, i, 1);
        }
    }

    @Override // com.gamericefishpro.space.i2.a
    public final void d(int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // com.gamericefishpro.space.i2.a
    public final void e(int i, int i2) {
        int iA;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.e(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.B;
        if (mode != Integer.MIN_VALUE || this.D || window.getAttributes().height != -2) {
            iA = size2;
        } else if (this.E) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iA = i.a.a(window);
            } else if (i3 < 32) {
                iA = k.a.a(window);
            } else {
                iA = size2;
            }
        } else {
            iA = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iA - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.E || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.D) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // com.gamericefishpro.space.i2.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.G;
    }

    @Override // com.gamericefishpro.space.d4.p
    public final o1 l(View view, o1 o1Var) {
        if (!this.E) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return o1Var.a.n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return o1Var;
    }
}
