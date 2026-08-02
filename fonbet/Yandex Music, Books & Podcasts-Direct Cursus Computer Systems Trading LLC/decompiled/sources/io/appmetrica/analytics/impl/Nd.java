package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes5.dex */
public final class Nd extends AbstractC0244f {
    public Nd(Context context, C0235ej c0235ej) {
        super(context, c0235ej);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0244f
    public final void b(@NonNull H6 h6, @NonNull C0279g5 c0279g5) {
        boolean booleanValue = ((Boolean) WrapUtils.getOrDefault(c0279g5.b.b, Boolean.TRUE)).booleanValue();
        InterfaceC0402kd m = C0747wb.I.m();
        m.a(booleanValue);
        m.a(c0279g5.b.c);
        Boolean bool = c0279g5.b.n;
        if (bool != null) {
            C0747wb.I.c().b(bool.booleanValue());
        }
        this.b.a(h6, c0279g5);
    }
}
