package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class tc0 extends XnEVoBF0td1l {
    public final Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ tc0(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }

    @Override // defpackage.XnEVoBF0td1l
    public final int GWasM1elztuh() {
        int i = this.OOA6hdeuvCS;
        Object obj = this.EljAMC1QTz;
        switch (i) {
            case 0:
                return ((Matcher) ((f4) obj).Yi7zF1RB1).groupCount() + 1;
            default:
                dp0 dp0Var = (dp0) obj;
                dp0Var.getClass();
                return dp0Var.EljAMC1QTz;
        }
    }

    public sc0 Yi7zF1RB1(int i) {
        Matcher matcher = (Matcher) ((f4) this.EljAMC1QTz).Yi7zF1RB1;
        x20 MZhzXH72 = o50.MZhzXH72(matcher.start(i), matcher.end(i));
        if (MZhzXH72.OOA6hdeuvCS < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new sc0(group, MZhzXH72);
    }

    @Override // defpackage.XnEVoBF0td1l, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                if (obj == null ? true : obj instanceof sc0) {
                    return super.contains((sc0) obj);
                }
                return false;
            default:
                return ((dp0) this.EljAMC1QTz).containsValue(obj);
        }
    }

    @Override // defpackage.XnEVoBF0td1l, java.util.Collection
    public boolean isEmpty() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return new ia1(new r71(new xb(0, fb1.k8h8IjolWQ(this)), new E7jCp8Ls(10, this), 1));
            default:
                za1 za1Var = ((dp0) this.EljAMC1QTz).OOA6hdeuvCS;
                ab1[] ab1VarArr = new ab1[8];
                for (int i = 0; i < 8; i++) {
                    ab1VarArr[i] = new bb1(2);
                }
                return new lp0(za1Var, ab1VarArr);
        }
    }
}
