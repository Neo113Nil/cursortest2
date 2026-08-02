package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xoj0 implements zoj0 {
    public final efj0 a;

    public xoj0(efj0 efj0Var) {
        this.a = efj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xoj0) && this.a.equals(((xoj0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Counter(counterState=" + this.a + Extension.C_BRAKE;
    }
}
