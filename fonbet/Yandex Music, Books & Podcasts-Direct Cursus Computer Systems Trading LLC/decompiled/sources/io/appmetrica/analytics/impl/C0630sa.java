package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.sa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0630sa {
    public final C0637sh a;
    public final Hr b;
    public final Tn c;
    public final E7 d;
    public final P9 e;
    public final Kn f;
    public final C0476n0 g;
    public final R5 h;
    public final TimeProvider i;
    public final int j;
    public long k;
    public int l;

    public C0630sa(C0637sh c0637sh, Hr hr, Tn tn, E7 e7, C0476n0 c0476n0, P9 p9, Kn kn, int i, R5 r5, SystemTimeProvider systemTimeProvider) {
        this.a = c0637sh;
        this.b = hr;
        this.c = tn;
        this.d = e7;
        this.g = c0476n0;
        this.e = p9;
        this.f = kn;
        this.j = i;
        this.i = systemTimeProvider;
        this.h = r5;
        this.k = c0637sh.i();
        this.l = c0637sh.h();
    }

    public final void a(H6 h6, Vn vn) {
        long optLong;
        Map map = h6.p;
        Kn kn = this.f;
        kn.getClass();
        map.putAll(new HashMap(kn.b));
        h6.c(this.a.j());
        h6.o = Integer.valueOf(this.b.b());
        C0447m0 a = this.g.a();
        P9 p9 = this.e;
        p9.getClass();
        O9 o9 = (O9) p9.b.a(EnumC0603rc.a(h6.d));
        E7 e7 = this.d;
        H9 a2 = o9.a(h6);
        int i = h6.d;
        Hr hr = this.b;
        C0109a8 c0109a8 = new C0109a8(e7.g, vn, i, hr, a2, (Nj) e7.h.k.a(), a);
        Long valueOf = Long.valueOf(vn.a);
        Xn xn = vn.d;
        Long valueOf2 = Long.valueOf(vn.b);
        EnumC0603rc a3 = EnumC0603rc.a(c0109a8.h.d);
        long j = 0;
        if (!Ea.g.contains(EnumC0603rc.a(i))) {
            synchronized (hr) {
                JSONObject a4 = hr.a.a();
                optLong = a4.optLong("global_number", 0L);
                hr.a.a(a4.put("global_number", optLong + 1));
            }
            j = optLong;
        }
        e7.a(e7.l.fromModel(new X7(valueOf, xn, valueOf2, a3, Long.valueOf(j), Long.valueOf(vn.c), c0109a8.a())));
        this.h.a.h();
    }
}
