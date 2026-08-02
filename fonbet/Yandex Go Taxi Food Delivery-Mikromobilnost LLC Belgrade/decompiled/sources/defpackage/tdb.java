package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class tdb {
    public final String a;
    public final long b;
    public final int c;

    public tdb(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdb)) {
            return false;
        }
        tdb tdbVar = (tdb) obj;
        return jl40.l(this.a, tdbVar.a) && this.b == tdbVar.b && this.c == tdbVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b64.q(x4e.l("FlagsWithUnseenCount(chatId=", this.a, ", flags=", this.b), ", unseenCount=", this.c, Extension.C_BRAKE);
    }
}
