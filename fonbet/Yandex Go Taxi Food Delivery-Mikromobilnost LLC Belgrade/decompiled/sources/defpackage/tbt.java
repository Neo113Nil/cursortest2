package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class tbt {
    public final String a;
    public final long b;
    public final String c;
    public final Long d;
    public final int e;

    public tbt(int i, long j, Long l, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = l;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbt)) {
            return false;
        }
        tbt tbtVar = (tbt) obj;
        return jl40.l(this.a, tbtVar.a) && this.b == tbtVar.b && jl40.l(this.c, tbtVar.c) && jl40.l(this.d, tbtVar.d) && this.e == tbtVar.e;
    }

    public final int hashCode() {
        int c = qv10.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.d;
        return Integer.hashCode(this.e) + ((hashCode + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("Params(chatId=", this.a, ", messageTimestamp=", this.b);
        l.append(", originalMessageChatId=");
        l.append(this.c);
        l.append(", originalMessageTimestamp=");
        l.append(this.d);
        return b64.q(l, ", limit=", this.e, Extension.C_BRAKE);
    }
}
