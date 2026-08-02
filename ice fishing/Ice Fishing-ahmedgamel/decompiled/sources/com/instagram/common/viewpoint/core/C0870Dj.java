package com.instagram.common.viewpoint.core;

import android.widget.TextView;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.redexgen.X.Dj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0870Dj extends TextView implements InterfaceC1748eu {
    public static byte[] A02;
    public static String[] A03 = {"KyDK4ozsSQOI8CeBEp6vN7GPAMaKi3Lj", "3K3dE7OkNcMTAukVEMEsyydi1KZJfoYe", "AKsSDy", "td2HYxymrySRBlk8LVzv2Nj", "9YKsZJjoWB8K3TGCGylWNfB", "C67xSy", "ZVZacBuH1Jrb8cRz3UZ99yjmQBL5sCV1", "zO36dBYDIleQnJstGNGNdS3bkLsuKmlY"};
    public static final int A04;
    public C0897Ek A00;
    public final UN<C4A> A01;

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[0].charAt(28) == strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[0] = "iGxWfyiSQAQNOwaGoqCiMbtpxtO5GMjZ";
            strArr2[1] = "gQ1pvXOTKlX7L3B8LOaiCsG8OhRO9Yk5";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 61);
            i9++;
        }
    }

    public static void A04() {
        A02 = new byte[]{15, 26, 24, 78, 16, 15, 26, 24, 78, 18, 18, 24, 18, 18};
    }

    static {
        A04();
        A04 = (int) (XX.A02 * 6.0f);
    }

    public C0870Dj(C1860gi c1860gi) {
        super(c1860gi);
        this.A01 = new C0871Dk(this);
        YB.A0V(this, YB.A06(855638016, A04));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A02(long j6) {
        if (j6 <= 0) {
            return A01(9, 5, 31);
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j6);
        long minutes2 = TimeUnit.MILLISECONDS.toSeconds(j6 % 60000);
        return String.format(Locale.US, A01(0, 9, 23), Long.valueOf(minutes), Long.valueOf(minutes2));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1748eu
    public final void AAv(C0897Ek c0897Ek) {
        this.A00 = c0897Ek;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A01);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1748eu
    public final void AKV(C0897Ek c0897Ek) {
        this.A00 = c0897Ek;
        if (this.A00 != null) {
            this.A00.getEventBus().A06(this.A01);
        }
    }
}
