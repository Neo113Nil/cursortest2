package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class xsc0 {
    public final String a;
    public final ArrayList b;
    public final usc0 c;
    public final wsc0 d;
    public final vsc0 e;
    public final tsc0 f;

    public xsc0(String str, ArrayList arrayList, usc0 usc0Var, wsc0 wsc0Var, vsc0 vsc0Var, tsc0 tsc0Var) {
        this.a = str;
        this.b = arrayList;
        this.c = usc0Var;
        this.d = wsc0Var;
        this.e = vsc0Var;
        this.f = tsc0Var;
    }

    public final tsc0 a() {
        return this.f;
    }

    public final usc0 b() {
        return this.c;
    }

    public final vsc0 c() {
        return this.e;
    }

    public final wsc0 d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsc0)) {
            return false;
        }
        xsc0 xsc0Var = (xsc0) obj;
        return this.a.equals(xsc0Var.a) && this.b.equals(xsc0Var.b) && this.c.equals(xsc0Var.c) && this.d.equals(xsc0Var.d) && jl40.l(this.e, xsc0Var.e) && jl40.l(this.f, xsc0Var.f);
    }

    public final List f() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        vsc0 vsc0Var = this.e;
        int hashCode2 = (hashCode + (vsc0Var == null ? 0 : vsc0Var.hashCode())) * 31;
        tsc0 tsc0Var = this.f;
        return hashCode2 + (tsc0Var != null ? tsc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlaqueWidgetGroup(widgetGroupId=" + this.a + ", widgets=" + this.b + ", groupDisplayRules=" + this.c + ", typedProperties=" + this.d + ", strictAction=" + this.e + ", contentDescription=" + this.f + ')';
    }
}
