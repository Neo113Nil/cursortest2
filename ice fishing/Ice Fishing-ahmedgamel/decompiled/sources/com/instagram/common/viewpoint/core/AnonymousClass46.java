package com.instagram.common.viewpoint.core;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.46, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AnonymousClass46 {
    public static byte[] A00;
    public static String[] A01 = {"iRbt0o504Arwoby5JHXaSNdVCCanqX3Z", "ASbg6tg4kzyOiw5fOrTV48A6bdNu61QQ", "VJNj5t4vCwi8aTooUiCSn6hrJqJmgDCA", "jF3QiYzhpB2jmiLUWXOlRV8C8MCMW37s", "04l0YgLQyX7hnS2Tq5aYjCPcYldth61t", "viWvpQwMaKSmF6BaYaPf73TpnglWhe5o", "UZSp3mVbJo9", "8WqjnkkE7kcSKcejfHJHrMyyjo529bht"};
    public static final byte[] A02;
    public static final String[] A03;

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-49, -58, -47, -45, -7, -5, -84, -74, 13, 34, 15, -35, -38, -47, -36, -34, 4, -47, -36, -34, 4, -47, -36, -34, 4, -43, -29, -48, -98, -101, -110, -32, -110, -47, -101, -110, -59, -101, -110, -48, -110, -47};
    }

    static {
        A05();
        A02 = new byte[]{0, 0, 0, 1};
        A03 = new String[]{A02(0, 0, 27), A02(5, 1, 112), A02(6, 1, 32), A02(7, 1, 41)};
    }

    public static Pair<Integer, Integer> A00(byte[] bArr) {
        C06674v c06674v = new C06674v(bArr);
        c06674v.A0f(9);
        int sampleRate = c06674v.A0I();
        c06674v.A0f(20);
        return Pair.create(Integer.valueOf(c06674v.A0L()), Integer.valueOf(sampleRate));
    }

    public static String A01(int i, int i4, int i6) {
        return String.format(A02(8, 17, 98), Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6));
    }

    public static String A03(int i, boolean z6, int i4, int i6, int[] iArr, int i9) {
        StringBuilder sb = new StringBuilder(C5C.A0n(A02(25, 17, 35), A03[i], Integer.valueOf(i4), Integer.valueOf(i6), Character.valueOf(z6 ? 'H' : 'L'), Integer.valueOf(i9)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i10 = 0; i10 < length; i10++) {
            sb.append(String.format(A02(0, 5, 87), Integer.valueOf(iArr[i10])));
        }
        return sb.toString();
    }

    public static List<byte[]> A04(boolean z6) {
        byte[] bArr = new byte[1];
        if (z6) {
            bArr[0] = 1;
        } else {
            bArr[0] = 0;
        }
        return Collections.singletonList(bArr);
    }

    public static boolean A06(List<byte[]> list) {
        if (list.size() != 1 || list.get(0).length != 1) {
            return false;
        }
        byte b9 = list.get(0)[0];
        if (A01[6].length() != 11) {
            throw new RuntimeException();
        }
        A01[6] = "7rG63N7qIw7";
        return b9 == 1;
    }

    public static byte[] A07(byte[] bArr, int i, int i4) {
        byte[] bArr2 = new byte[A02.length + i4];
        byte[] bArr3 = A02;
        byte[] nalUnit = A02;
        System.arraycopy(bArr3, 0, bArr2, 0, nalUnit.length);
        byte[] nalUnit2 = A02;
        System.arraycopy(bArr, i, bArr2, nalUnit2.length, i4);
        return bArr2;
    }
}
