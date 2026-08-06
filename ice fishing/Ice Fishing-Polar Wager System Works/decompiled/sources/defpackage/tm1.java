package defpackage;

/* loaded from: classes.dex */
public final class tm1 extends android.view.View {
    public static final defpackage.po cnag84Bm = new defpackage.po(1);
    public final defpackage.jb AARZUJiTa;
    public defpackage.g00 DFo87pBq1E5;
    public boolean EXtogiMhuM;
    public defpackage.w90 JlrlGoKF;
    public boolean SH1y5HwkJhh;
    public defpackage.q20 SyNS6RMn;
    public final defpackage.ur adDC3e2L;
    public defpackage.qn ez2rX8ReCYw;
    public android.graphics.Outline riuEU0zW4;
    public final defpackage.kb xiZrDbcSW0;

    public tm1(defpackage.ur urVar, defpackage.kb kbVar, defpackage.jb jbVar) {
        super(urVar.getContext());
        this.adDC3e2L = urVar;
        this.xiZrDbcSW0 = kbVar;
        this.AARZUJiTa = jbVar;
        setOutlineProvider(cnag84Bm);
        this.SH1y5HwkJhh = true;
        this.ez2rX8ReCYw = defpackage.x70.oh6vYeIP;
        this.JlrlGoKF = defpackage.w90.adDC3e2L;
        defpackage.s20.IHQe1A4L2xu.getClass();
        this.DFo87pBq1E5 = defpackage.q0.NHJTzaLwkd;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        defpackage.kb kbVar = this.xiZrDbcSW0;
        defpackage.c0 c0Var = kbVar.IHQe1A4L2xu;
        android.graphics.Canvas canvas2 = c0Var.IHQe1A4L2xu;
        c0Var.IHQe1A4L2xu = canvas;
        defpackage.qn qnVar = this.ez2rX8ReCYw;
        defpackage.w90 w90Var = this.JlrlGoKF;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(height) & 4294967295L) | (java.lang.Float.floatToRawIntBits(width) << 32);
        defpackage.q20 q20Var = this.SyNS6RMn;
        defpackage.g00 g00Var = this.DFo87pBq1E5;
        defpackage.jb jbVar = this.AARZUJiTa;
        defpackage.v5 v5Var = jbVar.xiZrDbcSW0;
        defpackage.ib ibVar = ((defpackage.jb) v5Var.F7NU4MC0GW).adDC3e2L;
        defpackage.qn qnVar2 = ibVar.IHQe1A4L2xu;
        defpackage.w90 w90Var2 = ibVar.oh6vYeIP;
        defpackage.hb xiZrDbcSW0 = v5Var.xiZrDbcSW0();
        defpackage.v5 v5Var2 = jbVar.xiZrDbcSW0;
        long riuEU0zW4 = v5Var2.riuEU0zW4();
        defpackage.q20 q20Var2 = (defpackage.q20) v5Var2.r1MBDhnF;
        v5Var2.G3OKOH3wZRC(qnVar);
        v5Var2.kd6TUFXn(w90Var);
        v5Var2.QoRHpC4k(c0Var);
        v5Var2.EgCjBq0SZwJ(floatToRawIntBits);
        v5Var2.r1MBDhnF = q20Var;
        c0Var.riuEU0zW4();
        try {
            g00Var.AARZUJiTa(jbVar);
            c0Var.AARZUJiTa();
            v5Var2.G3OKOH3wZRC(qnVar2);
            v5Var2.kd6TUFXn(w90Var2);
            v5Var2.QoRHpC4k(xiZrDbcSW0);
            v5Var2.EgCjBq0SZwJ(riuEU0zW4);
            v5Var2.r1MBDhnF = q20Var2;
            kbVar.IHQe1A4L2xu.IHQe1A4L2xu = canvas2;
            this.EXtogiMhuM = false;
        } catch (java.lang.Throwable th) {
            c0Var.AARZUJiTa();
            v5Var2.G3OKOH3wZRC(qnVar2);
            v5Var2.kd6TUFXn(w90Var2);
            v5Var2.QoRHpC4k(xiZrDbcSW0);
            v5Var2.EgCjBq0SZwJ(riuEU0zW4);
            v5Var2.r1MBDhnF = q20Var2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.SH1y5HwkJhh;
    }

    public final defpackage.kb getCanvasHolder() {
        return this.xiZrDbcSW0;
    }

    public final android.view.View getOwnerView() {
        return this.adDC3e2L;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.SH1y5HwkJhh;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.EXtogiMhuM) {
            return;
        }
        this.EXtogiMhuM = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.SH1y5HwkJhh != z) {
            this.SH1y5HwkJhh = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.EXtogiMhuM = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
