package u0;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.manager.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C4778f;
import v7.t;
import z0.C5247c;
import z0.C5253i;

/* renamed from: u0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5056f {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f41001m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f41002a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f41003b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f41004c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f41005d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f41006e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f41007f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C5253i f41008g;

    /* renamed from: h, reason: collision with root package name */
    public final o f41009h;
    public final C4778f i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f41010j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f41011k;

    /* renamed from: l, reason: collision with root package name */
    public final p3.b f41012l;

    public C5056f(WorkDatabase_Impl workDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.f41002a = workDatabase_Impl;
        this.f41003b = hashMap;
        this.f41009h = new o(strArr.length);
        kotlin.jvm.internal.h.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.i = new C4778f();
        this.f41010j = new Object();
        this.f41011k = new Object();
        this.f41004c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale US = Locale.US;
            kotlin.jvm.internal.h.d(US, "US");
            String lowerCase = str2.toLowerCase(US);
            kotlin.jvm.internal.h.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f41004c.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.f41003b.get(strArr[i]);
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
        this.f41005d = strArr2;
        for (Map.Entry entry : this.f41003b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale US2 = Locale.US;
            kotlin.jvm.internal.h.d(US2, "US");
            String lowerCase2 = str4.toLowerCase(US2);
            kotlin.jvm.internal.h.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f41004c.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(US2);
                kotlin.jvm.internal.h.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f41004c;
                linkedHashMap.put(lowerCase3, t.O(lowerCase2, linkedHashMap));
            }
        }
        this.f41012l = new p3.b(10, this);
    }

    public final boolean a() {
        C5247c c5247c = this.f41002a.f5366a;
        if (!kotlin.jvm.internal.h.a(c5247c != null ? Boolean.valueOf(c5247c.f42227n.isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.f41007f) {
            this.f41002a.h().R();
        }
        if (this.f41007f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(C5247c c5247c, int i) {
        c5247c.A("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f41005d[i];
        String[] strArr = f41001m;
        for (int i6 = 0; i6 < 3; i6++) {
            String str2 = strArr[i6];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + d6.c.h(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            kotlin.jvm.internal.h.d(str3, "StringBuilder().apply(builderAction).toString()");
            c5247c.A(str3);
        }
    }

    public final void c(C5247c database) {
        kotlin.jvm.internal.h.e(database, "database");
        if (database.C()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f41002a.f5373h.readLock();
            kotlin.jvm.internal.h.d(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.f41010j) {
                    int[] d2 = this.f41009h.d();
                    if (d2 != null) {
                        if (database.D()) {
                            database.j();
                        } else {
                            database.b();
                        }
                        try {
                            int length = d2.length;
                            int i = 0;
                            int i6 = 0;
                            while (i < length) {
                                int i9 = d2[i];
                                int i10 = i6 + 1;
                                if (i9 == 1) {
                                    b(database, i6);
                                } else if (i9 == 2) {
                                    String str = this.f41005d[i6];
                                    String[] strArr = f41001m;
                                    for (int i11 = 0; i11 < 3; i11++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + d6.c.h(str, strArr[i11]);
                                        kotlin.jvm.internal.h.d(str2, "StringBuilder().apply(builderAction).toString()");
                                        database.A(str2);
                                    }
                                }
                                i++;
                                i6 = i10;
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
