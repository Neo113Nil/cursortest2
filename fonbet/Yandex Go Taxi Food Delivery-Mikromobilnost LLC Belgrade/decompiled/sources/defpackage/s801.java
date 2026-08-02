package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class s801 implements hmm {
    public final r901 a;

    public s801(r901 r901Var) {
        this.a = r901Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s801) && jl40.l(this.a, ((s801) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TrafficContent(state=" + this.a + Extension.C_BRAKE;
    }
}
