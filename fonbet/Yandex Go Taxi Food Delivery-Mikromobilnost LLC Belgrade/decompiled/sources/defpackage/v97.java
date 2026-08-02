package defpackage;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class v97 implements q97 {
    public final boolean a;
    public final String b;

    public v97(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // defpackage.q97
    public final boolean a(yml0 yml0Var) {
        int i;
        boolean z = this.a;
        String str = this.b;
        if (z && str == null) {
            str = yml0Var.n();
        }
        wml0 wml0Var = yml0Var.b;
        if (wml0Var != null) {
            Iterator it = wml0Var.getChildren().iterator();
            i = 0;
            while (it.hasNext()) {
                yml0 yml0Var2 = (yml0) ((anl0) it.next());
                if (str == null || yml0Var2.n().equals(str)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.a ? oyr.p("only-of-type <", this.b, ">") : "only-child";
    }
}
