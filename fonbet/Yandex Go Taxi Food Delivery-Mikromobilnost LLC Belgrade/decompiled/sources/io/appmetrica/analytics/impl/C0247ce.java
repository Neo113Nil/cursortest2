package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.ce, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0247ce implements InterfaceC0180a5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0180a5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0276de a(Context context, Y5 y5, J4 j4, C0468k5 c0468k5) {
        C0482kj c0482kj;
        C0304ee c0304ee = new C0304ee(j4.b, j4.a);
        C0511lj c0511lj = new C0511lj(new C0362ge());
        synchronized (y5) {
            c0482kj = (C0482kj) y5.a(c0304ee, c0468k5, c0511lj, y5.a);
        }
        return new C0276de(context, c0482kj);
    }
}
