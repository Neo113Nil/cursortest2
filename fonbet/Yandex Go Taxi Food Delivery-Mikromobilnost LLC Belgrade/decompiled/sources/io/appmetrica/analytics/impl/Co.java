package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Co implements InterfaceC0617p9 {
    public final C0770ui a;
    public final Ri b;

    public Co() {
        this(new C0770ui(), new Ri());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0802vl> fromModel(Bo bo) {
        C0802vl c0802vl;
        I9 i9 = new I9();
        i9.a = 3;
        i9.d = new G9();
        C0802vl fromModel = this.a.fromModel(bo.a);
        i9.d.a = (B9) fromModel.a;
        C0367gj c0367gj = bo.b;
        if (c0367gj != null) {
            c0802vl = this.b.fromModel(c0367gj);
            i9.d.b = (D9) c0802vl.a;
        } else {
            c0802vl = null;
        }
        return Collections.singletonList(new C0802vl(i9, new S3(S3.b(fromModel, c0802vl))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Co(C0770ui c0770ui, Ri ri) {
        this.a = c0770ui;
        this.b = ri;
    }

    public final Bo a(List<C0802vl> list) {
        throw new UnsupportedOperationException();
    }
}
