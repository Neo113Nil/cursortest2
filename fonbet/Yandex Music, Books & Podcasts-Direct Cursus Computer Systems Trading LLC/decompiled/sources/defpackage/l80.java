package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l80 {
    public final m80 a;
    public final String b;
    public final int c;

    public l80(m80 m80Var, String str, int i) {
        str.getClass();
        this.a = m80Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l80)) {
            return false;
        }
        l80 l80Var = (l80) obj;
        return this.a == l80Var.a && Intrinsics.d(this.b, l80Var.b) && this.c == l80Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsObjectData(objectType=");
        sb.append(this.a);
        sb.append(", objectId=");
        sb.append(this.b);
        sb.append(", objectPos=");
        return f1d.i(sb, this.c, ")");
    }
}
