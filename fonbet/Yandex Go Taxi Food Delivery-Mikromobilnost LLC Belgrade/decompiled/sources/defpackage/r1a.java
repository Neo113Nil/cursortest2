package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class r1a implements t1a {
    public final cy9 a;

    public r1a(cy9 cy9Var) {
        this.a = cy9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1a) && this.a.equals(((r1a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ly3.m("PreFinishError(chargersErrorDetails=", this.a, Extension.C_BRAKE);
    }
}
