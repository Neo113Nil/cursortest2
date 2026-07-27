package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ma, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1073Ma implements InterfaceC1689eG {
    public static byte[] A01;
    public static String[] A02 = {"eg4OuzmozbdBw8OpfnEQ9S5WXV0sj4Z8", "rcCmLv", "J9fwVwM4lsi34p", "AlJIDEMCKinwW9CsIljPKEg77fEpV28V", "eGLouwRxqegMv8vZbxB0WI", "SMn3POGOAwCpVf", "x8sqAERQ", "K7z6bhBLHSjzf8oEEyEGbL"};
    public final /* synthetic */ MW A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-22, -24, -38, -25, -40, -31, -34, -40, -32};
    }

    static {
        A01();
    }

    public C1073Ma(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C1073Ma(MW mw, C1085Mm c1085Mm) {
        this(mw);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1689eG
    public final void ADX() {
        this.A00.A0V(true, A00(0, 9, 3));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1689eG
    public final void AEA() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1689eG
    public final void AEh() {
        C1112No c1112No;
        AtomicBoolean atomicBoolean;
        c1112No = this.A00.A0H;
        if (!c1112No.A0b()) {
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC1689eG
    public final void AFQ() {
        C1691eI c1691eI;
        C1840gi c1840gi;
        this.A00.AFA(false);
        c1691eI = this.A00.A0Q;
        c1691eI.A0E(8);
        c1840gi = this.A00.A0J;
        c1840gi.A0F().AFH();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1689eG
    public final void AGg() {
        InterfaceC1381Yh interfaceC1381Yh;
        interfaceC1381Yh = this.A00.A0O;
        interfaceC1381Yh.ADJ(15);
    }
}
