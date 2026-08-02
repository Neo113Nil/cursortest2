package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class q67 {
    public final byte[] a;
    public final int b;

    public q67(byte[] bArr) {
        this.a = bArr;
        this.b = Arrays.hashCode(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q67)) {
            return false;
        }
        return Arrays.equals(this.a, ((q67) obj).a);
    }

    public final int hashCode() {
        return this.b;
    }
}
