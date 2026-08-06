package defpackage;

/* loaded from: classes.dex */
public final class sa1 implements defpackage.j31, defpackage.ql1 {
    public final /* synthetic */ int adDC3e2L;
    public java.lang.Object xiZrDbcSW0;

    public sa1(long[] jArr) {
        defpackage.al0 al0Var;
        this.adDC3e2L = 0;
        if (jArr != null) {
            long[] copyOf = java.util.Arrays.copyOf(jArr, jArr.length);
            al0Var = new defpackage.al0(copyOf.length);
            int i = al0Var.oh6vYeIP;
            if (i < 0) {
                defpackage.db.cnag84Bm("");
                throw null;
            }
            if (copyOf.length != 0) {
                int length = copyOf.length + i;
                long[] jArr2 = al0Var.IHQe1A4L2xu;
                if (jArr2.length < length) {
                    al0Var.IHQe1A4L2xu = java.util.Arrays.copyOf(jArr2, java.lang.Math.max(length, (jArr2.length * 3) / 2));
                }
                long[] jArr3 = al0Var.IHQe1A4L2xu;
                int i2 = al0Var.oh6vYeIP;
                if (i != i2) {
                    defpackage.t6.EoOhNTTfIN7K(jArr3, jArr3, copyOf.length + i, i, i2);
                }
                defpackage.t6.EoOhNTTfIN7K(copyOf, jArr3, i, 0, copyOf.length);
                al0Var.oh6vYeIP += copyOf.length;
            }
        } else {
            al0Var = new defpackage.al0(16);
        }
        this.xiZrDbcSW0 = al0Var;
    }

    public long F7NU4MC0GW(long j) {
        defpackage.gn gnVar = (defpackage.gn) this.xiZrDbcSW0;
        gnVar.getClass();
        if (defpackage.rl1.oh6vYeIP(j) <= 0.0f || defpackage.rl1.r1MBDhnF(j) <= 0.0f) {
            defpackage.x50.oh6vYeIP("maximumVelocity should be a positive value. You specified=" + ((java.lang.Object) defpackage.rl1.xiZrDbcSW0(j)));
        }
        return defpackage.x80.adDC3e2L(gnVar.IHQe1A4L2xu.oh6vYeIP(defpackage.rl1.oh6vYeIP(j)), gnVar.oh6vYeIP.oh6vYeIP(defpackage.rl1.r1MBDhnF(j)));
    }

    @Override // defpackage.ql1, defpackage.nl1
    public boolean IHQe1A4L2xu() {
        ((defpackage.y) this.xiZrDbcSW0).getClass();
        return false;
    }

    @Override // defpackage.nl1
    public defpackage.i5 JlrlGoKF(long j, defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        return ((defpackage.y) this.xiZrDbcSW0).JlrlGoKF(j, i5Var, i5Var2, i5Var3);
    }

    @Override // defpackage.nl1
    public defpackage.i5 QoRHpC4k(defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        return ((defpackage.y) this.xiZrDbcSW0).QoRHpC4k(i5Var, i5Var2, i5Var3);
    }

    public defpackage.cw adDC3e2L(int i) {
        switch (this.adDC3e2L) {
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.fw[]) this.xiZrDbcSW0)[i];
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                return (defpackage.fw) this.xiZrDbcSW0;
            default:
                return (defpackage.cw) this.xiZrDbcSW0;
        }
    }

    @Override // defpackage.nl1
    public defpackage.i5 cnag84Bm(long j, defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        return ((defpackage.y) this.xiZrDbcSW0).cnag84Bm(j, i5Var, i5Var2, i5Var3);
    }

    @Override // defpackage.nl1
    public long oh6vYeIP(defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        return ((defpackage.y) this.xiZrDbcSW0).oh6vYeIP(i5Var, i5Var2, i5Var3);
    }

    @Override // defpackage.j31
    public defpackage.i31 r1MBDhnF(java.lang.String str) {
        str.getClass();
        defpackage.nd1 nd1Var = (defpackage.nd1) this.xiZrDbcSW0;
        java.lang.String databaseName = nd1Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                defpackage.db.adDC3e2L(defpackage.fx0.ez2rX8ReCYw("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str)) {
            int lastIndexOf = databaseName.lastIndexOf(47, databaseName.length() - 1);
            if (lastIndexOf != -1) {
                databaseName = databaseName.substring(lastIndexOf + 1, databaseName.length());
            }
            int lastIndexOf2 = str.lastIndexOf(47, str.length() - 1);
            if (!databaseName.equals(lastIndexOf2 == -1 ? str : str.substring(lastIndexOf2 + 1, str.length()))) {
                defpackage.db.ez2rX8ReCYw("This driver is configured to open a database named '", nd1Var.getDatabaseName(), "' but '", str, "' was requested.");
                return null;
            }
        }
        return new defpackage.md1(nd1Var.QQUzIjv3iOC5());
    }

    @Override // defpackage.j31
    public boolean riuEU0zW4() {
        return true;
    }

    public sa1(defpackage.qn qnVar) {
        this.adDC3e2L = 1;
        this.xiZrDbcSW0 = new defpackage.yv(defpackage.sb1.IHQe1A4L2xu, qnVar);
    }

    public sa1(defpackage.nd1 nd1Var) {
        this.adDC3e2L = 2;
        nd1Var.getClass();
        this.xiZrDbcSW0 = nd1Var;
    }

    public sa1(int i) {
        this.adDC3e2L = i;
        switch (i) {
            case 9:
                this.xiZrDbcSW0 = new defpackage.gn();
                break;
        }
    }

    public /* synthetic */ sa1(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    public sa1(float f, float f2, defpackage.i5 i5Var) {
        defpackage.sa1 sa1Var;
        this.adDC3e2L = 8;
        int i = defpackage.ol1.IHQe1A4L2xu;
        if (i5Var != null) {
            sa1Var = new defpackage.sa1(i5Var, f, f2);
        } else {
            sa1Var = new defpackage.sa1(f, f2);
        }
        this.xiZrDbcSW0 = new defpackage.y(sa1Var);
    }

    public sa1(defpackage.i5 i5Var, float f, float f2) {
        this.adDC3e2L = 5;
        int oh6vYeIP = i5Var.oh6vYeIP();
        defpackage.fw[] fwVarArr = new defpackage.fw[oh6vYeIP];
        for (int i = 0; i < oh6vYeIP; i++) {
            fwVarArr[i] = new defpackage.fw(f, f2, i5Var.IHQe1A4L2xu(i));
        }
        this.xiZrDbcSW0 = fwVarArr;
    }

    public sa1(float f, float f2) {
        this.adDC3e2L = 6;
        this.xiZrDbcSW0 = new defpackage.fw(f, f2, 0.01f);
    }
}
