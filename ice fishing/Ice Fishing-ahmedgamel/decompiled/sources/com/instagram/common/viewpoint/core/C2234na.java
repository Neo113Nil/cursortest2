package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Looper;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.na, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2234na implements InterfaceC0947Hd {
    public static byte[] A0Y;
    public static String[] A0Z = {"85R60pw", "bhfqNyhgsMMcgxDZV18ZYvPWnAETveJ8", "tBTQ49uE8lCvjdowyQOxeOaVlddkkQsD", "cRYvTCVhA9B6pxggP4HMUODB0FrVm2He", "qWsUB7mYWdY8z", "PljQg4leV4XdGi9pMhsrxdm25IT3iHNc", "UH2NGYtrpmiPe", "fmnhpkR"};
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A08;

    @MetaExoPlayerCustomization("Added in D14652852 for LiveTrace")
    public Uri A0A;
    public C2400qI A0B;
    public C2400qI A0C;
    public C2400qI A0D;
    public InterfaceC07669s A0E;
    public DP A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final A1 A0T;
    public final A6 A0U;
    public final DL A0V;
    public final DN A0W = new DN();
    public int A01 = 1000;
    public int[] A0P = new int[this.A01];
    public long[] A0Q = new long[this.A01];
    public long[] A0R = new long[this.A01];
    public int[] A0N = new int[this.A01];
    public int[] A0O = new int[this.A01];
    public C0945Hb[] A0S = new C0945Hb[this.A01];
    public final C0845De<DO> A0X = new C0845De<>(new AnonymousClass49() { // from class: com.facebook.ads.redexgen.X.nb
        @Override // com.instagram.common.viewpoint.core.AnonymousClass49
        public final void A39(Object obj) {
            ((DO) obj).A01.AHb();
        }
    });
    public long A09 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public long A07 = Long.MIN_VALUE;
    public boolean A0L = true;
    public boolean A0M = true;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized int A03(C07036z c07036z, C2321p0 c2321p0, boolean z3, boolean z6, DN dn) {
        c2321p0.A04 = false;
        if (!A0K()) {
            if (!z6 && !this.A0G) {
                if (this.A0D == null || (!z3 && this.A0D == this.A0B)) {
                    return -3;
                }
                A0H((C2400qI) AbstractC06243y.A01(this.A0D), c07036z);
                return -5;
            }
            c2321p0.A02(4);
            return -4;
        }
        C2400qI c2400qI = this.A0X.A01(A0O()).A00;
        if (z3 || c2400qI != this.A0B) {
            A0H(c2400qI, c07036z);
            return -5;
        }
        int A00 = A00(this.A03);
        if (!A0L(A00)) {
            c2321p0.A04 = true;
            return -3;
        }
        c2321p0.A02(this.A0N[A00]);
        c2321p0.A01 = this.A0R[A00];
        if (c2321p0.A01 < this.A09) {
            c2321p0.A00(Integer.MIN_VALUE);
        }
        dn.A00 = this.A0O[A00];
        dn.A01 = this.A0Q[A00];
        dn.A02 = this.A0S[A00];
        return -4;
    }

    public static String A0C(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0Y, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0Y = new byte[]{35, 74, 57, 70, 70, 61, 56, 61, 66, 59, -12, 73, 66, 57, 76, 68, 57, 55, 72, 57, 56, -12, 66, 67, 66, 1, 71, 77, 66, 55, -12, 71, 53, 65, 68, c.f16317b, 57, -12, 58, 67, 70, -12, 58, 67, 70, 65, 53, 72, 14, -12, -62, -48, -36, -33, -37, -44, -64, -28, -44, -28, -44};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A0G(long j6, int i, long j9, int i6, C0945Hb c0945Hb) {
        if (this.A02 > 0) {
            int A00 = A00(this.A02 - 1);
            AbstractC06243y.A07(this.A0Q[A00] + ((long) this.A0O[A00]) <= j9);
        }
        this.A0G = (536870912 & i) != 0;
        this.A07 = Math.max(this.A07, j6);
        int A002 = A00(this.A02);
        this.A0R[A002] = j6;
        this.A0Q[A002] = j9;
        this.A0O[A002] = i6;
        this.A0N[A002] = i;
        this.A0S[A002] = c0945Hb;
        this.A0P[A002] = this.A05;
        if (this.A0X.A06() || !this.A0X.A00().A00.equals(this.A0D)) {
            this.A0X.A05(A0P(), new DO((C2400qI) AbstractC06243y.A01(this.A0D), this.A0U != null ? this.A0U.AH3(this.A0T, this.A0D) : A5.A00));
        }
        this.A02++;
        if (this.A02 == this.A01) {
            int i9 = this.A01 + 1000;
            int[] iArr = new int[i9];
            long[] jArr = new long[i9];
            long[] jArr2 = new long[i9];
            int[] iArr2 = new int[i9];
            int[] iArr3 = new int[i9];
            C0945Hb[] c0945HbArr = new C0945Hb[i9];
            int i10 = this.A01 - this.A04;
            System.arraycopy(this.A0Q, this.A04, jArr, 0, i10);
            System.arraycopy(this.A0R, this.A04, jArr2, 0, i10);
            System.arraycopy(this.A0N, this.A04, iArr2, 0, i10);
            System.arraycopy(this.A0O, this.A04, iArr3, 0, i10);
            System.arraycopy(this.A0S, this.A04, c0945HbArr, 0, i10);
            System.arraycopy(this.A0P, this.A04, iArr, 0, i10);
            int i11 = this.A04;
            System.arraycopy(this.A0Q, 0, jArr, i10, i11);
            System.arraycopy(this.A0R, 0, jArr2, i10, i11);
            System.arraycopy(this.A0N, 0, iArr2, i10, i11);
            System.arraycopy(this.A0O, 0, iArr3, i10, i11);
            System.arraycopy(this.A0S, 0, c0945HbArr, i10, i11);
            System.arraycopy(this.A0P, 0, iArr, i10, i11);
            this.A0Q = jArr;
            this.A0R = jArr2;
            this.A0N = iArr2;
            this.A0O = iArr3;
            this.A0S = c0945HbArr;
            this.A0P = iArr;
            this.A04 = 0;
            this.A01 = i9;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized long A0S() {
        return this.A02 == 0 ? Long.MIN_VALUE : this.A0R[this.A04];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0947Hd
    public final /* synthetic */ int AIp(InterfaceC05802c interfaceC05802c, int i, boolean z3) {
        return AbstractC0944Ha.A00(this, interfaceC05802c, i, z3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0947Hd
    public final /* synthetic */ void AIr(C06474v c06474v, int i) {
        AbstractC0944Ha.A01(this, c06474v, i);
    }

    static {
        A0E();
    }

    public C2234na(F0 f02, A6 a62, A1 a12) {
        this.A0U = a62;
        this.A0T = a12;
        this.A0V = new DL(f02);
    }

    private int A00(int i) {
        int i6 = this.A04 + i;
        int relativeIndex = this.A01;
        if (i6 < relativeIndex) {
            return i6;
        }
        int relativeIndex2 = this.A01;
        return i6 - relativeIndex2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if ((r0 & 1) != 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A01(int i, int i6, long j6, boolean z3) {
        int i9 = -1;
        for (int i10 = 0; i10 < i6 && this.A0R[i] <= j6; i10++) {
            if (z3) {
                int sampleCountToTarget = this.A0N[i];
            }
            i9 = i10;
            if (this.A0R[i] == j6) {
                break;
            }
            i++;
            int sampleCountToTarget2 = this.A01;
            if (i == sampleCountToTarget2) {
                i = 0;
            }
        }
        return i9;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A02(long j6) {
        int i = this.A02;
        int count = this.A02;
        int A00 = A00(count - 1);
        while (i > count && this.A0R[A00] >= j6) {
            i--;
            A00--;
            if (A00 == -1) {
                int i6 = this.A01;
                String[] strArr = A0Z;
                String str = strArr[5];
                String str2 = strArr[2];
                int relativeSampleIndex = str.charAt(3);
                int count2 = str2.charAt(3);
                if (relativeSampleIndex != count2) {
                    throw new RuntimeException();
                }
                A0Z[1] = "AmG8zl9kQR5zaFQB0ENdPerRnzM6g9Ua";
                A00 = i6 - 1;
            }
        }
        return i;
    }

    private synchronized long A04() {
        if (this.A02 == 0) {
            return -1L;
        }
        return A06(this.A02);
    }

    private final synchronized long A05() {
        return Math.max(this.A06, A08(this.A03));
    }

    private long A06(int i) {
        this.A06 = Math.max(this.A06, A08(i));
        this.A02 -= i;
        this.A00 += i;
        this.A04 += i;
        if (this.A04 >= this.A01) {
            this.A04 -= this.A01;
        }
        this.A03 -= i;
        if (this.A03 < 0) {
            this.A03 = 0;
        }
        this.A0X.A04(this.A00);
        if (this.A02 == 0) {
            int relativeLastDiscardIndex = this.A04 == 0 ? this.A01 : this.A04;
            int i6 = relativeLastDiscardIndex - 1;
            long j6 = this.A0Q[i6];
            int relativeLastDiscardIndex2 = this.A0O[i6];
            return j6 + relativeLastDiscardIndex2;
        }
        return this.A0Q[this.A04];
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long A07(int i) {
        boolean z3;
        int discardCount;
        int A0P = A0P() - i;
        boolean z6 = false;
        if (A0P >= 0) {
            int i6 = this.A02;
            int discardCount2 = this.A03;
            if (A0P <= i6 - discardCount2) {
                z3 = true;
                AbstractC06243y.A07(z3);
                int discardCount3 = this.A02;
                this.A02 = discardCount3 - A0P;
                long j6 = this.A06;
                int discardCount4 = this.A02;
                this.A07 = Math.max(j6, A08(discardCount4));
                if (A0P == 0) {
                    boolean z9 = this.A0G;
                    String[] strArr = A0Z;
                    String str = strArr[0];
                    String str2 = strArr[7];
                    int length = str.length();
                    int discardCount5 = str2.length();
                    if (length != discardCount5) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0Z;
                    strArr2[4] = "9q2py6RZjKVKU";
                    strArr2[6] = "N5i42TN5jvK54";
                    if (z9) {
                        z6 = true;
                    }
                }
                this.A0G = z6;
                this.A0X.A03(i);
                discardCount = this.A02;
                if (discardCount == 0) {
                    int discardCount6 = this.A02;
                    int relativeLastWriteIndex = A00(discardCount6 - 1);
                    long j9 = this.A0Q[relativeLastWriteIndex];
                    int discardCount7 = this.A0O[relativeLastWriteIndex];
                    return j9 + discardCount7;
                }
                return 0L;
            }
        }
        z3 = false;
        AbstractC06243y.A07(z3);
        int discardCount32 = this.A02;
        this.A02 = discardCount32 - A0P;
        long j62 = this.A06;
        int discardCount42 = this.A02;
        this.A07 = Math.max(j62, A08(discardCount42));
        if (A0P == 0) {
        }
        this.A0G = z6;
        this.A0X.A03(i);
        discardCount = this.A02;
        if (discardCount == 0) {
        }
    }

    private long A08(int i) {
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        long j6 = Long.MIN_VALUE;
        int A00 = A00(i - 1);
        for (int i6 = 0; i6 < i; i6++) {
            j6 = Math.max(j6, this.A0R[A00]);
            int i9 = this.A0N[A00];
            if ((i9 & 1) != 0) {
                break;
            }
            A00--;
            if (A00 == -1) {
                A00 = this.A01 - 1;
            }
        }
        return j6;
    }

    private synchronized long A09(long j6, boolean z3, boolean z6) {
        if (this.A02 != 0 && j6 >= this.A0R[this.A04]) {
            int A01 = A01(this.A04, (!z6 || this.A03 == this.A02) ? this.A02 : this.A03 + 1, j6, z3);
            if (A01 == -1) {
                return -1L;
            }
            return A06(A01);
        }
        return -1L;
    }

    private final C2400qI A0A(C2400qI c2400qI) {
        if (this.A08 != 0 && c2400qI.A0M != Long.MAX_VALUE) {
            return c2400qI.A07().A0s(c2400qI.A0M + this.A08).A14();
        }
        return c2400qI;
    }

    public static C2234na A0B(F0 f02, A6 a62, A1 a12) {
        return new C2234na(f02, (A6) AbstractC06243y.A01(a62), (A1) AbstractC06243y.A01(a12));
    }

    private void A0D() {
        if (this.A0E != null) {
            this.A0E.AHc(this.A0T);
            this.A0E = null;
            this.A0B = null;
        }
    }

    private synchronized void A0F() {
        this.A03 = 0;
        this.A0V.A0B();
    }

    private void A0H(C2400qI c2400qI, C07036z c07036z) {
        C2400qI c2400qI2;
        boolean z3 = this.A0B == null;
        DrmInitData newDrmInitData = z3 ? null : this.A0B.A0O;
        this.A0B = c2400qI;
        DrmInitData oldDrmInitData = c2400qI.A0O;
        if (this.A0U != null) {
            c2400qI2 = c2400qI.A08(this.A0U.A7W(c2400qI));
        } else {
            c2400qI2 = c2400qI;
        }
        c07036z.A00 = c2400qI2;
        c07036z.A01 = this.A0E;
        if (this.A0U == null) {
            return;
        }
        if (!z3) {
            boolean A1E = C5C.A1E(newDrmInitData, oldDrmInitData);
            String[] strArr = A0Z;
            if (strArr[5].charAt(3) != strArr[2].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Z;
            strArr2[5] = "kvzQNhfSOapIkFZHH0bucpMR2mlOE4Ro";
            strArr2[2] = "pNWQqJuQrvmashmvXYzFnQ0x9nljUjVN";
            if (A1E) {
                return;
            }
        }
        if (Looper.myLooper() == null) {
            return;
        }
        InterfaceC07669s interfaceC07669s = this.A0E;
        this.A0E = this.A0U.A3C(this.A0T, c2400qI);
        c07036z.A01 = this.A0E;
        if (interfaceC07669s != null) {
            interfaceC07669s.AHc(this.A0T);
        }
    }

    private final void A0J(boolean z3) {
        this.A0V.A0A();
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0M = true;
        this.A09 = Long.MIN_VALUE;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        this.A0G = false;
        this.A0X.A02();
        if (z3) {
            this.A0C = null;
            this.A0D = null;
            this.A0L = true;
        }
    }

    private boolean A0K() {
        return this.A03 != this.A02;
    }

    private boolean A0L(int i) {
        return this.A0E == null || this.A0E.A9A() == 4 || ((this.A0N[i] & 1073741824) == 0 && this.A0E.AH1());
    }

    private synchronized boolean A0M(long j6) {
        boolean z3 = true;
        if (this.A02 == 0) {
            if (j6 <= this.A06) {
                z3 = false;
            }
            return z3;
        }
        if (A05() >= j6) {
            return false;
        }
        int A02 = A02(j6);
        int retainCount = this.A00;
        A07(retainCount + A02);
        return true;
    }

    private synchronized boolean A0N(C2400qI c2400qI) {
        this.A0L = false;
        if (C5C.A1E(c2400qI, this.A0D)) {
            return false;
        }
        if (!this.A0X.A06() && this.A0X.A00().A00.equals(c2400qI)) {
            this.A0D = this.A0X.A00().A00;
        } else {
            this.A0D = c2400qI;
        }
        this.A0J = C3J.A0G(this.A0D.A0W, this.A0D.A0R);
        this.A0H = false;
        return true;
    }

    public final int A0O() {
        return this.A00 + this.A03;
    }

    public final int A0P() {
        return this.A00 + this.A02;
    }

    public final synchronized int A0Q(long j6, boolean z3) {
        int A00 = A00(this.A03);
        if (A0K() && j6 >= this.A0R[A00]) {
            if (j6 > this.A07 && z3) {
                int i = this.A02;
                int relativeReadIndex = this.A03;
                return i - relativeReadIndex;
            }
            int i6 = this.A02;
            int relativeReadIndex2 = this.A03;
            int offset = A01(A00, i6 - relativeReadIndex2, j6, true);
            if (offset == -1) {
                return 0;
            }
            return offset;
        }
        return 0;
    }

    public final int A0R(C07036z c07036z, C2321p0 c2321p0, int i, boolean z3) {
        int A03 = A03(c07036z, c2321p0, (i & 2) != 0, z3, this.A0W);
        if (A03 == -4 && !c2321p0.A05()) {
            int result = i & 1;
            boolean z6 = result != 0;
            int result2 = i & 4;
            if (result2 == 0) {
                if (z6) {
                    this.A0V.A0E(c2321p0, this.A0W);
                } else {
                    this.A0V.A0F(c2321p0, this.A0W);
                }
            }
            if (!z6) {
                int result3 = this.A03;
                this.A03 = result3 + 1;
            }
        }
        return A03;
    }

    public final synchronized long A0T() {
        return this.A07;
    }

    public final synchronized C2400qI A0U() {
        return this.A0L ? null : this.A0D;
    }

    public final void A0V() {
        this.A0V.A0C(A04());
    }

    public final void A0W() throws IOException {
        if (this.A0E == null || this.A0E.A9A() != 1) {
        } else {
            throw ((C07649q) AbstractC06243y.A01(this.A0E.A80()));
        }
    }

    public final void A0X() {
        A0V();
        A0D();
    }

    public final void A0Y() {
        A0J(true);
        A0D();
    }

    public final void A0Z() {
        A0J(false);
    }

    public final synchronized void A0a(int i) {
        boolean z3;
        if (i >= 0) {
            if (this.A03 + i <= this.A02) {
                z3 = true;
                AbstractC06243y.A07(z3);
                this.A03 += i;
            }
        }
        z3 = false;
        AbstractC06243y.A07(z3);
        this.A03 += i;
    }

    public final void A0b(long j6) {
        this.A09 = j6;
    }

    public final void A0c(long j6, boolean z3, boolean z6) {
        this.A0V.A0C(A09(j6, z3, z6));
    }

    public final void A0d(DP dp) {
        this.A0F = dp;
    }

    public final synchronized boolean A0e() {
        return this.A0G;
    }

    public final synchronized boolean A0f(long j6, boolean z3) {
        A0F();
        int A00 = A00(this.A03);
        if (!A0K() || j6 < this.A0R[A00] || (j6 > this.A07 && !z3)) {
            return false;
        }
        int i = this.A02;
        int relativeReadIndex = this.A03;
        int offset = A01(A00, i - relativeReadIndex, j6, true);
        if (offset == -1) {
            return false;
        }
        this.A09 = j6;
        int relativeReadIndex2 = this.A03;
        this.A03 = relativeReadIndex2 + offset;
        return true;
    }

    public final synchronized boolean A0g(boolean z3) {
        boolean z6 = true;
        if (!A0K()) {
            if (!z3 && !this.A0G && (this.A0D == null || this.A0D == this.A0B)) {
                z6 = false;
            }
            return z6;
        }
        if (this.A0X.A01(A0O()).A00 != this.A0B) {
            return true;
        }
        return A0L(A00(this.A03));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0947Hd
    public final void A6e(C2400qI c2400qI) {
        C2400qI A0A = A0A(c2400qI);
        this.A0K = false;
        this.A0C = c2400qI;
        boolean upstreamFormatChanged = A0N(A0A);
        if (this.A0F != null && upstreamFormatChanged) {
            this.A0F.AGL(A0A);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0947Hd
    public final int AIq(InterfaceC05802c interfaceC05802c, int i, boolean z3, int i6) throws IOException {
        return this.A0V.A08(interfaceC05802c, i, z3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0947Hd
    public final void AIs(C06474v c06474v, int i, int i6) {
        this.A0V.A0D(c06474v, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0947Hd
    public final void AIu(long j6, int i, int i6, int flags, C0945Hb c0945Hb) {
        int i9 = i;
        if (this.A0K) {
            A6e((C2400qI) AbstractC06243y.A02(this.A0C));
        }
        boolean z3 = (i9 & 1) != 0;
        if (this.A0M) {
            if (!z3) {
                return;
            } else {
                this.A0M = false;
            }
        }
        long j9 = j6 + this.A08;
        if (this.A0J) {
            if (j9 < this.A09) {
                return;
            }
            if ((i9 & 1) == 0) {
                if (!this.A0H) {
                    AbstractC06324g.A07(A0C(50, 11, 13), A0C(0, 50, 114) + this.A0D);
                    this.A0H = true;
                }
                i9 |= 1;
            }
        }
        if (this.A0I) {
            if (z3) {
                boolean A0M = A0M(j9);
                String[] strArr = A0Z;
                String str = strArr[0];
                String str2 = strArr[7];
                int length = str.length();
                int flags2 = str2.length();
                if (length == flags2) {
                    A0Z[3] = "Q9ljdKDjpshc47nqlMYBFO0YDotnOqX8";
                    if (!A0M) {
                        return;
                    } else {
                        this.A0I = false;
                    }
                }
                throw new RuntimeException();
            }
            return;
        }
        long A09 = this.A0V.A09();
        if (A0Z[1].charAt(24) == 'n') {
            A0Z[3] = "281h4YOhy96mUgaRFHojQOWi7hgLUzVm";
            A0G(j9, i9, (A09 - i6) - flags, i6, c0945Hb);
            return;
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0947Hd
    @MetaExoPlayerCustomization("Added in D14652852 for LiveTrace")
    public final void AKf(Uri uri) {
        this.A0A = uri;
    }
}
