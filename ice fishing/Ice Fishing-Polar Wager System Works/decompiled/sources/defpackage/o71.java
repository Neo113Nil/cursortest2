package defpackage;

/* loaded from: classes.dex */
public final class o71 implements java.util.Comparator {
    public final /* synthetic */ int IHQe1A4L2xu = 0;
    public final /* synthetic */ java.util.Comparator oh6vYeIP;

    public o71(defpackage.o71 o71Var) {
        this.oh6vYeIP = o71Var;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.IHQe1A4L2xu;
        java.util.Comparator comparator = this.oh6vYeIP;
        switch (i) {
            case 0:
                int compare = comparator.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return defpackage.ma0.EoOhNTTfIN7K.compare(((defpackage.f71) obj).r1MBDhnF, ((defpackage.f71) obj2).r1MBDhnF);
            default:
                int compare2 = ((defpackage.o71) comparator).compare(obj, obj2);
                return compare2 != 0 ? compare2 : defpackage.s21.abhbClRa(java.lang.Integer.valueOf(((defpackage.f71) obj).xiZrDbcSW0), java.lang.Integer.valueOf(((defpackage.f71) obj2).xiZrDbcSW0));
        }
    }

    public o71(java.util.Comparator comparator) {
        this.oh6vYeIP = comparator;
    }
}
