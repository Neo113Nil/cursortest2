package androidx.room.driver;

import androidx.room.coroutines.ConnectionPool;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import coil3.Extras;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class SupportSQLiteConnectionPool implements ConnectionPool {
    public final Extras.Key supportDriver;

    public SupportSQLiteConnectionPool(Extras.Key key) {
        this.supportDriver = key;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((SupportSQLiteOpenHelper) this.supportDriver.f61default).close();
    }

    @Override // androidx.room.coroutines.ConnectionPool
    public final Object useConnection(boolean z, Function2 function2, Continuation continuation) {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = (SupportSQLiteOpenHelper) this.supportDriver.f61default;
        supportSQLiteOpenHelper.getClass();
        return function2.invoke(new SupportSQLitePooledConnection(new SupportSQLiteConnection(supportSQLiteOpenHelper.getWritableDatabase())), continuation);
    }
}
