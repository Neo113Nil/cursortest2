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
    private static final String f17236a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f17237b;

    /* renamed from: c, reason: collision with root package name */
    private long f17238c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f17239d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Long> f17240e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, bh> f17241f = new ConcurrentHashMap();

    private b() {
    }

    public static b a() {
        if (f17237b == null) {
            synchronized (b.class) {
                try {
                    if (f17237b == null) {
                        f17237b = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17237b;
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
        a(str).f14421f = j6;
    }

    private void g(String str, long j6) {
        a(str).f14422g = j6;
    }

    public final long b() {
        long j6 = this.f17239d;
        if (j6 != 0) {
            long j9 = this.f17238c;
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
        a(str).f14420e = j6;
    }

    private void b(String str, long j6) {
        a(str).f14416a = j6;
    }

    private void c(String str, long j6) {
        a(str).f14418c = j6;
    }

    private void d(String str, long j6) {
        a(str).f14419d = j6;
    }

    public final void b(String str) {
        this.f17241f.remove(str);
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
                this.f17238c = currentTimeMillis;
            }
            nVar.m(currentTimeMillis);
        }
    }

    public final void a(u uVar, n nVar) {
        if (c(nVar)) {
            return;
        }
        String str = uVar.f14861c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!str.equals("1004634") || d(nVar)) {
            return;
        }
        this.f17239d = currentTimeMillis;
        this.f17240e.put(nVar.aI(), Long.valueOf(currentTimeMillis));
    }

    public final long a(n nVar) {
        if (TextUtils.isEmpty(nVar.aI())) {
            return 0L;
        }
        long b9 = nVar.b();
        Long l9 = this.f17240e.get(nVar.aI());
        if (l9 == null || l9.longValue() == 0 || b9 == 0) {
            return 0L;
        }
        return b9 - l9.longValue();
    }

    public static String a(x xVar) {
        return xVar.f14944d + "_ " + xVar.f14943c;
    }

    public final bh a(String str) {
        bh bhVar = this.f17241f.get(str);
        if (bhVar != null) {
            return bhVar;
        }
        synchronized (this.f17241f) {
            if (bhVar == null) {
                try {
                    bhVar = new bh();
                    this.f17241f.put(str, bhVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bhVar;
    }

    public final void a(String str, long j6) {
        a(str).f14417b = j6;
    }
}
