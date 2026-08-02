package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Eo implements InterfaceC0617p9 {
    public final C0572nm a;

    public Eo() {
        this(new C0572nm());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0802vl> fromModel(Do r4) {
        I9 i9 = new I9();
        i9.a = 1;
        i9.b = new H9();
        C0802vl fromModel = this.a.fromModel(r4.a);
        i9.b.a = (E9) fromModel.a;
        S3 s3 = new S3(S3.b(fromModel));
        fromModel.b.getBytesTruncated();
        return Collections.singletonList(new C0802vl(i9, s3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Eo(C0572nm c0572nm) {
        this.a = c0572nm;
    }

    public final Do a(List<C0802vl> list) {
        throw new UnsupportedOperationException();
    }
}
