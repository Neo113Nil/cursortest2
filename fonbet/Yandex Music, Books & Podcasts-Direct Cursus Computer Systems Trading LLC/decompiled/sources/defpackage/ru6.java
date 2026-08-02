package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ru6 {
    public final v2q a;
    public final v2q b;
    public final boolean c;

    public ru6(v2q v2qVar, v2q v2qVar2, boolean z) {
        v2qVar.getClass();
        this.a = v2qVar;
        this.b = v2qVar2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru6)) {
            return false;
        }
        ru6 ru6Var = (ru6) obj;
        return Intrinsics.d(this.a, ru6Var.a) && Intrinsics.d(this.b, ru6Var.b) && this.c == ru6Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v2q v2qVar = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (v2qVar == null ? 0 : v2qVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrossfadeResolveResult(nextPlayable=");
        sb.append(this.a);
        sb.append(", currentPlayable=");
        sb.append(this.b);
        sb.append(", enabled=");
        return ouj.r(sb, this.c, ")");
    }
}
