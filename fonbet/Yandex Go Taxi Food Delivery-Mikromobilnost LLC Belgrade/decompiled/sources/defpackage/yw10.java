package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class yw10 {
    public final Long a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public yw10(Long l, long j, long j2, long j3, String str, String str2, String str3, String str4) {
        this.a = l;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw10)) {
            return false;
        }
        yw10 yw10Var = (yw10) obj;
        return jl40.l(this.a, yw10Var.a) && this.b == yw10Var.b && this.c == yw10Var.c && this.d == yw10Var.d && jl40.l(this.e, yw10Var.e) && jl40.l(this.f, yw10Var.f) && jl40.l(this.g, yw10Var.g) && jl40.l(this.h, yw10Var.h);
    }

    public final int hashCode() {
        Long l = this.a;
        int b = unr0.b(unr0.b(unr0.b(qv10.c(qv10.c(qv10.c((l == null ? 0 : l.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageTranslationsEntity(rowId=");
        sb.append(this.a);
        sb.append(", chatInternalId=");
        sb.append(this.b);
        x4e.A(this.c, ", messageHistoryId=", ", version=", sb);
        uw51.v(this.d, ", originalLang=", this.e, sb);
        g8e.D(sb, ", translatedLang=", this.f, ", translatedText=", this.g);
        return unr0.r(sb, ", translatedSuggests=", this.h, Extension.C_BRAKE);
    }
}
