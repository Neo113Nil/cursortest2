package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import com.bugsnag.android.Client;
import com.datadog.trace.relocate.api.RatelimitedLogger;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.measurement.zzahk;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzfa;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zziu;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public final class zzaw extends zzos {
    public final zzav zzm;
    public final com.google.android.gms.ads.identifier.zzc zzn;
    public static final String[] zzb = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] zza = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] zzc = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] zzd = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};
    public static final String[] zze = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    public static final String[] zzf = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] zzh = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] zzi = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] zzj = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] zzk = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] zzl = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public zzaw(zzpg zzpgVar) {
        super(zzpgVar);
        this.zzn = new com.google.android.gms.ads.identifier.zzc(((zzic) this.$$delegate_0).zzn);
        ((zzic) this.$$delegate_0).getClass();
        this.zzm = new zzav(this, ((zzic) this.$$delegate_0).zzd);
    }

    public static final String zzaJ(List list) {
        return list.isEmpty() ? "" : JsonLogicResult$Success$$ExternalSyntheticOutline0.m(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void zzaw(ContentValues contentValues, Object obj) {
        zzae.checkNotEmpty("value");
        zzae.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid value type");
        }
    }

    public final long zzA(String str, zzib zzibVar, String str2, Map map, zzls zzlsVar, Long l) {
        int delete;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        zzay();
        zzae.checkNotNull(zzibVar);
        zzae.checkNotEmpty(str);
        zzg();
        zzay();
        if (zzai()) {
            zzpg zzpgVar = this.zzg;
            long zza2 = zzpgVar.zzk.zzb.zza();
            DefaultClock defaultClock = zzicVar.zzn;
            zzgu zzguVar = zzicVar.zzi;
            defaultClock.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza2) > ((Long) zzfy.zzM.zzb(null)).longValue()) {
                zzpgVar.zzk.zzb.zzb(elapsedRealtime);
                zzg();
                zzay();
                if (zzai() && (delete = zze().delete("upload_queue", zzaI(), new String[0])) > 0) {
                    zzic.zzP(zzguVar);
                    zzguVar.zzl.zzb(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                zzae.checkNotEmpty(str);
                zzg();
                zzay();
                try {
                    int zzm = zzicVar.zzg.zzm(str, zzfy.zzz);
                    if (zzm > 0) {
                        zze().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(zzm)});
                    }
                } catch (SQLiteException e) {
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zzc("Error deleting over the limit queued batches. appId", zzgu.zzl(str), e);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] zzcd = zzibVar.zzcd();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", zzcd);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(zzlsVar.zza()));
        DefaultClock defaultClock2 = zzicVar.zzn;
        zzgu zzguVar2 = zzicVar.zzi;
        defaultClock2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long insert = zze().insert("upload_queue", null, contentValues);
            if (insert != -1) {
                return insert;
            }
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzb(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzc("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            return -1L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final List zzC(String str, zzoo zzooVar, int i) {
        ?? r0;
        zzae.checkNotEmpty(str);
        zzg();
        zzay();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zze2 = zze();
                String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
                String zzaJ = zzaJ(zzooVar.zza);
                String zzaI = zzaI();
                StringBuilder sb = new StringBuilder(zzaJ.length() + 17 + zzaI.length());
                sb.append("app_id=?");
                sb.append(zzaJ);
                sb.append(" AND NOT ");
                sb.append(zzaI);
                cursor = zze2.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
                r0 = new ArrayList();
                while (cursor.moveToNext()) {
                    zzpj zzaH = zzaH(str, cursor.getLong(0), cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                    if (zzaH != null) {
                        r0.add(zzaH);
                    }
                }
            } catch (SQLiteException e) {
                zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzd.zzc("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                r0 = Collections.EMPTY_LIST;
            }
            return r0;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final boolean zzD(String str) {
        zzls[] zzlsVarArr = {zzls.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlsVarArr[0].zza()));
        String zzaJ = zzaJ(arrayList);
        String zzaI = zzaI();
        return zzaA(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder((zzaJ.length() + 61) + zzaI.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", zzaJ, " AND NOT ", zzaI), new String[]{str}) != 0;
    }

    public final void zzE(Long l) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        zzay();
        try {
            if (zze().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzg.zza("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzb(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzF() {
        SQLiteException e;
        Cursor cursor;
        SQLiteDatabase zze2 = zze();
        ?? r1 = 0;
        try {
            try {
                cursor = zze2.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        String string2 = cursor.getString(0);
                        cursor.close();
                        return string2;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zzb(e, "Database error getting next bundle app id");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r1 = zze2;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void zzH(long j) {
        zzg();
        zzay();
        try {
            if (zze().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzb(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void zzI() {
        zzg();
        zzay();
        if (zzai()) {
            zzpg zzpgVar = this.zzg;
            long zza2 = zzpgVar.zzk.zza.zza();
            zzic zzicVar = (zzic) this.$$delegate_0;
            zzicVar.zzn.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza2) > ((Long) zzfy.zzM.zzb(null)).longValue()) {
                zzpgVar.zzk.zza.zzb(elapsedRealtime);
                zzg();
                zzay();
                if (zzai()) {
                    SQLiteDatabase zze2 = zze();
                    zzicVar.zzn.getClass();
                    int delete = zze2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) zzfy.zzR.zzb(null)).longValue())});
                    if (delete > 0) {
                        zzgu zzguVar = zzicVar.zzi;
                        zzic.zzP(zzguVar);
                        zzguVar.zzl.zzb(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void zzJ(ArrayList arrayList) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        zzay();
        zzae.checkNotNull(arrayList);
        if (arrayList.size() == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Given Integer is zero");
            return;
        }
        if (zzai()) {
            String join = TextUtils.join(",", arrayList);
            String m = Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (zzaA(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(m.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", m, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzg.zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase zze2 = zze();
                StringBuilder sb = new StringBuilder(m.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(m);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                zze2.execSQL(sb.toString());
            } catch (SQLiteException e) {
                zzgu zzguVar2 = zzicVar.zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzd.zzb(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void zzK(Long l) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        zzay();
        if (zzai()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zzaA(sb.toString(), null) > 0) {
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzg.zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase zze2 = zze();
                zzicVar.zzn.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(currentTimeMillis);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder(sb3.length() + 34 + l.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(sb3);
                sb4.append(" WHERE rowid = ");
                sb4.append(l);
                sb4.append(" AND retry_count < 2147483647");
                zze2.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                zzgu zzguVar2 = zzicVar.zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzd.zzb(e, "Error incrementing retry count. error");
            }
        }
    }

    public final Object zzL(Cursor cursor, int i) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        int type2 = cursor.getType(i);
        if (type2 == 0) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Loaded invalid null value from database");
            return null;
        }
        if (type2 == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type2 == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type2 == 3) {
            return cursor.getString(i);
        }
        if (type2 != 4) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzb(Integer.valueOf(type2), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        zzgu zzguVar3 = zzicVar.zzi;
        zzic.zzP(zzguVar3);
        zzguVar3.zzd.zza("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:2|3|4)|(2:6|(3:8|9|10)(1:13))|14|15|(1:17)(2:20|21)|18|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        r0 = r0.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(r0);
        r0.zzd.zzd("Error inserting column. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r14), "first_open_count", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzN(String str) {
        long j;
        long zzaB;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzae.checkNotEmpty(str);
        zzae.checkNotEmpty("first_open_count");
        zzg();
        zzay();
        SQLiteDatabase zze2 = zze();
        zze2.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                zzaB = zzaB(sb.toString(), new String[]{str}, -1L);
            } catch (SQLiteException e) {
                e = e;
            }
            if (zzaB == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", (Integer) 0);
                contentValues.put("previous_install_count", (Integer) 0);
                if (zze2.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    zzgu zzguVar = zzicVar.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zzc("Failed to insert column (got -1). appId", zzgu.zzl(str), "first_open_count");
                    return j;
                }
                zzaB = 0;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + zzaB));
            if (zze2.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                zzgu zzguVar2 = zzicVar.zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzd.zzc("Failed to update column (got 0). appId", zzgu.zzl(str), "first_open_count");
            } else {
                zze2.setTransactionSuccessful();
                j = zzaB;
            }
            return j;
        } finally {
            zze2.endTransaction();
        }
    }

    public final boolean zzQ(String str, String str2) {
        return zzaA("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final void zzS(List list) {
        zzae.checkNotNull(list);
        zzg();
        zzay();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i)).longValue());
        }
        sb.append(")");
        int delete = zze().delete("raw_events", sb.toString(), null);
        if (delete != list.size()) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    public final long zzT(String str) {
        zzae.checkNotEmpty(str);
        return zzaB("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void zzU(String str, Long l, long j, zzhs zzhsVar) {
        zzg();
        zzay();
        zzae.checkNotNull(zzhsVar);
        zzae.checkNotEmpty(str);
        zzic zzicVar = (zzic) this.$$delegate_0;
        byte[] zzcd = zzhsVar.zzcd();
        zzgu zzguVar = zzicVar.zzi;
        zzgu zzguVar2 = zzicVar.zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzl.zzc("Saving complex main event, appId, data size", zzicVar.zzm.zza(str), Integer.valueOf(zzcd.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzcd);
        try {
            if (zze().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzic.zzP(zzguVar2);
                zzguVar2.zzd.zzb(zzgu.zzl(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzc("Error storing complex main event. appId", zzgu.zzl(str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ab A[Catch: SQLiteException -> 0x02c7, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x02c7, blocks: (B:78:0x028e, B:80:0x02ab), top: B:77:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzX(String str, Long l, String str2, Bundle bundle) {
        String string2;
        String zzd2;
        Bundle bundle2;
        zzgu zzguVar;
        long update;
        zzid zzidVar;
        Cursor query;
        zzaw zzawVar = this;
        String str3 = str;
        Object obj = zzawVar.$$delegate_0;
        zzic zzicVar = (zzic) obj;
        zzae.checkNotNull(bundle);
        zzawVar.zzg();
        zzawVar.zzay();
        RealStrongMemoryCache realStrongMemoryCache = l != null ? new RealStrongMemoryCache(zzawVar, str3, l.longValue()) : new RealStrongMemoryCache(zzawVar, str3);
        List<zzat> zza2 = realStrongMemoryCache.zza();
        while (!zza2.isEmpty()) {
            for (zzat zzatVar : zza2) {
                if (!TextUtils.isEmpty(str2)) {
                    Cursor cursor = null;
                    zzid zzidVar2 = null;
                    Cursor cursor2 = null;
                    try {
                        try {
                            query = zzawVar.zze().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, Long.toString(zzatVar.zzb)}, null, null, "rowid", "2");
                            try {
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = query;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e) {
                                e = e;
                                zzidVar = null;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            zzidVar = null;
                        }
                        if (query.moveToFirst()) {
                            try {
                                zzidVar = (zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.zzw(zzid.zzaE(), query.getBlob(0))).zzbd();
                            } catch (IOException e3) {
                                zzgu zzguVar2 = zzicVar.zzi;
                                zzic.zzP(zzguVar2);
                                zzguVar2.zzd.zzc("Data loss. Failed to merge raw event metadata. appId", zzgu.zzl(str3), e3);
                            }
                            try {
                                if (query.moveToNext()) {
                                    zzgu zzguVar3 = zzicVar.zzi;
                                    zzic.zzP(zzguVar3);
                                    zzguVar3.zzg.zzb(zzgu.zzl(str3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                query.close();
                                query.close();
                            } catch (SQLiteException e4) {
                                e = e4;
                                cursor2 = query;
                                zzgu zzguVar4 = zzicVar.zzi;
                                zzic.zzP(zzguVar4);
                                zzguVar4.zzd.zzc("Data loss. Error selecting raw event. appId", zzgu.zzl(str3), e);
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                zzidVar2 = zzidVar;
                                if (zzidVar2 != null) {
                                }
                                zzpg zzpgVar = zzawVar.zzg;
                                zzpk zzpkVar = zzpgVar.zzi;
                                zzpg.zzaT(zzpkVar);
                                zzhs zzhsVar = zzatVar.zzd;
                                Bundle bundle3 = new Bundle();
                                while (r7.hasNext()) {
                                }
                                string2 = bundle3.getString("_o");
                                bundle3.remove("_o");
                                zzd2 = zzhsVar.zzd();
                                if (string2 == null) {
                                }
                                zzpp zzppVar = zzicVar.zzl;
                                zzgu zzguVar5 = zzicVar.zzi;
                                zzic.zzN(zzppVar);
                                if (zzd2.equals("_cmp")) {
                                }
                                zzppVar.zzK(bundle3, bundle2);
                                zzbc zzbcVar = new zzbc((zzic) obj, string2, str3, zzhsVar.zzd(), zzhsVar.zzf(), zzhsVar.zzo(), zzhsVar.zzi(), bundle3);
                                String str4 = (String) zzbcVar.zza;
                                long j = zzatVar.zza;
                                long j2 = zzatVar.zzb;
                                boolean z = zzatVar.zzc;
                                zzg();
                                zzay();
                                zzae.checkNotEmpty(str4);
                                zzpk zzpkVar2 = zzpgVar.zzi;
                                zzpg.zzaT(zzpkVar2);
                                byte[] zzcd = zzpkVar2.zzh(zzbcVar).zzcd();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("app_id", str4);
                                contentValues.put("name", (String) zzbcVar.zzb);
                                contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
                                contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                                contentValues.put("data", zzcd);
                                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                                contentValues.put("elapsed_time", Long.valueOf(zzbcVar.zze));
                                update = zze().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                                if (update != 1) {
                                }
                                zzawVar = this;
                                str3 = str;
                            }
                            zzidVar2 = zzidVar;
                            if (zzidVar2 != null) {
                                Iterator it = zzidVar2.zzf().iterator();
                                while (it.hasNext()) {
                                    if (((zziu) it.next()).zzc().equals(str2)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            zzgu zzguVar6 = zzicVar.zzi;
                            zzic.zzP(zzguVar6);
                            zzguVar6.zzd.zzb(zzgu.zzl(str3), "Raw event metadata record is missing. appId");
                        }
                        query.close();
                        if (zzidVar2 != null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                zzpg zzpgVar2 = zzawVar.zzg;
                zzpk zzpkVar3 = zzpgVar2.zzi;
                zzpg.zzaT(zzpkVar3);
                zzhs zzhsVar2 = zzatVar.zzd;
                Bundle bundle32 = new Bundle();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar2.zza()) {
                    if (zzhwVar.zzj()) {
                        bundle32.putDouble(zzhwVar.zzb(), zzhwVar.zzk());
                    } else if (zzhwVar.zzh()) {
                        bundle32.putFloat(zzhwVar.zzb(), zzhwVar.zzi());
                    } else if (zzhwVar.zze()) {
                        bundle32.putLong(zzhwVar.zzb(), zzhwVar.zzf());
                    } else if (zzhwVar.zzc()) {
                        bundle32.putString(zzhwVar.zzb(), zzhwVar.zzd());
                    } else if (zzhwVar.zzl().isEmpty()) {
                        zzgu zzguVar7 = ((zzic) zzpkVar3.$$delegate_0).zzi;
                        zzic.zzP(zzguVar7);
                        zzguVar7.zzd.zzb(zzhwVar, "Unexpected parameter type for parameter");
                    } else {
                        bundle32.putParcelableArray(zzhwVar.zzb(), zzpk.zzy(zzhwVar.zzl()));
                    }
                }
                string2 = bundle32.getString("_o");
                bundle32.remove("_o");
                zzd2 = zzhsVar2.zzd();
                if (string2 == null) {
                    string2 = "";
                }
                zzpp zzppVar2 = zzicVar.zzl;
                zzgu zzguVar52 = zzicVar.zzi;
                zzic.zzN(zzppVar2);
                if (zzd2.equals("_cmp")) {
                    bundle2 = bundle;
                } else {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                    }
                }
                zzppVar2.zzK(bundle32, bundle2);
                zzbc zzbcVar2 = new zzbc((zzic) obj, string2, str3, zzhsVar2.zzd(), zzhsVar2.zzf(), zzhsVar2.zzo(), zzhsVar2.zzi(), bundle32);
                String str42 = (String) zzbcVar2.zza;
                long j3 = zzatVar.zza;
                long j22 = zzatVar.zzb;
                boolean z2 = zzatVar.zzc;
                zzg();
                zzay();
                zzae.checkNotEmpty(str42);
                zzpk zzpkVar22 = zzpgVar2.zzi;
                zzpg.zzaT(zzpkVar22);
                byte[] zzcd2 = zzpkVar22.zzh(zzbcVar2).zzcd();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str42);
                contentValues2.put("name", (String) zzbcVar2.zzb);
                contentValues2.put("timestamp", Long.valueOf(zzbcVar2.zzd));
                contentValues2.put("metadata_fingerprint", Long.valueOf(j22));
                contentValues2.put("data", zzcd2);
                contentValues2.put("realtime", Integer.valueOf(z2 ? 1 : 0));
                contentValues2.put("elapsed_time", Long.valueOf(zzbcVar2.zze));
                try {
                    update = zze().update("raw_events", contentValues2, "rowid = ?", new String[]{String.valueOf(j3)});
                    if (update != 1) {
                        zzic.zzP(zzguVar52);
                        zzguVar = zzguVar52;
                        try {
                            zzguVar.zzd.zzc("Failed to update raw event. appId, updatedRows", zzgu.zzl(str42), Long.valueOf(update));
                        } catch (SQLiteException e5) {
                            e = e5;
                            zzic.zzP(zzguVar);
                            zzguVar.zzd.zzc("Error updating raw event. appId", zzgu.zzl(str42), e);
                            zzawVar = this;
                            str3 = str;
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    zzguVar = zzguVar52;
                }
                zzawVar = this;
                str3 = str;
            }
            zza2 = realStrongMemoryCache.zza();
            zzawVar = this;
            str3 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r3 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.measurement.internal.zzaw, com.google.android.gms.measurement.internal.zzos, papa.InteractionResult] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzjl zzY(String str) {
        Throwable th;
        SQLiteException e;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzae.checkNotNull(str);
        zzg();
        zzay();
        Cursor cursor = null;
        r2 = null;
        r2 = null;
        zzjl zzjlVar = null;
        try {
            try {
                this = zze().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        zzjlVar = zzjl.zzf(this.getInt(1), this.getString(0));
                    } else {
                        zzgu zzguVar = zzicVar.zzi;
                        zzic.zzP(zzguVar);
                        zzguVar.zzl.zza("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzgu zzguVar2 = zzicVar.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzd.zzb(e, "Error querying database.");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = this;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            this = 0;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        this.close();
        return zzjlVar == null ? zzjl.zza : zzjlVar;
    }

    public final void zzZ(String str, zzoh zzohVar) {
        zzg();
        zzay();
        zzae.checkNotEmpty(str);
        zzic zzicVar = (zzic) this.$$delegate_0;
        DefaultClock defaultClock = zzicVar.zzn;
        zzgu zzguVar = zzicVar.zzi;
        defaultClock.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        zzfx zzfxVar = zzfy.zzau;
        long longValue = currentTimeMillis - ((Long) zzfxVar.zzb(null)).longValue();
        long j = zzohVar.zzb;
        if (j < longValue || j > ((Long) zzfxVar.zzb(null)).longValue() + currentTimeMillis) {
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzd("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgu.zzl(str), Long.valueOf(currentTimeMillis), Long.valueOf(j));
        }
        zzic.zzP(zzguVar);
        zzguVar.zzl.zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzohVar.zza);
        contentValues.put("source", Integer.valueOf(zzohVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (zze().insert("trigger_uris", null, contentValues) == -1) {
                zzic.zzP(zzguVar);
                zzguVar.zzd.zzb(zzgu.zzl(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzc("Error storing trigger URI. appId", zzgu.zzl(str), e);
        }
    }

    public final long zzaA(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zze().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            } catch (SQLiteException e) {
                zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzd.zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zzaB(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = zze().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
                cursor.close();
                return j;
            } catch (SQLiteException e) {
                zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzd.zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final String zzaC(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = zze().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return "";
                }
                String string2 = cursor.getString(0);
                cursor.close();
                return string2;
            } catch (SQLiteException e) {
                zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzd.zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zzaD(ContentValues contentValues) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        try {
            SQLiteDatabase zze2 = zze();
            if (contentValues.getAsString("app_id") == null) {
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzf.zzb(zzgu.zzl("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (zze2.update("consent_settings", contentValues, r5.toString(), new String[]{r4}) == 0 && zze2.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzgu zzguVar2 = zzicVar.zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzd.zzc("Failed to insert/update table (got -1). key", zzgu.zzl("consent_settings"), zzgu.zzl("app_id"));
            }
        } catch (SQLiteException e) {
            zzgu zzguVar3 = zzicVar.zzi;
            zzic.zzP(zzguVar3);
            zzguVar3.zzd.zzd("Error storing into table. key", zzgu.zzl("consent_settings"), zzgu.zzl("app_id"), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0123  */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzbd zzaE(String str, String str2, String str3) {
        Cursor cursor;
        Boolean bool;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzae.checkNotEmpty(str2);
        zzae.checkNotEmpty(str3);
        zzg();
        zzay();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursor = zze().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                } catch (SQLiteException e) {
                    e = e;
                    zzgu zzguVar = zzicVar.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zzd("Error querying events. appId", zzgu.zzl(str2), zzicVar.zzm.zza(str3), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r3 = arrayList;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        long j = cursor.getLong(0);
        long j2 = cursor.getLong(1);
        long j3 = cursor.getLong(2);
        long j4 = 0;
        long j5 = cursor.isNull(3) ? 0L : cursor.getLong(3);
        Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
        Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
        Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
        if (cursor.isNull(7)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getLong(7) == 1);
        }
        if (!cursor.isNull(8)) {
            j4 = cursor.getLong(8);
        }
        zzbd zzbdVar = new zzbd(str2, str3, j, j2, j4, j3, j5, valueOf, valueOf2, valueOf3, bool);
        if (cursor.moveToNext()) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzb(zzgu.zzl(str2), "Got multiple records for event aggregates, expected one. appId");
        }
        cursor.close();
        return zzbdVar;
    }

    public final void zzaF(String str, zzbd zzbdVar) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzae.checkNotNull(zzbdVar);
        zzg();
        zzay();
        ContentValues contentValues = new ContentValues();
        String str2 = zzbdVar.zza;
        contentValues.put("app_id", str2);
        contentValues.put("name", zzbdVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbdVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzbdVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbdVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbdVar.zzg));
        contentValues.put("last_bundled_day", zzbdVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbdVar.zzi);
        contentValues.put("last_sampling_rate", zzbdVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbdVar.zze));
        Boolean bool = zzbdVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zze().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzd.zzb(zzgu.zzl(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzc("Error storing event aggregates. appId", zzgu.zzl(str2), e);
        }
    }

    public final void zzaG(String str, String str2) {
        zzae.checkNotEmpty(str2);
        zzg();
        zzay();
        try {
            zze().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzc("Error deleting snapshot. appId", zzgu.zzl(str2), e);
        }
    }

    public final zzpj zzaH(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (TextUtils.isEmpty(str2)) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzk.zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzpk.zzw(zzib.zzi(), bArr);
            zzls zzb2 = zzls.zzb(i);
            if (zzb2 != zzls.GOOGLE_SIGNAL && zzb2 != zzls.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = zzhzVar.zza().iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.zzic zzicVar2 = (com.google.android.gms.internal.measurement.zzic) ((zzid) it.next()).zzco();
                    zzicVar2.zzao(i2);
                    arrayList.add((zzid) zzicVar2.zzbd());
                }
                zzhzVar.zzg$1();
                zzhzVar.zzf(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length = split.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    String str4 = split[i3];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        zzgu zzguVar2 = zzicVar.zzi;
                        zzic.zzP(zzguVar2);
                        zzguVar2.zzd.zzb(str4, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i3++;
                }
            }
            zzpi zzpiVar = new zzpi();
            zzpiVar.zzb(j);
            zzpiVar.zzc((zzib) zzhzVar.zzbd());
            zzpiVar.zzd(str2);
            zzpiVar.zze(hashMap);
            zzpiVar.zzf(zzb2);
            zzpiVar.zzg(j2);
            zzpiVar.zzh(j3);
            zzpiVar.zzi(j4);
            zzpiVar.zzj(i2);
            return zzpiVar.zza();
        } catch (IOException e) {
            zzgu zzguVar3 = zzicVar.zzi;
            zzic.zzP(zzguVar3);
            zzguVar3.zzd.zzc("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
            return null;
        }
    }

    public final String zzaI() {
        ((zzic) this.$$delegate_0).zzn.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        zzls zzlsVar = zzls.GOOGLE_SIGNAL;
        int zza2 = zzlsVar.zza();
        Long l = (Long) zzfy.zzS.zzb(null);
        l.getClass();
        String str = "(upload_type = " + zza2 + " AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l + ")";
        int zza3 = zzlsVar.zza();
        long longValue = ((Long) zzfy.zzR.zzb(null)).longValue();
        StringBuilder sb = new StringBuilder("(upload_type != ");
        sb.append(zza3);
        sb.append(" AND ABS(creation_timestamp - ");
        sb.append(currentTimeMillis);
        String m = Boxes$$ExternalSyntheticOutline1.m(longValue, ") > ", ")", sb);
        StringBuilder sb2 = new StringBuilder(JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(str.length(), 5, m.length(), 1));
        Boxes$$ExternalSyntheticOutline1.m(sb2, "(", str, " OR ", m);
        sb2.append(")");
        return sb2.toString();
    }

    public final void zzaa(String str, zzjl zzjlVar) {
        zzae.checkNotNull(str);
        zzae.checkNotNull(zzjlVar);
        zzg();
        zzay();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjlVar.zzl());
        contentValues.put("consent_source", Integer.valueOf(zzjlVar.zzc));
        zzaD(contentValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public final List zzac(String str) {
        ArrayList arrayList;
        String string2;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        zzay();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase zze2 = zze();
            zze2.beginTransaction();
            Cursor cursor = null;
            try {
                try {
                    cursor = zze2.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursor.moveToFirst()) {
                        boolean isEmpty = str.isEmpty();
                        do {
                            String string3 = cursor.getString(0);
                            if (cursor.isNull(1)) {
                                string2 = "";
                            } else {
                                string2 = cursor.getString(1);
                                zzae.checkNotNull(string2);
                            }
                            if (string3 == null) {
                                zzgu zzguVar = zzicVar.zzi;
                                zzic.zzP(zzguVar);
                                zzguVar.zzd.zzb(zzgu.zzl(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j = cursor.getLong(2);
                                zzfa zza2 = zzfb.zza();
                                zza2.zza(string3);
                                zza2.zzd(j);
                                zza2.zzc(string2);
                                if (isEmpty) {
                                    zza2.zzb();
                                }
                                arrayList2.add((zzfb) zza2.zzbd());
                            }
                        } while (cursor.moveToNext());
                        zze2.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        zze2.setTransactionSuccessful();
                        arrayList = arrayList2;
                    } else {
                        zze2.setTransactionSuccessful();
                        arrayList = arrayList2;
                    }
                } catch (SQLiteException e) {
                    zzgu zzguVar2 = zzicVar.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzd.zzc("Error querying or deleting diagnostic signals. appId", zzgu.zzl(str), e);
                    arrayList = Collections.EMPTY_LIST;
                }
                if (cursor != null) {
                    cursor.close();
                }
                zze2.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                zze2.endTransaction();
                throw th;
            }
        } catch (SQLiteException e2) {
            zzgu zzguVar3 = zzicVar.zzi;
            zzic.zzP(zzguVar3);
            zzguVar3.zzd.zzc("Error opening database for diagnostic signals. appId", zzgu.zzl(str), e2);
            return Collections.EMPTY_LIST;
        }
    }

    public final void zzae(String str, zzjl zzjlVar) {
        zzae.checkNotNull(str);
        zzg();
        zzay();
        zzaa(str, zzY(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjlVar.zzl());
        zzaD(contentValues);
    }

    public final zzjl zzaf(String str) {
        zzae.checkNotNull(str);
        zzg();
        zzay();
        return zzjl.zzf(100, zzaC("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final zzbd zzah(String str, zzhs zzhsVar, String str2) {
        zzbd zzaE = zzaE("events", str, zzhsVar.zzd());
        if (zzaE != null) {
            long j = zzaE.zze + 1;
            long j2 = zzaE.zzd + 1;
            return new zzbd(zzaE.zza, zzaE.zzb, zzaE.zzc + 1, j2, j, zzaE.zzf, zzaE.zzg, zzaE.zzh, zzaE.zzi, zzaE.zzj, zzaE.zzk);
        }
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzg.zzc("Event aggregate wasn't created during raw event logging. appId, event", zzgu.zzl(str), zzicVar.zzm.zza(str2));
        return new zzbd(str, zzhsVar.zzd(), 1L, 1L, 1L, zzhsVar.zzf(), 0L, null, null, null, null);
    }

    public final boolean zzai() {
        return ((zzic) this.$$delegate_0).zzd.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x021e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0198 A[Catch: all -> 0x007c, SQLiteException -> 0x007f, LOOP:0: B:47:0x0198->B:56:?, LOOP_START, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x007f, blocks: (B:23:0x0074, B:24:0x00cc, B:26:0x00f5, B:27:0x0107, B:29:0x010b, B:30:0x011b, B:32:0x0121, B:33:0x0131, B:42:0x0160, B:43:0x0168, B:45:0x0173, B:47:0x0198, B:49:0x01a6, B:50:0x01b0, B:52:0x01e0, B:61:0x01d0, B:62:0x01e7, B:65:0x014d, B:69:0x01f9), top: B:22:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e7 A[Catch: all -> 0x007c, SQLiteException -> 0x007f, TryCatch #3 {SQLiteException -> 0x007f, blocks: (B:23:0x0074, B:24:0x00cc, B:26:0x00f5, B:27:0x0107, B:29:0x010b, B:30:0x011b, B:32:0x0121, B:33:0x0131, B:42:0x0160, B:43:0x0168, B:45:0x0173, B:47:0x0198, B:49:0x01a6, B:50:0x01b0, B:52:0x01e0, B:61:0x01d0, B:62:0x01e7, B:65:0x014d, B:69:0x01f9), top: B:22:0x0074 }] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzav(String str, long j, long j2, RatelimitedLogger ratelimitedLogger) {
        ?? r9;
        String str2;
        SQLiteDatabase zze2;
        String[] strArr;
        String str3;
        String string2;
        long j3;
        String[] strArr2;
        String str4;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        zzay();
        Cursor cursor = null;
        try {
            try {
                zze2 = zze();
                r9 = TextUtils.isEmpty(str);
            } catch (SQLiteException e) {
                e = e;
                r9 = str;
            }
            if (r9 != 0) {
                String[] strArr3 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                str3 = j2 != -1 ? "rowid <= ? and " : "";
                StringBuilder sb = new StringBuilder(str3.length() + EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
                sb.append("select app_id, metadata_fingerprint from raw_events where ");
                sb.append(str3);
                sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                cursor = zze2.rawQuery(sb.toString(), strArr3);
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    str2 = str;
                }
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        return;
                    } else {
                        return;
                    }
                }
                str2 = cursor.getString(0);
                try {
                    string2 = cursor.getString(1);
                    cursor.close();
                } catch (SQLiteException e3) {
                    e = e3;
                    zzgu zzguVar = zzicVar.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zzc("Data loss. Error selecting raw event. appId", zzgu.zzl(str2), e);
                }
            } else {
                try {
                    if (j2 != -1) {
                        String str5 = str;
                        strArr = new String[]{str5, String.valueOf(j2)};
                        r9 = str5;
                    } else {
                        String str6 = str;
                        strArr = new String[]{str6};
                        r9 = str6;
                    }
                    str3 = j2 != -1 ? " and rowid <= ?" : "";
                    StringBuilder sb2 = new StringBuilder(str3.length() + 84);
                    sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                    sb2.append(str3);
                    sb2.append(" order by rowid limit 1;");
                    cursor = zze2.rawQuery(sb2.toString(), strArr);
                } catch (SQLiteException e4) {
                    e = e4;
                    str2 = r9;
                    zzgu zzguVar2 = zzicVar.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzd.zzc("Data loss. Error selecting raw event. appId", zzgu.zzl(str2), e);
                }
                if (cursor.moveToFirst()) {
                    string2 = cursor.getString(0);
                    cursor.close();
                    str2 = r9;
                }
            }
            cursor = zze2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str2, string2}, null, null, "rowid", "2");
            if (cursor.moveToFirst()) {
                try {
                    zzid zzidVar = (zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.zzw(zzid.zzaE(), cursor.getBlob(0))).zzbd();
                    if (cursor.moveToNext()) {
                        zzgu zzguVar3 = zzicVar.zzi;
                        zzic.zzP(zzguVar3);
                        zzguVar3.zzg.zzb(zzgu.zzl(str2), "Get multiple raw event metadata records, expected one. appId");
                    }
                    cursor.close();
                    ratelimitedLogger.log = zzidVar;
                    long zzaB = zzaB("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{str2, string2}, -1L);
                    if (j2 != -1) {
                        j3 = j2;
                    } else if (zzaB != -1) {
                        j3 = -1;
                    } else {
                        str4 = "app_id = ? and metadata_fingerprint = ?";
                        strArr2 = new String[]{str2, string2};
                        cursor = zze2.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str4, strArr2, null, null, "rowid", null);
                        if (cursor.moveToFirst()) {
                            zzgu zzguVar4 = zzicVar.zzi;
                            zzic.zzP(zzguVar4);
                            zzguVar4.zzg.zzb(zzgu.zzl(str2), "Raw event data disappeared while in transaction. appId");
                        } else {
                            do {
                                long j4 = cursor.getLong(0);
                                byte[] blob = cursor.getBlob(3);
                                long j5 = cursor.getLong(4);
                                try {
                                    zzhr zzhrVar = (zzhr) zzpk.zzw(zzhs.zzp(), blob);
                                    zzhrVar.zzl(cursor.getString(1));
                                    zzhrVar.zzo(cursor.getLong(2));
                                    zzhrVar.zzw(j5);
                                    if (!ratelimitedLogger.zza(j4, (zzhs) zzhrVar.zzbd())) {
                                        break;
                                    }
                                } catch (IOException e5) {
                                    zzgu zzguVar5 = zzicVar.zzi;
                                    zzic.zzP(zzguVar5);
                                    zzguVar5.zzd.zzc("Data loss. Failed to merge raw event. appId", zzgu.zzl(str2), e5);
                                }
                            } while (cursor.moveToNext());
                        }
                    }
                    if (j3 != -1 && zzaB != -1) {
                        zzaB = Math.min(j3, zzaB);
                    } else if (j3 != -1) {
                        zzaB = j3;
                    }
                    str4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    strArr2 = new String[]{str2, string2, String.valueOf(zzaB)};
                    cursor = zze2.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str4, strArr2, null, null, "rowid", null);
                    if (cursor.moveToFirst()) {
                    }
                } catch (IOException e6) {
                    zzgu zzguVar6 = zzicVar.zzi;
                    zzic.zzP(zzguVar6);
                    zzguVar6.zzd.zzc("Data loss. Failed to merge raw event metadata. appId", zzgu.zzl(str2), e6);
                }
            } else {
                zzgu zzguVar7 = zzicVar.zzi;
                zzic.zzP(zzguVar7);
                zzguVar7.zzd.zzb(zzgu.zzl(str2), "Raw event metadata record is missing. appId");
            }
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public final void zzb$1() {
        zzay();
        zze().beginTransaction();
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final void zzbc() {
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (zzicVar.zzg.zzp(null, zzfy.zzbe)) {
            zzhz zzhzVar = zzicVar.zzj;
            zzic.zzP(zzhzVar);
            zzhzVar.zzj(new Client.AnonymousClass7(this, 29));
        }
    }

    public final void zzc() {
        zzay();
        zze().setTransactionSuccessful();
    }

    public final void zzd() {
        zzay();
        zze().endTransaction();
    }

    public final SQLiteDatabase zze() {
        zzg();
        try {
            return this.zzm.getWritableDatabase();
        } catch (SQLiteException e) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzb(e, "Error opening database");
            throw e;
        }
    }

    public final void zzi(String str) {
        zzbd zzaE;
        zzaG("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = zze().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        String string2 = cursor.getString(0);
                        if (string2 != null && (zzaE = zzaE("events", str, string2)) != null) {
                            zzaF("events_snapshot", zzaE);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e) {
                zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzd.zzc("Error creating snapshot. appId", zzgu.zzl(str), e);
            }
            if (cursor != null) {
                cursor.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        zzaF("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(String str) {
        boolean z;
        zzbd zzaE;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        zzbd zzaE2 = zzaE("events", str, "_f");
        zzbd zzaE3 = zzaE("events", str, "_v");
        zzaG("events", str);
        Cursor cursor = null;
        boolean z2 = false;
        try {
            cursor = zze().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e) {
            e = e;
            z = false;
        } catch (Throwable th) {
            th = th;
            z = false;
        }
        if (!cursor.moveToFirst()) {
            cursor.close();
            if (zzaE2 == null) {
            }
            zzaF("events", zzaE2);
            zzaG("events_snapshot", str);
        }
        boolean z3 = false;
        z = false;
        do {
            try {
                String string2 = cursor.getString(0);
                if (cursor.getLong(1) >= 1) {
                    if ("_f".equals(string2)) {
                        z3 = true;
                    } else if ("_v".equals(string2)) {
                        z = true;
                    }
                }
                if (string2 != null && (zzaE = zzaE("events_snapshot", str, string2)) != null) {
                    zzaF("events", zzaE);
                }
            } catch (SQLiteException e2) {
                e = e2;
                z2 = z3;
                try {
                    zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zzc("Error querying snapshot. appId", zzgu.zzl(str), e);
                    z3 = z2;
                    if (cursor != null) {
                    }
                    if (!z3) {
                    }
                    if (!z) {
                    }
                    zzaG("events_snapshot", str);
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (z2 && zzaE2 != null) {
                        zzaF("events", zzaE2);
                    } else if (!z && zzaE3 != null) {
                        zzaF("events", zzaE3);
                    }
                    zzaG("events_snapshot", str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z2 = z3;
                if (cursor != null) {
                }
                if (z2) {
                }
                if (!z) {
                    zzaF("events", zzaE3);
                }
                zzaG("events_snapshot", str);
                throw th;
            }
        } while (cursor.moveToNext());
        if (cursor != null) {
            cursor.close();
        }
        if (!z3 || zzaE2 == null) {
            if (!z) {
            }
            zzaG("events_snapshot", str);
        }
        zzaF("events", zzaE2);
        zzaG("events_snapshot", str);
    }

    public final void zzk(String str, String str2) {
        zzae.checkNotEmpty(str);
        zzae.checkNotEmpty(str2);
        zzg();
        zzay();
        try {
            zze().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzic zzicVar = (zzic) this.$$delegate_0;
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzd("Error deleting user property. appId", zzgu.zzl(str), zzicVar.zzm.zzc(str2), e);
        }
    }

    public final boolean zzl(zzpn zzpnVar) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        String str = zzpnVar.zzb;
        zzg();
        zzay();
        String str2 = zzpnVar.zza;
        String str3 = zzpnVar.zzc;
        if (zzm(str2, str3) == null) {
            if (zzpp.zzh(str3)) {
                if (zzaA("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(zzicVar.zzg.zzm(str2, zzfy.zzV), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long zzaA = zzaA("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                zzicVar.getClass();
                if (zzaA >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(zzpnVar.zzd));
        zzaw(contentValues, zzpnVar.zze);
        try {
            if (zze().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzb(zzgu.zzl(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzc("Error storing user property. appId", zzgu.zzl(str2), e);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzpn zzm(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzae.checkNotEmpty(str);
        zzae.checkNotEmpty(str2);
        zzg();
        zzay();
        Cursor cursor2 = null;
        try {
            cursor = zze().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        long j = cursor.getLong(0);
                        Object zzL = zzL(cursor, 1);
                        if (zzL != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                zzpn zzpnVar = new zzpn(str3, cursor.getString(2), str4, j, zzL);
                                if (cursor.moveToNext()) {
                                    zzgu zzguVar = zzicVar.zzi;
                                    zzic.zzP(zzguVar);
                                    zzguVar.zzd.zzb(zzgu.zzl(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursor.close();
                                return zzpnVar;
                            } catch (SQLiteException e) {
                                e = e;
                                sQLiteException = e;
                                zzgu zzguVar2 = zzicVar.zzi;
                                zzic.zzP(zzguVar2);
                                zzguVar2.zzd.zzd("Error querying user property. appId", zzgu.zzl(str3), zzicVar.zzm.zzc(str4), sQLiteException);
                                if (cursor != null) {
                                }
                                return null;
                            }
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                    str4 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 == null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzn(String str) {
        String str2;
        SQLiteException sQLiteException;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzae.checkNotEmpty(str);
        zzg();
        zzay();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                zzicVar.getClass();
                cursor = zze().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    while (true) {
                        String string2 = cursor.getString(0);
                        String string3 = cursor.getString(1);
                        if (string3 == null) {
                            string3 = "";
                        }
                        String str3 = string3;
                        long j = cursor.getLong(2);
                        Object zzL = zzL(cursor, 3);
                        if (zzL == null) {
                            try {
                                zzgu zzguVar = zzicVar.zzi;
                                zzic.zzP(zzguVar);
                                zzguVar.zzd.zzb(zzgu.zzl(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                                str2 = str;
                                zzgu zzguVar2 = zzicVar.zzi;
                                zzic.zzP(zzguVar2);
                                zzguVar2.zzd.zzc("Error querying user properties. appId", zzgu.zzl(str2), sQLiteException);
                                arrayList = Collections.EMPTY_LIST;
                                if (cursor != null) {
                                }
                                return arrayList;
                            }
                        } else {
                            str2 = str;
                            try {
                                arrayList.add(new zzpn(str2, str3, string2, j, zzL));
                            } catch (SQLiteException e2) {
                                e = e2;
                                sQLiteException = e;
                                zzgu zzguVar22 = zzicVar.zzi;
                                zzic.zzP(zzguVar22);
                                zzguVar22.zzd.zzc("Error querying user properties. appId", zzgu.zzl(str2), sQLiteException);
                                arrayList = Collections.EMPTY_LIST;
                                if (cursor != null) {
                                }
                                return arrayList;
                            }
                        }
                        if (!cursor.moveToNext()) {
                            break;
                        }
                        str = str2;
                    }
                }
            } finally {
            }
        } catch (SQLiteException e3) {
            e = e3;
            str2 = str;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        com.google.android.gms.measurement.internal.zzic.zzP(r13);
        r13.zzd.zzb(java.lang.Integer.valueOf(org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO), "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzo(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        Cursor cursor2;
        String str5;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzae.checkNotEmpty(str);
        zzg();
        zzay();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append(Marker.ANY_MARKER);
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String sb3 = sb.toString();
            zzicVar.getClass();
            zzgu zzguVar = zzicVar.zzi;
            cursor2 = zze().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb3, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursor2.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    break;
                                }
                                String string2 = cursor2.getString(0);
                                long j = cursor2.getLong(1);
                                Object zzL = zzL(cursor2, 2);
                                String string3 = cursor2.getString(3);
                                if (zzL == null) {
                                    try {
                                        zzic.zzP(zzguVar);
                                        zzguVar.zzd.zzd("(2)Read invalid user property value, ignoring it", zzgu.zzl(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string3;
                                        cursor = cursor2;
                                        str4 = str5;
                                        try {
                                            zzgu zzguVar2 = zzicVar.zzi;
                                            zzic.zzP(zzguVar2);
                                            zzguVar2.zzd.zzd("(2)Error querying user properties", zzgu.zzl(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursor2 = cursor;
                                            if (cursor2 != null) {
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    try {
                                        arrayList.add(new zzpn(str, str5, string2, j, zzL));
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        cursor = cursor2;
                                        str4 = str5;
                                        zzgu zzguVar22 = zzicVar.zzi;
                                        zzic.zzP(zzguVar22);
                                        zzguVar22.zzd.zzd("(2)Error querying user properties", zzgu.zzl(str), str4, e);
                                        arrayList = Collections.EMPTY_LIST;
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                        }
                                        return arrayList;
                                    }
                                }
                                if (!cursor2.moveToNext()) {
                                    break;
                                }
                                str6 = str;
                                str4 = str5;
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursor2;
                                zzgu zzguVar222 = zzicVar.zzi;
                                zzic.zzP(zzguVar222);
                                zzguVar222.zzd.zzd("(2)Error querying user properties", zzgu.zzl(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str4 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursor2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        return arrayList;
    }

    public final boolean zzp(zzah zzahVar) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        zzay();
        String str = zzahVar.zza;
        zzae.checkNotNull(str);
        if (zzm(str, zzahVar.zzc.zzb) == null) {
            long zzaA = zzaA("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            zzicVar.getClass();
            if (zzaA >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzahVar.zzb);
        contentValues.put("name", zzahVar.zzc.zzb);
        Object zza2 = zzahVar.zzc.zza();
        zzae.checkNotNull(zza2);
        zzaw(contentValues, zza2);
        contentValues.put("active", Boolean.valueOf(zzahVar.zze));
        contentValues.put("trigger_event_name", zzahVar.zzf);
        contentValues.put("trigger_timeout", Long.valueOf(zzahVar.zzh));
        zzbh zzbhVar = zzahVar.zzg;
        zzpp zzppVar = zzicVar.zzl;
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzN(zzppVar);
        contentValues.put("timed_out_event", zzpp.zzah(zzbhVar));
        contentValues.put("creation_timestamp", Long.valueOf(zzahVar.zzd));
        zzic.zzN(zzppVar);
        contentValues.put("triggered_event", zzpp.zzah(zzahVar.zzi));
        contentValues.put("triggered_timestamp", Long.valueOf(zzahVar.zzc.zzc));
        contentValues.put("time_to_live", Long.valueOf(zzahVar.zzj));
        contentValues.put("expired_event", zzpp.zzah(zzahVar.zzk));
        try {
            if (zze().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzb(zzgu.zzl(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzc("Error storing conditional user property", zzgu.zzl(str), e);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzah zzq(String str, String str2) {
        String str3;
        Cursor cursor;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzae.checkNotEmpty(str);
        zzae.checkNotEmpty(str2);
        zzg();
        zzay();
        Cursor cursor2 = null;
        try {
            cursor = zze().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                } catch (SQLiteException e) {
                    e = e;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            str3 = str2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        String string2 = cursor.getString(0);
        if (string2 == null) {
            string2 = "";
        }
        String str4 = string2;
        Object zzL = zzL(cursor, 1);
        boolean z = cursor.getInt(2) != 0;
        String string3 = cursor.getString(3);
        long j = cursor.getLong(4);
        zzpk zzpkVar = this.zzg.zzi;
        zzpg.zzaT(zzpkVar);
        byte[] blob = cursor.getBlob(5);
        Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
        zzbh zzbhVar = (zzbh) zzpkVar.zzl(blob, creator);
        long j2 = cursor.getLong(6);
        zzpg.zzaT(zzpkVar);
        zzbh zzbhVar2 = (zzbh) zzpkVar.zzl(cursor.getBlob(7), creator);
        long j3 = cursor.getLong(8);
        long j4 = cursor.getLong(9);
        zzpg.zzaT(zzpkVar);
        str3 = str2;
        try {
            zzah zzahVar = new zzah(str, str4, new zzpl(j3, zzL, str3, str4), j2, z, string3, zzbhVar, j, zzbhVar2, j4, (zzbh) zzpkVar.zzl(cursor.getBlob(10), creator));
            if (cursor.moveToNext()) {
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzd.zzc("Got multiple records for conditional property, expected one", zzgu.zzl(str), zzicVar.zzm.zzc(str3));
            }
            cursor.close();
            return zzahVar;
        } catch (SQLiteException e3) {
            e = e3;
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzd("Error querying conditional property", zzgu.zzl(str), zzicVar.zzm.zzc(str3), e);
            if (cursor != null) {
            }
            return null;
        }
    }

    public final void zzr(String str, String str2) {
        zzae.checkNotEmpty(str);
        zzae.checkNotEmpty(str2);
        zzg();
        zzay();
        try {
            zze().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzic zzicVar = (zzic) this.$$delegate_0;
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzd("Error deleting conditional property", zzgu.zzl(str), zzicVar.zzm.zzc(str2), e);
        }
    }

    public final List zzs(String str, String str2, String str3) {
        zzae.checkNotEmpty(str);
        zzg();
        zzay();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(Marker.ANY_MARKER));
            sb.append(" and name glob ?");
        }
        return zzt(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        r0 = r1.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(r0);
        r0.zzd.zzb(java.lang.Integer.valueOf(org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO), "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzt(String str, String[] strArr) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        zzay();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                zzicVar.getClass();
                cursor = zze().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursor.moveToFirst()) {
                    while (true) {
                        if (arrayList.size() >= 1000) {
                            break;
                        }
                        String string2 = cursor.getString(0);
                        String string3 = cursor.getString(1);
                        String string4 = cursor.getString(2);
                        Object zzL = zzL(cursor, 3);
                        boolean z = cursor.getInt(4) != 0;
                        String string5 = cursor.getString(5);
                        long j = cursor.getLong(6);
                        zzpk zzpkVar = this.zzg.zzi;
                        zzpg.zzaT(zzpkVar);
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
                        zzbh zzbhVar = (zzbh) zzpkVar.zzl(blob, creator);
                        long j2 = cursor.getLong(8);
                        zzpg.zzaT(zzpkVar);
                        zzbh zzbhVar2 = (zzbh) zzpkVar.zzl(cursor.getBlob(9), creator);
                        long j3 = cursor.getLong(10);
                        long j4 = cursor.getLong(11);
                        zzpg.zzaT(zzpkVar);
                        arrayList.add(new zzah(string2, string3, new zzpl(j3, zzL, string4, string3), j2, z, string5, zzbhVar, j, zzbhVar2, j4, (zzbh) zzpkVar.zzl(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    }
                }
            } catch (SQLiteException e) {
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzd.zzb(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0306: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:95:0x0306 */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzh zzu(String str) {
        Cursor cursor;
        Cursor cursor2;
        Boolean valueOf;
        String string2;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzae.checkNotEmpty(str);
        zzg();
        zzay();
        Cursor cursor3 = null;
        try {
            try {
                cursor = zze().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                } catch (SQLiteException e) {
                    e = e;
                    zzgu zzguVar = zzicVar.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zzc("Error querying app. appId", zzgu.zzl(str), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        zzpg zzpgVar = this.zzg;
        zzh zzhVar = new zzh(zzpgVar.zzn, str);
        zzjl zzB = zzpgVar.zzB(str);
        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
        if (zzB.zzo(zzjkVar)) {
            zzhVar.zze(cursor.getString(0));
        }
        zzhVar.zzg(cursor.getString(1));
        if (zzpgVar.zzB(str).zzo(zzjk.AD_STORAGE)) {
            zzhVar.zzk(cursor.getString(2));
        }
        zzhVar.zzF(cursor.getLong(3));
        zzhVar.zzo(cursor.getLong(4));
        zzhVar.zzq(cursor.getLong(5));
        zzhVar.zzs(cursor.getString(6));
        zzhVar.zzw(cursor.getString(7));
        zzhVar.zzy(cursor.getLong(8));
        zzhVar.zzA(cursor.getLong(9));
        zzhVar.zzE(cursor.isNull(10) || cursor.getInt(10) != 0);
        zzhVar.zzO(cursor.getLong(11));
        zzhVar.zzQ(cursor.getLong(12));
        zzhVar.zzS(cursor.getLong(13));
        zzhVar.zzU(cursor.getLong(14));
        zzhVar.zzI(cursor.getLong(15));
        zzhVar.zzK(cursor.getLong(16));
        zzhVar.zzu(cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
        zzhVar.zzm(cursor.getString(18));
        zzhVar.zzY(cursor.getLong(19));
        zzhVar.zzW(cursor.getLong(20));
        zzhVar.zzab(cursor.getString(21));
        zzhVar.zzad(cursor.isNull(23) || cursor.getInt(23) != 0);
        zzhVar.zzC(cursor.isNull(25) ? 0L : cursor.getLong(25));
        if (!cursor.isNull(26)) {
            zzhVar.zzah(Arrays.asList(cursor.getString(26).split(",", -1)));
        }
        if (zzpgVar.zzB(str).zzo(zzjkVar)) {
            zzhVar.zzi(cursor.getString(28));
        }
        zzhVar.zzaj((cursor.isNull(29) || cursor.getInt(29) == 0) ? false : true);
        zzhVar.zzaE(cursor.getLong(39));
        zzhVar.zzaz(cursor.getString(36));
        zzhVar.zzal(cursor.getLong(30));
        zzhVar.zzan(cursor.getLong(31));
        zzaif.zza();
        if (zzicVar.zzg.zzp(str, zzfy.zzaO)) {
            zzhVar.zzap(cursor.getInt(32));
            zzhVar.zzax(cursor.getLong(35));
        }
        zzhVar.zzar((cursor.isNull(33) || cursor.getInt(33) == 0) ? false : true);
        if (cursor.isNull(34)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getInt(34) != 0);
        }
        zzhVar.zzaf(valueOf);
        zzhVar.zzaB(cursor.getInt(37));
        zzhVar.zzaD(cursor.getInt(38));
        if (cursor.isNull(40)) {
            string2 = "";
        } else {
            string2 = cursor.getString(40);
            zzae.checkNotNull(string2);
        }
        zzhVar.zzaG(string2);
        if (!cursor.isNull(41)) {
            zzhVar.zzat(Long.valueOf(cursor.getLong(41)));
        }
        if (!cursor.isNull(42)) {
            zzhVar.zzav(Long.valueOf(cursor.getLong(42)));
        }
        zzhVar.zzaI(cursor.getBlob(43));
        if (!cursor.isNull(44)) {
            zzhVar.zzaK(cursor.getInt(44));
        }
        if (zzicVar.zzg.zzp(str, zzfy.zzbj) && !cursor.isNull(45)) {
            zzhVar.zzaM(cursor.getLong(45));
        }
        zzhVar.zzb();
        if (cursor.moveToNext()) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzb(zzgu.zzl(str), "Got multiple records for app, expected one. appId");
        }
        cursor.close();
        return zzhVar;
    }

    public final void zzv(zzh zzhVar, boolean z) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        zzay();
        String zzc2 = zzhVar.zzc();
        zzae.checkNotNull(zzc2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzc2);
        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
        zzpg zzpgVar = this.zzg;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (zzpgVar.zzB(zzc2).zzo(zzjkVar)) {
            contentValues.put("app_instance_id", zzhVar.zzd());
        }
        contentValues.put("gmp_app_id", zzhVar.zzf());
        if (zzpgVar.zzB(zzc2).zzo(zzjk.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", zzhVar.zzj());
        }
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzG()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("app_version", zzhVar.zzr());
        contentValues.put("app_store", zzhVar.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzx()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzz()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzD()));
        contentValues.put("day", Long.valueOf(zzhVar.zzN()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzP()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzR()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzT()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzH()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzJ()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzt()));
        contentValues.put("firebase_instance_id", zzhVar.zzl());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zzX()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzV()));
        contentValues.put("health_monitor_sample", zzhVar.zzZ());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzac()));
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzB()));
        if (zzpgVar.zzB(zzc2).zzo(zzjkVar)) {
            contentValues.put("session_stitching_token", zzhVar.zzh());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzai()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzak()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.zzam()));
        zzaif.zza();
        zzal zzalVar = zzicVar.zzg;
        zzgu zzguVar = zzicVar.zzi;
        if (zzalVar.zzp(zzc2, zzfy.zzaO)) {
            contentValues.put("ad_services_version", Integer.valueOf(zzhVar.zzao()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzhVar.zzaw()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzhVar.zzaq()));
        contentValues.put("npa_metadata_value", zzhVar.zzae());
        contentValues.put("bundle_delivery_index", Long.valueOf(zzhVar.zzaF()));
        contentValues.put("sgtm_preview_key", zzhVar.zzay());
        contentValues.put("dma_consent_state", Integer.valueOf(zzhVar.zzaA()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zzhVar.zzaC()));
        contentValues.put("serialized_npa_metadata", zzhVar.zzaH());
        contentValues.put("client_upload_eligibility", Integer.valueOf(zzhVar.zzaL()));
        ArrayList zzag = zzhVar.zzag();
        if (zzag != null) {
            if (zzag.isEmpty()) {
                zzic.zzP(zzguVar);
                zzguVar.zzg.zzb(zzc2, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzag));
            }
        }
        zzahk.zza();
        if (zzalVar.zzp(null, zzfy.zzaK) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", zzhVar.zzas());
        contentValues.put("unmatched_uwa", zzhVar.zzau());
        contentValues.put("ad_campaign_info", zzhVar.zzaJ());
        if (zzalVar.zzp(zzc2, zzfy.zzbj)) {
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(zzhVar.zzaN()));
        }
        try {
            SQLiteDatabase zze2 = zze();
            if (zze2.update("apps", contentValues, "app_id = ?", new String[]{zzc2}) == 0 && zze2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzic.zzP(zzguVar);
                zzguVar.zzd.zzb(zzgu.zzl(zzc2), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzc("Error storing app. appId", zzgu.zzl(zzc2), e);
        }
    }

    public final zzar zzw(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return zzx(j, str, 1L, false, false, z, false, z2, z3, z4);
    }

    public final zzar zzx(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzae.checkNotEmpty(str);
        zzg();
        zzay();
        String[] strArr = {str};
        zzar zzarVar = new zzar();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zze2 = zze();
                cursor = zze2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j) {
                        zzarVar.zzb = cursor.getLong(1);
                        zzarVar.zza = cursor.getLong(2);
                        zzarVar.zzc = cursor.getLong(3);
                        zzarVar.zzd = cursor.getLong(4);
                        zzarVar.zze = cursor.getLong(5);
                        zzarVar.zzf = cursor.getLong(6);
                        zzarVar.zzg = cursor.getLong(7);
                    }
                    if (z) {
                        zzarVar.zzb += j2;
                    }
                    if (z2) {
                        zzarVar.zza += j2;
                    }
                    if (z3) {
                        zzarVar.zzc += j2;
                    }
                    if (z4) {
                        zzarVar.zzd += j2;
                    }
                    if (z5) {
                        zzarVar.zze += j2;
                    }
                    if (z6) {
                        zzarVar.zzf += j2;
                    }
                    if (z7) {
                        zzarVar.zzg += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzarVar.zza));
                    contentValues.put("daily_events_count", Long.valueOf(zzarVar.zzb));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzarVar.zzc));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzarVar.zzd));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzarVar.zze));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzarVar.zzf));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(zzarVar.zzg));
                    zze2.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    zzgu zzguVar = zzicVar.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzg.zzb(zzgu.zzl(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                zzgu zzguVar2 = zzicVar.zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzd.zzc("Error updating daily counts. appId", zzgu.zzl(str), e);
            }
            if (cursor != null) {
                cursor.close();
            }
            return zzarVar;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0088  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.maps.zzah zzy(String str) {
        Throwable th;
        Cursor cursor;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzae.checkNotEmpty(str);
        zzg();
        zzay();
        ?? r2 = 0;
        try {
            try {
                cursor = zze().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursor.moveToFirst()) {
                        byte[] blob = cursor.getBlob(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        if (cursor.moveToNext()) {
                            zzgu zzguVar = zzicVar.zzi;
                            zzic.zzP(zzguVar);
                            zzguVar.zzd.zzb(zzgu.zzl(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            com.google.android.gms.maps.zzah zzahVar = new com.google.android.gms.maps.zzah(12, blob, string2, string3);
                            cursor.close();
                            return zzahVar;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    zzgu zzguVar2 = zzicVar.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzd.zzc("Error querying remote config. appId", zzgu.zzl(str), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = this;
                if (r2 != 0) {
                    throw th;
                }
                r2.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void zzz(zzid zzidVar, boolean z) {
        zzg();
        zzay();
        zzae.checkNotEmpty(zzidVar.zzA());
        zzae.checkState(zzidVar.zzn());
        zzI();
        zzic zzicVar = (zzic) this.$$delegate_0;
        DefaultClock defaultClock = zzicVar.zzn;
        zzgu zzguVar = zzicVar.zzi;
        defaultClock.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long zzo = zzidVar.zzo();
        zzfx zzfxVar = zzfy.zzR;
        if (zzo < currentTimeMillis - ((Long) zzfxVar.zzb(null)).longValue() || zzidVar.zzo() > ((Long) zzfxVar.zzb(null)).longValue() + currentTimeMillis) {
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgu.zzl(zzidVar.zzA()), Long.valueOf(currentTimeMillis), Long.valueOf(zzidVar.zzo()));
        }
        byte[] zzcd = zzidVar.zzcd();
        try {
            zzpk zzpkVar = this.zzg.zzi;
            zzpg.zzaT(zzpkVar);
            byte[] zzv = zzpkVar.zzv(zzcd);
            zzic.zzP(zzguVar);
            zzguVar.zzl.zzb(Integer.valueOf(zzv.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzidVar.zzA());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzidVar.zzo()));
            contentValues.put("data", zzv);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzidVar.zzaa()) {
                contentValues.put("retry_count", Integer.valueOf(zzidVar.zzab()));
            }
            try {
                if (zze().insert("queue", null, contentValues) == -1) {
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zzb(zzgu.zzl(zzidVar.zzA()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                zzic.zzP(zzguVar);
                zzguVar.zzd.zzc("Error storing bundle. appId", zzgu.zzl(zzidVar.zzA()), e);
            }
        } catch (IOException e2) {
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzc("Data loss. Failed to serialize bundle. appId", zzgu.zzl(zzidVar.zzA()), e2);
        }
    }
}
