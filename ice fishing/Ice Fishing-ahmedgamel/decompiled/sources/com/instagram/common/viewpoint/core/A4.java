package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class A4 implements InterfaceC06313l {
    public final C07879y A00;
    public final C2298oJ A01;
    public final InterfaceC06303k[] A02;

    public A4(InterfaceC06303k... interfaceC06303kArr) {
        this(interfaceC06303kArr, new C07879y(), new C2298oJ());
    }

    public A4(InterfaceC06303k[] interfaceC06303kArr, C07879y c07879y, C2298oJ c2298oJ) {
        this.A02 = new InterfaceC06303k[interfaceC06303kArr.length + 2];
        System.arraycopy(interfaceC06303kArr, 0, this.A02, 0, interfaceC06303kArr.length);
        this.A00 = c07879y;
        this.A01 = c2298oJ;
        this.A02[interfaceC06303kArr.length] = c07879y;
        this.A02[interfaceC06303kArr.length + 1] = c2298oJ;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06313l
    public final C2399px A4F(C2399px c2399px) {
        this.A01.A02(c2399px.A01);
        this.A01.A01(c2399px.A00);
        return c2399px;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06313l
    public final boolean A4G(boolean z6) {
        this.A00.A0D(z6);
        return z6;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06313l
    public final InterfaceC06303k[] A6z() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06313l
    public final long A8U(long j6) {
        return this.A01.A00(j6);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06313l
    public final long A98() {
        return this.A00.A0C();
    }
}
