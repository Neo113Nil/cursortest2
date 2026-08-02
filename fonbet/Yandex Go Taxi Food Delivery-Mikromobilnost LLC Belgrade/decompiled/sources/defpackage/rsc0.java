package defpackage;

import com.yandex.plus.core.graphql.type.WIDGET_TYPE;
import java.util.List;

/* loaded from: classes8.dex */
public final class rsc0 {
    public final String a;
    public final lsc0 b;
    public final List c;
    public final osc0 d;
    public final msc0 e;
    public final WIDGET_TYPE f;
    public final qsc0 g;
    public final jsc0 h;
    public final ksc0 i;
    public final psc0 j;
    public final nsc0 k;

    public rsc0(String str, lsc0 lsc0Var, List list, osc0 osc0Var, msc0 msc0Var, WIDGET_TYPE widget_type, qsc0 qsc0Var, jsc0 jsc0Var, ksc0 ksc0Var, psc0 psc0Var, nsc0 nsc0Var) {
        this.a = str;
        this.b = lsc0Var;
        this.c = list;
        this.d = osc0Var;
        this.e = msc0Var;
        this.f = widget_type;
        this.g = qsc0Var;
        this.h = jsc0Var;
        this.i = ksc0Var;
        this.j = psc0Var;
        this.k = nsc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsc0)) {
            return false;
        }
        rsc0 rsc0Var = (rsc0) obj;
        return this.a.equals(rsc0Var.a) && jl40.l(this.b, rsc0Var.b) && jl40.l(this.c, rsc0Var.c) && jl40.l(this.d, rsc0Var.d) && this.e.equals(rsc0Var.e) && this.f == rsc0Var.f && jl40.l(this.g, rsc0Var.g) && jl40.l(this.h, rsc0Var.h) && jl40.l(this.i, rsc0Var.i) && jl40.l(this.j, rsc0Var.j) && jl40.l(this.k, rsc0Var.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        lsc0 lsc0Var = this.b;
        int hashCode2 = (hashCode + (lsc0Var == null ? 0 : lsc0Var.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        osc0 osc0Var = this.d;
        int hashCode4 = (this.f.hashCode() + ((this.e.hashCode() + ((hashCode3 + (osc0Var == null ? 0 : osc0Var.hashCode())) * 31)) * 31)) * 31;
        qsc0 qsc0Var = this.g;
        int hashCode5 = (hashCode4 + (qsc0Var == null ? 0 : qsc0Var.hashCode())) * 31;
        jsc0 jsc0Var = this.h;
        int hashCode6 = (hashCode5 + (jsc0Var == null ? 0 : jsc0Var.hashCode())) * 31;
        ksc0 ksc0Var = this.i;
        int hashCode7 = (hashCode6 + (ksc0Var == null ? 0 : ksc0Var.hashCode())) * 31;
        psc0 psc0Var = this.j;
        int hashCode8 = (hashCode7 + (psc0Var == null ? 0 : psc0Var.hashCode())) * 31;
        nsc0 nsc0Var = this.k;
        return hashCode8 + (nsc0Var != null ? nsc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlaqueWidget(widgetId=" + this.a + ", contentDescription=" + this.b + ", templates=" + this.c + ", strictAction=" + this.d + ", displayWidgetRules=" + this.e + ", type=" + this.f + ", textWidget=" + this.g + ", balanceWidget=" + this.h + ", buttonWidget=" + this.i + ", switchWidget=" + this.j + ", iconWidget=" + this.k + ')';
    }
}
