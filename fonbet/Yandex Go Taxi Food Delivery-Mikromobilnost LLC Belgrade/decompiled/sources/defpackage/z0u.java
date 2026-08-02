package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class z0u {
    public final l1u a;
    public final o1u b;
    public final y0s0 c;

    public z0u(l1u l1uVar, o1u o1uVar, y0s0 y0s0Var) {
        this.a = l1uVar;
        this.b = o1uVar;
        this.c = y0s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0u)) {
            return false;
        }
        z0u z0uVar = (z0u) obj;
        return this.a.equals(z0uVar.a) && jl40.l(this.b, z0uVar.b) && this.c.equals(z0uVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o1u o1uVar = this.b;
        return this.c.hashCode() + ((hashCode + (o1uVar == null ? 0 : o1uVar.hashCode())) * 31);
    }

    public final String toString() {
        return "GridItemModel(position=" + this.a + ", size=" + this.b + ", content=" + this.c + Extension.C_BRAKE;
    }
}
