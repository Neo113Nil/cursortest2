package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.favorites.list.ViewType;

/* loaded from: classes5.dex */
public final class v2x extends w2x {
    public final String b;
    public final xss0 c;

    public v2x(String str, xss0 xss0Var) {
        super(ViewType.SUGGESTED_RIDE);
        this.b = str;
        this.c = xss0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2x)) {
            return false;
        }
        v2x v2xVar = (v2x) obj;
        return jl40.l(this.b, v2xVar.b) && jl40.l(this.c, v2xVar.c);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "SuggestedRide(id=" + this.b + ", slot=" + this.c + Extension.C_BRAKE;
    }
}
