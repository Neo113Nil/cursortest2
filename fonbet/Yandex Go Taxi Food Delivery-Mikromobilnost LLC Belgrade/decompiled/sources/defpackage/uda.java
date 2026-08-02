package defpackage;

import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uda {
    public final String a;
    public final String b;
    public final b c;

    public uda(String str, String str2, b bVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uda)) {
            return false;
        }
        uda udaVar = (uda) obj;
        return jl40.l(this.a, udaVar.a) && jl40.l(this.b, udaVar.b) && jl40.l(this.c, udaVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        b bVar = this.c;
        return b + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("ChargersOrderTabMode(id=", this.a, ", title=", this.b, ", layersAdditionalState=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
