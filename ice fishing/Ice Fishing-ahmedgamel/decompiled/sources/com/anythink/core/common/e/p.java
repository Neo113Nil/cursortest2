package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.anythink.core.common.h.bo;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class p extends c<bo> {

    /* renamed from: b, reason: collision with root package name */
    private static volatile p f13860b;

    /* renamed from: a, reason: collision with root package name */
    private final String f13861a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f13862a = "placement_ad_impression";

        /* renamed from: b, reason: collision with root package name */
        public static final String f13863b = "format";

        /* renamed from: c, reason: collision with root package name */
        public static final String f13864c = "placement_id";

        /* renamed from: d, reason: collision with root package name */
        public static final String f13865d = "adsource_id";

        /* renamed from: e, reason: collision with root package name */
        public static final String f13866e = "hour_time";

        /* renamed from: f, reason: collision with root package name */
        public static final String f13867f = "hour_imp";

        /* renamed from: g, reason: collision with root package name */
        public static final String f13868g = "date_time";

        /* renamed from: h, reason: collision with root package name */
        public static final String f13869h = "date_imp";
        public static final String i = "show_time";

        /* renamed from: j, reason: collision with root package name */
        public static final String f13870j = "CREATE TABLE IF NOT EXISTS placement_ad_impression(format INTEGER ,placement_id TEXT ,adsource_id TEXT ,hour_time TEXT ,hour_imp INTEGER ,date_time TEXT ,date_imp INTEGER , show_time INTEGER)";
    }

    private p(d dVar) {
        super(dVar);
        this.f13861a = p.class.getName();
    }

    public static p a(d dVar) {
        if (f13860b == null) {
            synchronized (p.class) {
                try {
                    if (f13860b == null) {
                        f13860b = new p(dVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13860b;
    }

    private boolean b(String str) {
        Cursor query = c().query(a.f13862a, new String[]{"adsource_id"}, "adsource_id=?", new String[]{str}, "adsource_id", null, null);
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        r2 = c().query(com.anythink.core.common.e.p.a.f13862a, new java.lang.String[]{"sum(hour_imp)"}, "format=? AND hour_time=?", new java.lang.String[]{java.lang.String.valueOf(r12), r14}, null, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r2 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r2.getCount() <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        r2.moveToNext();
        r0[1] = r2.getInt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (r2 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r2.getCount() <= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r2 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (r2 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        java.lang.System.gc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (r2 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if (r2 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005a, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004f, code lost:
    
        if (r2 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0049, code lost:
    
        if (r2 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized int[] a(int i, String str, String str2) {
        int[] iArr;
        iArr = new int[2];
        Cursor cursor = null;
        try {
            try {
                cursor = c().query(a.f13862a, new String[]{"sum(date_imp)"}, "format=? AND date_time=?", new String[]{String.valueOf(i), str}, null, null, null);
                if (cursor != null && cursor.getCount() > 0) {
                    cursor.moveToNext();
                    iArr[0] = cursor.getInt(0);
                }
                if (cursor != null && cursor.getCount() > 0) {
                    cursor.close();
                }
            } finally {
            }
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            System.gc();
        } catch (Throwable unused3) {
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e2, code lost:
    
        if (r10 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
    
        if (r10 == null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized bo a(String str, String str2, String str3) {
        Cursor cursor;
        bo boVar;
        try {
            cursor = c().query(a.f13862a, null, "placement_id=? AND date_time=?", new String[]{str, str2}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        boVar = new bo();
                        boVar.f14513h = new ConcurrentHashMap<>();
                        while (cursor.moveToNext()) {
                            boVar.f14506a = cursor.getInt(cursor.getColumnIndex("format"));
                            boVar.f14507b = cursor.getString(cursor.getColumnIndex("placement_id"));
                            bo.a aVar = new bo.a();
                            aVar.f14514a = cursor.getString(cursor.getColumnIndex("adsource_id"));
                            aVar.f14515b = cursor.getString(cursor.getColumnIndex(a.f13866e));
                            aVar.f14516c = cursor.getString(cursor.getColumnIndex(a.f13868g));
                            if (!TextUtils.equals(aVar.f14515b, str3)) {
                                aVar.f14518e = 0;
                            } else {
                                aVar.f14518e = cursor.getInt(cursor.getColumnIndex(a.f13867f));
                            }
                            boVar.f14509d += aVar.f14518e;
                            if (!TextUtils.equals(aVar.f14516c, str2)) {
                                aVar.f14517d = 0;
                            } else {
                                aVar.f14517d = cursor.getInt(cursor.getColumnIndex(a.f13869h));
                            }
                            boVar.f14508c += aVar.f14517d;
                            long j6 = cursor.getLong(cursor.getColumnIndex("show_time"));
                            aVar.f14519f = j6;
                            if (j6 >= boVar.f14510e) {
                                boVar.f14510e = j6;
                            }
                            boVar.f14513h.put(aVar.f14514a, aVar);
                        }
                        cursor.close();
                        cursor.close();
                        return boVar;
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
            }
            boVar = null;
            cursor.close();
            cursor.close();
            return boVar;
        } catch (Exception unused4) {
            cursor = null;
        } catch (OutOfMemoryError unused5) {
            cursor = null;
        } catch (Throwable unused6) {
            cursor = null;
        }
    }

    private synchronized long a(int i, String str, bo.a aVar) {
        if (d() == null || aVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("format", Integer.valueOf(i));
            contentValues.put("placement_id", str);
            contentValues.put("adsource_id", aVar.f14514a);
            contentValues.put(a.f13866e, aVar.f14515b);
            contentValues.put(a.f13867f, Integer.valueOf(aVar.f14518e));
            contentValues.put(a.f13868g, aVar.f14516c);
            contentValues.put(a.f13869h, Integer.valueOf(aVar.f14517d));
            contentValues.put("show_time", Long.valueOf(aVar.f14519f));
            Cursor query = c().query(a.f13862a, new String[]{"adsource_id"}, "adsource_id=?", new String[]{aVar.f14514a}, "adsource_id", null, null);
            if (query != null && query.getCount() > 0) {
                query.close();
                return d().update(a.f13862a, contentValues, "adsource_id = ? ", new String[]{aVar.f14514a});
            }
            if (query != null) {
                query.close();
            }
            return d().insert(a.f13862a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static bo a(Cursor cursor, String str, String str2) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        bo boVar = new bo();
        boVar.f14513h = new ConcurrentHashMap<>();
        while (cursor.moveToNext()) {
            boVar.f14506a = cursor.getInt(cursor.getColumnIndex("format"));
            boVar.f14507b = cursor.getString(cursor.getColumnIndex("placement_id"));
            bo.a aVar = new bo.a();
            aVar.f14514a = cursor.getString(cursor.getColumnIndex("adsource_id"));
            aVar.f14515b = cursor.getString(cursor.getColumnIndex(a.f13866e));
            aVar.f14516c = cursor.getString(cursor.getColumnIndex(a.f13868g));
            if (!TextUtils.equals(aVar.f14515b, str2)) {
                aVar.f14518e = 0;
            } else {
                aVar.f14518e = cursor.getInt(cursor.getColumnIndex(a.f13867f));
            }
            boVar.f14509d += aVar.f14518e;
            if (!TextUtils.equals(aVar.f14516c, str)) {
                aVar.f14517d = 0;
            } else {
                aVar.f14517d = cursor.getInt(cursor.getColumnIndex(a.f13869h));
            }
            boVar.f14508c += aVar.f14517d;
            long j6 = cursor.getLong(cursor.getColumnIndex("show_time"));
            aVar.f14519f = j6;
            if (j6 >= boVar.f14510e) {
                boVar.f14510e = j6;
            }
            boVar.f14513h.put(aVar.f14514a, aVar);
        }
        return boVar;
    }

    public final void a(String str) {
        String str2;
        synchronized (this) {
            try {
                str2 = "date_time!='" + str + "'";
            } catch (Exception unused) {
            }
            if (d() == null) {
                return;
            }
            d().delete(a.f13862a, str2, null);
        }
    }
}
