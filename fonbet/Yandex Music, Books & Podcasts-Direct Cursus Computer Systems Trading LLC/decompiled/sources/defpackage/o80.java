package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o80 {
    public final v70 a;
    public final l80 b;
    public final String c;

    public o80(v70 v70Var, l80 l80Var, String str) {
        str.getClass();
        this.a = v70Var;
        this.b = l80Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o80)) {
            return false;
        }
        o80 o80Var = (o80) obj;
        return this.a.equals(o80Var.a) && this.b.equals(o80Var.b) && Intrinsics.d(this.c, o80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsShowedEvent(entityData=");
        sb.append(this.a);
        sb.append(", objectData=");
        sb.append(this.b);
        sb.append(", viewUuid=");
        return su4.o(sb, this.c, ")");
    }
}
