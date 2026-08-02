package com.yandex.plus.bdui.plus.benchmarks;

import com.yandex.passport.internal.ui.challenge.vpn.c;
import com.yandex.plus.bdui.content.b;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.benchmark.l;
import com.yandex.plus.core.benchmark.r;
import com.yandex.plus.core.benchmark.u;
import com.yandex.plus.core.benchmark.x;
import defpackage.btf;
import defpackage.jyr;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public final class a implements u {
    public final x a;
    public final jyr b;
    public final jyr c;

    public a(x xVar, ArrayList arrayList, r rVar) {
        xVar.getClass();
        this.a = xVar;
        this.b = btf.b(new b(3, arrayList, this));
        this.c = btf.b(new b(4, rVar, this));
    }

    @Override // com.yandex.plus.core.benchmark.u
    public final l b(String str) {
        str.getClass();
        return (l) r1.e((ConcurrentMap) this.b.getValue(), str, new c(1, this.a, x.class, "getBenchmark", "getBenchmark(Ljava/lang/String;)Lcom/yandex/plus/core/benchmark/Benchmark;", 0, 13));
    }
}
