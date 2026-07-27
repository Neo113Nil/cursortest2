package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes.dex */
public class b extends c<com.anythink.core.common.a.l> {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f12923b;

    /* renamed from: a, reason: collision with root package name */
    private final String f12924a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f12925a = "adx_offer_tracking";

        /* renamed from: b, reason: collision with root package name */
        public static final String f12926b = "placement_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f12927c = "dsp_id";

        /* renamed from: d, reason: collision with root package name */
        public static final String f12928d = "offer_id";

        /* renamed from: e, reason: collision with root package name */
        public static final String f12929e = "tk_type";

        /* renamed from: f, reason: collision with root package name */
        public static final String f12930f = "extra_info";

        /* renamed from: g, reason: collision with root package name */
        public static final String f12931g = "create_time";

        /* renamed from: h, reason: collision with root package name */
        public static final String f12932h = "CREATE TABLE IF NOT EXISTS adx_offer_tracking(placement_id TEXT ,dsp_id TEXT ,offer_id TEXT ,tk_type INTEGER ,extra_info TEXT ,create_time INTEGER)";
    }

    private b(d dVar) {
        super(dVar);
        this.f12924a = b.class.getName();
    }

    public static b a(d dVar) {
        if (f12923b == null) {
            synchronized (b.class) {
                try {
                    if (f12923b == null) {
                        f12923b = new b(dVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12923b;
    }

    private static long e() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar.getTimeInMillis();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public final void b() {
        try {
            String str = "create_time < " + e();
            if (d() == null) {
                return;
            }
            d().delete(a.f12925a, str, null);
        } catch (Exception unused) {
        }
    }

    public final synchronized long a(com.anythink.core.common.a.g gVar) {
        if (d() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("placement_id", gVar.a());
            contentValues.put("dsp_id", gVar.b());
            contentValues.put("offer_id", gVar.c());
            contentValues.put(a.f12929e, Integer.valueOf(gVar.d()));
            contentValues.put(a.f12930f, gVar.e());
            contentValues.put("create_time", Long.valueOf(System.currentTimeMillis()));
            gVar.b();
            gVar.c();
            return d().insert(a.f12925a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r1 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<com.anythink.core.common.a.g> a() {
        Cursor cursor;
        try {
            cursor = c().query(a.f12925a, null, "create_time >= ? ", new String[]{String.valueOf(e())}, null, null, null);
            try {
                List<com.anythink.core.common.a.g> a9 = a(cursor);
                cursor.close();
                a9.size();
                cursor.close();
                return a9;
            } catch (Exception unused) {
                if (cursor != null) {
                }
                return null;
            } catch (OutOfMemoryError unused2) {
                try {
                    System.gc();
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Exception unused4) {
            cursor = null;
        } catch (OutOfMemoryError unused5) {
            cursor = null;
        } catch (Throwable unused6) {
            cursor = null;
        }
    }

    private synchronized List<com.anythink.core.common.a.g> a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    try {
                        com.anythink.core.common.a.g gVar = new com.anythink.core.common.a.g();
                        int columnIndex = cursor.getColumnIndex("placement_id");
                        if (columnIndex >= 0) {
                            gVar.a(cursor.getString(columnIndex));
                        }
                        int columnIndex2 = cursor.getColumnIndex("dsp_id");
                        if (columnIndex2 >= 0) {
                            gVar.b(cursor.getString(columnIndex2));
                        }
                        int columnIndex3 = cursor.getColumnIndex("offer_id");
                        if (columnIndex3 >= 0) {
                            gVar.c(cursor.getString(columnIndex3));
                        }
                        int columnIndex4 = cursor.getColumnIndex(a.f12929e);
                        if (columnIndex4 >= 0) {
                            gVar.a(cursor.getInt(columnIndex4));
                        }
                        int columnIndex5 = cursor.getColumnIndex(a.f12930f);
                        if (columnIndex5 >= 0) {
                            gVar.d(cursor.getString(columnIndex5));
                        }
                        arrayList.add(gVar);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return arrayList;
    }
}
