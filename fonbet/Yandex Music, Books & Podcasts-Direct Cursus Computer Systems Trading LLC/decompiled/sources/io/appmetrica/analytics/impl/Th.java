package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final class Th implements Converter {
    public final C0159c0 a;
    public final Uh b;

    public Th() {
        this(new C0159c0(), new Uh(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0439ll fromModel(@NonNull Vh vh) {
        int i;
        C0687u9 c0687u9 = new C0687u9();
        C0439ll fromModel = this.a.fromModel(vh.a);
        c0687u9.a = (C0398k9) fromModel.a;
        Rq a = this.b.a(vh.b);
        if (AbstractC0734vr.a((Collection) a.a)) {
            i = 0;
        } else {
            c0687u9.b = new C0398k9[((List) a.a).size()];
            i = 0;
            for (int i2 = 0; i2 < ((List) a.a).size(); i2++) {
                C0439ll fromModel2 = this.a.fromModel((C0188d0) ((List) a.a).get(i2));
                c0687u9.b[i2] = (C0398k9) fromModel2.a;
                i += fromModel2.b.getBytesTruncated();
            }
        }
        return new C0439ll(c0687u9, new P3(P3.b(fromModel, a, new P3(i))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Th(C0159c0 c0159c0, Uh uh) {
        this.a = c0159c0;
        this.b = uh;
    }

    @NonNull
    public final Vh a(@NonNull C0439ll c0439ll) {
        throw new UnsupportedOperationException();
    }
}
