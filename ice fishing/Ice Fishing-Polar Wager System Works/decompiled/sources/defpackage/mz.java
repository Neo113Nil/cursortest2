package defpackage;

/* loaded from: classes.dex */
public final class mz implements java.io.Closeable {
    public static final defpackage.eb0 AARZUJiTa;
    public static final defpackage.eb0 EXtogiMhuM;
    public static final java.lang.String[] xiZrDbcSW0 = new java.lang.String[0];
    public final android.database.sqlite.SQLiteDatabase adDC3e2L;

    static {
        defpackage.g gVar = new defpackage.g(7);
        defpackage.ed0 ed0Var = defpackage.ed0.adDC3e2L;
        AARZUJiTa = defpackage.c80.NHJTzaLwkd(ed0Var, gVar);
        EXtogiMhuM = defpackage.c80.NHJTzaLwkd(ed0Var, new defpackage.g(8));
    }

    public mz(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        this.adDC3e2L = sQLiteDatabase;
    }

    public final void AARZUJiTa() {
        this.adDC3e2L.endTransaction();
    }

    public final void F7NU4MC0GW() {
        this.adDC3e2L.beginTransactionNonExclusive();
    }

    public final boolean SyNS6RMn() {
        return this.adDC3e2L.inTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.adDC3e2L.close();
    }

    public final boolean isOpen() {
        return this.adDC3e2L.isOpen();
    }

    public final void oh6vYeIP() {
        this.adDC3e2L.beginTransaction();
    }

    public final void riuEU0zW4() {
        this.adDC3e2L.setTransactionSuccessful();
    }
}
