package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vy7 implements wy7 {
    public final int a;
    public final String b;

    public vy7(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy7)) {
            return false;
        }
        vy7 vy7Var = (vy7) obj;
        return this.a == vy7Var.a && jl40.l(this.b, vy7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.l(this.a, "RatingSelected(rating=", ", groupId=", this.b, Extension.C_BRAKE);
    }
}
