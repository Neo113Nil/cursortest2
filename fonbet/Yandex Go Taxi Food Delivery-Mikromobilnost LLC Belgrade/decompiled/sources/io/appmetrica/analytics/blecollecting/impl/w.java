package io.appmetrica.analytics.blecollecting.impl;

import io.appmetrica.analytics.blecollecting.internal.config.RemoteBleCollectingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class w implements Converter {
    public final C0151f a;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ w(C0151f c0151f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0151f);
        if ((i & 1) != 0) {
            c0151f = new C0151f(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E fromModel(RemoteBleCollectingConfig remoteBleCollectingConfig) {
        E e = new E();
        e.a = remoteBleCollectingConfig.getEnabled();
        e.b = this.a.fromModel(remoteBleCollectingConfig.getConfig());
        return e;
    }

    public w(C0151f c0151f) {
        this.a = c0151f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBleCollectingConfig toModel(E e) {
        return new RemoteBleCollectingConfig(e.a, this.a.toModel(e.b));
    }
}
