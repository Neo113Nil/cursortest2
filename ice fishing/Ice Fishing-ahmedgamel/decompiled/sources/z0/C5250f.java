package z0;

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
import t0.C4986A;
import u.AbstractC5049e;

/* renamed from: z0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5250f extends SQLiteOpenHelper {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f42233A = 0;

    /* renamed from: n, reason: collision with root package name */
    public final Context f42234n;

    /* renamed from: u, reason: collision with root package name */
    public final C4986A f42235u;

    /* renamed from: v, reason: collision with root package name */
    public final F.d f42236v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f42237w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f42238x;

    /* renamed from: y, reason: collision with root package name */
    public final A0.a f42239y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f42240z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5250f(Context context, String str, final C4986A c4986a, final F.d callback, boolean z3) {
        super(context, str, null, callback.f854b, new DatabaseErrorHandler() { // from class: z0.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                F.d callback2 = F.d.this;
                kotlin.jvm.internal.h.e(callback2, "$callback");
                C4986A c4986a2 = c4986a;
                int i = C5250f.f42233A;
                kotlin.jvm.internal.h.d(dbObj, "dbObj");
                C5247c i6 = d6.c.i(c4986a2, dbObj);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + i6 + ".path");
                SQLiteDatabase sQLiteDatabase = i6.f42227n;
                if (!sQLiteDatabase.isOpen()) {
                    String path = sQLiteDatabase.getPath();
                    if (path != null) {
                        F.d.e(path);
                        return;
                    }
                    return;
                }
                List list = null;
                try {
                    try {
                        list = i6.f42228u;
                    } catch (SQLiteException unused) {
                    }
                    try {
                        i6.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                } finally {
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            kotlin.jvm.internal.h.d(obj, "p.second");
                            F.d.e((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase.getPath();
                        if (path2 != null) {
                            F.d.e(path2);
                        }
                    }
                }
            }
        });
        String str2;
        kotlin.jvm.internal.h.e(callback, "callback");
        this.f42234n = context;
        this.f42235u = c4986a;
        this.f42236v = callback;
        this.f42237w = z3;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            kotlin.jvm.internal.h.d(str2, "randomUUID().toString()");
        } else {
            str2 = str;
        }
        File cacheDir = context.getCacheDir();
        kotlin.jvm.internal.h.d(cacheDir, "context.cacheDir");
        this.f42239y = new A0.a(str2, cacheDir, false);
    }

    public final C5247c a(boolean z3) {
        A0.a aVar = this.f42239y;
        try {
            aVar.a((this.f42240z || getDatabaseName() == null) ? false : true);
            this.f42238x = false;
            SQLiteDatabase i = i(z3);
            if (!this.f42238x) {
                C5247c i6 = d6.c.i(this.f42235u, i);
                aVar.b();
                return i6;
            }
            close();
            C5247c a9 = a(z3);
            aVar.b();
            return a9;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public final SQLiteDatabase b(boolean z3) {
        if (z3) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            kotlin.jvm.internal.h.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        kotlin.jvm.internal.h.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        A0.a aVar = this.f42239y;
        try {
            aVar.a(aVar.f7a);
            super.close();
            this.f42235u.f40533n = null;
            this.f42240z = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase i(boolean z3) {
        File parentFile;
        String databaseName = getDatabaseName();
        Context context = this.f42234n;
        if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return b(z3);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return b(z3);
            } catch (Throwable th) {
                super.close();
                if (th instanceof C5249e) {
                    C5249e c5249e = th;
                    int d2 = AbstractC5049e.d(c5249e.f42231n);
                    Throwable th2 = c5249e.f42232u;
                    if (d2 == 0 || d2 == 1 || d2 == 2 || d2 == 3) {
                        throw th2;
                    }
                    if (!(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else {
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                    if (databaseName == null || !this.f42237w) {
                        throw th;
                    }
                }
                context.deleteDatabase(databaseName);
                try {
                    return b(z3);
                } catch (C5249e e9) {
                    throw e9.f42232u;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db) {
        kotlin.jvm.internal.h.e(db, "db");
        try {
            F.d dVar = this.f42236v;
            d6.c.i(this.f42235u, db);
            dVar.getClass();
        } catch (Throwable th) {
            throw new C5249e(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        kotlin.jvm.internal.h.e(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f42236v.j(d6.c.i(this.f42235u, sqLiteDatabase));
        } catch (Throwable th) {
            throw new C5249e(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db, int i, int i6) {
        kotlin.jvm.internal.h.e(db, "db");
        this.f42238x = true;
        try {
            this.f42236v.l(d6.c.i(this.f42235u, db), i, i6);
        } catch (Throwable th) {
            throw new C5249e(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db) {
        kotlin.jvm.internal.h.e(db, "db");
        if (!this.f42238x) {
            try {
                this.f42236v.k(d6.c.i(this.f42235u, db));
            } catch (Throwable th) {
                throw new C5249e(5, th);
            }
        }
        this.f42240z = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i6) {
        kotlin.jvm.internal.h.e(sqLiteDatabase, "sqLiteDatabase");
        this.f42238x = true;
        try {
            this.f42236v.l(d6.c.i(this.f42235u, sqLiteDatabase), i, i6);
        } catch (Throwable th) {
            throw new C5249e(3, th);
        }
    }
}
