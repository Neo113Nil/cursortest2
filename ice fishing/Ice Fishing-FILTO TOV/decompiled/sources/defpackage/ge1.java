package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ge1 extends h50 implements lv {
    public final /* synthetic */ sz[] AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ge1(sz[] szVarArr, int i) {
        super(2);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = szVarArr;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.EljAMC1QTz;
        sz[] szVarArr = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                return Float.valueOf(d70.AvO7iQsrTN((tp0) obj, true, szVarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(d70.AvO7iQsrTN((tp0) obj, false, szVarArr, ((Number) obj2).floatValue()));
        }
    }
}
