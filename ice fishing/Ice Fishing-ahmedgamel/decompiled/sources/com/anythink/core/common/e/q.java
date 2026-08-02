package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class q extends c<com.anythink.core.common.a.n> {

    /* renamed from: b, reason: collision with root package name */
    private static volatile q f13871b;

    /* renamed from: a, reason: collision with root package name */
    private final String f13872a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f13873a = "video_res_cache_info";

        /* renamed from: b, reason: collision with root package name */
        public static final String f13874b = "video_url";

        /* renamed from: c, reason: collision with root package name */
        public static final String f13875c = "file_path";

        /* renamed from: d, reason: collision with root package name */
        public static final String f13876d = "ready_rate";

        /* renamed from: e, reason: collision with root package name */
        public static final String f13877e = "download_size";

        /* renamed from: f, reason: collision with root package name */
        public static final String f13878f = "total_size";

        /* renamed from: g, reason: collision with root package name */
        public static final String f13879g = "update_time";

        /* renamed from: h, reason: collision with root package name */
        public static final String f13880h = "CREATE TABLE IF NOT EXISTS video_res_cache_info(video_url TEXT, file_path TEXT, ready_rate INTEGER, download_size INTEGER, total_size INTEGER, update_time INTEGER )";
    }

    private q(d dVar) {
        super(dVar);
        this.f13872a = com.anythink.expressad.foundation.d.d.bu;
    }

    public static q a(d dVar) {
        if (f13871b == null) {
            synchronized (o.class) {
                try {
                    if (f13871b == null) {
                        f13871b = new q(dVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13871b;
    }

    private void d(String str) {
        Cursor cursor = null;
        try {
            cursor = c().query(a.f13873a, null, null, null, null, null, null);
            cursor.getCount();
            cursor.close();
        } catch (Throwable th) {
            try {
                th.getMessage();
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r11 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r11 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r11.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean e(String str) {
        Cursor cursor;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            cursor = c().query(a.f13873a, new String[]{"video_url"}, "video_url=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        cursor.close();
                        cursor.close();
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            d().update(a.f13873a, contentValues, "video_url = ? ", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            d().delete(a.f13873a, "video_url=?", new String[]{str});
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ae, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00af, code lost:
    
        r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        if (r2 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<com.anythink.core.common.a.n> b() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = c().query(a.f13873a, null, null, null, null, null, "update_time DESC");
            if (cursor.getCount() > 0 && cursor.moveToPosition(((int) Math.round(((cursor.getCount() * 1.0d) + 1.0d) / 2.0d)) - 1)) {
                long j6 = cursor.getLong(cursor.getColumnIndex("update_time"));
                do {
                    com.anythink.core.common.a.n nVar = new com.anythink.core.common.a.n();
                    nVar.a(cursor.getString(cursor.getColumnIndex("video_url")));
                    nVar.b(cursor.getString(cursor.getColumnIndex("file_path")));
                    nVar.a(cursor.getInt(cursor.getColumnIndex("ready_rate")));
                    nVar.b(cursor.getLong(cursor.getColumnIndex(a.f13877e)));
                    nVar.a(cursor.getLong(cursor.getColumnIndex(a.f13878f)));
                    nVar.c(cursor.getLong(cursor.getColumnIndex("update_time")));
                    arrayList.add(nVar);
                } while (cursor.moveToNext());
                d().delete(a.f13873a, "update_time<=?", new String[]{String.valueOf(j6)});
            }
        } catch (Throwable th) {
            try {
                th.getMessage();
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }
        cursor.close();
        return arrayList;
    }

    public final synchronized void a(String str, String str2, long j6, long j9, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("video_url", str);
                    contentValues.put("file_path", str2);
                    contentValues.put("ready_rate", Integer.valueOf(i));
                    contentValues.put(a.f13877e, Long.valueOf(j9));
                    contentValues.put(a.f13878f, Long.valueOf(j6));
                    contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
                    if (e(str)) {
                        d().update(a.f13873a, contentValues, "video_url = ? ", new String[]{str});
                    } else {
                        d().insert(a.f13873a, null, contentValues);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.anythink.core.common.a.n a(String str) {
        Cursor cursor;
        try {
            cursor = c().query(a.f13873a, null, "video_url=?", new String[]{str}, null, null, null);
            try {
                if (cursor.moveToNext()) {
                    com.anythink.core.common.a.n nVar = new com.anythink.core.common.a.n();
                    nVar.a(str);
                    nVar.b(cursor.getString(cursor.getColumnIndex("file_path")));
                    nVar.a(cursor.getInt(cursor.getColumnIndex("ready_rate")));
                    nVar.b(cursor.getLong(cursor.getColumnIndex(a.f13877e)));
                    nVar.a(cursor.getLong(cursor.getColumnIndex(a.f13878f)));
                    nVar.c(cursor.getLong(cursor.getColumnIndex("update_time")));
                    cursor.close();
                    cursor.close();
                    return nVar;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        cursor.close();
        return null;
    }

    public final long a() {
        Cursor cursor = null;
        try {
            cursor = c().query(a.f13873a, new String[]{"sum(download_size)"}, null, null, null, null, null);
            if (cursor.moveToNext()) {
                long j6 = cursor.getLong(0);
                cursor.close();
                cursor.close();
                return j6;
            }
        } catch (Throwable th) {
            try {
                th.getMessage();
                if (cursor == null) {
                    return 0L;
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return 0L;
    }
}
