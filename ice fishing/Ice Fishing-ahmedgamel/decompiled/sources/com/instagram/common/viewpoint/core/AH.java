package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class AH implements InterfaceC2356pF {
    public static byte[] A03;
    public final int A00;
    public final AbstractC06253d A01;
    public final InterfaceC2356pF A02;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
    }

    public AH(InterfaceC2356pF interfaceC2356pF, AbstractC06253d abstractC06253d, int i) {
        this.A02 = (InterfaceC2356pF) AbstractC06443y.A01(interfaceC2356pF);
        AbstractC06443y.A01(abstractC06253d);
        this.A01 = null;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    public final void A43(InterfaceC06915t interfaceC06915t) {
        AbstractC06443y.A01(interfaceC06915t);
        this.A02.A43(interfaceC06915t);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    public final Map<String, List<String>> A8t() {
        return this.A02.A8t();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    public final Uri A9P() {
        return this.A02.A9P();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    public final long AGi(C06805i c06805i) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06002c
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }
}
