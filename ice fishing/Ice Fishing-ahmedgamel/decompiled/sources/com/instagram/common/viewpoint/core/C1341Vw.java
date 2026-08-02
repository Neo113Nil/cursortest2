package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1341Vw extends N2 {
    public static byte[] A01;
    public final /* synthetic */ UK A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, Byte.MAX_VALUE, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, Byte.MAX_VALUE, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, Byte.MAX_VALUE, 98, c.f17105c};
    }

    public C1341Vw(UK uk) {
        this.A00 = uk;
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0B(C2042ju c2042ju) {
        this.A00.A1d(c2042ju);
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0C() {
        InterfaceC1290Tv interfaceC1290Tv;
        InterfaceC1290Tv interfaceC1290Tv2;
        interfaceC1290Tv = this.A00.A0I;
        if (interfaceC1290Tv != null) {
            interfaceC1290Tv2 = this.A00.A0I;
            interfaceC1290Tv2.ACm();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0F(N1 n12) {
        C07307g c07307g;
        C07307g c07307g2;
        c07307g = this.A00.A0B;
        if (c07307g != null) {
            c07307g2 = this.A00.A0B;
            c07307g2.A0M();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0G(C1332Vm c1332Vm) {
        long j6;
        InterfaceC1290Tv interfaceC1290Tv;
        InterfaceC1290Tv interfaceC1290Tv2;
        InterfaceC1086Lt A0F = this.A00.A16().A0F();
        j6 = this.A00.A00;
        A0F.A3N(Y1.A01(j6), c1332Vm.A03().getErrorCode(), c1332Vm.A04());
        interfaceC1290Tv = this.A00.A0I;
        if (interfaceC1290Tv != null) {
            interfaceC1290Tv2 = this.A00.A0I;
            interfaceC1290Tv2.ADp(c1332Vm);
        }
    }
}
