package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0800Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC2476rY A00;
    public InterfaceC2464rI A01;
    public C2452r5 A02;
    public final InterfaceC2465rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC2464rI A03 = new C0801Ap(this);

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 106);
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

    public C0800Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC2476rY interfaceC2476rY, InterfaceC2465rJ interfaceC2465rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC2476rY;
        this.A04 = interfaceC2465rJ;
    }

    public static C0800Ao A01() {
        return new C0800Ao(new ViewpointQeConfig(), new C0803Ar(), null);
    }

    private void A05(AbstractC2467rL abstractC2467rL, InterfaceC2472rQ interfaceC2472rQ, InterfaceC0798Al interfaceC0798Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C2452r5.A01(this.A05, abstractC2467rL, interfaceC2472rQ, interfaceC0798Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C2473rU c2473rU) {
        C2452r5 c2452r5 = this.A02;
        if (c2452r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c2473rU != null) {
                c2452r5.A07(dspViewableNode, c2473rU);
            } else {
                c2452r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C2473rU c2473rU, C2469rN c2469rN) {
        C2452r5 c2452r5 = this.A02;
        if (c2452r5 != null && dspViewableNode != null && c2469rN != null) {
            if (this.A05.A00 && c2473rU != null) {
                c2469rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c2469rN.A08 + c2473rU;
                c2452r5.A08(dspViewableNode, c2473rU, c2469rN);
            } else {
                c2452r5.A09(dspViewableNode, c2469rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C2469rN<?, ?> c2469rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c2469rN);
    }

    public final void A0A(AbstractC2467rL abstractC2467rL, View view) {
        if (abstractC2467rL != null && view != null) {
            A05(abstractC2467rL, new C0802Aq(view, this.A00), new C05921u(null), null);
        }
    }
}
