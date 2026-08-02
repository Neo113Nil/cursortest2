package app.cash.zipline.loader.internal.cache.ziplineloader;

import app.cash.sqldelight.Transacter;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.AfterVersion;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.db.SqlSchema;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.cash.zipline.loader.internal.cache.FilesQueries;
import app.cash.zipline.loader.internal.cache.PinsQueries;
import com.fillr.n;

/* loaded from: classes3.dex */
public final class DatabaseImpl extends TransacterImpl implements Transacter {
    public final FilesQueries filesQueries;
    public final PinsQueries pinsQueries;

    public final class Schema implements SqlSchema {
        public static final Schema INSTANCE = new Schema();

        @Override // app.cash.sqldelight.db.SqlSchema
        public final QueryResult.Value create(AndroidSqliteDriver androidSqliteDriver) {
            androidSqliteDriver.execute(null, "CREATE TABLE files (\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  sha256_hex TEXT NOT NULL,\n  manifest_for_application_name TEXT, -- LIKE 'red' or maybe 'red.manifest.json', null for all files except manifest\n  file_state TEXT NOT NULL,\n  size_bytes INTEGER NOT NULL,\n  last_used_at_epoch_ms INTEGER NOT NULL,\n  fresh_at_epoch_ms INTEGER -- null for all files except manifest\n)", null);
            androidSqliteDriver.execute(null, "CREATE TABLE pins (\n  file_id INTEGER NOT NULL,\n  application_name TEXT NOT NULL\n)", null);
            androidSqliteDriver.execute(null, "CREATE UNIQUE INDEX files_sha256_hex ON files(sha256_hex)", null);
            androidSqliteDriver.execute(null, "CREATE UNIQUE INDEX pins_file_id_application_name ON pins(file_id, application_name)", null);
            androidSqliteDriver.execute(null, "CREATE INDEX pins_application_name ON pins(application_name)", null);
            QueryResult.Companion.getClass();
            return new QueryResult.Value(QueryResult.Companion.Unit);
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final long getVersion() {
            return 1L;
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final QueryResult.Value migrate(AndroidSqliteDriver androidSqliteDriver, long j, long j2, AfterVersion[] afterVersionArr) {
            QueryResult.Companion.getClass();
            return new QueryResult.Value(QueryResult.Companion.Unit);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseImpl(SqlDriver sqlDriver, n.b bVar) {
        super(sqlDriver);
        sqlDriver.getClass();
        this.filesQueries = new FilesQueries(sqlDriver, bVar);
        this.pinsQueries = new PinsQueries(sqlDriver);
    }
}
