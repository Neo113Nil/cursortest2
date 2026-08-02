package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uhk0 {
    public final boolean a;
    public final boolean b;

    public uhk0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhk0)) {
            return false;
        }
        uhk0 uhk0Var = (uhk0) obj;
        return this.a == uhk0Var.a && this.b == uhk0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("TransitionResult(expanded=", ", transparent=", Extension.C_BRAKE, this.a, this.b);
    }
}
