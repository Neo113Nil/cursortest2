package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class tcz0 {
    public final String a;
    public final String b;
    public final long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public Long i;
    public Long j;
    public Long k;
    public Long l;

    public tcz0(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcz0)) {
            return false;
        }
        tcz0 tcz0Var = (tcz0) obj;
        return this.a.equals(tcz0Var.a) && this.b.equals(tcz0Var.b) && this.c == tcz0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.n(this.c, Extension.C_BRAKE, b64.v("PendingData(requestId=", this.a, ", source=", this.b, ", userActionTime="));
    }
}
