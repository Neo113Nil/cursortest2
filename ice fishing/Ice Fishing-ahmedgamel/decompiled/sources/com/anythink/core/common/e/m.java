package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.h.bd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class m extends c<m> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13041a = "com.anythink.core.common.e.m";

    /* renamed from: b, reason: collision with root package name */
    private static m f13042b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List<bd> f13043a;

        /* renamed from: b, reason: collision with root package name */
        public Map<String, bd> f13044b;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final String f13045a = "notice_url_fail_info";

        /* renamed from: b, reason: collision with root package name */
        public static final String f13046b = "id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f13047c = "req_type";

        /* renamed from: d, reason: collision with root package name */
        public static final String f13048d = "req_url";

        /* renamed from: e, reason: collision with root package name */
        public static final String f13049e = "req_head";

        /* renamed from: f, reason: collision with root package name */
        public static final String f13050f = "first_fail_time";

        /* renamed from: g, reason: collision with root package name */
        public static final String f13051g = "offer_out_date_time";

        /* renamed from: h, reason: collision with root package name */
        public static final String f13052h = "retry_count";
        public static final String i = "CREATE TABLE IF NOT EXISTS notice_url_fail_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, first_fail_time INTEGER, offer_out_date_time INTEGER, retry_count INTEGER )";
    }

    private m(d dVar) {
        super(dVar);
    }

    public static m a(d dVar) {
        if (f13042b == null) {
            synchronized (m.class) {
                try {
                    if (f13042b == null) {
                        f13042b = new m(dVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13042b;
    }

    private synchronized void b() {
        try {
            if (d() == null) {
                return;
            }
            d().delete(b.f13045a, null, null);
        } catch (Exception unused) {
        }
    }

    public final synchronized long a(bd bdVar) {
        if (d() == null || bdVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", bdVar.f13615a);
            contentValues.put("req_type", Integer.valueOf(bdVar.f13616b));
            contentValues.put("req_url", bdVar.f13618d);
            contentValues.put("req_head", bdVar.f13617c);
            contentValues.put(b.f13050f, Long.valueOf(bdVar.f13619e));
            contentValues.put(b.f13051g, Long.valueOf(bdVar.f13620f));
            contentValues.put("retry_count", Integer.valueOf(bdVar.f13621g));
            if (a(bdVar.f13615a)) {
                return d().update(b.f13045a, contentValues, "id = ? ", new String[]{bdVar.f13615a});
            }
            return d().insert(b.f13045a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final synchronized int b(bd bdVar) {
        if (d() == null || bdVar == null) {
            return -1;
        }
        try {
            return d().delete(b.f13045a, "id=?", new String[]{bdVar.f13615a});
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean a(String str) {
        Cursor cursor;
        try {
            cursor = c().query(b.f13045a, new String[]{"id"}, "id=?", new String[]{str}, "id", null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        cursor.close();
                        cursor.close();
                        return true;
                    }
                } catch (Throwable unused) {
                    if (cursor == null) {
                        return false;
                    }
                    cursor.close();
                    return false;
                }
            }
            if (cursor == null) {
                return false;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        cursor.close();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ed, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        if (r2 != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized a a() {
        a aVar = new a();
        List<bd> synchronizedList = Collections.synchronizedList(new ArrayList(8));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(8);
        aVar.f13043a = synchronizedList;
        aVar.f13044b = concurrentHashMap;
        Cursor cursor = null;
        try {
            try {
                cursor = c().query(b.f13045a, null, null, null, null, null, b.f13050f);
                if (cursor != null && cursor.getCount() > 0) {
                    ArrayList arrayList = new ArrayList(4);
                    while (cursor.moveToNext()) {
                        bd bdVar = new bd();
                        bdVar.f13615a = cursor.getString(cursor.getColumnIndex("id"));
                        bdVar.f13616b = cursor.getInt(cursor.getColumnIndex("req_type"));
                        bdVar.f13618d = cursor.getString(cursor.getColumnIndex("req_url"));
                        bdVar.f13617c = cursor.getString(cursor.getColumnIndex("req_head"));
                        bdVar.f13619e = cursor.getLong(cursor.getColumnIndex(b.f13050f));
                        bdVar.f13620f = cursor.getLong(cursor.getColumnIndex(b.f13051g));
                        bdVar.f13621g = cursor.getInt(cursor.getColumnIndex("retry_count"));
                        if (System.currentTimeMillis() < bdVar.f13620f) {
                            synchronizedList.add(bdVar);
                            concurrentHashMap.put(bdVar.f13615a, bdVar);
                        } else {
                            arrayList.add(bdVar);
                        }
                    }
                    cursor.close();
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            bd bdVar2 = (bd) it.next();
                            bdVar2.a();
                            b(bdVar2);
                        }
                    }
                    cursor.close();
                    return aVar;
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            System.gc();
        } catch (Throwable unused3) {
        }
    }
}
