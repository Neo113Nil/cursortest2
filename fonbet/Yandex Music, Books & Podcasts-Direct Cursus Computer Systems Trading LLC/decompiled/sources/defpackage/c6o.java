package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class c6o {

    @NotNull
    public static final x5o Companion = new x5o();
    public final b6o a;

    public /* synthetic */ c6o(int i, b6o b6oVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = b6oVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6o) && Intrinsics.d(this.a, ((c6o) obj).a);
    }

    public final int hashCode() {
        b6o b6oVar = this.a;
        if (b6oVar == null) {
            return 0;
        }
        return b6oVar.hashCode();
    }

    public final String toString() {
        return "RestPlusStateResponseBody(data=" + this.a + ')';
    }
}
