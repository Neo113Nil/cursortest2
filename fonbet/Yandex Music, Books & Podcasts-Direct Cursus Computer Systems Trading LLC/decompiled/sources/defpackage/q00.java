package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q00 implements r00 {
    public final String a;
    public final ztd b;
    public final List c;

    public q00(String str, ztd ztdVar, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = ztdVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj;
        return Intrinsics.d(this.a, q00Var.a) && this.b.equals(q00Var.b) && Intrinsics.d(this.c, q00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Unavailable(title=");
        sb.append(this.a);
        sb.append(", albumArtistUiData=");
        sb.append(this.b);
        sb.append(", artists=");
        return vz1.u(sb, this.c, ")");
    }
}
