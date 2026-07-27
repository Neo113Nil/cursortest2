package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class AH implements InterfaceC2336pF {
    public static byte[] A03;
    public final int A00;
    public final AbstractC06053d A01;
    public final InterfaceC2336pF A02;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
    }

    public AH(InterfaceC2336pF interfaceC2336pF, AbstractC06053d abstractC06053d, int i) {
        this.A02 = (InterfaceC2336pF) AbstractC06243y.A01(interfaceC2336pF);
        AbstractC06243y.A01(abstractC06053d);
        this.A01 = null;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2336pF
    public final void A43(InterfaceC06715t interfaceC06715t) {
        AbstractC06243y.A01(interfaceC06715t);
        this.A02.A43(interfaceC06715t);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2336pF
    public final Map<String, List<String>> A8t() {
        return this.A02.A8t();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2336pF
    public final Uri A9P() {
        return this.A02.A9P();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2336pF
    public final long AGi(C06605i c06605i) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2336pF
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC05802c
    public final int read(byte[] bArr, int i, int i6) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }
}
