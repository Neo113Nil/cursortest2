package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes.dex */
public final class Mm extends Rm {
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
        C0888y3 c0888y3 = new C0888y3();
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
        return new Mf("clids_info", iBinaryDataHelper, new A8(c0888y3, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), new C0758t3());
    }
}
