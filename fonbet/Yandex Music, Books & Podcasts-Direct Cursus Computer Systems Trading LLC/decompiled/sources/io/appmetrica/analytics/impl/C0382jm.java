package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.jm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0382jm implements W4 {
    @Override // io.appmetrica.analytics.impl.W4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0267fm a(@NotNull Context context, @NotNull V5 v5, @NotNull F4 f4, @NotNull C0279g5 c0279g5) {
        C0235ej c0235ej;
        H5 h5 = new H5(f4.b, f4.a);
        synchronized (v5) {
            c0235ej = (C0235ej) v5.a.get(h5.toString());
        }
        return new C0267fm(c0235ej);
    }
}
