package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2182mj implements H1 {
    public static String[] A03 = {"Qzrb2NyX11iip4M0Dun9HjrVhDBjGiaF", "S4lxERGEQHczdoRlIRLlXReEKfWFWSGc", "txU8e6wljbe290bqTydjfEMDFUDvEmx5", "ZB68ibpDVF3DEFIIdRwQIG37zRUG2jhG", "NKfzuQ6LKFKezVni40AKhLW9Qs", "gUOm4cnsv29C5J2bDVOWEpGrIAhYUn7e", "xRx4EoAOCCZ90h8tA3pJ1YmFxzetviZR", "6LlO7okteSZZNTbDPWq3J1SHLhykMwkf"};
    public final int A00;
    public final HE A01;
    public final HJ A02;

    @Override // com.instagram.common.viewpoint.core.H1
    public final /* synthetic */ void AFs() {
    }

    public C2182mj(HJ hj, int i) {
        this.A02 = hj;
        this.A00 = i;
        this.A01 = new HE();
    }

    private long A00(InterfaceC2191ms interfaceC2191ms) throws IOException {
        while (interfaceC2191ms.A8i() < interfaceC2191ms.A8O() - 6 && !HF.A09(interfaceC2191ms, this.A02, this.A00, this.A01)) {
            String[] strArr = A03;
            if (strArr[1].charAt(7) == strArr[7].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "MdA2mB0qiCN7NKRKcBY3aVGEnEzRIKP4";
            strArr2[3] = "Kp5wPJFyOGMB7tBJUi3Fl7WX9iQtExSk";
            interfaceC2191ms.A47(1);
        }
        if (interfaceC2191ms.A8i() >= interfaceC2191ms.A8O() - 6) {
            interfaceC2191ms.A47((int) (interfaceC2191ms.A8O() - interfaceC2191ms.A8i()));
            return this.A02.A09;
        }
        return this.A01.A00;
    }

    @Override // com.instagram.common.viewpoint.core.H1
    public final C0943Gz AIw(InterfaceC2191ms interfaceC2191ms, long j6) throws IOException {
        long rightFrameFirstSampleNumber = interfaceC2191ms.A8n();
        long leftFrameFirstSampleNumber = A00(interfaceC2191ms);
        long A8i = interfaceC2191ms.A8i();
        interfaceC2191ms.A47(Math.max(6, this.A02.A06));
        long searchPosition = A00(interfaceC2191ms);
        long leftFramePosition = interfaceC2191ms.A8i();
        if (leftFrameFirstSampleNumber <= j6 && searchPosition > j6) {
            return C0943Gz.A03(A8i);
        }
        if (searchPosition <= j6) {
            return C0943Gz.A05(searchPosition, leftFramePosition);
        }
        return C0943Gz.A04(leftFrameFirstSampleNumber, rightFrameFirstSampleNumber);
    }
}
