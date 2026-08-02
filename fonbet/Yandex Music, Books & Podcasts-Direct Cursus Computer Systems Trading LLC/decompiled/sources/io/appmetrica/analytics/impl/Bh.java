package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Bh implements ProtobufConverter {
    public final Nh a;
    public final C0753wh b;

    public Bh() {
        this(new Nh(), new C0753wh());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Jh fromModel(@NonNull C0838zh c0838zh) {
        Jh jh = new Jh();
        jh.a = this.a.fromModel(c0838zh.a);
        jh.b = new Ih[c0838zh.b.size()];
        Iterator<C0810yh> it = c0838zh.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            jh.b[i] = this.b.fromModel(it.next());
            i++;
        }
        return jh;
    }

    public Bh(Nh nh, C0753wh c0753wh) {
        this.a = nh;
        this.b = c0753wh;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0838zh toModel(@NonNull Jh jh) {
        Mh model;
        ArrayList arrayList = new ArrayList(jh.b.length);
        for (Ih ih : jh.b) {
            arrayList.add(this.b.toModel(ih));
        }
        Hh hh = jh.a;
        Nh nh = this.a;
        if (hh == null) {
            model = nh.toModel(new Hh());
        } else {
            model = nh.toModel(hh);
        }
        return new C0838zh(model, arrayList);
    }
}
