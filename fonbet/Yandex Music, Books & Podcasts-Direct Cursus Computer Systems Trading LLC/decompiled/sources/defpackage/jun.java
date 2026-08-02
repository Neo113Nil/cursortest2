package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class jun extends md {

    @NotNull
    public static final iun Companion = new iun();
    public static final arf[] c;
    public final pg a;
    public final md b;

    static {
        bwf bwfVar = bwf.b;
        c = new arf[]{btf.a(bwfVar, new trn(17)), btf.a(bwfVar, new trn(18))};
    }

    public jun(int i, pg pgVar, md mdVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, hun.a.getDescriptor());
            throw null;
        }
        this.a = pgVar;
        this.b = mdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jun.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        jun junVar = (jun) obj;
        return Intrinsics.d(this.a, junVar.a) && Intrinsics.d(this.b, junVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        md mdVar = this.b;
        return hashCode + (mdVar != null ? mdVar.hashCode() : 0);
    }

    public final String toString() {
        return "RemoteAction(query=" + this.a + ", fallback=" + this.b + ")";
    }

    public jun(pg pgVar, md mdVar) {
        this.a = pgVar;
        this.b = mdVar;
    }
}
