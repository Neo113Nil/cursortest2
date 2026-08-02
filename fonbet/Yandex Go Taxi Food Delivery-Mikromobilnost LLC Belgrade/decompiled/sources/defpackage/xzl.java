package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class xzl extends wzl {
    public final ywl a;
    public final u1m b;
    public final f0m c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ xzl(ywl ywlVar, u1m u1mVar, f0m f0mVar, int i) {
        this(ywlVar, (i & 2) != 0 ? null : u1mVar, (i & 4) != 0 ? f0m.b : f0mVar, (i & 8) == 0, false);
    }

    public static xzl a(xzl xzlVar, ywl ywlVar) {
        u1m u1mVar = xzlVar.b;
        f0m f0mVar = xzlVar.c;
        boolean z = xzlVar.d;
        boolean z2 = xzlVar.e;
        xzlVar.getClass();
        return new xzl(ywlVar, u1mVar, f0mVar, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xzl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        xzl xzlVar = (xzl) obj;
        return jl40.l(this.a, xzlVar.a) && jl40.l(this.b, xzlVar.b) && jl40.l(this.c, xzlVar.c) && this.d == xzlVar.d && this.e == xzlVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u1m u1mVar = this.b;
        return Boolean.hashCode(this.e) + unr0.e((this.c.hashCode() + ((hashCode + (u1mVar != null ? u1mVar.hashCode() : 0)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocumentFetchResult(document=");
        sb.append(this.a);
        sb.append(", redirect=");
        sb.append(this.b);
        sb.append(", lifetime=");
        sb.append(this.c);
        sb.append(", staleIfError=");
        sb.append(this.d);
        sb.append(", screenIsBroken=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }

    public xzl(ywl ywlVar, u1m u1mVar, f0m f0mVar, boolean z, boolean z2) {
        this.a = ywlVar;
        this.b = u1mVar;
        this.c = f0mVar;
        this.d = z;
        this.e = z2;
    }
}
