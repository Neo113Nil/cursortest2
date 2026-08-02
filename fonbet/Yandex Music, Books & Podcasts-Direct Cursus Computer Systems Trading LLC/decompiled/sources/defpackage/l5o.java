package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class l5o {

    @NotNull
    public static final d5o Companion = new d5o();
    public final k5o a;

    public /* synthetic */ l5o(int i, k5o k5oVar) {
        if (1 == (i & 1)) {
            this.a = k5oVar;
        } else {
            u7g.V(i, 1, c5o.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5o) && Intrinsics.d(this.a, ((l5o) obj).a);
    }

    public final int hashCode() {
        k5o k5oVar = this.a;
        if (k5oVar == null) {
            return 0;
        }
        return k5oVar.hashCode();
    }

    public final String toString() {
        return "RestExperimentsResponseBody(experiments=" + this.a + ')';
    }
}
