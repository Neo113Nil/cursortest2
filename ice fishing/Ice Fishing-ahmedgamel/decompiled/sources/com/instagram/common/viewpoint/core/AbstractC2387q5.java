package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.q5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2387q5<K0, V0> {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{97, 116, 108, 97, 95, 112, 97, 96, 71, 97, 117, 111};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q5 != com.google.common.collect.MultimapBuilder<K0, V0> */
    public AbstractC2387q5() {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q5 != com.google.common.collect.MultimapBuilder<K0, V0> */
    public /* synthetic */ AbstractC2387q5(BG bg) {
        this();
    }

    public static AbstractC2386q4<Object> A00(int expectedKeys) {
        AbstractC2217nJ.A00(expectedKeys, A03(0, 12, 125));
        return new BG(expectedKeys);
    }

    public static <K0> AbstractC2386q4<K0> A01(Comparator<K0> comparator) {
        AbstractC2070ki.A04(comparator);
        return new BF(comparator);
    }

    public static AbstractC2386q4<Comparable> A02() {
        return A01(AbstractC2402qK.A03());
    }
}
