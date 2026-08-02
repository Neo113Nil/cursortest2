package com.yandex.plus.core.benchmark.pulse;

import com.yandex.plus.bdui.plus.shared.serializer.d;
import com.yandex.plus.core.benchmark.m;
import defpackage.btf;
import defpackage.jyr;
import defpackage.tlm;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class c implements m {
    public static final jyr c;
    public static final jyr d;
    public static final c e;
    public final long a;
    public final TimeUnit b;

    static {
        jyr b = btf.b(new d(10));
        c = b;
        d = btf.b(new d(11));
        e = (c) b.getValue();
    }

    public c(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.a = j;
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(50) + ((this.b.hashCode() + tlm.c(this.a, Long.hashCode(1L) * 31, 31)) * 31);
    }

    public final String toString() {
        return "PulseBenchmarkParams(min=1, max=" + this.a + ", timeUnit=" + this.b + ", numBuckets=50)";
    }
}
