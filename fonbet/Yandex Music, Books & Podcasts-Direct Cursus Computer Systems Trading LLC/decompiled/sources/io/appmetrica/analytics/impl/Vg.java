package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes5.dex */
public final class Vg implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0790xp fromModel(@NonNull Ug ug) {
        C0790xp c0790xp = new C0790xp();
        c0790xp.a = ug.a;
        c0790xp.b = ug.b;
        return c0790xp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C0790xp c0790xp = (C0790xp) obj;
        return new Ug(c0790xp.a, c0790xp.b);
    }

    @NonNull
    public final Ug a(@NonNull C0790xp c0790xp) {
        return new Ug(c0790xp.a, c0790xp.b);
    }
}
