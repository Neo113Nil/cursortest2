package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class P8 implements ProtobufConverter {
    public static C0790u9 a(O8 o8) {
        C0790u9 c0790u9 = new C0790u9();
        c0790u9.f6994d = new int[o8.f4856b.size()];
        Iterator it = o8.f4856b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c0790u9.f6994d[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        c0790u9.f6993c = o8.f4858d;
        c0790u9.f6992b = o8.f4857c;
        c0790u9.f6991a = o8.f4855a;
        return c0790u9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((O8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C0790u9 c0790u9 = (C0790u9) obj;
        return new O8(c0790u9.f6991a, c0790u9.f6992b, c0790u9.f6993c, CollectionUtils.hashSetFromIntArray(c0790u9.f6994d));
    }
}
