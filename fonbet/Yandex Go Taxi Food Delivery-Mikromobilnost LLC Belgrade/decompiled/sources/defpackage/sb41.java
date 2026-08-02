package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class sb41 {
    public static final rb41 Companion = new rb41();
    public final String a;
    public final long b;

    public /* synthetic */ sb41(long j, int i, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, qb41.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb41)) {
            return false;
        }
        sb41 sb41Var = (sb41) obj;
        return jl40.l(this.a, sb41Var.a) && this.b == sb41Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("LoadingItem(title=", this.a, ", intervalSeconds=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
