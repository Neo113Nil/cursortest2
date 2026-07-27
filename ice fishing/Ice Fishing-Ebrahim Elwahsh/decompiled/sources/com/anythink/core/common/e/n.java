package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.h.be;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class n extends c<be> {

    /* renamed from: b, reason: collision with root package name */
    private static n f13210b;

    /* renamed from: a, reason: collision with root package name */
    private final String f13211a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f13212a = "offer_action_record";

        /* renamed from: b, reason: collision with root package name */
        public static final String f13213b = "adsource_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f13214c = "type";

        /* renamed from: d, reason: collision with root package name */
        public static final String f13215d = "unit_id";

        /* renamed from: e, reason: collision with root package name */
        public static final String f13216e = "click_count";

        /* renamed from: f, reason: collision with root package name */
        public static final String f13217f = "show_count";

        /* renamed from: g, reason: collision with root package name */
        public static final String f13218g = "expire_time";

        /* renamed from: h, reason: collision with root package name */
        public static final String f13219h = "CREATE TABLE IF NOT EXISTS offer_action_record(adsource_id TEXT ,type INTEGER ,unit_id TEXT ,click_count INTEGER ,show_count INTEGER ,expire_time INTEGER )";
    }

    private n(d dVar) {
        super(dVar);
        this.f13211a = n.class.getName();
    }

    public static n a(d dVar) {
        if (f13210b == null) {
            synchronized (n.class) {
                try {
                    if (f13210b == null) {
                        f13210b = new n(dVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13210b;
    }

    private static String b(int i) {
        if (i <= 0) {
            throw new RuntimeException("No placeholders");
        }
        StringBuilder sb = new StringBuilder((i * 2) - 1);
        sb.append("?");
        for (int i4 = 1; i4 < i; i4++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    private boolean c(String str, int i, String str2) {
        Cursor query = c().query(a.f13212a, null, "adsource_id = ? and type = ? and unit_id = ?", new String[]{str, String.valueOf(i), str2}, null, null, null);
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

    private synchronized long b(String str, int i, String str2) {
        try {
            if (d() == null) {
                return -1L;
            }
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("adsource_id", str);
                contentValues.put("type", Integer.valueOf(i));
                contentValues.put("unit_id", str2);
                be a9 = a(i, str2);
                if (a9 != null) {
                    contentValues.put(a.f13216e, Integer.valueOf(a9.d()));
                    contentValues.put("show_count", Integer.valueOf(a9.c()));
                    contentValues.put(a.f13218g, Long.valueOf(a9.b()));
                } else {
                    contentValues.put(a.f13216e, (Integer) 0);
                    contentValues.put("show_count", (Integer) 0);
                    contentValues.put(a.f13218g, (Integer) (-1));
                }
                return d().insert(a.f13212a, null, contentValues);
            } catch (Exception unused) {
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(int i, String str, int i4, int i9) {
        be a9 = a(i, str);
        if (a9 != null) {
            a9.b(a9.d() + i4);
            a9.a(a9.c() + i9);
            a(a9);
        }
    }

    public final synchronized void a(int i, String str, long j9) {
        be a9 = a(i, str);
        if (a9 != null) {
            a9.a(j9);
            a(a9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<be> a(int i) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = c().query(a.f13212a, null, "type = ? and expire_time > ?", new String[]{String.valueOf(i), String.valueOf(System.currentTimeMillis())}, null, null, null);
                if (cursor != null && cursor.getCount() > 0) {
                    while (cursor.moveToNext()) {
                        be beVar = new be(i, cursor.getString(cursor.getColumnIndex("unit_id")));
                        beVar.b(cursor.getInt(cursor.getColumnIndex(a.f13216e)));
                        beVar.a(cursor.getInt(cursor.getColumnIndex("show_count")));
                        beVar.a(cursor.getLong(cursor.getColumnIndex(a.f13218g)));
                        arrayList.add(beVar);
                    }
                }
            } finally {
            }
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            System.gc();
        } catch (Throwable unused3) {
        }
        return arrayList;
    }

    private boolean b(int i, String str) {
        Cursor query = c().query(a.f13212a, null, "type = ? and unit_id = ?", new String[]{String.valueOf(i), str}, null, null, null);
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b3, code lost:
    
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<be> a(List<String> list, int i) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        b(list.size());
        Cursor cursor = null;
        try {
            try {
                String[] strArr = new String[list.size() + 2];
                list.toArray(strArr);
                strArr[list.size()] = String.valueOf(i);
                strArr[list.size() + 1] = String.valueOf(System.currentTimeMillis());
                cursor = c().query(a.f13212a, null, "adsource_id IN (" + b(list.size()) + ") and type = ? and expire_time > ?", strArr, null, null, null);
                if (cursor != null && cursor.getCount() > 0) {
                    while (cursor.moveToNext()) {
                        be beVar = new be(i, cursor.getString(cursor.getColumnIndex("unit_id")));
                        beVar.b(cursor.getInt(cursor.getColumnIndex(a.f13216e)));
                        beVar.a(cursor.getInt(cursor.getColumnIndex("show_count")));
                        beVar.a(cursor.getLong(cursor.getColumnIndex(a.f13218g)));
                        arrayList.add(beVar);
                    }
                }
            } finally {
            }
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            System.gc();
        } catch (Throwable unused3) {
        }
        return arrayList;
    }

    private synchronized long a(be beVar) {
        if (d() == null || beVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(beVar.e()));
            contentValues.put("unit_id", beVar.a());
            contentValues.put(a.f13216e, Integer.valueOf(beVar.d()));
            contentValues.put("show_count", Integer.valueOf(beVar.c()));
            contentValues.put(a.f13218g, Long.valueOf(beVar.b()));
            return d().update(a.f13212a, contentValues, "type = ? and unit_id = ?", new String[]{String.valueOf(beVar.e()), beVar.a()});
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0064, code lost:
    
        if (r1 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized be a(int i, String str) {
        Cursor cursor;
        try {
            cursor = c().query(a.f13212a, null, "type=? and unit_id = ?", new String[]{String.valueOf(i), str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        cursor.moveToNext();
                        be beVar = new be(i, str);
                        beVar.b(cursor.getInt(cursor.getColumnIndex(a.f13216e)));
                        beVar.a(cursor.getInt(cursor.getColumnIndex("show_count")));
                        beVar.a(cursor.getLong(cursor.getColumnIndex(a.f13218g)));
                        cursor.close();
                        cursor.close();
                        return beVar;
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
            if (cursor != null) {
                cursor.close();
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

    public final synchronized void a(String str, int i, String str2) {
        try {
            Cursor query = c().query(a.f13212a, null, "adsource_id = ? and type = ? and unit_id = ?", new String[]{str, String.valueOf(i), str2}, null, null, null);
            if (query != null && query.getCount() > 0) {
                query.close();
            } else {
                if (query != null) {
                    query.close();
                }
                b(str, i, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
