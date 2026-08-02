package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class m0 {
    public final int a;
    public final byte[] b;

    public m0(byte[] bArr) {
        this.a = j66.e0(bArr);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        return Arrays.equals(this.b, ((m0) obj).b);
    }

    public final int hashCode() {
        return this.a;
    }
}
