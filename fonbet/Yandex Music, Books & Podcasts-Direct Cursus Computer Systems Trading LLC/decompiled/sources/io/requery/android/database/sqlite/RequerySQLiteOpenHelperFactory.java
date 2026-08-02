package io.requery.android.database.sqlite;

import android.content.Context;
import defpackage.hrg;
import defpackage.ssr;
import defpackage.tsr;
import defpackage.usr;
import defpackage.vsr;
import io.requery.android.database.DatabaseErrorHandler;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class RequerySQLiteOpenHelperFactory implements usr {
    private final Iterable<Object> configurationOptions;

    public static final class CallbackDatabaseErrorHandler implements DatabaseErrorHandler {
        private final ssr callback;

        public CallbackDatabaseErrorHandler(ssr ssrVar) {
            this.callback = ssrVar;
        }

        @Override // io.requery.android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
            this.callback.c(sQLiteDatabase);
        }
    }

    public static final class CallbackSQLiteOpenHelper extends SQLiteOpenHelper {
        private final ssr callback;
        private final Iterable<Object> configurationOptions;

        public CallbackSQLiteOpenHelper(Context context, String str, ssr ssrVar, Iterable<Object> iterable) {
            super(context, str, null, ssrVar.a, new CallbackDatabaseErrorHandler(ssrVar));
            this.callback = ssrVar;
            this.configurationOptions = iterable;
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public SQLiteDatabaseConfiguration createConfiguration(String str, int i) {
            SQLiteDatabaseConfiguration createConfiguration = super.createConfiguration(str, i);
            Iterator<Object> it = this.configurationOptions.iterator();
            if (it.hasNext()) {
                throw hrg.j(it);
            }
            return createConfiguration;
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.callback.b(sQLiteDatabase);
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.callback.d(sQLiteDatabase);
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.callback.e(sQLiteDatabase, i, i2);
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            this.callback.f(sQLiteDatabase);
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.callback.g(sQLiteDatabase, i, i2);
        }
    }

    public RequerySQLiteOpenHelperFactory(Iterable<Object> iterable) {
        this.configurationOptions = iterable;
    }

    @Override // defpackage.usr
    public vsr create(tsr tsrVar) {
        return new CallbackSQLiteOpenHelper(tsrVar.a, tsrVar.b, tsrVar.c, this.configurationOptions);
    }

    public RequerySQLiteOpenHelperFactory() {
        this(Collections.EMPTY_LIST);
    }
}
