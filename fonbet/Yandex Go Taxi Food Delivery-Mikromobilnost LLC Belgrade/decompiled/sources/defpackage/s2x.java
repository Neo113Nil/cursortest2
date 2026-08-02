package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.favorites.list.ViewType;

/* loaded from: classes5.dex */
public final class s2x extends w2x {
    public final String b;
    public final xss0 c;

    public s2x(String str, xss0 xss0Var) {
        super(ViewType.SAVED_RIDE);
        this.b = str;
        this.c = xss0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2x)) {
            return false;
        }
        s2x s2xVar = (s2x) obj;
        return jl40.l(this.b, s2xVar.b) && jl40.l(this.c, s2xVar.c);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "SavedRide(id=" + this.b + ", slot=" + this.c + Extension.C_BRAKE;
    }
}
