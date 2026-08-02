package b2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Y1.c f5540a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5541b;

    public j(Y1.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f5540a = cVar;
        this.f5541b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f5540a.equals(jVar.f5540a)) {
            return Arrays.equals(this.f5541b, jVar.f5541b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5540a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5541b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f5540a + ", bytes=[...]}";
    }
}
