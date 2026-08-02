package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m3o {
    public final int a;
    public final Object b;

    public m3o(Throwable th, int i, int i2) {
        i = (i2 & 1) != 0 ? -1 : i;
        th = (i2 & 2) != 0 ? null : th;
        this.a = i;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3o)) {
            return false;
        }
        m3o m3oVar = (m3o) obj;
        return this.a == m3oVar.a && Intrinsics.d(this.b, m3oVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(httpCode=");
        sb.append(this.a);
        sb.append(", error=");
        return f1d.j(sb, this.b, ')');
    }
}
