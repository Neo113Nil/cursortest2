package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.q7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685q7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0659p7 f6768a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0685q7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C0710r7 c0710r7) {
        return MessageNano.toByteArray(this.f6768a.fromModel(c0710r7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f6768a.fromModel((C0710r7) obj));
    }

    public C0685q7(C0659p7 c0659p7) {
        this.f6768a = c0659p7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0710r7 toModel(byte[] bArr) {
        C0633o7 c0633o7;
        if (bArr != null) {
            try {
                c0633o7 = (C0633o7) MessageNano.mergeFrom(new C0633o7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0633o7 = new C0633o7();
            }
        }
        c0633o7 = new C0633o7();
        return this.f6768a.toModel(c0633o7);
    }

    public /* synthetic */ C0685q7(C0659p7 c0659p7, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new C0659p7(null, 1, null) : c0659p7);
    }
}
