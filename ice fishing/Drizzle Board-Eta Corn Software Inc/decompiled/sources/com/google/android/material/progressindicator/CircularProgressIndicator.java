package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.kolosta.rejin.jilosa.R;
import defpackage.c2;
import defpackage.cD2QLRqg;
import defpackage.ec;
import defpackage.h5;
import defpackage.i30;
import defpackage.j5;
import defpackage.kf0;
import defpackage.l5;
import defpackage.lf0;
import defpackage.m1;
import defpackage.m5;
import defpackage.sm;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class CircularProgressIndicator extends c2 {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5 m5Var = this.NCTxEWno;
        h5 h5Var = new h5(m5Var);
        Context context2 = getContext();
        cD2QLRqg l5Var = m5Var.OxcuoDLp == 1 ? new l5(context2, m5Var) : new j5(m5Var);
        sm smVar = new sm(context2, m5Var);
        smVar.lDXGDhIF = h5Var;
        smVar.sjUBp5pO = l5Var;
        l5Var.qoPGr6Ce = smVar;
        Resources resources = context2.getResources();
        lf0 lf0Var = new lf0();
        ThreadLocal threadLocal = i30.qoPGr6Ce;
        lf0Var.NCTxEWno = resources.getDrawable(R.drawable.ic_mtrl_arrow_circle, null);
        new kf0(lf0Var.NCTxEWno.getConstantState());
        smVar.OxcuoDLp = lf0Var;
        setIndeterminateDrawable(smVar);
        setProgressDrawable(new ec(getContext(), m5Var, h5Var));
        this.eVhOlqcC = true;
    }

    public int getIndeterminateAnimationType() {
        return this.NCTxEWno.OxcuoDLp;
    }

    public int getIndicatorDirection() {
        return this.NCTxEWno.Ey6iv0m0;
    }

    public int getIndicatorInset() {
        return this.NCTxEWno.KlHjfFWx;
    }

    public int getIndicatorSize() {
        return this.NCTxEWno.amk52bBQ;
    }

    public void setIndeterminateAnimationType(int i) {
        m5 m5Var = this.NCTxEWno;
        if (m5Var.OxcuoDLp == i) {
            return;
        }
        if (NCTxEWno() && isIndeterminate()) {
            m1.Ey6iv0m0("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        m5Var.OxcuoDLp = i;
        m5Var.NCTxEWno();
        cD2QLRqg l5Var = i == 1 ? new l5(getContext(), m5Var) : new j5(m5Var);
        sm indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.sjUBp5pO = l5Var;
        l5Var.qoPGr6Ce = indeterminateDrawable;
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().sjUBp5pO.OnDfzHZD(this.ygLcUYwZ);
        }
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        this.NCTxEWno.Ey6iv0m0 = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        m5 m5Var = this.NCTxEWno;
        if (m5Var.KlHjfFWx != i) {
            m5Var.KlHjfFWx = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        m5 m5Var = this.NCTxEWno;
        if (m5Var.amk52bBQ != max) {
            m5Var.amk52bBQ = max;
            m5Var.NCTxEWno();
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.c2
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        this.NCTxEWno.NCTxEWno();
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }
}
