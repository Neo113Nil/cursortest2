package io.appmetrica.analytics.locationinternal.impl;

import androidx.annotation.NonNull;
import defpackage.eta;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.c2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0859c2 extends BaseRequestConfig {
    public C0887k1 a;
    public List b;

    public final List<String> b() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestConfig{locationFlushingArguments=");
        sb.append(this.a);
        sb.append(", hosts=");
        return eta.h(sb, this.b, '}');
    }

    public final void a(@NonNull C0887k1 c0887k1) {
        this.a = c0887k1;
    }

    public final void a(@NonNull List<String> list) {
        this.b = list;
    }

    public final C0887k1 a() {
        return this.a;
    }
}
