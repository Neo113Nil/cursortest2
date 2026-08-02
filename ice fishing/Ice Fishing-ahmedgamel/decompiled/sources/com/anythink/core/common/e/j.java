package com.anythink.core.common.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.anythink.core.common.h.al;
import com.anythink.core.common.h.am;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class j extends c<al> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13791a = "j";

    /* renamed from: b, reason: collision with root package name */
    private static volatile j f13792b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        static final String f13793a = "dyn_wf_ad_source_filter";

        /* renamed from: b, reason: collision with root package name */
        static final String f13794b = "placement_id";

        /* renamed from: c, reason: collision with root package name */
        static final String f13795c = "ad_source_id";

        /* renamed from: d, reason: collision with root package name */
        static final String f13796d = "request_id";

        /* renamed from: e, reason: collision with root package name */
        static final String f13797e = "expired_timestamp";

        /* renamed from: f, reason: collision with root package name */
        static final String f13798f = "match_error_code";

        /* renamed from: g, reason: collision with root package name */
        public static final String f13799g = "CREATE TABLE IF NOT EXISTS dyn_wf_ad_source_filter(placement_id TEXT ,ad_source_id TEXT ,request_id TEXT ,match_error_code TEXT ,expired_timestamp INTEGER)";

        /* renamed from: h, reason: collision with root package name */
        public static final String f13800h = "CREATE INDEX IF NOT EXISTS idx_placement_id ON dyn_wf_ad_source_filter(placement_id)";
        public static final String i = "CREATE INDEX IF NOT EXISTS idx_ad_source_id ON dyn_wf_ad_source_filter(ad_source_id)";

        /* renamed from: j, reason: collision with root package name */
        public static final String f13801j = "CREATE INDEX IF NOT EXISTS idx_ad_request_id ON dyn_wf_ad_source_filter(request_id)";

        /* renamed from: k, reason: collision with root package name */
        public static final String f13802k = "CREATE INDEX IF NOT EXISTS idx_expired_timestamp ON dyn_wf_ad_source_filter(expired_timestamp)";

        /* renamed from: l, reason: collision with root package name */
        public static final String f13803l = "CREATE INDEX IF NOT EXISTS idx_match_error_code ON dyn_wf_ad_source_filter(match_error_code)";
    }

    private j(d dVar) {
        super(dVar);
    }

    public static j a(Context context) {
        if (f13792b == null) {
            synchronized (j.class) {
                try {
                    if (f13792b == null) {
                        f13792b = new j(e.a(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13792b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r2 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Map<String, Integer> c(String str) {
        HashMap hashMap = new HashMap();
        Cursor cursor = null;
        try {
            String[] strArr = {str, String.valueOf(System.currentTimeMillis())};
            cursor = c().query("dyn_wf_ad_source_filter", new String[]{"ad_source_id", "count(request_id)"}, "placement_id = ? AND expired_timestamp >= ?", strArr, "ad_source_id", null, null);
            while (cursor.moveToNext()) {
                hashMap.put(cursor.getString(a(cursor, "ad_source_id")), Integer.valueOf(cursor.getInt(1)));
            }
        } catch (Throwable th) {
            try {
                th.getMessage();
            } finally {
            }
        }
        cursor.close();
        hashMap.size();
        return hashMap;
    }

    public final synchronized void b(String str) {
        try {
            d().delete("dyn_wf_ad_source_filter", "placement_id = ? AND expired_timestamp < ?", new String[]{str, String.valueOf(System.currentTimeMillis())});
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private boolean b(al alVar) {
        Cursor query = c().query("dyn_wf_ad_source_filter", new String[]{"request_id"}, "request_id = ? AND ad_source_id = ?", new String[]{alVar.g(), alVar.a()}, null, null, null);
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

    public final synchronized void a(al alVar) {
        if (alVar == null) {
            return;
        }
        try {
            SQLiteDatabase d9 = d();
            ContentValues contentValues = new ContentValues();
            contentValues.put("placement_id", alVar.b());
            contentValues.put("ad_source_id", alVar.a());
            contentValues.put("request_id", alVar.g());
            contentValues.put("match_error_code", alVar.h());
            contentValues.put("expired_timestamp", Long.valueOf(alVar.f()));
            Cursor query = c().query("dyn_wf_ad_source_filter", new String[]{"request_id"}, "request_id = ? AND ad_source_id = ?", new String[]{alVar.g(), alVar.a()}, null, null, null);
            if (query != null && query.getCount() > 0) {
                query.close();
                d9.update("dyn_wf_ad_source_filter", contentValues, "request_id = ? AND ad_source_id = ?", new String[]{alVar.g(), alVar.a()});
            } else {
                if (query != null) {
                    query.close();
                }
                d9.insertOrThrow("dyn_wf_ad_source_filter", null, contentValues);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r2 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized am a(String str) {
        am amVar;
        amVar = new am(str);
        Cursor cursor = null;
        try {
            String[] strArr = {str, "", String.valueOf(System.currentTimeMillis())};
            cursor = c().query("dyn_wf_ad_source_filter", new String[]{"ad_source_id", "match_error_code", "count(request_id)"}, "placement_id = ? AND match_error_code IS NOT NULL AND match_error_code != ? AND expired_timestamp >= ?", strArr, "ad_source_id,match_error_code", null, "ad_source_id");
            HashMap hashMap = new HashMap();
            while (cursor.moveToNext()) {
                String string = cursor.getString(a(cursor, "ad_source_id"));
                String string2 = cursor.getString(a(cursor, "match_error_code"));
                int i = cursor.getInt(2);
                List list = (List) hashMap.get(string);
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(new am.a(string2, i));
                hashMap.put(string, list);
            }
            hashMap.size();
            amVar.a(hashMap);
        } catch (Throwable th) {
            try {
                th.getMessage();
            } finally {
            }
        }
        cursor.close();
        amVar.b(c(str));
        return amVar;
    }

    private static int a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException("columnIndex must >= 0.");
    }
}
