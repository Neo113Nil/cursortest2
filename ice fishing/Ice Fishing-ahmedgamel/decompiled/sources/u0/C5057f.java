package u0;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.manager.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C4794f;
import v7.t;
import z0.C5214c;
import z0.C5220i;

/* renamed from: u0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5057f {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f40963m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f40964a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f40965b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f40966c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f40967d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f40968e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f40969f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C5220i f40970g;

    /* renamed from: h, reason: collision with root package name */
    public final n f40971h;
    public final C4794f i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f40972j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f40973k;

    /* renamed from: l, reason: collision with root package name */
    public final r3.b f40974l;

    public C5057f(WorkDatabase_Impl workDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.f40964a = workDatabase_Impl;
        this.f40965b = hashMap;
        this.f40971h = new n(strArr.length);
        kotlin.jvm.internal.h.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.i = new C4794f();
        this.f40972j = new Object();
        this.f40973k = new Object();
        this.f40966c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale US = Locale.US;
            kotlin.jvm.internal.h.d(US, "US");
            String lowerCase = str2.toLowerCase(US);
            kotlin.jvm.internal.h.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f40966c.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.f40965b.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(US);
                kotlin.jvm.internal.h.d(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.f40967d = strArr2;
        for (Map.Entry entry : this.f40965b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale US2 = Locale.US;
            kotlin.jvm.internal.h.d(US2, "US");
            String lowerCase2 = str4.toLowerCase(US2);
            kotlin.jvm.internal.h.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f40966c.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(US2);
                kotlin.jvm.internal.h.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f40966c;
                linkedHashMap.put(lowerCase3, t.s(lowerCase2, linkedHashMap));
            }
        }
        this.f40974l = new r3.b(8, this);
    }

    public final boolean a() {
        C5214c c5214c = this.f40964a.f5331a;
        if (!kotlin.jvm.internal.h.a(c5214c != null ? Boolean.valueOf(c5214c.f42198n.isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.f40969f) {
            this.f40964a.h().R();
        }
        if (this.f40969f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(C5214c c5214c, int i) {
        c5214c.A("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f40967d[i];
        String[] strArr = f40963m;
        for (int i4 = 0; i4 < 3; i4++) {
            String str2 = strArr[i4];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + d6.c.g(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            kotlin.jvm.internal.h.d(str3, "StringBuilder().apply(builderAction).toString()");
            c5214c.A(str3);
        }
    }

    public final void c(C5214c database) {
        kotlin.jvm.internal.h.e(database, "database");
        if (database.C()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f40964a.f5338h.readLock();
            kotlin.jvm.internal.h.d(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.f40972j) {
                    int[] d9 = this.f40971h.d();
                    if (d9 != null) {
                        if (database.D()) {
                            database.j();
                        } else {
                            database.b();
                        }
                        try {
                            int length = d9.length;
                            int i = 0;
                            int i4 = 0;
                            while (i < length) {
                                int i6 = d9[i];
                                int i9 = i4 + 1;
                                if (i6 == 1) {
                                    b(database, i4);
                                } else if (i6 == 2) {
                                    String str = this.f40967d[i4];
                                    String[] strArr = f40963m;
                                    for (int i10 = 0; i10 < 3; i10++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + d6.c.g(str, strArr[i10]);
                                        kotlin.jvm.internal.h.d(str2, "StringBuilder().apply(builderAction).toString()");
                                        database.A(str2);
                                    }
                                }
                                i++;
                                i4 = i9;
                            }
                            database.G();
                            database.z();
                        } catch (Throwable th) {
                            database.z();
                            throw th;
                        }
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException e9) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e9);
        } catch (IllegalStateException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        }
    }
}
