package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0340i8 implements ProtobufConverter {
    public final Ig a;

    public /* synthetic */ C0340i8(Ig ig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Ig() : ig);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0397k8 toModel(@NotNull C0311h8 c0311h8) {
        C0311h8 c0311h82 = new C0311h8();
        long j = c0311h8.a;
        Long valueOf = Long.valueOf(j);
        if (j == c0311h82.a) {
            valueOf = null;
        }
        long j2 = c0311h8.b;
        return new C0397k8(valueOf, j2 != c0311h82.b ? Long.valueOf(j2) : null, this.a.a(c0311h8.c));
    }

    public C0340i8(@NotNull Ig ig) {
        this.a = ig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0340i8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0311h8 fromModel(@NotNull C0397k8 c0397k8) {
        C0311h8 c0311h8 = new C0311h8();
        Long l = c0397k8.a;
        if (l != null) {
            c0311h8.a = l.longValue();
        }
        Long l2 = c0397k8.b;
        if (l2 != null) {
            c0311h8.b = l2.longValue();
        }
        Boolean bool = c0397k8.c;
        if (bool != null) {
            c0311h8.c = this.a.fromModel(bool).intValue();
        }
        return c0311h8;
    }
}
