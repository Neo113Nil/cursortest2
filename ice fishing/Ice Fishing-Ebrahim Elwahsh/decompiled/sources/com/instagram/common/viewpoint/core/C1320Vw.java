package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1320Vw extends N2 {
    public static byte[] A01;
    public final /* synthetic */ UK A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, Byte.MAX_VALUE, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, Byte.MAX_VALUE, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, Byte.MAX_VALUE, 98, c.f16476c};
    }

    public C1320Vw(UK uk) {
        this.A00 = uk;
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0B(C2021ju c2021ju) {
        this.A00.A1d(c2021ju);
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0C() {
        InterfaceC1269Tv interfaceC1269Tv;
        InterfaceC1269Tv interfaceC1269Tv2;
        interfaceC1269Tv = this.A00.A0I;
        if (interfaceC1269Tv != null) {
            interfaceC1269Tv2 = this.A00.A0I;
            interfaceC1269Tv2.ACm();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0F(N1 n1) {
        C07097g c07097g;
        C07097g c07097g2;
        c07097g = this.A00.A0B;
        if (c07097g != null) {
            c07097g2 = this.A00.A0B;
            c07097g2.A0M();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0G(C1311Vm c1311Vm) {
        long j9;
        InterfaceC1269Tv interfaceC1269Tv;
        InterfaceC1269Tv interfaceC1269Tv2;
        InterfaceC1065Lt A0F = this.A00.A16().A0F();
        j9 = this.A00.A00;
        A0F.A3N(Y1.A01(j9), c1311Vm.A03().getErrorCode(), c1311Vm.A04());
        interfaceC1269Tv = this.A00.A0I;
        if (interfaceC1269Tv != null) {
            interfaceC1269Tv2 = this.A00.A0I;
            interfaceC1269Tv2.ADp(c1311Vm);
        }
    }
}
