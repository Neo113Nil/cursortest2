package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.iy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1993iy implements NC {
    public static byte[] A02;
    public final /* synthetic */ C07337j A00;
    public final /* synthetic */ Runnable A01;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{66, 70, 66, 21, 21, 68, 19, 17, 77, 104, 109, 124, 120, 105, 126, 44, 101, Byte.MAX_VALUE, 44, 98, 121, 96, 96, 44, 99, 98, 44, 96, 99, 109, 104, 69, 98, 120, 105, 126, Byte.MAX_VALUE, 120, 101, 120, 101, 109, 96, 77, 104, 59, 28, 6, 23, 0, 1, 6, 27, 6, 27, 19, 30, 82, 27, 31, 2, 0, 23, 1, 1, 27, 29, 28, 82, 20, 27, 0, 23, 22, c.f17105c, 48, 1, c.f17105c, 61, 42, 55, 40, 55, 42, 39, 101, 106, 96, 118, 107, 109, 96, 42, 109, 106, 112, 97, 106, 112, 42, 101, 103, 112, 109, 107, 106, 42, 82, 77, 65, 83, 34, 51, 42, 109, 108, 75, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 78, 109, 101, 101, 107, 108, 101, 75, 111, 114, 112, 103, 113, 113, 107, 109, 108};
    }

    public C1993iy(C07337j c07337j, Runnable runnable) {
        this.A00 = c07337j;
        this.A01 = runnable;
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEC(C2047jz c2047jz, String str, boolean z6) {
        this.A00.A07.A0C();
        boolean z9 = !TextUtils.isEmpty(str);
        if (z6 && z9) {
            try {
                Intent intent = new Intent(A00(85, 26, 62));
                intent.setData(XB.A00(str));
                C1364Wu.A0D(this.A00.A0B, intent);
            } catch (C1362Ws e9) {
                Throwable cause = e9.getCause();
                Throwable th = e9;
                if (cause != null) {
                    th = e9.getCause();
                }
                this.A00.A0B.A08().ABC(A00(74, 11, 100), AbstractC1272Td.A04, new C1273Te(th));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AED(C2047jz c2047jz) {
        this.A00.A07.A04();
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEE(C2047jz c2047jz) {
        this.A00.A07.A05();
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEF(C2047jz c2047jz) {
        if (c2047jz != this.A00.A00) {
            return;
        }
        if (c2047jz == null) {
            this.A00.A0B.A08().ABC(A00(111, 3, 121), AbstractC1272Td.A0X, new C1273Te(A00(8, 37, 54)));
            AEG(c2047jz, AdError.internalError(AdError.INTERNAL_ERROR_2004));
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A01 = c2047jz;
        this.A00.A0L();
        this.A00.A07.A0F(c2047jz);
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEG(C2047jz c2047jz, AdError adError) {
        if (c2047jz != this.A00.A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(c2047jz);
        this.A00.A0B.A0F().A5g(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A07.A0G(new C1332Vm(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEH(C2047jz c2047jz) {
        AbstractC1343Vy.A05(A00(114, 31, 56), A00(45, 29, 72), A00(0, 8, 77));
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEI() {
        this.A00.A07.A08();
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEJ() {
        this.A00.A07.A06();
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void AEK() {
        this.A00.A07.A07();
    }

    @Override // com.instagram.common.viewpoint.core.NC
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A02();
    }
}
