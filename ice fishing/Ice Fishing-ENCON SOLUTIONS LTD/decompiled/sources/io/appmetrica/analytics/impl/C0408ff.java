package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.ff, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408ff implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0718rf f5981a;

    /* renamed from: b, reason: collision with root package name */
    public final C0279af f5982b;

    public C0408ff() {
        this(new C0718rf(), new C0279af());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0615nf fromModel(C0357df c0357df) {
        C0615nf c0615nf = new C0615nf();
        c0615nf.f6622a = this.f5981a.fromModel(c0357df.f5817a);
        c0615nf.f6623b = new C0589mf[c0357df.f5818b.size()];
        Iterator<C0331cf> it = c0357df.f5818b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c0615nf.f6623b[i2] = this.f5982b.fromModel(it.next());
            i2++;
        }
        return c0615nf;
    }

    public C0408ff(C0718rf c0718rf, C0279af c0279af) {
        this.f5981a = c0718rf;
        this.f5982b = c0279af;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0357df toModel(C0615nf c0615nf) {
        C0693qf model;
        ArrayList arrayList = new ArrayList(c0615nf.f6623b.length);
        for (C0589mf c0589mf : c0615nf.f6623b) {
            arrayList.add(this.f5982b.toModel(c0589mf));
        }
        C0563lf c0563lf = c0615nf.f6622a;
        if (c0563lf == null) {
            model = this.f5981a.toModel(new C0563lf());
        } else {
            model = this.f5981a.toModel(c0563lf);
        }
        return new C0357df(model, arrayList);
    }
}
