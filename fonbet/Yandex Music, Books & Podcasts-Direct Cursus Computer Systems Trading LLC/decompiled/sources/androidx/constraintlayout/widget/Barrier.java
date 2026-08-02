package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import defpackage.a96;
import defpackage.aa6;
import defpackage.ap2;
import defpackage.b96;
import defpackage.ba6;
import defpackage.cen;
import defpackage.da6;
import defpackage.fxd;
import defpackage.r86;

/* loaded from: classes.dex */
public class Barrier extends r86 {
    public int i;
    public int j;
    public ap2 k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.k.x0;
    }

    public int getMargin() {
        return this.k.y0;
    }

    public int getType() {
        return this.i;
    }

    @Override // defpackage.r86
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.k = new ap2();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cen.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.k.x0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.k.y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.k;
        k();
    }

    @Override // defpackage.r86
    public final void i(a96 a96Var, fxd fxdVar, da6 da6Var, SparseArray sparseArray) {
        super.i(a96Var, fxdVar, da6Var, sparseArray);
        b96 b96Var = a96Var.e;
        if (fxdVar instanceof ap2) {
            ap2 ap2Var = (ap2) fxdVar;
            l(ap2Var, b96Var.g0, ((ba6) fxdVar.V).z0);
            ap2Var.x0 = b96Var.o0;
            ap2Var.y0 = b96Var.h0;
        }
    }

    @Override // defpackage.r86
    public final void j(aa6 aa6Var, boolean z) {
        l(aa6Var, this.i, z);
    }

    public final void l(aa6 aa6Var, int i, boolean z) {
        this.j = i;
        int i2 = this.i;
        if (z) {
            if (i2 == 5) {
                this.j = 1;
            } else if (i2 == 6) {
                this.j = 0;
            }
        } else if (i2 == 5) {
            this.j = 0;
        } else if (i2 == 6) {
            this.j = 1;
        }
        if (aa6Var instanceof ap2) {
            ((ap2) aa6Var).w0 = this.j;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.k.x0 = z;
    }

    public void setDpMargin(int i) {
        this.k.y0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.k.y0 = i;
    }

    public void setType(int i) {
        this.i = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
