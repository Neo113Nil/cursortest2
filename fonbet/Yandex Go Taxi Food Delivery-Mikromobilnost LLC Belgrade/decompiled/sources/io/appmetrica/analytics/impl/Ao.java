package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Ao implements InterfaceC0617p9 {
    public final C0572nm a;
    public final C0770ui b;

    public Ao() {
        this(new C0572nm(), new C0770ui());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0802vl> fromModel(C0921zo c0921zo) {
        I9 i9 = new I9();
        i9.a = 2;
        i9.c = new F9();
        C0802vl fromModel = this.a.fromModel(c0921zo.b);
        i9.c.b = (E9) fromModel.a;
        C0802vl fromModel2 = this.b.fromModel(c0921zo.a);
        i9.c.a = (B9) fromModel2.a;
        return Collections.singletonList(new C0802vl(i9, new S3(S3.b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Ao(C0572nm c0572nm, C0770ui c0770ui) {
        this.a = c0572nm;
        this.b = c0770ui;
    }

    public final C0921zo a(List<C0802vl> list) {
        throw new UnsupportedOperationException();
    }
}
