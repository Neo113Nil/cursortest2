package defpackage;

/* loaded from: classes5.dex */
public final class y2h {
    public final String a;
    public final h7l0 b;
    public final h7l0 c;
    public final h7l0 d;
    public final h7l0 e;
    public final String f;

    public y2h(String str, h7l0 h7l0Var, h7l0 h7l0Var2, h7l0 h7l0Var3, h7l0 h7l0Var4, String str2) {
        this.a = str;
        this.b = h7l0Var;
        this.c = h7l0Var2;
        this.d = h7l0Var3;
        this.e = h7l0Var4;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2h)) {
            return false;
        }
        y2h y2hVar = (y2h) obj;
        return jl40.l(this.a, y2hVar.a) && jl40.l(this.b, y2hVar.b) && jl40.l(this.c, y2hVar.c) && jl40.l(this.d, y2hVar.d) && jl40.l(this.e, y2hVar.e) && jl40.l(this.f, y2hVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h7l0 h7l0Var = this.b;
        int hashCode2 = (hashCode + (h7l0Var == null ? 0 : h7l0Var.hashCode())) * 31;
        h7l0 h7l0Var2 = this.c;
        int hashCode3 = (hashCode2 + (h7l0Var2 == null ? 0 : h7l0Var2.hashCode())) * 31;
        h7l0 h7l0Var3 = this.d;
        int hashCode4 = (hashCode3 + (h7l0Var3 == null ? 0 : h7l0Var3.hashCode())) * 31;
        h7l0 h7l0Var4 = this.e;
        int hashCode5 = (hashCode4 + (h7l0Var4 == null ? 0 : h7l0Var4.hashCode())) * 31;
        return ((hashCode5 + (this.f != null ? r3.hashCode() : 0)) * 31) - 590988801;
    }

    public final String toString() {
        return "DeeplinkParams(mode=" + this.a + ", sourcePoint=" + this.b + ", destinationPoint=" + this.c + ", pickupSourcePoint=" + this.d + ", pickupDestinationPoint=" + this.e + ", clientState64=" + this.f + ", inputPoint=abandoned_cart_notification)";
    }
}
