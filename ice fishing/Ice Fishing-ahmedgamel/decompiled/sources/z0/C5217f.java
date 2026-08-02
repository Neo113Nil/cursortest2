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
import l.C4659e;
import u.AbstractC5050e;

/* renamed from: z0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5217f extends SQLiteOpenHelper {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f42204A = 0;

    /* renamed from: n, reason: collision with root package name */
    public final Context f42205n;

    /* renamed from: u, reason: collision with root package name */
    public final C4659e f42206u;

    /* renamed from: v, reason: collision with root package name */
    public final F.d f42207v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f42208w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f42209x;

    /* renamed from: y, reason: collision with root package name */
    public final A0.a f42210y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f42211z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5217f(Context context, String str, final C4659e c4659e, final F.d callback, boolean z6) {
        super(context, str, null, callback.f917b, new DatabaseErrorHandler() { // from class: z0.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                F.d callback2 = F.d.this;
                kotlin.jvm.internal.h.e(callback2, "$callback");
                C4659e c4659e2 = c4659e;
                int i = C5217f.f42204A;
                kotlin.jvm.internal.h.d(dbObj, "dbObj");
                C5214c h3 = d6.c.h(c4659e2, dbObj);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + h3 + ".path");
                SQLiteDatabase sQLiteDatabase = h3.f42198n;
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
                        list = h3.f42199u;
                    } catch (SQLiteException unused) {
                    }
                    try {
                        h3.close();
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
        this.f42205n = context;
        this.f42206u = c4659e;
        this.f42207v = callback;
        this.f42208w = z6;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            kotlin.jvm.internal.h.d(str2, "randomUUID().toString()");
        } else {
            str2 = str;
        }
        File cacheDir = context.getCacheDir();
        kotlin.jvm.internal.h.d(cacheDir, "context.cacheDir");
        this.f42210y = new A0.a(str2, cacheDir, false);
    }

    public final C5214c a(boolean z6) {
        A0.a aVar = this.f42210y;
        try {
            aVar.a((this.f42211z || getDatabaseName() == null) ? false : true);
            this.f42209x = false;
            SQLiteDatabase i = i(z6);
            if (!this.f42209x) {
                C5214c h3 = d6.c.h(this.f42206u, i);
                aVar.b();
                return h3;
            }
            close();
            C5214c a9 = a(z6);
            aVar.b();
            return a9;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public final SQLiteDatabase b(boolean z6) {
        if (z6) {
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
        A0.a aVar = this.f42210y;
        try {
            aVar.a(aVar.f7a);
            super.close();
            this.f42206u.f38688u = null;
            this.f42211z = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase i(boolean z6) {
        File parentFile;
        String databaseName = getDatabaseName();
        Context context = this.f42205n;
        if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return b(z6);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return b(z6);
            } catch (Throwable th) {
                super.close();
                if (th instanceof C5216e) {
                    C5216e c5216e = th;
                    int d9 = AbstractC5050e.d(c5216e.f42202n);
                    Throwable th2 = c5216e.f42203u;
                    if (d9 == 0 || d9 == 1 || d9 == 2 || d9 == 3) {
                        throw th2;
                    }
                    if (!(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else {
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                    if (databaseName == null || !this.f42208w) {
                        throw th;
                    }
                }
                context.deleteDatabase(databaseName);
                try {
                    return b(z6);
                } catch (C5216e e9) {
                    throw e9.f42203u;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db) {
        kotlin.jvm.internal.h.e(db, "db");
        try {
            F.d dVar = this.f42207v;
            d6.c.h(this.f42206u, db);
            dVar.getClass();
        } catch (Throwable th) {
            throw new C5216e(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        kotlin.jvm.internal.h.e(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f42207v.j(d6.c.h(this.f42206u, sqLiteDatabase));
        } catch (Throwable th) {
            throw new C5216e(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db, int i, int i4) {
        kotlin.jvm.internal.h.e(db, "db");
        this.f42209x = true;
        try {
            this.f42207v.l(d6.c.h(this.f42206u, db), i, i4);
        } catch (Throwable th) {
            throw new C5216e(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db) {
        kotlin.jvm.internal.h.e(db, "db");
        if (!this.f42209x) {
            try {
                this.f42207v.k(d6.c.h(this.f42206u, db));
            } catch (Throwable th) {
                throw new C5216e(5, th);
            }
        }
        this.f42211z = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i4) {
        kotlin.jvm.internal.h.e(sqLiteDatabase, "sqLiteDatabase");
        this.f42209x = true;
        try {
            this.f42207v.l(d6.c.h(this.f42206u, sqLiteDatabase), i, i4);
        } catch (Throwable th) {
            throw new C5216e(3, th);
        }
    }
}
