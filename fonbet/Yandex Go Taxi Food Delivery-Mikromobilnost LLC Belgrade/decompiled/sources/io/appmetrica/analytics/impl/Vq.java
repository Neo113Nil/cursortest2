package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class Vq implements ProtobufConverter {
    public final Wo a;

    public Vq() {
        this(new Wo());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V6 fromModel(Uq uq) {
        V6 v6 = new V6();
        Integer num = uq.e;
        v6.e = num == null ? -1 : num.intValue();
        v6.d = uq.d;
        v6.b = uq.b;
        v6.a = uq.a;
        v6.c = uq.c;
        Wo wo = this.a;
        List list = uq.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Yo((StackTraceElement) it.next()));
        }
        v6.f = wo.fromModel(arrayList);
        return v6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Vq(Wo wo) {
        this.a = wo;
    }

    public final Uq a(V6 v6) {
        throw new UnsupportedOperationException();
    }
}
