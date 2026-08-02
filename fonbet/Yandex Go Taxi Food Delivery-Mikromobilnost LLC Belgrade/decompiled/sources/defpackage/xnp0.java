package defpackage;

import java.util.Set;

/* loaded from: classes8.dex */
public final class xnp0 {
    public final Integer a;
    public final Integer b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Integer g;
    public final Integer h;
    public final Boolean i;

    public xnp0(Integer num, Integer num2, Set set, Set set2, Set set3, Set set4, Integer num3, Integer num4, Boolean bool) {
        this.a = num;
        this.b = num2;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = set4;
        this.g = num3;
        this.h = num4;
        this.i = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnp0)) {
            return false;
        }
        xnp0 xnp0Var = (xnp0) obj;
        return jl40.l(this.a, xnp0Var.a) && jl40.l(this.b, xnp0Var.b) && jl40.l(this.c, xnp0Var.c) && jl40.l(this.d, xnp0Var.d) && jl40.l(this.e, xnp0Var.e) && jl40.l(this.f, xnp0Var.f) && jl40.l(this.g, xnp0Var.g) && jl40.l(this.h, xnp0Var.h) && jl40.l(this.i, xnp0Var.i);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Set set = this.c;
        int hashCode3 = (hashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.d;
        int hashCode4 = (hashCode3 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.e;
        int hashCode5 = (hashCode4 + (set3 == null ? 0 : set3.hashCode())) * 31;
        Set set4 = this.f;
        int hashCode6 = (hashCode5 + (set4 == null ? 0 : set4.hashCode())) * 31;
        Integer num3 = this.g;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.i;
        return hashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkConfiguration(readyMessageTimeoutMillis=");
        sb.append(this.a);
        sb.append(", animationDurationMillis=");
        sb.append(this.b);
        sb.append(", hostsForOpenInSystem=");
        sb.append(this.c);
        sb.append(", allowedHosts=");
        sb.append(this.d);
        sb.append(", jsBridgeAllowedHosts=");
        sb.append(this.e);
        sb.append(", forbiddenHosts=");
        sb.append(this.f);
        sb.append(", webViewHideThreshold=");
        sb.append(this.g);
        sb.append(", webViewDownwardScrollFriction=");
        sb.append(this.h);
        sb.append(", isPanelDiagnosticEnabled=");
        return oo31.i(sb, this.i, ')');
    }
}
