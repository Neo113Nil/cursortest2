package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class t4v {
    public final String a;
    public final Object b;

    public t4v(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4v)) {
            return false;
        }
        t4v t4vVar = (t4v) obj;
        return jl40.l(this.a, t4vVar.a) && jl40.l(this.b, t4vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IconMatch(key=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }
}
