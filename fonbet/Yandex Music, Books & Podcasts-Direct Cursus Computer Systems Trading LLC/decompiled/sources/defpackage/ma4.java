package defpackage;

/* loaded from: classes3.dex */
public final class ma4 extends na4 {
    @Override // defpackage.na4
    public final int[] c(int[] iArr, int i) {
        if (iArr.length != 3) {
            b6e.p("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
            return null;
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = na4.c;
        System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
        System.arraycopy(this.a, 0, iArr2, iArr3.length, 8);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // defpackage.na4
    public final int f() {
        return 12;
    }
}
