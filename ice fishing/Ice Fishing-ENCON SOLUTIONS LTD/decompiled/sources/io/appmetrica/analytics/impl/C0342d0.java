package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342d0 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final W f5773a;

    /* renamed from: b, reason: collision with root package name */
    public final C0451h6 f5774b;

    public C0342d0() {
        this(new W(new C0882xn()), new C0451h6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 fromModel(C0316c0 c0316c0) {
        S5 s5 = new S5();
        s5.f5041a = this.f5773a.fromModel(c0316c0.f5700a);
        String str = c0316c0.f5701b;
        if (str != null) {
            s5.f5042b = str;
        }
        s5.f5043c = this.f5774b.a(c0316c0.f5702c);
        return s5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0342d0(W w2, C0451h6 c0451h6) {
        this.f5773a = w2;
        this.f5774b = c0451h6;
    }

    public final C0316c0 a(S5 s5) {
        throw new UnsupportedOperationException();
    }
}
