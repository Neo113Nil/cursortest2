package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.lc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560lc implements InterfaceC0423g4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0423g4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0586mc a(Context context, C0347d5 c0347d5, P3 p3, C0656p4 c0656p4) {
        Bg bg;
        C0612nc c0612nc = new C0612nc(p3.f4900b, p3.f4899a);
        Cg cg = new Cg(new C0690qc());
        synchronized (c0347d5) {
            bg = (Bg) c0347d5.a(c0612nc, c0656p4, cg, c0347d5.f5785a);
        }
        return new C0586mc(context, bg);
    }
}
