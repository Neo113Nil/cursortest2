package com.anythink.core.c.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.anythink.core.common.d.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e extends com.anythink.core.common.e.c<com.anythink.core.c.a.a> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12844a = "PlacementStatisticsDao";

    /* renamed from: b, reason: collision with root package name */
    private static final int f12845b = 50;

    /* renamed from: c, reason: collision with root package name */
    private static volatile e f12846c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f12847a = "user_value_placement";

        /* renamed from: b, reason: collision with root package name */
        public static final String f12848b = "type";

        /* renamed from: c, reason: collision with root package name */
        public static final String f12849c = "placement_id";

        /* renamed from: d, reason: collision with root package name */
        public static final String f12850d = "request_id";

        /* renamed from: e, reason: collision with root package name */
        public static final String f12851e = "network_firm_id";

        /* renamed from: f, reason: collision with root package name */
        public static final String f12852f = "ad_source_id";

        /* renamed from: g, reason: collision with root package name */
        public static final String f12853g = "dsp_id";

        /* renamed from: h, reason: collision with root package name */
        public static final String f12854h = "price";
        public static final String i = "record_time";

        /* renamed from: j, reason: collision with root package name */
        public static final String f12855j = "ps_id";

        /* renamed from: k, reason: collision with root package name */
        public static final String f12856k = "segment_id";

        /* renamed from: l, reason: collision with root package name */
        public static final String f12857l = "CREATE TABLE IF NOT EXISTS user_value_placement(type INTEGER, placement_id TEXT, request_id TEXT, network_firm_id INTEGER, ad_source_id TEXT, dsp_id TEXT, price DOUBLE, record_time INTEGER, ps_id TEXT )";

        /* renamed from: m, reason: collision with root package name */
        public static final String f12858m = "ALTER TABLE user_value_placement ADD COLUMN segment_id INTEGER";

        /* renamed from: n, reason: collision with root package name */
        public static final String f12859n = "CREATE INDEX placement_id ON user_value_placement (placement_id)";
    }

    private e(com.anythink.core.common.e.d dVar) {
        super(dVar);
    }

    public static e a() {
        if (f12846c == null) {
            synchronized (e.class) {
                try {
                    if (f12846c == null) {
                        f12846c = new e(com.anythink.core.common.e.e.a(t.b().g()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12846c;
    }

    public final synchronized void a(com.anythink.core.c.a.a aVar) {
        int k9 = aVar.k();
        Cursor cursor = null;
        try {
            try {
                String j6 = aVar.j();
                String b9 = aVar.b();
                SQLiteDatabase d9 = d();
                ContentValues contentValues = new ContentValues();
                contentValues.put("type", Integer.valueOf(k9));
                contentValues.put("placement_id", j6);
                contentValues.put("request_id", b9);
                contentValues.put("ad_source_id", aVar.d());
                contentValues.put("network_firm_id", Integer.valueOf(aVar.c()));
                contentValues.put("dsp_id", aVar.e());
                contentValues.put(a.f12854h, Double.valueOf(aVar.f()));
                contentValues.put(a.i, Long.valueOf(aVar.g()));
                contentValues.put("ps_id", aVar.h());
                contentValues.put("segment_id", Integer.valueOf(aVar.a()));
                Cursor query = c().query(a.f12847a, new String[]{"placement_id", "request_id"}, "placement_id=? AND request_id=? AND type=?", new String[]{j6, b9, String.valueOf(k9)}, null, null, null);
                if (query != null && query.getCount() > 0) {
                    query.close();
                    d().update(a.f12847a, contentValues, "placement_id = ? AND request_id = ? AND type = ?", new String[]{j6, b9, String.valueOf(k9)});
                    return;
                }
                if (query != null) {
                    query.close();
                }
                Cursor query2 = d9.query(a.f12847a, new String[]{a.i}, "type = ? AND placement_id = ?", new String[]{String.valueOf(k9), j6}, null, null, "record_time ASC");
                try {
                    if (query2.getCount() > 50) {
                        long j9 = query2.moveToNext() ? query2.getLong(query2.getColumnIndexOrThrow(a.i)) : 0L;
                        if (j9 != 0) {
                            d9.delete(a.f12847a, "record_time = ?", new String[]{String.valueOf(j9)});
                        }
                    }
                    d9.insertOrThrow(a.f12847a, null, contentValues);
                    Thread.currentThread().getName();
                    query2.close();
                } catch (Exception e9) {
                    e = e9;
                    cursor = query2;
                    e.getMessage();
                    Thread.currentThread().getName();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean a(String str, String str2, int i) {
        Cursor query = c().query(a.f12847a, new String[]{"placement_id", "request_id"}, "placement_id=? AND request_id=? AND type=?", new String[]{str, str2, String.valueOf(i)}, null, null, null);
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

    public final synchronized List<com.anythink.core.c.a.a> a(String str, int i, long j6, int i4) {
        ArrayList arrayList;
        String[] strArr;
        String str2;
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                if (i == -1) {
                    strArr = new String[]{str, String.valueOf(j6), "0"};
                    str2 = "placement_id = ? AND record_time > ? AND price > ?";
                } else {
                    strArr = new String[]{str, String.valueOf(i), String.valueOf(j6), "0"};
                    str2 = "placement_id = ? AND segment_id = ? AND record_time > ? AND price > ?";
                }
                cursor = c().query(a.f12847a, null, str2, strArr, null, null, null, String.valueOf(i4));
                while (cursor.moveToNext()) {
                    arrayList.add(a(cursor));
                    Thread.currentThread().getName();
                }
                cursor.close();
            } catch (Exception e9) {
                e9.getMessage();
                Thread.currentThread().getName();
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[Catch: all -> 0x0048, TRY_ENTER, TryCatch #2 {, blocks: (B:12:0x0043, B:28:0x0064, B:29:0x0067, B:21:0x005d), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[Catch: all -> 0x0048, SYNTHETIC, TryCatch #2 {, blocks: (B:12:0x0043, B:28:0x0064, B:29:0x0067, B:21:0x005d), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<com.anythink.core.c.a.a> a(int i, String str, int i4) {
        Throwable th;
        Exception exc;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                ArrayList arrayList = new ArrayList();
                cursor = c().query(a.f12847a, null, "type = ? AND placement_id = ?", new String[]{String.valueOf(i), str}, null, null, "record_time DESC", String.valueOf(i4));
                while (cursor.moveToNext()) {
                    try {
                        arrayList.add(a(cursor));
                    } catch (Exception e9) {
                        exc = e9;
                        exc.getMessage();
                        Thread.currentThread().getName();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                }
                arrayList.size();
                Thread.currentThread().getId();
                cursor.close();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = i;
                if (cursor2 == null) {
                    cursor2.close();
                    throw th;
                }
                throw th;
            }
        } catch (Exception e10) {
            exc = e10;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 == null) {
            }
        }
    }

    private static com.anythink.core.c.a.a a(Cursor cursor) {
        com.anythink.core.c.a.a aVar = new com.anythink.core.c.a.a();
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("type"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("placement_id"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("request_id"));
        int i4 = cursor.getInt(cursor.getColumnIndexOrThrow("network_firm_id"));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("ad_source_id"));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("dsp_id"));
        double d9 = cursor.getDouble(cursor.getColumnIndexOrThrow(a.f12854h));
        long j6 = cursor.getLong(cursor.getColumnIndexOrThrow(a.i));
        String string5 = cursor.getString(cursor.getColumnIndexOrThrow("ps_id"));
        int i6 = cursor.getInt(cursor.getColumnIndexOrThrow("segment_id"));
        aVar.c(i);
        aVar.e(string);
        aVar.a(string2);
        aVar.b(i4);
        aVar.b(string3);
        aVar.c(string4);
        aVar.a(d9);
        aVar.a(j6);
        aVar.d(string5);
        aVar.a(i6);
        return aVar;
    }

    public final synchronized void a(String str) {
        try {
            d().delete(a.f12847a, "placement_id = ?", new String[]{str});
        } catch (Exception e9) {
            e9.getMessage();
            Thread.currentThread().getName();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r2 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized double[] a(String[] strArr, String str) {
        double[] dArr;
        dArr = new double[2];
        Cursor cursor = null;
        try {
            try {
                cursor = c().query(str, strArr, null, null, null, null, null, null);
                if (cursor.moveToNext()) {
                    dArr[0] = cursor.getDouble(0);
                    dArr[1] = cursor.getInt(1);
                }
            } catch (Exception e9) {
                e9.getMessage();
                Thread.currentThread().getName();
            }
            cursor.close();
        } finally {
        }
        return dArr;
    }
}
