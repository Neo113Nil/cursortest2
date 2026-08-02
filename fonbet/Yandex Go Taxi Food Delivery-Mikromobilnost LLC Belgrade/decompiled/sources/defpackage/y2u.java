package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class y2u {
    public final k7z a;
    public final k7z b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public y2u(k7z k7zVar, k7z k7zVar2, boolean z, boolean z2, boolean z3) {
        this.a = k7zVar;
        this.b = k7zVar2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2u)) {
            return false;
        }
        y2u y2uVar = (y2u) obj;
        return jl40.l(this.a, y2uVar.a) && jl40.l(this.b, y2uVar.b) && this.c == y2uVar.c && this.d == y2uVar.d && this.e == y2uVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k7z k7zVar = this.b;
        return Boolean.hashCode(this.e) + unr0.e(unr0.e((hashCode + (k7zVar == null ? 0 : k7zVar.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupState(location=");
        sb.append(this.a);
        sb.append(", previousLocation=");
        sb.append(this.b);
        sb.append(", jumpedRecently=");
        nnm.v(", timedOut=", ", isSpoofed=", sb, this.c, this.d);
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
