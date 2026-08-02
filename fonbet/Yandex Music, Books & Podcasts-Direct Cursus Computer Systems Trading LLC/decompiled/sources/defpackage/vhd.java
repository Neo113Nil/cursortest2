package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class vhd {
    public static final vhd h = new vhd("", false, false, tnl.a, 0, 0, System.currentTimeMillis());
    public final String a;
    public final boolean b;
    public final boolean c;
    public final tnl d;
    public final long e;
    public final long f;
    public final long g;

    public vhd(String str, boolean z, boolean z2, tnl tnlVar, long j, long j2, long j3) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = tnlVar;
        this.e = j;
        this.f = j2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhd)) {
            return false;
        }
        vhd vhdVar = (vhd) obj;
        return Intrinsics.d(this.a, vhdVar.a) && this.b == vhdVar.b && this.c == vhdVar.c && this.d == vhdVar.d && this.e == vhdVar.e && this.f == vhdVar.f && this.g == vhdVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + tlm.c(this.f, tlm.c(this.e, (this.d.hashCode() + k5r.e(k5r.e(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder h2 = v3w.h("GlagolPlayerState(trackId=", this.a, ", musicContent=", ", playing=", this.b);
        h2.append(this.c);
        h2.append(", state=");
        h2.append(this.d);
        h2.append(", progressMs=");
        h2.append(this.e);
        ouj.C(h2, ", durationMs=", this.f, ", updateTime=");
        return hrg.m(this.g, ")", h2);
    }
}
