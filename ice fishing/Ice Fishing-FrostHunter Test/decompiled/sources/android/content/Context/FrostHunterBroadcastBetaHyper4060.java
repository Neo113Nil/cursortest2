package android.content.Context;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBroadcastBetaHyper4060 extends SQLiteOpenHelper {
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public boolean FrostHunterFlowMaxDragonHero5809;
    public static final String FrostHunterAlertDialogAuroraDelta3200 = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
    public static final int FrostHunterKeyframeGammaGamma1197 = 5;
    public static final List FrostHunterFragmentBetaMegaVortex6025 = Arrays.asList(new FrostHunterGradientDrawableGammaMax8621(0), new FrostHunterGradientDrawableGammaMax8621(1), new FrostHunterGradientDrawableGammaMax8621(2), new FrostHunterGradientDrawableGammaMax8621(3), new FrostHunterGradientDrawableGammaMax8621(4));

    public FrostHunterBroadcastBetaHyper4060(int i, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.FrostHunterFlowMaxDragonHero5809 = false;
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }

    public static void FrostHunterAlphaAnimationNeoCosmos5761(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List list = FrostHunterFragmentBetaMegaVortex6025;
        if (i2 > list.size()) {
            throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
        }
        while (i < i2) {
            switch (((FrostHunterGradientDrawableGammaMax8621) list.get(i)).FrostHunterAlphaAnimationNeoCosmos5761) {
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
                    sQLiteDatabase.execSQL(FrostHunterAlertDialogAuroraDelta3200);
                    break;
            }
            i++;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.FrostHunterFlowMaxDragonHero5809 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.FrostHunterFlowMaxDragonHero5809) {
            onConfigure(sQLiteDatabase);
        }
        FrostHunterAlphaAnimationNeoCosmos5761(sQLiteDatabase, 0, this.FrostHunterCameraXPixelTurboCosmos9814);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.FrostHunterFlowMaxDragonHero5809) {
            onConfigure(sQLiteDatabase);
        }
        FrostHunterAlphaAnimationNeoCosmos5761(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.FrostHunterFlowMaxDragonHero5809) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.FrostHunterFlowMaxDragonHero5809) {
            onConfigure(sQLiteDatabase);
        }
        FrostHunterAlphaAnimationNeoCosmos5761(sQLiteDatabase, i, i2);
    }
}
