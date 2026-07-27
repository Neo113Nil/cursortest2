package com.anythink.core.common.u;

import android.text.TextUtils;
import com.anythink.core.common.h.bh;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.u;
import com.anythink.core.common.h.x;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16607a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f16608b;

    /* renamed from: c, reason: collision with root package name */
    private long f16609c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f16610d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Long> f16611e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, bh> f16612f = new ConcurrentHashMap();

    private b() {
    }

    public static b a() {
        if (f16608b == null) {
            synchronized (b.class) {
                try {
                    if (f16608b == null) {
                        f16608b = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16608b;
    }

    private static boolean c(n nVar) {
        return nVar == null || TextUtils.isEmpty(nVar.aI()) || TextUtils.isEmpty(nVar.z());
    }

    private boolean d(n nVar) {
        try {
            String aK = nVar.aK();
            if (TextUtils.isEmpty(aK)) {
                return false;
            }
            return aK.equals("0");
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private static boolean e(n nVar) {
        return nVar.Y() == 66;
    }

    private void f(String str, long j9) {
        a(str).f13792f = j9;
    }

    private void g(String str, long j9) {
        a(str).f13793g = j9;
    }

    public final long b() {
        long j9 = this.f16610d;
        if (j9 != 0) {
            long j10 = this.f16609c;
            if (j10 != 0) {
                return j10 - j9;
            }
        }
        return 0L;
    }

    public static long b(n nVar) {
        return nVar.c() - nVar.b();
    }

    private void e(String str, long j9) {
        a(str).f13791e = j9;
    }

    private void b(String str, long j9) {
        a(str).f13787a = j9;
    }

    private void c(String str, long j9) {
        a(str).f13789c = j9;
    }

    private void d(String str, long j9) {
        a(str).f13790d = j9;
    }

    public final void b(String str) {
        this.f16612f.remove(str);
    }

    public final void a(int i, n nVar) {
        if (c(nVar)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (i != 4) {
            if (i != 6) {
                return;
            }
            nVar.n(currentTimeMillis);
        } else {
            if (!d(nVar)) {
                this.f16609c = currentTimeMillis;
            }
            nVar.m(currentTimeMillis);
        }
    }

    public final void a(u uVar, n nVar) {
        if (c(nVar)) {
            return;
        }
        String str = uVar.f14232c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!str.equals("1004634") || d(nVar)) {
            return;
        }
        this.f16610d = currentTimeMillis;
        this.f16611e.put(nVar.aI(), Long.valueOf(currentTimeMillis));
    }

    public final long a(n nVar) {
        if (TextUtils.isEmpty(nVar.aI())) {
            return 0L;
        }
        long b9 = nVar.b();
        Long l9 = this.f16611e.get(nVar.aI());
        if (l9 == null || l9.longValue() == 0 || b9 == 0) {
            return 0L;
        }
        return b9 - l9.longValue();
    }

    public static String a(x xVar) {
        return xVar.f14315d + "_ " + xVar.f14314c;
    }

    public final bh a(String str) {
        bh bhVar = this.f16612f.get(str);
        if (bhVar != null) {
            return bhVar;
        }
        synchronized (this.f16612f) {
            if (bhVar == null) {
                try {
                    bhVar = new bh();
                    this.f16612f.put(str, bhVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bhVar;
    }

    public final void a(String str, long j9) {
        a(str).f13788b = j9;
    }
}
