package com.adjust.sdk.sig;

import android.content.Context;
import java.util.Map;

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

    public final void CatchingFishParcelableFAB() {
        nOnResume();
    }

    public final byte[] CatchingFishSnackbar(Context context, Map map, byte[] bArr, int i) {
        return nSign(context, map, bArr, i);
    }
}
