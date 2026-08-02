package defpackage;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class r2 {
    public final int a;
    public final byte[] b;

    public r2(byte[] bArr) {
        this.a = ffx.T(bArr);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r2)) {
            return false;
        }
        return Arrays.equals(this.b, ((r2) obj).b);
    }

    public final int hashCode() {
        return this.a;
    }
}
