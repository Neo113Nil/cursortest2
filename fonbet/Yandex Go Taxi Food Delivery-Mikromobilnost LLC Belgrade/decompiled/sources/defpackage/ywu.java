package defpackage;

import java.io.ByteArrayInputStream;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ywu {
    public final int a;
    public final Map b;
    public final String c;
    public final String d;
    public final ByteArrayInputStream e;

    public ywu(int i, Map map, String str, String str2, ByteArrayInputStream byteArrayInputStream) {
        this.a = i;
        this.b = map;
        this.c = str;
        this.d = str2;
        this.e = byteArrayInputStream;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywu)) {
            return false;
        }
        ywu ywuVar = (ywu) obj;
        return this.a == ywuVar.a && this.b.equals(ywuVar.b) && this.c.equals(ywuVar.c) && this.d.equals(ywuVar.d) && this.e.equals(ywuVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpsResponse(responseCode=");
        sb.append(this.a);
        sb.append(", headers=");
        sb.append(this.b);
        sb.append(", contentType=");
        g8e.D(sb, this.c, ", contentEncoding=", this.d, ", inputStream=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
