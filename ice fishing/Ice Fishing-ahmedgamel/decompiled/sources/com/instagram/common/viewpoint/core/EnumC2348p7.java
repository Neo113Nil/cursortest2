package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.facebook.ads.redexgen.X.p7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC2348p7 implements Iterator<Object> {
    A03;

    public static byte[] A00;
    public static String[] A01 = {"MtVTs5cDzTkaqvg8NuH3vwobapVBE0st", "ArMYDbI1ZOKb1PqTCippk6Br36HImDMz", "toSUZKKd1UGhUJ4QalyaWathzboIF5UW", "VPzDHjdriWPgU4d", "Di5eRoJ6h3CuCR5uxiNB2s29p0t6qO11", "B6Kcd5hxdA7PPWxpRUkmfJ1syAdRnb1r", "u5nu3DOOZeH", "WD4F9WHgG47OHFbe2E6bcqFaZ5qcCEPl"};

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            int i10 = (copyOfRange[i9] ^ i6) ^ 118;
            if (A01[4].charAt(4) != 'R') {
                throw new RuntimeException();
            }
            A01[6] = "SHVGlB8lB2rly5Sbj1O4M1TTC2AUnN6";
            copyOfRange[i9] = (byte) i10;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{98, 101, 120, Byte.MAX_VALUE, 106, 101, 104, 110};
    }

    static {
        A01();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC2237nJ.A04(false);
    }
}
