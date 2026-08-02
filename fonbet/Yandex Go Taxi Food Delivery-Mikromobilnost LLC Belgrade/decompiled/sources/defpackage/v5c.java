package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class v5c {
    public final String a;
    public final String b;

    public v5c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5c)) {
            return false;
        }
        v5c v5cVar = (v5c) obj;
        return jl40.l(this.a, v5cVar.a) && jl40.l(this.b, v5cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ClosedOrder(service=", this.a, ", orderId=", this.b, Extension.C_BRAKE);
    }
}
