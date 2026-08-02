package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class erg {
    public final byte[] a;

    public erg(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!erg.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return Arrays.equals(this.a, ((erg) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "LogId(keyId=" + Arrays.toString(this.a) + ')';
    }
}
