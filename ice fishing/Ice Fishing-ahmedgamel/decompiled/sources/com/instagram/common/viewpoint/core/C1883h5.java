package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.h5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1883h5 implements OB {
    public static byte[] A04;
    public static String[] A05 = {"2TNZv5rtJTplZyjTIrSAFwUR6QP", "UjegX20Mk8HUIHIT", "Ti96PrkTuXG6IMzmEs5GDJe0LgUxYJn1", "WKFIsio5", "sT4eIPa9", "0D70Whi8Ioa2N41OWBvmw3gUZoSjgMHO", "iH11Sl", "erLbaj7N4o7d5mJ3hEM6"};

    @Nullable
    public NativeAd.NativeOptions A00;
    public S6 A01;
    public C1860gi A02;
    public final NativeAdBase.MediaCacheFlag A03;

    public static String A03(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[6].length() == 1) {
                throw new RuntimeException();
            }
            A05[0] = "MdmGKNh4C3mG92xgGyorPLR3SXO";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 88);
            i9++;
        }
    }

    public static void A04() {
        A04 = new byte[]{-26, -39, -20, -31, -18, -35, -28, -35, -38, -35, -34, -26, -35};
    }

    static {
        A04();
    }

    public C1883h5(@Nullable S6 s62, C1860gi c1860gi, NativeAdBase.MediaCacheFlag mediaCacheFlag, NativeAd.NativeOptions nativeOptions) {
        this.A00 = nativeOptions;
        this.A01 = s62;
        this.A02 = c1860gi;
        this.A03 = mediaCacheFlag;
    }

    @Override // com.instagram.common.viewpoint.core.OB
    public final void ADp(C1332Vm c1332Vm) {
        WT.A00(new C1886h8(this, c1332Vm));
    }

    @Override // com.instagram.common.viewpoint.core.OB
    public final void AEy(List<C2042ju> list) {
        C1266Sx manager = new C1266Sx(this.A02);
        String firstRequestId = A03(6, 7, 23);
        for (C2042ju c2042ju : list) {
            if (A03(6, 7, 23).equals(firstRequestId)) {
                firstRequestId = c2042ju.A0G();
            }
            if (this.A03.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c2042ju.A0E().A0I() != null) {
                    manager.A0c(new C1264Sv(c2042ju.A0E().A0I().getUrl(), c2042ju.A0E().A0I().getHeight(), c2042ju.A0E().A0I().getWidth(), c2042ju.A0G(), A03(0, 6, 32)));
                }
                if (c2042ju.A0E().A0H() != null) {
                    manager.A0c(new C1264Sv(c2042ju.A0E().A0H().getUrl(), c2042ju.A0E().A0H().getHeight(), c2042ju.A0E().A0H().getWidth(), c2042ju.A0G(), A03(0, 6, 32)));
                }
                if (!TextUtils.isEmpty(c2042ju.A0E().A0e())) {
                    manager.A0b(new C1262St(c2042ju.A0E().A0e(), c2042ju.A0G(), A03(0, 6, 32), c2042ju.A0E().A0D()));
                }
            }
        }
        manager.A0X(new C1884h6(this, list), new C1259Sq(firstRequestId, A03(0, 6, 32)));
    }
}
