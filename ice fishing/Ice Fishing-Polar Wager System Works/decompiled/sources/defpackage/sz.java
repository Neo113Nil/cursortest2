package defpackage;

/* loaded from: classes.dex */
public class sz implements defpackage.od1 {
    public final android.database.sqlite.SQLiteProgram adDC3e2L;

    public sz(android.database.sqlite.SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.adDC3e2L = sQLiteProgram;
    }

    @Override // defpackage.od1
    public final void EXtogiMhuM(double d, int i) {
        this.adDC3e2L.bindDouble(i, d);
    }

    @Override // defpackage.od1
    public final void IHQe1A4L2xu(int i, long j) {
        this.adDC3e2L.bindLong(i, j);
    }

    @Override // defpackage.od1
    public final void SH1y5HwkJhh(int i) {
        this.adDC3e2L.bindNull(i);
    }

    @Override // defpackage.od1
    public final void abhbClRa(java.lang.String str, int i) {
        str.getClass();
        this.adDC3e2L.bindString(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.adDC3e2L.close();
    }

    @Override // defpackage.od1
    public final void fnWB2E7cs(int i, byte[] bArr) {
        this.adDC3e2L.bindBlob(i, bArr);
    }

    @Override // defpackage.od1
    public final void r1MBDhnF() {
        this.adDC3e2L.clearBindings();
    }
}
