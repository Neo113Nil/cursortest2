package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.iq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0431iq extends AbstractC0576nq {
    @Override // io.appmetrica.analytics.impl.AbstractC0576nq
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        C0669r4 c0669r4 = new C0669r4();
        try {
            bArr = AbstractC0475kc.a(context.getPackageName());
        } catch (Throwable unused) {
            bArr = new byte[16];
        }
        try {
            bArr2 = AbstractC0475kc.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArr2 = new byte[16];
        }
        return new Ai("clids_info", iBinaryDataHelper, new O9(c0669r4, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), new C0525m4());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0576nq
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper a;
        Rn B = Jb.I.B();
        synchronized (B) {
            a = B.a(context);
        }
        return a;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0576nq
    public final IBinaryDataHelper a(Context context) {
        return Jb.I.B().b(context);
    }
}
