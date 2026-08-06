package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ue1 extends View {
    public static final cm iwATDS1i01k = new cm(1);
    public final u9 AvO7iQsrTN;
    public p50 E7jCp8Ls;
    public final v9 EljAMC1QTz;
    public boolean JFJ3QoxA;
    public final eo OOA6hdeuvCS;
    public hv XnEVoBF0td1l;
    public boolean encWxUiV2;
    public Outline mOu10nynGul;
    public el rQPn8YBR;
    public oy uFEq9NpZ;

    public ue1(eo eoVar, v9 v9Var, u9 u9Var) {
        super(eoVar.getContext());
        this.OOA6hdeuvCS = eoVar;
        this.EljAMC1QTz = v9Var;
        this.AvO7iQsrTN = u9Var;
        setOutlineProvider(iwATDS1i01k);
        this.JFJ3QoxA = true;
        this.rQPn8YBR = rj0.EljAMC1QTz;
        this.E7jCp8Ls = p50.OOA6hdeuvCS;
        qy.GWasM1elztuh.getClass();
        this.XnEVoBF0td1l = XdwzlWIkSDqF.lv06NcmrQ;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        v9 v9Var = this.EljAMC1QTz;
        Jz7YUlEP53 jz7YUlEP53 = v9Var.GWasM1elztuh;
        Canvas canvas2 = jz7YUlEP53.GWasM1elztuh;
        jz7YUlEP53.GWasM1elztuh = canvas;
        el elVar = this.rQPn8YBR;
        p50 p50Var = this.E7jCp8Ls;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        oy oyVar = this.uFEq9NpZ;
        hv hvVar = this.XnEVoBF0td1l;
        u9 u9Var = this.AvO7iQsrTN;
        f4 f4Var = u9Var.EljAMC1QTz;
        t9 t9Var = ((u9) f4Var.xqGvceK5x).OOA6hdeuvCS;
        el elVar2 = t9Var.GWasM1elztuh;
        p50 p50Var2 = t9Var.Yi7zF1RB1;
        s9 EljAMC1QTz = f4Var.EljAMC1QTz();
        f4 f4Var2 = u9Var.EljAMC1QTz;
        long mOu10nynGul = f4Var2.mOu10nynGul();
        oy oyVar2 = (oy) f4Var2.X1lG3V04pd;
        f4Var2.Mjvvu5DE(elVar);
        f4Var2.mE4lRynR(p50Var);
        f4Var2.YmKjaVtbfp5Z(jz7YUlEP53);
        f4Var2.jivtDDk9H(floatToRawIntBits);
        f4Var2.X1lG3V04pd = oyVar;
        jz7YUlEP53.E7jCp8Ls();
        try {
            hvVar.mOu10nynGul(u9Var);
            jz7YUlEP53.JFJ3QoxA();
            f4Var2.Mjvvu5DE(elVar2);
            f4Var2.mE4lRynR(p50Var2);
            f4Var2.YmKjaVtbfp5Z(EljAMC1QTz);
            f4Var2.jivtDDk9H(mOu10nynGul);
            f4Var2.X1lG3V04pd = oyVar2;
            v9Var.GWasM1elztuh.GWasM1elztuh = canvas2;
            this.encWxUiV2 = false;
        } catch (Throwable th) {
            jz7YUlEP53.JFJ3QoxA();
            f4Var2.Mjvvu5DE(elVar2);
            f4Var2.mE4lRynR(p50Var2);
            f4Var2.YmKjaVtbfp5Z(EljAMC1QTz);
            f4Var2.jivtDDk9H(mOu10nynGul);
            f4Var2.X1lG3V04pd = oyVar2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.JFJ3QoxA;
    }

    public final v9 getCanvasHolder() {
        return this.EljAMC1QTz;
    }

    public final View getOwnerView() {
        return this.OOA6hdeuvCS;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.JFJ3QoxA;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.encWxUiV2) {
            return;
        }
        this.encWxUiV2 = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.JFJ3QoxA != z) {
            this.JFJ3QoxA = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.encWxUiV2 = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
