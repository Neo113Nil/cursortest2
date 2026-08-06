package defpackage;

/* loaded from: classes.dex */
public final class ty0 {
    public final int F7NU4MC0GW;
    public final defpackage.QQUzIjv3iOC5 IHQe1A4L2xu;
    public final java.lang.String oh6vYeIP;
    public final java.lang.Object[] r1MBDhnF;

    public ty0(defpackage.e20 e20Var, java.lang.String str, java.lang.Object[] objArr) {
        this.IHQe1A4L2xu = e20Var;
        this.oh6vYeIP = str;
        this.r1MBDhnF = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.F7NU4MC0GW = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.F7NU4MC0GW = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final int IHQe1A4L2xu() {
        int i = this.F7NU4MC0GW;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
