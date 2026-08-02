package com.squareup.cash.clientsync.database;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.Transacter;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.AfterVersion;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlSchema;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import com.google.mlkit.common.internal.zzb;
import com.google.mlkit.common.internal.zzc;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.db.SessionQueries;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class ClientSyncDatabaseImpl extends TransacterImpl implements Transacter {
    public final SessionQueries auditLogEntryQueries;
    public final SessionQueries componentMigrationQueries;
    public final LocalTabContentQueries syncEntityQueries;
    public final LocalTabContentQueries syncRangeQueries;

    public final class Schema implements SqlSchema {
        public static final Schema INSTANCE = new Schema();

        /* renamed from: migrateInternal-ElmaSbI, reason: not valid java name */
        public static void m3474migrateInternalElmaSbI(AndroidSqliteDriver androidSqliteDriver, long j, long j2) {
            if (j <= 1 && j2 > 1) {
                androidSqliteDriver.execute(null, "CREATE TABLE sync_entity (\n  entity_id TEXT NOT NULL,\n  entity_type INTEGER NOT NULL,\n  entity_data BLOB NOT NULL,\n  value_type INTEGER,\n  processor_version INTEGER NOT NULL,\n  PRIMARY KEY (entity_id, entity_type)\n)", null);
                androidSqliteDriver.execute(null, "CREATE INDEX sync_entity_processor_versions ON sync_entity (processor_version)", null);
                androidSqliteDriver.execute(null, "CREATE INDEX sync_entity_value_types ON sync_entity (value_type)", null);
            }
            if (j <= 2 && j2 > 2) {
                androidSqliteDriver.execute(null, "CREATE TABLE unhandled_sync_entity (\n  entity_id TEXT NOT NULL,\n  entity_type INTEGER NOT NULL,\n  entity_data BLOB NOT NULL,\n  value_type INTEGER,\n  processor_version INTEGER NOT NULL,\n  PRIMARY KEY (entity_id, entity_type)\n)", null);
                androidSqliteDriver.execute(null, "CREATE INDEX unhandled_sync_entity_processor_versions ON sync_entity (processor_version)", null);
            }
            if (j <= 3 && j2 > 3) {
                androidSqliteDriver.execute(null, "CREATE TABLE IF NOT EXISTS sync_range (\n  sync_range BLOB UNIQUE NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE IF NOT EXISTS sync_entity (\n  entity_id TEXT NOT NULL,\n  entity_type INTEGER NOT NULL,\n  entity_data BLOB NOT NULL,\n  value_type INTEGER,\n  processor_version INTEGER NOT NULL,\n  PRIMARY KEY (entity_id, entity_type)\n)", null);
                androidSqliteDriver.execute(null, "CREATE INDEX IF NOT EXISTS sync_entity_processor_versions ON sync_entity (processor_version)", null);
                androidSqliteDriver.execute(null, "CREATE INDEX IF NOT EXISTS sync_entity_value_types ON sync_entity (value_type)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE IF NOT EXISTS unhandled_sync_entity (\n  entity_id TEXT NOT NULL,\n  entity_type INTEGER NOT NULL,\n  entity_data BLOB NOT NULL,\n  value_type INTEGER,\n  processor_version INTEGER NOT NULL,\n  PRIMARY KEY (entity_id, entity_type)\n)", null);
                androidSqliteDriver.execute(null, "CREATE INDEX IF NOT EXISTS unhandled_sync_entity_processor_versions ON sync_entity (processor_version)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE IF NOT EXISTS component_migration (\n  component_key TEXT PRIMARY KEY,\n  migration_version INTEGER NOT NULL\n)", null);
            }
            if (j <= 4 && j2 > 4) {
                androidSqliteDriver.execute(null, "ALTER TABLE sync_entity ADD COLUMN entity_version INTEGER", null);
                androidSqliteDriver.execute(null, "ALTER TABLE unhandled_sync_entity ADD COLUMN entity_version INTEGER", null);
            }
            if (j <= 5 && j2 > 5) {
                androidSqliteDriver.execute(null, "CREATE TABLE audit_log_entry (\n  row_id INTEGER PRIMARY KEY NOT NULL,\n  timestamp_ms INTEGER NOT NULL,\n  message TEXT NOT NULL\n)", null);
            }
            if (j <= 6 && j2 > 6) {
                androidSqliteDriver.execute(null, "DROP INDEX unhandled_sync_entity_processor_versions", null);
                androidSqliteDriver.execute(null, "DROP TABLE unhandled_sync_entity", null);
            }
            if (j <= 7 && j2 > 7) {
                androidSqliteDriver.execute(null, "CREATE TABLE sync_entity_temp (\n  entity_id TEXT NOT NULL,\n  entity_type INTEGER NOT NULL,\n  entity_data BLOB NOT NULL,\n  entity_version INTEGER,\n  value_type INTEGER,\n  PRIMARY KEY (entity_id, entity_type)\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO sync_entity_temp\nSELECT entity_id, entity_type, entity_data, entity_version, value_type\nFROM sync_entity", null);
                androidSqliteDriver.execute(null, "DROP INDEX sync_entity_processor_versions", null);
                androidSqliteDriver.execute(null, "DROP INDEX sync_entity_value_types", null);
                androidSqliteDriver.execute(null, "DROP TABLE sync_entity", null);
                androidSqliteDriver.execute(null, "ALTER TABLE sync_entity_temp RENAME TO sync_entity", null);
                androidSqliteDriver.execute(null, "CREATE INDEX sync_entity_value_types ON sync_entity (value_type)", null);
            }
            if (j <= 8 && j2 > 8) {
                androidSqliteDriver.execute(null, "CREATE TABLE sync_range_temp (\n  topic INTEGER NOT NULL,\n  bytes BLOB UNIQUE NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO sync_range_temp\nSELECT -1, sync_range\nFROM sync_range", null);
                androidSqliteDriver.execute(null, "DROP TABLE sync_range", null);
                androidSqliteDriver.execute(null, "ALTER TABLE sync_range_temp RENAME TO sync_range", null);
            }
            if (j <= 9 && j2 > 9) {
                androidSqliteDriver.execute(null, "CREATE TABLE sync_entity_temp (\n  topic INTEGER NOT NULL,\n  entity_id TEXT NOT NULL,\n  entity_type INTEGER NOT NULL,\n  entity_data BLOB NOT NULL,\n  entity_version INTEGER,\n  value_type INTEGER,\n  PRIMARY KEY (entity_id, entity_type)\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO sync_entity_temp\nSELECT -1, entity_id, entity_type, entity_data, entity_version, value_type\nFROM sync_entity", null);
                androidSqliteDriver.execute(null, "DROP INDEX sync_entity_value_types", null);
                androidSqliteDriver.execute(null, "DROP TABLE sync_entity", null);
                androidSqliteDriver.execute(null, "ALTER TABLE sync_entity_temp RENAME TO sync_entity", null);
                androidSqliteDriver.execute(null, "CREATE INDEX sync_entity_value_types ON sync_entity (value_type)", null);
            }
            if (j <= 10 && j2 > 10) {
                androidSqliteDriver.execute(null, "CREATE INDEX sync_entity_entity_types ON sync_entity (entity_type)", null);
            }
            if (j <= 11 && j2 > 11) {
                androidSqliteDriver.execute(null, "CREATE INDEX sync_entity_topics ON sync_entity (topic)", null);
            }
            QueryResult.Companion.getClass();
            QueryResult.Companion companion = QueryResult.Companion.$$INSTANCE;
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final QueryResult.Value create(AndroidSqliteDriver androidSqliteDriver) {
            androidSqliteDriver.execute(null, "CREATE TABLE audit_log_entry (\n  row_id INTEGER PRIMARY KEY NOT NULL,\n  timestamp_ms INTEGER NOT NULL,\n  message TEXT NOT NULL\n)", null);
            androidSqliteDriver.execute(null, "CREATE TABLE component_migration (\n  component_key TEXT PRIMARY KEY,\n  migration_version INTEGER NOT NULL\n)", null);
            androidSqliteDriver.execute(null, "CREATE TABLE sync_entity (\n  topic INTEGER NOT NULL,\n  entity_id TEXT NOT NULL,\n  entity_type INTEGER NOT NULL,\n  entity_data BLOB NOT NULL,\n  entity_version INTEGER,\n  value_type INTEGER,\n  PRIMARY KEY (entity_id, entity_type)\n)", null);
            androidSqliteDriver.execute(null, "CREATE TABLE sync_range (\n  topic INTEGER NOT NULL,\n  bytes BLOB UNIQUE NOT NULL\n)", null);
            androidSqliteDriver.execute(null, "CREATE INDEX sync_entity_topics ON sync_entity (topic)", null);
            androidSqliteDriver.execute(null, "CREATE INDEX sync_entity_entity_types ON sync_entity (entity_type)", null);
            androidSqliteDriver.execute(null, "CREATE INDEX sync_entity_value_types ON sync_entity (value_type)", null);
            QueryResult.Companion.getClass();
            return new QueryResult.Value(QueryResult.Companion.Unit);
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final long getVersion() {
            return 12L;
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final QueryResult.Value migrate(AndroidSqliteDriver androidSqliteDriver, long j, long j2, AfterVersion[] afterVersionArr) {
            ArrayList arrayList = new ArrayList();
            for (AfterVersion afterVersion : afterVersionArr) {
                long j3 = afterVersion.afterVersion;
                if (j <= j3 && j3 < j2) {
                    arrayList.add(afterVersion);
                }
            }
            for (AfterVersion afterVersion2 : CollectionsKt.sortedWith(arrayList, new b.C0008b(6))) {
                m3474migrateInternalElmaSbI(androidSqliteDriver, j, afterVersion2.afterVersion + 1);
                afterVersion2.block.invoke(androidSqliteDriver);
                j = afterVersion2.afterVersion + 1;
            }
            if (j < j2) {
                m3474migrateInternalElmaSbI(androidSqliteDriver, j, j2);
            }
            QueryResult.Companion.getClass();
            return new QueryResult.Value(QueryResult.Companion.Unit);
        }
    }

    public ClientSyncDatabaseImpl(AndroidSqliteDriver androidSqliteDriver, zzb zzbVar, zzc zzcVar) {
        super(androidSqliteDriver);
        this.auditLogEntryQueries = new SessionQueries(androidSqliteDriver);
        this.componentMigrationQueries = new SessionQueries(androidSqliteDriver);
        this.syncEntityQueries = new LocalTabContentQueries(androidSqliteDriver, zzbVar, 22);
        this.syncRangeQueries = new LocalTabContentQueries(androidSqliteDriver, zzcVar, 23);
    }
}
