package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Sl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1254Sl implements InterfaceC1812fw {
    public static byte[] A03;
    public static String[] A04 = {"vUQacvUb1jgaOB1nXCILUaEr4ItZ5QEs", "N", "ozPzI", "iemFS7qx3ItQSdDQeBrvuJ9y9CMkfIqY", "EwROMxnfRd6F7268i4EpvPtVg3hQf", "a", "qVu8", "3RxrE6NsEsLt8TXu"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ WA A01;
    public final /* synthetic */ WD A02;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{85, 81, 3, 85, 87, 7, 80, 3, 60, 111, 51, c.f17105c, 51, c.f17105c, 107, 60, 44, 53, 41, 40, 35, 30, 5, 3, 22, 18, 15, 9, 8, 92, 70, 78, 120, 111, 107, 120, 111, 61, 120, 111, 111, 114, 111, 61, 114, 126, 126, 104, 111, 111, 120, 121, 124, 74, 93, 89, 74, 93, 15, 93, 74, 95, 67, 70, 74, 75, 15, 92, 90, 76, 76, 74, 92, 92, 73, 90, 67, 67, 86, c.f17105c, 62, 19, c.f17105c, 61, 32, 60, 53, 36, 53, 16, 17, 58, 13, 13, 16, 13};
    }

    static {
        A01();
    }

    public C1254Sl(WD wd, WA wa, long j6) {
        this.A02 = wd;
        this.A01 = wa;
        this.A00 = j6;
    }

    private final void A02(C1824g8 c1824g8) {
        C1860gi c1860gi;
        long j6;
        C1860gi c1860gi2;
        long j9;
        WE we;
        C1860gi c1860gi3;
        C1860gi c1860gi4;
        long j10;
        W9.A06(this.A01);
        try {
            InterfaceC1810fu response = c1824g8.A00();
            if (response != null) {
                String A73 = response.A73();
                we = this.A02.A06;
                c1860gi3 = this.A02.A05;
                WG serverResponse = we.A07(c1860gi3, A73, this.A00);
                if (serverResponse.A01() == WF.A03) {
                    R4 r42 = (R4) serverResponse;
                    String A042 = r42.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(r42.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A042 != null) {
                        A73 = A042;
                    }
                    c1860gi4 = this.A02.A05;
                    InterfaceC1086Lt A0F = c1860gi4.A0F();
                    j10 = this.A02.A01;
                    A0F.A3W(Y1.A01(j10), adErrorTypeFromCode.getErrorCode(), A73, adErrorTypeFromCode.isPublicError());
                    this.A02.A0E(C1332Vm.A01(adErrorTypeFromCode, A73));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = c1824g8.getMessage();
            c1860gi2 = this.A02.A05;
            InterfaceC1086Lt A0F2 = c1860gi2.A0F();
            j9 = this.A02.A01;
            long A01 = Y1.A01(j9);
            int errorCode = adErrorType.getErrorCode();
            boolean isPublicError = adErrorType.isPublicError();
            if (A04[2].length() == 29) {
                throw new RuntimeException();
            }
            A04[4] = "NZ18w";
            A0F2.A3W(A01, errorCode, message, isPublicError);
            this.A02.A0E(C1332Vm.A01(adErrorType, message));
        } catch (JSONException e9) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage = c1824g8.getMessage();
            c1860gi = this.A02.A05;
            InterfaceC1086Lt A0F3 = c1860gi.A0F();
            j6 = this.A02.A01;
            A0F3.A3W(Y1.A01(j6), adErrorType2.getErrorCode(), A00(16, 15, 30) + e9.getMessage(), adErrorType2.isPublicError());
            this.A02.A0E(C1332Vm.A01(adErrorType2, errorMessage));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1812fw
    public final void ADR(InterfaceC1810fu interfaceC1810fu) {
        C1860gi c1860gi;
        C1860gi c1860gi2;
        AbstractC1343Vy.A05(A00(79, 10, 40), A00(52, 27, 87), A00(8, 8, 114));
        if (interfaceC1810fu != null) {
            String A73 = interfaceC1810fu.A73();
            c1860gi = this.A02.A05;
            int A02 = C1310Up.A02(c1860gi);
            String[] strArr = A04;
            String str = strArr[5];
            String response = strArr[1];
            if (str.length() != response.length()) {
                throw new RuntimeException();
            }
            A04[2] = "kblvpkFa8oUK1ItVGqcsW93nH";
            if (A02 > 0) {
                c1860gi2 = this.A02.A05;
                C1356Wl.A00(c1860gi2).A0C(A73);
            }
            W9.A06(this.A01);
            this.A02.A0O(A73, this.A00, this.A01);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1812fw
    public final void ADq(Exception exc) {
        C1860gi c1860gi;
        long j6;
        AbstractC1343Vy.A05(A00(89, 7, 7), A00(31, 21, 101), A00(0, 8, 30));
        if (C1824g8.class.equals(exc.getClass())) {
            A02((C1824g8) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        c1860gi = this.A02.A05;
        InterfaceC1086Lt A0F = c1860gi.A0F();
        j6 = this.A02.A01;
        A0F.A3W(Y1.A01(j6), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0E(C1332Vm.A01(adErrorType, errorMessage));
    }
}
