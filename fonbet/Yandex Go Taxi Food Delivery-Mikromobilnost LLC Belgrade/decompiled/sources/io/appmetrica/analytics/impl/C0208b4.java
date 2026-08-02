package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0208b4 implements InterfaceC0617p9 {
    public final C0237c4 a;

    public C0208b4() {
        this(new C0237c4());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0802vl> fromModel(C0179a4 c0179a4) {
        I9 i9 = new I9();
        i9.e = new C0674r9();
        C0802vl fromModel = this.a.fromModel(c0179a4.b);
        i9.e.a = (C0703s9) fromModel.a;
        i9.a = c0179a4.a;
        return Collections.singletonList(new C0802vl(i9, new S3(S3.b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0208b4(C0237c4 c0237c4) {
        this.a = c0237c4;
    }

    public final C0179a4 a(List<C0802vl> list) {
        throw new UnsupportedOperationException();
    }
}
