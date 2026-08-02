package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class u711 implements w711 {
    public final bzy0 a;

    public u711(bzy0 bzy0Var) {
        this.a = bzy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u711) && jl40.l(this.a, ((u711) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenThreadVariants(state=" + this.a + Extension.C_BRAKE;
    }
}
