package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ghd extends hhd {
    public final dkd a;
    public final List b;

    public ghd(dkd dkdVar, List list) {
        list.getClass();
        this.a = dkdVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghd)) {
            return false;
        }
        ghd ghdVar = (ghd) obj;
        return this.a.equals(ghdVar.a) && Intrinsics.d(this.b, ghdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(config=" + this.a + ", conversations=" + this.b + ")";
    }
}
