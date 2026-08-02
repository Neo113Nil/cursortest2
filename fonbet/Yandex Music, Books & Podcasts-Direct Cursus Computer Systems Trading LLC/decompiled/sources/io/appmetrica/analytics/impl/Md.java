package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Md implements W4 {
    @Override // io.appmetrica.analytics.impl.W4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Nd a(@NotNull Context context, @NotNull V5 v5, @NotNull F4 f4, @NotNull C0279g5 c0279g5) {
        C0235ej c0235ej;
        Od od = new Od(f4.b, f4.a);
        C0264fj c0264fj = new C0264fj(new Rd());
        synchronized (v5) {
            c0235ej = (C0235ej) v5.a(od, c0279g5, c0264fj, v5.a);
        }
        return new Nd(context, c0235ej);
    }
}
