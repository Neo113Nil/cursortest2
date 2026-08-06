package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882xn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Bl f7213a;

    public C0882xn() {
        this(new Bl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0270a6 fromModel(C0856wn c0856wn) {
        C0270a6 c0270a6 = new C0270a6();
        Integer num = c0856wn.f7159e;
        c0270a6.f5557e = num == null ? -1 : num.intValue();
        c0270a6.f5556d = c0856wn.f7158d;
        c0270a6.f5554b = c0856wn.f7156b;
        c0270a6.f5553a = c0856wn.f7155a;
        c0270a6.f5555c = c0856wn.f7157c;
        Bl bl = this.f7213a;
        List list = c0856wn.f7160f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Dl((StackTraceElement) it.next()));
        }
        c0270a6.f5558f = bl.fromModel(arrayList);
        return c0270a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0882xn(Bl bl) {
        this.f7213a = bl;
    }

    public final C0856wn a(C0270a6 c0270a6) {
        throw new UnsupportedOperationException();
    }
}
