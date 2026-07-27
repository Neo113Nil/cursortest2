package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0779Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC2455rY A00;
    public InterfaceC2443rI A01;
    public C2431r5 A02;
    public final InterfaceC2444rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC2443rI A03 = new C0780Ap(this);

    public static String A02(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public C0779Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC2455rY interfaceC2455rY, InterfaceC2444rJ interfaceC2444rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC2455rY;
        this.A04 = interfaceC2444rJ;
    }

    public static C0779Ao A01() {
        return new C0779Ao(new ViewpointQeConfig(), new C0782Ar(), null);
    }

    private void A05(AbstractC2446rL abstractC2446rL, InterfaceC2451rQ interfaceC2451rQ, InterfaceC0777Al interfaceC0777Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C2431r5.A01(this.A05, abstractC2446rL, interfaceC2451rQ, interfaceC0777Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C2452rU c2452rU) {
        C2431r5 c2431r5 = this.A02;
        if (c2431r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c2452rU != null) {
                c2431r5.A07(dspViewableNode, c2452rU);
            } else {
                c2431r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C2452rU c2452rU, C2448rN c2448rN) {
        C2431r5 c2431r5 = this.A02;
        if (c2431r5 != null && dspViewableNode != null && c2448rN != null) {
            if (this.A05.A00 && c2452rU != null) {
                c2448rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c2448rN.A08 + c2452rU;
                c2431r5.A08(dspViewableNode, c2452rU, c2448rN);
            } else {
                c2431r5.A09(dspViewableNode, c2448rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C2448rN<?, ?> c2448rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c2448rN);
    }

    public final void A0A(AbstractC2446rL abstractC2446rL, View view) {
        if (abstractC2446rL != null && view != null) {
            A05(abstractC2446rL, new C0781Aq(view, this.A00), new C05711u(null), null);
        }
    }
}
