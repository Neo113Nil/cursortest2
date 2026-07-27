package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h extends c<com.anythink.core.common.a.k> {

    /* renamed from: b, reason: collision with root package name */
    private static volatile h f13143b;

    /* renamed from: a, reason: collision with root package name */
    private final String f13144a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f13145a = "dsp_offer_install_record";

        /* renamed from: b, reason: collision with root package name */
        public static final String f13146b = "dsp_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f13147c = "dsp_offer_id";

        /* renamed from: d, reason: collision with root package name */
        public static final String f13148d = "package_name";

        /* renamed from: e, reason: collision with root package name */
        public static final String f13149e = "last_update_time";

        /* renamed from: f, reason: collision with root package name */
        public static final String f13150f = "CREATE TABLE IF NOT EXISTS dsp_offer_install_record(dsp_id TEXT ,dsp_offer_id TEXT ,package_name TEXT ,last_update_time INTEGER)";
    }

    private h(d dVar) {
        super(dVar);
        this.f13144a = h.class.getName();
    }

    public static h a(d dVar) {
        if (f13143b == null) {
            synchronized (h.class) {
                try {
                    if (f13143b == null) {
                        f13143b = new h(dVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13143b;
    }

    public final synchronized long a(com.anythink.core.common.a.k kVar) {
        if (d() == null) {
            return -1L;
        }
        if (!a(kVar.a(), kVar.b())) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dsp_id", kVar.a());
                contentValues.put("dsp_offer_id", kVar.b());
                contentValues.put("package_name", kVar.c());
                contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                kVar.a();
                kVar.b();
                kVar.c();
                return d().insert(a.f13145a, null, contentValues);
            } catch (Exception unused) {
            }
        } else {
            kVar.a();
            kVar.b();
            kVar.c();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0032, code lost:
    
        if (r0 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean a(String str, String str2) {
        Cursor cursor = null;
        try {
            cursor = c().query(a.f13145a, null, "dsp_id = ?  AND dsp_offer_id = ? ", new String[]{str, str2}, null, null, null);
            if (cursor != null && cursor.getCount() > 0) {
                cursor.close();
                cursor.close();
                return true;
            }
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (OutOfMemoryError unused2) {
            Cursor cursor2 = cursor;
            try {
                System.gc();
                if (cursor2 != null) {
                    cursor2.close();
                }
                return false;
            } finally {
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<com.anythink.core.common.a.j> a(int i) {
        ArrayList arrayList = new ArrayList();
        if (i <= 0) {
            return arrayList;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = c().query(a.f13145a, null, null, null, null, null, "last_update_time DESC", String.valueOf(i));
                List<com.anythink.core.common.a.k> a9 = a(cursor);
                cursor.close();
                a9.size();
                arrayList.addAll(a9);
            } finally {
            }
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            System.gc();
        } catch (Throwable unused3) {
        }
        cursor.close();
        return arrayList;
    }

    private synchronized List<com.anythink.core.common.a.k> a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    try {
                        com.anythink.core.common.a.k kVar = new com.anythink.core.common.a.k();
                        kVar.a(cursor.getString(cursor.getColumnIndex("dsp_id")));
                        kVar.b(cursor.getString(cursor.getColumnIndex("dsp_offer_id")));
                        kVar.c(cursor.getString(cursor.getColumnIndex("package_name")));
                        arrayList.add(kVar);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return arrayList;
    }
}
