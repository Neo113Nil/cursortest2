package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class r7r {
    public final String a;
    public final String b;
    public final s7r c;
    public final MapBuilder d;

    public r7r(String str, String str2, s7r s7rVar) {
        this.a = str;
        this.b = str2;
        this.c = s7rVar;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("title", str);
        mapBuilder.put("full_name", str2);
        mapBuilder.put("coordinate", s7rVar.c);
        this.d = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7r)) {
            return false;
        }
        r7r r7rVar = (r7r) obj;
        return jl40.l(this.a, r7rVar.a) && jl40.l(this.b, r7rVar.b) && this.c.equals(r7rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("Address(title=", this.a, ", fullName=", this.b, ", coordinate=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
