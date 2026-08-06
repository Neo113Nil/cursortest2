package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.v6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813v6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Eg f7040a;

    public C0813v6() {
        this(new Eg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X5 fromModel(C0787u6 c0787u6) {
        X5 fromModel = this.f7040a.fromModel(c0787u6.f6972a);
        fromModel.f5378g = 1;
        W5 w5 = new W5();
        fromModel.f5379h = w5;
        w5.f5281a = StringUtils.correctIllFormedString(c0787u6.f6973b);
        return fromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0813v6(Eg eg) {
        this.f7040a = eg;
    }

    public final C0787u6 a(X5 x5) {
        throw new UnsupportedOperationException();
    }
}
