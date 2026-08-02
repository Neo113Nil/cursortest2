package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class y4o {

    @NotNull
    public static final g4o Companion = new g4o();
    public static final arf[] b = {btf.a(bwf.b, new trn(20))};
    public final u4o a;

    public /* synthetic */ y4o(int i, u4o u4oVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = u4oVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4o) && Intrinsics.d(this.a, ((y4o) obj).a);
    }

    public final int hashCode() {
        u4o u4oVar = this.a;
        if (u4oVar == null) {
            return 0;
        }
        return u4oVar.hashCode();
    }

    public final String toString() {
        return "RestDailyWidgetResponseBody(data=" + this.a + ')';
    }
}
