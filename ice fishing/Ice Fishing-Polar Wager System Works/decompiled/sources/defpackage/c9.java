package defpackage;

/* loaded from: classes.dex */
public final class c9 implements defpackage.ii0 {
    public final defpackage.e8 IHQe1A4L2xu;
    public final boolean oh6vYeIP;

    public c9(defpackage.e8 e8Var, boolean z) {
        this.IHQe1A4L2xu = e8Var;
        this.oh6vYeIP = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.c9)) {
            return false;
        }
        defpackage.c9 c9Var = (defpackage.c9) obj;
        return this.IHQe1A4L2xu.equals(c9Var.IHQe1A4L2xu) && this.oh6vYeIP == c9Var.oh6vYeIP;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.oh6vYeIP) + (this.IHQe1A4L2xu.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "BoxMeasurePolicy(alignment=" + this.IHQe1A4L2xu + ", propagateMinConstraints=" + this.oh6vYeIP + ')';
    }

    @Override // defpackage.ii0
    public final defpackage.ji0 xiZrDbcSW0(final defpackage.ki0 ki0Var, final java.util.List list, long j) {
        boolean isEmpty = list.isEmpty();
        defpackage.ot otVar = defpackage.ot.adDC3e2L;
        if (isEmpty) {
            return ki0Var.EoOhNTTfIN7K(defpackage.ki.SH1y5HwkJhh(j), defpackage.ki.riuEU0zW4(j), otVar, new defpackage.JX5fKip1C6(3));
        }
        long j2 = this.oh6vYeIP ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final defpackage.di0 di0Var = (defpackage.di0) list.get(0);
            di0Var.ez2rX8ReCYw();
            final defpackage.bv0 xiZrDbcSW0 = di0Var.xiZrDbcSW0(j2);
            final int max = java.lang.Math.max(defpackage.ki.SH1y5HwkJhh(j), xiZrDbcSW0.adDC3e2L);
            final int max2 = java.lang.Math.max(defpackage.ki.riuEU0zW4(j), xiZrDbcSW0.xiZrDbcSW0);
            return ki0Var.EoOhNTTfIN7K(max, max2, otVar, new defpackage.g00() { // from class: a9
                @Override // defpackage.g00
                public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
                    defpackage.z8.oh6vYeIP((defpackage.av0) obj, defpackage.bv0.this, di0Var, ki0Var.getLayoutDirection(), max, max2, this.IHQe1A4L2xu);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            });
        }
        final defpackage.bv0[] bv0VarArr = new defpackage.bv0[list.size()];
        final defpackage.pz0 pz0Var = new defpackage.pz0();
        pz0Var.adDC3e2L = defpackage.ki.SH1y5HwkJhh(j);
        final defpackage.pz0 pz0Var2 = new defpackage.pz0();
        pz0Var2.adDC3e2L = defpackage.ki.riuEU0zW4(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.di0 di0Var2 = (defpackage.di0) list.get(i);
            di0Var2.ez2rX8ReCYw();
            defpackage.bv0 xiZrDbcSW02 = di0Var2.xiZrDbcSW0(j2);
            bv0VarArr[i] = xiZrDbcSW02;
            pz0Var.adDC3e2L = java.lang.Math.max(pz0Var.adDC3e2L, xiZrDbcSW02.adDC3e2L);
            pz0Var2.adDC3e2L = java.lang.Math.max(pz0Var2.adDC3e2L, xiZrDbcSW02.xiZrDbcSW0);
        }
        return ki0Var.EoOhNTTfIN7K(pz0Var.adDC3e2L, pz0Var2.adDC3e2L, otVar, new defpackage.g00() { // from class: b9
            @Override // defpackage.g00
            public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
                defpackage.av0 av0Var = (defpackage.av0) obj;
                defpackage.bv0[] bv0VarArr2 = bv0VarArr;
                int length = bv0VarArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i2;
                    defpackage.bv0 bv0Var = bv0VarArr2[i3];
                    bv0Var.getClass();
                    defpackage.z8.oh6vYeIP(av0Var, bv0Var, (defpackage.di0) list.get(i4), ki0Var.getLayoutDirection(), pz0Var.adDC3e2L, pz0Var2.adDC3e2L, this.IHQe1A4L2xu);
                    i3++;
                    i2 = i4 + 1;
                }
                return defpackage.ok1.IHQe1A4L2xu;
            }
        });
    }
}
