package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import java.util.List;

/* loaded from: classes.dex */
public final class f42 implements rsr {
    public final a42 a;

    public f42(a42 a42Var) {
        this.a = a42Var;
    }

    @Override // defpackage.rsr
    public final void beginTransaction() {
        a42 a42Var = this.a;
        try {
            a42Var.e().beginTransaction();
        } catch (Throwable th) {
            a42Var.c();
            throw th;
        }
    }

    @Override // defpackage.rsr
    public final void beginTransactionNonExclusive() {
        a42 a42Var = this.a;
        try {
            a42Var.e().beginTransactionNonExclusive();
        } catch (Throwable th) {
            a42Var.c();
            throw th;
        }
    }

    @Override // defpackage.rsr
    public final void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a42 a42Var = this.a;
        synchronized (a42Var.b) {
            try {
                a42Var.a = true;
                rar rarVar = (rar) a42Var.j;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                a42Var.j = null;
                rsr rsrVar = (rsr) a42Var.i;
                if (rsrVar != null) {
                    rsrVar.close();
                }
                a42Var.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rsr
    public final dtr compileStatement(String str) {
        str.getClass();
        return new g42(str, this.a);
    }

    @Override // defpackage.rsr
    public final int delete(String str, String str2, Object[] objArr) {
        a42 a42Var = this.a;
        try {
            rsr e = a42Var.e();
            e.getClass();
            return e.delete(str, str2, objArr);
        } finally {
            a42Var.c();
        }
    }

    @Override // defpackage.rsr
    public final void disableWriteAheadLogging() {
        throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
    }

    @Override // defpackage.rsr
    public final boolean enableWriteAheadLogging() {
        throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
    }

    @Override // defpackage.rsr
    public final void endTransaction() {
        a42 a42Var = this.a;
        try {
            rsr rsrVar = (rsr) a42Var.i;
            rsrVar.getClass();
            rsrVar.endTransaction();
        } finally {
            a42Var.c();
        }
    }

    @Override // defpackage.rsr
    public final void execSQL(String str, Object[] objArr) {
        objArr.getClass();
        a42 a42Var = this.a;
        try {
            rsr e = a42Var.e();
            e.getClass();
            e.execSQL(str, objArr);
        } finally {
            a42Var.c();
        }
    }

    @Override // defpackage.rsr
    public final List getAttachedDbs() {
        return (List) this.a.d(b42.b);
    }

    @Override // defpackage.rsr
    public final String getPath() {
        return (String) this.a.d(e42.b);
    }

    @Override // defpackage.rsr
    public final boolean inTransaction() {
        a42 a42Var = this.a;
        if (((rsr) a42Var.i) == null) {
            return false;
        }
        return ((Boolean) a42Var.d(c42.a)).booleanValue();
    }

    @Override // defpackage.rsr
    public final long insert(String str, int i, ContentValues contentValues) {
        a42 a42Var = this.a;
        try {
            rsr e = a42Var.e();
            e.getClass();
            return e.insert("album_operation", 4, contentValues);
        } finally {
            a42Var.c();
        }
    }

    @Override // defpackage.rsr
    public final boolean isOpen() {
        return !this.a.a;
    }

    @Override // defpackage.rsr
    public final boolean isWriteAheadLoggingEnabled() {
        return ((Boolean) this.a.d(d42.b)).booleanValue();
    }

    @Override // defpackage.rsr
    public final Cursor query(String str) {
        a42 a42Var = this.a;
        str.getClass();
        try {
            return new h42(a42Var.e().query(str), a42Var);
        } catch (Throwable th) {
            a42Var.c();
            throw th;
        }
    }

    @Override // defpackage.rsr
    public final void setMaxSqlCacheSize(int i) {
        a42 a42Var = this.a;
        try {
            rsr e = a42Var.e();
            e.getClass();
            e.setMaxSqlCacheSize(100);
        } finally {
            a42Var.c();
        }
    }

    @Override // defpackage.rsr
    public final void setTransactionSuccessful() {
        rsr rsrVar = (rsr) this.a.i;
        rsrVar.getClass();
        rsrVar.setTransactionSuccessful();
    }

    @Override // defpackage.rsr
    public final int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        a42 a42Var = this.a;
        try {
            rsr e = a42Var.e();
            e.getClass();
            return e.update(str, i, contentValues, str2, objArr);
        } finally {
            a42Var.c();
        }
    }

    @Override // defpackage.rsr
    public final void execSQL(String str) {
        a42 a42Var = this.a;
        try {
            rsr e = a42Var.e();
            e.getClass();
            e.execSQL(str);
        } finally {
            a42Var.c();
        }
    }

    @Override // defpackage.rsr
    public final Cursor query(String str, Object[] objArr) {
        a42 a42Var = this.a;
        try {
            return new h42(a42Var.e().query(str, objArr), a42Var);
        } catch (Throwable th) {
            a42Var.c();
            throw th;
        }
    }

    @Override // defpackage.rsr
    public final Cursor query(xsr xsrVar) {
        a42 a42Var = this.a;
        try {
            return new h42(a42Var.e().query(xsrVar), a42Var);
        } catch (Throwable th) {
            a42Var.c();
            throw th;
        }
    }
}
