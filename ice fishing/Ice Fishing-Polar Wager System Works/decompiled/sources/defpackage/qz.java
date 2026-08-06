package defpackage;

/* loaded from: classes.dex */
public final class qz extends android.database.sqlite.SQLiteOpenHelper {
    public static final /* synthetic */ int ez2rX8ReCYw = 0;
    public final defpackage.fz AARZUJiTa;
    public boolean EXtogiMhuM;
    public boolean SH1y5HwkJhh;
    public final android.content.Context adDC3e2L;
    public final defpackage.wx0 riuEU0zW4;
    public final defpackage.c1NqjJifC7 xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz(android.content.Context context, java.lang.String str, final defpackage.c1NqjJifC7 c1nqjjifc7, final defpackage.fz fzVar) {
        super(context, str, null, fzVar.IHQe1A4L2xu, new android.database.DatabaseErrorHandler() { // from class: nz
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                int i = defpackage.qz.ez2rX8ReCYw;
                sQLiteDatabase.getClass();
                defpackage.c1NqjJifC7 c1nqjjifc72 = c1nqjjifc7;
                defpackage.mz mzVar = (defpackage.mz) c1nqjjifc72.xiZrDbcSW0;
                if (mzVar == null || !mzVar.adDC3e2L.equals(sQLiteDatabase)) {
                    mzVar = new defpackage.mz(sQLiteDatabase);
                    c1nqjjifc72.xiZrDbcSW0 = mzVar;
                }
                android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = mzVar.adDC3e2L;
                defpackage.fz.this.getClass();
                android.util.Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + mzVar + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    java.lang.String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        defpackage.fz.r1MBDhnF(path);
                        return;
                    }
                    return;
                }
                java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            java.util.Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                java.lang.Object obj = ((android.util.Pair) it.next()).second;
                                obj.getClass();
                                defpackage.fz.r1MBDhnF((java.lang.String) obj);
                            }
                        } else {
                            java.lang.String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                defpackage.fz.r1MBDhnF(path2);
                            }
                        }
                    }
                } catch (android.database.sqlite.SQLiteException unused) {
                }
                try {
                    mzVar.close();
                } catch (java.io.IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            }
        });
        java.lang.String str2;
        fzVar.getClass();
        this.adDC3e2L = context;
        this.xiZrDbcSW0 = c1nqjjifc7;
        this.AARZUJiTa = fzVar;
        if (str == null) {
            str2 = java.util.UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.riuEU0zW4 = new defpackage.wx0(str2, context.getCacheDir(), false);
    }

    public final android.database.sqlite.SQLiteDatabase AARZUJiTa(boolean z) {
        android.database.sqlite.SQLiteDatabase readableDatabase;
        java.io.File parentFile;
        java.lang.String databaseName = getDatabaseName();
        boolean z2 = this.SH1y5HwkJhh;
        if (databaseName != null && !z2 && (parentFile = this.adDC3e2L.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                android.util.Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            android.database.sqlite.SQLiteDatabase readableDatabase2 = getReadableDatabase();
            readableDatabase2.getClass();
            return readableDatabase2;
        } catch (java.lang.Throwable unused) {
            try {
                java.lang.Thread.sleep(500L);
            } catch (java.lang.InterruptedException unused2) {
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
            } catch (java.lang.Throwable th) {
                th = th;
                if (th instanceof defpackage.oz) {
                    defpackage.oz ozVar = (defpackage.oz) th;
                    int ordinal = ozVar.adDC3e2L.ordinal();
                    th = ozVar.xiZrDbcSW0;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th;
                    }
                    if (ordinal != 4) {
                        defpackage.db.F7NU4MC0GW();
                        return null;
                    }
                    if (!(th instanceof android.database.sqlite.SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    public final defpackage.mz F7NU4MC0GW(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        defpackage.c1NqjJifC7 c1nqjjifc7 = this.xiZrDbcSW0;
        c1nqjjifc7.getClass();
        defpackage.mz mzVar = (defpackage.mz) c1nqjjifc7.xiZrDbcSW0;
        if (mzVar != null && mzVar.adDC3e2L.equals(sQLiteDatabase)) {
            return mzVar;
        }
        defpackage.mz mzVar2 = new defpackage.mz(sQLiteDatabase);
        c1nqjjifc7.xiZrDbcSW0 = mzVar2;
        return mzVar2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        defpackage.wx0 wx0Var = this.riuEU0zW4;
        try {
            wx0Var.IHQe1A4L2xu(wx0Var.IHQe1A4L2xu);
            super.close();
            this.xiZrDbcSW0.xiZrDbcSW0 = null;
            this.SH1y5HwkJhh = false;
        } finally {
            wx0Var.oh6vYeIP();
        }
    }

    public final defpackage.mz oh6vYeIP(boolean z) {
        defpackage.wx0 wx0Var = this.riuEU0zW4;
        try {
            wx0Var.IHQe1A4L2xu((this.SH1y5HwkJhh || getDatabaseName() == null) ? false : true);
            this.EXtogiMhuM = false;
            android.database.sqlite.SQLiteDatabase AARZUJiTa = AARZUJiTa(z);
            if (!this.EXtogiMhuM) {
                defpackage.mz F7NU4MC0GW = F7NU4MC0GW(AARZUJiTa);
                wx0Var.oh6vYeIP();
                return F7NU4MC0GW;
            }
            close();
            defpackage.mz oh6vYeIP = oh6vYeIP(z);
            wx0Var.oh6vYeIP();
            return oh6vYeIP;
        } catch (java.lang.Throwable th) {
            wx0Var.oh6vYeIP();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.EXtogiMhuM;
        defpackage.fz fzVar = this.AARZUJiTa;
        if (!z && fzVar.IHQe1A4L2xu != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            F7NU4MC0GW(sQLiteDatabase);
            fzVar.getClass();
        } catch (java.lang.Throwable th) {
            throw new defpackage.oz(defpackage.pz.adDC3e2L, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((defpackage.o21) this.AARZUJiTa.oh6vYeIP).r1MBDhnF(new defpackage.md1(F7NU4MC0GW(sQLiteDatabase)));
        } catch (java.lang.Throwable th) {
            throw new defpackage.oz(defpackage.pz.xiZrDbcSW0, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.EXtogiMhuM = true;
        try {
            this.AARZUJiTa.F7NU4MC0GW(F7NU4MC0GW(sQLiteDatabase), i, i2);
        } catch (java.lang.Throwable th) {
            throw new defpackage.oz(defpackage.pz.EXtogiMhuM, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.EXtogiMhuM) {
            try {
                defpackage.fz fzVar = this.AARZUJiTa;
                defpackage.mz F7NU4MC0GW = F7NU4MC0GW(sQLiteDatabase);
                defpackage.o21 o21Var = (defpackage.o21) fzVar.oh6vYeIP;
                o21Var.adDC3e2L(new defpackage.md1(F7NU4MC0GW));
                o21Var.EXtogiMhuM = F7NU4MC0GW;
            } catch (java.lang.Throwable th) {
                throw new defpackage.oz(defpackage.pz.riuEU0zW4, th);
            }
        }
        this.SH1y5HwkJhh = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.EXtogiMhuM = true;
        try {
            this.AARZUJiTa.F7NU4MC0GW(F7NU4MC0GW(sQLiteDatabase), i, i2);
        } catch (java.lang.Throwable th) {
            throw new defpackage.oz(defpackage.pz.AARZUJiTa, th);
        }
    }
}
