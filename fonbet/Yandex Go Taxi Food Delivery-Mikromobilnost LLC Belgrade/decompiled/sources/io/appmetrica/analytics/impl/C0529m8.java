package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.m8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0529m8 implements ProtobufConverter {
    public final Yg a;

    public /* synthetic */ C0529m8(Yg yg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Yg() : yg);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0587o8 toModel(C0500l8 c0500l8) {
        C0500l8 c0500l82 = new C0500l8();
        long j = c0500l8.a;
        Long valueOf = Long.valueOf(j);
        if (j == c0500l82.a) {
            valueOf = null;
        }
        long j2 = c0500l8.b;
        return new C0587o8(valueOf, j2 != c0500l82.b ? Long.valueOf(j2) : null, this.a.a(c0500l8.c));
    }

    public C0529m8(Yg yg) {
        this.a = yg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0529m8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0500l8 fromModel(C0587o8 c0587o8) {
        C0500l8 c0500l8 = new C0500l8();
        Long l = c0587o8.a;
        if (l != null) {
            c0500l8.a = l.longValue();
        }
        Long l2 = c0587o8.b;
        if (l2 != null) {
            c0500l8.b = l2.longValue();
        }
        Boolean bool = c0587o8.c;
        if (bool != null) {
            c0500l8.c = this.a.fromModel(bool).intValue();
        }
        return c0500l8;
    }
}
