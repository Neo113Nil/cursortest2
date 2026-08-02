package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.de, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0276de extends AbstractC0318f {
    public C0276de(Context context, C0482kj c0482kj) {
        super(context, c0482kj);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0318f
    public final void b(K6 k6, C0468k5 c0468k5) {
        boolean booleanValue = ((Boolean) WrapUtils.getOrDefault(c0468k5.b.b, Boolean.TRUE)).booleanValue();
        Ad m = Jb.I.m();
        m.a(booleanValue);
        m.a(c0468k5.b.c);
        Boolean bool = c0468k5.b.n;
        if (bool != null) {
            Jb.I.c().b(bool.booleanValue());
        }
        this.b.a(k6, c0468k5);
    }
}
