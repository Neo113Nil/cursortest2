package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.cq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0185cq extends AbstractC0394k5 {
    public final Qq g;

    public C0185cq(@NonNull String str, @NonNull String str2, @NonNull Qq qq, @NonNull Cr cr, @NonNull AbstractC0796y3 abstractC0796y3) {
        super(0, str, str2, cr, abstractC0796y3);
        this.g = qq;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0394k5
    public final void a(@NonNull C0561pr c0561pr) {
        String str = (String) this.g.a((String) this.f);
        c0561pr.d.a = str == null ? new byte[0] : str.getBytes();
    }

    public final Qq h() {
        return this.g;
    }
}
