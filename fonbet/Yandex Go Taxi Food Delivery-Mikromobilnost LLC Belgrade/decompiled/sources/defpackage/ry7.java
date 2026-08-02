package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ry7 implements wy7 {
    public final String a;
    public final String b;

    public ry7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry7)) {
            return false;
        }
        ry7 ry7Var = (ry7) obj;
        return jl40.l(this.a, ry7Var.a) && jl40.l(this.b, ry7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CancelReasonClicked(cancelReasonId=", this.a, ", groupId=", this.b, Extension.C_BRAKE);
    }
}
