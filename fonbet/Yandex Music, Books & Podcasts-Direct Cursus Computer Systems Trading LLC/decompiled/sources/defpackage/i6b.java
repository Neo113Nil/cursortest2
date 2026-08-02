package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i6b {
    public final p6b a;
    public final byte[] b;

    public i6b(p6b p6bVar, byte[] bArr) {
        if (p6bVar == null) {
            jj4.j("encoding is null");
            throw null;
        }
        if (bArr == null) {
            jj4.j("bytes is null");
            throw null;
        }
        this.a = p6bVar;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6b)) {
            return false;
        }
        i6b i6bVar = (i6b) obj;
        if (this.a.equals(i6bVar.a)) {
            return Arrays.equals(this.b, i6bVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
