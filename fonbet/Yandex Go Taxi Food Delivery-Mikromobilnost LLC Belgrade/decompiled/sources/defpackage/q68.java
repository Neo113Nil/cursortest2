package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class q68 {
    public final String a;
    public final s78 b;

    public q68(String str, s78 s78Var) {
        this.a = str;
        this.b = s78Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q68)) {
            return false;
        }
        q68 q68Var = (q68) obj;
        return jl40.l(this.a, q68Var.a) && this.b.equals(q68Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CarPlacementUiState(carImageUrl=" + this.a + ", position=" + this.b + Extension.C_BRAKE;
    }
}
