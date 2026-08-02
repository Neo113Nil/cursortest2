package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class tu10 {
    public final String a;
    public final boolean b;
    public final int c;
    public final long d;
    public final String e;

    public tu10(int i, long j, String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = j;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu10)) {
            return false;
        }
        tu10 tu10Var = (tu10) obj;
        return this.a.equals(tu10Var.a) && this.b == tu10Var.b && this.c == tu10Var.c && this.d == tu10Var.d && jl40.l(this.e, tu10Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qv10.c(oyr.b(this.c, unr0.e(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder l = oo31.l("MessageMetaData(messageId=", this.a, ", persistSuggests=", ", position=", this.b);
        l.append(this.c);
        l.append(", timestamp=");
        l.append(this.d);
        return unr0.r(l, ", chatId=", this.e, Extension.C_BRAKE);
    }
}
