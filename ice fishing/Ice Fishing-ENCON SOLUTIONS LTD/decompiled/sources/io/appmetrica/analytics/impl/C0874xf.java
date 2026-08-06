package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0874xf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Y f7200a;

    /* renamed from: b, reason: collision with root package name */
    public final C0900yf f7201b;

    public C0874xf() {
        this(new Y(), new C0900yf(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(C0926zf c0926zf) {
        int i2;
        C0582m8 c0582m8 = new C0582m8();
        Di fromModel = this.f7200a.fromModel(c0926zf.f7276a);
        c0582m8.f6504a = (C0324c8) fromModel.f4305a;
        Mn a2 = this.f7201b.a(c0926zf.f7277b);
        if (AbstractC0572lo.a((Collection) a2.f4785a)) {
            i2 = 0;
        } else {
            c0582m8.f6505b = new C0324c8[((List) a2.f4785a).size()];
            i2 = 0;
            for (int i3 = 0; i3 < ((List) a2.f4785a).size(); i3++) {
                Di fromModel2 = this.f7200a.fromModel((Z) ((List) a2.f4785a).get(i3));
                c0582m8.f6505b[i3] = (C0324c8) fromModel2.f4305a;
                i2 += fromModel2.f4306b.getBytesTruncated();
            }
        }
        return new Di(c0582m8, new C0267a3(C0267a3.b(fromModel, a2, new C0267a3(i2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0874xf(Y y2, C0900yf c0900yf) {
        this.f7200a = y2;
        this.f7201b = c0900yf;
    }

    public final C0926zf a(Di di) {
        throw new UnsupportedOperationException();
    }
}
