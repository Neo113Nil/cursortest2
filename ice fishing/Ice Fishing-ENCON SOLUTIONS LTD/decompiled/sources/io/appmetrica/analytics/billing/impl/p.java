package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class p implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final r f3567a;

    /* JADX WARN: Multi-variable type inference failed */
    public p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(RemoteBillingConfig remoteBillingConfig) {
        return MessageNano.toByteArray(this.f3567a.fromModel(remoteBillingConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f3567a.fromModel((RemoteBillingConfig) obj));
    }

    public p(r rVar) {
        this.f3567a = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig toModel(byte[] bArr) {
        t tVar;
        try {
            tVar = (t) MessageNano.mergeFrom(new t(), bArr);
        } catch (Throwable unused) {
            tVar = new t();
        }
        return this.f3567a.toModel(tVar);
    }

    public /* synthetic */ p(r rVar, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new r(null, 1, null) : rVar);
    }
}
