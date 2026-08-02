package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class k5o {

    @NotNull
    public static final j5o Companion = new j5o();
    public static final arf[] e;
    public final upi a;
    public final upi b;
    public final String c;
    public final String d;

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{btf.a(bwfVar, new e5o(1)), btf.a(bwfVar, new e5o(2)), null, null};
    }

    public /* synthetic */ k5o(int i, upi upiVar, upi upiVar2, String str, String str2) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, i5o.a.getDescriptor());
            throw null;
        }
        this.a = upiVar;
        this.b = upiVar2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5o)) {
            return false;
        }
        k5o k5oVar = (k5o) obj;
        return Intrinsics.d(this.a, k5oVar.a) && Intrinsics.d(this.b, k5oVar.b) && Intrinsics.d(this.c, k5oVar.c) && Intrinsics.d(this.d, k5oVar.d);
    }

    public final int hashCode() {
        upi upiVar = this.a;
        int hashCode = (upiVar == null ? 0 : upiVar.hashCode()) * 31;
        upi upiVar2 = this.b;
        int hashCode2 = (hashCode + (upiVar2 == null ? 0 : upiVar2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Experiments(experiments=");
        sb.append(this.a);
        sb.append(", triggeredExperiments=");
        sb.append(this.b);
        sb.append(", testIds=");
        sb.append(this.c);
        sb.append(", triggeredTestIds=");
        return dfi.i(sb, this.d, ')');
    }
}
