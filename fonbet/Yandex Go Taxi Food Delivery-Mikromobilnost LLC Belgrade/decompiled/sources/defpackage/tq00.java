package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tq00 {
    public final f5v a;
    public final boolean b;
    public final sbv c;

    public tq00(f5v f5vVar, boolean z, sbv sbvVar) {
        this.a = f5vVar;
        this.b = z;
        this.c = sbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq00)) {
            return false;
        }
        tq00 tq00Var = (tq00) obj;
        return this.a.equals(tq00Var.a) && this.b == tq00Var.b && this.c.equals(tq00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "MapPinModel(iconSpot=" + this.a + ", hasBubbleArrow=" + this.b + ", routePointIcon=" + this.c + Extension.C_BRAKE;
    }
}
