package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.k9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531k9 {

    /* renamed from: a, reason: collision with root package name */
    public final We f6355a;

    /* renamed from: b, reason: collision with root package name */
    public final C0883xo f6356b;

    /* renamed from: c, reason: collision with root package name */
    public final Rk f6357c;

    /* renamed from: d, reason: collision with root package name */
    public final L6 f6358d;

    /* renamed from: e, reason: collision with root package name */
    public final H8 f6359e;

    /* renamed from: f, reason: collision with root package name */
    public final Jk f6360f;

    /* renamed from: g, reason: collision with root package name */
    public final C0496j0 f6361g;

    /* renamed from: h, reason: collision with root package name */
    public final Z4 f6362h;

    /* renamed from: i, reason: collision with root package name */
    public final TimeProvider f6363i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6364j;

    /* renamed from: k, reason: collision with root package name */
    public long f6365k;

    /* renamed from: l, reason: collision with root package name */
    public int f6366l;

    public C0531k9(We we, C0883xo c0883xo, Rk rk, L6 l6, C0496j0 c0496j0, H8 h8, Jk jk, int i2, Z4 z4, SystemTimeProvider systemTimeProvider) {
        this.f6355a = we;
        this.f6356b = c0883xo;
        this.f6357c = rk;
        this.f6358d = l6;
        this.f6361g = c0496j0;
        this.f6359e = h8;
        this.f6360f = jk;
        this.f6364j = i2;
        this.f6363i = systemTimeProvider;
        this.f6362h = z4;
        this.f6365k = we.i();
        this.f6366l = we.h();
    }

    public final void a(P5 p5, Tk tk) {
        Map map = p5.f4919p;
        Jk jk = this.f6360f;
        jk.getClass();
        map.putAll(new HashMap(jk.f4605b));
        p5.c(this.f6355a.j());
        p5.f4918o = Integer.valueOf(this.f6356b.b());
        C0471i0 a2 = this.f6361g.a();
        H8 h8 = this.f6359e;
        h8.getClass();
        G8 g8 = (G8) h8.f4465b.a(EnumC0301bb.a(p5.f4907d));
        L6 l6 = this.f6358d;
        C0919z8 a3 = g8.a(p5);
        int i2 = p5.f4907d;
        C0883xo c0883xo = this.f6356b;
        C0452h7 c0452h7 = new C0452h7(l6.f4679g, tk, i2, c0883xo, a3, (C0539kh) l6.f4680h.f5356k.a(), a2);
        Long valueOf = Long.valueOf(tk.f5123a);
        Vk vk = tk.f5126d;
        Long valueOf2 = Long.valueOf(tk.f5124b);
        EnumC0301bb a4 = EnumC0301bb.a(c0452h7.f6126h.f4907d);
        long j2 = 0;
        if (!AbstractC0842w9.f7102g.contains(EnumC0301bb.a(i2))) {
            synchronized (c0883xo) {
                JSONObject a5 = c0883xo.f7214a.a();
                j2 = a5.optLong("global_number", 0L);
                c0883xo.f7214a.a(a5.put("global_number", 1 + j2));
            }
        }
        l6.a(l6.f4684l.fromModel(new C0374e7(valueOf, vk, valueOf2, a4, Long.valueOf(j2), Long.valueOf(tk.f5125c), c0452h7.a())));
        this.f6362h.f5466a.h();
    }
}
