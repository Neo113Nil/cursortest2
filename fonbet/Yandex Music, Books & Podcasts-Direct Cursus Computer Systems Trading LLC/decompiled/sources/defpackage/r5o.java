package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class r5o {

    @NotNull
    public static final n5o Companion = new n5o();
    public final Integer a;
    public final q5o b;
    public final q5o c;

    public /* synthetic */ r5o(int i, Integer num, q5o q5oVar, q5o q5oVar2) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, m5o.a.getDescriptor());
            throw null;
        }
        this.a = num;
        this.b = q5oVar;
        this.c = q5oVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5o)) {
            return false;
        }
        r5o r5oVar = (r5o) obj;
        return Intrinsics.d(this.a, r5oVar.a) && Intrinsics.d(this.b, r5oVar.b) && Intrinsics.d(this.c, r5oVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        q5o q5oVar = this.b;
        int hashCode2 = (hashCode + (q5oVar == null ? 0 : q5oVar.hashCode())) * 31;
        q5o q5oVar2 = this.c;
        return hashCode2 + (q5oVar2 != null ? q5oVar2.hashCode() : 0);
    }

    public final String toString() {
        return "RestPlusStateRequestBody(geoId=" + this.a + ", coordinates=" + this.b + ", geoPinPosition=" + this.c + ')';
    }

    public r5o(Integer num, q5o q5oVar, q5o q5oVar2) {
        this.a = num;
        this.b = q5oVar;
        this.c = q5oVar2;
    }
}
