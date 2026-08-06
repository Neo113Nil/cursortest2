package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.c7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323c7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0297b7 f5727a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0323c7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C0349d7 c0349d7) {
        return MessageNano.toByteArray(this.f5727a.fromModel(c0349d7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f5727a.fromModel((C0349d7) obj));
    }

    public C0323c7(C0297b7 c0297b7) {
        this.f5727a = c0297b7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0349d7 toModel(byte[] bArr) {
        C0581m7 c0581m7;
        if (bArr != null) {
            try {
                c0581m7 = (C0581m7) MessageNano.mergeFrom(new C0581m7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0581m7 = new C0581m7();
            }
        }
        c0581m7 = new C0581m7();
        return this.f5727a.toModel(c0581m7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0323c7(C0297b7 c0297b7, int i2, kotlin.jvm.internal.e eVar) {
        this(c0297b7);
        if ((i2 & 1) != 0) {
            c0297b7 = new C0297b7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
