package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0881xm extends BaseProtobufStateSerializer {
    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0855wm defaultValue() {
        C0855wm c0855wm = new C0855wm();
        c0855wm.f7138i = new C0725rm();
        return c0855wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0855wm toState(byte[] bArr) {
        return (C0855wm) MessageNano.mergeFrom(new C0855wm(), bArr);
    }
}
