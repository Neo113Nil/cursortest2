package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0890Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C2355pY A01;
    public final Object A02;
    public final C07227s[] A03;
    public final InterfaceC2212nE[] A04;

    public C0890Ex(C07227s[] c07227sArr, InterfaceC2212nE[] interfaceC2212nEArr, C2355pY c2355pY, Object obj) {
        this.A03 = c07227sArr;
        this.A04 = (InterfaceC2212nE[]) interfaceC2212nEArr.clone();
        this.A01 = c2355pY;
        this.A02 = obj;
        this.A00 = c07227sArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(C0890Ex c0890Ex, int i) {
        if (c0890Ex == null) {
            return false;
        }
        C07227s[] c07227sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!C5C.A1E(c07227sArr[i], c0890Ex.A03[i])) {
                return false;
            }
            InterfaceC2212nE interfaceC2212nE = this.A04[i];
            InterfaceC2212nE interfaceC2212nE2 = c0890Ex.A04[i];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return C5C.A1E(interfaceC2212nE, interfaceC2212nE2);
            }
        }
        throw new RuntimeException();
    }
}
