package defpackage;

import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class vrm implements q4h {
    public final trm a;
    public final int b;

    public vrm(trm trmVar, int i) {
        this.a = trmVar;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        trmVar.m(i, new byte[0]);
    }

    @Override // defpackage.q4h
    public final void a(byte[] bArr, byte[] bArr2) {
        if (h4a.r(b(bArr2), bArr)) {
            return;
        }
        b6e.m("invalid MAC");
    }

    @Override // defpackage.q4h
    public final byte[] b(byte[] bArr) {
        return this.a.m(this.b, bArr);
    }
}
