package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.dr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0288dr implements ProtobufConverter {
    public final Wo a;

    public C0288dr() {
        this(new Wo());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W6 fromModel(C0317er c0317er) {
        W6 w6 = new W6();
        w6.a = (String) WrapUtils.getOrDefault(c0317er.a, "");
        w6.b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(c0317er.b, ""));
        List<Yo> list = c0317er.c;
        if (list != null) {
            w6.c = this.a.fromModel(list);
        }
        C0317er c0317er2 = c0317er.d;
        if (c0317er2 != null) {
            w6.d = fromModel(c0317er2);
        }
        List list2 = c0317er.e;
        int i = 0;
        if (list2 == null) {
            w6.e = new W6[0];
            return w6;
        }
        w6.e = new W6[list2.size()];
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            w6.e[i] = fromModel((C0317er) it.next());
            i++;
        }
        return w6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0288dr(Wo wo) {
        this.a = wo;
    }

    public final C0317er a(W6 w6) {
        throw new UnsupportedOperationException();
    }
}
