package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class fk implements Closeable {
    public static final String[] MdtA4re8 = new String[0];
    public static final fo VgvYg0wo;
    public static final fo wxUZMvaN;
    public final SQLiteDatabase NCTxEWno;

    static {
        ek ekVar = new ek(0);
        io ioVar = io.NCTxEWno;
        wxUZMvaN = w30.eIA6dogk(ioVar, ekVar);
        VgvYg0wo = w30.eIA6dogk(ioVar, new ek(1));
    }

    public fk(SQLiteDatabase sQLiteDatabase) {
        this.NCTxEWno = sQLiteDatabase;
    }

    public final void P7K7Inc8() {
        this.NCTxEWno.endTransaction();
    }

    public final void VgvYg0wo() {
        this.NCTxEWno.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.NCTxEWno.close();
    }

    public final boolean isOpen() {
        return this.NCTxEWno.isOpen();
    }

    public final boolean ow5vqvCr() {
        return this.NCTxEWno.inTransaction();
    }
}
