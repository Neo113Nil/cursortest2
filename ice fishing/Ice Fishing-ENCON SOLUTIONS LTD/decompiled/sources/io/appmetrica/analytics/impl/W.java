package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class W implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0882xn f5272a;

    public W(C0882xn c0882xn) {
        this.f5272a = c0882xn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final R5 fromModel(V v2) {
        R5 r5 = new R5();
        C0856wn c0856wn = v2.f5187a;
        if (c0856wn != null) {
            r5.f4984a = this.f5272a.fromModel(c0856wn);
        }
        r5.f4985b = new C0270a6[v2.f5188b.size()];
        Iterator it = v2.f5188b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            r5.f4985b[i2] = this.f5272a.fromModel((C0856wn) it.next());
            i2++;
        }
        String str = v2.f5189c;
        if (str != null) {
            r5.f4986c = str;
        }
        return r5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final V a(R5 r5) {
        throw new UnsupportedOperationException();
    }
}
