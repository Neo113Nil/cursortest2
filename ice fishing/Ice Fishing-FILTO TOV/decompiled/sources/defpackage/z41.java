package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class z41 extends q20 {
    public final /* synthetic */ y41 EljAMC1QTz;
    public int OOA6hdeuvCS;

    public z41(y41 y41Var) {
        this.EljAMC1QTz = y41Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OOA6hdeuvCS < this.EljAMC1QTz.OOA6hdeuvCS();
    }

    @Override // defpackage.q20
    public final int nextInt() {
        int i = this.OOA6hdeuvCS;
        this.OOA6hdeuvCS = i + 1;
        return this.EljAMC1QTz.X1lG3V04pd(i);
    }
}
