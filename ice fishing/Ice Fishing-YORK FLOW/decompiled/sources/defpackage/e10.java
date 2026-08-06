package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class e10 implements java.io.Closeable {
    public static final defpackage.be0 P05cfTpS5W5L;
    public static final defpackage.be0 QiMR8OkAhezm;
    public static final java.lang.String[] oh71FJcDz6S2 = new java.lang.String[0];
    public final android.database.sqlite.SQLiteDatabase WDYagTQQm9ns;

    static {
        defpackage.n8 n8Var = new defpackage.n8(8);
        defpackage.yf0 yf0Var = defpackage.yf0.WDYagTQQm9ns;
        QiMR8OkAhezm = defpackage.t80.oCu53ZX2v4Ju(yf0Var, n8Var);
        P05cfTpS5W5L = defpackage.t80.oCu53ZX2v4Ju(yf0Var, new defpackage.n8(9));
    }

    public e10(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        this.WDYagTQQm9ns = sQLiteDatabase;
    }

    public final void JhCgjQRTAOCT() {
        this.WDYagTQQm9ns.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.WDYagTQQm9ns.close();
    }

    public final boolean gUjdnLbkVAaA() {
        return this.WDYagTQQm9ns.inTransaction();
    }

    public final void giKS3J6vZuNy() {
        this.WDYagTQQm9ns.beginTransaction();
    }

    public final boolean isOpen() {
        return this.WDYagTQQm9ns.isOpen();
    }
}
