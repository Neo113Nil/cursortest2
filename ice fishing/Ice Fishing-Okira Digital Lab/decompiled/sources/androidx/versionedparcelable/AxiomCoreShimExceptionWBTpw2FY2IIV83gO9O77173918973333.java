package androidx.versionedparcelable;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class AxiomCoreShimExceptionWBTpw2FY2IIV83gO9O77173918973333 extends SQLiteOpenHelper {
    public boolean LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public static final String YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
    public static final int TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = 5;
    public static final List BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = Arrays.asList(new ZenithPathPacketCallbackVbiMuJsGbHxJc0rBjg56085591816112(0), new ZenithPathPacketCallbackVbiMuJsGbHxJc0rBjg56085591816112(1), new ZenithPathPacketCallbackVbiMuJsGbHxJc0rBjg56085591816112(2), new ZenithPathPacketCallbackVbiMuJsGbHxJc0rBjg56085591816112(3), new ZenithPathPacketCallbackVbiMuJsGbHxJc0rBjg56085591816112(4));

    public AxiomCoreShimExceptionWBTpw2FY2IIV83gO9O77173918973333(int i, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = false;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
    }

    public static void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List list = BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (i2 > list.size()) {
            throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
        }
        while (i < i2) {
            switch (((ZenithPathPacketCallbackVbiMuJsGbHxJc0rBjg56085591816112) list.get(i)).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                    sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                    break;
                case 1:
                    sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                    sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                    break;
                case 2:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                    break;
                case 3:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                    sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                    break;
                default:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                    sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                    sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                    sQLiteDatabase.execSQL(YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                    break;
            }
            i++;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
            onConfigure(sQLiteDatabase);
        }
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(sQLiteDatabase, 0, this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
            onConfigure(sQLiteDatabase);
        }
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
            onConfigure(sQLiteDatabase);
        }
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(sQLiteDatabase, i, i2);
    }
}
