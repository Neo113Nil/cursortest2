package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* loaded from: classes9.dex */
public final class Hn implements De {
    @Override // io.appmetrica.analytics.impl.De
    public final void a(Context context) {
        AbstractC0576nq abstractC0576nq = (AbstractC0576nq) C0518lq.a(Fp.class);
        ProtobufStateStorage<Object> a = abstractC0576nq.a(context, abstractC0576nq.b(context));
        Fp fp = (Fp) a.read();
        Ep a2 = fp.a(fp.m);
        a2.o = 0L;
        a.save(new Fp(a2));
    }
}
