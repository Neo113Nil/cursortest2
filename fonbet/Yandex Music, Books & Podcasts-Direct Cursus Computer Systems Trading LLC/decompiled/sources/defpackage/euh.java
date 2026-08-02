package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public final class euh {
    public final String a;
    public final String b;
    public final Set c;

    public euh(String str, String str2, Set set) {
        this.a = str;
        this.b = str2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euh)) {
            return false;
        }
        euh euhVar = (euh) obj;
        return this.a.equals(euhVar.a) && this.b.equals(euhVar.b) && this.c.equals(euhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = f1d.m("KnownCallerInfo(name=", this.a, ", packageName=", this.b, ", signatures=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
