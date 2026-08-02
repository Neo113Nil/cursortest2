package defpackage;

import com.yandex.go.navigator.order.NavigationOrder$NavigationType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class qg50 implements w201 {
    public final String a;
    public final i501 b;
    public final String c;
    public final String d;
    public final pg50 e;
    public final NavigationOrder$NavigationType f;

    public qg50(String str, i501 i501Var, String str2, String str3, pg50 pg50Var, NavigationOrder$NavigationType navigationOrder$NavigationType) {
        this.a = str;
        this.b = i501Var;
        this.c = str2;
        this.d = str3;
        this.e = pg50Var;
        this.f = navigationOrder$NavigationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg50)) {
            return false;
        }
        qg50 qg50Var = (qg50) obj;
        return jl40.l(this.a, qg50Var.a) && jl40.l(this.b, qg50Var.b) && jl40.l(this.c, qg50Var.c) && jl40.l(this.d, qg50Var.d) && jl40.l(this.e, qg50Var.e) && this.f == qg50Var.f;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31);
    }

    @Override // defpackage.w201
    public final i501 q() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigatorTracking(id=");
        sb.append(this.a);
        sb.append(", cardSwipeBehaviour=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", subtitle=", this.d, ", logo=");
        sb.append(this.e);
        sb.append(", navigationType=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
