package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class qzd {
    public final String a;
    public final ArrayList b;
    public final kzd c;

    public qzd(String str, ArrayList arrayList, kzd kzdVar) {
        this.a = str;
        this.b = arrayList;
        this.c = kzdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzd)) {
            return false;
        }
        qzd qzdVar = (qzd) obj;
        return jl40.l(this.a, qzdVar.a) && this.b.equals(qzdVar.b) && this.c.equals(qzdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = x4e.m("Config(id=", this.a, ", steps=", ", localizations=", this.b);
        m.append(this.c);
        m.append(Extension.C_BRAKE);
        return m.toString();
    }
}
