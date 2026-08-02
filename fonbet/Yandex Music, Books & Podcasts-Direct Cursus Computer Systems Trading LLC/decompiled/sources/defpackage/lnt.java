package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class lnt extends md {

    @NotNull
    public static final jnt Companion = new jnt();
    public static final arf[] c;
    public final q2a a;
    public final r2a b;

    static {
        bwf bwfVar = bwf.b;
        c = new arf[]{btf.a(bwfVar, new hft(7)), btf.a(bwfVar, new hft(8))};
    }

    public lnt(int i, q2a q2aVar, r2a r2aVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, gnt.a.getDescriptor());
            throw null;
        }
        this.a = q2aVar;
        this.b = r2aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnt)) {
            return false;
        }
        lnt lntVar = (lnt) obj;
        return Intrinsics.d(this.a, lntVar.a) && Intrinsics.d(this.b, lntVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateDocumentAction(document=" + this.a + ", callbacksConfig=" + this.b + ')';
    }

    public lnt(q2a q2aVar) {
        this.a = q2aVar;
        this.b = r2a.d;
    }
}
