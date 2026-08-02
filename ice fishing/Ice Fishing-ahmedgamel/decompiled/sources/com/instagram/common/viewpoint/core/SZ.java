package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class SZ {
    public static byte[] A00;
    public static String[] A01 = {"T8", "", "As3hIStO2xNa0GSSHrkEVjQu", "DXoFAMJTZKDaTyX0if7pZrkyLA7XvGsC", "niDMG5wZxQy0H8acRFWa8hH2XuraMrTN", "878XRXnWNCNw6FCwqGtfz4QO6Hd03tfb", "ID5FT62NpqbpmPra08cWCCHJVsi2pDHC", "txdj"};
    public static final AtomicReference<SX> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[7].length() != 4) {
                throw new RuntimeException();
            }
            A01[6] = "PcSdqCtN9qYKSfDsPVWrfTZjyuiu0dLa";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 86);
            i9++;
        }
    }

    public static void A05() {
        A00 = new byte[]{19, 27, 22, 17, 33, 40, 23, 36, 36, 27, 22, 23, 17, 15, 24, 15, 28, 19, 13, 43, 38, 40, 35, 33, 49, 56, 39, 52, 52, 43, 38, 39};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 12));
    }

    public static SX A00() {
        SX advertisingIdInfo = A02.get();
        if (advertisingIdInfo == null) {
            return SX.A00();
        }
        return advertisingIdInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SX A01(T8 t82, SX sx) {
        if (sx != null) {
            try {
            } catch (Throwable t6) {
                t82.A08().ABC(A04(12, 7, 84), AbstractC1272Td.A1Q, new C1273Te(t6));
            }
        }
        return AbstractC1248Sf.A00(t82);
        return sx;
    }

    public static SX A02(T8 t82, SX sx, SY sy) {
        C1244Sa c1244Sa = null;
        try {
            if (AbstractC1309Uo.A06(t82) && (sx == null || TextUtils.isEmpty(sx.A03()))) {
                c1244Sa = AbstractC1245Sb.A00(t82.getContentResolver());
            }
        } catch (Throwable th) {
            t82.A08().ABC(A04(12, 7, 84), AbstractC1272Td.A1S, new C1273Te(th));
        }
        if (c1244Sa != null && c1244Sa.A01 != null) {
            A03.set(c1244Sa.A01);
            sy.A05(c1244Sa.A01);
        }
        if (sx == null && c1244Sa != null && !TextUtils.isEmpty(c1244Sa.A00)) {
            return new SX(c1244Sa.A00, c1244Sa.A02, SW.A04);
        }
        return sx;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 12);
        }
        return attributionId;
    }

    public static void A06(SY sy) {
        A02.set(sy.A02());
        A03.set(sy.A03());
    }

    public static void A07(T8 t82) {
        long j6;
        SX advertisingIdInfo;
        try {
            SY sy = new SY(t82);
            A06(sy);
            if (A08()) {
                return;
            }
            SX advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                j6 = advertisingIdInfo2.A01();
            } else {
                j6 = -1;
            }
            if (j6 > 0 && System.currentTimeMillis() - j6 < AbstractC1309Uo.A00(t82)) {
                return;
            }
            if (AbstractC1309Uo.A07(t82)) {
                advertisingIdInfo = A01(t82, A02(t82, null, sy));
            } else {
                advertisingIdInfo = A02(t82, A01(t82, null), sy);
            }
            if (advertisingIdInfo != null && !TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                sy.A04(advertisingIdInfo);
            }
        } catch (Throwable t6) {
            t82.A08().ABC(A04(12, 7, 84), AbstractC1272Td.A1R, new C1273Te(t6));
        }
    }

    public static boolean A08() {
        boolean z6 = false;
        boolean updated = XD.A04();
        if (updated) {
            String A04 = A04(0, 12, 92);
            boolean updated2 = XD.A05(A04);
            if (updated2) {
                A03.set(XD.A01(A04));
                z6 = true;
            }
        }
        boolean A042 = XD.A04();
        if (A01[7].length() != 4) {
            throw new RuntimeException();
        }
        A01[6] = "Cpq5b7Aomj18wFHDN8BPNJlk9AiHAVMm";
        if (!A042) {
            return z6;
        }
        String A043 = A04(19, 13, 108);
        boolean updated3 = XD.A05(A043);
        if (updated3) {
            String A012 = XD.A01(A043);
            AtomicReference<SX> atomicReference = A02;
            if (A012 == null) {
                if (A01[7].length() != 4) {
                    A01[7] = "Ywke";
                    A012 = A04(0, 0, 2);
                } else {
                    A01[5] = "aB8iQRCNNWTx0AWcZvgXlT81SikGsrWB";
                    A012 = A04(0, 0, 12);
                }
            }
            atomicReference.set(new SX(A012, false, SW.A03));
            return true;
        }
        return z6;
    }
}
