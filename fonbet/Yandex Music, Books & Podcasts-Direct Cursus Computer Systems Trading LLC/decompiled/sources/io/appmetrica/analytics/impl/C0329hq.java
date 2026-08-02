package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.hq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0329hq implements Qq {
    public final Qq a;
    public final Object b;

    public C0329hq(@NonNull Qq qq, Object obj) {
        this.a = qq;
        this.b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Qq
    public final Object a(Object obj) {
        return obj != this.a.a(obj) ? this.b : obj;
    }
}
