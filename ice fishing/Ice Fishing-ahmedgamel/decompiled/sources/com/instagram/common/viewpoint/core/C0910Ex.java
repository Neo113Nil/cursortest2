package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0910Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C2375pY A01;
    public final Object A02;
    public final C07427s[] A03;
    public final InterfaceC2232nE[] A04;

    public C0910Ex(C07427s[] c07427sArr, InterfaceC2232nE[] interfaceC2232nEArr, C2375pY c2375pY, Object obj) {
        this.A03 = c07427sArr;
        this.A04 = (InterfaceC2232nE[]) interfaceC2232nEArr.clone();
        this.A01 = c2375pY;
        this.A02 = obj;
        this.A00 = c07427sArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(C0910Ex c0910Ex, int i) {
        if (c0910Ex == null) {
            return false;
        }
        C07427s[] c07427sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!C5C.A1E(c07427sArr[i], c0910Ex.A03[i])) {
                return false;
            }
            InterfaceC2232nE interfaceC2232nE = this.A04[i];
            InterfaceC2232nE interfaceC2232nE2 = c0910Ex.A04[i];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return C5C.A1E(interfaceC2232nE, interfaceC2232nE2);
            }
        }
        throw new RuntimeException();
    }
}
