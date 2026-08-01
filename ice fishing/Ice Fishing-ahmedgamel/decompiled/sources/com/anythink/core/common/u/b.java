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
    private static final String f16449a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f16450b;

    /* renamed from: c, reason: collision with root package name */
    private long f16451c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f16452d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Long> f16453e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, bh> f16454f = new ConcurrentHashMap();

    private b() {
    }

    public static b a() {
        if (f16450b == null) {
            synchronized (b.class) {
                try {
                    if (f16450b == null) {
                        f16450b = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16450b;
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

    private void f(String str, long j6) {
        a(str).f13635f = j6;
    }

    private void g(String str, long j6) {
        a(str).f13636g = j6;
    }

    public final long b() {
        long j6 = this.f16452d;
        if (j6 != 0) {
            long j9 = this.f16451c;
            if (j9 != 0) {
                return j9 - j6;
            }
        }
        return 0L;
    }

    public static long b(n nVar) {
        return nVar.c() - nVar.b();
    }

    private void e(String str, long j6) {
        a(str).f13634e = j6;
    }

    private void b(String str, long j6) {
        a(str).f13630a = j6;
    }

    private void c(String str, long j6) {
        a(str).f13632c = j6;
    }

    private void d(String str, long j6) {
        a(str).f13633d = j6;
    }

    public final void b(String str) {
        this.f16454f.remove(str);
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
                this.f16451c = currentTimeMillis;
            }
            nVar.m(currentTimeMillis);
        }
    }

    public final void a(u uVar, n nVar) {
        if (c(nVar)) {
            return;
        }
        String str = uVar.f14075c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!str.equals("1004634") || d(nVar)) {
            return;
        }
        this.f16452d = currentTimeMillis;
        this.f16453e.put(nVar.aI(), Long.valueOf(currentTimeMillis));
    }

    public final long a(n nVar) {
        if (TextUtils.isEmpty(nVar.aI())) {
            return 0L;
        }
        long b9 = nVar.b();
        Long l9 = this.f16453e.get(nVar.aI());
        if (l9 == null || l9.longValue() == 0 || b9 == 0) {
            return 0L;
        }
        return b9 - l9.longValue();
    }

    public static String a(x xVar) {
        return xVar.f14158d + "_ " + xVar.f14157c;
    }

    public final bh a(String str) {
        bh bhVar = this.f16454f.get(str);
        if (bhVar != null) {
            return bhVar;
        }
        synchronized (this.f16454f) {
            if (bhVar == null) {
                try {
                    bhVar = new bh();
                    this.f16454f.put(str, bhVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bhVar;
    }

    public final void a(String str, long j6) {
        a(str).f13631b = j6;
    }
}
