package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class z66 implements a76 {
    public final int a;
    public final Set b;

    public z66(int i, Set set) {
        this.a = i;
        this.b = set;
    }

    @Override // defpackage.a76
    public final int a() {
        return this.a;
    }

    public final Set b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z66)) {
            return false;
        }
        z66 z66Var = (z66) obj;
        return this.a == z66Var.a && jl40.l(this.b, z66Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Uniform(radius=" + this.a + ", masks=" + this.b + Extension.C_BRAKE;
    }

    public z66() {
        this(0, EmptySet.a);
    }
}
