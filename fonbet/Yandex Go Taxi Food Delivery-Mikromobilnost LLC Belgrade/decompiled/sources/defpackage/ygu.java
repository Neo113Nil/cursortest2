package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ygu {
    public final String a;
    public final long b;

    public ygu(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygu)) {
            return false;
        }
        ygu yguVar = (ygu) obj;
        return jl40.l(this.a, yguVar.a) && this.b == yguVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("HiddenPrivateChatsEntity(userId=", this.a, ", hideTimestamp=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
