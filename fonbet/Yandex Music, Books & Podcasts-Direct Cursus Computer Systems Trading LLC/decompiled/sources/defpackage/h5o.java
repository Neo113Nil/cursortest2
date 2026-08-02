package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class h5o {

    @NotNull
    public static final g5o Companion = new g5o();
    public static final arf[] d = {null, null, btf.a(bwf.b, new e5o(0))};
    public final Integer a;
    public final Integer b;
    public final upi c;

    public /* synthetic */ h5o(int i, Integer num, Integer num2, upi upiVar) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, f5o.a.getDescriptor());
            throw null;
        }
        this.a = num;
        this.b = num2;
        this.c = upiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5o)) {
            return false;
        }
        h5o h5oVar = (h5o) obj;
        return Intrinsics.d(this.a, h5oVar.a) && Intrinsics.d(this.b, h5oVar.b) && Intrinsics.d(this.c, h5oVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        upi upiVar = this.c;
        return hashCode2 + (upiVar != null ? upiVar.hashCode() : 0);
    }

    public final String toString() {
        return "Experiment(testId=" + this.a + ", bucketId=" + this.b + ", flags=" + this.c + ')';
    }
}
