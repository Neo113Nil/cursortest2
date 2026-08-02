package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ma, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1093Ma implements InterfaceC1709eG {
    public static byte[] A01;
    public static String[] A02 = {"eg4OuzmozbdBw8OpfnEQ9S5WXV0sj4Z8", "rcCmLv", "J9fwVwM4lsi34p", "AlJIDEMCKinwW9CsIljPKEg77fEpV28V", "eGLouwRxqegMv8vZbxB0WI", "SMn3POGOAwCpVf", "x8sqAERQ", "K7z6bhBLHSjzf8oEEyEGbL"};
    public final /* synthetic */ MW A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-22, -24, -38, -25, -40, -31, -34, -40, -32};
    }

    static {
        A01();
    }

    public C1093Ma(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C1093Ma(MW mw, C1105Mm c1105Mm) {
        this(mw);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1709eG
    public final void ADX() {
        this.A00.A0V(true, A00(0, 9, 3));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1709eG
    public final void AEA() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1709eG
    public final void AEh() {
        C1132No c1132No;
        AtomicBoolean atomicBoolean;
        c1132No = this.A00.A0H;
        if (!c1132No.A0b()) {
            this.A00.A0N();
            return;
        }
        MW mw = this.A00;
        String[] strArr = A02;
        if (strArr[3].charAt(22) == strArr[0].charAt(22)) {
            throw new RuntimeException();
        }
        A02[1] = "uysARHPfhmw6aS";
        atomicBoolean = mw.A0S;
        atomicBoolean.set(true);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1709eG
    public final void AFQ() {
        C1711eI c1711eI;
        C1860gi c1860gi;
        this.A00.AFA(false);
        c1711eI = this.A00.A0Q;
        c1711eI.A0E(8);
        c1860gi = this.A00.A0J;
        c1860gi.A0F().AFH();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1709eG
    public final void AGg() {
        InterfaceC1401Yh interfaceC1401Yh;
        interfaceC1401Yh = this.A00.A0O;
        interfaceC1401Yh.ADJ(15);
    }
}
