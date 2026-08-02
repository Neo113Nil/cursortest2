package O2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f2285v;

    public n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f2285v = bArr;
    }

    @Override // O2.m
    public final byte[] t0() {
        return this.f2285v;
    }
}
