package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.p5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2326p5 extends C06535b {
    public static byte[] A02;
    public final int A00;
    public final C06605i A01;

    static {
        A06();
    }

    public static String A05(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 56);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{-39, -30, -37, -41, -24, -22, -37, -18, -22, -92, -96, -28, -27, -22, -106, -26, -37, -24, -29, -33, -22, -22, -37, -38, -92, -96};
    }

    public C2326p5(C06605i c06605i, int i, int i6) {
        super(A03(i, i6));
        this.A01 = c06605i;
        this.A00 = i6;
    }

    public C2326p5(IOException iOException, C06605i c06605i, int i, int i6) {
        super(iOException, A03(i, i6));
        this.A01 = c06605i;
        this.A00 = i6;
    }

    public C2326p5(String str, C06605i c06605i, int i, int i6) {
        super(str, A03(i, i6));
        this.A01 = c06605i;
        this.A00 = i6;
    }

    public C2326p5(String str, IOException iOException, C06605i c06605i, int i, int i6) {
        super(str, iOException, A03(i, i6));
        this.A01 = c06605i;
        this.A00 = i6;
    }

    public static int A03(int i, int i6) {
        if (i == 2000 && i6 == 1) {
            return AdError.INTERNAL_ERROR_CODE;
        }
        return i;
    }

    public static C2326p5 A04(IOException iOException, C06605i c06605i, int i) {
        int errorCode;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            errorCode = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            errorCode = 1004;
        } else {
            if (message != null) {
                String A01 = AbstractC2035k7.A01(message);
                String message2 = A05(0, 26, 62);
                if (A01.matches(message2)) {
                    errorCode = 2007;
                }
            }
            errorCode = AdError.INTERNAL_ERROR_CODE;
        }
        if (errorCode == 2007) {
            return new AM(iOException, c06605i);
        }
        return new C2326p5(iOException, c06605i, errorCode, i);
    }
}
