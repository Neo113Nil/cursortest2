package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qyn {
    public final pzn a;
    public final byte[] b;

    public qyn(pzn pznVar, byte[] bArr) {
        if (pznVar == null) {
            ny61.t("encoding is null");
            throw null;
        }
        if (bArr == null) {
            ny61.t("bytes is null");
            throw null;
        }
        this.a = pznVar;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyn)) {
            return false;
        }
        qyn qynVar = (qyn) obj;
        if (this.a.equals(qynVar.a)) {
            return Arrays.equals(this.b, qynVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
