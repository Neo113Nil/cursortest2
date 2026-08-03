package m6;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f4927e;

    public n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f4927e = bArr;
    }

    @Override // m6.m
    public final byte[] d() {
        return this.f4927e;
    }
}
