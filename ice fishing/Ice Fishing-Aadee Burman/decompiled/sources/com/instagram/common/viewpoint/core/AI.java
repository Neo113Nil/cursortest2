package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.anythink.expressad.video.module.a.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class AI implements InterfaceC2336pF {
    public static byte[] A00;
    public static final C5Y A01;
    public static final AI A02;

    public static /* synthetic */ AI A00() {
        return new AI();
    }

    public static String A01(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ a.f21727Q);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{23, 43, 38, 36, 34, 47, 40, 43, 35, 34, 53, 3, 38, 51, 38, 20, 40, 50, 53, 36, 34, 103, 36, 38, 41, 41, 40, 51, 103, 37, 34, 103, 40, 55, 34, 41, 34, 35};
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2336pF
    public final /* synthetic */ Map A8t() {
        return C5X.A00(this);
    }

    static {
        A02();
        A02 = new AI();
        A01 = new C5Y() { // from class: com.facebook.ads.redexgen.X.p4
            @Override // com.instagram.common.viewpoint.core.C5Y
            public final InterfaceC2336pF A5I() {
                return AI.A00();
            }
        };
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2336pF
    public final void A43(InterfaceC06715t interfaceC06715t) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2336pF
    public final Uri A9P() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2336pF
    public final long AGi(C06605i c06605i) throws IOException {
        throw new IOException(A01(0, 38, 57));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2336pF
    public final void close() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC05802c
    public final int read(byte[] bArr, int i, int i6) {
        throw new UnsupportedOperationException();
    }
}
