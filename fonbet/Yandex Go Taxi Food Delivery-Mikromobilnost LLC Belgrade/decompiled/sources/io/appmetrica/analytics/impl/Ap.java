package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* loaded from: classes9.dex */
public final class Ap {
    public final ProtobufStateStorage a;
    public final Zr b;

    public Ap(Context context) {
        this(((AbstractC0576nq) C0518lq.a(Fp.class)).create(context), Jb.k().D().a());
    }

    public Ap(ProtobufStateStorage protobufStateStorage, Zr zr) {
        this.a = protobufStateStorage;
        this.b = zr;
    }
}
