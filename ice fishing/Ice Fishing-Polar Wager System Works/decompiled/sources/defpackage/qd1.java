package defpackage;

/* loaded from: classes.dex */
public final class qd1 extends defpackage.sd1 {
    public final /* synthetic */ int EXtogiMhuM = 1;
    public final java.lang.Object riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd1(defpackage.mz mzVar, java.lang.String str) {
        super(mzVar, str);
        mzVar.getClass();
        str.getClass();
        str.getClass();
        android.database.sqlite.SQLiteStatement compileStatement = mzVar.adDC3e2L.compileStatement(str);
        compileStatement.getClass();
        this.riuEU0zW4 = new defpackage.tz(compileStatement);
    }

    @Override // defpackage.k31
    public final void IHQe1A4L2xu(int i, long j) {
        int i2 = this.EXtogiMhuM;
        java.lang.Object obj = this.riuEU0zW4;
        switch (i2) {
            case 0:
                ((defpackage.rd1) obj).IHQe1A4L2xu(i, j);
                return;
            case 1:
                oh6vYeIP();
                ((defpackage.tz) obj).IHQe1A4L2xu(i, j);
                return;
            default:
                oh6vYeIP();
                defpackage.a70.SiPhmbmu("column index out of range", 25);
                throw null;
        }
    }

    @Override // defpackage.k31
    public final boolean NHJTzaLwkd() {
        int i = this.EXtogiMhuM;
        defpackage.mz mzVar = this.adDC3e2L;
        java.lang.Object obj = this.riuEU0zW4;
        switch (i) {
            case 0:
                defpackage.rd1 rd1Var = (defpackage.rd1) obj;
                boolean NHJTzaLwkd = rd1Var.NHJTzaLwkd();
                if (!rd1Var.xiZrDbcSW0(0).equalsIgnoreCase("wal")) {
                    mzVar.adDC3e2L.disableWriteAheadLogging();
                    break;
                } else {
                    mzVar.adDC3e2L.enableWriteAheadLogging();
                    break;
                }
            case 1:
                oh6vYeIP();
                ((defpackage.tz) obj).xiZrDbcSW0.execute();
                break;
            default:
                int ordinal = ((defpackage.pd1) obj).ordinal();
                if (ordinal == 0) {
                    mzVar.riuEU0zW4();
                    mzVar.AARZUJiTa();
                    break;
                } else if (ordinal == 1) {
                    mzVar.AARZUJiTa();
                    break;
                } else if (ordinal == 2) {
                    mzVar.oh6vYeIP();
                    break;
                } else if (ordinal == 3) {
                    mzVar.F7NU4MC0GW();
                    break;
                } else if (ordinal != 4) {
                    defpackage.db.F7NU4MC0GW();
                    break;
                } else {
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase = mzVar.adDC3e2L;
                    defpackage.eb0 eb0Var = defpackage.mz.EXtogiMhuM;
                    if (((java.lang.reflect.Method) eb0Var.getValue()) != null) {
                        defpackage.eb0 eb0Var2 = defpackage.mz.AARZUJiTa;
                        if (((java.lang.reflect.Method) eb0Var2.getValue()) != null) {
                            java.lang.reflect.Method method = (java.lang.reflect.Method) eb0Var.getValue();
                            method.getClass();
                            java.lang.reflect.Method method2 = (java.lang.reflect.Method) eb0Var2.getValue();
                            method2.getClass();
                            java.lang.Object invoke = method2.invoke(sQLiteDatabase, null);
                            if (invoke == null) {
                                defpackage.db.AARZUJiTa("Required value was null.");
                                break;
                            } else {
                                method.invoke(invoke, 0, null, 0, null);
                                break;
                            }
                        }
                    }
                    mzVar.oh6vYeIP();
                    break;
                }
        }
        return false;
    }

    @Override // defpackage.k31
    public boolean QoRHpC4k() {
        switch (this.EXtogiMhuM) {
            case 0:
                return ((defpackage.rd1) this.riuEU0zW4).QoRHpC4k();
            default:
                return super.QoRHpC4k();
        }
    }

