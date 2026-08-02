package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class m9l {
    public final long a;
    public final long b;
    public final boolean c;

    public m9l(boolean z, long j, long j2) {
        TimeUnit.SECONDS.getClass();
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9l)) {
            return false;
        }
        m9l m9lVar = (m9l) obj;
        return this.a == m9lVar.a && this.b == m9lVar.b && this.c == m9lVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((TimeUnit.SECONDS.hashCode() + tlm.c(this.b, Long.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogConfig(appendPeriod=");
        sb.append(this.a);
        sb.append(", flushPeriod=");
        sb.append(this.b);
        sb.append(", timeUnit=");
        sb.append(TimeUnit.SECONDS);
        sb.append(", firstLogImmediately=");
        return dfi.j(sb, this.c, ')');
    }
}
