package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hj0 extends lg0 {
    public boolean WIEu4Ya2g8;
    public final lg0 iwATDS1i01k;

    public hj0(long j, c41 c41Var, hv hvVar, hv hvVar2, lg0 lg0Var) {
        super(j, c41Var, hvVar, hvVar2);
        this.iwATDS1i01k = lg0Var;
        lg0Var.rQPn8YBR();
    }

    @Override // defpackage.lg0, defpackage.y31
    public final void X1lG3V04pd() {
        if (this.X1lG3V04pd) {
            return;
        }
        super.X1lG3V04pd();
        if (this.WIEu4Ya2g8) {
            return;
        }
        this.WIEu4Ya2g8 = true;
        this.iwATDS1i01k.E7jCp8Ls();
    }

    @Override // defpackage.lg0
    public final q70 lv06NcmrQ() {
        hj0 hj0Var;
        lg0 lg0Var = this.iwATDS1i01k;
        if (lg0Var.XnEVoBF0td1l || lg0Var.X1lG3V04pd) {
            return new z31(this);
        }
        ig0 ig0Var = this.encWxUiV2;
        long j = this.Yi7zF1RB1;
        HashMap Yi7zF1RB1 = ig0Var != null ? e41.Yi7zF1RB1(lg0Var.AvO7iQsrTN(), this, this.iwATDS1i01k.xqGvceK5x()) : null;
        Object obj = e41.X1lG3V04pd;
        synchronized (obj) {
            try {
                e41.X1lG3V04pd(this);
                if (ig0Var == null || ig0Var.xqGvceK5x == 0) {
                    hj0Var = this;
                    hj0Var.GWasM1elztuh();
                } else {
                    hj0Var = this;
                    q70 arNh8D4Z5gB = hj0Var.arNh8D4Z5gB(this.iwATDS1i01k.AvO7iQsrTN(), ig0Var, Yi7zF1RB1, this.iwATDS1i01k.xqGvceK5x());
                    if (!arNh8D4Z5gB.equals(a41.GWasM1elztuh)) {
                        return arNh8D4Z5gB;
                    }
                    ig0 WdrkLMV3xh = hj0Var.iwATDS1i01k.WdrkLMV3xh();
                    if (WdrkLMV3xh != null) {
                        WdrkLMV3xh.JFJ3QoxA(ig0Var);
                    } else {
                        hj0Var.iwATDS1i01k.M3K9sHhK(ig0Var);
                        hj0Var.encWxUiV2 = null;
                    }
                }
                if (o30.iwATDS1i01k(hj0Var.iwATDS1i01k.AvO7iQsrTN(), j) < 0) {
                    hj0Var.iwATDS1i01k.cilMamHF();
                }
                lg0 lg0Var2 = hj0Var.iwATDS1i01k;
                lg0Var2.Mjvvu5DE(lg0Var2.xqGvceK5x().Yi7zF1RB1(j).GWasM1elztuh(hj0Var.JFJ3QoxA));
                hj0Var.iwATDS1i01k.pog2g9KITJA(j);
                lg0 lg0Var3 = hj0Var.iwATDS1i01k;
                int i = hj0Var.xqGvceK5x;
                hj0Var.xqGvceK5x = -1;
                if (i >= 0) {
                    int[] iArr = lg0Var3.rQPn8YBR;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    lg0Var3.rQPn8YBR = copyOf;
                } else {
                    lg0Var3.getClass();
                }
                lg0 lg0Var4 = hj0Var.iwATDS1i01k;
                c41 c41Var = hj0Var.JFJ3QoxA;
                lg0Var4.getClass();
                synchronized (obj) {
                    lg0Var4.JFJ3QoxA = lg0Var4.JFJ3QoxA.OOA6hdeuvCS(c41Var);
                    lg0 lg0Var5 = hj0Var.iwATDS1i01k;
                    int[] iArr2 = hj0Var.rQPn8YBR;
                    lg0Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = lg0Var5.rQPn8YBR;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            iArr2 = copyOf2;
                        }
                        lg0Var5.rQPn8YBR = iArr2;
                    }
                }
                hj0Var.XnEVoBF0td1l = true;
                if (!hj0Var.WIEu4Ya2g8) {
                    hj0Var.WIEu4Ya2g8 = true;
                    hj0Var.iwATDS1i01k.E7jCp8Ls();
                }
                return a41.GWasM1elztuh;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
