package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.h.aq;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class k extends c<aq> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13018a = "com.anythink.core.common.e.k";

    /* renamed from: b, reason: collision with root package name */
    private static k f13019b;

    /* renamed from: c, reason: collision with root package name */
    private int f13020c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f13021a = "request_info";

        /* renamed from: b, reason: collision with root package name */
        public static final String f13022b = "id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f13023c = "req_type";

        /* renamed from: d, reason: collision with root package name */
        public static final String f13024d = "req_url";

        /* renamed from: e, reason: collision with root package name */
        public static final String f13025e = "req_head";

        /* renamed from: f, reason: collision with root package name */
        public static final String f13026f = "req_content";

        /* renamed from: g, reason: collision with root package name */
        public static final String f13027g = "time";

        /* renamed from: h, reason: collision with root package name */
        public static final String f13028h = "extra";
        public static final String i = "CREATE TABLE IF NOT EXISTS request_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, req_content TEXT, time INTEGER, extra TEXT )";
    }

    private k(d dVar) {
        super(dVar);
        this.f13020c = 1000;
    }

    public static k a(d dVar) {
        if (f13019b == null) {
            synchronized (k.class) {
                try {
                    if (f13019b == null) {
                        f13019b = new k(dVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13019b;
    }

    private synchronized void b() {
        try {
            if (d() == null) {
                return;
            }
            d().delete(a.f13021a, null, null);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x003c, code lost:
    
        if (r4 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized long a(aq aqVar) {
        Throwable th;
        Cursor cursor;
        if (d() == null) {
            return -1L;
        }
        Cursor cursor2 = null;
        try {
            cursor = c().query(a.f13021a, null, null, null, null, null, null);
        } catch (Exception unused) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (cursor.getCount() >= this.f13020c) {
                b();
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            if (cursor2 != null) {
                try {
                    cursor2.close();
                    throw th;
                } catch (Exception unused3) {
                    throw th;
                }
            }
            throw th;
        }
        try {
            cursor.close();
        } catch (Exception unused4) {
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", aqVar.f13538a);
            contentValues.put("req_type", Integer.valueOf(aqVar.f13539b));
            contentValues.put("req_url", aqVar.f13541d);
            contentValues.put("req_head", aqVar.f13540c);
            contentValues.put(a.f13026f, aqVar.f13542e);
            contentValues.put("time", Long.valueOf(aqVar.f13543f));
            contentValues.put("extra", aqVar.f13544g);
            return d().insert(a.f13021a, null, contentValues);
        } catch (Exception unused5) {
            return -1L;
        }
    }

    public final synchronized int b(aq aqVar) {
        if (d() == null || aqVar == null) {
            return -1;
        }
        try {
            return d().delete(a.f13021a, "id=?", new String[]{aqVar.f13538a});
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (r1 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<aq> a() {
        Cursor cursor;
        try {
            cursor = c().query(a.f13021a, null, null, null, null, null, "time", "10");
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        ArrayList arrayList = new ArrayList();
                        while (cursor.moveToNext()) {
                            aq aqVar = new aq();
                            aqVar.f13538a = cursor.getString(cursor.getColumnIndex("id"));
                            aqVar.f13539b = cursor.getInt(cursor.getColumnIndex("req_type"));
                            aqVar.f13541d = cursor.getString(cursor.getColumnIndex("req_url"));
                            aqVar.f13540c = cursor.getString(cursor.getColumnIndex("req_head"));
                            aqVar.f13542e = cursor.getString(cursor.getColumnIndex(a.f13026f));
                            aqVar.f13543f = cursor.getLong(cursor.getColumnIndex("time"));
                            aqVar.f13544g = cursor.getString(cursor.getColumnIndex("extra"));
                            arrayList.add(aqVar);
                        }
                        cursor.close();
                        cursor.close();
                        return arrayList;
                    }
                } catch (Exception unused) {
                    if (cursor != null) {
                        cursor.close();
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
            }
            return null;
        } catch (Exception unused4) {
            cursor = null;
        } catch (OutOfMemoryError unused5) {
            cursor = null;
        } catch (Throwable unused6) {
            cursor = null;
        }
    }
}
