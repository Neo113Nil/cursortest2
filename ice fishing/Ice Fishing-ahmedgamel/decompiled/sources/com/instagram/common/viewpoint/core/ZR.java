package com.instagram.common.viewpoint.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZR implements TA {
    public static ZR A07;
    public static byte[] A08;
    public InterfaceC1090Lx A00;
    public T1 A01;
    public T9 A02;
    public TP A03;
    public U7 A04;
    public VM A05;
    public CY A06;

    static {
        A07();
    }

    public static String A06(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{44, 62, 76, 76, 66, 72, 71, -7, 61, 58, 77, 58, -7, 66, 71, 66, 77, 66, 58, 69, 66, 83, 62, 61, 28, -13, -19, 32, 27, -15, 28, 15, 26, 25, 28, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1856ge c1856ge) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1856ge);
        this.A06 = A05(c1856ge, this.A03, A03(c1856ge));
        A09(c1856ge, A00(c1856ge, this.A06));
        A0A(c1856ge, this.A06);
        A0B(c1856ge, this.A06);
        if (this.A06 != null) {
            this.A06.A6d();
        }
    }

    public static SR A00(C1856ge c1856ge, CY cy) {
        if (!C1310Up.A1r(c1856ge) || cy == null) {
            return null;
        }
        return SS.A00().A00(cy);
    }

    public static TP A01(C1856ge c1856ge) {
        return TQ.A00().A00(c1856ge, new C1559bp());
    }

    public static synchronized ZR A02() {
        ZR zr;
        synchronized (ZR.class) {
            if (A07 == null) {
                A07 = new ZR();
            }
            zr = A07;
        }
        return zr;
    }

    public static InterfaceC1811fv A03(C1856ge c1856ge) {
        if (!C1310Up.A1n(c1856ge)) {
            return null;
        }
        return C1829gD.A01(c1856ge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.TA
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized CY A9F() {
        return this.A06;
    }

    public static CY A05(C1856ge c1856ge, TP tp, InterfaceC1811fv interfaceC1811fv) {
        if (!C1310Up.A2m(c1856ge) || interfaceC1811fv == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC1852ga.A00().A00(c1856ge, tp, interfaceC1811fv, WI.A04(c1856ge), new ZW(new WA(c1856ge, A06(0, 0, 9), null, EnumC1335Vq.A08, 0, new C1339Vu(), AbstractC1387Xt.A01(C1310Up.A0N(c1856ge)), null, null, new C1979ij()), c1856ge), C1850gY.A00().A00());
    }

    public static void A08() {
        AbstractC1343Vy.A05(A06(30, 28, 52), A06(0, 24, 99), A06(24, 6, 68));
    }

    public static void A09(C1856ge c1856ge, SR sr) {
        if (!C1310Up.A1r(c1856ge) || sr == null) {
            return;
        }
        SP.A00().A00(sr, c1856ge);
    }

    public static void A0A(C1856ge c1856ge, CY cy) {
        if (!C1310Up.A0m(c1856ge) || cy == null) {
            return;
        }
        new C1255Sm(c1856ge, cy, new C1256Sn(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1856ge c1856ge, CY cy) {
        if (cy == null) {
            return;
        }
        AbstractC1314Ut.A00(c1856ge, cy);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final VA A6n(C1856ge c1856ge) {
        return WW.A01(c1856ge);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized T9 A74(T8 t82) {
        if (this.A02 == null) {
            this.A02 = new C1426Zg(this);
        }
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized T1 A7G() {
        if (this.A01 == null) {
            this.A01 = new C1861gj();
        }
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized TP A7l(T8 t82) {
        if (this.A03 == null) {
            this.A03 = A01(t82.A02());
        }
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized InterfaceC1271Tc A7n(T8 t82) {
        return new C1754f0(t82);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized TB A7x(final T8 t82) {
        return new AbstractC1558bo(t82) { // from class: com.facebook.ads.redexgen.X.72
            @Override // com.instagram.common.viewpoint.core.TB
            public final boolean A9m() {
                return TextureViewSurfaceTextureListenerC0860Cz.A09();
            }

            @Override // com.instagram.common.viewpoint.core.TB
            public final void ACP() {
                U2.A06(C1233Rp.A09(super.A00));
            }

            @Override // com.instagram.common.viewpoint.core.TB
            public final void ACn() {
                U2.A07(C1233Rp.A09(super.A00));
            }

            @Override // com.instagram.common.viewpoint.core.TB
            public final void ADI(C1856ge c1856ge) {
                OP.A01(c1856ge);
            }
        };
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized InterfaceC1090Lx A8C(T8 t82) {
        if (!C1310Up.A13(t82)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = AbstractC1091Ly.A00().A00(new C1522bE(t82));
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized TD A8y(T8 t82) {
        return new C1496ao(t82);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final C1856ge A8z(Context context) {
        C1856ge sdkContext = T7.A00();
        if (sdkContext == null) {
            C1856ge sdkContext2 = new C1856ge(context, this);
            T7.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized VM A90(C1856ge c1856ge) {
        if (this.A05 == null) {
            this.A05 = new XP(c1856ge);
        }
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized U7 A96() {
        if (this.A04 == null) {
            this.A04 = new U7();
            A08();
        }
        return this.A04;
    }
}
