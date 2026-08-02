package androidx.room.migration;

import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.NotImplementedError;

/* loaded from: classes.dex */
public abstract class Migration {
    public final int endVersion;
    public final int startVersion;

    public Migration(int i, int i2) {
        this.startVersion = i;
        this.endVersion = i2;
    }

    public void migrate(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        if (!(sQLiteConnection instanceof SupportSQLiteConnection)) {
            throw new NotImplementedError("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        migrate(((SupportSQLiteConnection) sQLiteConnection).db);
    }

    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        throw new NotImplementedError("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
