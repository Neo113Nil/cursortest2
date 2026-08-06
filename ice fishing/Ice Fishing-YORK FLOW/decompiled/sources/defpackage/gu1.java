package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gu1 extends android.view.View {
    public static final defpackage.jq T1fB7bDYiVJQ = new defpackage.jq(2);
    public boolean GE9mJIPrb8gP;
    public defpackage.hp Ns0WNyEWdPsk;
    public boolean P05cfTpS5W5L;
    public final defpackage.ld QiMR8OkAhezm;
    public final defpackage.zs WDYagTQQm9ns;
    public android.graphics.Outline e6mdH7fiFuta;
    public defpackage.sc0 fNwYGHIYeJcR;
    public defpackage.b40 gUjdnLbkVAaA;
    public defpackage.y10 h3m55N1URyyK;
    public final defpackage.md oh71FJcDz6S2;

    public gu1(defpackage.zs zsVar, defpackage.md mdVar, defpackage.ld ldVar) {
        super(zsVar.getContext());
        this.WDYagTQQm9ns = zsVar;
        this.oh71FJcDz6S2 = mdVar;
        this.QiMR8OkAhezm = ldVar;
        setOutlineProvider(T1fB7bDYiVJQ);
        this.GE9mJIPrb8gP = true;
        this.Ns0WNyEWdPsk = defpackage.jr0.giKS3J6vZuNy;
        this.fNwYGHIYeJcR = defpackage.sc0.WDYagTQQm9ns;
        defpackage.d40.ZpBGe2uQfcn8.getClass();
        this.h3m55N1URyyK = defpackage.n.UmgHb6n58gfG;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        defpackage.md mdVar = this.oh71FJcDz6S2;
        defpackage.DR1ov5IJDbR8 dR1ov5IJDbR8 = mdVar.ZpBGe2uQfcn8;
        android.graphics.Canvas canvas2 = dR1ov5IJDbR8.ZpBGe2uQfcn8;
        dR1ov5IJDbR8.ZpBGe2uQfcn8 = canvas;
        defpackage.hp hpVar = this.Ns0WNyEWdPsk;
        defpackage.sc0 sc0Var = this.fNwYGHIYeJcR;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(height) & 4294967295L) | (java.lang.Float.floatToRawIntBits(width) << 32);
        defpackage.b40 b40Var = this.gUjdnLbkVAaA;
        defpackage.y10 y10Var = this.h3m55N1URyyK;
        defpackage.ld ldVar = this.QiMR8OkAhezm;
        defpackage.a7 a7Var = ldVar.oh71FJcDz6S2;
        defpackage.kd kdVar = ((defpackage.ld) a7Var.JhCgjQRTAOCT).WDYagTQQm9ns;
        defpackage.hp hpVar2 = kdVar.ZpBGe2uQfcn8;
        defpackage.sc0 sc0Var2 = kdVar.giKS3J6vZuNy;
        defpackage.id oh71FJcDz6S2 = a7Var.oh71FJcDz6S2();
        defpackage.a7 a7Var2 = ldVar.oh71FJcDz6S2;
        long Ns0WNyEWdPsk = a7Var2.Ns0WNyEWdPsk();
        defpackage.b40 b40Var2 = (defpackage.b40) a7Var2.fWTAfUmVKrZq;
        a7Var2.w7APNrr0aGRc(hpVar);
        a7Var2.maCixPsq4ml2(sc0Var);
        a7Var2.ZVVdXbWmyCSK(dR1ov5IJDbR8);
        a7Var2.IJ0hOnjhPOri(floatToRawIntBits);
        a7Var2.fWTAfUmVKrZq = b40Var;
        dR1ov5IJDbR8.fNwYGHIYeJcR();
        try {
            y10Var.P05cfTpS5W5L(ldVar);
            dR1ov5IJDbR8.e6mdH7fiFuta();
            a7Var2.w7APNrr0aGRc(hpVar2);
            a7Var2.maCixPsq4ml2(sc0Var2);
            a7Var2.ZVVdXbWmyCSK(oh71FJcDz6S2);
            a7Var2.IJ0hOnjhPOri(Ns0WNyEWdPsk);
            a7Var2.fWTAfUmVKrZq = b40Var2;
            mdVar.ZpBGe2uQfcn8.ZpBGe2uQfcn8 = canvas2;
            this.P05cfTpS5W5L = false;
        } catch (java.lang.Throwable th) {
            dR1ov5IJDbR8.e6mdH7fiFuta();
            a7Var2.w7APNrr0aGRc(hpVar2);
            a7Var2.maCixPsq4ml2(sc0Var2);
            a7Var2.ZVVdXbWmyCSK(oh71FJcDz6S2);
            a7Var2.IJ0hOnjhPOri(Ns0WNyEWdPsk);
            a7Var2.fWTAfUmVKrZq = b40Var2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.GE9mJIPrb8gP;
    }

    public final defpackage.md getCanvasHolder() {
        return this.oh71FJcDz6S2;
    }

    public final android.view.View getOwnerView() {
        return this.WDYagTQQm9ns;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.GE9mJIPrb8gP;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.P05cfTpS5W5L) {
            return;
        }
        this.P05cfTpS5W5L = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.GE9mJIPrb8gP != z) {
            this.GE9mJIPrb8gP = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.P05cfTpS5W5L = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
