package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ydp {
    public final xdp a;
    public final xdp b;
    public final boolean c;

    public ydp(xdp xdpVar, xdp xdpVar2, boolean z) {
        this.a = xdpVar;
        this.b = xdpVar2;
        this.c = z;
    }

    public static ydp a(ydp ydpVar, xdp xdpVar, xdp xdpVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            xdpVar = ydpVar.a;
        }
        if ((i & 2) != 0) {
            xdpVar2 = ydpVar.b;
        }
        if ((i & 4) != 0) {
            z = ydpVar.c;
        }
        ydpVar.getClass();
        return new ydp(xdpVar, xdpVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydp)) {
            return false;
        }
        ydp ydpVar = (ydp) obj;
        return Intrinsics.d(this.a, ydpVar.a) && Intrinsics.d(this.b, ydpVar.b) && this.c == ydpVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return dfi.j(sb, this.c, ')');
    }
}
