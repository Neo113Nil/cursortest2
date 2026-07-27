package com.anythink.core.common.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.anythink.core.common.h.ag;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g extends c<ag> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13102a = "g";

    /* renamed from: b, reason: collision with root package name */
    private static volatile g f13103b;

    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final String f13104A = "ad_source_id";

        /* renamed from: B, reason: collision with root package name */
        public static final String f13105B = "network_firm_id";

        /* renamed from: C, reason: collision with root package name */
        public static final String f13106C = "progress";

        /* renamed from: D, reason: collision with root package name */
        public static final String f13107D = "file_size";

        /* renamed from: E, reason: collision with root package name */
        public static final String f13108E = "apk_redownload";

        /* renamed from: F, reason: collision with root package name */
        public static final String f13109F = "apk_allow_install_in_bg";

        /* renamed from: G, reason: collision with root package name */
        public static final String f13110G = "offer_cache_time";

        /* renamed from: H, reason: collision with root package name */
        public static final String f13111H = "app_name";

        /* renamed from: I, reason: collision with root package name */
        public static final String f13112I = "downloading_scene";
        public static final String J = "recover_download_scene";

        /* renamed from: K, reason: collision with root package name */
        public static final String f13113K = "download_failed_scene_list";

        /* renamed from: L, reason: collision with root package name */
        public static final String f13114L = "dsp_id";

        /* renamed from: M, reason: collision with root package name */
        public static final String f13115M = "action_offer_download_tk";

        /* renamed from: N, reason: collision with root package name */
        public static final String f13116N = "app_desc";

        /* renamed from: O, reason: collision with root package name */
        public static final String f13117O = "CREATE TABLE IF NOT EXISTS download_task(unique_id TEXT ,click_id TEXT ,request_id TEXT ,offer_id TEXT ,pkg_name TEXT ,url TEXT ,title TEXT ,deeplink_click_action TEXT ,icon_url TEXT ,deeplink_url TEXT ,file_path TEXT ,placement_id TEXT ,ad_source_id TEXT ,network_firm_id TEXT ,app_name TEXT ,download_failed_scene_list TEXT ,dsp_id TEXT ,action_offer_download_tk TEXT ,app_desc TEXT ,apk_verify INTEGER ,enable_use_webview_ua INTEGER ,download_type INTEGER ,notification_type INTEGER ,int_open_switch INTEGER ,int_open_time INTEGER ,offer_source_type INTEGER ,part_count INTEGER ,enable_part_download INTEGER ,download_start_timestamp INTEGER ,download_end_timestamp INTEGER ,status INTEGER ,is_upload_installed_agentevent INTEGER ,progress INTEGER ,file_size INTEGER ,apk_redownload INTEGER ,apk_allow_install_in_bg INTEGER ,offer_cache_time INTEGER ,downloading_scene INTEGER ,recover_download_scene INTEGER)";

        /* renamed from: a, reason: collision with root package name */
        public static final String f13118a = "download_task";

        /* renamed from: b, reason: collision with root package name */
        public static final String f13119b = "unique_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f13120c = "click_id";

        /* renamed from: d, reason: collision with root package name */
        public static final String f13121d = "request_id";

        /* renamed from: e, reason: collision with root package name */
        public static final String f13122e = "offer_id";

        /* renamed from: f, reason: collision with root package name */
        public static final String f13123f = "url";

        /* renamed from: g, reason: collision with root package name */
        public static final String f13124g = "pkg_name";

        /* renamed from: h, reason: collision with root package name */
        public static final String f13125h = "title";
        public static final String i = "deeplink_click_action";

        /* renamed from: j, reason: collision with root package name */
        public static final String f13126j = "apk_verify";

        /* renamed from: k, reason: collision with root package name */
        public static final String f13127k = "enable_use_webview_ua";

        /* renamed from: l, reason: collision with root package name */
        public static final String f13128l = "download_type";

        /* renamed from: m, reason: collision with root package name */
        public static final String f13129m = "notification_type";

        /* renamed from: n, reason: collision with root package name */
        public static final String f13130n = "int_open_switch";

        /* renamed from: o, reason: collision with root package name */
        public static final String f13131o = "int_open_time";

        /* renamed from: p, reason: collision with root package name */
        public static final String f13132p = "icon_url";

        /* renamed from: q, reason: collision with root package name */
        public static final String f13133q = "deeplink_url";

        /* renamed from: r, reason: collision with root package name */
        public static final String f13134r = "offer_source_type";

        /* renamed from: s, reason: collision with root package name */
        public static final String f13135s = "file_path";

        /* renamed from: t, reason: collision with root package name */
        public static final String f13136t = "part_count";

        /* renamed from: u, reason: collision with root package name */
        public static final String f13137u = "enable_part_download";

        /* renamed from: v, reason: collision with root package name */
        public static final String f13138v = "download_start_timestamp";

        /* renamed from: w, reason: collision with root package name */
        public static final String f13139w = "download_end_timestamp";

        /* renamed from: x, reason: collision with root package name */
        public static final String f13140x = "status";

        /* renamed from: y, reason: collision with root package name */
        public static final String f13141y = "is_upload_installed_agentevent";

        /* renamed from: z, reason: collision with root package name */
        public static final String f13142z = "placement_id";
    }

    private g(d dVar) {
        super(dVar);
    }

    public static g a(Context context) {
        if (f13103b == null) {
            synchronized (g.class) {
                try {
                    if (f13103b == null) {
                        f13103b = new g(e.a(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13103b;
    }

    private boolean c(ag agVar) {
        Cursor query = c().query(a.f13118a, new String[]{"unique_id"}, "unique_id = ?", new String[]{agVar.j()}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query == null) {
            return false;
        }
        query.close();
        return false;
    }

    public final synchronized void b(ag agVar) {
        if (agVar != null) {
            try {
                if (!TextUtils.isEmpty(agVar.j())) {
                    SQLiteDatabase d2 = d();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("unique_id", agVar.j());
                    contentValues.put(a.f13120c, agVar.k());
                    contentValues.put("request_id", agVar.l());
                    contentValues.put("offer_id", agVar.m());
                    contentValues.put(a.f13124g, agVar.o());
                    contentValues.put("url", agVar.n());
                    contentValues.put("title", agVar.p());
                    contentValues.put(a.i, agVar.q());
                    contentValues.put("icon_url", agVar.v());
                    contentValues.put("deeplink_url", agVar.w());
                    contentValues.put("file_path", agVar.g());
                    contentValues.put(a.f13126j, Integer.valueOf(agVar.C()));
                    contentValues.put(a.f13127k, Integer.valueOf(agVar.y()));
                    contentValues.put(a.f13128l, Integer.valueOf(agVar.r()));
                    contentValues.put(a.f13129m, Integer.valueOf(agVar.s()));
                    contentValues.put(a.f13130n, Integer.valueOf(agVar.t()));
                    contentValues.put(a.f13131o, Integer.valueOf(agVar.u()));
                    contentValues.put(a.f13134r, Integer.valueOf(agVar.z()));
                    contentValues.put(a.f13136t, Integer.valueOf(agVar.h()));
                    contentValues.put(a.f13137u, Integer.valueOf(agVar.i() ? 1 : 0));
                    contentValues.put(a.f13138v, Long.valueOf(agVar.A()));
                    contentValues.put(a.f13139w, Long.valueOf(agVar.B()));
                    contentValues.put("status", Integer.valueOf(agVar.D()));
                    contentValues.put(a.f13141y, Integer.valueOf(agVar.E()));
                    contentValues.put("placement_id", agVar.d());
                    contentValues.put("ad_source_id", agVar.e());
                    contentValues.put("network_firm_id", agVar.f());
                    contentValues.put(a.f13106C, Long.valueOf(agVar.F()));
                    contentValues.put("file_size", Long.valueOf(agVar.G()));
                    contentValues.put(a.f13108E, Integer.valueOf(agVar.H()));
                    contentValues.put(a.f13109F, Integer.valueOf(agVar.I()));
                    contentValues.put(a.f13110G, Long.valueOf(agVar.J()));
                    contentValues.put("app_name", agVar.K());
                    contentValues.put(a.f13112I, Integer.valueOf(agVar.a()));
                    contentValues.put(a.J, Integer.valueOf(agVar.b()));
                    contentValues.put(a.f13113K, agVar.c());
                    contentValues.put("dsp_id", agVar.c());
                    contentValues.put(a.f13115M, agVar.M());
                    contentValues.put(a.f13116N, agVar.N());
                    if (c(agVar)) {
                        d2.update(a.f13118a, contentValues, "unique_id = ?", new String[]{agVar.j()});
                    } else {
                        d2.insertOrThrow(a.f13118a, null, contentValues);
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public final synchronized void e() {
        try {
            d().delete(a.f13118a, "download_start_timestamp <= " + System.currentTimeMillis() + " - offer_cache_time", null);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final synchronized void a(ag agVar) {
        try {
            SQLiteDatabase d2 = d();
            if (c(agVar)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(a.f13106C, Long.valueOf(agVar.F()));
                d2.update(a.f13118a, contentValues, "unique_id = ?", new String[]{agVar.j()});
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final synchronized ag a(String str) {
        Cursor cursor;
        try {
            ag agVar = new ag();
            cursor = c().query(a.f13118a, null, "download_start_timestamp > " + System.currentTimeMillis() + " - offer_cache_time AND unique_id = '" + str + "'", null, null, null, a.f13138v);
            try {
                if (cursor.moveToFirst()) {
                    agVar = a(cursor);
                }
                cursor.close();
                return agVar;
            } catch (Throwable th) {
                th = th;
                try {
                    th.getMessage();
                    return null;
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r2 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<ag> a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = c().query(a.f13118a, null, "download_start_timestamp <= " + System.currentTimeMillis() + " - offer_cache_time", null, null, null, a.f13138v);
            while (cursor.moveToNext()) {
                arrayList.add(a(cursor));
            }
        } catch (Throwable th) {
            try {
                th.getMessage();
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }
        cursor.close();
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        if (r2 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<ag> a(List<Integer> list, int i) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("status IN (");
            for (int i4 = 0; i4 < list.size(); i4++) {
                sb.append(list.get(i4));
                if (i4 != list.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append(")");
            sb.append(" AND ");
            sb.append(a.f13138v);
            sb.append(" > ");
            sb.append(System.currentTimeMillis());
            sb.append(" - ");
            sb.append(a.f13110G);
            if (i > 0) {
                sb.append(" AND ");
                sb.append(a.f13108E);
                sb.append(" = ");
                sb.append(i);
            }
            cursor = c().query(a.f13118a, null, sb.toString(), null, null, null, a.f13138v);
            while (cursor.moveToNext()) {
                arrayList.add(a(cursor));
            }
        } catch (Throwable th) {
            try {
                th.getMessage();
            } finally {
            }
        }
        cursor.close();
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r2 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<ag> b() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = c().query(a.f13118a, null, "status = 5 AND is_upload_installed_agentevent != 1 AND download_end_timestamp >= " + (System.currentTimeMillis() - com.anythink.core.d.h.f17448f), null, null, null, a.f13138v);
            while (cursor.moveToNext()) {
                arrayList.add(a(cursor));
            }
        } catch (Throwable th) {
            try {
                th.getMessage();
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }
        cursor.close();
        return arrayList;
    }

    private synchronized ag b(List<Integer> list, int i) {
        Throwable th;
        Cursor cursor;
        Cursor query;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("status IN (");
            for (int i4 = 0; i4 < list.size(); i4++) {
                sb.append(list.get(i4));
                if (i4 != list.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append(")");
            sb.append(" AND ");
            sb.append(a.f13138v);
            sb.append(" > ");
            sb.append(System.currentTimeMillis());
            sb.append(" - ");
            sb.append(a.f13110G);
            query = c().query(a.f13118a, null, sb.toString(), null, null, null, a.f13138v, String.valueOf(i));
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        try {
        } catch (Throwable th3) {
            cursor = query;
            th = th3;
            try {
                th.getMessage();
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } finally {
            }
        }
        if (query.moveToFirst()) {
            ag a9 = a(query);
            query.close();
            return a9;
        }
        query.close();
        return null;
    }

    private static ag a(Cursor cursor) {
        ag agVar = new ag();
        try {
            agVar.f(cursor.getString(a(cursor, "unique_id")));
            agVar.g(cursor.getString(a(cursor, a.f13120c)));
            agVar.h(cursor.getString(a(cursor, "request_id")));
            agVar.i(cursor.getString(a(cursor, "offer_id")));
            agVar.j(cursor.getString(a(cursor, "url")));
            agVar.k(cursor.getString(a(cursor, a.f13124g)));
            agVar.l(cursor.getString(a(cursor, "title")));
            agVar.m(cursor.getString(a(cursor, a.i)));
            agVar.n(cursor.getString(a(cursor, "icon_url")));
            agVar.o(cursor.getString(a(cursor, "deeplink_url")));
            agVar.e(cursor.getString(a(cursor, "file_path")));
            agVar.b(cursor.getString(a(cursor, "placement_id")));
            agVar.c(cursor.getString(a(cursor, "ad_source_id")));
            agVar.d(cursor.getString(a(cursor, "network_firm_id")));
            agVar.p(cursor.getString(a(cursor, "app_name")));
            agVar.a(cursor.getString(a(cursor, a.f13113K)));
            agVar.q(cursor.getString(a(cursor, "dsp_id")));
            agVar.r(cursor.getString(a(cursor, a.f13115M)));
            agVar.s(cursor.getString(a(cursor, a.f13116N)));
            agVar.j(cursor.getInt(a(cursor, a.f13126j)));
            agVar.h(cursor.getInt(a(cursor, a.f13127k)));
            agVar.d(cursor.getInt(a(cursor, a.f13128l)));
            agVar.e(cursor.getInt(a(cursor, a.f13129m)));
            agVar.f(cursor.getInt(a(cursor, a.f13130n)));
            agVar.g(cursor.getInt(a(cursor, a.f13131o)));
            agVar.i(cursor.getInt(a(cursor, a.f13134r)));
            agVar.c(cursor.getInt(a(cursor, a.f13136t)));
            boolean z8 = true;
            if (cursor.getInt(a(cursor, a.f13137u)) != 1) {
                z8 = false;
            }
            agVar.a(z8);
            agVar.a(cursor.getLong(a(cursor, a.f13138v)));
            agVar.b(cursor.getLong(a(cursor, a.f13139w)));
            agVar.k(cursor.getInt(a(cursor, "status")));
            agVar.l(cursor.getInt(a(cursor, a.f13141y)));
            agVar.c(cursor.getLong(a(cursor, a.f13106C)));
            agVar.d(cursor.getLong(a(cursor, "file_size")));
            agVar.m(cursor.getInt(a(cursor, a.f13108E)));
            agVar.n(cursor.getInt(a(cursor, a.f13109F)));
            agVar.e(cursor.getLong(a(cursor, a.f13110G)));
            agVar.a(cursor.getInt(a(cursor, a.f13112I)));
            agVar.b(cursor.getInt(a(cursor, a.J)));
            return agVar;
        } catch (Throwable th) {
            th.getMessage();
            return agVar;
        }
    }

    public final synchronized void b(String str) {
        try {
            d().delete(a.f13118a, "unique_id = ?", new String[]{str});
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static int a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException("columnIndex must >= 0.");
    }
}
