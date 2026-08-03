package i4;

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
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends SQLiteOpenHelper {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f3178n = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Context f3179g;

    /* renamed from: h, reason: collision with root package name */
    public final f8.c f3180h;

    /* renamed from: i, reason: collision with root package name */
    public final h4.a f3181i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3182j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3183k;

    /* renamed from: l, reason: collision with root package name */
    public final j4.a f3184l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3185m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, final f8.c cVar, final h4.a aVar, boolean z10) {
        super(context, str, null, aVar.f2838a, new DatabaseErrorHandler() { // from class: i4.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                j.e(h4.a.this, "$callback");
                int i10 = f.f3178n;
                j.d(sQLiteDatabase, "dbObj");
                c M = x4.f.M(cVar, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + M + ".path");
                SQLiteDatabase sQLiteDatabase2 = M.f3173g;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        h4.a.a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        M.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            j.d(obj, "p.second");
                            h4.a.a((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            h4.a.a(path2);
                        }
                    }
                }
            }
        });
        String str2;
        j.e(aVar, "callback");
        this.f3179g = context;
        this.f3180h = cVar;
        this.f3181i = aVar;
        this.f3182j = z10;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            j.d(str2, "randomUUID().toString()");
        } else {
            str2 = str;
        }
        this.f3184l = new j4.a(str2, context.getCacheDir(), false);
    }

    public final c a(boolean z10) {
        j4.a aVar = this.f3184l;
        try {
            aVar.a((this.f3185m || getDatabaseName() == null) ? false : true);
            this.f3183k = false;
            SQLiteDatabase d10 = d(z10);
            if (!this.f3183k) {
                c M = x4.f.M(this.f3180h, d10);
                aVar.b();
                return M;
            }
            close();
            c a6 = a(z10);
            aVar.b();
            return a6;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public final SQLiteDatabase b(boolean z10) {
        if (z10) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            j.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        j.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        j4.a aVar = this.f3184l;
        try {
            aVar.a(aVar.f3527a);
            super.close();
            this.f3180h.f2340h = null;
            this.f3185m = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase d(boolean z10) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z11 = this.f3185m;
        Context context = this.f3179g;
        if (databaseName != null && !z11 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return b(z10);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return b(z10);
            } catch (Throwable th) {
                super.close();
                if (th instanceof e) {
                    e eVar = th;
                    int d10 = v.f.d(eVar.f3176g);
                    Throwable th2 = eVar.f3177h;
                    if (d10 == 0 || d10 == 1 || d10 == 2 || d10 == 3) {
                        throw th2;
                    }
                    if (!(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else {
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                    if (databaseName == null || !this.f3182j) {
                        throw th;
                    }
                }
                context.deleteDatabase(databaseName);
                try {
                    return b(z10);
                } catch (e e10) {
                    throw e10.f3177h;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        j.e(sQLiteDatabase, "db");
        boolean z10 = this.f3183k;
        h4.a aVar = this.f3181i;
        if (!z10 && aVar.f2838a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            aVar.b(x4.f.M(this.f3180h, sQLiteDatabase));
        } catch (Throwable th) {
            throw new e(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        j.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f3181i.c(x4.f.M(this.f3180h, sQLiteDatabase));
        } catch (Throwable th) {
            throw new e(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        j.e(sQLiteDatabase, "db");
        this.f3183k = true;
        try {
            this.f3181i.d(x4.f.M(this.f3180h, sQLiteDatabase), i10, i11);
        } catch (Throwable th) {
            throw new e(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        j.e(sQLiteDatabase, "db");
        if (!this.f3183k) {
            try {
                this.f3181i.e(x4.f.M(this.f3180h, sQLiteDatabase));
            } catch (Throwable th) {
                throw new e(5, th);
            }
        }
        this.f3185m = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        j.e(sQLiteDatabase, "sqLiteDatabase");
        this.f3183k = true;
        try {
            this.f3181i.f(x4.f.M(this.f3180h, sQLiteDatabase), i10, i11);
        } catch (Throwable th) {
            throw new e(3, th);
        }
    }
}
