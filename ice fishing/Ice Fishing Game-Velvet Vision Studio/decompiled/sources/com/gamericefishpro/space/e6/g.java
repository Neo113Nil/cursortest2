package com.gamericefishpro.space.e6;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import com.gamericefishpro.space.oh.k;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {
    public static final /* synthetic */ int A = 0;
    public final Context d;
    public final com.gamericefishpro.space.vb.c e;
    public final com.gamericefishpro.space.d6.c i;
    public final boolean v;
    public boolean w;
    public final com.gamericefishpro.space.f6.a y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final com.gamericefishpro.space.vb.c dbRef, final com.gamericefishpro.space.d6.c callback, boolean z) {
        String string;
        super(context, str, null, callback.a, new DatabaseErrorHandler() { // from class: com.gamericefishpro.space.e6.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = g.A;
                Intrinsics.b(sQLiteDatabase);
                c db = com.gamericefishpro.space.b9.a.w(dbRef, sQLiteDatabase);
                callback.getClass();
                Intrinsics.checkNotNullParameter(db, "db");
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
                SQLiteDatabase sQLiteDatabase2 = db.d;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        com.gamericefishpro.space.d6.c.a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        db.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object second = ((Pair) it.next()).second;
                            Intrinsics.checkNotNullExpressionValue(second, "second");
                            com.gamericefishpro.space.d6.c.a((String) second);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            com.gamericefishpro.space.d6.c.a(path2);
                        }
                    }
                }
            }
        });
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dbRef, "dbRef");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.d = context;
        this.e = dbRef;
        this.i = callback;
        this.v = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else {
            string = str;
        }
        this.y = new com.gamericefishpro.space.f6.a(string, context.getCacheDir(), false);
    }

    public final com.gamericefishpro.space.d6.b b(boolean z) {
        com.gamericefishpro.space.f6.a aVar = this.y;
        try {
            aVar.a((this.z || getDatabaseName() == null) ? false : true);
            this.w = false;
            SQLiteDatabase sQLiteDatabaseJ = j(z);
            if (!this.w) {
                return c(sQLiteDatabaseJ);
            }
            close();
            return b(z);
        } finally {
            aVar.b();
        }
    }

    public final c c(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return com.gamericefishpro.space.b9.a.w(this.e, sqLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        com.gamericefishpro.space.f6.a aVar = this.y;
        try {
            aVar.a(aVar.a);
            super.close();
            this.e.e = null;
            this.z = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase j(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.z;
        Context context = this.d;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                Intrinsics.b(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            Intrinsics.b(readableDatabase3);
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    Intrinsics.b(readableDatabase2);
                } else {
                    readableDatabase2 = getReadableDatabase();
                    Intrinsics.b(readableDatabase2);
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof e) {
                    e eVar = (e) th;
                    int iOrdinal = eVar.d.ordinal();
                    th = eVar.e;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        throw new k();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.v) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        Intrinsics.b(readableDatabase);
                    } else {
                        readableDatabase = getReadableDatabase();
                        Intrinsics.b(readableDatabase);
                    }
                    return readableDatabase;
                } catch (e e) {
                    throw e.e;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        boolean z = this.w;
        com.gamericefishpro.space.d6.c cVar = this.i;
        if (!z && cVar.a != db.getVersion()) {
            db.setMaxSqlCacheSize(1);
        }
        try {
            cVar.f(c(db));
        } catch (Throwable th) {
            throw new e(f.d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.i.g(c(sqLiteDatabase));
        } catch (Throwable th) {
            throw new e(f.e, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db, int i, int i2) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.w = true;
        try {
            this.i.h(c(db), i, i2);
        } catch (Throwable th) {
            throw new e(f.v, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        if (!this.w) {
            try {
                this.i.i(c(db));
            } catch (Throwable th) {
                throw new e(f.w, th);
            }
        }
        this.z = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        this.w = true;
        try {
            this.i.j(c(sqLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new e(f.i, th);
        }
    }
}
