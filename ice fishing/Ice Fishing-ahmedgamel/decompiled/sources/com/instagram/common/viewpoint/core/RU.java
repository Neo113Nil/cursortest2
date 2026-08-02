package com.instagram.common.viewpoint.core;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class RU extends Thread {
    public static byte[] A07;
    public static final String A08;
    public final int A00;
    public final Handler A01;
    public final RW A02;
    public final C1860gi A03;
    public final Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{103, 99, 12, 96, 111, 115, 12, 101, 68, 85, 68, 66, 85, 78, 83, 10, 8, 3, 8, 31, 4, 14};
    }

    static {
        A02();
        A08 = RU.class.getName();
    }

    public RU(C1860gi c1860gi, RW rw) {
        this(c1860gi, rw, C1310Up.A08(c1860gi));
    }

    public RU(C1860gi c1860gi, RW rw, int i) {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new RT(this);
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 68));
        this.A00 = i;
        this.A03 = c1860gi;
        this.A02 = rw;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            long j6 = this.A00;
            while (!isInterrupted()) {
                long interval = this.A05;
                boolean z6 = interval == 0;
                this.A05 = j6;
                if (z6) {
                    this.A01.post(this.A04);
                }
                try {
                    Thread.sleep(j6);
                    long interval2 = this.A05;
                    if (interval2 != 0 && !this.A06 && !Debug.isDebuggerConnected()) {
                        String A03 = this.A02.A03();
                        if (A03 != null) {
                            this.A03.A08().ABC(A01(15, 7, 8), AbstractC1272Td.A1D, new C1273Te(this.A02.A04(A03)));
                        }
                        this.A06 = true;
                    }
                } catch (InterruptedException unused) {
                    BuildConfigApi.isDebug();
                    return;
                }
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
