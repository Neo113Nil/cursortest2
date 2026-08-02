package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vhc {
    public static final vhc d = new vhc("No file info", "No function info", "No line info");
    public final String a;
    public final String b;
    public final String c;

    public vhc(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhc)) {
            return false;
        }
        vhc vhcVar = (vhc) obj;
        return this.a.equals(vhcVar.a) && Intrinsics.d(this.b, vhcVar.b) && this.c.equals(vhcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return su4.o(f1d.m("SourceCodeInfo(file=", this.a, ", function=", this.b, ", line="), this.c, ")");
    }
}
