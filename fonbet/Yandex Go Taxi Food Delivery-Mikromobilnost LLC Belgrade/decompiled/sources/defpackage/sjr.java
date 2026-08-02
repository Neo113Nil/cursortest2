package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class sjr {
    public final ArrayList a;
    public final long b;
    public final tjr c;

    public sjr(ArrayList arrayList, long j, tjr tjrVar) {
        this.a = arrayList;
        this.b = j;
        this.c = tjrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjr)) {
            return false;
        }
        sjr sjrVar = (sjr) obj;
        return this.a.equals(sjrVar.a) && this.b == sjrVar.b && this.c.equals(sjrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Metadata(tags=" + this.a + ", timestamp=" + this.b + ", sourceCodeInfo=" + this.c + Extension.C_BRAKE;
    }
}
