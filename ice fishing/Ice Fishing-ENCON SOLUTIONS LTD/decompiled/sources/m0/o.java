package m0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8189c;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f8189c = bArr;
    }

    @Override // m0.n
    public final byte[] f() {
        return this.f8189c;
    }
}
