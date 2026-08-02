package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes8.dex */
public final class yhc0 {
    public final String a;
    public final int b;
    public final ArrayList c;
    public final qhc0 d;
    public final ohc0 e;
    public final shc0 f;
    public final whc0 g;
    public final thc0 h;
    public final vhc0 i;
    public final String j;
    public final uhc0 k;
    public final Map l;

    public yhc0(String str, int i, ArrayList arrayList, qhc0 qhc0Var, ohc0 ohc0Var, shc0 shc0Var, whc0 whc0Var, thc0 thc0Var, vhc0 vhc0Var, String str2, uhc0 uhc0Var, Map map) {
        this.a = str;
        this.b = i;
        this.c = arrayList;
        this.d = qhc0Var;
        this.e = ohc0Var;
        this.f = shc0Var;
        this.g = whc0Var;
        this.h = thc0Var;
        this.i = vhc0Var;
        this.j = str2;
        this.k = uhc0Var;
        this.l = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhc0)) {
            return false;
        }
        yhc0 yhc0Var = (yhc0) obj;
        return this.a.equals(yhc0Var.a) && this.b == yhc0Var.b && this.c.equals(yhc0Var.c) && jl40.l(this.d, yhc0Var.d) && this.e.equals(yhc0Var.e) && this.f.equals(yhc0Var.f) && jl40.l(this.g, yhc0Var.g) && jl40.l(this.h, yhc0Var.h) && jl40.l(this.i, yhc0Var.i) && jl40.l(this.j, yhc0Var.j) && jl40.l(this.k, yhc0Var.k) && this.l.equals(yhc0Var.l);
    }

    public final int hashCode() {
        int b = ly3.b(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        qhc0 qhc0Var = this.d;
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((b + (qhc0Var == null ? 0 : qhc0Var.hashCode())) * 31)) * 31)) * 31;
        whc0 whc0Var = this.g;
        int hashCode2 = (hashCode + (whc0Var == null ? 0 : whc0Var.hashCode())) * 31;
        thc0 thc0Var = this.h;
        int hashCode3 = (hashCode2 + (thc0Var == null ? 0 : thc0Var.hashCode())) * 31;
        vhc0 vhc0Var = this.i;
        int hashCode4 = (hashCode3 + (vhc0Var == null ? 0 : vhc0Var.hashCode())) * 31;
        String str = this.j;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        uhc0 uhc0Var = this.k;
        return this.l.hashCode() + ((hashCode5 + (uhc0Var != null ? uhc0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Plaque(plaqueId=");
        sb.append(this.a);
        sb.append(", priority=");
        sb.append(this.b);
        sb.append(", widgetsLevelIds=");
        sb.append(this.c);
        sb.append(", contentDescription=");
        sb.append(this.d);
        sb.append(", condition=");
        sb.append(this.e);
        sb.append(", displayRules=");
        sb.append(this.f);
        sb.append(", strictAction=");
        sb.append(this.g);
        sb.append(", metricContext=");
        sb.append(this.h);
        sb.append(", params=");
        sb.append(this.i);
        sb.append(", seenContext=");
        sb.append(this.j);
        sb.append(", notification=");
        sb.append(this.k);
        sb.append(", serviceMeta=");
        return smw0.n(sb, this.l, ')');
    }
}
