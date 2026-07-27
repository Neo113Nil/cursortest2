package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class VZ implements InterfaceC1238Sp {
    public static byte[] A03;
    public static String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ C2022ju A00;
    public final /* synthetic */ UK A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{28, 55, c.f16318c, 66, 59, 58, -10, 74, 69, -10, 58, 69, 77, 68, 66, 69, 55, 58, -10, 55, -10, 67, 59, 58, c.f16318c, 55, 4};
    }

    static {
        A01();
    }

    public VZ(UK uk, C2022ju c2022ju, boolean z3) {
        this.A01 = uk;
        this.A00 = c2022ju;
        this.A02 = z3;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1238Sp
    public final void ADL() {
        C1840gi c1840gi;
        long j6;
        InterfaceC1270Tv interfaceC1270Tv;
        InterfaceC1270Tv interfaceC1270Tv2;
        if (this.A01.A0e != null) {
            this.A01.A0e.A0J();
            this.A01.A0e = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 111);
        c1840gi = this.A01.A0g;
        InterfaceC1066Lt A0F = c1840gi.A0F();
        j6 = this.A01.A00;
        A0F.A3N(Y1.A01(j6), adErrorType.getErrorCode(), A00);
        interfaceC1270Tv = this.A01.A0I;
        if (interfaceC1270Tv != null) {
            interfaceC1270Tv2 = this.A01.A0I;
            interfaceC1270Tv2.ADp(C1312Vm.A01(adErrorType, A00));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1238Sp
    public final void ADT() {
        InterfaceC1270Tv interfaceC1270Tv;
        VW vw;
        C1840gi c1840gi;
        InterfaceC1270Tv interfaceC1270Tv2;
        C1840gi c1840gi2;
        boolean A0r;
        InterfaceC1270Tv interfaceC1270Tv3;
        C07107g c07107g;
        C07107g c07107g2;
        this.A01.A0e = this.A00;
        if (this.A02) {
            c07107g = this.A01.A0B;
            if (c07107g != null) {
                c07107g2 = this.A01.A0B;
                c07107g2.A0L();
            }
        }
        interfaceC1270Tv = this.A01.A0I;
        if (interfaceC1270Tv != null) {
            vw = this.A01.A0G;
            if (vw.equals(VW.A04)) {
                A0r = this.A01.A0r();
                if (!A0r) {
                    interfaceC1270Tv3 = this.A01.A0I;
                    interfaceC1270Tv3.AEq();
                }
            }
            if (this.A02) {
                UK uk = this.A01;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    c1840gi = uk.A0g;
                    if (C1290Up.A1s(c1840gi) && this.A01.A13() != null && this.A01.A13().A1g()) {
                        UK uk2 = this.A01;
                        c1840gi2 = this.A01.A0g;
                        uk2.A0P = AbstractC1625dD.A01(c1840gi2, this.A01.A13(), 4, new C1316Vr(this));
                        return;
                    } else {
                        UK uk3 = this.A01;
                        if (A04[3].length() != 28) {
                            A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                            interfaceC1270Tv2 = uk3.A0I;
                            interfaceC1270Tv2.ACq();
                            return;
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
    }
}
