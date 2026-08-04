package com.gamericefishpro.space.n9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.gamericefishpro.space.i9.m5;
import com.gamericefishpro.space.i9.r8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends g4 {
    public final l v;
    public final r0 w;
    public static final String[] y = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] z = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] A = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] B = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    public static final String[] C = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] D = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] E = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] F = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] G = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] H = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] I = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public m(m4 m4Var) {
        super(m4Var);
        this.w = new r0(((r1) this.d).D);
        ((r1) this.d).getClass();
        this.v = new l(this, ((r1) this.d).d);
    }

    public static final String U(List list) {
        return list.isEmpty() ? "" : com.gamericefishpro.space.t0.y0.g(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void a0(ContentValues contentValues, Object obj) {
        com.gamericefishpro.space.v8.c0.d("value");
        com.gamericefishpro.space.v8.c0.g(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final void A(long j) {
        r();
        s();
        try {
            if (g0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.y.b(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void B() {
        r();
        s();
        if (Y()) {
            m4 m4Var = this.e;
            long jA = m4Var.B.w.a();
            r1 r1Var = (r1) this.d;
            r1Var.D.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) e0.M.a(null)).longValue()) {
                m4Var.B.w.b(jElapsedRealtime);
                r();
                s();
                if (Y()) {
                    SQLiteDatabase sQLiteDatabaseG0 = g0();
                    r1Var.D.getClass();
                    int iDelete = sQLiteDatabaseG0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) e0.R.a(null)).longValue())});
                    if (iDelete > 0) {
                        v0 v0Var = r1Var.y;
                        r1.l(v0Var);
                        v0Var.G.b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void C(ArrayList arrayList) {
        r1 r1Var = (r1) this.d;
        r();
        s();
        com.gamericefishpro.space.v8.c0.g(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (Y()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strJ = com.gamericefishpro.space.m5.a.j(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (b0(com.gamericefishpro.space.m5.a.j(new StringBuilder(strJ.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strJ, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                v0 v0Var = r1Var.y;
                r1.l(v0Var);
                v0Var.B.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseG0 = g0();
                StringBuilder sb = new StringBuilder(strJ.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strJ);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseG0.execSQL(sb.toString());
            } catch (SQLiteException e) {
                v0 v0Var2 = r1Var.y;
                r1.l(v0Var2);
                v0Var2.y.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void D(Long l) {
        r1 r1Var = (r1) this.d;
        r();
        s();
        if (Y()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (b0(sb.toString(), null) > 0) {
                v0 v0Var = r1Var.y;
                r1.l(v0Var);
                v0Var.B.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseG0 = g0();
                r1Var.D.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseG0.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                v0 v0Var2 = r1Var.y;
                r1.l(v0Var2);
                v0Var2.y.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final Object E(Cursor cursor, int i) {
        r1 r1Var = (r1) this.d;
        int type = cursor.getType(i);
        if (type == 0) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.y.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        v0 v0Var3 = r1Var.y;
        r1.l(v0Var3);
        v0Var3.y.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    public final long F(String str) {
        long j;
        ContentValues contentValues;
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.v8.c0.d(str);
        com.gamericefishpro.space.v8.c0.d("first_open_count");
        r();
        s();
        SQLiteDatabase sQLiteDatabaseG0 = g0();
        sQLiteDatabaseG0.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                long jC0 = c0(sb.toString(), new String[]{str}, -1L);
                if (jC0 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseG0.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        v0 v0Var = r1Var.y;
                        r1.l(v0Var);
                        v0Var.y.c("Failed to insert column (got -1). appId", v0.z(str), "first_open_count");
                    } else {
                        jC0 = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jC0));
                            if (sQLiteDatabaseG0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                v0 v0Var2 = r1Var.y;
                                r1.l(v0Var2);
                                v0Var2.y.c("Failed to update column (got 0). appId", v0.z(str), "first_open_count");
                            } else {
                                sQLiteDatabaseG0.setTransactionSuccessful();
                                j = jC0;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            j2 = jC0;
                            v0 v0Var3 = r1Var.y;
                            r1.l(v0Var3);
                            v0Var3.y.d("Error inserting column. appId", v0.z(str), "first_open_count", e);
                            j = j2;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jC0));
                    if (sQLiteDatabaseG0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        v0 v0Var4 = r1Var.y;
                        r1.l(v0Var4);
                        v0Var4.y.c("Failed to update column (got 0). appId", v0.z(str), "first_open_count");
                    } else {
                        sQLiteDatabaseG0.setTransactionSuccessful();
                        j = jC0;
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
            return j;
        } finally {
            sQLiteDatabaseG0.endTransaction();
        }
    }

    public final boolean G(String str, String str2) {
        return b0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final long H(String str) {
        com.gamericefishpro.space.v8.c0.d(str);
        return c0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void I(String str, Long l, long j, com.gamericefishpro.space.i9.a3 a3Var) {
        r();
        s();
        com.gamericefishpro.space.v8.c0.g(a3Var);
        com.gamericefishpro.space.v8.c0.d(str);
        r1 r1Var = (r1) this.d;
        byte[] bArrA = a3Var.a();
        v0 v0Var = r1Var.y;
        v0 v0Var2 = r1Var.y;
        r1.l(v0Var);
        v0Var.G.c("Saving complex main event, appId, data size", r1Var.C.a(str), Integer.valueOf(bArrA.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrA);
        try {
            if (g0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                r1.l(v0Var2);
                v0Var2.y.b(v0.z(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            r1.l(v0Var2);
            v0Var2.y.c("Error storing complex main event. appId", v0.z(str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:51:0x00fd->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    public final void J(String str, Long l, String str2, Bundle bundle) {
        v0 v0Var;
        Bundle bundle2;
        long j;
        String str3;
        ContentValues contentValues;
        v0 v0Var2;
        com.gamericefishpro.space.i9.i3 i3Var;
        Iterator it;
        m mVar = this;
        String str4 = str;
        r1 r1Var = (r1) mVar.d;
        com.gamericefishpro.space.v8.c0.g(bundle);
        mVar.r();
        mVar.s();
        com.gamericefishpro.space.c2.b bVar = l != null ? new com.gamericefishpro.space.c2.b(mVar, str4, l.longValue()) : new com.gamericefishpro.space.c2.b(mVar, str4);
        List<k> listB = bVar.b();
        while (!listB.isEmpty()) {
            for (k kVar : listB) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        com.gamericefishpro.space.i9.i3 i3Var2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = mVar.g0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(kVar.b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                i3Var = (com.gamericefishpro.space.i9.i3) ((com.gamericefishpro.space.i9.h3) z0.e0(com.gamericefishpro.space.i9.i3.U(), cursorQuery.getBlob(0))).e();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        v0 v0Var3 = r1Var.y;
                                                        r1.l(v0Var3);
                                                        v0Var3.B.b(v0.z(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    cursor = cursorQuery;
                                                    v0 v0Var4 = r1Var.y;
                                                    r1.l(v0Var4);
                                                    v0Var4.y.c("Data loss. Error selecting raw event. appId", v0.z(str4), e);
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                                i3Var2 = i3Var;
                                            } catch (IOException e2) {
                                                v0 v0Var5 = r1Var.y;
                                                r1.l(v0Var5);
                                                v0Var5.y.c("Data loss. Failed to merge raw event metadata. appId", v0.z(str4), e2);
                                                cursorQuery.close();
                                            }
                                            if (i3Var2 != null) {
                                                it = i3Var2.U1().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((com.gamericefishpro.space.i9.r3) it.next()).r().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            v0 v0Var6 = r1Var.y;
                                            r1.l(v0Var6);
                                            v0Var6.y.b(v0.z(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        i3Var = null;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = cursorQuery;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            i3Var = null;
                        }
                        if (i3Var2 != null) {
                            it = i3Var2.U1().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((com.gamericefishpro.space.i9.r3) it.next()).r().equals(str2)) {
                                    }
                                }
                            }
                        }
                    }
                    long jUpdate = g0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                    if (jUpdate != 1) {
                        r1.l(v0Var);
                        v0Var2 = v0Var;
                        try {
                            v0Var2.y.c("Failed to update raw event. appId, updatedRows", v0.z(str3), Long.valueOf(jUpdate));
                        } catch (SQLiteException e5) {
                            e = e5;
                            r1.l(v0Var2);
                            v0Var2.y.c("Error updating raw event. appId", v0.z(str3), e);
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    v0Var2 = v0Var;
                }
                m4 m4Var = mVar.e;
                z0 z0Var = m4Var.z;
                m4.T(z0Var);
                com.gamericefishpro.space.i9.a3 a3Var = kVar.d;
                Bundle bundle3 = new Bundle();
                for (com.gamericefishpro.space.i9.d3 d3Var : a3Var.p()) {
                    if (d3Var.x()) {
                        bundle3.putDouble(d3Var.q(), d3Var.y());
                    } else if (d3Var.v()) {
                        bundle3.putFloat(d3Var.q(), d3Var.w());
                    } else if (d3Var.t()) {
                        bundle3.putLong(d3Var.q(), d3Var.u());
                    } else if (d3Var.r()) {
                        bundle3.putString(d3Var.q(), d3Var.s());
                    } else if (d3Var.z().isEmpty()) {
                        v0 v0Var7 = ((r1) z0Var.d).y;
                        r1.l(v0Var7);
                        v0Var7.y.b(d3Var, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(d3Var.q(), z0.g0((m5) d3Var.z()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strS = a3Var.s();
                if (string == null) {
                    string = "";
                }
                r4 r4Var = r1Var.B;
                v0Var = r1Var.y;
                r1.j(r4Var);
                if (strS.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        com.gamericefishpro.space.i9.a3 a3Var2 = a3Var;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        a3Var = a3Var2;
                    }
                } else {
                    bundle2 = bundle;
                }
                com.gamericefishpro.space.i9.a3 a3Var3 = a3Var;
                r4Var.C(bundle3, bundle2);
                q qVar = new q((r1) mVar.d, string, str4, a3Var3.s(), a3Var3.u(), a3Var3.w(), bundle3);
                j = kVar.a;
                long j2 = kVar.b;
                boolean z2 = kVar.c;
                mVar.r();
                mVar.s();
                str3 = qVar.a;
                com.gamericefishpro.space.v8.c0.d(str3);
                z0 z0Var2 = m4Var.z;
                m4.T(z0Var2);
                byte[] bArrA = z0Var2.T(qVar).a();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", qVar.b);
                contentValues.put("timestamp", Long.valueOf(qVar.d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                contentValues.put("data", bArrA);
                contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
                mVar = this;
                str4 = str;
            }
            listB = bVar.b();
            mVar = this;
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    public final e2 K(String str) {
        Throwable th;
        SQLiteException e;
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.v8.c0.g(str);
        r();
        s();
        ?? RawQuery = {str};
        ?? r2 = 0;
        e2VarC = null;
        e2VarC = null;
        e2 e2VarC = null;
        try {
            try {
                RawQuery = g0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", RawQuery);
                try {
                    if (RawQuery.moveToFirst()) {
                        e2VarC = e2.c(RawQuery.getInt(1), RawQuery.getString(0));
                    } else {
                        v0 v0Var = r1Var.y;
                        r1.l(v0Var);
                        v0Var.G.a("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    v0 v0Var2 = r1Var.y;
                    r1.l(v0Var2);
                    v0Var2.y.b(e, "Error querying database.");
                    if (RawQuery != 0) {
                    }
                    if (e2VarC == null) {
                        return e2.c;
                    }
                    return e2VarC;
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = RawQuery;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            RawQuery = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        RawQuery.close();
        if (e2VarC == null) {
            return e2.c;
        }
        return e2VarC;
    }

    public final void L(String str, a4 a4Var) {
        r();
        s();
        com.gamericefishpro.space.v8.c0.d(str);
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.z8.a aVar = r1Var.D;
        v0 v0Var = r1Var.y;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        d0 d0Var = e0.v0;
        long jLongValue = jCurrentTimeMillis - ((Long) d0Var.a(null)).longValue();
        long j = a4Var.e;
        if (j < jLongValue || j > ((Long) d0Var.a(null)).longValue() + jCurrentTimeMillis) {
            r1.l(v0Var);
            v0Var.B.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", v0.z(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        r1.l(v0Var);
        v0Var.G.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", a4Var.d);
        contentValues.put("source", Integer.valueOf(a4Var.i));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (g0().insert("trigger_uris", null, contentValues) == -1) {
                r1.l(v0Var);
                v0Var.y.b(v0.z(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            r1.l(v0Var);
            v0Var.y.c("Error storing trigger URI. appId", v0.z(str), e);
        }
    }

    public final void M(String str, e2 e2Var) {
        com.gamericefishpro.space.v8.c0.g(str);
        com.gamericefishpro.space.v8.c0.g(e2Var);
        r();
        s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", e2Var.g());
        contentValues.put("consent_source", Integer.valueOf(e2Var.b));
        O(contentValues);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    public final String N(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = g0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                v0 v0Var = ((r1) this.d).y;
                r1.l(v0Var);
                v0Var.y.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    public final void O(ContentValues contentValues) {
        r1 r1Var = (r1) this.d;
        try {
            SQLiteDatabase sQLiteDatabaseG0 = g0();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                v0 v0Var = r1Var.y;
                r1.l(v0Var);
                v0Var.A.b(v0.z("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseG0.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseG0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                v0 v0Var2 = r1Var.y;
                r1.l(v0Var2);
                v0Var2.y.c("Failed to insert/update table (got -1). key", v0.z("consent_settings"), v0.z("app_id"));
            }
        } catch (SQLiteException e) {
            v0 v0Var3 = r1Var.y;
            r1.l(v0Var3);
            v0Var3.y.d("Error storing into table. key", v0.z("consent_settings"), v0.z("app_id"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    public final r P(String str, String str2, String str3) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.v8.c0.d(str2);
        com.gamericefishpro.space.v8.c0.d(str3);
        r();
        s();
        Cursor cursor = null;
        try {
            cursorQuery = g0().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(1);
                        long j3 = cursorQuery.getLong(2);
                        long j4 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        r rVar = new r(str2, str3, j, j2, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j3, j4, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            v0 v0Var = r1Var.y;
                            r1.l(v0Var);
                            v0Var.y.b(v0.z(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return rVar;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    v0 v0Var2 = r1Var.y;
                    r1.l(v0Var2);
                    v0Var2.y.d("Error querying events. appId", v0.z(str2), r1Var.C.a(str3), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void Q(String str, r rVar) {
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.v8.c0.g(rVar);
        r();
        s();
        ContentValues contentValues = new ContentValues();
        String str2 = rVar.a;
        contentValues.put("app_id", str2);
        contentValues.put("name", rVar.b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.g));
        contentValues.put("last_bundled_day", rVar.h);
        contentValues.put("last_sampled_complex_event_id", rVar.i);
        contentValues.put("last_sampling_rate", rVar.j);
        contentValues.put("current_session_count", Long.valueOf(rVar.e));
        Boolean bool = rVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (g0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                v0 v0Var = r1Var.y;
                r1.l(v0Var);
                v0Var.y.b(v0.z(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.y.c("Error storing event aggregates. appId", v0.z(str2), e);
        }
    }

    public final void R(String str, String str2) {
        com.gamericefishpro.space.v8.c0.d(str2);
        r();
        s();
        try {
            g0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.y.c("Error deleting snapshot. appId", v0.z(str2), e);
        }
    }

    public final n4 S(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        a3 a3Var;
        r1 r1Var = (r1) this.d;
        if (TextUtils.isEmpty(str2)) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.F.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.gamericefishpro.space.i9.f3 f3Var = (com.gamericefishpro.space.i9.f3) z0.e0(com.gamericefishpro.space.i9.g3.w(), bArr);
            a3[] a3VarArrValues = a3.values();
            int length = a3VarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    a3Var = a3.UNKNOWN;
                    break;
                }
                a3Var = a3VarArrValues[i3];
                if (a3Var.d == i) {
                    break;
                }
                i3++;
            }
            if (a3Var != a3.GOOGLE_SIGNAL && a3Var != a3.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((com.gamericefishpro.space.i9.g3) f3Var.e).p()).iterator();
                while (it.hasNext()) {
                    com.gamericefishpro.space.i9.h3 h3Var = (com.gamericefishpro.space.i9.h3) ((com.gamericefishpro.space.i9.i3) it.next()).i();
                    h3Var.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var.e).T0(i2);
                    arrayList.add((com.gamericefishpro.space.i9.i3) h3Var.e());
                }
                f3Var.b();
                ((com.gamericefishpro.space.i9.g3) f3Var.e).B();
                f3Var.b();
                ((com.gamericefishpro.space.i9.g3) f3Var.e).A(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        v0 v0Var2 = r1Var.y;
                        r1.l(v0Var2);
                        v0Var2.y.b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new n4(j, (com.gamericefishpro.space.i9.g3) f3Var.e(), str2, map, a3Var, j2, j3, j4, i2);
        } catch (IOException e) {
            v0 v0Var3 = r1Var.y;
            r1.l(v0Var3);
            v0Var3.y.c("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
            return null;
        }
    }

    public final String T() {
        ((r1) this.d).D.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) e0.S.a(null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")";
        String str2 = "(upload_type != 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + ((Long) e0.R.a(null)).longValue() + ")";
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length() + 1);
        sb.append("(");
        sb.append(str);
        sb.append(" OR ");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final void V(String str, e2 e2Var) {
        com.gamericefishpro.space.v8.c0.g(str);
        r();
        s();
        M(str, K(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", e2Var.g());
        O(contentValues);
    }

    public final e2 W(String str) {
        com.gamericefishpro.space.v8.c0.g(str);
        r();
        s();
        return e2.c(100, N("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final r X(String str, com.gamericefishpro.space.i9.a3 a3Var, String str2) {
        r rVarP = P("events", str, a3Var.s());
        if (rVarP != null) {
            long j = rVarP.e + 1;
            long j2 = rVarP.d + 1;
            return new r(rVarP.a, rVarP.b, rVarP.c + 1, j2, j, rVarP.f, rVarP.g, rVarP.h, rVarP.i, rVarP.j, rVarP.k);
        }
        r1 r1Var = (r1) this.d;
        v0 v0Var = r1Var.y;
        r1.l(v0Var);
        v0Var.B.c("Event aggregate wasn't created during raw event logging. appId, event", v0.z(str), r1Var.C.a(str2));
        return new r(str, a3Var.s(), 1L, 1L, 1L, a3Var.u(), 0L, null, null, null, null);
    }

    public final boolean Y() {
        return ((r1) this.d).d.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0248  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8 A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x010a A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0124 A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0147 A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TRY_ENTER, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Code duplicated, block: B:60:0x015b  */
    /* JADX WARN: Code duplicated, block: B:61:0x015d A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0175  */
    /* JADX WARN: Code duplicated, block: B:73:0x0181  */
    /* JADX WARN: Code duplicated, block: B:75:0x0187 A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0190 A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01b3 A[Catch: all -> 0x01f1, SQLiteException -> 0x01f3, LOOP:0: B:80:0x01b3->B:127:?, LOOP_START, TRY_LEAVE, TryCatch #1 {all -> 0x01f1, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:78:0x01ad, B:80:0x01b3, B:81:0x01bc, B:83:0x01c7, B:92:0x0207, B:91:0x01f6, B:95:0x020e, B:103:0x0235, B:11:0x003e, B:31:0x008c, B:33:0x0092, B:39:0x00a4, B:36:0x009a), top: B:113:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0207 A[Catch: all -> 0x01f1, SQLiteException -> 0x01f3, TryCatch #1 {all -> 0x01f1, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:78:0x01ad, B:80:0x01b3, B:81:0x01bc, B:83:0x01c7, B:92:0x0207, B:91:0x01f6, B:95:0x020e, B:103:0x0235, B:11:0x003e, B:31:0x008c, B:33:0x0092, B:39:0x00a4, B:36:0x009a), top: B:113:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x020e A[Catch: all -> 0x01f1, SQLiteException -> 0x01f3, TRY_LEAVE, TryCatch #1 {all -> 0x01f1, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:78:0x01ad, B:80:0x01b3, B:81:0x01bc, B:83:0x01c7, B:92:0x0207, B:91:0x01f6, B:95:0x020e, B:103:0x0235, B:11:0x003e, B:31:0x008c, B:33:0x0092, B:39:0x00a4, B:36:0x009a), top: B:113:0x0018 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void Z(String str, long j, long j2, e1 e1Var) throws Throwable {
        ?? r9;
        ?? r5;
        Cursor cursorRawQuery;
        String str2;
        String[] strArr;
        String string;
        ?? r6;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str3;
        long j3;
        com.gamericefishpro.space.i9.z2 z2Var;
        long jC0;
        long j4;
        String string2;
        r1 r1Var = (r1) this.d;
        r();
        s();
        Cursor cursorQuery = null;
        cursorQuery = null;
        ?? r7 = 0;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseG0 = g0();
                ?? IsEmpty = TextUtils.isEmpty(str);
                String str4 = "";
                try {
                    if (IsEmpty != 0) {
                        String[] strArr5 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                        str4 = j2 != -1 ? "rowid <= ? and " : "";
                        StringBuilder sb = new StringBuilder(str4.length() + 148);
                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb.append(str4);
                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseG0.rawQuery(sb.toString(), strArr5);
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                string2 = cursorRawQuery.getString(0);
                                try {
                                    string = cursorRawQuery.getString(1);
                                    cursorRawQuery.close();
                                    r6 = string2;
                                    cursorRawQuery = sQLiteDatabaseG0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r6, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        try {
                                            com.gamericefishpro.space.i9.i3 i3Var = (com.gamericefishpro.space.i9.i3) ((com.gamericefishpro.space.i9.h3) z0.e0(com.gamericefishpro.space.i9.i3.U(), cursorRawQuery.getBlob(0))).e();
                                            if (cursorRawQuery.moveToNext()) {
                                                v0 v0Var = r1Var.y;
                                                r1.l(v0Var);
                                                v0Var.B.b(v0.z(r6), "Get multiple raw event metadata records, expected one. appId");
                                            }
                                            cursorRawQuery.close();
                                            e1Var.b = i3Var;
                                            if (r1Var.v.B(null, e0.k1)) {
                                                jC0 = c0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r6, string}, -1L);
                                                if (j2 == -1) {
                                                    j4 = j2;
                                                } else if (jC0 != -1) {
                                                    j4 = -1;
                                                } else {
                                                    strArr2 = new String[]{r6, string};
                                                    strArr4 = strArr2;
                                                    str3 = "app_id = ? and metadata_fingerprint = ?";
                                                }
                                                if (j4 == -1 && jC0 != -1) {
                                                    jC0 = Math.min(j4, jC0);
                                                } else if (j4 != -1) {
                                                    jC0 = j4;
                                                }
                                                strArr3 = new String[]{r6, string, String.valueOf(jC0)};
                                                strArr4 = strArr3;
                                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else if (j2 != -1) {
                                                strArr3 = new String[]{r6, string, String.valueOf(j2)};
                                                strArr4 = strArr3;
                                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else {
                                                strArr2 = new String[]{r6, string};
                                                strArr4 = strArr2;
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                            }
                                            cursorQuery = sQLiteDatabaseG0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr4, null, null, "rowid", null);
                                            try {
                                                if (cursorQuery.moveToFirst()) {
                                                    do {
                                                        j3 = cursorQuery.getLong(0);
                                                        try {
                                                            z2Var = (com.gamericefishpro.space.i9.z2) z0.e0(com.gamericefishpro.space.i9.a3.z(), cursorQuery.getBlob(3));
                                                            String string3 = cursorQuery.getString(1);
                                                            z2Var.b();
                                                            ((com.gamericefishpro.space.i9.a3) z2Var.e).F(string3);
                                                            long j5 = cursorQuery.getLong(2);
                                                            z2Var.b();
                                                            ((com.gamericefishpro.space.i9.a3) z2Var.e).G(j5);
                                                            if (!e1Var.a(j3, (com.gamericefishpro.space.i9.a3) z2Var.e())) {
                                                                break;
                                                            }
                                                        } catch (IOException e) {
                                                            v0 v0Var2 = r1Var.y;
                                                            r1.l(v0Var2);
                                                            v0Var2.y.c("Data loss. Failed to merge raw event. appId", v0.z(r6), e);
                                                        }
                                                    } while (cursorQuery.moveToNext());
                                                } else {
                                                    v0 v0Var3 = r1Var.y;
                                                    r1.l(v0Var3);
                                                    v0Var3.B.b(v0.z(r6), "Raw event data disappeared while in transaction. appId");
                                                }
                                            } catch (SQLiteException e2) {
                                                e = e2;
                                                r5 = r6;
                                                v0 v0Var4 = r1Var.y;
                                                r1.l(v0Var4);
                                                v0Var4.y.c("Data loss. Error selecting raw event. appId", v0.z(r5), e);
                                            }
                                            cursorRawQuery = cursorQuery;
                                        } catch (IOException e3) {
                                            v0 v0Var5 = r1Var.y;
                                            r1.l(v0Var5);
                                            v0Var5.y.c("Data loss. Failed to merge raw event metadata. appId", v0.z(r6), e3);
                                        }
                                    } else {
                                        v0 v0Var6 = r1Var.y;
                                        r1.l(v0Var6);
                                        v0Var6.y.b(v0.z(r6), "Raw event metadata record is missing. appId");
                                    }
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    cursorQuery = cursorRawQuery;
                                    r5 = string2;
                                    v0 v0Var7 = r1Var.y;
                                    r1.l(v0Var7);
                                    v0Var7.y.c("Data loss. Error selecting raw event. appId", v0.z(r5), e);
                                    cursorRawQuery = cursorQuery;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                }
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                            string2 = str;
                        }
                    } else {
                        try {
                            if (j2 != -1) {
                                String str5 = str;
                                strArr = new String[]{str5, String.valueOf(j2)};
                                IsEmpty = str5;
                            } else {
                                str2 = str;
                                strArr = new String[]{str2};
                            }
                            if (j2 != -1) {
                                IsEmpty = str2;
                                str4 = " and rowid <= ?";
                            }
                            IsEmpty = str2;
                            StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                            sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                            sb2.append(str4);
                            sb2.append(" order by rowid limit 1;");
                            cursorRawQuery = sQLiteDatabaseG0.rawQuery(sb2.toString(), strArr);
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    string = cursorRawQuery.getString(0);
                                    cursorRawQuery.close();
                                    r6 = IsEmpty;
                                    cursorRawQuery = sQLiteDatabaseG0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r6, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        v0 v0Var8 = r1Var.y;
                                        r1.l(v0Var8);
                                        v0Var8.y.b(v0.z(r6), "Raw event metadata record is missing. appId");
                                    } else {
                                        com.gamericefishpro.space.i9.i3 i3Var2 = (com.gamericefishpro.space.i9.i3) ((com.gamericefishpro.space.i9.h3) z0.e0(com.gamericefishpro.space.i9.i3.U(), cursorRawQuery.getBlob(0))).e();
                                        if (cursorRawQuery.moveToNext()) {
                                            v0 v0Var9 = r1Var.y;
                                            r1.l(v0Var9);
                                            v0Var9.B.b(v0.z(r6), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        e1Var.b = i3Var2;
                                        if (r1Var.v.B(null, e0.k1)) {
                                            jC0 = c0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r6, string}, -1L);
                                            if (j2 == -1) {
                                                j4 = j2;
                                            } else if (jC0 != -1) {
                                                j4 = -1;
                                            } else {
                                                strArr2 = new String[]{r6, string};
                                                strArr4 = strArr2;
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                            }
                                            if (j4 == -1) {
                                                if (j4 != -1) {
                                                    jC0 = j4;
                                                }
                                            } else if (j4 != -1) {
                                                jC0 = j4;
                                            }
                                            strArr3 = new String[]{r6, string, String.valueOf(jC0)};
                                            strArr4 = strArr3;
                                            str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else if (j2 != -1) {
                                            strArr3 = new String[]{r6, string, String.valueOf(j2)};
                                            strArr4 = strArr3;
                                            str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else {
                                            strArr2 = new String[]{r6, string};
                                            strArr4 = strArr2;
                                            str3 = "app_id = ? and metadata_fingerprint = ?";
                                        }
                                        cursorQuery = sQLiteDatabaseG0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr4, null, null, "rowid", null);
                                        if (cursorQuery.moveToFirst()) {
                                            do {
                                                j3 = cursorQuery.getLong(0);
                                                z2Var = (com.gamericefishpro.space.i9.z2) z0.e0(com.gamericefishpro.space.i9.a3.z(), cursorQuery.getBlob(3));
                                                String string4 = cursorQuery.getString(1);
                                                z2Var.b();
                                                ((com.gamericefishpro.space.i9.a3) z2Var.e).F(string4);
                                                long j6 = cursorQuery.getLong(2);
                                                z2Var.b();
                                                ((com.gamericefishpro.space.i9.a3) z2Var.e).G(j6);
                                                if (!e1Var.a(j3, (com.gamericefishpro.space.i9.a3) z2Var.e())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorQuery.moveToNext());
                                        } else {
                                            v0 v0Var10 = r1Var.y;
                                            r1.l(v0Var10);
                                            v0Var10.B.b(v0.z(r6), "Raw event data disappeared while in transaction. appId");
                                        }
                                        cursorRawQuery = cursorQuery;
                                    }
                                }
                            } catch (SQLiteException e6) {
                                e = e6;
                                cursorQuery = cursorRawQuery;
                                r9 = IsEmpty;
                                r5 = r9;
                                v0 v0Var11 = r1Var.y;
                                r1.l(v0Var11);
                                v0Var11.y.c("Data loss. Error selecting raw event. appId", v0.z(r5), e);
                                cursorRawQuery = cursorQuery;
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                            }
                        } catch (SQLiteException e7) {
                            e = e7;
                            r9 = IsEmpty;
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    r7 = "select metadata_fingerprint from raw_events where app_id = ?";
                    if (r7 != 0) {
                        r7.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e8) {
            e = e8;
            r9 = str;
        }
    }

    public final long b0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = g0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                v0 v0Var = ((r1) this.d).y;
                r1.l(v0Var);
                v0Var.y.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long c0(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = g0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                v0 v0Var = ((r1) this.d).y;
                r1.l(v0Var);
                v0Var.y.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final void d0() {
        s();
        g0().beginTransaction();
    }

    public final void e0() {
        s();
        g0().setTransactionSuccessful();
    }

    public final void f0() {
        s();
        g0().endTransaction();
    }

    public final SQLiteDatabase g0() {
        r();
        try {
            return this.v.getWritableDatabase();
        } catch (SQLiteException e) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.B.b(e, "Error opening database");
            throw e;
        }
    }

    public final void h0(String str) {
        r rVarP;
        R("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = g0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (rVarP = P("events", str, string)) != null) {
                            Q("events_snapshot", rVarP);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                v0 v0Var = ((r1) this.d).y;
                r1.l(v0Var);
                v0Var.y.c("Error creating snapshot. appId", v0.z(str), e);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    public final void i0(String str) throws Throwable {
        boolean z2;
        r rVarP;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        r rVarP2 = P("events", str, "_f");
        r rVarP3 = P("events", str, "_v");
        R("events", str);
        Cursor cursorQuery = null;
        boolean z3 = false;
        try {
            cursorQuery = g0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z4 = false;
                z2 = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z4 = true;
                            } else if ("_v".equals(string)) {
                                z2 = true;
                            }
                        }
                        if (string != null && (rVarP = P("events_snapshot", str, string)) != null) {
                            Q("events", rVarP);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z3 = z4;
                        try {
                            v0 v0Var = ((r1) this.d).y;
                            r1.l(v0Var);
                            v0Var.y.c("Error querying snapshot. appId", v0.z(str), e);
                            z4 = z3;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z3 && rVarP2 != null) {
                                Q("events", rVarP2);
                            } else if (!z2 && rVarP3 != null) {
                                Q("events", rVarP3);
                            }
                            R("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z3 = z4;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z3) {
                            if (!z2) {
                                Q("events", rVarP3);
                            }
                        } else if (!z2) {
                            Q("events", rVarP3);
                        }
                        R("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z4 && rVarP2 != null) {
                    Q("events", rVarP2);
                } else if (!z2 && rVarP3 != null) {
                    Q("events", rVarP3);
                }
            } else {
                cursorQuery.close();
                if (rVarP2 != null) {
                    Q("events", rVarP2);
                } else if (rVarP3 != null) {
                    Q("events", rVarP3);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            z2 = false;
        } catch (Throwable th3) {
            th = th3;
            z2 = false;
        }
        R("events_snapshot", str);
    }

    public final void j0(String str, String str2) {
        com.gamericefishpro.space.v8.c0.d(str);
        com.gamericefishpro.space.v8.c0.d(str2);
        r();
        s();
        try {
            g0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            r1 r1Var = (r1) this.d;
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.d("Error deleting user property. appId", v0.z(str), r1Var.C.c(str2), e);
        }
    }

    public final boolean k0(p4 p4Var) {
        r1 r1Var = (r1) this.d;
        String str = p4Var.b;
        r();
        s();
        String str2 = p4Var.a;
        String str3 = p4Var.c;
        if (l0(str2, str3) == null) {
            if (r4.p0(str3)) {
                if (b0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(r1Var.v.z(str2, e0.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jB0 = b0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                r1Var.getClass();
                if (jB0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(p4Var.d));
        a0(contentValues, p4Var.e);
        try {
            if (g0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.b(v0.z(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.y.c("Error storing user property. appId", v0.z(str2), e);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    public final p4 l0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.v8.c0.d(str);
        com.gamericefishpro.space.v8.c0.d(str2);
        r();
        s();
        Cursor cursor = null;
        try {
            cursorQuery = g0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        Object objE = E(cursorQuery, 1);
                        if (objE != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                p4 p4Var = new p4(str3, cursorQuery.getString(2), str4, j, objE);
                                if (cursorQuery.moveToNext()) {
                                    v0 v0Var = r1Var.y;
                                    r1.l(v0Var);
                                    v0Var.y.b(v0.z(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return p4Var;
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        }
                        sQLiteException = e;
                        v0 v0Var2 = r1Var.y;
                        r1.l(v0Var2);
                        v0Var2.y.d("Error querying user property. appId", v0.z(str3), r1Var.C.c(str4), sQLiteException);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List m0(String str) {
        String str2;
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.v8.c0.d(str);
        r();
        s();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                r1Var.getClass();
                cursorQuery = g0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j = cursorQuery.getLong(2);
                            Object objE = E(cursorQuery, 3);
                            if (objE == null) {
                                v0 v0Var = r1Var.y;
                                r1.l(v0Var);
                                v0Var.y.b(v0.z(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } else {
                                str2 = str;
                                arrayList.add(new p4(str2, str3, string, j, objE));
                            }
                            try {
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                str = str2;
                            } catch (SQLiteException e) {
                                e = e;
                                v0 v0Var2 = r1Var.y;
                                r1.l(v0Var2);
                                v0Var2.y.c("Error querying user properties. appId", v0.z(str2), e);
                                arrayList = Collections.EMPTY_LIST;
                            }
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str2 = str;
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            str2 = str;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    public final List n0(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        Cursor cursorQuery;
        String str5;
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.v8.c0.d(str);
        r();
        s();
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
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String string = sb.toString();
            r1Var.getClass();
            v0 v0Var = r1Var.y;
            cursorQuery = g0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    r1.l(v0Var);
                                    v0Var.y.b(1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j = cursorQuery.getLong(1);
                                Object objE = E(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objE == null) {
                                    try {
                                        r1.l(v0Var);
                                        v0Var.y.d("(2)Read invalid user property value, ignoring it", v0.z(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            v0 v0Var2 = r1Var.y;
                                            r1.l(v0Var2);
                                            v0Var2.y.d("(2)Error querying user properties", v0.z(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new p4(str, str5, string2, j, objE));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    v0 v0Var3 = r1Var.y;
                                    r1.l(v0Var3);
                                    v0Var3.y.d("(2)Error querying user properties", v0.z(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursorQuery;
                                v0 v0Var4 = r1Var.y;
                                r1.l(v0Var4);
                                v0Var4.y.d("(2)Error querying user properties", v0.z(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                str4 = str2;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final boolean o0(e eVar) {
        r1 r1Var = (r1) this.d;
        r();
        s();
        String str = eVar.d;
        com.gamericefishpro.space.v8.c0.g(str);
        if (l0(str, eVar.i.e) == null) {
            long jB0 = b0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            r1Var.getClass();
            if (jB0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", eVar.e);
        contentValues.put("name", eVar.i.e);
        Object objB = eVar.i.b();
        com.gamericefishpro.space.v8.c0.g(objB);
        a0(contentValues, objB);
        contentValues.put("active", Boolean.valueOf(eVar.w));
        contentValues.put("trigger_event_name", eVar.y);
        contentValues.put("trigger_timeout", Long.valueOf(eVar.A));
        u uVar = eVar.z;
        r4 r4Var = r1Var.B;
        v0 v0Var = r1Var.y;
        r1.j(r4Var);
        contentValues.put("timed_out_event", r4.V(uVar));
        contentValues.put("creation_timestamp", Long.valueOf(eVar.v));
        r1.j(r4Var);
        contentValues.put("triggered_event", r4.V(eVar.B));
        contentValues.put("triggered_timestamp", Long.valueOf(eVar.i.i));
        contentValues.put("time_to_live", Long.valueOf(eVar.C));
        contentValues.put("expired_event", r4.V(eVar.D));
        try {
            if (g0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            r1.l(v0Var);
            v0Var.y.b(v0.z(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            r1.l(v0Var);
            v0Var.y.c("Error storing conditional user property", v0.z(str), e);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0116  */
    /* JADX WARN: Code duplicated, block: B:39:0x011c  */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:247), block:B:29:0x00f6 */
    public final e p0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.v8.c0.d(str);
        com.gamericefishpro.space.v8.c0.d(str2);
        r();
        s();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = g0().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objE = E(cursorQuery, 1);
                    boolean z2 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    z0 z0Var = this.e.z;
                    m4.T(z0Var);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<u> creator = u.CREATOR;
                    u uVar = (u) z0Var.W(blob, creator);
                    long j2 = cursorQuery.getLong(6);
                    m4.T(z0Var);
                    u uVar2 = (u) z0Var.W(cursorQuery.getBlob(7), creator);
                    long j3 = cursorQuery.getLong(8);
                    long j4 = cursorQuery.getLong(9);
                    m4.T(z0Var);
                    str3 = str2;
                    try {
                        e eVar = new e(str, str4, new o4(j3, objE, str3, str4), j2, z2, string2, uVar, j, uVar2, j4, (u) z0Var.W(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            v0 v0Var = r1Var.y;
                            r1.l(v0Var);
                            v0Var.y.c("Got multiple records for conditional property, expected one", v0.z(str), r1Var.C.c(str3));
                        }
                        cursorQuery.close();
                        return eVar;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
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
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        v0 v0Var2 = r1Var.y;
        r1.l(v0Var2);
        v0Var2.y.d("Error querying conditional property", v0.z(str), r1Var.C.c(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void q0(String str, String str2) {
        com.gamericefishpro.space.v8.c0.d(str);
        com.gamericefishpro.space.v8.c0.d(str2);
        r();
        s();
        try {
            g0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            r1 r1Var = (r1) this.d;
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.d("Error deleting conditional property", v0.z(str), r1Var.C.c(str2), e);
        }
    }

    public final List r0(String str, String str2, String str3) {
        com.gamericefishpro.space.v8.c0.d(str);
        r();
        s();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return s0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    public final List s0(String str, String[] strArr) {
        r1 r1Var = (r1) this.d;
        r();
        s();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                r1Var.getClass();
                cursorQuery = g0().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            v0 v0Var = r1Var.y;
                            r1.l(v0Var);
                            v0Var.y.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objE = E(cursorQuery, 3);
                        boolean z2 = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j = cursorQuery.getLong(6);
                        z0 z0Var = this.e.z;
                        m4.T(z0Var);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<u> creator = u.CREATOR;
                        u uVar = (u) z0Var.W(blob, creator);
                        long j2 = cursorQuery.getLong(8);
                        m4.T(z0Var);
                        u uVar2 = (u) z0Var.W(cursorQuery.getBlob(9), creator);
                        long j3 = cursorQuery.getLong(10);
                        long j4 = cursorQuery.getLong(11);
                        m4.T(z0Var);
                        arrayList.add(new e(string, string2, new o4(j3, objE, string3, string2), j2, z2, string4, uVar, j, uVar2, j4, (u) z0Var.W(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                v0 v0Var2 = r1Var.y;
                r1.l(v0Var2);
                v0Var2.y.b(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x03ed  */
    public final a1 t0(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.v8.c0.d(str);
        r();
        s();
        Cursor cursor = null;
        try {
            cursorQuery = g0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        m4 m4Var = this.e;
                        a1 a1Var = new a1(m4Var.E, str);
                        r1 r1Var2 = a1Var.a;
                        e2 e2VarB = m4Var.b(str);
                        d2 d2Var = d2.ANALYTICS_STORAGE;
                        if (e2VarB.i(d2Var)) {
                            a1Var.F(cursorQuery.getString(0));
                        }
                        boolean z2 = true;
                        a1Var.H(cursorQuery.getString(1));
                        if (m4Var.b(str).i(d2.AD_STORAGE)) {
                            a1Var.I(cursorQuery.getString(2));
                        }
                        a1Var.e(cursorQuery.getLong(3));
                        a1Var.L(cursorQuery.getLong(4));
                        a1Var.M(cursorQuery.getLong(5));
                        a1Var.O(cursorQuery.getString(6));
                        a1Var.R(cursorQuery.getString(7));
                        a1Var.S(cursorQuery.getLong(8));
                        a1Var.a(cursorQuery.getLong(9));
                        a1Var.d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        a1Var.i(cursorQuery.getLong(11));
                        a1Var.j(cursorQuery.getLong(12));
                        a1Var.k(cursorQuery.getLong(13));
                        a1Var.l(cursorQuery.getLong(14));
                        a1Var.f(cursorQuery.getLong(15));
                        a1Var.g(cursorQuery.getLong(16));
                        a1Var.Q(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        a1Var.K(cursorQuery.getString(18));
                        a1Var.n(cursorQuery.getLong(19));
                        a1Var.m(cursorQuery.getLong(20));
                        a1Var.v(cursorQuery.getString(21));
                        boolean z3 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        p1 p1Var = r1Var2.z;
                        r1.l(p1Var);
                        p1Var.r();
                        a1Var.Q |= a1Var.p != z3;
                        a1Var.p = z3;
                        a1Var.c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            a1Var.x(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (m4Var.b(str).i(d2Var)) {
                            String string2 = cursorQuery.getString(28);
                            p1 p1Var2 = r1Var2.z;
                            r1.l(p1Var2);
                            p1Var2.r();
                            a1Var.Q |= !Objects.equals(a1Var.t, string2);
                            a1Var.t = string2;
                        }
                        boolean z4 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        p1 p1Var3 = r1Var2.z;
                        r1.l(p1Var3);
                        p1Var3.r();
                        a1Var.Q |= a1Var.u != z4;
                        a1Var.u = z4;
                        a1Var.r(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        p1 p1Var4 = r1Var2.z;
                        r1.l(p1Var4);
                        p1Var4.r();
                        a1Var.Q |= a1Var.C != string3;
                        a1Var.C = string3;
                        a1Var.z(cursorQuery.getLong(30));
                        a1Var.A(cursorQuery.getLong(31));
                        r8.a();
                        if (r1Var.v.B(str, e0.P0)) {
                            int i = cursorQuery.getInt(32);
                            p1 p1Var5 = r1Var2.z;
                            r1.l(p1Var5);
                            p1Var5.r();
                            a1Var.Q |= a1Var.x != i;
                            a1Var.x = i;
                            a1Var.B(cursorQuery.getLong(35));
                        }
                        boolean z5 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        p1 p1Var6 = r1Var2.z;
                        r1.l(p1Var6);
                        p1Var6.r();
                        a1Var.Q |= a1Var.y != z5;
                        a1Var.y = z5;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        p1 p1Var7 = r1Var2.z;
                        r1.l(p1Var7);
                        p1Var7.r();
                        a1Var.Q |= !Objects.equals(a1Var.q, boolValueOf);
                        a1Var.q = boolValueOf;
                        a1Var.p(cursorQuery.getInt(37));
                        a1Var.q(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(40);
                            com.gamericefishpro.space.v8.c0.g(string);
                        }
                        p1 p1Var8 = r1Var2.z;
                        r1.l(p1Var8);
                        p1Var8.r();
                        a1Var.Q |= a1Var.G != string;
                        a1Var.G = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            p1 p1Var9 = r1Var2.z;
                            r1.l(p1Var9);
                            p1Var9.r();
                            a1Var.Q |= !Objects.equals(a1Var.z, lValueOf);
                            a1Var.z = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            p1 p1Var10 = r1Var2.z;
                            r1.l(p1Var10);
                            p1Var10.r();
                            a1Var.Q |= !Objects.equals(a1Var.A, lValueOf2);
                            a1Var.A = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        p1 p1Var11 = r1Var2.z;
                        r1.l(p1Var11);
                        p1Var11.r();
                        a1Var.Q |= a1Var.H != blob;
                        a1Var.H = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i2 = cursorQuery.getInt(44);
                            p1 p1Var12 = r1Var2.z;
                            r1.l(p1Var12);
                            p1Var12.r();
                            boolean z6 = a1Var.Q;
                            if (a1Var.I == i2) {
                                z2 = false;
                            }
                            a1Var.Q = z2 | z6;
                            a1Var.I = i2;
                        }
                        p1 p1Var13 = r1Var2.z;
                        r1.l(p1Var13);
                        p1Var13.r();
                        a1Var.Q = false;
                        if (cursorQuery.moveToNext()) {
                            v0 v0Var = r1Var.y;
                            r1.l(v0Var);
                            v0Var.y.b(v0.z(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return a1Var;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    v0 v0Var2 = r1Var.y;
                    r1.l(v0Var2);
                    v0Var2.y.c("Error querying app. appId", v0.z(str), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void u0(a1 a1Var, boolean z2) {
        r1 r1Var = (r1) this.d;
        r1 r1Var2 = a1Var.a;
        r();
        s();
        String strD = a1Var.D();
        com.gamericefishpro.space.v8.c0.g(strD);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strD);
        d2 d2Var = d2.ANALYTICS_STORAGE;
        m4 m4Var = this.e;
        if (z2) {
            contentValues.put("app_instance_id", (String) null);
        } else if (m4Var.b(strD).i(d2Var)) {
            contentValues.put("app_instance_id", a1Var.E());
        }
        contentValues.put("gmp_app_id", a1Var.G());
        if (m4Var.b(strD).i(d2.AD_STORAGE)) {
            p1 p1Var = r1Var2.z;
            r1.l(p1Var);
            p1Var.r();
            contentValues.put("resettable_device_id_hash", a1Var.e);
        }
        p1 p1Var2 = r1Var2.z;
        r1.l(p1Var2);
        p1Var2.r();
        contentValues.put("last_bundle_index", Long.valueOf(a1Var.g));
        p1 p1Var3 = r1Var2.z;
        r1.l(p1Var3);
        p1Var3.r();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(a1Var.h));
        p1 p1Var4 = r1Var2.z;
        r1.l(p1Var4);
        p1Var4.r();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(a1Var.i));
        contentValues.put("app_version", a1Var.N());
        p1 p1Var5 = r1Var2.z;
        r1.l(p1Var5);
        p1Var5.r();
        contentValues.put("app_store", a1Var.l);
        p1 p1Var6 = r1Var2.z;
        r1.l(p1Var6);
        p1Var6.r();
        contentValues.put("gmp_version", Long.valueOf(a1Var.m));
        p1 p1Var7 = r1Var2.z;
        r1.l(p1Var7);
        p1Var7.r();
        contentValues.put("dev_cert_hash", Long.valueOf(a1Var.n));
        p1 p1Var8 = r1Var2.z;
        r1.l(p1Var8);
        p1Var8.r();
        contentValues.put("measurement_enabled", Boolean.valueOf(a1Var.o));
        p1 p1Var9 = r1Var2.z;
        p1 p1Var10 = r1Var2.z;
        r1.l(p1Var9);
        p1Var9.r();
        contentValues.put("day", Long.valueOf(a1Var.J));
        r1.l(p1Var10);
        p1Var10.r();
        contentValues.put("daily_public_events_count", Long.valueOf(a1Var.K));
        r1.l(p1Var10);
        p1Var10.r();
        contentValues.put("daily_events_count", Long.valueOf(a1Var.L));
        r1.l(p1Var10);
        p1Var10.r();
        contentValues.put("daily_conversions_count", Long.valueOf(a1Var.M));
        p1 p1Var11 = r1Var2.z;
        r1.l(p1Var11);
        p1Var11.r();
        contentValues.put("config_fetched_time", Long.valueOf(a1Var.R));
        p1 p1Var12 = r1Var2.z;
        r1.l(p1Var12);
        p1Var12.r();
        contentValues.put("failed_config_fetch_time", Long.valueOf(a1Var.S));
        contentValues.put("app_version_int", Long.valueOf(a1Var.P()));
        contentValues.put("firebase_instance_id", a1Var.J());
        r1.l(p1Var10);
        p1Var10.r();
        contentValues.put("daily_error_events_count", Long.valueOf(a1Var.N));
        r1.l(p1Var10);
        p1Var10.r();
        contentValues.put("daily_realtime_events_count", Long.valueOf(a1Var.O));
        r1.l(p1Var10);
        p1Var10.r();
        contentValues.put("health_monitor_sample", a1Var.P);
        contentValues.put("android_id", (Long) 0L);
        p1 p1Var13 = r1Var2.z;
        r1.l(p1Var13);
        p1Var13.r();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(a1Var.p));
        contentValues.put("dynamite_version", Long.valueOf(a1Var.b()));
        if (m4Var.b(strD).i(d2Var)) {
            p1 p1Var14 = r1Var2.z;
            r1.l(p1Var14);
            p1Var14.r();
            contentValues.put("session_stitching_token", a1Var.t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(a1Var.y()));
        p1 p1Var15 = r1Var2.z;
        r1.l(p1Var15);
        p1Var15.r();
        contentValues.put("target_os_version", Long.valueOf(a1Var.v));
        p1 p1Var16 = r1Var2.z;
        r1.l(p1Var16);
        p1Var16.r();
        contentValues.put("session_stitching_token_hash", Long.valueOf(a1Var.w));
        r8.a();
        g gVar = r1Var.v;
        v0 v0Var = r1Var.y;
        if (gVar.B(strD, e0.P0)) {
            p1 p1Var17 = r1Var2.z;
            r1.l(p1Var17);
            p1Var17.r();
            contentValues.put("ad_services_version", Integer.valueOf(a1Var.x));
            p1 p1Var18 = r1Var2.z;
            r1.l(p1Var18);
            p1Var18.r();
            contentValues.put("attribution_eligibility_status", Long.valueOf(a1Var.B));
        }
        p1 p1Var19 = r1Var2.z;
        r1.l(p1Var19);
        p1Var19.r();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(a1Var.y));
        contentValues.put("npa_metadata_value", a1Var.w());
        p1 p1Var20 = r1Var2.z;
        r1.l(p1Var20);
        p1Var20.r();
        contentValues.put("bundle_delivery_index", Long.valueOf(a1Var.F));
        contentValues.put("sgtm_preview_key", a1Var.C());
        r1.l(p1Var10);
        p1Var10.r();
        contentValues.put("dma_consent_state", Integer.valueOf(a1Var.D));
        r1.l(p1Var10);
        p1Var10.r();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(a1Var.E));
        contentValues.put("serialized_npa_metadata", a1Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(a1Var.t()));
        p1 p1Var21 = r1Var2.z;
        r1.l(p1Var21);
        p1Var21.r();
        ArrayList arrayList = a1Var.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                r1.l(v0Var);
                v0Var.B.b(strD, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (r1Var.v.B(null, e0.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        p1 p1Var22 = r1Var2.z;
        r1.l(p1Var22);
        p1Var22.r();
        contentValues.put("unmatched_pfo", a1Var.z);
        p1 p1Var23 = r1Var2.z;
        r1.l(p1Var23);
        p1Var23.r();
        contentValues.put("unmatched_uwa", a1Var.A);
        p1 p1Var24 = r1Var2.z;
        r1.l(p1Var24);
        p1Var24.r();
        contentValues.put("ad_campaign_info", a1Var.H);
        try {
            SQLiteDatabase sQLiteDatabaseG0 = g0();
            if (sQLiteDatabaseG0.update("apps", contentValues, "app_id = ?", new String[]{strD}) == 0 && sQLiteDatabaseG0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                r1.l(v0Var);
                v0Var.y.b(v0.z(strD), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            r1.l(v0Var);
            v0Var.y.c("Error storing app. appId", v0.z(strD), e);
        }
    }

    public final long v(String str, com.gamericefishpro.space.i9.g3 g3Var, String str2, Map map, a3 a3Var, Long l) {
        int iDelete;
        r1 r1Var = (r1) this.d;
        r();
        s();
        com.gamericefishpro.space.v8.c0.g(g3Var);
        com.gamericefishpro.space.v8.c0.d(str);
        r();
        s();
        if (Y()) {
            m4 m4Var = this.e;
            long jA = m4Var.B.y.a();
            com.gamericefishpro.space.z8.a aVar = r1Var.D;
            v0 v0Var = r1Var.y;
            aVar.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) e0.M.a(null)).longValue()) {
                m4Var.B.y.b(jElapsedRealtime);
                r();
                s();
                if (Y() && (iDelete = g0().delete("upload_queue", T(), new String[0])) > 0) {
                    r1.l(v0Var);
                    v0Var.G.b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                com.gamericefishpro.space.v8.c0.d(str);
                r();
                s();
                try {
                    int iZ = r1Var.v.z(str, e0.A);
                    if (iZ > 0) {
                        g0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iZ)});
                    }
                } catch (SQLiteException e) {
                    r1.l(v0Var);
                    v0Var.y.c("Error deleting over the limit queued batches. appId", v0.z(str), e);
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
        byte[] bArrA = g3Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrA);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", String.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(a3Var.d));
        com.gamericefishpro.space.z8.a aVar2 = r1Var.D;
        v0 v0Var2 = r1Var.y;
        aVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = g0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            r1.l(v0Var2);
            v0Var2.y.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            r1.l(v0Var2);
            v0Var2.y.c("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            return -1L;
        }
    }

    public final j v0(long j, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        return w0(j, str, 1L, false, false, z2, false, z3, z4, z5);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00de  */
    public final List w(String str, e4 e4Var, int i) {
        List list;
        com.gamericefishpro.space.v8.c0.d(str);
        r();
        s();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseG0 = g0();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strU = U(e4Var.d);
            String strT = T();
            StringBuilder sb = new StringBuilder(strU.length() + 17 + strT.length());
            sb.append("app_id=?");
            sb.append(strU);
            sb.append(" AND NOT ");
            sb.append(strT);
            cursorQuery = sQLiteDatabaseG0.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                n4 n4VarS = S(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (n4VarS != null) {
                    arrayList.add(n4VarS);
                }
            }
            list = arrayList;
        } catch (SQLiteException e) {
            try {
                v0 v0Var = ((r1) this.d).y;
                r1.l(v0Var);
                v0Var.y.c("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                list = Collections.EMPTY_LIST;
            } catch (Throwable th) {
                th = th;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return list;
    }

    public final j w0(long j, String str, long j2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.v8.c0.d(str);
        r();
        s();
        String[] strArr = {str};
        j jVar = new j();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseG0 = g0();
                cursorQuery = sQLiteDatabaseG0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        jVar.b = cursorQuery.getLong(1);
                        jVar.a = cursorQuery.getLong(2);
                        jVar.c = cursorQuery.getLong(3);
                        jVar.d = cursorQuery.getLong(4);
                        jVar.e = cursorQuery.getLong(5);
                        jVar.f = cursorQuery.getLong(6);
                        jVar.g = cursorQuery.getLong(7);
                    }
                    if (z2) {
                        jVar.b += j2;
                    }
                    if (z3) {
                        jVar.a += j2;
                    }
                    if (z4) {
                        jVar.c += j2;
                    }
                    if (z5) {
                        jVar.d += j2;
                    }
                    if (z6) {
                        jVar.e += j2;
                    }
                    if (z7) {
                        jVar.f += j2;
                    }
                    if (z8) {
                        jVar.g += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(jVar.a));
                    contentValues.put("daily_events_count", Long.valueOf(jVar.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(jVar.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(jVar.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(jVar.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(jVar.g));
                    sQLiteDatabaseG0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    v0 v0Var = r1Var.y;
                    r1.l(v0Var);
                    v0Var.B.b(v0.z(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                v0 v0Var2 = r1Var.y;
                r1.l(v0Var2);
                v0Var2.y.c("Error updating daily counts. appId", v0.z(str), e);
            }
            return jVar;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public final boolean x(String str) {
        a3[] a3VarArr = {a3.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(a3VarArr[0].d));
        String strU = U(arrayList);
        String strT = T();
        StringBuilder sb = new StringBuilder(strU.length() + 61 + strT.length());
        sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(strU);
        sb.append(" AND NOT ");
        sb.append(strT);
        return b0(sb.toString(), new String[]{str}) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:109), block:B:19:0x006c */
    public final com.gamericefishpro.space.a8.c x0(String str) {
        Throwable th;
        Cursor cursorQuery;
        Cursor cursor;
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.v8.c0.d(str);
        r();
        s();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = g0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            v0 v0Var = r1Var.y;
                            r1.l(v0Var);
                            v0Var.y.b(v0.z(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            com.gamericefishpro.space.a8.c cVar = new com.gamericefishpro.space.a8.c((Object) blob, string, (Object) string2, 20);
                            cursorQuery.close();
                            return cVar;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    v0 v0Var2 = r1Var.y;
                    r1.l(v0Var2);
                    v0Var2.y.c("Error querying remote config. appId", v0.z(str), e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                throw th;
            }
            cursor2.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void y(Long l) {
        r1 r1Var = (r1) this.d;
        r();
        s();
        try {
            if (g0().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                v0 v0Var = r1Var.y;
                r1.l(v0Var);
                v0Var.B.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.y.b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    public final void y0(com.gamericefishpro.space.i9.i3 i3Var, boolean z2) {
        r();
        s();
        com.gamericefishpro.space.v8.c0.d(i3Var.p());
        if (!i3Var.b2()) {
            throw new IllegalStateException();
        }
        B();
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.z8.a aVar = r1Var.D;
        v0 v0Var = r1Var.y;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC2 = i3Var.c2();
        d0 d0Var = e0.R;
        if (jC2 < jCurrentTimeMillis - ((Long) d0Var.a(null)).longValue() || i3Var.c2() > ((Long) d0Var.a(null)).longValue() + jCurrentTimeMillis) {
            r1.l(v0Var);
            v0Var.B.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", v0.z(i3Var.p()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(i3Var.c2()));
        }
        byte[] bArrA = i3Var.a();
        try {
            z0 z0Var = this.e.z;
            m4.T(z0Var);
            byte[] bArrD0 = z0Var.d0(bArrA);
            r1.l(v0Var);
            v0Var.G.b(Integer.valueOf(bArrD0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", i3Var.p());
            contentValues.put("bundle_end_timestamp", Long.valueOf(i3Var.c2()));
            contentValues.put("data", bArrD0);
            contentValues.put("has_realtime", Integer.valueOf(z2 ? 1 : 0));
            if (i3Var.p0()) {
                contentValues.put("retry_count", Integer.valueOf(i3Var.q0()));
            }
            try {
                if (g0().insert("queue", null, contentValues) == -1) {
                    r1.l(v0Var);
                    v0Var.y.b(v0.z(i3Var.p()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                r1.l(v0Var);
                v0Var.y.c("Error storing bundle. appId", v0.z(i3Var.p()), e);
            }
        } catch (IOException e2) {
            r1.l(v0Var);
            v0Var.y.c("Data loss. Failed to serialize bundle. appId", v0.z(i3Var.p()), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final String z() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseG0 = g0();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseG0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    v0 v0Var = ((r1) this.d).y;
                    r1.l(v0Var);
                    v0Var.y.b(e, "Database error getting next bundle app id");
                }
            } catch (Throwable th) {
                r1 = sQLiteDatabaseG0;
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    @Override // com.gamericefishpro.space.n9.g4
    public final void u() {
    }
}
