package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.measurement.zzahh;
import com.google.android.gms.internal.measurement.zzaif;
import papa.InteractionResult;

/* loaded from: classes.dex */
public final class zzav extends SQLiteOpenHelper {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InteractionResult zza;

    public zzav(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    private final void onDowngrade$com$google$android$gms$measurement$internal$zzav(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void onDowngrade$com$google$android$gms$measurement$internal$zzgj(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void onUpgrade$com$google$android$gms$measurement$internal$zzav(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void onUpgrade$com$google$android$gms$measurement$internal$zzgj(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        int i = this.$r8$classId;
        InteractionResult interactionResult = this.zza;
        switch (i) {
            case 0:
                zzaw zzawVar = (zzaw) interactionResult;
                zzic zzicVar = (zzic) zzawVar.$$delegate_0;
                zzic zzicVar2 = (zzic) zzawVar.$$delegate_0;
                zzicVar.getClass();
                com.google.android.gms.ads.identifier.zzc zzcVar = zzawVar.zzn;
                if (zzcVar.zzb != 0) {
                    ((DefaultClock) zzcVar.zza).getClass();
                    if (SystemClock.elapsedRealtime() - zzcVar.zzb < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((DefaultClock) zzcVar.zza).getClass();
                    zzcVar.zzb = SystemClock.elapsedRealtime();
                    zzgu zzguVar = zzicVar2.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zza("Opening the database failed, dropping and recreating it");
                    if (!zzicVar2.zzd.getDatabasePath("google_app_measurement.db").delete()) {
                        zzgu zzguVar2 = zzicVar2.zzi;
                        zzic.zzP(zzguVar2);
                        zzguVar2.zzd.zzb("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        zzcVar.zzb = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        zzgu zzguVar3 = zzicVar2.zzi;
                        zzic.zzP(zzguVar3);
                        zzguVar3.zzd.zzb(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                zzgl zzglVar = (zzgl) interactionResult;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    zzic zzicVar3 = (zzic) zzglVar.$$delegate_0;
                    zzgu zzguVar4 = zzicVar3.zzi;
                    zzic.zzP(zzguVar4);
                    zzguVar4.zzd.zza("Opening the local database failed, dropping and recreating it");
                    if (!zzicVar3.zzd.getDatabasePath("google_app_measurement_local.db").delete()) {
                        zzgu zzguVar5 = zzicVar3.zzi;
                        zzic.zzP(zzguVar5);
                        zzguVar5.zzd.zzb("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        zzgu zzguVar6 = ((zzic) zzglVar.$$delegate_0).zzi;
                        zzic.zzP(zzguVar6);
                        zzguVar6.zzd.zzb(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.$r8$classId;
        InteractionResult interactionResult = this.zza;
        switch (i) {
            case 0:
                zzgu zzguVar = ((zzic) ((zzaw) interactionResult).$$delegate_0).zzi;
                zzic.zzP(zzguVar);
                zzjm.zzb(zzguVar, sQLiteDatabase);
                break;
            default:
                zzgu zzguVar2 = ((zzic) ((zzgl) interactionResult).$$delegate_0).zzi;
                zzic.zzP(zzguVar2);
                zzjm.zzb(zzguVar2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.$r8$classId;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        int i = this.$r8$classId;
        InteractionResult interactionResult = this.zza;
        switch (i) {
            case 0:
                zzic zzicVar = (zzic) ((zzaw) interactionResult).$$delegate_0;
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzjm.zza(zzguVar, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", zzaw.zzb);
                zzgu zzguVar2 = zzicVar.zzi;
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", zzaw.zzc);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", zzaw.zzd);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", zzaw.zzf);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", zzaw.zze);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", zzaw.zzh);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", zzaw.zzi);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", zzaw.zzj);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", zzaw.zzk);
                zzaif.zza();
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", zzaw.zzl);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", zzaw.zza);
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                zzahh.zza();
                zzic.zzP(zzguVar2);
                zzjm.zza(zzguVar2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                zzgu zzguVar3 = ((zzic) ((zzgl) interactionResult).$$delegate_0).zzi;
                zzic.zzP(zzguVar3);
                zzjm.zza(zzguVar3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", zzgl.zza);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.$r8$classId;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzav(zzgl zzglVar, Context context) {
        this(context, "google_app_measurement_local.db");
        this.$r8$classId = 1;
        this.zza = zzglVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzav(zzaw zzawVar, Context context) {
        this(context, "google_app_measurement.db");
        this.$r8$classId = 0;
        this.zza = zzawVar;
    }
}
