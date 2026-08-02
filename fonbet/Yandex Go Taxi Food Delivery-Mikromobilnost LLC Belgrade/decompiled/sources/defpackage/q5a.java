package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class q5a implements s5a {
    public final String a;
    public final CharSequence b;
    public final boolean c;

    public q5a(boolean z, CharSequence charSequence, String str) {
        this.a = str;
        this.b = charSequence;
        this.c = z;
    }

    @Override // defpackage.s5a
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5a)) {
            return false;
        }
        q5a q5aVar = (q5a) obj;
        return jl40.l(this.a, q5aVar.a) && jl40.l(this.b, q5aVar.b) && this.c == q5aVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(ly3.t(this.b, "InProgress(orderId=", this.a, ", label=", ", showSeparator="), this.c, Extension.C_BRAKE);
    }
}
