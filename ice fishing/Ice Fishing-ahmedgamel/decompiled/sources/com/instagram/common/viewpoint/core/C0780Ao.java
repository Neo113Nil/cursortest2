package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0780Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC2456rY A00;
    public InterfaceC2444rI A01;
    public C2432r5 A02;
    public final InterfaceC2445rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC2444rI A03 = new C0781Ap(this);

    public static String A02(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i6);
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

    public C0780Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC2456rY interfaceC2456rY, InterfaceC2445rJ interfaceC2445rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC2456rY;
        this.A04 = interfaceC2445rJ;
    }

    public static C0780Ao A01() {
        return new C0780Ao(new ViewpointQeConfig(), new C0783Ar(), null);
    }

    private void A05(AbstractC2447rL abstractC2447rL, InterfaceC2452rQ interfaceC2452rQ, InterfaceC0778Al interfaceC0778Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C2432r5.A01(this.A05, abstractC2447rL, interfaceC2452rQ, interfaceC0778Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C2453rU c2453rU) {
        C2432r5 c2432r5 = this.A02;
        if (c2432r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c2453rU != null) {
                c2432r5.A07(dspViewableNode, c2453rU);
            } else {
                c2432r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C2453rU c2453rU, C2449rN c2449rN) {
        C2432r5 c2432r5 = this.A02;
        if (c2432r5 != null && dspViewableNode != null && c2449rN != null) {
            if (this.A05.A00 && c2453rU != null) {
                c2449rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c2449rN.A08 + c2453rU;
                c2432r5.A08(dspViewableNode, c2453rU, c2449rN);
            } else {
                c2432r5.A09(dspViewableNode, c2449rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C2449rN<?, ?> c2449rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c2449rN);
    }

    public final void A0A(AbstractC2447rL abstractC2447rL, View view) {
        if (abstractC2447rL != null && view != null) {
            A05(abstractC2447rL, new C0782Aq(view, this.A00), new C05721u(null), null);
        }
    }
}
