package io.appmetrica.analytics.locationinternal.impl;

import defpackage.unr0;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.c2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0936c2 extends BaseRequestConfig {
    public C0962k1 a;
    public List b;

    public final List<String> b() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestConfig{locationFlushingArguments=");
        sb.append(this.a);
        sb.append(", hosts=");
        return unr0.t(sb, this.b, '}');
    }

    public final void a(C0962k1 c0962k1) {
        this.a = c0962k1;
    }

    public final void a(List<String> list) {
        this.b = list;
    }

    public final C0962k1 a() {
        return this.a;
    }
}
