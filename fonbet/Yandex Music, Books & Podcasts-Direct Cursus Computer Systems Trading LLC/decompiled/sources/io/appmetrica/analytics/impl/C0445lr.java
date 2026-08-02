package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.UserInfo;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.lr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0445lr implements Converter {
    public final C0474mr a = new C0474mr();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UserInfo toModel(@NotNull byte[] bArr) {
        return this.a.toModel((C0302h) MessageNano.mergeFrom(new C0302h(), bArr));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((UserInfo) obj));
    }

    @NotNull
    public final byte[] a(@NotNull UserInfo userInfo) {
        return MessageNano.toByteArray(this.a.fromModel(userInfo));
    }
}
