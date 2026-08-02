package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tjb0 {
    public final boolean a;
    public final nbv b;

    public tjb0(boolean z, nbv nbvVar) {
        this.a = z;
        this.b = nbvVar;
    }

    public final boolean a() {
        return this.a;
    }

    public final rbv b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjb0)) {
            return false;
        }
        tjb0 tjb0Var = (tjb0) obj;
        return this.a == tjb0Var.a && this.b.equals(tjb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Flash(enabled=" + this.a + ", image=" + this.b + Extension.C_BRAKE;
    }
}
