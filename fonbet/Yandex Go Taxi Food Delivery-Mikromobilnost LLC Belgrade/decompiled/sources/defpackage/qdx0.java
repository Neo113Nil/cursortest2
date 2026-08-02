package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qdx0 {
    public final CharSequence a;
    public final boolean b;
    public final boolean c;

    public qdx0(CharSequence charSequence, boolean z, boolean z2) {
        this.a = charSequence;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdx0)) {
            return false;
        }
        qdx0 qdx0Var = (qdx0) obj;
        return this.a.equals(qdx0Var.a) && this.b == qdx0Var.b && this.c == qdx0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffCardTrailState(price=");
        sb.append((Object) this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
