package defpackage;

/* loaded from: classes14.dex */
public final class ugw {
    public final tgw a;
    public final tgw b;

    public ugw(tgw tgwVar, tgw tgwVar2) {
        this.a = tgwVar;
        this.b = tgwVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugw)) {
            return false;
        }
        ugw ugwVar = (ugw) obj;
        return jl40.l(this.a, ugwVar.a) && jl40.l(this.b, ugwVar.b);
    }

    public final int hashCode() {
        tgw tgwVar = this.a;
        int hashCode = (tgwVar == null ? 0 : tgwVar.hashCode()) * 31;
        tgw tgwVar2 = this.b;
        return hashCode + (tgwVar2 != null ? tgwVar2.hashCode() : 0);
    }
}
