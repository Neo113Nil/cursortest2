package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.pk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0628pk implements InterfaceC0180a5 {
    public final T5 a;

    public C0628pk(T5 t5) {
        this.a = t5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0180a5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0453jj a(Context context, Y5 y5, J4 j4, C0468k5 c0468k5) {
        C0482kj c0482kj;
        K5 k5 = new K5(j4.b, j4.a);
        C0511lj c0511lj = new C0511lj(this.a);
        synchronized (y5) {
            c0482kj = (C0482kj) y5.a(k5, c0468k5, c0511lj, y5.a);
        }
        return new C0453jj(context, c0482kj);
    }
}
