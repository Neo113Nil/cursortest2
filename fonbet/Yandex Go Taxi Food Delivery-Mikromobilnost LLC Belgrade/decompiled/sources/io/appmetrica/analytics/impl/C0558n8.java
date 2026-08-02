package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.n8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0558n8 implements Converter {
    public final C0529m8 a;

    public /* synthetic */ C0558n8(C0529m8 c0529m8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0529m8(null, 1, null) : c0529m8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0587o8 toModel(byte[] bArr) {
        C0500l8 c0500l8;
        if (bArr != null) {
            try {
                c0500l8 = (C0500l8) MessageNano.mergeFrom(new C0500l8(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0500l8 = new C0500l8();
            }
        }
        c0500l8 = new C0500l8();
        return this.a.toModel(c0500l8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((C0587o8) obj));
    }

    public C0558n8(C0529m8 c0529m8) {
        this.a = c0529m8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0558n8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C0587o8 c0587o8) {
        return MessageNano.toByteArray(this.a.fromModel(c0587o8));
    }
}
