package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0296gm implements W4 {
    @Override // io.appmetrica.analytics.impl.W4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0267fm a(@NotNull Context context, @NotNull V5 v5, @NotNull F4 f4, @NotNull C0279g5 c0279g5) {
        C0235ej c0235ej;
        Od od = new Od(f4.b, f4.a);
        synchronized (v5) {
            c0235ej = (C0235ej) v5.a.get(od.toString());
        }
        return new C0267fm(c0235ej);
    }
}
