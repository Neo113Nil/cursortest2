package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q9j extends gf91 {
    public final j5x0 p;
    public final ArrayList q;
    public final boolean r;
    public final YbButtonView.a s;
    public final YbButtonView.a t;
    public final String u;

    public q9j(j5x0 j5x0Var, ArrayList arrayList, boolean z, YbButtonView.a aVar, YbButtonView.a aVar2, String str) {
        this.p = j5x0Var;
        this.q = arrayList;
        this.r = z;
        this.s = aVar;
        this.t = aVar2;
        this.u = str;
    }

    public final String d() {
        return this.u;
    }

    public final List e() {
        return this.q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9j)) {
            return false;
        }
        q9j q9jVar = (q9j) obj;
        return jl40.l(this.p, q9jVar.p) && this.q.equals(q9jVar.q) && this.r == q9jVar.r && jl40.l(this.s, q9jVar.s) && jl40.l(this.t, q9jVar.t) && jl40.l(this.u, q9jVar.u);
    }

    public final YbButtonView.a f() {
        return this.t;
    }

    public final YbButtonView.a g() {
        return this.s;
    }

    public final j5x0 h() {
        return this.p;
    }

    public final int hashCode() {
        j5x0 j5x0Var = this.p;
        int e = unr0.e(ly3.b((j5x0Var == null ? 0 : j5x0Var.hashCode()) * 31, 31, this.q), 31, this.r);
        YbButtonView.a aVar = this.s;
        int hashCode = (e + (aVar == null ? 0 : aVar.hashCode())) * 31;
        YbButtonView.a aVar2 = this.t;
        int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.u;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Promo(tabs=" + this.p + ", infoPoints=" + this.q + ", activationInProgress=" + this.r + ", secondaryButton=" + this.s + ", primaryButton=" + this.t + ", agreement=" + this.u + Extension.C_BRAKE;
    }
}
