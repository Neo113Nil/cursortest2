package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0659p7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0562le f6728a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0659p7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0633o7 fromModel(C0710r7 c0710r7) {
        C0633o7 c0633o7 = new C0633o7();
        Long l2 = c0710r7.f6812a;
        if (l2 != null) {
            c0633o7.f6663a = l2.longValue();
        }
        Long l3 = c0710r7.f6813b;
        if (l3 != null) {
            c0633o7.f6664b = l3.longValue();
        }
        Boolean bool = c0710r7.f6814c;
        if (bool != null) {
            c0633o7.f6665c = this.f6728a.fromModel(bool).intValue();
        }
        return c0633o7;
    }

    public C0659p7(C0562le c0562le) {
        this.f6728a = c0562le;
    }

    public /* synthetic */ C0659p7(C0562le c0562le, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new C0562le() : c0562le);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0710r7 toModel(C0633o7 c0633o7) {
        C0633o7 c0633o72 = new C0633o7();
        long j2 = c0633o7.f6663a;
        Long valueOf = Long.valueOf(j2);
        if (j2 == c0633o72.f6663a) {
            valueOf = null;
        }
        long j3 = c0633o7.f6664b;
        return new C0710r7(valueOf, j3 != c0633o72.f6664b ? Long.valueOf(j3) : null, this.f6728a.a(c0633o7.f6665c));
    }
}
