package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class yfh extends szf {
    public final kgh a;
    public jtc b;

    public yfh(kgh kghVar) {
        this.a = kghVar;
    }

    @Override // defpackage.p33
    public final lcg d(byte[] bArr) {
        byte[] bArr2;
        bArr.getClass();
        jtc jtcVar = this.b;
        if (jtcVar != null && (bArr2 = (byte[]) jtcVar.a) != null && Arrays.equals(bArr2, bArr)) {
            return (lcg) jtcVar.b;
        }
        lcg d = this.a.d(bArr);
        d.getClass();
        jtc jtcVar2 = new jtc();
        jtcVar2.a = bArr;
        jtcVar2.b = d;
        this.b = jtcVar2;
        return d;
    }
}
