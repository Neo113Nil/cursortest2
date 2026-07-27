package com.anythink.basead.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f6061a;

    /* renamed from: b, reason: collision with root package name */
    private Context f6062b;

    /* renamed from: com.anythink.basead.c.a$a, reason: collision with other inner class name */
    public static class C0012a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f6063a = "my_offer_cap_pacing";

        /* renamed from: b, reason: collision with root package name */
        public static final String f6064b = "offer_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f6065c = "offer_cap";

        /* renamed from: d, reason: collision with root package name */
        public static final String f6066d = "offer_pacing";

        /* renamed from: e, reason: collision with root package name */
        public static final String f6067e = "show_num";

        /* renamed from: f, reason: collision with root package name */
        public static final String f6068f = "show_time";

        /* renamed from: g, reason: collision with root package name */
        public static final String f6069g = "record_date";

        /* renamed from: h, reason: collision with root package name */
        public static final String f6070h = "CREATE TABLE IF NOT EXISTS my_offer_cap_pacing (offer_id TEXT,offer_cap INTEGER,offer_pacing INTEGER,show_num INTEGER,show_time INTEGER,record_date INTEGER )";
    }

    private a(Context context) {
        this.f6062b = context;
    }

    public static a a(Context context) {
        if (f6061a == null) {
            f6061a = new a(context);
        }
        return f6061a;
    }

    private synchronized boolean d(String str) {
        Cursor query = c.a(this.f6062b).getReadableDatabase().query(C0012a.f6063a, new String[]{"offer_id"}, "offer_id = ?", new String[]{str}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r11 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004b, code lost:
    
        if (r11 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<com.anythink.basead.d.c> b(String str) {
        Cursor cursor;
        try {
            cursor = c.a(this.f6062b).getReadableDatabase().query(C0012a.f6063a, null, "offer_cap <= show_num AND record_date = ? AND offer_cap  >= ?", new String[]{str, "0"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        ArrayList arrayList = new ArrayList();
                        while (cursor.moveToNext()) {
                            arrayList.add(a(cursor));
                        }
                        cursor.close();
                        cursor.close();
                        return arrayList;
                    }
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
            }
        } catch (Exception unused4) {
            cursor = null;
        } catch (OutOfMemoryError unused5) {
            cursor = null;
        } catch (Throwable unused6) {
            cursor = null;
        }
    }

    public final synchronized void c(String str) {
        String str2;
        synchronized (this) {
            try {
                str2 = "record_date != '" + str + "'";
            } catch (Exception unused) {
            }
            if (c.a(this.f6062b).getWritableDatabase() == null) {
                return;
            }
            c.a(this.f6062b).getWritableDatabase().delete(C0012a.f6063a, str2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r11 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        if (r11 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized com.anythink.basead.d.c a(String str) {
        Cursor cursor;
        try {
            cursor = c.a(this.f6062b).getReadableDatabase().query(C0012a.f6063a, null, "offer_id = ?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        cursor.moveToNext();
                        com.anythink.basead.d.c a9 = a(cursor);
                        cursor.close();
                        cursor.close();
                        return a9;
                    }
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
            }
        } catch (Exception unused4) {
            cursor = null;
        } catch (OutOfMemoryError unused5) {
            cursor = null;
        } catch (Throwable unused6) {
            cursor = null;
        }
    }

    public final synchronized long a(com.anythink.basead.d.c cVar) {
        synchronized (this) {
            if (cVar == null) {
                return 0L;
            }
            try {
                if (c.a(this.f6062b).getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("offer_id", cVar.f6133a);
                contentValues.put(C0012a.f6067e, Integer.valueOf(cVar.f6136d));
                contentValues.put("show_time", Long.valueOf(cVar.f6137e));
                contentValues.put(C0012a.f6069g, cVar.f6138f);
                contentValues.put(C0012a.f6065c, Integer.valueOf(cVar.f6134b));
                contentValues.put(C0012a.f6066d, Long.valueOf(cVar.f6135c));
                if (d(cVar.f6133a)) {
                    return c.a(this.f6062b).getWritableDatabase().update(C0012a.f6063a, contentValues, "offer_id = '" + cVar.f6133a + "'", null);
                }
                return c.a(this.f6062b).getWritableDatabase().insert(C0012a.f6063a, null, contentValues);
            } catch (Exception e9) {
                e9.printStackTrace();
                return -1L;
            }
        }
    }

    private static com.anythink.basead.d.c a(Cursor cursor) {
        com.anythink.basead.d.c cVar = new com.anythink.basead.d.c();
        cVar.f6133a = cursor.getString(cursor.getColumnIndex("offer_id"));
        cVar.f6136d = cursor.getInt(cursor.getColumnIndex(C0012a.f6067e));
        cVar.f6137e = cursor.getLong(cursor.getColumnIndex("show_time"));
        cVar.f6138f = cursor.getString(cursor.getColumnIndex(C0012a.f6069g));
        cVar.f6134b = cursor.getInt(cursor.getColumnIndex(C0012a.f6065c));
        cVar.f6135c = cursor.getLong(cursor.getColumnIndex(C0012a.f6066d));
        return cVar;
    }
}
