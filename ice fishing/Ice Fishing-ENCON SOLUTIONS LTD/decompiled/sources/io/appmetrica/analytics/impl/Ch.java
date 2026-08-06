package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Ch implements InterfaceC0423g4 {

    /* renamed from: a, reason: collision with root package name */
    public final Y4 f4266a;

    public Ch(Y4 y4) {
        this.f4266a = y4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0423g4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Ag a(Context context, C0347d5 c0347d5, P3 p3, C0656p4 c0656p4) {
        Bg bg;
        Q4 q4 = new Q4(p3.f4900b, p3.f4899a);
        Cg cg = new Cg(this.f4266a);
        synchronized (c0347d5) {
            bg = (Bg) c0347d5.a(q4, c0656p4, cg, c0347d5.f5785a);
        }
        return new Ag(context, bg);
    }
}
