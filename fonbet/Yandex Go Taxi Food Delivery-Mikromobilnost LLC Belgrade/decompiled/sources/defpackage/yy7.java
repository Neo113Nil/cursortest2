package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yy7 {
    public final String a;

    public yy7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy7) || !jl40.l(this.a, ((yy7) obj).a)) {
            return false;
        }
        uy7 uy7Var = uy7.a;
        return uy7Var.equals(uy7Var);
    }

    public final int hashCode() {
        return ((this.a == null ? 0 : r1.hashCode()) * 31) - 1793758178;
    }

    public final String toString() {
        return "DoneButton(title=" + this.a + ", action=" + uy7.a + Extension.C_BRAKE;
    }
}
