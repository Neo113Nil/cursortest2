package app.cash.trifle;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Certificate {
    public final byte[] certificate;
    public final int version;

    public Certificate(byte[] bArr, int i) {
        bArr.getClass();
        this.certificate = bArr;
        this.version = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Certificate.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        Certificate certificate = (Certificate) obj;
        return Arrays.equals(this.certificate, certificate.certificate) && this.version == certificate.version;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.certificate) * 31) + this.version;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Certificate(certificate=");
        sb.append(Arrays.toString(this.certificate));
        sb.append(", version=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.version, ')');
    }
}
