package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.j8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0368j8 implements Converter {
    public final C0340i8 a;

    public /* synthetic */ C0368j8(C0340i8 c0340i8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0340i8(null, 1, null) : c0340i8);
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
    public final C0397k8 toModel(byte[] bArr) {
        C0311h8 c0311h8;
        if (bArr != null) {
            try {
                c0311h8 = (C0311h8) MessageNano.mergeFrom(new C0311h8(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0311h8 = new C0311h8();
            }
        }
        c0311h8 = new C0311h8();
        return this.a.toModel(c0311h8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((C0397k8) obj));
    }

    public C0368j8(@NotNull C0340i8 c0340i8) {
        this.a = c0340i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0368j8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final byte[] a(@NotNull C0397k8 c0397k8) {
        return MessageNano.toByteArray(this.a.fromModel(c0397k8));
    }
}
