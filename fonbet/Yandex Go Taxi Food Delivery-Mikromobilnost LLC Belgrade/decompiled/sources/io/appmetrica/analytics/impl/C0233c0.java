package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0233c0 implements ProtobufConverter {
    public final Vq a;

    public C0233c0(Vq vq) {
        this.a = vq;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final M6 fromModel(C0204b0 c0204b0) {
        M6 m6 = new M6();
        Uq uq = c0204b0.a;
        if (uq != null) {
            m6.a = this.a.fromModel(uq);
        }
        m6.b = new V6[c0204b0.b.size()];
        Iterator it = c0204b0.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            m6.b[i] = this.a.fromModel((Uq) it.next());
            i++;
        }
        String str = c0204b0.c;
        if (str != null) {
            m6.c = str;
        }
        return m6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final C0204b0 a(M6 m6) {
        throw new UnsupportedOperationException();
    }
}
