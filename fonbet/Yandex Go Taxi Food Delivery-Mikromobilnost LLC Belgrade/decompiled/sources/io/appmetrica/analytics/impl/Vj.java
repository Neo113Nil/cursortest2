package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Vj extends H6 {
    public final S5 b;
    public final Uj c;
    public final C0785v4 d;

    public Vj(S5 s5, Uj uj, C0785v4 c0785v4) {
        super(s5.getContext(), s5.a().c());
        this.b = s5;
        this.c = uj;
        this.d = c0785v4;
    }

    public final Xj a() {
        return new Xj(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.H6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Xj load(G6 g6) {
        Xj xj = (Xj) super.load(g6);
        xj.m = ((Sj) g6.componentArguments).a;
        xj.r = this.b.t.a();
        xj.w = this.b.q.a();
        Sj sj = (Sj) g6.componentArguments;
        xj.d = sj.b;
        xj.e = sj.c;
        xj.f = sj.d;
        xj.i = sj.e;
        xj.g = sj.f;
        xj.h = sj.g;
        Boolean valueOf = Boolean.valueOf(sj.h);
        Uj uj = this.c;
        xj.j = valueOf;
        xj.k = uj;
        Sj sj2 = (Sj) g6.componentArguments;
        xj.v = sj2.j;
        Bp bp = g6.a;
        C0353g5 c0353g5 = bp.o;
        xj.n = c0353g5.a;
        C0480kh c0480kh = bp.t;
        if (c0480kh != null) {
            xj.s = c0480kh.a;
            xj.t = c0480kh.b;
        }
        xj.o = c0353g5.b;
        xj.q = bp.e;
        xj.p = bp.l;
        C0785v4 c0785v4 = this.d;
        Map<String, String> map = sj2.i;
        C0698s4 f = Jb.I.f();
        c0785v4.getClass();
        xj.u = C0785v4.a(map, bp, f);
        xj.x = this.b.v.e.keySet();
        xj.y = this.b.c() == CounterConfigurationReporterType.MAIN;
        return xj;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new Xj(this.b);
    }

    public Vj(S5 s5, Uj uj) {
        this(s5, uj, new C0785v4());
    }
}
