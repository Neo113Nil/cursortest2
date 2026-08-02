package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class s2 {
    public final int a;
    public final byte[] b;

    public s2(byte[] bArr) {
        this.a = rza1.e(bArr);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s2)) {
            return false;
        }
        return Arrays.equals(this.b, ((s2) obj).b);
    }

    public final int hashCode() {
        return this.a;
    }
}
