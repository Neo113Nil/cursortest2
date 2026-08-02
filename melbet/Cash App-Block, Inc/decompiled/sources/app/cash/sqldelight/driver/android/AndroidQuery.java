package app.cash.sqldelight.driver.android;

import android.database.Cursor;
import androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda4;
import app.cash.sqldelight.db.QueryResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class AndroidQuery implements SupportSQLiteQuery, AndroidStatement {
    public final ArrayList binds;
    public final SupportSQLiteDatabase database;
    public final String sql;

    public AndroidQuery(String str, SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        str.getClass();
        supportSQLiteDatabase.getClass();
        this.sql = str;
        this.database = supportSQLiteDatabase;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(null);
        }
        this.binds = arrayList;
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void bindBoolean(int i, Boolean bool) {
        this.binds.set(i, new LazyListState$$ExternalSyntheticLambda3(bool, i, 5));
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void bindBytes(int i, byte[] bArr) {
        this.binds.set(i, new LazyListState$$ExternalSyntheticLambda3(bArr, i, 4));
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void bindDouble(int i, Double d) {
        this.binds.set(i, new LazyListState$$ExternalSyntheticLambda3(d, i, 6));
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void bindLong(int i, Long l) {
        this.binds.set(i, new WorkSpecDao_Impl$$ExternalSyntheticLambda4(l, i, 4));
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void bindString(int i, String str) {
        this.binds.set(i, new WorkSpecDao_Impl$$ExternalSyntheticLambda4(str, i, 3));
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        Iterator it = this.binds.iterator();
        while (it.hasNext()) {
            Function1 function1 = (Function1) it.next();
            function1.getClass();
            function1.invoke(supportSQLiteProgram);
        }
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void close() {
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final long execute() {
        throw new UnsupportedOperationException();
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final Object executeQuery(Function1 function1) {
        function1.getClass();
        Cursor query = this.database.query(this);
        try {
            Object value = ((QueryResult) function1.invoke(new AndroidCursor(query))).getValue();
            query.close();
            return value;
        } finally {
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final String getSql() {
        return this.sql;
    }

    public final String toString() {
        return this.sql;
    }
}
