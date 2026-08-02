package defpackage;

import com.yandex.go.navigator.utils.LineSide;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zts {
    public final String a;
    public final String b;
    public final boolean c;
    public final LineSide d;

    public zts(String str, String str2, boolean z, LineSide lineSide) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = lineSide;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zts)) {
            return false;
        }
        zts ztsVar = (zts) obj;
        return this.a.equals(ztsVar.a) && this.b.equals(ztsVar.b) && this.c == ztsVar.c && this.d == ztsVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("GasStationsConfig(queryText=", this.a, ", buttonText=", this.b, ", enabled=");
        v.append(this.c);
        v.append(", supportedRouteSide=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
