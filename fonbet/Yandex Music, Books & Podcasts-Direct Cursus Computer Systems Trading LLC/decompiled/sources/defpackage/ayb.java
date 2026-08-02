package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ayb {
    public final String a;
    public final Map b;
    public final Map c;
    public final vx6 d;

    public ayb(String str, Map map, Map map2, vx6 vx6Var) {
        str.getClass();
        this.a = str;
        this.b = map;
        this.c = map2;
        this.d = vx6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayb)) {
            return false;
        }
        ayb aybVar = (ayb) obj;
        return Intrinsics.d(this.a, aybVar.a) && this.b.equals(aybVar.b) && this.c.equals(aybVar.c) && this.d.equals(aybVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f1d.b(this.c, f1d.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "LocalData(userId=" + this.a + ", stored=" + this.b + ", localSplit=" + this.c + ", store=" + this.d + ")";
    }
}
