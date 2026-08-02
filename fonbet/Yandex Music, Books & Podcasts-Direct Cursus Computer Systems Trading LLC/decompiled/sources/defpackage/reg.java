package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class reg extends md {

    @NotNull
    public static final qeg Companion = new qeg();
    public static final arf[] d;
    public final t5a a;
    public final boolean b;
    public final q2a c;

    static {
        bwf bwfVar = bwf.b;
        d = new arf[]{btf.a(bwfVar, new bff(27)), null, btf.a(bwfVar, new bff(28))};
    }

    public reg(int i, t5a t5aVar, boolean z, q2a q2aVar) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, peg.a.getDescriptor());
            throw null;
        }
        this.a = t5aVar;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = q2aVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reg)) {
            return false;
        }
        reg regVar = (reg) obj;
        return Intrinsics.d(this.a, regVar.a) && this.b == regVar.b && Intrinsics.d(this.c, regVar.c);
    }

    public final int hashCode() {
        int e = k5r.e(this.a.hashCode() * 31, 31, this.b);
        q2a q2aVar = this.c;
        return e + (q2aVar == null ? 0 : q2aVar.hashCode());
    }

    public final String toString() {
        return "LoadDocumentAction(query=" + this.a + ", updateContentOnly=" + this.b + ", preview=" + this.c + ')';
    }

    public reg(t5a t5aVar, boolean z, q2a q2aVar) {
        this.a = t5aVar;
        this.b = z;
        this.c = q2aVar;
    }
}
