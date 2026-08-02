package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes8.dex */
public final class tn20 {
    public static final sn20 Companion = new sn20();
    public final String a;
    public final long b;

    public /* synthetic */ tn20(long j, int i, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, rn20.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn20)) {
            return false;
        }
        tn20 tn20Var = (tn20) obj;
        return jl40.l(this.a, tn20Var.a) && this.b == tn20Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("MobCurrentContourState(contour=", this.a, ", lastUsedSeconds=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public tn20(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
