package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class t2c0 {
    public final String a;
    public final long b;

    public t2c0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2c0)) {
            return false;
        }
        t2c0 t2c0Var = (t2c0) obj;
        return jl40.l(this.a, t2c0Var.a) && this.b == t2c0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("PinnedChatsEntity(chatId=", this.a, ", chatsOrder=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
