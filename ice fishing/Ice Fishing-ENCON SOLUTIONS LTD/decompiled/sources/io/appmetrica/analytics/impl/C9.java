package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class C9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0700qm fromModel(B9 b9) {
        C0700qm c0700qm = new C0700qm();
        if (b9 != null) {
            c0700qm.f6791a = b9.f4196a;
        }
        return c0700qm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new B9(((C0700qm) obj).f6791a);
    }

    public final B9 a(C0700qm c0700qm) {
        return new B9(c0700qm.f6791a);
    }
}
