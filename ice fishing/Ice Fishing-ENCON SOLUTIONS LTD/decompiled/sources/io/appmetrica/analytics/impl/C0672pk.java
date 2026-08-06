package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.pk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0672pk implements Ic {
    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(Context context) {
        Rm rm = (Rm) Pm.a(C0518jm.class);
        ProtobufStateStorage<Object> a2 = rm.a(context, rm.b(context));
        C0518jm c0518jm = (C0518jm) a2.read();
        C0492im a3 = c0518jm.a(c0518jm.f6318m);
        a3.f6217o = 0L;
        a2.save(new C0518jm(a3));
    }
}
