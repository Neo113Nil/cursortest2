package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class m01 implements Comparator {
    public final /* synthetic */ int GWasM1elztuh = 0;
    public final /* synthetic */ Comparator Yi7zF1RB1;

    public m01(m01 m01Var) {
        this.Yi7zF1RB1 = m01Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.GWasM1elztuh;
        Comparator comparator = this.Yi7zF1RB1;
        switch (i) {
            case 0:
                int compare = comparator.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return g60.J3Xc8BaqpN8.compare(((d01) obj).X1lG3V04pd, ((d01) obj2).X1lG3V04pd);
            default:
                int compare2 = ((m01) comparator).compare(obj, obj2);
                return compare2 != 0 ? compare2 : n30.Mjvvu5DE(Integer.valueOf(((d01) obj).EljAMC1QTz), Integer.valueOf(((d01) obj2).EljAMC1QTz));
        }
    }

    public m01(Comparator comparator) {
        this.Yi7zF1RB1 = comparator;
    }
}
