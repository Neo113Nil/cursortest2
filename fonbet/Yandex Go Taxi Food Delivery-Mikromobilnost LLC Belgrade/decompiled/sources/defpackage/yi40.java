package defpackage;

import com.yandex.mapkit.geometry.Subpolyline;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class yi40 implements hz30 {
    public final f5q0 a;
    public final Subpolyline b;
    public final double c;
    public final int d;

    public yi40(f5q0 f5q0Var, Subpolyline subpolyline, double d, int i) {
        this.a = f5q0Var;
        this.b = subpolyline;
        this.c = d;
        this.d = i;
    }

    @Override // defpackage.hz30
    public final int b() {
        return this.d;
    }

    @Override // defpackage.hz30
    public final Subpolyline c() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi40)) {
            return false;
        }
        yi40 yi40Var = (yi40) obj;
        return jl40.l(this.a, yi40Var.a) && jl40.l(this.b, yi40Var.b) && Double.compare(this.c, yi40Var.c) == 0 && this.d == yi40Var.d;
    }

    @Override // defpackage.hz30
    public final double getDuration() {
        return this.c;
    }

    public final int hashCode() {
        f5q0 f5q0Var = this.a;
        return Integer.hashCode(this.d) + unr0.a((this.b.hashCode() + ((f5q0Var == null ? 0 : f5q0Var.hashCode()) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "MtTransferSection(weight=" + this.a + ", subpolyline=" + this.b + ", duration=" + this.c + ", sectionId=" + this.d + Extension.C_BRAKE;
    }
}
