package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Lj extends E6 {
    public final P5 b;
    public final Kj c;
    public final C0595r4 d;

    public Lj(P5 p5, Kj kj, C0595r4 c0595r4) {
        super(p5.getContext(), p5.b().c());
        this.b = p5;
        this.c = kj;
        this.d = c0595r4;
    }

    @NonNull
    public final Nj a() {
        return new Nj(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.E6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Nj load(@NonNull D6 d6) {
        Nj nj = (Nj) super.load(d6);
        nj.m = ((Ij) d6.componentArguments).a;
        nj.r = this.b.t.a();
        nj.w = this.b.q.a();
        Ij ij = (Ij) d6.componentArguments;
        nj.d = ij.b;
        nj.e = ij.c;
        nj.f = ij.d;
        nj.i = ij.e;
        nj.g = ij.f;
        nj.h = ij.g;
        Boolean valueOf = Boolean.valueOf(ij.h);
        Kj kj = this.c;
        nj.j = valueOf;
        nj.k = kj;
        Ij ij2 = (Ij) d6.componentArguments;
        nj.v = ij2.j;
        C0385jp c0385jp = d6.a;
        C0164c5 c0164c5 = c0385jp.o;
        nj.n = c0164c5.a;
        Ug ug = c0385jp.t;
        if (ug != null) {
            nj.s = ug.a;
            nj.t = ug.b;
        }
        nj.o = c0164c5.b;
        nj.q = c0385jp.e;
        nj.p = c0385jp.l;
        C0595r4 c0595r4 = this.d;
        Map<String, String> map = ij2.i;
        C0509o4 f = C0747wb.I.f();
        c0595r4.getClass();
        nj.u = C0595r4.a(map, c0385jp, f);
        nj.x = this.b.v.e.keySet();
        return nj;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new Nj(this.b);
    }

    public Lj(@NonNull P5 p5, @NonNull Kj kj) {
        this(p5, kj, new C0595r4());
    }
}
