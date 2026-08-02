package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class enn extends gnn {
    public final String a;
    public final long b;

    public enn(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.inn
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enn)) {
            return false;
        }
        enn ennVar = (enn) obj;
        return Intrinsics.d(this.a, ennVar.a) && this.b == ennVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BasicLog(message=");
        sb.append(this.a);
        sb.append(", timestampMs=");
        return eta.g(sb, this.b, ')');
    }
}
