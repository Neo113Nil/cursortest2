package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class v9s {
    public final long a;
    public final String b;
    public final long c;

    public v9s(long j, long j2, String str) {
        this.a = j;
        this.b = str;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9s)) {
            return false;
        }
        v9s v9sVar = (v9s) obj;
        return this.a == v9sVar.a && jl40.l(this.b, v9sVar.b) && this.c == v9sVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + unr0.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return g8e.l(this.c, ", originalTimestamp=", Extension.C_BRAKE, x4e.k("ForwardMessageKey(timestamp=", this.a, ", originalChatId=", this.b));
    }
}
