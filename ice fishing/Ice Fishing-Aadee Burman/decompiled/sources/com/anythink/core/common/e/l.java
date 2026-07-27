package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.anythink.core.common.h.at;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class l extends c<at> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13029a = "com.anythink.core.common.e.l";

    /* renamed from: b, reason: collision with root package name */
    private static volatile l f13030b;

    /* renamed from: c, reason: collision with root package name */
    private int f13031c;

    /* renamed from: d, reason: collision with root package name */
    private int f13032d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f13033a = "inspect_info";

        /* renamed from: b, reason: collision with root package name */
        public static final String f13034b = "inspect_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f13035c = "update_time";

        /* renamed from: d, reason: collision with root package name */
        public static final String f13036d = "inspect_result";

        /* renamed from: e, reason: collision with root package name */
        public static final String f13037e = "pgk_name";

        /* renamed from: f, reason: collision with root package name */
        public static final String f13038f = "CREATE TABLE IF NOT EXISTS inspect_info(inspect_id TEXT, inspect_result INTEGER, pgk_name TEXT, update_time INTEGER )";

        /* renamed from: g, reason: collision with root package name */
        public static final String f13039g = "CREATE TABLE IF NOT EXISTS inspect_info(inspect_id TEXT, update_time INTEGER )";

        /* renamed from: h, reason: collision with root package name */
        public static final String f13040h = "ALTER TABLE inspect_info ADD COLUMN inspect_result INTEGER DEFAULT 1";
        public static final String i = "ALTER TABLE inspect_info DROP COLUMN pgk_name";
    }

    private l(d dVar) {
        super(dVar);
        this.f13031c = 500;
        this.f13032d = -1627869184;
    }

    public static l a(d dVar) {
        if (f13030b == null) {
            synchronized (l.class) {
                try {
                    if (f13030b == null) {
                        f13030b = new l(dVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13030b;
    }

    private synchronized void b(String str) {
        try {
            d().delete(a.f13033a, "inspect_id = ? ", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        if (r1 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x006e, code lost:
    
        if (r1 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<at> b() {
        Cursor cursor;
        try {
            cursor = c().query(a.f13033a, null, null, null, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        ArrayList arrayList = new ArrayList();
                        while (cursor.moveToNext()) {
                            try {
                                at atVar = new at();
                                String string = cursor.getString(cursor.getColumnIndex(a.f13034b));
                                if (!TextUtils.isEmpty(string)) {
                                    int i = cursor.getInt(cursor.getColumnIndex(a.f13036d));
                                    long j6 = cursor.getLong(cursor.getColumnIndex("update_time"));
                                    atVar.a(string);
                                    atVar.a(i);
                                    atVar.a(j6);
                                    arrayList.add(atVar);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        cursor.close();
                        cursor.close();
                        return arrayList;
                    }
                } catch (Exception unused2) {
                    if (cursor != null) {
                    }
                    return null;
                } catch (OutOfMemoryError unused3) {
                    try {
                        System.gc();
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                } catch (Throwable unused4) {
                }
            }
        } catch (Exception unused5) {
            cursor = null;
        } catch (OutOfMemoryError unused6) {
            cursor = null;
        } catch (Throwable unused7) {
            cursor = null;
        }
    }

    public final synchronized long a(String str, boolean z3) {
        if (d() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.f13034b, str);
            contentValues.put(a.f13036d, Integer.valueOf(z3 ? 1 : 2));
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            if (a(str)) {
                return d().update(a.f13033a, contentValues, "inspect_id = ? ", new String[]{str});
            }
            return d().insert(a.f13033a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r10 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean a(String str) {
        Cursor cursor;
        if (str == null) {
            return false;
        }
        try {
            cursor = c().query(a.f13033a, new String[]{a.f13034b}, "inspect_id=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        cursor.close();
                        cursor.close();
                        return true;
                    }
                } catch (Throwable unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return false;
                }
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0041, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a() {
        long currentTimeMillis;
        Cursor cursor = null;
        long j6 = -1;
        try {
            cursor = c().query(a.f13033a, null, null, null, null, null, "update_time DESC", String.valueOf(this.f13031c));
            if (cursor != null && cursor.getCount() >= this.f13031c) {
                cursor.moveToLast();
                j6 = cursor.getLong(cursor.getColumnIndex("update_time"));
                cursor.close();
            }
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
            }
            currentTimeMillis = System.currentTimeMillis() - this.f13032d;
            if (j6 != 0 || j6 > currentTimeMillis) {
                j6 = currentTimeMillis;
            }
            if (j6 > 0) {
                try {
                    d().delete(a.f13033a, "update_time<?", new String[]{String.valueOf(j6)});
                } catch (Throwable unused2) {
                }
            }
        } catch (OutOfMemoryError unused3) {
            long j9 = j6;
            Cursor cursor2 = cursor;
            try {
                System.gc();
                j6 = j9;
                currentTimeMillis = System.currentTimeMillis() - this.f13032d;
                if (j6 != 0) {
                }
                j6 = currentTimeMillis;
                if (j6 > 0) {
                }
            } finally {
                if (cursor2 != null) {
                    cursor2.close();
                }
            }
        } catch (Throwable unused4) {
        }
    }
}
