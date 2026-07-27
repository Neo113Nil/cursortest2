package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ma, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1072Ma implements InterfaceC1688eG {
    public static byte[] A01;
    public static String[] A02 = {"eg4OuzmozbdBw8OpfnEQ9S5WXV0sj4Z8", "rcCmLv", "J9fwVwM4lsi34p", "AlJIDEMCKinwW9CsIljPKEg77fEpV28V", "eGLouwRxqegMv8vZbxB0WI", "SMn3POGOAwCpVf", "x8sqAERQ", "K7z6bhBLHSjzf8oEEyEGbL"};
    public final /* synthetic */ MW A00;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
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

    public C1072Ma(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C1072Ma(MW mw, C1084Mm c1084Mm) {
        this(mw);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1688eG
    public final void ADX() {
        this.A00.A0V(true, A00(0, 9, 3));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1688eG
    public final void AEA() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1688eG
    public final void AEh() {
        C1111No c1111No;
        AtomicBoolean atomicBoolean;
        c1111No = this.A00.A0H;
        if (!c1111No.A0b()) {
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC1688eG
    public final void AFQ() {
        C1690eI c1690eI;
        C1839gi c1839gi;
        this.A00.AFA(false);
        c1690eI = this.A00.A0Q;
        c1690eI.A0E(8);
        c1839gi = this.A00.A0J;
        c1839gi.A0F().AFH();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1688eG
    public final void AGg() {
        InterfaceC1380Yh interfaceC1380Yh;
        interfaceC1380Yh = this.A00.A0O;
        interfaceC1380Yh.ADJ(15);
    }
}
