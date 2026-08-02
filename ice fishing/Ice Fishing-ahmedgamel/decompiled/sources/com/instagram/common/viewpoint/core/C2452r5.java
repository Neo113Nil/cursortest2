package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.r5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2452r5 {
    public static C2452r5 A03;
    public static InterfaceC2475rX A04;
    public static byte[] A05;
    public static String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C2462rF A02;

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            byte b9 = copyOfRange[i9];
            if (A06[4].length() == 19) {
                throw new RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            copyOfRange[i9] = (byte) ((b9 - i6) - 7);
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

    public C2452r5(ViewpointQeConfig viewpointQeConfig, AbstractC2467rL abstractC2467rL, C2462rF c2462rF, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c2462rF;
        abstractC2467rL.A03(new C0797Aj(c2462rF));
    }

    public static ScanDelayController A00(int i) {
        if (0 == 0) {
            return null;
        }
        throw new NullPointerException(A02(0, 6, 61));
    }

    public static C2452r5 A01(ViewpointQeConfig viewpointQeConfig, AbstractC2467rL abstractC2467rL, InterfaceC2472rQ interfaceC2472rQ, InterfaceC0798Al interfaceC0798Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        C2452r5 c2452r5 = A03;
        if (c2452r5 != null) {
            return c2452r5;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        CK ck = CK.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        A00(100);
        return new C2452r5(viewpointQeConfig, abstractC2467rL, new C2462rF(viewpointQeConfig, interfaceC2472rQ, ck, interfaceC0798Al, viewpointRegistry, viewpointAutoOcclusion, handler, null), viewpointRegistry);
    }

    public final void A04(InterfaceC2466rK interfaceC2466rK) {
        this.A02.A0H(interfaceC2466rK);
    }

    public final void A05(InterfaceC2464rI interfaceC2464rI) {
        this.A02.A0I(interfaceC2464rI);
    }

    public final void A06(DspViewableNode dspViewableNode) {
        A07(dspViewableNode, null);
    }

    public final void A07(DspViewableNode dspViewableNode, C2473rU c2473rU) {
        if (this.A00.A00 && c2473rU != null) {
            this.A01.A06(dspViewableNode, c2473rU);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A08(DspViewableNode dspViewableNode, C2473rU c2473rU, C2469rN c2469rN) {
        if (this.A00.A00 && c2473rU != null) {
            this.A01.A07(dspViewableNode, c2473rU, c2469rN);
        } else {
            this.A01.A08(dspViewableNode, c2469rN);
        }
    }

    public final void A09(DspViewableNode dspViewableNode, C2469rN c2469rN) {
        A08(dspViewableNode, null, c2469rN);
    }
}
