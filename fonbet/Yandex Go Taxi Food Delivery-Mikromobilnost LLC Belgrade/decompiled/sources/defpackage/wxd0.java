package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class wxd0 {
    public final String a;
    public final long b;
    public final boolean c;

    public wxd0(String str, long j, boolean z) {
        this.a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxd0)) {
            return false;
        }
        wxd0 wxd0Var = (wxd0) obj;
        return jl40.l(this.a, wxd0Var.a) && this.b == wxd0Var.b && this.c == wxd0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xra1.a(x4e.l("PendingVoteState(chatId=", this.a, ", timestamp=", this.b), ", isPending=", this.c, Extension.C_BRAKE);
    }
}
