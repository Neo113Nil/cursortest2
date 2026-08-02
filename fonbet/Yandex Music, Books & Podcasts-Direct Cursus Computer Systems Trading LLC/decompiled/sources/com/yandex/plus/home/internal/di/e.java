package com.yandex.plus.home.internal.di;

/* loaded from: classes5.dex */
public final class e {
    public final com.yandex.plus.home.benchmark.d a;

    public e(com.yandex.plus.home.benchmark.d dVar) {
        this.a = dVar;
    }

    public final com.yandex.passport.internal.flags.experiments.p a(String str) {
        com.yandex.plus.home.benchmark.d dVar = this.a;
        return new com.yandex.passport.internal.flags.experiments.p(dVar.b(str), new com.yandex.plus.bdui.q(2, dVar, com.yandex.plus.home.benchmark.d.class, "trackBenchmark", "trackBenchmark(Lcom/yandex/plus/core/benchmark/Benchmark;Ljava/util/Map;)V", 0, 20));
    }
}
