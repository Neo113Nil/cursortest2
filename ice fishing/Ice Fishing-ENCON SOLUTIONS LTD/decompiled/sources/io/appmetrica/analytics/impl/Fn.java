package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Fn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Bl f4398a;

    public Fn() {
        this(new Bl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0296b6 fromModel(Gn gn) {
        C0296b6 c0296b6 = new C0296b6();
        c0296b6.f5607a = (String) WrapUtils.getOrDefault(gn.f4444a, "");
        c0296b6.f5608b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(gn.f4445b, ""));
        List<Dl> list = gn.f4446c;
        if (list != null) {
            c0296b6.f5609c = this.f4398a.fromModel(list);
        }
        Gn gn2 = gn.f4447d;
        if (gn2 != null) {
            c0296b6.f5610d = fromModel(gn2);
        }
        List list2 = gn.f4448e;
        int i2 = 0;
        if (list2 == null) {
            c0296b6.f5611e = new C0296b6[0];
        } else {
            c0296b6.f5611e = new C0296b6[list2.size()];
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                c0296b6.f5611e[i2] = fromModel((Gn) it.next());
                i2++;
            }
        }
        return c0296b6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Fn(Bl bl) {
        this.f4398a = bl;
    }

    public final Gn a(C0296b6 c0296b6) {
        throw new UnsupportedOperationException();
    }
}