    @Override // defpackage.k31
    public final void adDC3e2L(java.lang.String str, int i) {
        int i2 = this.EXtogiMhuM;
        java.lang.Object obj = this.riuEU0zW4;
        switch (i2) {
            case 0:
                str.getClass();
                ((defpackage.rd1) obj).adDC3e2L(str, i);
                return;
            case 1:
                str.getClass();
                oh6vYeIP();
                ((defpackage.tz) obj).abhbClRa(str, i);
                return;
            default:
                str.getClass();
                oh6vYeIP();
                defpackage.a70.SiPhmbmu("column index out of range", 25);
                throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.EXtogiMhuM;
        java.lang.Object obj = this.riuEU0zW4;
        switch (i) {
            case 0:
                ((defpackage.rd1) obj).close();
                break;
            case 1:
                ((defpackage.tz) obj).close();
                this.AARZUJiTa = true;
                break;
            default:
                this.AARZUJiTa = true;
                break;
        }
    }

    @Override // defpackage.k31
    public final int getColumnCount() {
        switch (this.EXtogiMhuM) {
            case 0:
                break;
            case 1:
                oh6vYeIP();
                break;
            default:
                oh6vYeIP();
                break;
        }
        return 0;
    }

    @Override // defpackage.k31
    public final java.lang.String getColumnName(int i) {
        switch (this.EXtogiMhuM) {
            case 0:
                return ((defpackage.rd1) this.riuEU0zW4).getColumnName(i);
            case 1:
                oh6vYeIP();
                defpackage.a70.SiPhmbmu("no row", 21);
                throw null;
            default:
                oh6vYeIP();
                defpackage.a70.SiPhmbmu("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.k31
    public final long getLong(int i) {
        switch (this.EXtogiMhuM) {
            case 0:
                return ((defpackage.rd1) this.riuEU0zW4).getLong(i);
            case 1:
                oh6vYeIP();
                defpackage.a70.SiPhmbmu("no row", 21);
                throw null;
            default:
                oh6vYeIP();
                defpackage.a70.SiPhmbmu("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.k31
    public final boolean isNull(int i) {
        switch (this.EXtogiMhuM) {
            case 0:
                return ((defpackage.rd1) this.riuEU0zW4).isNull(i);
            case 1:
                oh6vYeIP();
                defpackage.a70.SiPhmbmu("no row", 21);
                throw null;
            default:
                oh6vYeIP();
                defpackage.a70.SiPhmbmu("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.sd1, defpackage.k31
    public void r1MBDhnF() {
        int i = this.EXtogiMhuM;
        java.lang.Object obj = this.riuEU0zW4;
        switch (i) {
            case 0:
                ((defpackage.rd1) obj).r1MBDhnF();
                break;
            case 1:
                oh6vYeIP();
                ((defpackage.tz) obj).r1MBDhnF();
                break;
            default:
                super.r1MBDhnF();
                break;
        }
    }

    @Override // defpackage.sd1, defpackage.k31
    public void reset() {
        switch (this.EXtogiMhuM) {
            case 0:
                ((defpackage.rd1) this.riuEU0zW4).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // defpackage.k31
    public final java.lang.String xiZrDbcSW0(int i) {
        switch (this.EXtogiMhuM) {
            case 0:
                return ((defpackage.rd1) this.riuEU0zW4).xiZrDbcSW0(i);
            case 1:
                oh6vYeIP();
                defpackage.a70.SiPhmbmu("no row", 21);
                throw null;
            default:
                oh6vYeIP();
                defpackage.a70.SiPhmbmu("no row", 21);
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd1(defpackage.mz mzVar, java.lang.String str, defpackage.rd1 rd1Var) {
        super(mzVar, str);
        mzVar.getClass();
        str.getClass();
        this.riuEU0zW4 = rd1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd1(defpackage.mz mzVar, java.lang.String str, defpackage.pd1 pd1Var) {
        super(mzVar, str);
        mzVar.getClass();
        str.getClass();
        this.riuEU0zW4 = pd1Var;
    }
}
