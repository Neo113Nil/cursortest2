package com.instagram.common.viewpoint.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Mg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1079Mg {
    public static byte[] A05;
    public static String[] A06 = {"nQDli3B322dNyuNUEmcA1lNjVYYmcThQ", "JG8wfEU3nZ2EADYXO0uZDMHFqmVSkpWr", "8K0NmfCVVugnhGVgpCD", "5JHmUKWu4ei3dzUY0lNr", "xKwnuhTKVDH3YhaAiUGpqwLltg47C3CG", "Jcwv8MY0", "vBOLiuiZ", "hny3hth3cGmNH4IG9ndqfAmzri4VXjHL"};
    public C2050kN A00;
    public final int A01;
    public final String A02;
    public final ArrayList<C1078Mf> A03;
    public final TreeSet<C2048kL> A04;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{115, -57, -62, 115, -100, -70, -68, -63, -66, -67, -100, -56, -57, -51, -66, -57, -51, -57, -30, -22, -19, -26, -27, -95, -11, -16, -95, -13, -26, -17, -30, -18, -26, -95};
    }

    static {
        A01();
    }

    public C1079Mg(int i, String str) {
        this(i, str, C2050kN.A03);
    }

    public C1079Mg(int i, String str, C2050kN c2050kN) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = c2050kN;
        this.A04 = new TreeSet<>();
        this.A03 = new ArrayList<>();
    }

    public final long A02(long j6, long j9) {
        boolean z3 = true;
        AbstractC06243y.A07(j6 >= 0);
        if (j9 < 0) {
            z3 = false;
        }
        AbstractC06243y.A07(z3);
        C2048kL A04 = A04(j6, j9);
        if (A04.A03()) {
            return -Math.min(A04.A04() ? Long.MAX_VALUE : A04.A01, j9);
        }
        long j10 = j6 + j9;
        if (j10 < 0) {
            j10 = Long.MAX_VALUE;
        }
        long currentEndPosition = A04.A02 + A04.A01;
        if (currentEndPosition < j10) {
            TreeSet<C2048kL> treeSet = this.A04;
            String[] strArr = A06;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "31viDRwdD8ErVcI5dXS";
            strArr2[3] = "q1k4diPGE3D0s4ujqDJA";
            for (C2048kL c2048kL : treeSet.tailSet(A04, false)) {
                if (c2048kL.A02 > currentEndPosition) {
                    break;
                }
                long j11 = c2048kL.A02;
                long queryEndPosition = c2048kL.A01;
                currentEndPosition = Math.max(currentEndPosition, j11 + queryEndPosition);
                if (currentEndPosition >= j10) {
                    break;
                }
            }
        }
        return Math.min(currentEndPosition - j6, j9);
    }

    public final C2050kN A03() {
        return this.A00;
    }

    public final C2048kL A04(long j6, long j9) {
        C2048kL A03 = C2048kL.A03(this.A02, j6);
        C2048kL floor = this.A04.floor(A03);
        if (floor != null && floor.A02 + floor.A01 > j6) {
            return floor;
        }
        C2048kL lookupSpan = this.A04.ceiling(A03);
        if (lookupSpan != null) {
            long j10 = lookupSpan.A02 - j6;
            if (j9 != -1) {
                j10 = Math.min(j10, j9);
            }
            j9 = j10;
        }
        return C2048kL.A04(this.A02, j6, j9);
    }

    public final C2048kL A05(C2048kL c2048kL, long j6, boolean z3) {
        AbstractC06243y.A08(this.A04.remove(c2048kL));
        File file = (File) AbstractC06243y.A01(c2048kL.A03);
        if (z3) {
            File file2 = file.getParentFile();
            File A052 = C2048kL.A05((File) AbstractC06243y.A01(file2), this.A01, c2048kL.A02, j6);
            if (file.renameTo(A052)) {
                file = A052;
            } else {
                AbstractC06324g.A07(A00(4, 13, 42), A00(17, 17, 82) + file + A00(0, 4, 36) + A052);
            }
        }
        C2048kL newCacheSpan = c2048kL.A09(file, j6);
        this.A04.add(newCacheSpan);
        return newCacheSpan;
    }

    public final TreeSet<C2048kL> A06() {
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

    public final void A08(C2048kL c2048kL) {
        this.A04.add(c2048kL);
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
        this.A03.add(new C1078Mf(j6, j9));
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

    public final boolean A0E(C1084Ml c1084Ml) {
        C2050kN c2050kN = this.A00;
        C2050kN oldMetadata = this.A00;
        this.A00 = oldMetadata.A05(c1084Ml);
        C2050kN oldMetadata2 = this.A00;
        return !oldMetadata2.equals(c2050kN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1079Mg c1079Mg = (C1079Mg) obj;
        if (this.A01 == c1079Mg.A01 && this.A02.equals(c1079Mg.A02) && this.A04.equals(c1079Mg.A04) && this.A00.equals(c1079Mg.A00)) {
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
