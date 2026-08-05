package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class mi0 extends li0 {
    public bn Ey6iv0m0;
    public bn I5GHvsYW;
    public bn KlHjfFWx;

    public mi0(wi0 wi0Var, WindowInsets windowInsets) {
        super(wi0Var, windowInsets);
        this.KlHjfFWx = null;
        this.Ey6iv0m0 = null;
        this.I5GHvsYW = null;
    }

    @Override // defpackage.si0
    public bn OnDfzHZD() {
        Insets tappableElementInsets;
        bn bnVar = this.I5GHvsYW;
        if (bnVar != null) {
            return bnVar;
        }
        tappableElementInsets = this.MdtA4re8.getTappableElementInsets();
        bn NCTxEWno = bn.NCTxEWno(tappableElementInsets);
        this.I5GHvsYW = NCTxEWno;
        return NCTxEWno;
    }

    @Override // defpackage.si0
    public bn jb9XjC4I() {
        Insets mandatorySystemGestureInsets;
        bn bnVar = this.Ey6iv0m0;
        if (bnVar != null) {
            return bnVar;
        }
        mandatorySystemGestureInsets = this.MdtA4re8.getMandatorySystemGestureInsets();
        bn NCTxEWno = bn.NCTxEWno(mandatorySystemGestureInsets);
        this.Ey6iv0m0 = NCTxEWno;
        return NCTxEWno;
    }

    @Override // defpackage.si0
    public bn k3x7lurq() {
        Insets systemGestureInsets;
        bn bnVar = this.KlHjfFWx;
        if (bnVar != null) {
            return bnVar;
        }
        systemGestureInsets = this.MdtA4re8.getSystemGestureInsets();
        bn NCTxEWno = bn.NCTxEWno(systemGestureInsets);
        this.KlHjfFWx = NCTxEWno;
        return NCTxEWno;
    }

    @Override // defpackage.ji0, defpackage.si0
    public wi0 sjUBp5pO(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.MdtA4re8.inset(i, i2, i3, i4);
        return wi0.VgvYg0wo(inset, null);
    }

    @Override // defpackage.ki0, defpackage.si0
    public void RXQxj5Oe(bn bnVar) {
    }
}
