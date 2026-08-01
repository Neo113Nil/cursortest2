package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.r5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2432r5 {
    public static C2432r5 A03;
    public static InterfaceC2455rX A04;
    public static byte[] A05;
    public static String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C2442rF A02;

    public static String A02(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            byte b9 = copyOfRange[i10];
            if (A06[4].length() == 19) {
                throw new RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            copyOfRange[i10] = (byte) ((b9 - i9) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-89, -74, -87, -91, -72, -87};
    }

    static {
        A03();
        A03 = null;
        A04 = null;
    }

    public C2432r5(ViewpointQeConfig viewpointQeConfig, AbstractC2447rL abstractC2447rL, C2442rF c2442rF, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c2442rF;
        abstractC2447rL.A03(new C0777Aj(c2442rF));
    }

    public static ScanDelayController A00(int i) {
        if (0 == 0) {
            return null;
        }
        throw new NullPointerException(A02(0, 6, 61));
    }

    public static C2432r5 A01(ViewpointQeConfig viewpointQeConfig, AbstractC2447rL abstractC2447rL, InterfaceC2452rQ interfaceC2452rQ, InterfaceC0778Al interfaceC0778Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        C2432r5 c2432r5 = A03;
        if (c2432r5 != null) {
            return c2432r5;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        CK ck = CK.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        A00(100);
        return new C2432r5(viewpointQeConfig, abstractC2447rL, new C2442rF(viewpointQeConfig, interfaceC2452rQ, ck, interfaceC0778Al, viewpointRegistry, viewpointAutoOcclusion, handler, null), viewpointRegistry);
    }

    public final void A04(InterfaceC2446rK interfaceC2446rK) {
        this.A02.A0H(interfaceC2446rK);
    }

    public final void A05(InterfaceC2444rI interfaceC2444rI) {
        this.A02.A0I(interfaceC2444rI);
    }

    public final void A06(DspViewableNode dspViewableNode) {
        A07(dspViewableNode, null);
    }

    public final void A07(DspViewableNode dspViewableNode, C2453rU c2453rU) {
        if (this.A00.A00 && c2453rU != null) {
            this.A01.A06(dspViewableNode, c2453rU);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A08(DspViewableNode dspViewableNode, C2453rU c2453rU, C2449rN c2449rN) {
        if (this.A00.A00 && c2453rU != null) {
            this.A01.A07(dspViewableNode, c2453rU, c2449rN);
        } else {
            this.A01.A08(dspViewableNode, c2449rN);
        }
    }

    public final void A09(DspViewableNode dspViewableNode, C2449rN c2449rN) {
        A08(dspViewableNode, null, c2449rN);
    }
}
