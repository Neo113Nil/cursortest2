package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class AG implements InterfaceC2356pF {
    public static String[] A04 = {"DnWOFrWNtrruVDlZPcn7mSzqB1u3fyA1", "4khCAmOyD7V9Z9fo", "Y1he90jrlOSSnjRb2RN33xbae", "sN3uyyiAo7qwm0FA39xGDer", "C", "MIilbOvYRfmfRo2RH", "W4KUp4d37G5W3qTHHFYFOJnsXzg3Y9", "7BjcD7lz4UoePoP5n6bqbpOg1qjeNk3c"};
    public long A00;
    public Uri A01 = Uri.EMPTY;
    public Map<String, List<String>> A02 = Collections.emptyMap();
    public final InterfaceC2356pF A03;

    public AG(InterfaceC2356pF interfaceC2356pF) {
        this.A03 = (InterfaceC2356pF) AbstractC06443y.A01(interfaceC2356pF);
    }

    public final long A00() {
        return this.A00;
    }

    public final Uri A01() {
        return this.A01;
    }

    public final Map<String, List<String>> A02() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    public final void A43(InterfaceC06915t interfaceC06915t) {
        AbstractC06443y.A01(interfaceC06915t);
        this.A03.A43(interfaceC06915t);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    public final Map<String, List<String>> A8t() {
        return this.A03.A8t();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    public final Uri A9P() {
        return this.A03.A9P();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    public final long AGi(C06805i c06805i) throws IOException {
        this.A01 = c06805i.A06;
        this.A02 = Collections.emptyMap();
        long AGi = this.A03.AGi(c06805i);
        this.A01 = (Uri) AbstractC06443y.A01(A9P());
        this.A02 = A8t();
        return AGi;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    public final void close() throws IOException {
        this.A03.close();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06002c
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        int read = this.A03.read(bArr, i, i4);
        if (read != -1) {
            long j6 = this.A00;
            long j9 = read;
            String[] strArr = A04;
            String str = strArr[2];
            String str2 = strArr[1];
            int length = str.length();
            int bytesRead = str2.length();
            if (length == bytesRead) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "l8Xa62wp4MYShhMptlDz52jvD";
            strArr2[1] = "PdriuKYg1yn0hjm9";
            this.A00 = j6 + j9;
        }
        return read;
    }
}
