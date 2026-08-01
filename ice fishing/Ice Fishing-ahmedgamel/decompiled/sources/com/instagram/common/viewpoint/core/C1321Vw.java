package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1321Vw extends N2 {
    public static byte[] A01;
    public final /* synthetic */ UK A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, Byte.MAX_VALUE, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, Byte.MAX_VALUE, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, Byte.MAX_VALUE, 98, c.f16318c};
    }

    public C1321Vw(UK uk) {
        this.A00 = uk;
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0B(C2022ju c2022ju) {
        this.A00.A1d(c2022ju);
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0C() {
        InterfaceC1270Tv interfaceC1270Tv;
        InterfaceC1270Tv interfaceC1270Tv2;
        interfaceC1270Tv = this.A00.A0I;
        if (interfaceC1270Tv != null) {
            interfaceC1270Tv2 = this.A00.A0I;
            interfaceC1270Tv2.ACm();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0F(N1 n1) {
        C07107g c07107g;
        C07107g c07107g2;
        c07107g = this.A00.A0B;
        if (c07107g != null) {
            c07107g2 = this.A00.A0B;
            c07107g2.A0M();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0G(C1312Vm c1312Vm) {
        long j6;
        InterfaceC1270Tv interfaceC1270Tv;
        InterfaceC1270Tv interfaceC1270Tv2;
        InterfaceC1066Lt A0F = this.A00.A16().A0F();
        j6 = this.A00.A00;
        A0F.A3N(Y1.A01(j6), c1312Vm.A03().getErrorCode(), c1312Vm.A04());
        interfaceC1270Tv = this.A00.A0I;
        if (interfaceC1270Tv != null) {
            interfaceC1270Tv2 = this.A00.A0I;
            interfaceC1270Tv2.ADp(c1312Vm);
        }
    }
}
