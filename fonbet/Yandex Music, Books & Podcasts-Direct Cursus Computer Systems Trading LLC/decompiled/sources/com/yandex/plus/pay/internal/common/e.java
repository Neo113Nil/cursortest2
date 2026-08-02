package com.yandex.plus.pay.internal.common;

import com.yandex.plus.core.analytics.h;
import com.yandex.plus.core.analytics.k;
import com.yandex.plus.core.analytics.m;
import com.yandex.plus.core.analytics.o;
import defpackage.btf;
import defpackage.jyr;
import defpackage.u75;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class e implements h {
    public final List a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;

    public e(h... hVarArr) {
        List h = u75.h(Arrays.copyOf(hVarArr, hVarArr.length));
        h.getClass();
        this.a = h;
        this.b = btf.b(new com.yandex.plus.pay.internal.c(this, 1));
        this.c = btf.b(new com.yandex.plus.pay.internal.c(this, 2));
        this.d = btf.b(new com.yandex.plus.pay.internal.c(this, 3));
        this.e = btf.b(new com.yandex.plus.pay.internal.c(this, 4));
        this.f = btf.b(new com.yandex.plus.pay.internal.c(this, 5));
        this.g = btf.b(new com.yandex.plus.pay.internal.c(this, 6));
    }

    @Override // com.yandex.plus.core.analytics.h
    public final com.yandex.plus.core.analytics.e a() {
        return new a(this);
    }

    @Override // com.yandex.plus.core.analytics.h
    public final k b() {
        return new c(this);
    }

    @Override // com.yandex.plus.core.analytics.d
    public final com.yandex.plus.core.analytics.c d() {
        return new com.yandex.plus.core.analytics.metrica.a(this);
    }

    @Override // com.yandex.plus.core.analytics.h
    public final o e() {
        return new com.yandex.plus.core.analytics.metrica.g(this);
    }

    @Override // com.yandex.plus.core.analytics.h
    public final m f() {
        return new d(this);
    }

    @Override // com.yandex.plus.core.analytics.h
    public final com.yandex.plus.core.analytics.f getEventReporter() {
        return new b(this);
    }
}
