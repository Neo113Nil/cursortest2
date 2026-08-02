package com.instagram.common.viewpoint.core;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Cm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0848Cm implements InterfaceC1810fu {
    public static byte[] A04;
    public int A00;
    public String A01;
    public Map<String, List<String>> A02;
    public byte[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{72, 99, 114, 113, 105, 116, 109, 38, 99, 116, 116, 105, 116};
    }

    public C0848Cm(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (IOException e9) {
            Log.e(getClass().getSimpleName(), A00(0, 13, 122), e9);
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1810fu
    public final byte[] A72() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1810fu
    public final String A73() {
        if (this.A03 != null) {
            return new String(this.A03);
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1810fu
    public final Map<String, List<String>> A8E() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1810fu
    public final int A9C() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1810fu
    public final String getUrl() {
        return this.A01;
    }
}
