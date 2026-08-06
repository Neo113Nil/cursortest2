package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403fa implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0588me f5975a;

    public C0403fa() {
        this(new Sl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0725rm fromModel(C0552l4 c0552l4) {
        C0725rm c0725rm = new C0725rm();
        c0725rm.f6849b = c0552l4.f6415b;
        c0725rm.f6848a = c0552l4.f6414a;
        c0725rm.f6850c = c0552l4.f6416c;
        c0725rm.f6851d = c0552l4.f6417d;
        c0725rm.f6852e = c0552l4.f6418e;
        c0725rm.f6853f = this.f5975a.a(c0552l4.f6419f);
        return c0725rm;
    }

    public C0403fa(Sl sl) {
        this.f5975a = sl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0552l4 toModel(C0725rm c0725rm) {
        C0500j4 c0500j4 = new C0500j4();
        c0500j4.f6247d = c0725rm.f6851d;
        c0500j4.f6246c = c0725rm.f6850c;
        c0500j4.f6245b = c0725rm.f6849b;
        c0500j4.f6244a = c0725rm.f6848a;
        c0500j4.f6248e = c0725rm.f6852e;
        c0500j4.f6249f = this.f5975a.a(c0725rm.f6853f);
        return new C0552l4(c0500j4);
    }
}
