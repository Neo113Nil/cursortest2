package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class mb {
    public Object EljAMC1QTz;
    public int OOA6hdeuvCS;

    public mb(int i) {
        this.OOA6hdeuvCS = i;
    }

    public abstract wg1 AvO7iQsrTN(wg1 wg1Var, List list);

    public abstract c9 E7jCp8Ls();

    public void EXrPz3p7hFb() {
        int arNh8D4Z5gB;
        do {
            arNh8D4Z5gB = arNh8D4Z5gB();
            if (arNh8D4Z5gB == 0) {
                return;
            }
            int i = this.OOA6hdeuvCS;
            if (i >= 100) {
                throw new w30("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.OOA6hdeuvCS = i + 1;
            this.OOA6hdeuvCS--;
        } while (k8h8IjolWQ(arNh8D4Z5gB));
    }

    public abstract int JFJ3QoxA(int i);

    public abstract long M3K9sHhK();

    public abstract int Mjvvu5DE();

    public abstract long WIEu4Ya2g8();

    public abstract String WRKkgoJXwDn();

    public abstract String WdrkLMV3xh();

    public abstract int X1lG3V04pd();

    public abstract double XnEVoBF0td1l();

    public abstract long Y6hRI1cF8();

    public abstract void Yi7zF1RB1(int i);

    public abstract float YmKjaVtbfp5Z();

    public abstract int arNh8D4Z5gB();

    public abstract int cilMamHF();

    public abstract d encWxUiV2(bg1 bg1Var, d dVar);

    public abstract int iwATDS1i01k();

    public abstract int jivtDDk9H();

    public abstract boolean k8h8IjolWQ(int i);

    public abstract long lv06NcmrQ();

    public abstract long mE4lRynR();

    public abstract void mOu10nynGul(int i);

    public abstract int pog2g9KITJA();

    public abstract boolean rQPn8YBR();

    public abstract int uFEq9NpZ();

    public abstract boolean xqGvceK5x();

    public void EljAMC1QTz(bg1 bg1Var) {
    }

    public void OOA6hdeuvCS(bg1 bg1Var) {
    }
}
