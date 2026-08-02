package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w70 {
    public final t80 a;
    public final int b;
    public final int c;

    public w70(t80 t80Var, int i, int i2) {
        t80Var.getClass();
        this.a = t80Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w70)) {
            return false;
        }
        w70 w70Var = (w70) obj;
        return Intrinsics.d(this.a, w70Var.a) && this.b == w70Var.b && this.c == w70Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsEntityPosition(tabId=");
        sb.append(this.a);
        sb.append(", tabPos=");
        sb.append(this.b);
        sb.append(", entityPosY=");
        return f1d.i(sb, this.c, ")");
    }
}
