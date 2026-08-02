package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.o7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0512o7 implements ProtobufConverter {
    public final C0322hj a;

    public C0512o7() {
        this(new C0322hj());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P6 fromModel(@NonNull C0483n7 c0483n7) {
        P6 fromModel = this.a.fromModel(c0483n7.a);
        fromModel.g = 1;
        O6 o6 = new O6();
        fromModel.h = o6;
        o6.a = StringUtils.correctIllFormedString(c0483n7.b);
        return fromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0512o7(C0322hj c0322hj) {
        this.a = c0322hj;
    }

    @NonNull
    public final C0483n7 a(@NonNull P6 p6) {
        throw new UnsupportedOperationException();
    }
}
