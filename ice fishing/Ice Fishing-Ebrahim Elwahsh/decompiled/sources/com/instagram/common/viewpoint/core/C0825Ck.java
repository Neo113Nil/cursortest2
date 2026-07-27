package com.instagram.common.viewpoint.core;

import com.anythink.expressad.video.module.a.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ck, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0825Ck implements InterfaceC1806gB {
    public static byte[] A01;
    public final boolean A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ a.f21885Q);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{75, 14, 48, 28, 29, 7, 22, 29, 7, 73, 83, 42, 29, 27, 29, 17, 14, 29, 88, 13, 10, 20, 66, 88, 30, 57, 44, 57, 56, 62, 119, 109};
    }

    public C0825Ck(boolean z8) {
        this.A00 = z8;
    }

    private void A02(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                for (String header : map.get(str)) {
                    String str2 = str + A00(1, 1, 74) + header;
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1806gB
    public final boolean AAZ() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1806gB
    public final void ABt(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        String str = httpURLConnection.getRequestMethod() + A00(0, 1, 21) + httpURLConnection.getURL().toString();
        if (obj instanceof String) {
            String str2 = A00(2, 9, 13) + ((String) obj);
        }
        A02(httpURLConnection.getRequestProperties());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1806gB
    public final void ABu(InterfaceC1789fu interfaceC1789fu) {
        if (interfaceC1789fu != null) {
            String str = A00(11, 13, 6) + interfaceC1789fu.getUrl();
            String str2 = A00(24, 8, 51) + interfaceC1789fu.A9C();
            A02(interfaceC1789fu.A8E());
        }
    }
}
