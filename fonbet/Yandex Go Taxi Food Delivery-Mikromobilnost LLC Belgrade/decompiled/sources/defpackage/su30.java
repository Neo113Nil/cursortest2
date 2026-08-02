package defpackage;

import com.yandex.mapkit.geometry.Polyline;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class su30 {
    public final List a;
    public final Polyline b;
    public final vi30 c;
    public final vi30 d;
    public final String e;
    public final gv30 f;
    public final ubo g;

    public su30(List list, Polyline polyline, vi30 vi30Var, vi30 vi30Var2, String str, gv30 gv30Var, ubo uboVar) {
        this.a = list;
        this.b = polyline;
        this.c = vi30Var;
        this.d = vi30Var2;
        this.e = str;
        this.f = gv30Var;
        this.g = uboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su30)) {
            return false;
        }
        su30 su30Var = (su30) obj;
        return this.a.equals(su30Var.a) && jl40.l(this.b, su30Var.b) && this.c.equals(su30Var.c) && this.d.equals(su30Var.d) && jl40.l(this.e, su30Var.e) && this.f.equals(su30Var.f) && this.g.equals(su30Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "MtRoute(sections=" + this.a + ", polyline=" + this.b + ", duration=" + this.c + ", walkDuration=" + this.d + ", id=" + this.e + ", estimation=" + this.f + ", essentialPoints=" + this.g + Extension.C_BRAKE;
    }
}
