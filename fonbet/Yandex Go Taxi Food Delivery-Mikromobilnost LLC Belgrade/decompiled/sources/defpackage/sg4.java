package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sg4 implements xg4 {
    public final lvi0 a;
    public final Float b;
    public final nhe c;

    public sg4(lvi0 lvi0Var, Float f, nhe nheVar) {
        this.a = lvi0Var;
        this.b = f;
        this.c = nheVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg4)) {
            return false;
        }
        sg4 sg4Var = (sg4) obj;
        return this.a.equals(sg4Var.a) && jl40.l(this.b, sg4Var.b) && this.c.equals(sg4Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        return this.c.hashCode() + ((hashCode + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        return "ImageBackground(image=" + this.a + ", alpha=" + this.b + ", scaleType=" + this.c + Extension.C_BRAKE;
    }
}
