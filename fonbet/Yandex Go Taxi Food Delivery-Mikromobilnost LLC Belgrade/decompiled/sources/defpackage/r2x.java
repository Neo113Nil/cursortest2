package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.favorites.list.ViewType;

/* loaded from: classes5.dex */
public final class r2x extends w2x {
    public final String b;
    public final xss0 c;

    public r2x(xss0 xss0Var) {
        super(ViewType.INFO_RIDE);
        this.b = "Info";
        this.c = xss0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2x)) {
            return false;
        }
        r2x r2xVar = (r2x) obj;
        return jl40.l(this.b, r2xVar.b) && jl40.l(this.c, r2xVar.c);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "InfoRide(id=" + this.b + ", slot=" + this.c + Extension.C_BRAKE;
    }
}
