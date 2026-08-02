package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class z8f0 {
    public final rr51 a;
    public final String b;

    public z8f0(rr51 rr51Var, String str) {
        this.a = rr51Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8f0)) {
            return false;
        }
        z8f0 z8f0Var = (z8f0) obj;
        return this.a.equals(z8f0Var.a) && jl40.l(this.b, z8f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProductScreenItemEntity(divData=" + this.a + ", itemType=" + this.b + Extension.C_BRAKE;
    }
}
