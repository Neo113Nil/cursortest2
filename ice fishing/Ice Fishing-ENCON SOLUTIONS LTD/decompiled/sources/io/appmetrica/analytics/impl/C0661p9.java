package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.p9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661p9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0609n9 fromModel(C0635o9 c0635o9) {
        C0609n9 c0609n9 = new C0609n9();
        String str = c0635o9.f6668a;
        if (str != null) {
            c0609n9.f6574a = str.getBytes();
        }
        return c0609n9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0635o9 toModel(C0609n9 c0609n9) {
        return new C0635o9(new String(c0609n9.f6574a));
    }
}
