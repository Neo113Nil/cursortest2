package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes3.dex */
public final class vdh implements rsr {
    public final a7n a;
    public final xdh b;

    public vdh(a7n a7nVar, xdh xdhVar) {
        this.a = a7nVar;
        this.b = xdhVar;
    }

    public static String a(String str) {
        if (c.v(str, "CREATE TEMP TRIGGER", false)) {
            return null;
        }
        String obj = StringsKt.t0(str).toString();
        nrn nrnVar = nrn.IGNORE_CASE;
        Regex regex = new Regex("(?i)\\bINSERT\\s+(?:OR\\s+\\w+\\s+)?INTO\\s+((?:`?\\w+`?\\.)?`?(\\w+)`?)", nrnVar);
        Regex regex2 = new Regex("(?i)\\bUPDATE\\s+(?:OR\\s+\\w+\\s+)?((?:`?\\w+`?\\.)?`?(\\w+)`?)", nrnVar);
        Regex regex3 = new Regex("(?i)\\bDELETE\\s+FROM\\s+((?:`?\\w+`?\\.)?`?(\\w+)`?)", nrnVar);
        jch b = regex.b(obj);
        if (b != null) {
            return (String) ((fb9) b.a()).get(2);
        }
        jch b2 = regex3.b(obj);
        if (b2 != null) {
            return (String) ((fb9) b2.a()).get(2);
        }
        jch b3 = regex2.b(obj);
        if (b3 != null) {
            return (String) ((fb9) b3.a()).get(2);
        }
        return null;
    }

    @Override // defpackage.rsr
    public final void beginTransaction() {
        this.a.beginTransaction();
        this.b.b();
    }

    @Override // defpackage.rsr
    public final void beginTransactionNonExclusive() {
        this.a.beginTransactionNonExclusive();
        this.b.b();
    }

    @Override // defpackage.rsr
    public final void beginTransactionReadOnly() {
        this.a.beginTransactionReadOnly();
        this.b.b();
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
        return new udh(this.a.compileStatement(str), a(str), this, 0);
    }

    @Override // defpackage.rsr
    public final int delete(String str, String str2, Object[] objArr) {
        int delete = this.a.delete(str, str2, objArr);
        this.b.I(str);
        return delete;
    }

    @Override // defpackage.rsr
    public final void disableWriteAheadLogging() {
        this.a.disableWriteAheadLogging();
    }

    @Override // defpackage.rsr
    public final boolean enableWriteAheadLogging() {
        return this.a.a.enableWriteAheadLogging();
    }

    @Override // defpackage.rsr
    public final void endTransaction() {
        String[] strArr;
        ydh ydhVar;
        this.a.endTransaction();
        xdh xdhVar = this.b;
        synchronized (xdhVar.c) {
            zx0 l = xdhVar.l();
            wdh wdhVar = (wdh) (l.isEmpty() ? null : l.removeLast());
            if (wdhVar == null) {
                Assertions.throwOrSkip("MaterializedViewTrackingDatabase", new FailedAssertionException("Unexpected empty transactionStack"));
                return;
            }
            boolean z = wdhVar.a && !wdhVar.b;
            boolean isEmpty = xdhVar.l().isEmpty();
            if (!isEmpty && !z) {
                ((wdh) xdhVar.l().last()).b = true;
            }
            if (isEmpty) {
                synchronized (xdhVar.c) {
                    Object[] array = ((LinkedHashSet) xdhVar.b).toArray(new String[0]);
                    ((LinkedHashSet) xdhVar.b).clear();
                    strArr = (String[]) array;
                }
                if (!z || strArr.length == 0) {
                    return;
                }
                synchronized (xdhVar.c) {
                    ydhVar = (ydh) xdhVar.d;
                }
                ydhVar.getClass();
                ydhVar.a((String[]) Arrays.copyOf(strArr, strArr.length));
            }
        }
    }

    @Override // defpackage.rsr
    public final void execSQL(String str, Object[] objArr) {
        objArr.getClass();
        this.a.execSQL(str, objArr);
        String a = a(str);
        if (a != null) {
            this.b.I(a);
        }
    }

    @Override // defpackage.rsr
    public final List getAttachedDbs() {
        return this.a.a.getAttachedDbs();
    }

    @Override // defpackage.rsr
    public final String getPath() {
        return this.a.a.getPath();
    }

    @Override // defpackage.rsr
    public final boolean inTransaction() {
        return this.a.a.inTransaction();
    }

    @Override // defpackage.rsr
    public final long insert(String str, int i, ContentValues contentValues) {
        long insert = this.a.insert("album_operation", 4, contentValues);
        this.b.I("album_operation");
        return insert;
    }

    @Override // defpackage.rsr
    public final boolean isOpen() {
        return this.a.a.isOpen();
    }

    @Override // defpackage.rsr
    public final boolean isWriteAheadLoggingEnabled() {
        return this.a.a.isWriteAheadLoggingEnabled();
    }

    @Override // defpackage.rsr
    public final Cursor query(String str) {
        str.getClass();
        return this.a.query(str);
    }

    @Override // defpackage.rsr
    public final void setMaxSqlCacheSize(int i) {
        this.a.setMaxSqlCacheSize(100);
    }

    @Override // defpackage.rsr
    public final void setTransactionSuccessful() {
        this.a.setTransactionSuccessful();
        xdh xdhVar = this.b;
        synchronized (xdhVar.c) {
            wdh wdhVar = (wdh) xdhVar.l().r();
            if (wdhVar != null) {
                wdhVar.a = true;
            }
        }
    }

    @Override // defpackage.rsr
    public final int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        int update = this.a.update(str, i, contentValues, str2, objArr);
        this.b.I(str);
        return update;
    }

    @Override // defpackage.rsr
    public final Cursor query(xsr xsrVar) {
        return this.a.query(xsrVar);
    }

    @Override // defpackage.rsr
    public final Cursor query(String str, Object[] objArr) {
        return this.a.query(str, objArr);
    }

    @Override // defpackage.rsr
    public final void execSQL(String str) {
        this.a.execSQL(str);
        String a = a(str);
        if (a != null) {
            this.b.I(a);
        }
    }
}
