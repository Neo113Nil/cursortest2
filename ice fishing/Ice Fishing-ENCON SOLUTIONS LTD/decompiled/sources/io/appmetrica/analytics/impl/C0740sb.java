package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740sb implements Ha, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6890a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6891b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f6892c = "preferences";

    /* renamed from: d, reason: collision with root package name */
    public final C0714rb f6893d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f6894e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0891y6 f6895f;

    public C0740sb(InterfaceC0891y6 interfaceC0891y6) {
        this.f6895f = interfaceC0891y6;
        Locale locale = Locale.US;
        C0714rb c0714rb = new C0714rb(this, C1.a.f(ThreadFactoryC0924zd.a(), "IAA-DW-"));
        this.f6893d = c0714rb;
        c0714rb.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(C0740sb c0740sb) {
        SQLiteDatabase sQLiteDatabase;
        String str;
        c0740sb.getClass();
        Cursor cursor = null;
        try {
            sQLiteDatabase = c0740sb.f6895f.a();
            if (sQLiteDatabase != null) {
                try {
                    Cursor query = sQLiteDatabase.query(c0740sb.f6892c, new String[]{"key", "value", "type"}, null, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(query.getColumnIndexOrThrow("key"));
                            String string2 = query.getString(query.getColumnIndexOrThrow("value"));
                            int i2 = query.getInt(query.getColumnIndexOrThrow("type"));
                            if (!TextUtils.isEmpty(string)) {
                                if (i2 != 1) {
                                    if (i2 == 2) {
                                        str = ParseUtils.parseInt(string2);
                                    } else if (i2 != 3) {
                                        str = string2;
                                        if (i2 != 4) {
                                            if (i2 == 5) {
                                                str = ParseUtils.parseFloat(string2);
                                            }
                                            str = null;
                                        }
                                    } else {
                                        str = ParseUtils.parseLong(string2);
                                    }
                                    if (str == null) {
                                        c0740sb.f6890a.put(string, str);
                                    }
                                } else {
                                    if ("true".equals(string2)) {
                                        str = Boolean.TRUE;
                                    } else {
                                        if ("false".equals(string2)) {
                                            str = Boolean.FALSE;
                                        }
                                        str = null;
                                    }
                                    if (str == null) {
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    cursor = query;
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
            sQLiteDatabase = null;
        }
        AbstractC0572lo.a(cursor);
        c0740sb.f6895f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final void b() {
        synchronized (this.f6893d) {
            this.f6893d.notifyAll();
        }
    }

    public final void c() {
        if (this.f6894e) {
            return;
        }
        try {
            this.f6890a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6893d.isRunning()) {
            this.f6893d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final boolean getBoolean(String str, boolean z2) {
        Object b2 = b(str);
        return b2 instanceof Boolean ? ((Boolean) b2).booleanValue() : z2;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final int getInt(String str, int i2) {
        Object b2 = b(str);
        return b2 instanceof Integer ? ((Integer) b2).intValue() : i2;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final long getLong(String str, long j2) {
        Object b2 = b(str);
        return b2 instanceof Long ? ((Long) b2).longValue() : j2;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final String getString(String str, String str2) {
        Object b2 = b(str);
        return b2 instanceof String ? (String) b2 : str2;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha remove(String str) {
        synchronized (this.f6890a) {
            c();
            this.f6890a.remove(str);
        }
        synchronized (this.f6893d) {
            this.f6891b.put(str, this);
            this.f6893d.notifyAll();
        }
        return this;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.f6890a) {
            c();
            obj = this.f6890a.get(str);
        }
        return obj;
    }

    public static void a(C0740sb c0740sb, HashMap hashMap) {
        SQLiteDatabase sQLiteDatabase;
        c0740sb.getClass();
        int size = hashMap.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i2 = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c0740sb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i2] = contentValues;
            i2++;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = c0740sb.f6895f.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i3 = 0; i3 < size; i3++) {
                        ContentValues contentValues2 = contentValuesArr[i3];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabase.delete(c0740sb.f6892c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(c0740sb.f6892c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    if (sQLiteDatabase2 != null) {
                        try {
                            sQLiteDatabase2.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabase = sQLiteDatabase2;
                    c0740sb.f6895f.a(sQLiteDatabase);
                }
            }
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        c0740sb.f6895f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized Ha a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, long j2) {
        a(str, Long.valueOf(j2));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized Ha a(int i2, String str) {
        a(str, Integer.valueOf(i2));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, boolean z2) {
        a(str, Boolean.valueOf(z2));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, float f2) {
        a(str, Float.valueOf(f2));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final boolean a(String str) {
        boolean containsKey;
        synchronized (this.f6890a) {
            c();
            containsKey = this.f6890a.containsKey(str);
        }
        return containsKey;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Set a() {
        HashSet hashSet;
        synchronized (this.f6890a) {
            hashSet = new HashSet(this.f6890a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.f6890a) {
            c();
            this.f6890a.put(str, obj);
        }
        synchronized (this.f6893d) {
            this.f6891b.put(str, obj);
            this.f6893d.notifyAll();
        }
    }
}
