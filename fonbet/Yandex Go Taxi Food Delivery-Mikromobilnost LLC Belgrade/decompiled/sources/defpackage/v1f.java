package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v1f {
    public final String a;
    public final gzv b;

    public v1f(String str, gzv gzvVar) {
        this.a = str;
        this.b = gzvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1f)) {
            return false;
        }
        v1f v1fVar = (v1f) obj;
        return this.a.equals(v1fVar.a) && jl40.l(this.b, v1fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InputField(label=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }
}
