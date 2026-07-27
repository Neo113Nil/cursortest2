package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import com.anythink.basead.exoplayer.b;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class G7 {
    public static byte[] A0H;
    public static String[] A0I = {"El1apek5TdjhfhN6viIbzGI1k6A8fvYa", "7lO0T01iPA0M2Tn6ez9XJF6fi3WcV0bl", "BUJOgokLGuaRN3Jb1lPoBsNrm7KBSu3J", "mjIihJQoirK71A6rZ4qRVtTe6TTtSgwc", "PHElykquIwSutGmUMi14ryiOqojKYZje", "FFUtkd6qKeeUYHXUT7DV9hX7r9PAWeGY", "aVKnabS1yBALevTpM7jFXLX0kSbTApQh", "pYdHEl16nY3gI4cpQf6RN4y0bom4H0uh"};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Surface A0C;
    public boolean A0D;
    public final C0903Fl A0E = new C0903Fl();
    public final G5 A0F;
    public final G6 A0G;

    public static String A02(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 30);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{-62, -37, -50, -49, -39, -46, -115, -31, -36, -115, -34, -30, -46, -33, -26, -115, -47, -42, -32, -35, -39, -50, -26, -115, -33, -46, -45, -33, -46, -32, -43, -115, -33, -50, -31, -46, -121, -102, -107, -106, -96, 119, -93, -110, -98, -106, -125, -106, -99, -106, -110, -92, -106, 121, -106, -99, -95, -106, -93};
    }

    static {
        A06();
    }

    public G7(Context context) {
        this.A0F = A01(context);
        this.A0G = this.A0F != null ? G6.A00() : null;
        this.A0A = b.f6382b;
        this.A0B = b.f6382b;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
        this.A04 = 0;
    }

    public static long A00(long j6, long j9, long j10) {
        long j11;
        long vsyncCount = j10 * ((j6 - j9) / j10);
        long j12 = j9 + vsyncCount;
        if (j6 <= j12) {
            j11 = j12 - j10;
        } else {
            j11 = j12;
            j12 += j10;
        }
        return j12 - j6 < j6 - j11 ? j12 : j11;
    }

    public static G5 A01(Context context) {
        C2199n1 c2199n1 = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (C5C.A02 >= 17) {
            c2199n1 = C2199n1.A01(applicationContext);
        }
        if (c2199n1 == null) {
            return C2200n2.A00(applicationContext);
        }
        return c2199n1;
    }

    private void A03() {
        if (C5C.A02 < 30 || this.A0C == null || this.A04 == Integer.MIN_VALUE || this.A03 == 0.0f) {
            return;
        }
        this.A03 = 0.0f;
        Surface surface = this.A0C;
        if (A0I[2].charAt(9) != 'u') {
            throw new RuntimeException();
        }
        A0I[2] = "PQOfzOqD2ukvp3odpMH5qIU7xJUCien7";
        G3.A02(surface, 0.0f);
    }

    private void A04() {
        this.A05 = 0L;
        this.A06 = -1L;
        this.A08 = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A05() {
        float f3;
        if (C5C.A02 < 30 || this.A0C == null) {
            return;
        }
        float A00 = this.A0E.A06() ? this.A0E.A00() : this.A00;
        float candidateFrameRate = this.A02;
        if (A00 == candidateFrameRate) {
            return;
        }
        boolean z3 = true;
        if (A00 != -1.0f) {
            float candidateFrameRate2 = this.A02;
            if (candidateFrameRate2 != -1.0f) {
                if (this.A0E.A06() && this.A0E.A03() >= 5000000000L) {
                    f3 = 0.02f;
                } else {
                    f3 = 1.0f;
                }
                float candidateFrameRate3 = this.A02;
                if (Math.abs(A00 - candidateFrameRate3) < f3) {
                    z3 = false;
                }
                if (!z3) {
                    this.A02 = A00;
                    A09(false);
                    return;
                }
                return;
            }
        }
        if (A00 != -1.0f) {
            z3 = true;
        } else if (this.A0E.A01() < 30) {
            z3 = false;
        }
        if (!z3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(Display display) {
        if (display != null) {
            double defaultDisplayRefreshRate = display.getRefreshRate();
            this.A0A = (long) (1.0E9d / defaultDisplayRefreshRate);
            this.A0B = (this.A0A * 80) / 100;
        } else {
            AbstractC06324g.A07(A02(36, 23, 19), A02(0, 36, 79));
            this.A0A = b.f6382b;
            this.A0B = b.f6382b;
        }
    }

    private void A09(boolean z3) {
        if (C5C.A02 < 30 || this.A0C == null || this.A04 == Integer.MIN_VALUE) {
            return;
        }
        float f3 = 0.0f;
        if (this.A0D && this.A02 != -1.0f) {
            float f9 = this.A02;
            float surfacePlaybackFrameRate = this.A01;
            f3 = f9 * surfacePlaybackFrameRate;
        }
        if (!z3) {
            float surfacePlaybackFrameRate2 = this.A03;
            if (surfacePlaybackFrameRate2 == f3) {
                return;
            }
        }
        this.A03 = f3;
        G3.A02(this.A0C, f3);
    }

    public static boolean A0A(long j6, long j9) {
        return Math.abs(j6 - j9) <= 20000000;
    }

    public final long A0B(long j6) {
        long j9 = j6;
        if (this.A06 != -1 && this.A0E.A06()) {
            long A02 = this.A0E.A02();
            long frameDurationNs = this.A07;
            long j10 = this.A05;
            long adjustedReleaseTimeNs = this.A06;
            long frameDurationNs2 = frameDurationNs + ((long) (((j10 - adjustedReleaseTimeNs) * A02) / this.A01));
            if (A0A(j9, frameDurationNs2)) {
                j9 = frameDurationNs2;
            } else {
                A04();
            }
        }
        long adjustedReleaseTimeNs2 = this.A05;
        this.A08 = adjustedReleaseTimeNs2;
        this.A09 = j9;
        if (this.A0G == null || this.A0A == b.f6382b) {
            return j9;
        }
        long j11 = this.A0G.A04;
        if (j11 == b.f6382b) {
            return j9;
        }
        long sampledVsyncTimeNs = A00(j9, j11, this.A0A);
        long adjustedReleaseTimeNs3 = this.A0B;
        return sampledVsyncTimeNs - adjustedReleaseTimeNs3;
    }

    public final void A0C() {
        A04();
    }

    public final void A0D() {
        this.A0D = true;
        A04();
        if (this.A0F != null) {
            ((G6) AbstractC06243y.A01(this.A0G)).A06();
            this.A0F.AHX(new G4() { // from class: com.facebook.ads.redexgen.X.n3
                @Override // com.instagram.common.viewpoint.core.G4
                public final void ADd(Display display) {
                    G7.this.A07(display);
                }
            });
        }
        A09(false);
    }

    public final void A0E() {
        this.A0D = false;
        if (this.A0F != null) {
            this.A0F.AKW();
            ((G6) AbstractC06243y.A01(this.A0G)).A07();
        }
        A03();
    }

    public final void A0F(float f3) {
        this.A00 = f3;
        this.A0E.A04();
        A05();
    }

    public final void A0G(long j6) {
        if (this.A08 != -1) {
            this.A06 = this.A08;
            this.A07 = this.A09;
        }
        this.A05++;
        this.A0E.A05(1000 * j6);
        A05();
    }
}
