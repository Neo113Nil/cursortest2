package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class VZ implements InterfaceC1237Sp {
    public static byte[] A03;
    public static String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ C2021ju A00;
    public final /* synthetic */ UK A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{28, 55, c.f16476c, 66, 59, 58, -10, 74, 69, -10, 58, 69, 77, 68, 66, 69, 55, 58, -10, 55, -10, 67, 59, 58, c.f16476c, 55, 4};
    }

    static {
        A01();
    }

    public VZ(UK uk, C2021ju c2021ju, boolean z8) {
        this.A01 = uk;
        this.A00 = c2021ju;
        this.A02 = z8;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1237Sp
    public final void ADL() {
        C1839gi c1839gi;
        long j9;
        InterfaceC1269Tv interfaceC1269Tv;
        InterfaceC1269Tv interfaceC1269Tv2;
        if (this.A01.A0e != null) {
            this.A01.A0e.A0J();
            this.A01.A0e = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 111);
        c1839gi = this.A01.A0g;
        InterfaceC1065Lt A0F = c1839gi.A0F();
        j9 = this.A01.A00;
        A0F.A3N(Y1.A01(j9), adErrorType.getErrorCode(), A00);
        interfaceC1269Tv = this.A01.A0I;
        if (interfaceC1269Tv != null) {
            interfaceC1269Tv2 = this.A01.A0I;
            interfaceC1269Tv2.ADp(C1311Vm.A01(adErrorType, A00));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1237Sp
    public final void ADT() {
        InterfaceC1269Tv interfaceC1269Tv;
        VW vw;
        C1839gi c1839gi;
        InterfaceC1269Tv interfaceC1269Tv2;
        C1839gi c1839gi2;
        boolean A0r;
        InterfaceC1269Tv interfaceC1269Tv3;
        C07097g c07097g;
        C07097g c07097g2;
        this.A01.A0e = this.A00;
        if (this.A02) {
            c07097g = this.A01.A0B;
            if (c07097g != null) {
                c07097g2 = this.A01.A0B;
                c07097g2.A0L();
            }
        }
        interfaceC1269Tv = this.A01.A0I;
        if (interfaceC1269Tv != null) {
            vw = this.A01.A0G;
            if (vw.equals(VW.A04)) {
                A0r = this.A01.A0r();
                if (!A0r) {
                    interfaceC1269Tv3 = this.A01.A0I;
                    interfaceC1269Tv3.AEq();
                }
            }
            if (this.A02) {
                UK uk = this.A01;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    c1839gi = uk.A0g;
                    if (C1289Up.A1s(c1839gi) && this.A01.A13() != null && this.A01.A13().A1g()) {
                        UK uk2 = this.A01;
                        c1839gi2 = this.A01.A0g;
                        uk2.A0P = AbstractC1624dD.A01(c1839gi2, this.A01.A13(), 4, new C1315Vr(this));
                        return;
                    } else {
                        UK uk3 = this.A01;
                        if (A04[3].length() != 28) {
                            A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                            interfaceC1269Tv2 = uk3.A0I;
                            interfaceC1269Tv2.ACq();
                            return;
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
    }
}
