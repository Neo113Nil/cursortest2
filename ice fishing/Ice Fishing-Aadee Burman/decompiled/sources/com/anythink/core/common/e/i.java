package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i extends c<com.anythink.core.common.a.l> {

    /* renamed from: c, reason: collision with root package name */
    private static volatile i f12994c;

    /* renamed from: a, reason: collision with root package name */
    private final String f12995a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12996b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f12997a = "dsp_offer_show_record";

        /* renamed from: b, reason: collision with root package name */
        public static final String f12998b = "dsp_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f12999c = "dsp_offer_id";

        /* renamed from: d, reason: collision with root package name */
        public static final String f13000d = "show_limit";

        /* renamed from: e, reason: collision with root package name */
        public static final String f13001e = "show_count";

        /* renamed from: f, reason: collision with root package name */
        public static final String f13002f = "create_time";

        /* renamed from: g, reason: collision with root package name */
        public static final String f13003g = "last_update_time";

        /* renamed from: h, reason: collision with root package name */
        public static final String f13004h = "CREATE TABLE IF NOT EXISTS dsp_offer_show_record(dsp_id TEXT ,dsp_offer_id TEXT ,show_limit INTEGER ,show_count INTEGER ,create_time INTEGER ,last_update_time INTEGER)";
    }

    private i(d dVar) {
        super(dVar);
        this.f12995a = i.class.getName();
        this.f12996b = 86400000L;
    }

    public static i a(d dVar) {
        if (f12994c == null) {
            synchronized (i.class) {
                try {
                    if (f12994c == null) {
                        f12994c = new i(dVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12994c;
    }

    public final synchronized long b(com.anythink.core.common.a.l lVar) {
        if (d() == null) {
            return -1L;
        }
        if (lVar.c() <= 0) {
            return -1L;
        }
        com.anythink.core.common.a.l a9 = a(lVar.a(), lVar.b());
        if (a9 != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dsp_id", lVar.a());
                contentValues.put("dsp_offer_id", lVar.b());
                contentValues.put(a.f13000d, Integer.valueOf(lVar.c()));
                contentValues.put("show_count", Integer.valueOf(a9.d() + 1));
                contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                lVar.a();
                lVar.b();
                a9.d();
                lVar.c();
                return d().update(a.f12997a, contentValues, "dsp_id = ? and dsp_offer_id = ? ", new String[]{lVar.a(), lVar.b()});
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final synchronized long a(com.anythink.core.common.a.l lVar) {
        if (d() == null) {
            return -1L;
        }
        if (lVar.c() <= 0) {
            return -1L;
        }
        if (a(lVar.a(), lVar.b()) == null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("dsp_id", lVar.a());
            contentValues.put("dsp_offer_id", lVar.b());
            contentValues.put(a.f13000d, Integer.valueOf(lVar.c()));
            contentValues.put("show_count", (Integer) 0);
            contentValues.put("create_time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
            lVar.a();
            lVar.b();
            return d().insert(a.f12997a, null, contentValues);
        }
        lVar.a();
        lVar.b();
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r10 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0037, code lost:
    
        if (r10 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized com.anythink.core.common.a.l a(String str, String str2) {
        Cursor cursor;
        try {
            cursor = c().query(a.f12997a, null, "dsp_id = ?  AND dsp_offer_id = ? ", new String[]{str, str2}, null, null, null);
            try {
                List<com.anythink.core.common.a.l> a9 = a(cursor);
                cursor.close();
                if (a9.size() > 0) {
                    com.anythink.core.common.a.l lVar = a9.get(0);
                    cursor.close();
                    return lVar;
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
        cursor.close();
        return null;
    }

    private synchronized List<com.anythink.core.common.a.l> a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    try {
                        com.anythink.core.common.a.l lVar = new com.anythink.core.common.a.l();
                        lVar.a(cursor.getString(cursor.getColumnIndex("dsp_id")));
                        lVar.b(cursor.getString(cursor.getColumnIndex("dsp_offer_id")));
                        lVar.a(cursor.getInt(cursor.getColumnIndex(a.f13000d)));
                        lVar.b(cursor.getInt(cursor.getColumnIndex("show_count")));
                        arrayList.add(lVar);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
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
                cursor = c().query(a.f12997a, null, "show_count > show_limit", null, null, null, "last_update_time DESC", String.valueOf(i));
                List<com.anythink.core.common.a.l> a9 = a(cursor);
                a9.size();
                cursor.close();
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

    public final void a() {
        try {
            String str = "create_time < " + (System.currentTimeMillis() - 86400000);
            if (d() == null) {
                return;
            }
            d().delete(a.f12997a, str, null);
        } catch (Exception unused) {
        }
    }
}
