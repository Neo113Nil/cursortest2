package app.cash.zipline.loader.internal.cache;

import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.c7$$ExternalSyntheticLambda6;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import bo.app.yf$$ExternalSyntheticLambda10;
import com.fillr.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class FilesQueries extends TransacterImpl {
    public final n.b filesAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesQueries(SqlDriver sqlDriver, n.b bVar) {
        super(sqlDriver);
        sqlDriver.getClass();
        this.filesAdapter = bVar;
    }

    public final void delete(long j) {
        this.driver.execute(-835939045, "DELETE FROM files\nWHERE id = ?", new c7$$ExternalSyntheticLambda6(j, 7));
        notifyQueries(-835939045, new yf$$ExternalSyntheticLambda10(18));
    }

    public final Query get(String str) {
        str.getClass();
        FilesQueries$get$2 filesQueries$get$2 = FilesQueries$get$2.INSTANCE;
        return new GetQuery(this, str, new FilesQueries$$ExternalSyntheticLambda4(this, 2));
    }

    public final void update(final FileState fileState, final long j, final long j2, final long j3) {
        fileState.getClass();
        this.driver.execute(-339326919, "UPDATE files\nSET file_state = ?, size_bytes = ?, last_used_at_epoch_ms = ?\nWHERE id = ?", new Function1() { // from class: app.cash.zipline.loader.internal.cache.FilesQueries$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) ((EnumColumnAdapter) FilesQueries.this.filesAdapter.b).encode(fileState));
                androidStatement.bindLong(1, Long.valueOf(j));
                androidStatement.bindLong(2, Long.valueOf(j2));
                androidStatement.bindLong(3, Long.valueOf(j3));
                return Unit.INSTANCE;
            }
        });
        notifyQueries(-339326919, new yf$$ExternalSyntheticLambda10(15));
    }

    public final class GetQuery extends Query {
        public final /* synthetic */ int $r8$classId = 0;
        public final String sha256_hex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetQuery(FilesQueries filesQueries, String str, FilesQueries$$ExternalSyntheticLambda4 filesQueries$$ExternalSyntheticLambda4) {
            super(filesQueries$$ExternalSyntheticLambda4);
            str.getClass();
            FilesQueries.this = filesQueries;
            this.sha256_hex = str;
        }

        @Override // app.cash.sqldelight.Query
        public final void addListener(Query.Listener listener) {
            int i = this.$r8$classId;
            FilesQueries filesQueries = FilesQueries.this;
            switch (i) {
                case 0:
                    filesQueries.driver.addListener(new String[]{"files"}, listener);
                    break;
                default:
                    filesQueries.driver.addListener(new String[]{"files", "pins"}, listener);
                    break;
            }
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult execute(Function1 function1) {
            int i = this.$r8$classId;
            FilesQueries filesQueries = FilesQueries.this;
            switch (i) {
                case 0:
                    return filesQueries.driver.executeQuery(5453286, "SELECT files.id, files.sha256_hex, files.manifest_for_application_name, files.file_state, files.size_bytes, files.last_used_at_epoch_ms, files.fresh_at_epoch_ms\nFROM files\nWHERE sha256_hex LIKE ('%' || ?)\nLIMIT 1", function1, 1, new xg$$ExternalSyntheticLambda9(this, 8));
                default:
                    return filesQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT\n    |id,\n    |sha256_hex,\n    |manifest_for_application_name,\n    |file_state,\n    |size_bytes,\n    |last_used_at_epoch_ms,\n    |fresh_at_epoch_ms\n    |FROM files f\n    |LEFT JOIN pins p ON (\n    |  f.id = p.file_id AND\n    |  f.manifest_for_application_name = p.application_name\n    |)\n    |WHERE f.manifest_for_application_name ", this.sha256_hex == null ? "IS" : "=", " ?\n    |ORDER BY id DESC\n    |LIMIT 1\n    "), function1, 1, new xg$$ExternalSyntheticLambda9(this, 10));
            }
        }

        @Override // app.cash.sqldelight.Query
        public final void removeListener(Query.Listener listener) {
            int i = this.$r8$classId;
            FilesQueries filesQueries = FilesQueries.this;
            listener.getClass();
            switch (i) {
                case 0:
                    filesQueries.driver.removeListener(new String[]{"files"}, listener);
                    break;
                default:
                    filesQueries.driver.removeListener(new String[]{"files", "pins"}, listener);
                    break;
            }
        }

        public final String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "Files.sq:get";
                default:
                    return "Files.sq:selectPinnedManifest";
            }
        }

        public GetQuery(String str, FilesQueries$$ExternalSyntheticLambda4 filesQueries$$ExternalSyntheticLambda4, byte b) {
            super(filesQueries$$ExternalSyntheticLambda4);
            this.sha256_hex = str;
        }
    }
}
