package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes9.dex */
public final class Qd implements InterfaceC0180a5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0180a5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0613p5 a(Context context, Y5 y5, J4 j4, C0468k5 c0468k5) {
        C0670r5 c0670r5;
        C0642q5 c0642q5 = new C0642q5(j4.b);
        C0699s5 c0699s5 = new C0699s5();
        synchronized (y5) {
            c0670r5 = (C0670r5) y5.a(c0642q5, c0468k5, c0699s5, y5.b);
        }
        return new C0613p5(context, c0670r5, c0468k5);
    }
}
