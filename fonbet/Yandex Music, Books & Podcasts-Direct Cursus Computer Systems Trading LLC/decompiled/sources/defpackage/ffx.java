package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ffx extends nex {
    public final byte[] i;

    public ffx(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.i = bArr;
    }

    @Override // defpackage.nex
    public final byte[] T0() {
        return this.i;
    }
}
