package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes5.dex */
public final class u3z0 extends w3z0 {
    public final String a;
    public final boolean b;
    public final BannerWidgets.NamedActionType c;
    public final List d;

    public u3z0(String str, boolean z, BannerWidgets.NamedActionType namedActionType, List list) {
        this.a = str;
        this.b = z;
        this.c = namedActionType;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3z0)) {
            return false;
        }
        u3z0 u3z0Var = (u3z0) obj;
        return this.a.equals(u3z0Var.a) && this.b == u3z0Var.b && this.c == u3z0Var.c && jl40.l(this.d, u3z0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder l = oo31.l("Named(title=", this.a, ", enabled=", ", name=", this.b);
        l.append(this.c);
        l.append(", extraActions=");
        l.append(this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
