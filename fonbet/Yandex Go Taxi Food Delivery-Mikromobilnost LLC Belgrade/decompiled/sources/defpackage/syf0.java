package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class syf0 {
    public final String a;
    public final long b;

    public syf0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syf0)) {
            return false;
        }
        syf0 syf0Var = (syf0) obj;
        return jl40.l(this.a, syf0Var.a) && this.b == syf0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("MsgKey(chatId=", this.a, ", timestamp=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
