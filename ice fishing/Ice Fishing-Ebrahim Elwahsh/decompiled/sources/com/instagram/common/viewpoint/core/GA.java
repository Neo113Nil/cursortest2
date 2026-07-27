package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import com.anythink.basead.exoplayer.b;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class GA {
    public static byte[] A0C;
    public static String[] A0D = {"vrjy3LPqmZ4VYL", "kldC8xOSHjGgI0Rq8UB5uDItbCAb4yeD", "ZtlkL6mqEDvYXWdJ148AMfPypAXzloX0", "vv3uN80MDVvh0kr3i18f6F5St9zthXAP", "5vSY45XZaWTc5ARQpJ6MABJkKRGBO5p9", "E4RES2qVkVhri6POLSj0lZrJ1TN13SFq", "ZPGU8CInoZ6FL7owV0UYW5v36RZ6UHPP", "wFHJA8K1ufuqr0OxwfXIZVwS7Glp9Dxp"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final G8 A0A;
    public final G9 A0B;

    public static String A02(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{108, 97, 123, 120, 100, 105, 113, 38, 56, c.f16476c, 53, 62, 38};
    }

    static {
        A04();
    }

    public GA() {
        this(null);
    }

    public GA(Context context) {
        if (context != null) {
            this.A09 = (WindowManager) context.getSystemService(A02(7, 6, 32));
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            this.A0A = C5C.A02 >= 17 ? A01(context) : null;
            this.A0B = G9.A00();
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = b.f6539b;
        this.A07 = b.f6539b;
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

    private G8 A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 121));
        if (displayManager == null) {
            return null;
        }
        return new G8(this, displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            this.A06 = (long) (1.0E9d / defaultDisplay.getRefreshRate());
            this.A07 = (this.A06 * 80) / 100;
        }
    }

    private boolean A06(long j9, long j10) {
        long j11 = j9 - this.A04;
        long elapsedFrameTimeNs = this.A05;
        return Math.abs((j10 - elapsedFrameTimeNs) - j11) > 20000000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (r5 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        r18.A08 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if (r5 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long A07(long j9, long j10) {
        long j11 = 1000 * j9;
        long j12 = j11;
        long j13 = j10;
        if (this.A08) {
            if (j9 != this.A02) {
                this.A01++;
                this.A00 = this.A03;
            }
            if (this.A01 >= 6) {
                long j14 = this.A00 + ((j11 - this.A04) / this.A01);
                if (A06(j14, j10)) {
                    this.A08 = false;
                } else {
                    long j15 = this.A05;
                    if (A0D[4].length() == 4) {
                        throw new RuntimeException();
                    }
                    A0D[2] = "LxalG4mHATb18PeqaNeAayN2I9HozhV7";
                    j13 = (j15 + j14) - this.A04;
                    j12 = j14;
                }
            } else {
                boolean A06 = A06(j11, j10);
                if (A0D[2].charAt(6) == 'm') {
                    A0D[0] = "QXST6c0zZjLjc8mFjZqys1TY6ZZx4";
                }
            }
        }
        if (!this.A08) {
            this.A04 = j11;
            this.A05 = j10;
            this.A01 = 0L;
            this.A08 = true;
        }
        this.A02 = j9;
        this.A03 = j12;
        if (this.A0B == null || this.A06 == b.f6539b) {
            return j13;
        }
        long j16 = this.A0B.A04;
        if (j16 == b.f6539b) {
            return j13;
        }
        return A00(j13, j16, this.A06) - this.A07;
    }

    public final void A08() {
        if (this.A09 != null) {
            if (this.A0A != null) {
                this.A0A.A01();
            }
            this.A0B.A07();
        }
    }

    public final void A09() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A06();
            if (this.A0A != null) {
                this.A0A.A00();
            }
            A03();
        }
    }
}
