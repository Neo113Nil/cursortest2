package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class Z7 implements Converter {
    public final Y7 a;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Z7(Y7 y7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(y7);
        if ((i & 1) != 0) {
            y7 = new Y7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0183a8 toModel(byte[] bArr) {
        C0442j8 c0442j8;
        if (bArr != null) {
            try {
                c0442j8 = (C0442j8) MessageNano.mergeFrom(new C0442j8(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0442j8 = new C0442j8();
            }
        }
        c0442j8 = new C0442j8();
        return this.a.toModel(c0442j8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((C0183a8) obj));
    }

    public Z7(Y7 y7) {
        this.a = y7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Z7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C0183a8 c0183a8) {
        return MessageNano.toByteArray(this.a.fromModel(c0183a8));
    }
}
