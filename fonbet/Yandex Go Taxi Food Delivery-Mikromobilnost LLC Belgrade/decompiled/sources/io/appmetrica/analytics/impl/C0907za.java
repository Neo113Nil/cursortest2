package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.za, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0907za {
    public final Ih a;
    public final as b;
    public final C0574no c;
    public final I7 d;
    public final W9 e;
    public final Cdo f;
    public final C0608p0 g;
    public final U5 h;
    public final TimeProvider i;
    public final int j;
    public long k;
    public int l;

    public C0907za(Ih ih, as asVar, C0574no c0574no, I7 i7, C0608p0 c0608p0, W9 w9, Cdo cdo, int i, U5 u5, SystemTimeProvider systemTimeProvider) {
        this.a = ih;
        this.b = asVar;
        this.c = c0574no;
        this.d = i7;
        this.g = c0608p0;
        this.e = w9;
        this.f = cdo;
        this.j = i;
        this.i = systemTimeProvider;
        this.h = u5;
        this.k = ih.i();
        this.l = ih.h();
    }

    public final void a(K6 k6, C0661qo c0661qo) {
        long optLong;
        Map map = k6.p;
        Cdo cdo = this.f;
        cdo.getClass();
        map.putAll(new HashMap(cdo.b));
        k6.c(this.a.j());
        k6.o = Integer.valueOf(this.b.b());
        C0579o0 a = this.g.a();
        W9 w9 = this.e;
        w9.getClass();
        V9 v9 = (V9) w9.b.a(Hc.a(k6.d));
        I7 i7 = this.d;
        N9 a2 = v9.a(k6);
        int i = k6.d;
        as asVar = this.b;
        C0298e8 c0298e8 = new C0298e8(i7.d, c0661qo, i, asVar, a2, (Xj) i7.e.k.a(), a);
        Long valueOf = Long.valueOf(c0661qo.a);
        EnumC0718so enumC0718so = c0661qo.d;
        Long valueOf2 = Long.valueOf(c0661qo.b);
        Hc a3 = Hc.a(c0298e8.h.d);
        long j = 0;
        if (!La.g.contains(Hc.a(i))) {
            synchronized (asVar) {
                JSONObject a4 = asVar.a.a();
                optLong = a4.optLong("global_number", 0L);
                asVar.a.a(a4.put("global_number", optLong + 1));
            }
            j = optLong;
        }
        ContentValues fromModel = i7.i.fromModel(new C0212b8(valueOf, enumC0718so, valueOf2, a3, Long.valueOf(j), Long.valueOf(c0661qo.c), c0298e8.a()));
        Integer asInteger = fromModel.getAsInteger("type");
        asInteger.intValue();
        i7.j.b.submit(fromModel, AbstractC0924zr.a.contains(asInteger));
        this.h.a.h();
    }
}
