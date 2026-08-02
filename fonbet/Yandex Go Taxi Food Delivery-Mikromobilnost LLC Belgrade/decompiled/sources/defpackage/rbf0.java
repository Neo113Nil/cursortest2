package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rbf0 {
    public final float a;
    public final float b;
    public final qbf0 c;
    public final ArrayList d;
    public final Long e;
    public final pbf0 f;

    public rbf0(float f, float f2, qbf0 qbf0Var, ArrayList arrayList, Long l, pbf0 pbf0Var) {
        this.a = f;
        this.b = f2;
        this.c = qbf0Var;
        this.d = arrayList;
        this.e = l;
        this.f = pbf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbf0)) {
            return false;
        }
        rbf0 rbf0Var = (rbf0) obj;
        return Float.compare(this.a, rbf0Var.a) == 0 && Float.compare(this.b, rbf0Var.b) == 0 && this.c.equals(rbf0Var.c) && this.d.equals(rbf0Var.d) && jl40.l(this.e, rbf0Var.e) && this.f.equals(rbf0Var.f);
    }

    public final int hashCode() {
        int b = ly3.b((this.c.hashCode() + g8e.c(this.b, Float.hashCode(this.a) * 31, 31)) * 31, 31, this.d);
        Long l = this.e;
        return this.f.hashCode() + ((b + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder k = oo31.k("State(blurRadius=", this.a, ", translationYFraction=", this.b, ", mainGradient=");
        k.append(this.c);
        k.append(", overlayGradients=");
        k.append(this.d);
        k.append(", animationDurationMs=");
        k.append(this.e);
        k.append(", fallbackGradientImage=");
        k.append(this.f);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
