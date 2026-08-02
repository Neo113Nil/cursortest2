package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import defpackage.a96;
import defpackage.aa6;
import defpackage.cen;
import defpackage.da6;
import defpackage.fxd;
import defpackage.jiu;
import defpackage.kiu;
import defpackage.qjc;

/* loaded from: classes.dex */
public class Flow extends jiu {
    public qjc k;

    public Flow(Context context) {
        super(context);
    }

    @Override // defpackage.jiu, defpackage.r86
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.k = new qjc();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cen.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.k.Z0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    qjc qjcVar = this.k;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    qjcVar.w0 = dimensionPixelSize;
                    qjcVar.x0 = dimensionPixelSize;
                    qjcVar.y0 = dimensionPixelSize;
                    qjcVar.z0 = dimensionPixelSize;
                } else if (index == 18) {
                    qjc qjcVar2 = this.k;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    qjcVar2.y0 = dimensionPixelSize2;
                    qjcVar2.A0 = dimensionPixelSize2;
                    qjcVar2.B0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.k.z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.k.A0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.k.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.k.B0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.k.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.k.X0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.k.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.k.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.k.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.k.L0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.k.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.k.M0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.k.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.k.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.k.R0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.k.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.k.S0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.k.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.k.V0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.k.W0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.k.T0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.k.U0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.k.Y0 = obtainStyledAttributes.getInt(index, -1);
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
        if (fxdVar instanceof qjc) {
            qjc qjcVar = (qjc) fxdVar;
            int i = da6Var.V;
            if (i != -1) {
                qjcVar.Z0 = i;
            }
        }
    }

    @Override // defpackage.r86
    public final void j(aa6 aa6Var, boolean z) {
        qjc qjcVar = this.k;
        int i = qjcVar.y0;
        if (i > 0 || qjcVar.z0 > 0) {
            if (z) {
                qjcVar.A0 = qjcVar.z0;
                qjcVar.B0 = i;
            } else {
                qjcVar.A0 = i;
                qjcVar.B0 = qjcVar.z0;
            }
        }
    }

    @Override // defpackage.jiu
    public final void l(kiu kiuVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (kiuVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            kiuVar.V(mode, size, mode2, size2);
            setMeasuredDimension(kiuVar.D0, kiuVar.E0);
        }
    }

    @Override // defpackage.r86, android.view.View
    public final void onMeasure(int i, int i2) {
        l(this.k, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.k.P0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.k.J0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.k.Q0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.k.K0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.k.V0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.k.N0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.k.T0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.k.H0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.k.R0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.k.L0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.k.S0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.k.M0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.k.Y0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.k.Z0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        qjc qjcVar = this.k;
        qjcVar.w0 = i;
        qjcVar.x0 = i;
        qjcVar.y0 = i;
        qjcVar.z0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.k.x0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.k.A0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.k.B0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.k.w0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.k.W0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.k.O0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.k.U0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.k.I0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.k.X0 = i;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
