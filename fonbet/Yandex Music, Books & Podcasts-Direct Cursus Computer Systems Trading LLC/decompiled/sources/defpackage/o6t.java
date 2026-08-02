package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class o6t {
    public final String a;
    public final int b;
    public final List c;

    public o6t(String str, List list, int i) {
        list.getClass();
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6t)) {
            return false;
        }
        o6t o6tVar = (o6t) obj;
        return this.a.equals(o6tVar.a) && this.b == o6tVar.b && Intrinsics.d(this.c, o6tVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return vz1.u(f1d.l(this.b, "SizeTree(key=", this.a, ", totalSize=", ", subTrees="), this.c, ")");
    }
}
