package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.fk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0265fk implements W4 {
    public final Q5 a;

    public C0265fk(@NotNull Q5 q5) {
        this.a = q5;
    }

    @Override // io.appmetrica.analytics.impl.W4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0207dj a(@NotNull Context context, @NotNull V5 v5, @NotNull F4 f4, @NotNull C0279g5 c0279g5) {
        C0235ej c0235ej;
        H5 h5 = new H5(f4.b, f4.a);
        C0264fj c0264fj = new C0264fj(this.a);
        synchronized (v5) {
            c0235ej = (C0235ej) v5.a(h5, c0279g5, c0264fj, v5.a);
        }
        return new C0207dj(context, c0235ej);
    }
}
