package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class k10 implements defpackage.zh1 {
    public final android.database.sqlite.SQLiteProgram WDYagTQQm9ns;

    public k10(android.database.sqlite.SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.WDYagTQQm9ns = sQLiteProgram;
    }

    @Override // defpackage.zh1
    public final void GE9mJIPrb8gP(int i) {
        this.WDYagTQQm9ns.bindNull(i);
    }

    @Override // defpackage.zh1
    public final void IJ0hOnjhPOri(int i, byte[] bArr) {
        this.WDYagTQQm9ns.bindBlob(i, bArr);
    }

    @Override // defpackage.zh1
    public final void P05cfTpS5W5L(double d, int i) {
        this.WDYagTQQm9ns.bindDouble(i, d);
    }

    @Override // defpackage.zh1
    public final void VFeft99leXEK(java.lang.String str, int i) {
        str.getClass();
        this.WDYagTQQm9ns.bindString(i, str);
    }

    @Override // defpackage.zh1
    public final void ZpBGe2uQfcn8(int i, long j) {
        this.WDYagTQQm9ns.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.WDYagTQQm9ns.close();
    }

    @Override // defpackage.zh1
    public final void fWTAfUmVKrZq() {
        this.WDYagTQQm9ns.clearBindings();
    }
}
