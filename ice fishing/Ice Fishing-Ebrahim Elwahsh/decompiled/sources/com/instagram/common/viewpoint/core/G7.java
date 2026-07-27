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
    public final C0902Fl A0E = new C0902Fl();
    public final G5 A0F;
    public final G6 A0G;

    public static String A02(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i4);
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
        this.A0A = b.f6539b;
        this.A0B = b.f6539b;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
        this.A04 = 0;
    }

    public static long A00(long j9, long j10, long j11) {
        long j12;
        long vsyncCount = j11 * ((j9 - j10) / j11);
        long j13 = j10 + vsyncCount;
        if (j9 <= j13) {
            j12 = j13 - j11;
        } else {
            j12 = j13;
            j13 += j11;
        }
        return j13 - j9 < j9 - j12 ? j13 : j12;
    }

    public static G5 A01(Context context) {
        C2198n1 c2198n1 = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (C5C.A02 >= 17) {
            c2198n1 = C2198n1.A01(applicationContext);
        }
        if (c2198n1 == null) {
            return C2199n2.A00(applicationContext);
        }
        return c2198n1;
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
        float f6;
        if (C5C.A02 < 30 || this.A0C == null) {
            return;
        }
        float A00 = this.A0E.A06() ? this.A0E.A00() : this.A00;
        float candidateFrameRate = this.A02;
        if (A00 == candidateFrameRate) {
            return;
        }
        boolean z8 = true;
        if (A00 != -1.0f) {
            float candidateFrameRate2 = this.A02;
            if (candidateFrameRate2 != -1.0f) {
                if (this.A0E.A06() && this.A0E.A03() >= 5000000000L) {
                    f6 = 0.02f;
                } else {
                    f6 = 1.0f;
                }
                float candidateFrameRate3 = this.A02;
                if (Math.abs(A00 - candidateFrameRate3) < f6) {
                    z8 = false;
                }
                if (!z8) {
                    this.A02 = A00;
                    A09(false);
                    return;
                }
                return;
            }
        }
        if (A00 != -1.0f) {
            z8 = true;
        } else if (this.A0E.A01() < 30) {
            z8 = false;
        }
        if (!z8) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(Display display) {
        if (display != null) {
            double defaultDisplayRefreshRate = display.getRefreshRate();
            this.A0A = (long) (1.0E9d / defaultDisplayRefreshRate);
            this.A0B = (this.A0A * 80) / 100;
        } else {
            AbstractC06314g.A07(A02(36, 23, 19), A02(0, 36, 79));
            this.A0A = b.f6539b;
            this.A0B = b.f6539b;
        }
    }

    private void A09(boolean z8) {
        if (C5C.A02 < 30 || this.A0C == null || this.A04 == Integer.MIN_VALUE) {
            return;
        }
        float f6 = 0.0f;
        if (this.A0D && this.A02 != -1.0f) {
            float f9 = this.A02;
            float surfacePlaybackFrameRate = this.A01;
            f6 = f9 * surfacePlaybackFrameRate;
        }
        if (!z8) {
            float surfacePlaybackFrameRate2 = this.A03;
            if (surfacePlaybackFrameRate2 == f6) {
                return;
            }
        }
        this.A03 = f6;
        G3.A02(this.A0C, f6);
    }

    public static boolean A0A(long j9, long j10) {
        return Math.abs(j9 - j10) <= 20000000;
    }

    public final long A0B(long j9) {
        long j10 = j9;
        if (this.A06 != -1 && this.A0E.A06()) {
            long A02 = this.A0E.A02();
            long frameDurationNs = this.A07;
            long j11 = this.A05;
            long adjustedReleaseTimeNs = this.A06;
            long frameDurationNs2 = frameDurationNs + ((long) (((j11 - adjustedReleaseTimeNs) * A02) / this.A01));
            if (A0A(j10, frameDurationNs2)) {
                j10 = frameDurationNs2;
            } else {
                A04();
            }
        }
        long adjustedReleaseTimeNs2 = this.A05;
        this.A08 = adjustedReleaseTimeNs2;
        this.A09 = j10;
        if (this.A0G == null || this.A0A == b.f6539b) {
            return j10;
        }
        long j12 = this.A0G.A04;
        if (j12 == b.f6539b) {
            return j10;
        }
        long sampledVsyncTimeNs = A00(j10, j12, this.A0A);
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
            ((G6) AbstractC06233y.A01(this.A0G)).A06();
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
            ((G6) AbstractC06233y.A01(this.A0G)).A07();
        }
        A03();
    }

    public final void A0F(float f6) {
        this.A00 = f6;
        this.A0E.A04();
        A05();
    }

    public final void A0G(long j9) {
        if (this.A08 != -1) {
            this.A06 = this.A08;
            this.A07 = this.A09;
        }
        this.A05++;
        this.A0E.A05(1000 * j9);
        A05();
    }
}
