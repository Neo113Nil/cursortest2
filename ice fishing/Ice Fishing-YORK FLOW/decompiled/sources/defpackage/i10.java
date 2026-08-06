package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class i10 extends android.database.sqlite.SQLiteOpenHelper {
    public static final /* synthetic */ int Ns0WNyEWdPsk = 0;
    public boolean GE9mJIPrb8gP;
    public boolean P05cfTpS5W5L;
    public final defpackage.wg QiMR8OkAhezm;
    public final android.content.Context WDYagTQQm9ns;
    public final defpackage.g21 e6mdH7fiFuta;
    public final defpackage.k0 oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i10(android.content.Context context, java.lang.String str, final defpackage.k0 k0Var, final defpackage.wg wgVar) {
        super(context, str, null, wgVar.ZpBGe2uQfcn8, new android.database.DatabaseErrorHandler() { // from class: f10
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                int i = defpackage.i10.Ns0WNyEWdPsk;
                sQLiteDatabase.getClass();
                defpackage.k0 k0Var2 = k0Var;
                defpackage.e10 e10Var = (defpackage.e10) k0Var2.oh71FJcDz6S2;
                if (e10Var == null || !e10Var.WDYagTQQm9ns.equals(sQLiteDatabase)) {
                    e10Var = new defpackage.e10(sQLiteDatabase);
                    k0Var2.oh71FJcDz6S2 = e10Var;
                }
                android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = e10Var.WDYagTQQm9ns;
                defpackage.wg.this.getClass();
                android.util.Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + e10Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    java.lang.String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        defpackage.wg.JhCgjQRTAOCT(path);
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
                                defpackage.wg.JhCgjQRTAOCT((java.lang.String) obj);
                            }
                        } else {
                            java.lang.String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                defpackage.wg.JhCgjQRTAOCT(path2);
                            }
                        }
                    }
                } catch (android.database.sqlite.SQLiteException unused) {
                }
                try {
                    e10Var.close();
                } catch (java.io.IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            }
        });
        java.lang.String str2;
        wgVar.getClass();
        this.WDYagTQQm9ns = context;
        this.oh71FJcDz6S2 = k0Var;
        this.QiMR8OkAhezm = wgVar;
        if (str == null) {
            str2 = java.util.UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.e6mdH7fiFuta = new defpackage.g21(str2, context.getCacheDir(), false);
    }

    public final defpackage.e10 JhCgjQRTAOCT(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        defpackage.k0 k0Var = this.oh71FJcDz6S2;
        k0Var.getClass();
        defpackage.e10 e10Var = (defpackage.e10) k0Var.oh71FJcDz6S2;
        if (e10Var != null && e10Var.WDYagTQQm9ns.equals(sQLiteDatabase)) {
            return e10Var;
        }
        defpackage.e10 e10Var2 = new defpackage.e10(sQLiteDatabase);
        k0Var.oh71FJcDz6S2 = e10Var2;
        return e10Var2;
    }

    public final android.database.sqlite.SQLiteDatabase QiMR8OkAhezm(boolean z) {
        android.database.sqlite.SQLiteDatabase readableDatabase;
        java.io.File parentFile;
        java.lang.String databaseName = getDatabaseName();
        boolean z2 = this.GE9mJIPrb8gP;
        if (databaseName != null && !z2 && (parentFile = this.WDYagTQQm9ns.getDatabasePath(databaseName).getParentFile()) != null) {
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
                if (th instanceof defpackage.g10) {
                    defpackage.g10 g10Var = (defpackage.g10) th;
                    int ordinal = g10Var.WDYagTQQm9ns.ordinal();
                    th = g10Var.oh71FJcDz6S2;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th;
                    }
                    if (ordinal != 4) {
                        defpackage.h7.T1fB7bDYiVJQ();
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

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        defpackage.g21 g21Var = this.e6mdH7fiFuta;
        try {
            g21Var.ZpBGe2uQfcn8(g21Var.ZpBGe2uQfcn8);
            super.close();
            this.oh71FJcDz6S2.oh71FJcDz6S2 = null;
            this.GE9mJIPrb8gP = false;
        } finally {
            g21Var.giKS3J6vZuNy();
        }
    }

    public final defpackage.e10 giKS3J6vZuNy(boolean z) {
        defpackage.g21 g21Var = this.e6mdH7fiFuta;
        try {
            g21Var.ZpBGe2uQfcn8((this.GE9mJIPrb8gP || getDatabaseName() == null) ? false : true);
            this.P05cfTpS5W5L = false;
            android.database.sqlite.SQLiteDatabase QiMR8OkAhezm = QiMR8OkAhezm(z);
            if (!this.P05cfTpS5W5L) {
                defpackage.e10 JhCgjQRTAOCT = JhCgjQRTAOCT(QiMR8OkAhezm);
                g21Var.giKS3J6vZuNy();
                return JhCgjQRTAOCT;
            }
            close();
            defpackage.e10 giKS3J6vZuNy = giKS3J6vZuNy(z);
            g21Var.giKS3J6vZuNy();
            return giKS3J6vZuNy;
        } catch (java.lang.Throwable th) {
            g21Var.giKS3J6vZuNy();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.P05cfTpS5W5L;
        defpackage.wg wgVar = this.QiMR8OkAhezm;
        if (!z && wgVar.ZpBGe2uQfcn8 != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            JhCgjQRTAOCT(sQLiteDatabase);
            wgVar.getClass();
        } catch (java.lang.Throwable th) {
            throw new defpackage.g10(defpackage.h10.WDYagTQQm9ns, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((defpackage.f61) this.QiMR8OkAhezm.giKS3J6vZuNy).fWTAfUmVKrZq(new defpackage.xh1(JhCgjQRTAOCT(sQLiteDatabase)));
        } catch (java.lang.Throwable th) {
            throw new defpackage.g10(defpackage.h10.oh71FJcDz6S2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.P05cfTpS5W5L = true;
        try {
            this.QiMR8OkAhezm.WDYagTQQm9ns(JhCgjQRTAOCT(sQLiteDatabase), i, i2);
        } catch (java.lang.Throwable th) {
            throw new defpackage.g10(defpackage.h10.P05cfTpS5W5L, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.P05cfTpS5W5L) {
            try {
                defpackage.wg wgVar = this.QiMR8OkAhezm;
                defpackage.e10 JhCgjQRTAOCT = JhCgjQRTAOCT(sQLiteDatabase);
                defpackage.f61 f61Var = (defpackage.f61) wgVar.giKS3J6vZuNy;
                f61Var.WDYagTQQm9ns(new defpackage.xh1(JhCgjQRTAOCT));
                f61Var.P05cfTpS5W5L = JhCgjQRTAOCT;
            } catch (java.lang.Throwable th) {
                throw new defpackage.g10(defpackage.h10.e6mdH7fiFuta, th);
            }
        }
        this.GE9mJIPrb8gP = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.P05cfTpS5W5L = true;
        try {
            this.QiMR8OkAhezm.WDYagTQQm9ns(JhCgjQRTAOCT(sQLiteDatabase), i, i2);
        } catch (java.lang.Throwable th) {
            throw new defpackage.g10(defpackage.h10.QiMR8OkAhezm, th);
        }
    }
}
