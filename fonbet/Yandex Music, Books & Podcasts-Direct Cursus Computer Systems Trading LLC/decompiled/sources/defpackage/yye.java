package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class yye {
    public final q6w a;
    public final byte[] b;
    public final p0c c;
    public final boolean d;

    public yye(q6w q6wVar, byte[] bArr, p0c p0cVar, boolean z) {
        bArr.getClass();
        this.a = q6wVar;
        this.b = bArr;
        this.c = p0cVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yye.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        yye yyeVar = (yye) obj;
        return Objects.equals(this.a, yyeVar.a) && Arrays.equals(this.b, yyeVar.b) && Objects.equals(this.c, yyeVar.c) && this.d == yyeVar.d;
    }

    public final int hashCode() {
        q6w q6wVar = this.a;
        int hashCode = (Arrays.hashCode(this.b) + ((q6wVar != null ? q6wVar.hashCode() : 0) * 31)) * 31;
        p0c p0cVar = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (p0cVar != null ? p0cVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IssuerInformation(name=");
        sb.append(this.a);
        sb.append(", keyHash=");
        sb.append(Arrays.toString(this.b));
        sb.append(", x509authorityKeyIdentifier=");
        sb.append(this.c);
        sb.append(", issuedByPreCertificateSigningCert=");
        return dfi.j(sb, this.d, ')');
    }
}
