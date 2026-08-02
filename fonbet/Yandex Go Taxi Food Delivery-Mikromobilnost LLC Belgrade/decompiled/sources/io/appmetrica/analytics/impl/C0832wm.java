package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0832wm implements InterfaceC0180a5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0180a5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0803vm a(Context context, Y5 y5, J4 j4, C0468k5 c0468k5) {
        C0482kj c0482kj;
        C0304ee c0304ee = new C0304ee(j4.b, j4.a);
        synchronized (y5) {
            c0482kj = (C0482kj) y5.a.get(c0304ee.toString());
        }
        return new C0803vm(c0482kj);
    }
}
