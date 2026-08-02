package io.appmetrica.analytics.blecollecting.impl;

import io.appmetrica.analytics.blecollecting.internal.config.RemoteBleCollectingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.blecollecting.impl.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0165u implements Converter {
    public final w a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0165u(w wVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new w(null, 1, 0 == true ? 1 : 0) : wVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBleCollectingConfig toModel(byte[] bArr) {
        E e;
        try {
            e = (E) MessageNano.mergeFrom(new E(), bArr);
        } catch (Throwable unused) {
            e = new E();
        }
        return this.a.toModel(e);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((RemoteBleCollectingConfig) obj));
    }

    public C0165u(w wVar) {
        this.a = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0165u() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(RemoteBleCollectingConfig remoteBleCollectingConfig) {
        return MessageNano.toByteArray(this.a.fromModel(remoteBleCollectingConfig));
    }
}
