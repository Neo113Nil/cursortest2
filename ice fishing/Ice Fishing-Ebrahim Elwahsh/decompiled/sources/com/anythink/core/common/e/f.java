package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.h.bs;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f extends c<bs> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13094a = "com.anythink.core.common.e.f";

    /* renamed from: b, reason: collision with root package name */
    private static volatile f f13095b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f13096a = "sdkconfig";

        /* renamed from: b, reason: collision with root package name */
        public static final String f13097b = "key";

        /* renamed from: c, reason: collision with root package name */
        public static final String f13098c = "type";

        /* renamed from: d, reason: collision with root package name */
        public static final String f13099d = "value";

        /* renamed from: e, reason: collision with root package name */
        public static final String f13100e = "lastupdatetime";

        /* renamed from: f, reason: collision with root package name */
        public static final String f13101f = "CREATE TABLE IF NOT EXISTS sdkconfig(key TEXT ,type TEXT ,lastupdatetime TEXT ,value TEXT )";
    }

    private f(d dVar) {
        super(dVar);
    }

    public static f a(d dVar) {
        if (f13095b == null) {
            synchronized (f.class) {
                try {
                    if (f13095b == null) {
                        f13095b = new f(dVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13095b;
    }

    private synchronized boolean b(String str, String str2) {
        Cursor query = c().query(a.f13096a, new String[]{"key"}, "key=? AND type=?", new String[]{str, str2}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    private synchronized void c(String str, String str2) {
        List<bs> c4 = c(str, str2, bs.a.f13908a);
        if (c4 == null || c4.size() <= 0) {
            bs bsVar = new bs();
            bsVar.a(str2);
            bsVar.d("1");
            bsVar.c(bs.a.f13908a);
            bsVar.b(str);
            a(bsVar);
            return;
        }
        for (bs bsVar2 : c4) {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.parseInt(bsVar2.d()) + 1);
            bsVar2.d(sb.toString());
            a(bsVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (r10 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0026, code lost:
    
        if (r10 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized List<bs> d(String str, String str2) {
        Cursor cursor;
        try {
            cursor = c().query(a.f13096a, null, "key != ? and type = ?", new String[]{str, str2}, null, null, null);
        } catch (Exception unused) {
            cursor = null;
        } catch (OutOfMemoryError unused2) {
            cursor = null;
        } catch (Throwable unused3) {
            cursor = null;
        }
        try {
            List<bs> a9 = a(cursor);
            if (cursor != null) {
                cursor.close();
            }
            return a9;
        } catch (Exception unused4) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (OutOfMemoryError unused5) {
            try {
                System.gc();
            } finally {
            }
        } catch (Throwable unused6) {
        }
    }

    private synchronized boolean b(String str, String str2, String str3) {
        Cursor query = c().query(a.f13096a, new String[]{"key"}, "key=? AND type=? AND lastupdatetime=?", new String[]{str, str3, str2}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    public final synchronized long a(String str, String str2, String str3) {
        if (d() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put("type", str3);
            contentValues.put("value", str2);
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            contentValues.put(a.f13100e, sb.toString());
            if (b(str, str3)) {
                return d().update(a.f13096a, contentValues, "key = ? AND type = ?", new String[]{str, str3});
            }
            return d().insert(a.f13096a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (r10 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0026, code lost:
    
        if (r10 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized List<bs> b(String str) {
        Cursor cursor;
        try {
            cursor = c().query(a.f13096a, null, "type = ?", new String[]{str}, null, null, null);
        } catch (Exception unused) {
            cursor = null;
        } catch (OutOfMemoryError unused2) {
            cursor = null;
        } catch (Throwable unused3) {
            cursor = null;
        }
        try {
            return a(cursor);
        } catch (Exception unused4) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (OutOfMemoryError unused5) {
            try {
                System.gc();
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable unused6) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (r10 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0026, code lost:
    
        if (r10 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized List<bs> c(String str, String str2, String str3) {
        Cursor cursor;
        try {
            cursor = c().query(a.f13096a, null, "key = ? and type = ? and lastupdatetime = ?", new String[]{str, str3, str2}, null, null, null);
        } catch (Exception unused) {
            cursor = null;
        } catch (OutOfMemoryError unused2) {
            cursor = null;
        } catch (Throwable unused3) {
            cursor = null;
        }
        try {
            List<bs> a9 = a(cursor);
            if (cursor != null) {
                cursor.close();
            }
            return a9;
        } catch (Exception unused4) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (OutOfMemoryError unused5) {
            try {
                System.gc();
            } finally {
            }
        } catch (Throwable unused6) {
        }
    }

    private synchronized long a(bs bsVar) {
        if (d() == null || bsVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", bsVar.b());
            contentValues.put("type", bsVar.c());
            contentValues.put("value", bsVar.d());
            contentValues.put(a.f13100e, bsVar.a());
            if (b(bsVar.b(), bsVar.a(), bsVar.c())) {
                return d().update(a.f13096a, contentValues, "key = ? AND type = ? AND lastupdatetime = ?  ", new String[]{bsVar.b(), bsVar.c(), bsVar.a()});
            }
            return d().insert(a.f13096a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private synchronized List<bs> a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (cursor.getCount() > 0) {
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        bs bsVar = new bs();
                        bsVar.b(cursor.getString(cursor.getColumnIndex("key")));
                        bsVar.c(cursor.getString(cursor.getColumnIndex("type")));
                        bsVar.d(cursor.getString(cursor.getColumnIndex("value")));
                        bsVar.a(cursor.getString(cursor.getColumnIndex(a.f13100e)));
                        arrayList.add(bsVar);
                    }
                    cursor.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    private synchronized void a(String str) {
        try {
            if (d() == null) {
                return;
            }
            d().delete(a.f13096a, "lastupdatetime< ? and type = ?", new String[]{str, bs.a.f13908a});
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (r10 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0026, code lost:
    
        if (r10 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<bs> a(String str, String str2) {
        Cursor cursor;
        try {
            cursor = c().query(a.f13096a, null, "key = ? and type = ?", new String[]{str, str2}, null, null, null);
        } catch (Exception unused) {
            cursor = null;
        } catch (OutOfMemoryError unused2) {
            cursor = null;
        } catch (Throwable unused3) {
            cursor = null;
        }
        try {
            List<bs> a9 = a(cursor);
            if (cursor != null) {
                cursor.close();
            }
            return a9;
        } catch (Exception unused4) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (OutOfMemoryError unused5) {
            try {
                System.gc();
            } finally {
            }
        } catch (Throwable unused6) {
        }
    }
}
