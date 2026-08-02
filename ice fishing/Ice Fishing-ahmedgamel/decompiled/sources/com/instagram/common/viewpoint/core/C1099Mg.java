package com.instagram.common.viewpoint.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Mg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1099Mg {
    public static byte[] A05;
    public static String[] A06 = {"nQDli3B322dNyuNUEmcA1lNjVYYmcThQ", "JG8wfEU3nZ2EADYXO0uZDMHFqmVSkpWr", "8K0NmfCVVugnhGVgpCD", "5JHmUKWu4ei3dzUY0lNr", "xKwnuhTKVDH3YhaAiUGpqwLltg47C3CG", "Jcwv8MY0", "vBOLiuiZ", "hny3hth3cGmNH4IG9ndqfAmzri4VXjHL"};
    public C2070kN A00;
    public final int A01;
    public final String A02;
    public final ArrayList<C1098Mf> A03;
    public final TreeSet<C2068kL> A04;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{115, -57, -62, 115, -100, -70, -68, -63, -66, -67, -100, -56, -57, -51, -66, -57, -51, -57, -30, -22, -19, -26, -27, -95, -11, -16, -95, -13, -26, -17, -30, -18, -26, -95};
    }

    static {
        A01();
    }

    public C1099Mg(int i, String str) {
        this(i, str, C2070kN.A03);
    }

    public C1099Mg(int i, String str, C2070kN c2070kN) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = c2070kN;
        this.A04 = new TreeSet<>();
        this.A03 = new ArrayList<>();
    }

    public final long A02(long j6, long j9) {
        boolean z6 = true;
        AbstractC06443y.A07(j6 >= 0);
        if (j9 < 0) {
            z6 = false;
        }
        AbstractC06443y.A07(z6);
        C2068kL A04 = A04(j6, j9);
        if (A04.A03()) {
            return -Math.min(A04.A04() ? Long.MAX_VALUE : A04.A01, j9);
        }
        long j10 = j6 + j9;
        if (j10 < 0) {
            j10 = Long.MAX_VALUE;
        }
        long currentEndPosition = A04.A02 + A04.A01;
        if (currentEndPosition < j10) {
            TreeSet<C2068kL> treeSet = this.A04;
            String[] strArr = A06;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "31viDRwdD8ErVcI5dXS";
            strArr2[3] = "q1k4diPGE3D0s4ujqDJA";
            for (C2068kL c2068kL : treeSet.tailSet(A04, false)) {
                if (c2068kL.A02 > currentEndPosition) {
                    break;
                }
                long j11 = c2068kL.A02;
                long queryEndPosition = c2068kL.A01;
                currentEndPosition = Math.max(currentEndPosition, j11 + queryEndPosition);
                if (currentEndPosition >= j10) {
                    break;
                }
            }
        }
        return Math.min(currentEndPosition - j6, j9);
    }

    public final C2070kN A03() {
        return this.A00;
    }

    public final C2068kL A04(long j6, long j9) {
        C2068kL A03 = C2068kL.A03(this.A02, j6);
        C2068kL floor = this.A04.floor(A03);
        if (floor != null && floor.A02 + floor.A01 > j6) {
            return floor;
        }
        C2068kL lookupSpan = this.A04.ceiling(A03);
        if (lookupSpan != null) {
            long j10 = lookupSpan.A02 - j6;
            if (j9 != -1) {
                j10 = Math.min(j10, j9);
            }
            j9 = j10;
        }
        return C2068kL.A04(this.A02, j6, j9);
    }

    public final C2068kL A05(C2068kL c2068kL, long j6, boolean z6) {
        AbstractC06443y.A08(this.A04.remove(c2068kL));
        File file = (File) AbstractC06443y.A01(c2068kL.A03);
        if (z6) {
            File file2 = file.getParentFile();
            File A052 = C2068kL.A05((File) AbstractC06443y.A01(file2), this.A01, c2068kL.A02, j6);
            if (file.renameTo(A052)) {
                file = A052;
            } else {
                AbstractC06524g.A07(A00(4, 13, 42), A00(17, 17, 82) + file + A00(0, 4, 36) + A052);
            }
        }
        C2068kL newCacheSpan = c2068kL.A09(file, j6);
        this.A04.add(newCacheSpan);
        return newCacheSpan;
    }

    public final TreeSet<C2068kL> A06() {
        return this.A04;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A07(long j6) {
        for (int i = 0; i < i; i++) {
            if (this.A03.get(i).A01 == j6) {
                this.A03.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void A08(C2068kL c2068kL) {
        this.A04.add(c2068kL);
    }

    public final boolean A09() {
        return this.A04.isEmpty();
    }

    public final boolean A0A() {
        return this.A03.isEmpty();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0B(long j6, long j9) {
        for (int i = 0; i < i; i++) {
            if (this.A03.get(i).A00(j6, j9)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0C(long j6, long j9) {
        for (int i = 0; i < i; i++) {
            if (this.A03.get(i).A01(j6, j9)) {
                return false;
            }
        }
        this.A03.add(new C1098Mf(j6, j9));
        return true;
    }

    public final boolean A0D(MZ mz) {
        if (this.A04.remove(mz)) {
            if (mz.A03 != null) {
                mz.A03.delete();
                return true;
            }
            return true;
        }
        String[] strArr = A06;
        if (strArr[2].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[2] = "U4uu0ltzeeg5QMm1KwS";
        strArr2[3] = "VtFGErd1YdVsfyUNL3Po";
        return false;
    }

    public final boolean A0E(C1104Ml c1104Ml) {
        C2070kN c2070kN = this.A00;
        C2070kN oldMetadata = this.A00;
        this.A00 = oldMetadata.A05(c1104Ml);
        C2070kN oldMetadata2 = this.A00;
        return !oldMetadata2.equals(c2070kN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1099Mg c1099Mg = (C1099Mg) obj;
        if (this.A01 == c1099Mg.A01 && this.A02.equals(c1099Mg.A02) && this.A04.equals(c1099Mg.A04) && this.A00.equals(c1099Mg.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i = result * 31;
        int result2 = this.A02.hashCode();
        return ((i + result2) * 31) + this.A00.hashCode();
    }
}
