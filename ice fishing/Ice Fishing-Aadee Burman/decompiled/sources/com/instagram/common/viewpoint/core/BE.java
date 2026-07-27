package com.instagram.common.viewpoint.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class BE<V> implements InterfaceC2081ku<List<V>>, Serializable {
    public static byte[] A01;
    public static String[] A02 = {"e5wnLSIbQxkq8Zb8jKmA", "K5DmaQySCrjWvleFa", "LWuY7vQYlXU7vsjuD", "M7ok9ovwGeM", "5nYOTBMz755", "tdWE3UbGCkl2", "in1BIrIvXgLkxgASW", "Nc3XS6cKk9DYxfmxbznhVqbsdMI4LYY"};
    public final int A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            int i11 = copyOfRange[i10] - i9;
            if (A02[0].length() != 20) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "LeP2zF5PzD6";
            strArr[4] = "FkYvCPAL8bA";
            copyOfRange[i10] = (byte) (i11 - 73);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {10, 29, 21, 10, 8, 25, 10, 9, -5, 6, 17, 26, 10, 24, -11, 10, 23, -16, 10, 30};
        String[] strArr = A02;
        if (strArr[2].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "U6hTL0roTrM";
        strArr2[4] = "z8jhm3qQIoz";
        A01 = bArr;
    }

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.MultimapBuilder$ArrayListSupplier<V> */
    public BE(int expectedValuesPerKey) {
        this.A00 = AbstractC2217nJ.A00(expectedValuesPerKey, A00(0, 20, 92));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.MultimapBuilder$ArrayListSupplier<V> */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2081ku
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final List<V> get() {
        return new ArrayList(this.A00);
    }
}
