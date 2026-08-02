package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class V7 implements Converter {
    public final U7 a;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ V7(U7 u7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(u7);
        if ((i & 1) != 0) {
            u7 = new U7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final W7 toModel(byte[] bArr) {
        C0253f8 c0253f8;
        if (bArr != null) {
            try {
                c0253f8 = (C0253f8) MessageNano.mergeFrom(new C0253f8(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0253f8 = new C0253f8();
            }
        }
        c0253f8 = new C0253f8();
        return this.a.toModel(c0253f8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((W7) obj));
    }

    public V7(@NotNull U7 u7) {
        this.a = u7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final byte[] a(@NotNull W7 w7) {
        return MessageNano.toByteArray(this.a.fromModel(w7));
    }
}
