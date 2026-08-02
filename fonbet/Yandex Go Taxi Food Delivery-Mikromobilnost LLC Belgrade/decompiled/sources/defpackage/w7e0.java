package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class w7e0 implements z7e0 {
    public final kbv a;
    public final boolean b;

    public w7e0(kbv kbvVar, boolean z) {
        this.a = kbvVar;
        this.b = z;
    }

    @Override // defpackage.z7e0
    public final tbv a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7e0)) {
            return false;
        }
        w7e0 w7e0Var = (w7e0) obj;
        return this.a.equals(w7e0Var.a) && this.b == w7e0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultImage(imageModel=" + this.a + ", isBig=" + this.b + Extension.C_BRAKE;
    }
}
