package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.pn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0557pn implements InterfaceC0519oe {
    @Override // io.appmetrica.analytics.impl.InterfaceC0519oe
    public final void a(@NotNull Context context) {
        Vp vp = (Vp) Tp.a(C0501np.class);
        ProtobufStateStorage<Object> a = vp.a(context, vp.b(context));
        C0501np c0501np = (C0501np) a.read();
        C0472mp a2 = c0501np.a(c0501np.m);
        a2.o = 0L;
        a.save(new C0501np(a2));
    }
}
