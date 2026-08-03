package b4;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import bc.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f966m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f967a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f968b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f969c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f970d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f971e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f972f;

    /* renamed from: g, reason: collision with root package name */
    public volatile i4.i f973g;

    /* renamed from: h, reason: collision with root package name */
    public final e f974h;

    /* renamed from: i, reason: collision with root package name */
    public final o.f f975i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f976j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f977k;

    /* renamed from: l, reason: collision with root package name */
    public final g f978l;

    public h(WorkDatabase_Impl workDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.f967a = workDatabase_Impl;
        this.f968b = hashMap;
        this.f974h = new e(strArr.length);
        pc.j.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f975i = new o.f();
        this.f976j = new Object();
        this.f977k = new Object();
        this.f969c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr[i10];
            Locale locale = Locale.US;
            pc.j.d(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            pc.j.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f969c.put(lowerCase, Integer.valueOf(i10));
            String str3 = (String) this.f968b.get(strArr[i10]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                pc.j.d(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i10] = lowerCase;
        }
        this.f970d = strArr2;
        for (Map.Entry entry : this.f968b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            pc.j.d(locale2, "US");
            String lowerCase2 = str4.toLowerCase(locale2);
            pc.j.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f969c.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                pc.j.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f969c;
                linkedHashMap.put(lowerCase3, z.N(linkedHashMap, lowerCase2));
            }
        }
        this.f978l = new g(0, this);
    }

    public final boolean a() {
        i4.c cVar = this.f967a.f754a;
        if (!pc.j.a(cVar != null ? Boolean.valueOf(cVar.f3173g.isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.f972f) {
            this.f967a.h().t();
        }
        if (this.f972f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(i4.c cVar, int i10) {
        cVar.g("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f970d[i10];
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = f966m[i11];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + v6.a.H(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            pc.j.d(str3, "StringBuilder().apply(builderAction).toString()");
            cVar.g(str3);
        }
    }

    public final void c(i4.c cVar) {
        pc.j.e(cVar, "database");
        if (cVar.j()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f967a.f761h.readLock();
            pc.j.d(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.f976j) {
                    int[] b2 = this.f974h.b();
                    if (b2 != null) {
                        if (cVar.k()) {
                            cVar.b();
                        } else {
                            cVar.a();
                        }
                        try {
                            int length = b2.length;
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < length) {
                                int i12 = b2[i10];
                                int i13 = i11 + 1;
                                if (i12 == 1) {
                                    b(cVar, i11);
                                } else if (i12 == 2) {
                                    String str = this.f970d[i11];
                                    String[] strArr = f966m;
                                    for (int i14 = 0; i14 < 3; i14++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + v6.a.H(str, strArr[i14]);
                                        pc.j.d(str2, "StringBuilder().apply(builderAction).toString()");
                                        cVar.g(str2);
                                    }
                                }
                                i10++;
                                i11 = i13;
                            }
                            cVar.o();
                            cVar.f();
                        } catch (Throwable th) {
                            cVar.f();
                            throw th;
                        }
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
