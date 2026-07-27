package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0889Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C2354pY A01;
    public final Object A02;
    public final C07217s[] A03;
    public final InterfaceC2211nE[] A04;

    public C0889Ex(C07217s[] c07217sArr, InterfaceC2211nE[] interfaceC2211nEArr, C2354pY c2354pY, Object obj) {
        this.A03 = c07217sArr;
        this.A04 = (InterfaceC2211nE[]) interfaceC2211nEArr.clone();
        this.A01 = c2354pY;
        this.A02 = obj;
        this.A00 = c07217sArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(C0889Ex c0889Ex, int i) {
        if (c0889Ex == null) {
            return false;
        }
        C07217s[] c07217sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!C5C.A1E(c07217sArr[i], c0889Ex.A03[i])) {
                return false;
            }
            InterfaceC2211nE interfaceC2211nE = this.A04[i];
            InterfaceC2211nE interfaceC2211nE2 = c0889Ex.A04[i];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return C5C.A1E(interfaceC2211nE, interfaceC2211nE2);
            }
        }
        throw new RuntimeException();
    }
}
