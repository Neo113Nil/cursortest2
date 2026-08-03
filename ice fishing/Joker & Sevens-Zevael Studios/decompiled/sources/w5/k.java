package w5;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final t5.c f7696a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7697b;

    public k(t5.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f7696a = cVar;
        this.f7697b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f7696a.equals(kVar.f7696a)) {
            return Arrays.equals(this.f7697b, kVar.f7697b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7696a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7697b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f7696a + ", bytes=[...]}";
    }
}
