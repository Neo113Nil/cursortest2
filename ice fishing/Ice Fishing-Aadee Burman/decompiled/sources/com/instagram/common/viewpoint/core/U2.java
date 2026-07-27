package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import android.util.Log;
import com.anythink.basead.ui.BaseATView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network/classes2.dex */
public final class U2 {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"i0FOsf0o9fpBvAlaEaGgnCYFRbNnwBKJ", "ZsBa2nEfyhltTo", "ZG6g5nWnUhxh", "6zjosiDwJWE47kuMvKAUCDrCWUeR8P3q", "Gh89HIHHDqfPtiuASbXLVil627eRz", "Lsbp3nhJR34oAmuvtJAouWbaxC4Ny9OM", "s0Y", "C"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-89, -39, -39, -89, -39, -88, -40, -84, -54, -58, -59, -7, -24, -19, -23, -14, -25, -23, -46, -23, -8, -5, -13, -10, -17, -88, -103, -96, 117, -66, -61, -66, -55, -66, -74, -63, -66, -49, -74, -55, -66, -60, -61, 117, -56, -55, -74, -57, -55, -70, -71, -84, -67, -60, 121, -48, -70, -52, 121, -70, -59, -53, -66, -70, -67, -46, 121, -62, -57, -62, -51, -62, -70, -59, -62, -45, -66, -67, 122, 121, -84, -60, -62, -55, -55, -62, -57, -64, -121, -90, -68, -62, 109, -79, -68, -69, 116, -63, 109, -80, -82, -71, -71, 109, -114, -62, -79, -74, -78, -69, -80, -78, -101, -78, -63, -60, -68, -65, -72, -114, -79, -64, 123, -74, -69, -74, -63, -74, -82, -71, -74, -57, -78, 117, 118, 123, 109, -96, -68, -70, -78, 109, -77, -62, -69, -80, -63, -74, -68, -69, -82, -71, -74, -63, -58, 109, -70, -82, -58, 109, -69, -68, -63, 109, -60, -68, -65, -72, 109, -67, -65, -68, -67, -78, -65, -71, -58, 123, -120, -105, -112, -58, -52, -63, -45, -56, 0, 6, -5, 13, 2, -7, -3, 9, 8, 0, 3, 1, -42, -44, -35, -44, -31, -40, -46, -3, 2, -3, 8, -3, -11, 0, -3, 14, -7, -51, -46, -51, -40, -51, -59, -48, -51, -34, -55, -116, -115, -124, -46, -45, -40, -124, -57, -59, -48, -48, -55, -56, -110, 1, -10, 8, 9, -12, 7, -6, 8, 10, 1, 9};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static C1684eB A00() {
        return new C1684eB();
    }

    public static C1683eA A01(C1836ge c1836ge) {
        return new C1683eA(c1836ge);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        Y4.A01.execute(new C1685eC(initListener, initResult));
    }

    public static void A06(C1836ge c1836ge) {
        if (AbstractC1292Ur.A0P(c1836ge) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new TT(Thread.getDefaultUncaughtExceptionHandler(), c1836ge, new C1618d6());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e9) {
                c1836ge.A08().ABC(A02(198, 7, 78), AbstractC1252Td.A1X, new C1253Te(e9));
            }
        }
    }

    public static void A07(C1836ge c1836ge) {
        A0H(c1836ge, null, null, 3);
    }

    public static void A08(C1836ge c1836ge) {
        A0H(c1836ge, null, null, 3);
    }

    public static void A09(C1836ge c1836ge) {
        if (C1290Up.A2O(c1836ge)) {
            A0F(c1836ge, 0);
        }
        if (C1290Up.A2X(c1836ge)) {
            A0B(c1836ge);
        }
    }

    public static void A0A(C1836ge c1836ge) {
        if (C1290Up.A2P(c1836ge)) {
            String[] strArr = A03;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "XjvPwbQrSqkAxC";
            strArr2[6] = "skO";
            A0G(c1836ge, null, 3);
        }
    }

    public static void A0B(C1836ge c1836ge) {
        YG.A06.execute(new C1686eD(c1836ge));
    }

    public static void A0C(C1836ge c1836ge) {
        OP.A02(c1836ge);
        TX.A0C(c1836ge, new C1588cc(c1836ge), new C1736f2(), BuildConfigApi.isDebug());
        c1836ge.A0A();
        A0D(c1836ge);
    }

    public static void A0D(C1836ge c1836ge) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(c1836ge);
        String string = sharedPreferences.getString(A02(186, 12, 121), null);
        String string2 = sharedPreferences.getString(A02(239, 11, 116), null);
        if (string != null && string2 != null) {
            InterfaceC1251Tc A08 = c1836ge.A08();
            C1253Te c1253Te = new C1253Te(string2);
            String flashConfig = A02(181, 5, 63);
            A08.ABz(flashConfig, 3701, c1253Te);
        }
    }

    public static void A0F(C1836ge c1836ge, int i) {
        T7.A01(c1836ge);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            AbstractC1323Vy.A02();
        }
        A06(c1836ge);
        AbstractC1330Wf.A00(C1290Up.A0q(c1836ge), BuildConfigApi.isDebug(), A00(), A01(c1836ge));
        C1231Si.A03(C1290Up.A04(c1836ge));
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            C1809gD.A09(new C1674e1(c1836ge));
        }
        if (i == 3) {
            Log.e(A02(8, 17, 99), A02(89, 89, 44));
            c1836ge.A08().ABz(A02(178, 3, 6), AbstractC1252Td.A0R, new C1253Te(A02(215, 24, 67)));
        }
        ActivityUtils.A04(c1836ge, AudienceNetworkActivity.class);
        YG.A05(c1836ge);
        VL.A05(c1836ge);
        N8.A01(c1836ge);
        if (C1290Up.A16(c1836ge)) {
            RX.A00(c1836ge);
        }
        if (C1290Up.A1z(c1836ge)) {
            ZR.A02().A90(c1836ge);
        }
    }

    public static void A0G(C1836ge c1836ge, AudienceNetworkAds.InitListener initListener, int i) {
        T7.A01(c1836ge);
        boolean z3 = false;
        synchronized (U2.class) {
            boolean execute = A00;
            if (!execute) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z3 = true;
                        }
                    }
                }
                A00 = true;
                z3 = true;
            }
        }
        if (z3) {
            A0F(c1836ge, i);
            YG.A08.execute(new C1711ed(c1836ge, initListener));
        } else {
            if (i != 1) {
                return;
            }
            String A022 = A02(51, 38, 56);
            if (initListener != null) {
                A04(initListener, new U1(true, A022));
            } else {
                Log.w(A02(8, 17, 99), A022);
            }
        }
    }

    public static void A0H(C1836ge c1836ge, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i) {
        AbstractC1323Vy.A05(A02(BaseATView.a.f9768D, 10, 115), A02(25, 26, 52), A02(0, 8, 82));
        C1809gD.A06();
        A0G(c1836ge, initListener, i);
    }

    public static synchronized boolean A0I() {
        boolean z3;
        synchronized (U2.class) {
            z3 = A00;
        }
        return z3;
    }
}
