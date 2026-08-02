package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class xr implements Wb {
    @Override // io.appmetrica.analytics.impl.Wb
    public final String a(@NotNull Context context) {
        C0501np c0501np;
        try {
            Up a = Tp.a(C0501np.class);
            if (a == null) {
                return null;
            }
            Vp vp = (Vp) a;
            ProtobufStateStorage<Object> a2 = vp.a(context, vp.a(context));
            if (a2 == null || (c0501np = (C0501np) a2.read()) == null) {
                return null;
            }
            return c0501np.a;
        } catch (Throwable unused) {
            return null;
        }
    }
}
