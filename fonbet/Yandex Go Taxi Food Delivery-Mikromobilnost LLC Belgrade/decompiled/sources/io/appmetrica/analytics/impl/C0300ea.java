package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.ea, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0300ea implements ProtobufConverter {
    public static Ja a(C0272da c0272da) {
        Ja ja = new Ja();
        ja.d = new int[c0272da.b.size()];
        Iterator it = c0272da.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            ja.d[i] = ((Integer) it.next()).intValue();
            i++;
        }
        ja.c = c0272da.d;
        ja.b = c0272da.c;
        ja.a = c0272da.a;
        return ja;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((C0272da) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        Ja ja = (Ja) obj;
        return new C0272da(ja.a, ja.b, ja.c, CollectionUtils.hashSetFromIntArray(ja.d));
    }
}
