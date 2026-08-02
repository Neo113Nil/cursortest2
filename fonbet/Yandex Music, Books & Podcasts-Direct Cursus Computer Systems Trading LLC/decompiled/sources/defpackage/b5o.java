package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class b5o {

    @NotNull
    public static final a5o Companion = new a5o();
    public static final arf[] b = {btf.a(bwf.b, new trn(29))};
    public final tpi a;

    public /* synthetic */ b5o(int i, tpi tpiVar) {
        if (1 == (i & 1)) {
            this.a = tpiVar;
        } else {
            u7g.V(i, 1, z4o.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5o) && Intrinsics.d(this.a, ((b5o) obj).a);
    }

    public final int hashCode() {
        tpi tpiVar = this.a;
        if (tpiVar == null) {
            return 0;
        }
        return tpiVar.hashCode();
    }

    public final String toString() {
        return "RestExperimentsRequestBody(params=" + this.a + ')';
    }

    public b5o(tpi tpiVar) {
        this.a = tpiVar;
    }
}
