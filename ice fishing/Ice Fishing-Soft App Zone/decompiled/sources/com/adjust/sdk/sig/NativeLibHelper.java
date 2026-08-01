package com.adjust.sdk.sig;

import android.content.Context;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
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

    public final byte[] WinterFlowHookDataSource(Context context, Map map, byte[] bArr, int i) {
        return nSign(context, map, bArr, i);
    }

    public final void WinterFlowRouterStructure() {
        nOnResume();
    }
}
