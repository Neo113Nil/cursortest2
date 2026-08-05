package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ki0 extends ji0 {
    public bn amk52bBQ;

    public ki0(wi0 wi0Var, WindowInsets windowInsets) {
        super(wi0Var, windowInsets);
        this.amk52bBQ = null;
    }

    @Override // defpackage.si0
    public wi0 MdtA4re8() {
        return wi0.VgvYg0wo(this.MdtA4re8.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.si0
    public wi0 NCTxEWno() {
        return wi0.VgvYg0wo(this.MdtA4re8.consumeStableInsets(), null);
    }

    @Override // defpackage.si0
    public boolean OxcuoDLp() {
        return this.MdtA4re8.isConsumed();
    }

    @Override // defpackage.si0
    public void RXQxj5Oe(bn bnVar) {
        this.amk52bBQ = bnVar;
    }

    @Override // defpackage.si0
    public final bn eVhOlqcC() {
        bn bnVar = this.amk52bBQ;
        if (bnVar != null) {
            return bnVar;
        }
        WindowInsets windowInsets = this.MdtA4re8;
        bn qoPGr6Ce = bn.qoPGr6Ce(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.amk52bBQ = qoPGr6Ce;
        return qoPGr6Ce;
    }
}
