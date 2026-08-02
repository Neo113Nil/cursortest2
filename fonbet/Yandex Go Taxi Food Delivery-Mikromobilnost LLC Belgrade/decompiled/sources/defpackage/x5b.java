package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class x5b {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Long d;

    public x5b(String str, boolean z, boolean z2, Long l) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5b)) {
            return false;
        }
        x5b x5bVar = (x5b) obj;
        return jl40.l(this.a, x5bVar.a) && this.b == x5bVar.b && this.c == x5bVar.c && jl40.l(this.d, x5bVar.d);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        return e + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder l = oo31.l("ChatMutingsEntity(chatId=", this.a, ", isMute=", ", isMuteMentions=", this.b);
        l.append(this.c);
        l.append(", version=");
        l.append(this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
