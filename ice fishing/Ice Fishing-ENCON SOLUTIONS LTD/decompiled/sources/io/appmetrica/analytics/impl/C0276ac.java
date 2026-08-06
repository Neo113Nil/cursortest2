package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276ac implements InterfaceC0423g4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0423g4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0785u4 a(Context context, C0347d5 c0347d5, P3 p3, C0656p4 c0656p4) {
        C0863x4 c0863x4;
        C0811v4 c0811v4 = new C0811v4(p3.f4900b);
        C0889y4 c0889y4 = new C0889y4();
        synchronized (c0347d5) {
            c0863x4 = (C0863x4) c0347d5.a(c0811v4, c0656p4, c0889y4, c0347d5.f5786b);
        }
        return new C0785u4(context, c0863x4, c0656p4);
    }
}
