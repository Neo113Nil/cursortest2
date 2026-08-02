package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class sd00 {
    public final String a;
    public final LinkedHashMap b;

    public sd00(String str, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd00)) {
            return false;
        }
        sd00 sd00Var = (sd00) obj;
        return jl40.l(this.a, sd00Var.a) && this.b.equals(sd00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReportData(name=" + this.a + ", params=" + this.b + Extension.C_BRAKE;
    }
}
