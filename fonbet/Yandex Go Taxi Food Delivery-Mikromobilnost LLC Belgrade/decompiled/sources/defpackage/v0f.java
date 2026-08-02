package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class v0f {
    public final String a;
    public final boolean b;
    public final boolean c;

    public v0f(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0f)) {
            return false;
        }
        v0f v0fVar = (v0f) obj;
        return jl40.l(this.a, v0fVar.a) && this.b == v0fVar.b && this.c == v0fVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(oo31.l("CounterState(text=", this.a, ", incrementIsEnabled=", ", decrementIsEnabled=", this.b), this.c, Extension.C_BRAKE);
    }
}
