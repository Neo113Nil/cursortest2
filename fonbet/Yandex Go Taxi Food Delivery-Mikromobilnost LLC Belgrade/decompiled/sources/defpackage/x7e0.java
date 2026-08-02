package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class x7e0 implements z7e0 {
    public final kbv a;
    public final kbv b;

    public x7e0(kbv kbvVar, kbv kbvVar2) {
        this.a = kbvVar;
        this.b = kbvVar2;
    }

    @Override // defpackage.z7e0
    public final tbv a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7e0)) {
            return false;
        }
        x7e0 x7e0Var = (x7e0) obj;
        return this.a.equals(x7e0Var.a) && this.b.equals(x7e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DriverAvatar(imageModel=" + this.a + ", badgeImageModel=" + this.b + Extension.C_BRAKE;
    }
}
