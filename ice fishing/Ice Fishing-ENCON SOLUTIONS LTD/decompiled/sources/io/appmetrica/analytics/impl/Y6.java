package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Y6 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f5418a;

    /* renamed from: b, reason: collision with root package name */
    public final PublicLogger f5419b;

    /* renamed from: c, reason: collision with root package name */
    public final C0493in f5420c;

    public Y6(Context context, String str, C0493in c0493in, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, AbstractC0838w5.f7092b);
        this.f5420c = c0493in;
        this.f5418a = str;
        this.f5419b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f5419b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f5418a);
            Qj qj = AbstractC0645oj.f6689a;
            qj.getClass();
            qj.a(new C0671pj("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f5419b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f5418a);
            Qj qj = AbstractC0645oj.f6689a;
            qj.getClass();
            qj.a(new C0671pj("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f5420c.f6228a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        C0493in c0493in = this.f5420c;
        if (i2 <= i3) {
            c0493in.getClass();
            return;
        }
        try {
            c0493in.f6229b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c0493in.f6228a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C0493in c0493in = this.f5420c;
        c0493in.getClass();
        try {
            InterfaceC0519jn interfaceC0519jn = c0493in.f6231d;
            if (interfaceC0519jn == null || interfaceC0519jn.a(sQLiteDatabase)) {
                return;
            }
            try {
                c0493in.f6229b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c0493in.f6228a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        boolean z2;
        C0493in c0493in = this.f5420c;
        c0493in.getClass();
        if (i3 > i2) {
            for (int i4 = i2 + 1; i4 <= i3; i4++) {
                try {
                    Collection collection = (Collection) c0493in.f6230c.f6733a.get(Integer.valueOf(i4));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z2 = false;
            if (!z2 && !(!c0493in.f6231d.a(sQLiteDatabase))) {
                try {
                    c0493in.f6229b.runScript(sQLiteDatabase);
                } catch (Throwable unused2) {
                }
                try {
                    c0493in.f6228a.runScript(sQLiteDatabase);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            }
            return;
        }
        z2 = true;
        if (!(z2 | (c0493in.f6231d.a(sQLiteDatabase) ^ true))) {
        }
    }
}
