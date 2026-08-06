package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class lg1 extends kg1 {
    public e20 Mjvvu5DE;

    public lg1(wg1 wg1Var, WindowInsets windowInsets) {
        super(wg1Var, windowInsets);
        this.Mjvvu5DE = null;
    }

    @Override // defpackage.sg1
    public boolean Mjvvu5DE() {
        return this.X1lG3V04pd.isConsumed();
    }

    @Override // defpackage.sg1
    public void WdrkLMV3xh(e20 e20Var) {
        this.Mjvvu5DE = e20Var;
    }

    @Override // defpackage.sg1
    public wg1 X1lG3V04pd() {
        return wg1.X1lG3V04pd(this.X1lG3V04pd.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.sg1
    public wg1 Yi7zF1RB1() {
        return wg1.X1lG3V04pd(this.X1lG3V04pd.consumeStableInsets(), null);
    }

    @Override // defpackage.sg1
    public final e20 rQPn8YBR() {
        if (this.Mjvvu5DE == null) {
            WindowInsets windowInsets = this.X1lG3V04pd;
            this.Mjvvu5DE = e20.Yi7zF1RB1(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.Mjvvu5DE;
    }
}
