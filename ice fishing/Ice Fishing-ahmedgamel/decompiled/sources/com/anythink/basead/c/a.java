package com.anythink.basead.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f6847a;

    /* renamed from: b, reason: collision with root package name */
    private Context f6848b;

    /* renamed from: com.anythink.basead.c.a$a, reason: collision with other inner class name */
    public static class C0012a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f6849a = "my_offer_cap_pacing";

        /* renamed from: b, reason: collision with root package name */
        public static final String f6850b = "offer_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f6851c = "offer_cap";

        /* renamed from: d, reason: collision with root package name */
        public static final String f6852d = "offer_pacing";

        /* renamed from: e, reason: collision with root package name */
        public static final String f6853e = "show_num";

        /* renamed from: f, reason: collision with root package name */
        public static final String f6854f = "show_time";

        /* renamed from: g, reason: collision with root package name */
        public static final String f6855g = "record_date";

        /* renamed from: h, reason: collision with root package name */
        public static final String f6856h = "CREATE TABLE IF NOT EXISTS my_offer_cap_pacing (offer_id TEXT,offer_cap INTEGER,offer_pacing INTEGER,show_num INTEGER,show_time INTEGER,record_date INTEGER )";
    }

    private a(Context context) {
        this.f6848b = context;
    }

    public static a a(Context context) {
        if (f6847a == null) {
            f6847a = new a(context);
        }
        return f6847a;
    }

    private synchronized boolean d(String str) {
        Cursor query = c.a(this.f6848b).getReadableDatabase().query(C0012a.f6849a, new String[]{"offer_id"}, "offer_id = ?", new String[]{str}, null, null, null);
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
            cursor = c.a(this.f6848b).getReadableDatabase().query(C0012a.f6849a, null, "offer_cap <= show_num AND record_date = ? AND offer_cap  >= ?", new String[]{str, "0"}, null, null, null);
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
            if (c.a(this.f6848b).getWritableDatabase() == null) {
                return;
            }
            c.a(this.f6848b).getWritableDatabase().delete(C0012a.f6849a, str2, null);
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
            cursor = c.a(this.f6848b).getReadableDatabase().query(C0012a.f6849a, null, "offer_id = ?", new String[]{str}, null, null, null);
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
                if (c.a(this.f6848b).getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("offer_id", cVar.f6919a);
                contentValues.put(C0012a.f6853e, Integer.valueOf(cVar.f6922d));
                contentValues.put("show_time", Long.valueOf(cVar.f6923e));
                contentValues.put(C0012a.f6855g, cVar.f6924f);
                contentValues.put(C0012a.f6851c, Integer.valueOf(cVar.f6920b));
                contentValues.put(C0012a.f6852d, Long.valueOf(cVar.f6921c));
                if (d(cVar.f6919a)) {
                    return c.a(this.f6848b).getWritableDatabase().update(C0012a.f6849a, contentValues, "offer_id = '" + cVar.f6919a + "'", null);
                }
                return c.a(this.f6848b).getWritableDatabase().insert(C0012a.f6849a, null, contentValues);
            } catch (Exception e9) {
                e9.printStackTrace();
                return -1L;
            }
        }
    }

    private static com.anythink.basead.d.c a(Cursor cursor) {
        com.anythink.basead.d.c cVar = new com.anythink.basead.d.c();
        cVar.f6919a = cursor.getString(cursor.getColumnIndex("offer_id"));
        cVar.f6922d = cursor.getInt(cursor.getColumnIndex(C0012a.f6853e));
        cVar.f6923e = cursor.getLong(cursor.getColumnIndex("show_time"));
        cVar.f6924f = cursor.getString(cursor.getColumnIndex(C0012a.f6855g));
        cVar.f6920b = cursor.getInt(cursor.getColumnIndex(C0012a.f6851c));
        cVar.f6921c = cursor.getLong(cursor.getColumnIndex(C0012a.f6852d));
        return cVar;
    }
}
