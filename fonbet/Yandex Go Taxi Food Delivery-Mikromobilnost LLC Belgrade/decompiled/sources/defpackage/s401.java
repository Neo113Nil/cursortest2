package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class s401 implements t401 {
    public final r401 a;
    public final List b;

    public s401(r401 r401Var, List list) {
        this.a = r401Var;
        this.b = list;
    }

    public final r401 a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s401)) {
            return false;
        }
        s401 s401Var = (s401) obj;
        return jl40.l(this.a, s401Var.a) && jl40.l(this.b, s401Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Timeline(currentStatus=" + this.a + ", outlines=" + this.b + Extension.C_BRAKE;
    }
}
