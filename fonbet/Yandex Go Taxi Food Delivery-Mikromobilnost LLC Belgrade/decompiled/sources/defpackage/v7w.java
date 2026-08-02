package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class v7w {
    public final pju0 a;

    public v7w(pju0 pju0Var) {
        this.a = pju0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7w) && jl40.l(this.a, ((v7w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "IntentContext(storeContext=" + this.a + Extension.C_BRAKE;
    }
}
