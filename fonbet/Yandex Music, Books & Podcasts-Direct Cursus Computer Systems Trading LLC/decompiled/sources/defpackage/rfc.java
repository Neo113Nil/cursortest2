package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import io.requery.android.database.sqlite.SQLiteDatabase;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.List;

/* loaded from: classes3.dex */
public final class rfc implements rsr {
    public final /* synthetic */ int a;
    public final rsr b;

    public rfc(rsr rsrVar, int i) {
        this.a = i;
        rsrVar.getClass();
        switch (i) {
            case 1:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) rsrVar;
                sQLiteDatabase.getClass();
                this.b = sQLiteDatabase;
                break;
            default:
                this.b = rsrVar;
                break;
        }
    }

    @Override // defpackage.rsr
    public final void beginTransaction() {
        switch (this.a) {
            case 0:
                this.b.beginTransaction();
                break;
            default:
                ((SQLiteDatabase) this.b).beginTransaction();
                break;
        }
    }

    @Override // defpackage.rsr
    public final void beginTransactionNonExclusive() {
        switch (this.a) {
            case 0:
                this.b.beginTransactionNonExclusive();
                break;
            default:
                ((SQLiteDatabase) this.b).beginTransactionNonExclusive();
                break;
        }
    }

    @Override // defpackage.rsr
    public final void beginTransactionReadOnly() {
        switch (this.a) {
            case 0:
                this.b.beginTransactionReadOnly();
                break;
            default:
                ((SQLiteDatabase) this.b).beginTransactionDeferred();
                break;
        }
    }

    @Override // defpackage.rsr
    public final void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        switch (this.a) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                this.b.close();
                break;
            default:
                ((SQLiteDatabase) this.b).close();
                break;
        }
    }

    @Override // defpackage.rsr
    public final dtr compileStatement(String str) {
        switch (this.a) {
            case 0:
                str.getClass();
                return this.b.compileStatement(str);
            default:
                str.getClass();
                SQLiteStatement compileStatement = ((SQLiteDatabase) this.b).compileStatement(str);
                compileStatement.getClass();
                return compileStatement;
        }
    }

    @Override // defpackage.rsr
    public final int delete(String str, String str2, Object[] objArr) {
        switch (this.a) {
            case 0:
                return this.b.delete(str, str2, objArr);
            default:
                return ((SQLiteDatabase) this.b).delete(str, str2, objArr);
        }
    }

    @Override // defpackage.rsr
    public final void disableWriteAheadLogging() {
        switch (this.a) {
            case 0:
                this.b.disableWriteAheadLogging();
                break;
            default:
                ((SQLiteDatabase) this.b).disableWriteAheadLogging();
                break;
        }
    }

    @Override // defpackage.rsr
    public final boolean enableWriteAheadLogging() {
        switch (this.a) {
            case 0:
                return this.b.enableWriteAheadLogging();
            default:
                return ((SQLiteDatabase) this.b).enableWriteAheadLogging();
        }
    }

    @Override // defpackage.rsr
    public final void endTransaction() {
        switch (this.a) {
            case 0:
                this.b.endTransaction();
                break;
            default:
                ((SQLiteDatabase) this.b).endTransaction();
                break;
        }
    }

    @Override // defpackage.rsr
    public final void execSQL(String str) {
        switch (this.a) {
            case 0:
                if (!str.equals("PRAGMA temp_store = MEMORY;")) {
                    this.b.execSQL(str);
                    break;
                }
                break;
            default:
                ((SQLiteDatabase) this.b).execSQL(str);
                break;
        }
    }

    @Override // defpackage.rsr
    public final List getAttachedDbs() {
        switch (this.a) {
            case 0:
                return this.b.getAttachedDbs();
            default:
                return ((SQLiteDatabase) this.b).getAttachedDbs();
        }
    }

    @Override // defpackage.rsr
    public final String getPath() {
        switch (this.a) {
            case 0:
                return this.b.getPath();
            default:
                return ((SQLiteDatabase) this.b).getPath();
        }
    }

    @Override // defpackage.rsr
    public final boolean inTransaction() {
        switch (this.a) {
            case 0:
                return this.b.inTransaction();
            default:
                return ((SQLiteDatabase) this.b).inTransaction();
        }
    }

    @Override // defpackage.rsr
    public final long insert(String str, int i, ContentValues contentValues) {
        switch (this.a) {
            case 0:
                return this.b.insert("album_operation", 4, contentValues);
            default:
                return ((SQLiteDatabase) this.b).insert("album_operation", 4, contentValues);
        }
    }

    @Override // defpackage.rsr
    public final boolean isOpen() {
        switch (this.a) {
            case 0:
                return this.b.isOpen();
            default:
                return ((SQLiteDatabase) this.b).isOpen();
        }
    }

    @Override // defpackage.rsr
    public final boolean isWriteAheadLoggingEnabled() {
        switch (this.a) {
            case 0:
                return this.b.isWriteAheadLoggingEnabled();
            default:
                return ((SQLiteDatabase) this.b).isWriteAheadLoggingEnabled();
        }
    }

    @Override // defpackage.rsr
    public final Cursor query(String str) {
        switch (this.a) {
            case 0:
                str.getClass();
                return this.b.query(str);
            default:
                str.getClass();
                Cursor query = ((SQLiteDatabase) this.b).query(str);
                query.getClass();
                return query;
        }
    }

    @Override // defpackage.rsr
    public final void setMaxSqlCacheSize(int i) {
        switch (this.a) {
            case 0:
                this.b.setMaxSqlCacheSize(100);
                break;
            default:
                ((SQLiteDatabase) this.b).setMaxSqlCacheSize(100);
                break;
        }
    }

    @Override // defpackage.rsr
    public final void setTransactionSuccessful() {
        switch (this.a) {
            case 0:
                this.b.setTransactionSuccessful();
                break;
            default:
                ((SQLiteDatabase) this.b).setTransactionSuccessful();
                break;
        }
    }

    @Override // defpackage.rsr
    public final int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        switch (this.a) {
            case 0:
                return this.b.update(str, i, contentValues, str2, objArr);
            default:
                return ((SQLiteDatabase) this.b).update(str, i, contentValues, str2, objArr);
        }
    }

    @Override // defpackage.rsr
    public final void execSQL(String str, Object[] objArr) {
        switch (this.a) {
            case 0:
                objArr.getClass();
                this.b.execSQL(str, objArr);
                break;
            default:
                objArr.getClass();
                ((SQLiteDatabase) this.b).execSQL(str, objArr);
                break;
        }
    }

    @Override // defpackage.rsr
    public final Cursor query(xsr xsrVar) {
        switch (this.a) {
            case 0:
                return this.b.query(xsrVar);
            default:
                Cursor query = ((SQLiteDatabase) this.b).query(xsrVar);
                query.getClass();
                return query;
        }
    }

    @Override // defpackage.rsr
    public final Cursor query(String str, Object[] objArr) {
        switch (this.a) {
            case 0:
                return this.b.query(str, objArr);
            default:
                Cursor query = ((SQLiteDatabase) this.b).query(str, objArr);
                query.getClass();
                return query;
        }
    }
}
