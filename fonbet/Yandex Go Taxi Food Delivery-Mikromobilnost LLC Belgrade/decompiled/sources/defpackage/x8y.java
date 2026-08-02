package defpackage;

import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x8y {
    public final String a;
    public final String b;
    public final b c;

    public x8y(String str, String str2, b bVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8y)) {
            return false;
        }
        x8y x8yVar = (x8y) obj;
        return jl40.l(this.a, x8yVar.a) && jl40.l(this.b, x8yVar.b) && jl40.l(this.c, x8yVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        b bVar = this.c;
        return b + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("Mode(id=", this.a, ", title=", this.b, ", layersAdditionalState=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
