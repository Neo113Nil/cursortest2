package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fc0 extends hc0 implements Iterator, q40 {
    public final /* synthetic */ int mOu10nynGul;

    public fc0(ic0 ic0Var, int i) {
        this.mOu10nynGul = i;
        ic0Var.getClass();
        this.encWxUiV2 = ic0Var;
        this.EljAMC1QTz = -1;
        this.AvO7iQsrTN = ic0Var.E7jCp8Ls;
        X1lG3V04pd();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.mOu10nynGul) {
            case 0:
                Yi7zF1RB1();
                int i = this.OOA6hdeuvCS;
                ic0 ic0Var = (ic0) this.encWxUiV2;
                if (i >= ic0Var.JFJ3QoxA) {
                    o4.E7jCp8Ls();
                    break;
                } else {
                    this.OOA6hdeuvCS = i + 1;
                    this.EljAMC1QTz = i;
                    gc0 gc0Var = new gc0(ic0Var, i);
                    X1lG3V04pd();
                    break;
                }
            case 1:
                Yi7zF1RB1();
                int i2 = this.OOA6hdeuvCS;
                ic0 ic0Var2 = (ic0) this.encWxUiV2;
                if (i2 >= ic0Var2.JFJ3QoxA) {
                    o4.E7jCp8Ls();
                    break;
                } else {
                    this.OOA6hdeuvCS = i2 + 1;
                    this.EljAMC1QTz = i2;
                    Object obj = ic0Var2.OOA6hdeuvCS[i2];
                    X1lG3V04pd();
                    break;
                }
            default:
                Yi7zF1RB1();
                int i3 = this.OOA6hdeuvCS;
                ic0 ic0Var3 = (ic0) this.encWxUiV2;
                if (i3 >= ic0Var3.JFJ3QoxA) {
                    o4.E7jCp8Ls();
                    break;
                } else {
                    this.OOA6hdeuvCS = i3 + 1;
                    this.EljAMC1QTz = i3;
                    Object[] objArr = ic0Var3.EljAMC1QTz;
                    objArr.getClass();
                    Object obj2 = objArr[this.EljAMC1QTz];
                    X1lG3V04pd();
                    break;
                }
        }
        return null;
    }
}
