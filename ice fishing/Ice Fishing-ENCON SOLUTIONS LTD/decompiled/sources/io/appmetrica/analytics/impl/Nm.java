package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes.dex */
public final class Nm extends Rm {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProtobufStateSerializer f4837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProtobufConverter f4838c;

    public Nm(String str, ProtobufStateSerializer protobufStateSerializer, ProtobufConverter protobufConverter) {
        this.f4836a = str;
        this.f4837b = protobufStateSerializer;
        this.f4838c = protobufConverter;
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final IBinaryDataHelper a(Context context) {
        return C0610na.f6575I.B().b(context);
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper a2;
        C0905yk B2 = C0610na.f6575I.B();
        synchronized (B2) {
            a2 = B2.a(context);
        }
        return a2;
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        String str = this.f4836a;
        ProtobufStateSerializer protobufStateSerializer = this.f4837b;
        try {
            bArr = AbstractC0438gj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArr = new byte[16];
        }
        try {
            bArr2 = AbstractC0438gj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArr2 = new byte[16];
        }
        return new Mf(str, iBinaryDataHelper, new A8(protobufStateSerializer, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), this.f4838c);
    }
}
