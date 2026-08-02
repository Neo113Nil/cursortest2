package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class x7u {
    public final String a;
    public final int b;

    public x7u(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7u)) {
            return false;
        }
        x7u x7uVar = (x7u) obj;
        return jl40.l(this.a, x7uVar.a) && this.b == x7uVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "OrderEntry(status=", this.a, ", count=", Extension.C_BRAKE);
    }
}
