package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.anythink.basead.exoplayer.b;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.7E, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7E {
    public static String[] A0B = {"ytES6GjYCCZeLRsctY", "", "JAF1Tg0UjyffIggj5BNMmxVlRkgdhjMr", "rlk3ZCySajOx3", "MCGN0v", "", "6TmcGiXQ57FFOBCo2j", "Z1k2a4cknNke6aCh8ssxRFJ66FmodiBm"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C7A A04;
    public C7A A05;
    public C7A A06;
    public Object A07;
    public boolean A08;
    public final C2367pl A09 = new C2367pl();
    public final C2365pj A0A = new C2365pj();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2248no A06(Timeline timeline, Object obj, long j6, long j9, C2367pl c2367pl) {
        timeline.A0J(obj, c2367pl);
        int A08 = c2367pl.A08(j6);
        return A08 == -1 ? new C2248no(obj, j9) : new C2248no(obj, A08, c2367pl.A05(A08), j9);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final C7B A0I(Timeline timeline, C7B c7b) {
        long j6 = c7b.A01;
        boolean A08 = A08(timeline, c7b.A04, j6);
        boolean A09 = A09(timeline, c7b.A04, A08);
        timeline.A0J(c7b.A04.A04, this.A09);
        return new C7B(c7b.A04, c7b.A03, j6, c7b.A02, c7b.A04.A00() ? this.A09.A0E(c7b.A04.A00, c7b.A04.A01) : j6 == Long.MIN_VALUE ? this.A09.A0A() : j6, A08, A09);
    }

    private long A00(Timeline timeline, Object obj) {
        int oldFrontPeriodIndex;
        int holderWindowIndex = timeline.A0J(obj, this.A09).A00;
        if (this.A07 != null && (oldFrontPeriodIndex = timeline.A0A(this.A07)) != -1) {
            int windowIndex = timeline.A0H(oldFrontPeriodIndex, this.A09).A00;
            if (windowIndex == holderWindowIndex) {
                return this.A03;
            }
        }
        for (C7A mediaPeriodHolder = A0D(); mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.A0I()) {
            if (mediaPeriodHolder.A08.equals(obj)) {
                return mediaPeriodHolder.A00.A04.A03;
            }
        }
        for (C7A A0D = A0D(); A0D != null; A0D = A0D.A0I()) {
            int A0A = timeline.A0A(A0D.A08);
            if (A0A != -1) {
                int windowIndex2 = timeline.A0H(A0A, this.A09).A00;
                if (windowIndex2 == holderWindowIndex) {
                    return A0D.A00.A04.A03;
                }
            }
        }
        long j6 = this.A02;
        this.A02 = 1 + j6;
        return j6;
    }

    private C7B A01(Timeline timeline, C7A c7a, long j6) {
        long j9;
        C7E c7e = this;
        C7B c7b = c7a.A00;
        if (c7b.A07) {
            int A0A = timeline.A0A(c7b.A04.A04);
            C2367pl c2367pl = c7e.A09;
            C2365pj c2365pj = c7e.A0A;
            int currentPeriodIndex = c7e.A01;
            int A09 = timeline.A09(A0A, c2367pl, c2365pj, currentPeriodIndex, c7e.A08);
            if (A09 == -1) {
                return null;
            }
            int i = timeline.A0I(A09, c7e.A09, true).A00;
            Object obj = c7e.A09.A04;
            long j10 = c7b.A04.A03;
            if (timeline.A0K(i, c7e.A0A).A00 == A09) {
                Pair<Object, Long> defaultPosition = timeline.A0F(c7e.A0A, c7e.A09, i, b.f6382b, Math.max(0L, (c7a.A0B() + c7b.A00) - j6));
                if (defaultPosition == null) {
                    return null;
                }
                obj = defaultPosition.first;
                j9 = ((Long) defaultPosition.second).longValue();
                C7A A0I = c7a.A0I();
                if (A0I != null && A0I.A08.equals(obj)) {
                    j10 = A0I.A00.A04.A03;
                    c7e = this;
                } else {
                    c7e = this;
                    j10 = c7e.A02;
                    long startPositionUs = 1 + j10;
                    String[] strArr = A0B;
                    if (strArr[6].length() == strArr[4].length()) {
                        throw new RuntimeException();
                    }
                    A0B[0] = "5yy5YdDharfiXP";
                    c7e.A02 = startPositionUs;
                }
            } else {
                j9 = 0;
            }
            return A02(timeline, A06(timeline, obj, j9, j10, c7e.A09), j9, j9);
        }
        C2248no c2248no = c7b.A04;
        timeline.A0J(c2248no.A04, c7e.A09);
        if (c2248no.A00()) {
            int i6 = c2248no.A00;
            int A04 = c7e.A09.A04(i6);
            if (A04 != -1) {
                int A06 = c7e.A09.A06(i6, c2248no.A01);
                if (A06 < A04) {
                    if (!c7e.A09.A0I(i6, A06)) {
                        return null;
                    }
                    return A03(timeline, c2248no.A04, i6, A06, c7b.A02, c2248no.A03);
                }
                return A04(timeline, c2248no.A04, c7b.A02, c2248no.A03);
            }
            String[] strArr2 = A0B;
            if (strArr2[5].length() != strArr2[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0B;
            strArr3[5] = "";
            strArr3[1] = "";
            return null;
        }
        if (c7b.A01 != Long.MIN_VALUE) {
            int A08 = c7e.A09.A08(c7b.A01);
            if (A08 == -1) {
                return A04(timeline, c2248no.A04, c7b.A01, c2248no.A03);
            }
            int A05 = c7e.A09.A05(A08);
            if (!c7e.A09.A0I(A08, A05)) {
                return null;
            }
            return A03(timeline, c2248no.A04, A08, A05, c7b.A01, c2248no.A03);
        }
        int A03 = c7e.A09.A03();
        if (A03 == 0) {
            return null;
        }
        int i9 = A03 - 1;
        if (A0B[7].charAt(7) == 'k') {
            A0B[0] = "u0JZC9rSowd61rcMlDOlOE";
            if (c7e.A09.A0D(i9) != Long.MIN_VALUE) {
                return null;
            }
        } else if (c7e.A09.A0D(i9) != Long.MIN_VALUE) {
            return null;
        }
        if (c7e.A09.A0H(i9)) {
            return null;
        }
        int A052 = c7e.A09.A05(i9);
        if (!c7e.A09.A0I(i9, A052)) {
            return null;
        }
        return A03(timeline, c2248no.A04, i9, A052, c7e.A09.A0A(), c2248no.A03);
    }

    private C7B A02(Timeline timeline, C2248no c2248no, long j6, long j9) {
        timeline.A0J(c2248no.A04, this.A09);
        if (c2248no.A00()) {
            if (!this.A09.A0I(c2248no.A00, c2248no.A01)) {
                return null;
            }
            return A03(timeline, c2248no.A04, c2248no.A00, c2248no.A01, j6, c2248no.A03);
        }
        return A04(timeline, c2248no.A04, j9, c2248no.A03);
    }

    private C7B A03(Timeline timeline, Object obj, int i, int i6, long startPositionUs, long j6) {
        long j9;
        C2248no c2248no = new C2248no(obj, i, i6, j6);
        boolean A08 = A08(timeline, c2248no, Long.MIN_VALUE);
        boolean A09 = A09(timeline, c2248no, A08);
        long A0E = timeline.A0J(c2248no.A04, this.A09).A0E(c2248no.A00, c2248no.A01);
        if (i6 == this.A09.A05(i)) {
            C2367pl c2367pl = this.A09;
            if (A0B[0].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[6] = "btiW32P1CxlKUaykVb";
            strArr[4] = "aD0NnH";
            j9 = c2367pl.A09();
        } else {
            j9 = 0;
        }
        return new C7B(c2248no, j9, Long.MIN_VALUE, startPositionUs, A0E, A08, A09);
    }

    private C7B A04(Timeline timeline, Object obj, long j6, long j9) {
        long A0D;
        long j10;
        C2248no c2248no = new C2248no(obj, j9);
        timeline.A0J(c2248no.A04, this.A09);
        int A07 = this.A09.A07(j6);
        if (A07 == -1) {
            A0D = Long.MIN_VALUE;
        } else {
            C2367pl c2367pl = this.A09;
            String[] strArr = A0B;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "hcjC8Oe5bspAHclLrN";
            strArr2[4] = "7U4c4Z";
            A0D = c2367pl.A0D(A07);
        }
        boolean isLastInTimeline = A08(timeline, c2248no, A0D);
        boolean A09 = A09(timeline, c2248no, isLastInTimeline);
        if (A0D == Long.MIN_VALUE) {
            j10 = this.A09.A0A();
        } else {
            j10 = A0D;
        }
        return new C7B(c2248no, j6, A0D, b.f6382b, j10, isLastInTimeline, A09);
    }

    private C7B A05(C7Z c7z) {
        return A02(c7z.A03, c7z.A05, c7z.A01, c7z.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r2[5].length() == r2[1].length()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r3.A00 = A0I(r13, r3.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (A0N() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        r2 = com.instagram.common.viewpoint.core.C7E.A0B;
        r2[6] = "90zfs8gzmg4UDoZfId";
        r2[4] = "a4jnrj";
        r3.A00 = A0I(r13, r3.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r4 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return true;
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A07(Timeline timeline) {
        C7A nextMediaPeriodHolder = A0D();
        if (nextMediaPeriodHolder == null) {
            return true;
        }
        int A0A = timeline.A0A(nextMediaPeriodHolder.A08);
        if (A0B[3].length() != 26) {
            A0B[0] = "XXauRi";
            while (true) {
                A0A = timeline.A09(A0A, this.A09, this.A0A, this.A01, this.A08);
                while (lastValidPeriodHolder != null && !nextMediaPeriodHolder.A00.A07) {
                    nextMediaPeriodHolder = nextMediaPeriodHolder.A0I();
                }
                C7A A0I = nextMediaPeriodHolder.A0I();
                if (A0A == -1 || A0I == null || timeline.A0A(A0I.A08) != A0A) {
                    break;
                }
                nextMediaPeriodHolder = A0I;
                if (A0B[7].charAt(7) != 'k') {
                    break;
                }
                A0B[2] = "Cr1P4n0WQ70sIc2hdXVlmIoPdJb3W1mn";
            }
        }
        throw new RuntimeException();
    }

    private boolean A08(Timeline timeline, C2248no c2248no, long j6) {
        int adGroupCount = timeline.A0J(c2248no.A04, this.A09).A03();
        if (adGroupCount == 0) {
            return true;
        }
        int i = adGroupCount - 1;
        boolean A00 = c2248no.A00();
        if (this.A09.A0D(i) != Long.MIN_VALUE) {
            return !A00 && j6 == Long.MIN_VALUE;
        }
        int lastAdGroupIndex = this.A09.A04(i);
        if (lastAdGroupIndex == -1) {
            return false;
        }
        if (((A00 && c2248no.A00 == i && c2248no.A01 == lastAdGroupIndex + (-1)) ? 1 : 0) == 0) {
            return !A00 && this.A09.A05(i) == lastAdGroupIndex;
        }
        return true;
    }

    private boolean A09(Timeline timeline, C2248no c2248no, boolean z3) {
        int A0A = timeline.A0A(c2248no.A04);
        return !timeline.A0K(timeline.A0H(A0A, this.A09).A00, this.A0A).A0D && timeline.A0O(A0A, this.A09, this.A0A, this.A01, this.A08) && z3;
    }

    private boolean A0A(C7A c7a, C7B c7b) {
        C7B c7b2 = c7a.A00;
        return c7b2.A03 == c7b.A03 && c7b2.A01 == c7b.A01 && c7b2.A04.equals(c7b.A04);
    }

    public final C7A A0B() {
        if (this.A05 != null) {
            if (this.A05 == this.A06) {
                C7A c7a = this.A05;
                if (A0B[3].length() == 26) {
                    throw new RuntimeException();
                }
                A0B[2] = "cSlSOVjTMxyZvCYIIsIM7Z4RVriFSMIi";
                this.A06 = c7a.A0I();
            }
            this.A05.A0M();
            this.A05 = this.A05.A0I();
            this.A00--;
            if (this.A00 == 0) {
                this.A04 = null;
            }
        } else {
            this.A05 = this.A04;
            this.A06 = this.A04;
        }
        C7A c7a2 = this.A05;
        if (A0B[0].length() != 8) {
            A0B[7] = "hdbErrckm1X5j4dXkt1ObCB8O8NcABpS";
            return c7a2;
        }
        A0B[3] = "prScRK6qkOjWt";
        return c7a2;
    }

    public final C7A A0C() {
        AbstractC06243y.A08((this.A06 == null || this.A06.A0I() == null) ? false : true);
        this.A06 = this.A06.A0I();
        return this.A06;
    }

    public final C7A A0D() {
        return A0N() ? this.A05 : this.A04;
    }

    public final C7A A0E() {
        return this.A04;
    }

    public final C7A A0F() {
        return this.A05;
    }

    public final C7A A0G() {
        return this.A06;
    }

    public final C7B A0H(long j6, C7Z c7z) {
        if (this.A04 == null) {
            return A05(c7z);
        }
        return A01(c7z.A03, this.A04, j6);
    }

    public final InterfaceC2249np A0J(InterfaceC07197p[] interfaceC07197pArr, long j6, AbstractC0889Ew abstractC0889Ew, F0 f02, InterfaceC0838Cx interfaceC0838Cx, C7B c7b, C0890Ex c0890Ex) {
        long A0B2;
        if (this.A04 != null) {
            A0B2 = this.A04.A0B() + this.A04.A00.A00;
        } else {
            A0B2 = c7b.A03 + j6;
        }
        C7A c7a = new C7A(interfaceC07197pArr, A0B2, abstractC0889Ew, f02, interfaceC0838Cx, c7b, c0890Ex);
        if (this.A04 != null) {
            AbstractC06243y.A08(A0N());
            this.A04.A0Q(c7a);
        }
        this.A07 = null;
        this.A04 = c7a;
        this.A00++;
        return c7a.A07;
    }

    public final C2248no A0K(Timeline timeline, Object obj, long j6) {
        return A06(timeline, obj, j6, A00(timeline, obj), this.A09);
    }

    public final void A0L(long j6) {
        if (this.A04 != null) {
            this.A04.A0P(j6);
        }
    }

    public final void A0M(boolean z3) {
        C7A A0D = A0D();
        if (A0D != null) {
            this.A07 = z3 ? A0D.A08 : null;
            this.A03 = A0D.A00.A04.A03;
            A0D.A0M();
            A0S(A0D);
        } else if (!z3) {
            this.A07 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0N() {
        return this.A05 != null;
    }

    public final boolean A0O() {
        if (this.A04 != null) {
            if (!this.A04.A00.A05 && this.A04.A0R()) {
                long j6 = this.A04.A00.A00;
                if (A0B[2].charAt(6) == 'F') {
                    throw new RuntimeException();
                }
                A0B[3] = "WQJhcBpqvfFlde6mvMcdcISTeYvrM";
                if (j6 == b.f6382b || this.A00 >= 100) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A0P(Timeline timeline, int i) {
        this.A01 = i;
        return A07(timeline);
    }

    public final boolean A0Q(Timeline timeline, C2248no c2248no, long j6) {
        int A0A = timeline.A0A(c2248no.A04);
        C7A c7a = null;
        for (C7A A0D = A0D(); A0D != null; A0D = A0D.A0I()) {
            if (c7a == null) {
                A0D.A00 = A0I(timeline, A0D.A00);
            } else {
                if (A0A != -1) {
                    boolean equals = A0D.A08.equals(timeline.A0M(A0A));
                    if (A0B[3].length() == 26) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0B;
                    strArr[6] = "ytUDxXblB5dYuzkyb9";
                    strArr[4] = "n5GR8r";
                    if (equals) {
                        C7B A01 = A01(timeline, c7a, j6);
                        if (A01 == null) {
                            return true ^ A0S(c7a);
                        }
                        A0D.A00 = A0I(timeline, A0D.A00);
                        if (!A0A(A0D, A01)) {
                            return true ^ A0S(c7a);
                        }
                    }
                }
                return true ^ A0S(c7a);
            }
            if (A0D.A00.A07) {
                A0A = timeline.A09(A0A, this.A09, this.A0A, this.A01, this.A08);
            }
            c7a = A0D;
        }
        return true;
    }

    public final boolean A0R(Timeline timeline, boolean z3) {
        this.A08 = z3;
        return A07(timeline);
    }

    public final boolean A0S(C7A c7a) {
        AbstractC06243y.A08(c7a != null);
        boolean z3 = false;
        this.A04 = c7a;
        while (c7a.A0I() != null) {
            c7a = c7a.A0I();
            if (c7a == this.A06) {
                this.A06 = this.A05;
                z3 = true;
            }
            c7a.A0M();
            this.A00--;
        }
        this.A04.A0Q(null);
        return z3;
    }

    public final boolean A0T(InterfaceC2249np interfaceC2249np) {
        return this.A04 != null && this.A04.A07 == interfaceC2249np;
    }
}
