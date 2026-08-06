package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class qc implements Comparator {
    public final /* synthetic */ int GWasM1elztuh;
    public final /* synthetic */ Object Yi7zF1RB1;

    public /* synthetic */ qc(int i, Object obj) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.GWasM1elztuh;
        Object obj3 = this.Yi7zF1RB1;
        switch (i) {
            case 0:
                for (hv hvVar : (hv[]) obj3) {
                    int Mjvvu5DE = n30.Mjvvu5DE((Comparable) hvVar.mOu10nynGul(obj), (Comparable) hvVar.mOu10nynGul(obj2));
                    if (Mjvvu5DE != 0) {
                        return Mjvvu5DE;
                    }
                }
                return 0;
            default:
                return ((Number) ((lv) obj3).EljAMC1QTz(obj, obj2)).intValue();
        }
    }
}
