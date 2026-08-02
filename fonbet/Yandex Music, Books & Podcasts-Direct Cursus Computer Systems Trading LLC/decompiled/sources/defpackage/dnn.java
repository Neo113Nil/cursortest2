package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class dnn extends inn {
    public final String a;
    public final String b;
    public final long c;

    public dnn(long j, String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // defpackage.inn
    public final long a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnn)) {
            return false;
        }
        dnn dnnVar = (dnn) obj;
        return this.a.equals(dnnVar.a) && Intrinsics.d(this.b, dnnVar.b) && this.c == dnnVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Assert(tag=");
        sb.append(this.a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", timestampMs=");
        return eta.g(sb, this.c, ')');
    }
}
