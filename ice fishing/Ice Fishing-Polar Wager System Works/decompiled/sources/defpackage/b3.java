package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements java.util.Comparator {
    public final /* synthetic */ int IHQe1A4L2xu;

    public /* synthetic */ b3(int i) {
        this.IHQe1A4L2xu = i;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.IHQe1A4L2xu) {
            case 0:
                return defpackage.x70.kNAkVymC(((defpackage.tx0) obj2).IHQe1A4L2xu, ((defpackage.tx0) obj).IHQe1A4L2xu);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.x70.kNAkVymC(((defpackage.i80) obj).oh6vYeIP, ((defpackage.i80) obj2).oh6vYeIP);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.d70 d70Var = (defpackage.d70) obj;
                defpackage.d70 d70Var2 = (defpackage.d70) obj2;
                return (d70Var.xiZrDbcSW0 - d70Var.adDC3e2L) - (d70Var2.xiZrDbcSW0 - d70Var2.adDC3e2L);
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.ma0 ma0Var = (defpackage.ma0) obj;
                defpackage.ma0 ma0Var2 = (defpackage.ma0) obj2;
                float f = ma0Var.wll2JLbTBC2.QoRHpC4k.p4kuH6PDtgom;
                float f2 = ma0Var2.wll2JLbTBC2.QoRHpC4k.p4kuH6PDtgom;
                return f == f2 ? defpackage.x70.kNAkVymC(ma0Var.PAEGRtP0bX(), ma0Var2.PAEGRtP0bX()) : java.lang.Float.compare(f, f2);
            default:
                return defpackage.x70.kNAkVymC(((defpackage.tc0) obj).IHQe1A4L2xu, ((defpackage.tc0) obj2).IHQe1A4L2xu);
        }
    }
}
