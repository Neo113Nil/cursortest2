package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.If, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0975If implements XN {
    public static String[] A01 = {"72ztA7TlK5AWnMBFqm0ulEGrNikWU87c", "q9jSjTIXJJeud4mNFdEJpcs0aBWF", "6LBG7Z", "4a80CIrFExPHnWcdf8FRxARvXokzjsAY", "hmt020juZcOK2XVUFVfIwXvCI0upMeB5", "bPuxHbTn8HkB22ksZqTc8mW6RF8jNMxu", "KvPASdtvPFN6v", "W7wSubo8j20OAA03KxoOzu7JM99EpBz5"};
    public final /* synthetic */ C06595h A00;

    public C0975If(C06595h c06595h) {
        this.A00 = c06595h;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        AbstractC1553c3 abstractC1553c3;
        AbstractC1553c3 abstractC1553c32;
        InterfaceC1660dm interfaceC1660dm;
        AbstractC1553c3 abstractC1553c33;
        InterfaceC1660dm interfaceC1660dm2;
        AbstractC1375Yb abstractC1375Yb;
        InterfaceC1660dm interfaceC1660dm3;
        int i;
        AbstractC1553c3 abstractC1553c34;
        InterfaceC1660dm interfaceC1660dm4;
        AbstractC1375Yb abstractC1375Yb2;
        abstractC1553c3 = this.A00.A01;
        if (abstractC1553c3 instanceof C1023Kc) {
            abstractC1553c34 = this.A00.A01;
            if (abstractC1553c34.A1M()) {
                interfaceC1660dm4 = this.A00.A07;
                interfaceC1660dm4.AFw(true);
                abstractC1375Yb2 = this.A00.A06;
                abstractC1375Yb2.setToolbarActionMode(1);
                interfaceC1660dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1660dm3.ADc(i);
            }
        }
        abstractC1553c32 = this.A00.A01;
        if (abstractC1553c32 instanceof C1003Ji) {
            abstractC1553c33 = this.A00.A01;
            if (abstractC1553c33.A1M()) {
                interfaceC1660dm2 = this.A00.A07;
                interfaceC1660dm2.AFw(true);
                abstractC1375Yb = this.A00.A06;
                abstractC1375Yb.setToolbarActionMode(1);
                interfaceC1660dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1660dm3.ADc(i);
            }
        }
        interfaceC1660dm = this.A00.A07;
        String[] strArr = A01;
        if (strArr[4].charAt(11) == strArr[3].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "jNYMJATRfaQqNW2YkrgQ7vcVmM2IUm0K";
        strArr2[0] = "cX4sd5TjwRWpCL8J3hPSalfD2n4ZIotM";
        interfaceC1660dm.AFw(false);
        interfaceC1660dm3 = this.A00.A07;
        i = this.A00.A03;
        interfaceC1660dm3.ADc(i);
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f3) {
        InterfaceC1660dm interfaceC1660dm;
        int i;
        DZ dz;
        DZ dz2;
        int i6;
        interfaceC1660dm = this.A00.A07;
        i = this.A00.A03;
        interfaceC1660dm.ADw(i - f3);
        dz = this.A00.A02;
        if (dz != null) {
            dz2 = this.A00.A02;
            i6 = this.A00.A03;
            dz2.A07((int) (i6 - f3));
        }
    }
}
