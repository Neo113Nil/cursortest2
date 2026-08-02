package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes8.dex */
public final class rf20 implements lf20 {
    public final String a;
    public final eic0 b;
    public final pfe c;
    public final p151 d;
    public final List e;
    public final int f;

    public rf20(String str, eic0 eic0Var, pfe pfeVar, p151 p151Var, List list, int i) {
        this.a = str;
        this.b = eic0Var;
        this.c = pfeVar;
        this.d = p151Var;
        this.e = list;
        this.f = i;
    }

    @Override // defpackage.eg20
    public final boolean a(eg20 eg20Var) {
        if (!(eg20Var instanceof rf20)) {
            return false;
        }
        rf20 rf20Var = (rf20) eg20Var;
        List list = rf20Var.e;
        if (!jl40.l(this.d, rf20Var.d)) {
            return false;
        }
        List list2 = this.e;
        if (list2.size() != list.size()) {
            return false;
        }
        Iterable e = scc.e(list2);
        if (!(e instanceof Collection) || !((Collection) e).isEmpty()) {
            c6w it = e.iterator();
            while (it.c) {
                int nextInt = it.nextInt();
                if (!((eg20) list2.get(nextInt)).a((eg20) list.get(nextInt))) {
                    return false;
                }
            }
        }
        return this.f == rf20Var.f;
    }

    @Override // defpackage.lf20
    public final List b() {
        return this.e;
    }

    @Override // defpackage.eg20
    public final p151 c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf20)) {
            return false;
        }
        rf20 rf20Var = (rf20) obj;
        return jl40.l(this.a, rf20Var.a) && jl40.l(this.b, rf20Var.b) && jl40.l(this.c, rf20Var.c) && jl40.l(this.d, rf20Var.d) && jl40.l(this.e, rf20Var.e) && this.f == rf20Var.f;
    }

    @Override // defpackage.eg20
    public final eic0 getAction() {
        return this.b;
    }

    @Override // defpackage.eg20
    public final pfe getContentDescription() {
        return this.c;
    }

    @Override // defpackage.eg20
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eic0 eic0Var = this.b;
        return Integer.hashCode(this.f) + unr0.c((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (eic0Var == null ? 0 : eic0Var.hashCode())) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineGroupMicroWidgetModel(id=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(", widgetDisplaySettings=");
        sb.append(this.d);
        sb.append(", microWidgetModels=");
        sb.append(this.e);
        sb.append(", orientation=");
        return oyr.s(sb, this.f, ')');
    }
}
