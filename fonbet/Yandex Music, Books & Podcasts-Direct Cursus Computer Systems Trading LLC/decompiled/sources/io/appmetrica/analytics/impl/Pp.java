package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes5.dex */
public final class Pp extends Vp {
    @Override // io.appmetrica.analytics.impl.Vp
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        Eh eh = new Eh();
        try {
            bArr = AbstractC0238em.a(context.getPackageName());
        } catch (Throwable unused) {
            bArr = new byte[16];
        }
        try {
            bArr2 = AbstractC0238em.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArr2 = new byte[16];
        }
        return new C0378ji("preload_info_data", iBinaryDataHelper, new I9(eh, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), new Bh());
    }

    @Override // io.appmetrica.analytics.impl.Vp
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper a;
        C0844zn B = C0747wb.I.B();
        synchronized (B) {
            a = B.a(context);
        }
        return a;
    }

    @Override // io.appmetrica.analytics.impl.Vp
    public final IBinaryDataHelper a(Context context) {
        return C0747wb.I.B().b(context);
    }
}
