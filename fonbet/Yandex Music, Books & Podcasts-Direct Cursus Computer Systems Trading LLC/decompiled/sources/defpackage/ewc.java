package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public final class ewc extends SQLiteOpenHelper {
    public static final /* synthetic */ int h = 0;
    public final Context a;
    public final awc b;
    public final ssr c;
    public final boolean d;
    public boolean e;
    public final dtm f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewc(Context context, String str, final awc awcVar, final ssr ssrVar, boolean z) {
        super(context, str, null, ssrVar.a, new DatabaseErrorHandler() { // from class: bwc
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = ewc.h;
                sQLiteDatabase.getClass();
                ssr.this.c(etn.L(awcVar, sQLiteDatabase));
            }
        });
        context.getClass();
        ssrVar.getClass();
        this.a = context;
        this.b = awcVar;
        this.c = ssrVar;
        this.d = z;
        this.f = new dtm(str == null ? eta.e() : str, context.getCacheDir(), false);
    }

    public final rsr a(boolean z) {
        dtm dtmVar = this.f;
        try {
            dtmVar.a((this.g || getDatabaseName() == null) ? false : true);
            this.e = false;
            SQLiteDatabase b = b(z);
            if (!this.e) {
                zvc L = etn.L(this.b, b);
                dtmVar.b();
                return L;
            }
            close();
            rsr a = a(z);
            dtmVar.b();
            return a;
        } catch (Throwable th) {
            dtmVar.b();
            throw th;
        }
    }

    public final SQLiteDatabase b(boolean z) {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.g;
        Context context = this.a;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
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
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof cwc) {
                    cwc cwcVar = (cwc) th;
                    int ordinal = cwcVar.a.ordinal();
                    th = cwcVar.b;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th;
                    }
                    if (ordinal != 4) {
                        b6e.s();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (cwc e) {
                    throw e.b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        dtm dtmVar = this.f;
        try {
            dtmVar.a(dtmVar.a);
            super.close();
            this.b.a = null;
            this.g = false;
        } finally {
            dtmVar.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.e;
        ssr ssrVar = this.c;
        if (!z && ssrVar.a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            ssrVar.b(etn.L(this.b, sQLiteDatabase));
        } catch (Throwable th) {
            throw new cwc(dwc.a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.c.d(etn.L(this.b, sQLiteDatabase));
        } catch (Throwable th) {
            throw new cwc(dwc.b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.e(etn.L(this.b, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new cwc(dwc.d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.e) {
            try {
                this.c.f(etn.L(this.b, sQLiteDatabase));
            } catch (Throwable th) {
                throw new cwc(dwc.e, th);
            }
        }
        this.g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.g(etn.L(this.b, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new cwc(dwc.c, th);
        }
    }
}
