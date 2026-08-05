package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xa0 extends ab0 {
    public final Object P7K7Inc8;
    public final /* synthetic */ int VgvYg0wo = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(fk fkVar, String str) {
        super(fkVar, str);
        fkVar.getClass();
        str.getClass();
        str.getClass();
        SQLiteStatement compileStatement = fkVar.NCTxEWno.compileStatement(str);
        compileStatement.getClass();
        this.P7K7Inc8 = new mk(compileStatement);
    }

    @Override // defpackage.ab0, defpackage.h40
    public void I5GHvsYW() {
        switch (this.VgvYg0wo) {
            case 0:
                ((za0) this.P7K7Inc8).I5GHvsYW();
                break;
            default:
                super.I5GHvsYW();
                break;
        }
    }

    @Override // defpackage.h40
    public final void MdtA4re8(String str, int i) {
        int i2 = this.VgvYg0wo;
        Object obj = this.P7K7Inc8;
        switch (i2) {
            case 0:
                str.getClass();
                ((za0) obj).MdtA4re8(str, i);
                return;
            case 1:
                str.getClass();
                VgvYg0wo();
                ((mk) obj).OxcuoDLp(str, i);
                return;
            default:
                str.getClass();
                VgvYg0wo();
                w30.bvfAo0eO("column index out of range", 25);
                throw null;
        }
    }

    @Override // defpackage.ab0, defpackage.h40
    public void NCTxEWno() {
        int i = this.VgvYg0wo;
        Object obj = this.P7K7Inc8;
        switch (i) {
            case 0:
                ((za0) obj).NCTxEWno();
                break;
            case 1:
                VgvYg0wo();
                ((mk) obj).NCTxEWno();
                break;
            default:
                super.NCTxEWno();
                break;
        }
    }

    @Override // defpackage.h40
    public final boolean amk52bBQ() {
        int i = this.VgvYg0wo;
        fk fkVar = this.NCTxEWno;
        Object obj = this.P7K7Inc8;
        switch (i) {
            case 0:
                za0 za0Var = (za0) obj;
                boolean amk52bBQ = za0Var.amk52bBQ();
                if (za0Var.wxUZMvaN(0).equalsIgnoreCase("wal")) {
                    fkVar.NCTxEWno.enableWriteAheadLogging();
                } else {
                    fkVar.NCTxEWno.disableWriteAheadLogging();
                }
                return amk52bBQ;
            case 1:
                VgvYg0wo();
                ((mk) obj).MdtA4re8.execute();
                return false;
            default:
                int ordinal = ((wa0) obj).ordinal();
                if (ordinal == 0) {
                    fkVar.NCTxEWno.setTransactionSuccessful();
                    fkVar.P7K7Inc8();
                } else if (ordinal == 1) {
                    fkVar.P7K7Inc8();
                } else if (ordinal == 2) {
                    fkVar.VgvYg0wo();
                } else if (ordinal == 3) {
                    fkVar.NCTxEWno.beginTransactionNonExclusive();
                } else {
                    if (ordinal != 4) {
                        throw new d7();
                    }
                    SQLiteDatabase sQLiteDatabase = fkVar.NCTxEWno;
                    fo foVar = fk.VgvYg0wo;
                    if (((Method) foVar.getValue()) != null) {
                        fo foVar2 = fk.wxUZMvaN;
                        if (((Method) foVar2.getValue()) != null) {
                            Method method = (Method) foVar.getValue();
                            method.getClass();
                            Method method2 = (Method) foVar2.getValue();
                            method2.getClass();
                            Object invoke = method2.invoke(sQLiteDatabase, null);
                            if (invoke != null) {
                                method.invoke(invoke, 0, null, 0, null);
                            } else {
                                m1.Ey6iv0m0("Required value was null.");
                            }
                        }
                    }
                    fkVar.VgvYg0wo();
                }
                return false;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.VgvYg0wo;
        Object obj = this.P7K7Inc8;
        switch (i) {
            case 0:
                ((za0) obj).close();
                break;
            case 1:
                ((mk) obj).close();
                this.wxUZMvaN = true;
                break;
            default:
                this.wxUZMvaN = true;
                break;
        }
    }

    @Override // defpackage.h40
    public final int getColumnCount() {
        switch (this.VgvYg0wo) {
            case 0:
                break;
            case 1:
                VgvYg0wo();
                break;
            default:
                VgvYg0wo();
                break;
        }
        return 0;
    }

    @Override // defpackage.h40
    public final String getColumnName(int i) {
        switch (this.VgvYg0wo) {
            case 0:
                return ((za0) this.P7K7Inc8).getColumnName(i);
            case 1:
                VgvYg0wo();
                w30.bvfAo0eO("no row", 21);
                throw null;
            default:
                VgvYg0wo();
                w30.bvfAo0eO("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.h40
    public final long getLong(int i) {
        switch (this.VgvYg0wo) {
            case 0:
                return ((za0) this.P7K7Inc8).getLong(i);
            case 1:
                VgvYg0wo();
                w30.bvfAo0eO("no row", 21);
                throw null;
            default:
                VgvYg0wo();
                w30.bvfAo0eO("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.h40
    public final boolean isNull(int i) {
        switch (this.VgvYg0wo) {
            case 0:
                return ((za0) this.P7K7Inc8).isNull(i);
            case 1:
                VgvYg0wo();
                w30.bvfAo0eO("no row", 21);
                throw null;
            default:
                VgvYg0wo();
                w30.bvfAo0eO("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.h40
    public final void qoPGr6Ce(int i, long j) {
        int i2 = this.VgvYg0wo;
        Object obj = this.P7K7Inc8;
        switch (i2) {
            case 0:
                ((za0) obj).qoPGr6Ce(i, j);
                return;
            case 1:
                VgvYg0wo();
                ((mk) obj).qoPGr6Ce(i, j);
                return;
            default:
                VgvYg0wo();
                w30.bvfAo0eO("column index out of range", 25);
                throw null;
        }
    }

    @Override // defpackage.h40
    public final String wxUZMvaN(int i) {
        switch (this.VgvYg0wo) {
            case 0:
                return ((za0) this.P7K7Inc8).wxUZMvaN(i);
            case 1:
                VgvYg0wo();
                w30.bvfAo0eO("no row", 21);
                throw null;
            default:
                VgvYg0wo();
                w30.bvfAo0eO("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.h40
    public boolean ygLcUYwZ() {
        switch (this.VgvYg0wo) {
            case 0:
                return ((za0) this.P7K7Inc8).ygLcUYwZ();
            default:
                return super.ygLcUYwZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(fk fkVar, String str, wa0 wa0Var) {
        super(fkVar, str);
        fkVar.getClass();
        str.getClass();
        this.P7K7Inc8 = wa0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(fk fkVar, String str, za0 za0Var) {
        super(fkVar, str);
        fkVar.getClass();
        str.getClass();
        this.P7K7Inc8 = za0Var;
    }
}
