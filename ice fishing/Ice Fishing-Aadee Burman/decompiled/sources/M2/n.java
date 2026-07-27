package M2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f1859v;

    public n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f1859v = bArr;
    }

    @Override // M2.m
    public final byte[] w0() {
        return this.f1859v;
    }
}
