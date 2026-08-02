package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ys2 {
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ ys2(int i) {
        this(-1L, -1L, -1L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys2)) {
            return false;
        }
        ys2 ys2Var = (ys2) obj;
        return this.a == ys2Var.a && this.b == ys2Var.b && this.c == ys2Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "CheckpointResult(error=", ", walPages=");
        w.append(this.b);
        return g8e.l(this.c, ", dbPages=", Extension.C_BRAKE, w);
    }

    public ys2() {
        this(0);
    }

    public ys2(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
