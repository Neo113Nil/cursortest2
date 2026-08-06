package defpackage;

/* loaded from: classes.dex */
public final class h40 extends defpackage.p90 implements defpackage.k00 {
    public final /* synthetic */ defpackage.i40[] AARZUJiTa;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h40(defpackage.i40[] i40VarArr, int i) {
        super(2);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = i40VarArr;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.xiZrDbcSW0;
        defpackage.i40[] i40VarArr = this.AARZUJiTa;
        switch (i) {
            case 0:
                return java.lang.Float.valueOf(defpackage.e90.xiZrDbcSW0((defpackage.av0) obj, true, i40VarArr, ((java.lang.Number) obj2).floatValue()));
            default:
                return java.lang.Float.valueOf(defpackage.e90.xiZrDbcSW0((defpackage.av0) obj, false, i40VarArr, ((java.lang.Number) obj2).floatValue()));
        }
    }
}
