package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class vbt {
    public final String a;
    public final long b;

    public vbt(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbt)) {
            return false;
        }
        vbt vbtVar = (vbt) obj;
        return jl40.l(this.a, vbtVar.a) && this.b == vbtVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("Params(chatId=", this.a, ", timestamp=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
