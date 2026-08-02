package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k7k {
    public final List a;
    public final String b;
    public int c;

    public k7k(List list, String str) {
        list.getClass();
        str.getClass();
        this.a = list;
        this.b = str;
    }

    public final lns a() {
        return (lns) this.a.get(this.c);
    }

    public final int b() {
        int i = this.c;
        this.c = i + 1;
        return i;
    }

    public final boolean c() {
        return !(this.c >= this.a.size());
    }

    public final lns d() {
        return (lns) this.a.get(b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7k)) {
            return false;
        }
        k7k k7kVar = (k7k) obj;
        return Intrinsics.d(this.a, k7kVar.a) && Intrinsics.d(this.b, k7kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParsingState(tokens=");
        sb.append(this.a);
        sb.append(", rawExpr=");
        return dfi.i(sb, this.b, ')');
    }
}
