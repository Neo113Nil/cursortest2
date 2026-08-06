package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class xe implements java.util.Comparator {
    public final /* synthetic */ int IHQe1A4L2xu;
    public final /* synthetic */ java.lang.Object oh6vYeIP;

    public /* synthetic */ xe(int i, java.lang.Object obj) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = obj;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.IHQe1A4L2xu;
        java.lang.Object obj3 = this.oh6vYeIP;
        switch (i) {
            case 0:
                for (defpackage.g00 g00Var : (defpackage.g00[]) obj3) {
                    int abhbClRa = defpackage.s21.abhbClRa((java.lang.Comparable) g00Var.AARZUJiTa(obj), (java.lang.Comparable) g00Var.AARZUJiTa(obj2));
                    if (abhbClRa != 0) {
                        return abhbClRa;
                    }
                }
                return 0;
            default:
                return ((java.lang.Number) ((defpackage.k00) obj3).adDC3e2L(obj, obj2)).intValue();
        }
    }
}
