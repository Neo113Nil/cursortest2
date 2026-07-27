package com.adjust.sdk.sig;

import android.content.Context;
import java.util.Map;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
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

    public final byte[] AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Context context, Map map, byte[] bArr, int i) {
        return nSign(context, map, bArr, i);
    }

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        nOnResume();
    }
}
