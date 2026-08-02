package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cgd extends dgd {
    public final v68 c;
    public final t1q d;
    public final vhd e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public cgd(v68 v68Var, t1q t1qVar, vhd vhdVar, boolean z, boolean z2, boolean z3) {
        super(false, null);
        this.c = v68Var;
        this.d = t1qVar;
        this.e = vhdVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgd)) {
            return false;
        }
        cgd cgdVar = (cgd) obj;
        return Intrinsics.d(this.c, cgdVar.c) && Intrinsics.d(this.d, cgdVar.d) && Intrinsics.d(this.e, cgdVar.e) && this.f == cgdVar.f && this.g == cgdVar.g && this.h == cgdVar.h;
    }

    public final int hashCode() {
        v68 v68Var = this.c;
        int hashCode = (v68Var == null ? 0 : v68Var.hashCode()) * 31;
        t1q t1qVar = this.d;
        int hashCode2 = (hashCode + (t1qVar == null ? 0 : t1qVar.hashCode())) * 31;
        vhd vhdVar = this.e;
        return Boolean.hashCode(this.h) + k5r.e(k5r.e((hashCode2 + (vhdVar != null ? vhdVar.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Disconnected(device=");
        sb.append(this.c);
        sb.append(", lastKnownQueueState=");
        sb.append(this.d);
        sb.append(", lastKnownPlayerState=");
        sb.append(this.e);
        sb.append(", interactive=");
        sb.append(this.f);
        sb.append(", forcePaused=");
        return v3w.g(sb, this.g, ", withoutTransition=", this.h, ")");
    }
}
