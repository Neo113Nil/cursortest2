package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class d0 extends h50 implements hv {
    public final /* synthetic */ ArrayList AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, ArrayList arrayList) {
        super(1);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = arrayList;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.EljAMC1QTz;
        kc1 kc1Var = kc1.GWasM1elztuh;
        ArrayList arrayList = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                tp0 tp0Var = (tp0) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    tp0.JFJ3QoxA(tp0Var, (up0) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                tp0 tp0Var2 = (tp0) obj;
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    tp0.AvO7iQsrTN(tp0Var2, (up0) arrayList.get(i3), 0, 0);
                }
                break;
            default:
                tp0 tp0Var3 = (tp0) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    tp0.rQPn8YBR(tp0Var3, (up0) arrayList.get(i4), 0, 0);
                }
                break;
        }
        return kc1Var;
    }
}
