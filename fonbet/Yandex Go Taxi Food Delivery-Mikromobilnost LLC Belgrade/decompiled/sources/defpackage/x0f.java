package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class x0f {
    public final int a;
    public final String b;

    public x0f(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0f)) {
            return false;
        }
        x0f x0fVar = (x0f) obj;
        return this.a == x0fVar.a && jl40.l(this.b, x0fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.l(this.a, "CounterValue(duration=", ", label=", this.b, Extension.C_BRAKE);
    }
}
