package com.instagram.common.viewpoint.core;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2078kq implements InterfaceC1058Ll {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C2078kq(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1058Ll
    public final void AGj(int i) throws C2075kn {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1058Ll
    public final void close() throws C2075kn {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1058Ll
    public final int length() throws C2075kn {
        return this.A01.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1058Ll
    public final int read(byte[] bArr) throws C2075kn {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
