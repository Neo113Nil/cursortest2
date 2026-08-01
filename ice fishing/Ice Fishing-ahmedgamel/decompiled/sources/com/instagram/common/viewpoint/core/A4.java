package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class A4 implements InterfaceC06113l {
    public final C07679y A00;
    public final C2278oJ A01;
    public final InterfaceC06103k[] A02;

    public A4(InterfaceC06103k... interfaceC06103kArr) {
        this(interfaceC06103kArr, new C07679y(), new C2278oJ());
    }

    public A4(InterfaceC06103k[] interfaceC06103kArr, C07679y c07679y, C2278oJ c2278oJ) {
        this.A02 = new InterfaceC06103k[interfaceC06103kArr.length + 2];
        System.arraycopy(interfaceC06103kArr, 0, this.A02, 0, interfaceC06103kArr.length);
        this.A00 = c07679y;
        this.A01 = c2278oJ;
        this.A02[interfaceC06103kArr.length] = c07679y;
        this.A02[interfaceC06103kArr.length + 1] = c2278oJ;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06113l
    public final C2379px A4F(C2379px c2379px) {
        this.A01.A02(c2379px.A01);
        this.A01.A01(c2379px.A00);
        return c2379px;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06113l
    public final boolean A4G(boolean z3) {
        this.A00.A0D(z3);
        return z3;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06113l
    public final InterfaceC06103k[] A6z() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06113l
    public final long A8U(long j6) {
        return this.A01.A00(j6);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06113l
    public final long A98() {
        return this.A00.A0C();
    }
}
