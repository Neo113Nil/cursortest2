package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class v0a {
    public final String a;
    public final String b;
    public final List c;
    public final hwa d;

    public v0a(String str, String str2, List list, hwa hwaVar) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = hwaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0a)) {
            return false;
        }
        v0a v0aVar = (v0a) obj;
        return jl40.l(this.a, v0aVar.a) && jl40.l(this.b, v0aVar.b) && this.c.equals(v0aVar.c) && jl40.l(this.d, v0aVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int c = unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        hwa hwaVar = this.d;
        return c + (hwaVar != null ? hwaVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ChargersFinishInfo(title=", this.a, ", subtitle=", this.b, ", items=");
        v.append(this.c);
        v.append(", surgeModal=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
