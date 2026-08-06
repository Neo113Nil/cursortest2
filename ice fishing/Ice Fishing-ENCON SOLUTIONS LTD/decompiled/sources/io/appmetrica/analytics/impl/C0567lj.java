package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567lj implements InterfaceC0423g4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0423g4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0464hj a(Context context, C0347d5 c0347d5, P3 p3, C0656p4 c0656p4) {
        Bg bg;
        Q4 q4 = new Q4(p3.f4900b, p3.f4899a);
        synchronized (c0347d5) {
            bg = (Bg) c0347d5.f5785a.get(q4.toString());
        }
        return new C0464hj(bg);
    }
}
