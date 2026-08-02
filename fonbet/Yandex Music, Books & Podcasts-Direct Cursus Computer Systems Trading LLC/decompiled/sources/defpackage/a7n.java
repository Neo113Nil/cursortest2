package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.SystemClock;
import com.appsflyer.internal.k;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a7n implements rsr {
    public final rsr a;
    public final e1n b;
    public final jyr c;

    public a7n(rsr rsrVar, e1n e1nVar, jyr jyrVar) {
        rsrVar.getClass();
        this.a = rsrVar;
        this.b = e1nVar;
        this.c = jyrVar;
    }

    public final void a(c7n c7nVar, long j) {
        jyr jyrVar = this.b.a;
        b7n b7nVar = c7nVar.b;
        String str = c7nVar.a;
        int ordinal = b7nVar.ordinal();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (ordinal == 0) {
            if (((Boolean) jyrVar.getValue()).booleanValue()) {
                v3w.m(k.q("recordSelect ", j, str, StringUtil.SPACE), "ms", 4, "DatabaseStats", null);
            }
            y2x.t(0L, 60000L, 100, "Db.Query.Select.DurationMs.".concat(str)).c(j, timeUnit);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                return;
            }
            b6e.s();
        } else {
            if (((Boolean) jyrVar.getValue()).booleanValue()) {
                v3w.m(k.q("recordMviewRebuild ", j, str, StringUtil.SPACE), "ms", 4, "DatabaseStats", null);
            }
            y2x.t(0L, 60000L, 100, "Db.MView.Rebuild.InsertMs.".concat(str)).c(j, timeUnit);
        }
    }

    @Override // defpackage.rsr
    public final void beginTransaction() {
        this.a.beginTransaction();
    }

    @Override // defpackage.rsr
    public final void beginTransactionNonExclusive() {
        this.a.beginTransactionNonExclusive();
    }

    @Override // defpackage.rsr
    public final void beginTransactionReadOnly() {
        this.a.beginTransactionReadOnly();
    }

    @Override // defpackage.rsr
    public final void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.rsr
    public final dtr compileStatement(String str) {
        str.getClass();
        return new udh(this.a.compileStatement(str), this, d7n.d(str), 1);
    }

    @Override // defpackage.rsr
    public final int delete(String str, String str2, Object[] objArr) {
        boolean booleanValue = ((Boolean) this.c.getValue()).booleanValue();
        rsr rsrVar = this.a;
        if (!booleanValue) {
            return rsrVar.delete(str, str2, objArr);
        }
        ConcurrentHashMap concurrentHashMap = d7n.a;
        c7n c7nVar = new c7n(str, b7n.c);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int delete = rsrVar.delete(str, str2, objArr);
        a(c7nVar, SystemClock.elapsedRealtime() - elapsedRealtime);
        return delete;
    }

    @Override // defpackage.rsr
    public final void disableWriteAheadLogging() {
        this.a.disableWriteAheadLogging();
    }

    @Override // defpackage.rsr
    public final boolean enableWriteAheadLogging() {
        return this.a.enableWriteAheadLogging();
    }

    @Override // defpackage.rsr
    public final void endTransaction() {
        this.a.endTransaction();
    }

    @Override // defpackage.rsr
    public final void execSQL(String str, Object[] objArr) {
        objArr.getClass();
        boolean booleanValue = ((Boolean) this.c.getValue()).booleanValue();
        rsr rsrVar = this.a;
        if (!booleanValue) {
            rsrVar.execSQL(str, objArr);
            return;
        }
        c7n d = d7n.d(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        rsrVar.execSQL(str, objArr);
        a(d, SystemClock.elapsedRealtime() - elapsedRealtime);
    }

    @Override // defpackage.rsr
    public final List getAttachedDbs() {
        return this.a.getAttachedDbs();
    }

    @Override // defpackage.rsr
    public final String getPath() {
        return this.a.getPath();
    }

    @Override // defpackage.rsr
    public final boolean inTransaction() {
        return this.a.inTransaction();
    }

    @Override // defpackage.rsr
    public final long insert(String str, int i, ContentValues contentValues) {
        boolean booleanValue = ((Boolean) this.c.getValue()).booleanValue();
        rsr rsrVar = this.a;
        if (!booleanValue) {
            return rsrVar.insert("album_operation", 4, contentValues);
        }
        ConcurrentHashMap concurrentHashMap = d7n.a;
        c7n c7nVar = new c7n("album_operation", b7n.c);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long insert = rsrVar.insert("album_operation", 4, contentValues);
        a(c7nVar, SystemClock.elapsedRealtime() - elapsedRealtime);
        return insert;
    }

    @Override // defpackage.rsr
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // defpackage.rsr
    public final boolean isWriteAheadLoggingEnabled() {
        return this.a.isWriteAheadLoggingEnabled();
    }

    @Override // defpackage.rsr
    public final Cursor query(xsr xsrVar) {
        boolean booleanValue = ((Boolean) this.c.getValue()).booleanValue();
        rsr rsrVar = this.a;
        if (!booleanValue) {
            return rsrVar.query(xsrVar);
        }
        ConcurrentHashMap concurrentHashMap = d7n.a;
        c7n d = d7n.d(xsrVar.o());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Cursor query = rsrVar.query(xsrVar);
        a(d, SystemClock.elapsedRealtime() - elapsedRealtime);
        return query;
    }

    @Override // defpackage.rsr
    public final void setMaxSqlCacheSize(int i) {
        this.a.setMaxSqlCacheSize(100);
    }

    @Override // defpackage.rsr
    public final void setTransactionSuccessful() {
        this.a.setTransactionSuccessful();
    }

    @Override // defpackage.rsr
    public final int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        if (!((Boolean) this.c.getValue()).booleanValue()) {
            return this.a.update(str, i, contentValues, str2, objArr);
        }
        ConcurrentHashMap concurrentHashMap = d7n.a;
        c7n c7nVar = new c7n(str, b7n.c);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int update = this.a.update(str, i, contentValues, str2, objArr);
        a(c7nVar, SystemClock.elapsedRealtime() - elapsedRealtime);
        return update;
    }

    @Override // defpackage.rsr
    public final void execSQL(String str) {
        boolean booleanValue = ((Boolean) this.c.getValue()).booleanValue();
        rsr rsrVar = this.a;
        if (!booleanValue) {
            rsrVar.execSQL(str);
            return;
        }
        c7n d = d7n.d(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        rsrVar.execSQL(str);
        a(d, SystemClock.elapsedRealtime() - elapsedRealtime);
    }

    @Override // defpackage.rsr
    public final Cursor query(String str) {
        str.getClass();
        boolean booleanValue = ((Boolean) this.c.getValue()).booleanValue();
        rsr rsrVar = this.a;
        if (!booleanValue) {
            return rsrVar.query(str);
        }
        c7n d = d7n.d(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Cursor query = rsrVar.query(str);
        a(d, SystemClock.elapsedRealtime() - elapsedRealtime);
        return query;
    }

    @Override // defpackage.rsr
    public final Cursor query(String str, Object[] objArr) {
        boolean booleanValue = ((Boolean) this.c.getValue()).booleanValue();
        rsr rsrVar = this.a;
        if (!booleanValue) {
            return rsrVar.query(str, objArr);
        }
        c7n d = d7n.d(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Cursor query = rsrVar.query(str, objArr);
        a(d, SystemClock.elapsedRealtime() - elapsedRealtime);
        return query;
    }
}
