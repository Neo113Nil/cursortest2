package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.xa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0775xa implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0717va fromModel(@NonNull C0746wa c0746wa) {
        C0717va c0717va = new C0717va();
        String str = c0746wa.a;
        if (str != null) {
            c0717va.a = str.getBytes();
        }
        return c0717va;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0746wa toModel(@NonNull C0717va c0717va) {
        return new C0746wa(new String(c0717va.a));
    }
}
