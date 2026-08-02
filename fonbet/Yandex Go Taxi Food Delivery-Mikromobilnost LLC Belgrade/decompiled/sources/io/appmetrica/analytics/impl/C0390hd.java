package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.nq6;
import defpackage.oyr;
import defpackage.ymp0;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.buffering.DeferredBatchExecutor;
import io.appmetrica.analytics.coreutils.internal.buffering.MapMergingBuffer;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.hd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0390hd implements InterfaceC0418ic, Closeable {
    public static final C0361gd g = new C0361gd();
    public final String a;
    public final InterfaceC0817w7 b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final Object d = new Object();
    public volatile boolean e;
    public final DeferredBatchExecutor f;

    public C0390hd(String str, InterfaceC0817w7 interfaceC0817w7, IHandlerExecutor iHandlerExecutor) {
        this.a = str;
        this.b = interfaceC0817w7;
        this.f = new DeferredBatchExecutor(iHandlerExecutor, new MapMergingBuffer(), new nq6(2, this), 1000L, oyr.p("[KeyValueTableDbHelper-(", str, ")]"));
        iHandlerExecutor.execute(new ymp0(20, this));
    }

    public static final void a(C0390hd c0390hd, List list) {
        SQLiteDatabase sQLiteDatabase;
        Map map = (Map) kotlin.collections.a.P(list);
        c0390hd.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            if (value == c0390hd) {
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
            arrayList.add(contentValues);
        }
        ContentValues[] contentValuesArr = (ContentValues[]) arrayList.toArray(new ContentValues[0]);
        if (contentValuesArr == null) {
            return;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = c0390hd.b.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    try {
                        defpackage.h8 h8Var = new defpackage.h8(1, contentValuesArr);
                        while (h8Var.hasNext()) {
                            ContentValues contentValues2 = (ContentValues) h8Var.next();
                            if (contentValues2.getAsString("value") == null) {
                                sQLiteDatabase.delete(c0390hd.a, "key = ?", new String[]{contentValues2.getAsString("key")});
                            } else {
                                sQLiteDatabase.insertWithOnConflict(c0390hd.a, null, contentValues2, 5);
                            }
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        Or.a(sQLiteDatabase);
                    } catch (Throwable th) {
                        Or.a(sQLiteDatabase);
                        throw th;
                    }
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    c0390hd.b.a(sQLiteDatabase);
                }
            }
        } catch (Throwable unused2) {
        }
        c0390hd.b.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final Set<String> b() {
        HashSet hashSet;
        synchronized (this.d) {
            hashSet = new HashSet(this.c.keySet());
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        SQLiteDatabase sQLiteDatabase;
        String str;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = this.b.a();
            if (sQLiteDatabase != null) {
                try {
                    Cursor query = sQLiteDatabase.query(this.a, new String[]{"key", "value", "type"}, null, null, null, null, null);
                    if (query != null) {
                        while (query.moveToNext()) {
                            try {
                                String string = query.getString(query.getColumnIndexOrThrow("key"));
                                String string2 = query.getString(query.getColumnIndexOrThrow("value"));
                                int i = query.getInt(query.getColumnIndexOrThrow("type"));
                                if (string != null && string.length() != 0) {
                                    if (i != 1) {
                                        if (i == 2) {
                                            str = ParseUtils.parseInt(string2);
                                        } else if (i != 3) {
                                            str = string2;
                                            if (i != 4) {
                                                str = i != 5 ? null : ParseUtils.parseFloat(string2);
                                            }
                                        } else {
                                            str = ParseUtils.parseLong(string2);
                                        }
                                        if (str == null) {
                                            this.c.put(string, str);
                                        }
                                    } else {
                                        if (jl40.l(string2, "true")) {
                                            str = Boolean.TRUE;
                                        } else {
                                            if (jl40.l(string2, "false")) {
                                                str = Boolean.FALSE;
                                            }
                                        }
                                        if (str == null) {
                                        }
                                    }
                                }
                            } finally {
                            }
                        }
                        query.close();
                    }
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    this.b.a(sQLiteDatabase);
                }
            }
        } catch (Throwable unused2) {
        }
        this.b.a(sQLiteDatabase);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.flush();
    }

    public final void d() {
        if (this.e) {
            return;
        }
        try {
            this.d.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final void flushAsync() {
        this.f.flushAsync();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final boolean getBoolean(String str, boolean z) {
        Object b = b(str);
        return b instanceof Boolean ? ((Boolean) b).booleanValue() : z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final int getInt(String str, int i) {
        Object b = b(str);
        return b instanceof Integer ? ((Number) b).intValue() : i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final long getLong(String str, long j) {
        Object b = b(str);
        return b instanceof Long ? ((Number) b).longValue() : j;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final String getString(String str, String str2) {
        Object b = b(str);
        return b instanceof String ? (String) b : str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final InterfaceC0418ic remove(String str) {
        synchronized (this.d) {
            d();
            this.c.remove(str);
        }
        DeferredBatchExecutor.submit$default(this.f, gw00.e(new Pair(str, this)), false, 2, null);
        return this;
    }

    public final float b(String str, float f) {
        Object b = b(str);
        return b instanceof Float ? ((Number) b).floatValue() : f;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.d) {
            d();
            obj = this.c.get(str);
        }
        return obj;
    }

    public static final void a(C0390hd c0390hd) {
        synchronized (c0390hd.d) {
            c0390hd.c();
            c0390hd.e = true;
            c0390hd.d.notifyAll();
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final void a() {
        this.f.flush();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final InterfaceC0418ic a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final InterfaceC0418ic a(String str, long j) {
        a(str, Long.valueOf(j));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final InterfaceC0418ic a(String str, int i) {
        a(str, Integer.valueOf(i));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final InterfaceC0418ic a(String str, boolean z) {
        a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final InterfaceC0418ic a(String str, float f) {
        a(str, Float.valueOf(f));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final boolean a(String str) {
        boolean containsKey;
        synchronized (this.d) {
            d();
            containsKey = this.c.containsKey(str);
        }
        return containsKey;
    }

    public final void a(String str, Object obj) {
        synchronized (this.d) {
            d();
            this.c.put(str, obj);
        }
        DeferredBatchExecutor.submit$default(this.f, gw00.e(new Pair(str, obj)), false, 2, null);
    }
}
