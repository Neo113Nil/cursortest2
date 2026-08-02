package io.appmetrica.analytics.adrevenue.other.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class k implements Converter {
    public final b a;

    public /* synthetic */ k(b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new b() : bVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j toModel(byte[] bArr) {
        c cVar;
        try {
            cVar = (c) MessageNano.mergeFrom(new c(), bArr);
        } catch (Throwable unused) {
            cVar = new c();
        }
        this.a.getClass();
        return new j(cVar.a, cVar.b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((j) obj));
    }

    public k(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(j jVar) {
        return MessageNano.toByteArray(this.a.fromModel(jVar));
    }
}
