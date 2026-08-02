package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class Rh implements ProtobufConverter {
    public final C0280di a;
    public final Mh b;

    public Rh() {
        this(new C0280di(), new Mh());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Zh fromModel(Ph ph) {
        Zh zh = new Zh();
        zh.a = this.a.fromModel(ph.a);
        zh.b = new Yh[ph.b.size()];
        Iterator<Oh> it = ph.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            zh.b[i] = this.b.fromModel(it.next());
            i++;
        }
        return zh;
    }

    public Rh(C0280di c0280di, Mh mh) {
        this.a = c0280di;
        this.b = mh;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ph toModel(Zh zh) {
        C0251ci model;
        ArrayList arrayList = new ArrayList(zh.b.length);
        for (Yh yh : zh.b) {
            arrayList.add(this.b.toModel(yh));
        }
        Xh xh = zh.a;
        C0280di c0280di = this.a;
        if (xh == null) {
            model = c0280di.toModel(new Xh());
        } else {
            model = c0280di.toModel(xh);
        }
        return new Ph(model, arrayList);
    }
}
