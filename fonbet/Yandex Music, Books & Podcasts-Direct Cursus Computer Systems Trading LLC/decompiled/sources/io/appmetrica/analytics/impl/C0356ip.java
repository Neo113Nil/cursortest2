package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.ip, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0356ip {
    public final ProtobufStateStorage a;
    public final Gr b;

    public C0356ip(Context context) {
        this(((Vp) Tp.a(C0501np.class)).create(context), C0747wb.k().D().a());
    }

    public C0356ip(ProtobufStateStorage protobufStateStorage, Gr gr) {
        this.a = protobufStateStorage;
        this.b = gr;
    }
}
