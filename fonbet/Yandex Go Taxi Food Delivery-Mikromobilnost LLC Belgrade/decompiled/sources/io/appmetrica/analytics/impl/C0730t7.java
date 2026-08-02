package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.t7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0730t7 implements ProtobufConverter {
    public final C0569nj a;

    public C0730t7() {
        this(new C0569nj());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S6 fromModel(C0701s7 c0701s7) {
        S6 fromModel = this.a.fromModel(c0701s7.a);
        fromModel.g = 1;
        R6 r6 = new R6();
        fromModel.h = r6;
        r6.a = StringUtils.correctIllFormedString(c0701s7.b);
        return fromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0730t7(C0569nj c0569nj) {
        this.a = c0569nj;
    }

    public final C0701s7 a(S6 s6) {
        throw new UnsupportedOperationException();
    }
}
