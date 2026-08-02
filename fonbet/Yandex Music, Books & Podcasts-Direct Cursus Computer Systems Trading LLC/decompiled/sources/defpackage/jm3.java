package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class jm3 {
    public final byte[] a;
    public final int b;

    public jm3(byte[] bArr) {
        this.a = bArr;
        this.b = Arrays.hashCode(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jm3)) {
            return false;
        }
        return Arrays.equals(this.a, ((jm3) obj).a);
    }

    public final int hashCode() {
        return this.b;
    }
}
