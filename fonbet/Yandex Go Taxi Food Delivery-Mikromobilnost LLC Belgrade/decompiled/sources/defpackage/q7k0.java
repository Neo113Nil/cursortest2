package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class q7k0 implements r7k0 {
    public final String a;

    public q7k0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7k0) && jl40.l(this.a, ((q7k0) obj).a);
    }

    @Override // defpackage.r7k0
    public final String getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Loading(text=", this.a, Extension.C_BRAKE);
    }
}
