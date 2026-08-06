package defpackage;

/* loaded from: classes.dex */
public abstract class sg {
    public final java.lang.Object IHQe1A4L2xu;

    public sg(int i) {
        switch (i) {
            case 1:
                this.IHQe1A4L2xu = new java.lang.Object();
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                this.IHQe1A4L2xu = defpackage.c80.nBH8hAHy(java.lang.Boolean.FALSE);
                break;
            default:
                this.IHQe1A4L2xu = new java.util.ArrayList();
                break;
        }
    }

    public void AARZUJiTa(int i, java.lang.Object obj, defpackage.v10 v10Var, java.lang.Object obj2) {
        if (defpackage.x70.QoRHpC4k(obj, defpackage.bh.IHQe1A4L2xu)) {
            oh6vYeIP(i, v10Var, null);
        }
    }

    public abstract defpackage.g00 EXtogiMhuM(defpackage.w71 w71Var);

    public abstract void F7NU4MC0GW();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean IHQe1A4L2xu(int i, defpackage.v10 v10Var, java.lang.Object obj) {
        java.util.ArrayList arrayList = v10Var.IHQe1A4L2xu;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                java.lang.Object obj2 = arrayList.get(i2);
                if (!(obj2 instanceof defpackage.o10)) {
                    if (!(obj2 instanceof defpackage.v10)) {
                        defpackage.db.xiZrDbcSW0(obj2, "Unexpected child source info ");
                        break;
                    }
                    if (IHQe1A4L2xu(i, (defpackage.v10) obj2, obj)) {
                        oh6vYeIP(0, v10Var, obj2);
                        return true;
                    }
                } else if (obj2 == obj) {
                    oh6vYeIP(0, v10Var, obj2);
                    return true;
                }
                i2++;
            }
        } else {
            oh6vYeIP(i, v10Var, null);
            return true;
        }
    }

    public abstract void SH1y5HwkJhh(defpackage.li1 li1Var);

    public abstract void adDC3e2L();

    public abstract void ez2rX8ReCYw();

    public void oh6vYeIP(int i, defpackage.v10 v10Var, java.lang.Object obj) {
        ((java.util.ArrayList) this.IHQe1A4L2xu).add(new defpackage.tg(i, null, null));
    }

    public abstract void r1MBDhnF(defpackage.w71 w71Var);

    public abstract void riuEU0zW4(java.lang.Object obj);

    public abstract java.lang.Object xiZrDbcSW0();
}
