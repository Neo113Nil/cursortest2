package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* loaded from: classes9.dex */
public final class Qr implements InterfaceC0504lc {
    @Override // io.appmetrica.analytics.impl.InterfaceC0504lc
    public final String a(Context context) {
        Fp fp;
        try {
            InterfaceC0547mq a = C0518lq.a(Fp.class);
            if (a == null) {
                return null;
            }
            AbstractC0576nq abstractC0576nq = (AbstractC0576nq) a;
            ProtobufStateStorage<Object> a2 = abstractC0576nq.a(context, abstractC0576nq.a(context));
            if (a2 == null || (fp = (Fp) a2.read()) == null) {
                return null;
            }
            return fp.a;
        } catch (Throwable unused) {
            return null;
        }
    }
}
