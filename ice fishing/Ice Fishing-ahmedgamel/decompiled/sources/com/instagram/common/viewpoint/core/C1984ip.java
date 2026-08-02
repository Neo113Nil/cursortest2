package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ip, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1984ip implements NJ {
    public static byte[] A02;
    public static String[] A03 = {"prnrxiqBIRUWmtrywfPqKqEQqhVy", "ZIMYOFT0ZsWMsvQaDuWdcBD1JUfFlpFK", "eDL3S9t0lib8FebdadRdAEhF6DEMjh5k", "bs6kAZMpX5XJVmB6S4pTEB090dM9ax0i", "QHqe8jS5x4PwEQqsnwl", "gxNXj6OyEOj3k7PGi9sSLvTTkEfltc4s", "tcOGThQLxe2W2uuyyUr03jLhoPapxorM", "Kh0wErWL647o91YILjhTKlO7bRERsR4e"};
    public final /* synthetic */ C07247a A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A03[4].length() == 18) {
            throw new RuntimeException();
        }
        A03[7] = "PFnJtf9LUj4qa4JPPUOTumvSeGZYJypM";
        A02 = new byte[]{14, 12, 8, 89, 15, 15, 14, 14, 118, 65, 83, 69, 86, c.f17104b, 65, c.f17104b, 4, 114, 77, c.f17104b, 65, 75, 4, 77, 73, 84, 86, 65, 87, 87, 77, 75, 74, 4, 66, 77, 86, 65, c.f17104b, c.f17104b, 65, 125, 74, 88, 78, 93, 75, 74, 75, 121, 70, 75, 74, c.f17104b, 110, 75, 99, c.f17104b, 72, 72, 70, 65, 72, 102, 66, 95, 93, 74, 92, 92, 70, c.f17104b, 65};
    }

    static {
        A01();
    }

    public C1984ip(C07247a c07247a, Runnable runnable) {
        this.A00 = c07247a;
        this.A01 = runnable;
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void AFj(AbstractC2029jh abstractC2029jh) {
        this.A00.A07.A06();
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void AFk(AbstractC2029jh abstractC2029jh) {
        this.A00.A07.A07();
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void AFl(AbstractC2029jh abstractC2029jh) {
        this.A00.A07.A0C();
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void AFm(AbstractC2029jh abstractC2029jh) {
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A01 = abstractC2029jh;
        this.A00.A0L();
        if (this.A00.A07 != null) {
            this.A00.A07.A0F(abstractC2029jh);
        }
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void AFn(AbstractC2029jh abstractC2029jh) {
        AbstractC1343Vy.A05(A00(39, 34, 56), A00(8, 31, 51), A00(0, 8, 47));
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void AFo(AbstractC2029jh abstractC2029jh) {
        this.A00.A07.A08();
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void AFp(AbstractC2029jh abstractC2029jh, AdError adError) {
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0B.A0F().A5g(adError.getErrorCode(), adError.getErrorMessage());
        if (AdError.AD_PRESENTATION_ERROR.equals(adError) && C1310Up.A1y(this.A00.A0B)) {
            this.A00.A07.A0G(C1332Vm.A00(AdErrorType.AD_PRESENTATION_ERROR));
        } else if (AdError.NO_FILL.equals(adError)) {
            this.A00.A07.A0G(C1332Vm.A00(AdErrorType.NO_FILL));
        } else {
            this.A00.A07.A0G(C1332Vm.A00(AdErrorType.INTERNAL_ERROR));
        }
        this.A00.A0Q(abstractC2029jh);
        if (A03[7].charAt(7) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[1] = "5mDNAkmPsKXxtvZqFgypt4QK4uBiUiuf";
        strArr[2] = "5tmiAUheAxojxdkmR27o6gIBrLCMojmA";
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void onRewardedVideoActivityDestroyed() {
        this.A00.A07.A09();
    }

    @Override // com.instagram.common.viewpoint.core.NJ
    public final void onRewardedVideoClosed() {
        this.A00.A07.A0A();
    }
}
