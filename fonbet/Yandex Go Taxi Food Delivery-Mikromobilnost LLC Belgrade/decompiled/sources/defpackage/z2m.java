package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class z2m implements e3m {
    public final int a;
    public final xzl b;
    public final u1m c;
    public final azl d;

    public z2m(int i, xzl xzlVar, u1m u1mVar, azl azlVar) {
        this.a = i;
        this.b = xzlVar;
        this.c = u1mVar;
        this.d = azlVar;
    }

    @Override // defpackage.e3m
    public final zyl a() {
        return new zyl(this.a);
    }

    @Override // defpackage.e3m
    public final xzl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2m)) {
            return false;
        }
        z2m z2mVar = (z2m) obj;
        return this.a == z2mVar.a && jl40.l(this.b, z2mVar.b) && jl40.l(this.c, z2mVar.c) && this.d.equals(z2mVar.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        xzl xzlVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (xzlVar == null ? 0 : xzlVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Failed(epoch=" + zyl.a(this.a) + ", lastDocument=" + this.b + ", query=" + this.c + ", error=" + this.d + Extension.C_BRAKE;
    }
}
