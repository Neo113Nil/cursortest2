package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ylb implements zlb {
    public final String a;
    public final String b;

    public ylb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylb)) {
            return false;
        }
        ylb ylbVar = (ylb) obj;
        return jl40.l(this.a, ylbVar.a) && jl40.l(this.b, ylbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PollStatus(tripId=", this.a, ", orderId=", this.b, Extension.C_BRAKE);
    }
}
