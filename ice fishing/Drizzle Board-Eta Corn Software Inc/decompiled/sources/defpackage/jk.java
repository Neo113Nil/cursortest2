package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class jk extends SQLiteOpenHelper {
    public static final /* synthetic */ int Qr9iLBAD = 0;
    public final tg0 MdtA4re8;
    public final Context NCTxEWno;
    public final h00 P7K7Inc8;
    public boolean VgvYg0wo;
    public boolean b2ZJblxo;
    public final DPHdAVYO wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(Context context, String str, final tg0 tg0Var, final DPHdAVYO dPHdAVYO) {
        super(context, str, null, dPHdAVYO.qoPGr6Ce, new DatabaseErrorHandler() { // from class: gk
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = jk.Qr9iLBAD;
                sQLiteDatabase.getClass();
                tg0 tg0Var2 = tg0Var;
                fk fkVar = (fk) tg0Var2.MdtA4re8;
                if (fkVar == null || !fkVar.NCTxEWno.equals(sQLiteDatabase)) {
                    fkVar = new fk(sQLiteDatabase);
                    tg0Var2.MdtA4re8 = fkVar;
                }
                SQLiteDatabase sQLiteDatabase2 = fkVar.NCTxEWno;
                DPHdAVYO.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + fkVar + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        DPHdAVYO.NCTxEWno(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                DPHdAVYO.NCTxEWno((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                DPHdAVYO.NCTxEWno(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    fkVar.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            }
        });
        String str2;
        dPHdAVYO.getClass();
        this.NCTxEWno = context;
        this.MdtA4re8 = tg0Var;
        this.wxUZMvaN = dPHdAVYO;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.P7K7Inc8 = new h00(str2, context.getCacheDir(), false);
    }

    public final fk P7K7Inc8(SQLiteDatabase sQLiteDatabase) {
        tg0 tg0Var = this.MdtA4re8;
        fk fkVar = (fk) tg0Var.MdtA4re8;
        if (fkVar != null && fkVar.NCTxEWno.equals(sQLiteDatabase)) {
            return fkVar;
        }
        fk fkVar2 = new fk(sQLiteDatabase);
        tg0Var.MdtA4re8 = fkVar2;
        return fkVar2;
    }

    public final SQLiteDatabase Qr9iLBAD(boolean z) {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.b2ZJblxo;
        if (databaseName != null && !z2 && (parentFile = this.NCTxEWno.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            readableDatabase2.getClass();
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase = getWritableDatabase();
                    readableDatabase.getClass();
                } else {
                    readableDatabase = getReadableDatabase();
                    readableDatabase.getClass();
                }
                return readableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof hk) {
                    hk hkVar = (hk) th;
                    int ordinal = hkVar.NCTxEWno.ordinal();
                    th = hkVar.MdtA4re8;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th;
                    }
                    if (ordinal != 4) {
                        throw new d7();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    public final fk VgvYg0wo(boolean z) {
        h00 h00Var = this.P7K7Inc8;
        try {
            h00Var.qoPGr6Ce((this.b2ZJblxo || getDatabaseName() == null) ? false : true);
            this.VgvYg0wo = false;
            SQLiteDatabase Qr9iLBAD2 = Qr9iLBAD(z);
            if (!this.VgvYg0wo) {
                fk P7K7Inc8 = P7K7Inc8(Qr9iLBAD2);
                h00Var.NCTxEWno();
                return P7K7Inc8;
            }
            close();
            fk VgvYg0wo = VgvYg0wo(z);
            h00Var.NCTxEWno();
            return VgvYg0wo;
        } catch (Throwable th) {
            h00Var.NCTxEWno();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        h00 h00Var = this.P7K7Inc8;
        try {
            h00Var.qoPGr6Ce(h00Var.qoPGr6Ce);
            super.close();
            this.MdtA4re8.MdtA4re8 = null;
            this.b2ZJblxo = false;
        } finally {
            h00Var.NCTxEWno();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.VgvYg0wo;
        DPHdAVYO dPHdAVYO = this.wxUZMvaN;
        if (!z && dPHdAVYO.qoPGr6Ce != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            P7K7Inc8(sQLiteDatabase);
            dPHdAVYO.getClass();
        } catch (Throwable th) {
            throw new hk(ik.NCTxEWno, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((zb) this.wxUZMvaN.NCTxEWno).eVhOlqcC(new ta0(P7K7Inc8(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new hk(ik.MdtA4re8, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.VgvYg0wo = true;
        try {
            this.wxUZMvaN.MdtA4re8(P7K7Inc8(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new hk(ik.VgvYg0wo, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.VgvYg0wo) {
            try {
                DPHdAVYO dPHdAVYO = this.wxUZMvaN;
                fk P7K7Inc8 = P7K7Inc8(sQLiteDatabase);
                zb zbVar = (zb) dPHdAVYO.NCTxEWno;
                zbVar.ow5vqvCr(new ta0(P7K7Inc8));
                zbVar.Qr9iLBAD = P7K7Inc8;
            } catch (Throwable th) {
                throw new hk(ik.P7K7Inc8, th);
            }
        }
        this.b2ZJblxo = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.VgvYg0wo = true;
        try {
            this.wxUZMvaN.MdtA4re8(P7K7Inc8(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new hk(ik.wxUZMvaN, th);
        }
    }
}
