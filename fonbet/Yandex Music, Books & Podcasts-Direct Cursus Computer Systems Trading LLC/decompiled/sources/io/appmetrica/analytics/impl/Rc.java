package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.connectsdk.service.airplay.PListParser;
import defpackage.k5r;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class Rc implements Tb, Closeable {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final String c = "preferences";
    public final Qc d;
    public volatile boolean e;
    public final InterfaceC0598r7 f;

    public Rc(InterfaceC0598r7 interfaceC0598r7) {
        this.f = interfaceC0598r7;
        Locale locale = Locale.US;
        Qc qc = new Qc(this, k5r.i(Uf.a(), "IAA-DW-"));
        this.d = qc;
        qc.start();
    }

    public static void a(Rc rc, HashMap hashMap) {
        SQLiteDatabase sQLiteDatabase;
        rc.getClass();
        int size = hashMap.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put(PListParser.TAG_KEY, str);
            if (value == rc) {
                contentValues.putNull(Constants.KEY_VALUE);
            } else if (value instanceof String) {
                contentValues.put(Constants.KEY_VALUE, (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put(Constants.KEY_VALUE, (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put(Constants.KEY_VALUE, (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put(Constants.KEY_VALUE, String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put(Constants.KEY_VALUE, (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i] = contentValues;
            i++;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = rc.f.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i2 = 0; i2 < size; i2++) {
                        ContentValues contentValues2 = contentValuesArr[i2];
                        if (contentValues2.getAsString(Constants.KEY_VALUE) == null) {
                            sQLiteDatabase.delete(rc.c, "key = ?", new String[]{contentValues2.getAsString(PListParser.TAG_KEY)});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(rc.c, null, contentValues2, 5);
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
                    rc.f.a(sQLiteDatabase);
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
        rc.f.a(sQLiteDatabase);
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.a) {
            c();
            obj = this.a.get(str);
        }
        return obj;
    }

    public final void c() {
        if (this.e) {
            return;
        }
        try {
            this.a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d.isRunning()) {
            this.d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.Tb
    public final boolean getBoolean(String str, boolean z) {
        Object b = b(str);
        return b instanceof Boolean ? ((Boolean) b).booleanValue() : z;
    }

    @Override // io.appmetrica.analytics.impl.Tb
    public final int getInt(String str, int i) {
        Object b = b(str);
        return b instanceof Integer ? ((Integer) b).intValue() : i;
    }

    @Override // io.appmetrica.analytics.impl.Tb
    public final long getLong(String str, long j) {
        Object b = b(str);
        return b instanceof Long ? ((Long) b).longValue() : j;
    }

    @Override // io.appmetrica.analytics.impl.Tb
    public final String getString(String str, String str2) {
        Object b = b(str);
        return b instanceof String ? (String) b : str2;
    }

    @Override // io.appmetrica.analytics.impl.Tb
    public final Tb remove(String str) {
        synchronized (this.a) {
            c();
            this.a.remove(str);
        }
        synchronized (this.d) {
            this.b.put(str, this);
            this.d.notifyAll();
        }
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Tb
    public final void b() {
        synchronized (this.d) {
            this.d.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Rc rc) {
        SQLiteDatabase sQLiteDatabase;
        String str;
        rc.getClass();
        Cursor cursor = null;
        try {
            sQLiteDatabase = rc.f.a();
            if (sQLiteDatabase != null) {
                try {
                    Cursor query = sQLiteDatabase.query(rc.c, new String[]{PListParser.TAG_KEY, Constants.KEY_VALUE, "type"}, null, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(query.getColumnIndexOrThrow(PListParser.TAG_KEY));
                            String string2 = query.getString(query.getColumnIndexOrThrow(Constants.KEY_VALUE));
                            int i = query.getInt(query.getColumnIndexOrThrow("type"));
                            if (!TextUtils.isEmpty(string)) {
                                if (i != 1) {
                                    if (i == 2) {
                                        str = ParseUtils.parseInt(string2);
                                    } else if (i != 3) {
                                        str = string2;
                                        if (i != 4) {
                                            if (i == 5) {
                                                str = ParseUtils.parseFloat(string2);
                                            }
                                            str = null;
                                        }
                                    } else {
                                        str = ParseUtils.parseLong(string2);
                                    }
                                    if (str == null) {
                                        rc.a.put(string, str);
                                    }
                                } else {
                                    if (PListParser.TAG_TRUE.equals(string2)) {
                                        str = Boolean.TRUE;
                                    } else {
                                        if (PListParser.TAG_FALSE.equals(string2)) {
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
        AbstractC0734vr.a(cursor);
        rc.f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Tb
    public final synchronized Tb a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Tb
    public final Tb a(String str, long j) {
        a(str, Long.valueOf(j));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Tb
    public final synchronized Tb a(int i, String str) {
        a(str, Integer.valueOf(i));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Tb
    public final Tb a(String str, boolean z) {
        a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Tb
    public final Tb a(String str, float f) {
        a(str, Float.valueOf(f));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Tb
    public final boolean a(String str) {
        boolean containsKey;
        synchronized (this.a) {
            c();
            containsKey = this.a.containsKey(str);
        }
        return containsKey;
    }

    @Override // io.appmetrica.analytics.impl.Tb
    public final Set a() {
        HashSet hashSet;
        synchronized (this.a) {
            hashSet = new HashSet(this.a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.a) {
            c();
            this.a.put(str, obj);
        }
        synchronized (this.d) {
            this.b.put(str, obj);
            this.d.notifyAll();
        }
    }
}
