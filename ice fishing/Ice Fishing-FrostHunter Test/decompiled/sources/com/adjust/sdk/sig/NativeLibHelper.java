package com.adjust.sdk.sig;

import android.content.Context;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
class NativeLibHelper implements a {
    static {
        try {
            System.loadLibrary("signer");
        } catch (UnsatisfiedLinkError e) {
            e.getMessage();
        }
    }

    private native void nOnResume();

    private native byte[] nSign(Context context, Object obj, byte[] bArr, int i);

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        nOnResume();
    }

    public final byte[] FrostHunterConstraintSetCloneMasterUltraRogue2633(Context context, Map map, byte[] bArr, int i) {
        return nSign(context, map, bArr, i);
    }
}
