package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.If, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0995If implements XN {
    public static String[] A01 = {"72ztA7TlK5AWnMBFqm0ulEGrNikWU87c", "q9jSjTIXJJeud4mNFdEJpcs0aBWF", "6LBG7Z", "4a80CIrFExPHnWcdf8FRxARvXokzjsAY", "hmt020juZcOK2XVUFVfIwXvCI0upMeB5", "bPuxHbTn8HkB22ksZqTc8mW6RF8jNMxu", "KvPASdtvPFN6v", "W7wSubo8j20OAA03KxoOzu7JM99EpBz5"};
    public final /* synthetic */ C06795h A00;

    public C0995If(C06795h c06795h) {
        this.A00 = c06795h;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        AbstractC1573c3 abstractC1573c3;
        AbstractC1573c3 abstractC1573c32;
        InterfaceC1680dm interfaceC1680dm;
        AbstractC1573c3 abstractC1573c33;
        InterfaceC1680dm interfaceC1680dm2;
        AbstractC1395Yb abstractC1395Yb;
        InterfaceC1680dm interfaceC1680dm3;
        int i;
        AbstractC1573c3 abstractC1573c34;
        InterfaceC1680dm interfaceC1680dm4;
        AbstractC1395Yb abstractC1395Yb2;
        abstractC1573c3 = this.A00.A01;
        if (abstractC1573c3 instanceof C1043Kc) {
            abstractC1573c34 = this.A00.A01;
            if (abstractC1573c34.A1M()) {
                interfaceC1680dm4 = this.A00.A07;
                interfaceC1680dm4.AFw(true);
                abstractC1395Yb2 = this.A00.A06;
                abstractC1395Yb2.setToolbarActionMode(1);
                interfaceC1680dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1680dm3.ADc(i);
            }
        }
        abstractC1573c32 = this.A00.A01;
        if (abstractC1573c32 instanceof C1023Ji) {
            abstractC1573c33 = this.A00.A01;
            if (abstractC1573c33.A1M()) {
                interfaceC1680dm2 = this.A00.A07;
                interfaceC1680dm2.AFw(true);
                abstractC1395Yb = this.A00.A06;
                abstractC1395Yb.setToolbarActionMode(1);
                interfaceC1680dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1680dm3.ADc(i);
            }
        }
        interfaceC1680dm = this.A00.A07;
        String[] strArr = A01;
        if (strArr[4].charAt(11) == strArr[3].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "jNYMJATRfaQqNW2YkrgQ7vcVmM2IUm0K";
        strArr2[0] = "cX4sd5TjwRWpCL8J3hPSalfD2n4ZIotM";
        interfaceC1680dm.AFw(false);
        interfaceC1680dm3 = this.A00.A07;
        i = this.A00.A03;
        interfaceC1680dm3.ADc(i);
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f2) {
        InterfaceC1680dm interfaceC1680dm;
        int i;
        DZ dz;
        DZ dz2;
        int i4;
        interfaceC1680dm = this.A00.A07;
        i = this.A00.A03;
        interfaceC1680dm.ADw(i - f2);
        dz = this.A00.A02;
        if (dz != null) {
            dz2 = this.A00.A02;
            i4 = this.A00.A03;
            dz2.A07((int) (i4 - f2));
        }
    }
}
