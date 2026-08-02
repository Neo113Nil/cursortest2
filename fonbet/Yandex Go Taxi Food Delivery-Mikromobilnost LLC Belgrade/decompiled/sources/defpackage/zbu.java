package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zbu extends n351 {
    public final wsy0 c;
    public final wsy0 d;
    public final v4v e;
    public final ome f;
    public final boolean g;
    public final boolean h;

    public zbu(wsy0 wsy0Var, wsy0 wsy0Var2, ra90 ra90Var, ome omeVar, boolean z, boolean z2) {
        super("header", false, 14);
        this.c = wsy0Var;
        this.d = wsy0Var2;
        this.e = ra90Var;
        this.f = omeVar;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbu)) {
            return false;
        }
        zbu zbuVar = (zbu) obj;
        return this.c.equals(zbuVar.c) && jl40.l(this.d, zbuVar.d) && jl40.l(this.e, zbuVar.e) && jl40.l(this.f, zbuVar.f) && this.g == zbuVar.g && this.h == zbuVar.h;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        wsy0 wsy0Var = this.d;
        int hashCode2 = (hashCode + (wsy0Var == null ? 0 : wsy0Var.hashCode())) * 31;
        v4v v4vVar = this.e;
        int hashCode3 = (hashCode2 + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31;
        ome omeVar = this.f;
        return Boolean.hashCode(this.h) + unr0.e((hashCode3 + (omeVar != null ? omeVar.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderState(text=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", leadIcon=");
        sb.append(this.e);
        sb.append(", trailElement=");
        sb.append(this.f);
        sb.append(", showWhenSectionCollapsed=");
        return smw0.k(", isCollapsed=", Extension.C_BRAKE, sb, this.g, this.h);
    }
}
