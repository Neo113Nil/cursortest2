package defpackage;

import android.database.sqlite.SQLiteProgram;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class lk implements va0 {
    public final SQLiteProgram NCTxEWno;

    public lk(SQLiteProgram sQLiteProgram) {
        this.NCTxEWno = sQLiteProgram;
    }

    @Override // defpackage.va0
    public final void NCTxEWno() {
        this.NCTxEWno.clearBindings();
    }

    @Override // defpackage.va0
    public final void OxcuoDLp(String str, int i) {
        str.getClass();
        this.NCTxEWno.bindString(i, str);
    }

    @Override // defpackage.va0
    public final void b2ZJblxo(int i) {
        this.NCTxEWno.bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.NCTxEWno.close();
    }

    @Override // defpackage.va0
    public final void jb9XjC4I(int i, double d) {
        this.NCTxEWno.bindDouble(i, d);
    }

    @Override // defpackage.va0
    public final void qoPGr6Ce(int i, long j) {
        this.NCTxEWno.bindLong(i, j);
    }

    @Override // defpackage.va0
    public final void sjUBp5pO(int i, byte[] bArr) {
        this.NCTxEWno.bindBlob(i, bArr);
    }
}
