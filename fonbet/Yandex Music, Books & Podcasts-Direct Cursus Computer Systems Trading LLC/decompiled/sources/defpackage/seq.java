package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class seq implements teq {
    public final List a;
    public final boolean b;

    public seq(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof seq)) {
            return false;
        }
        seq seqVar = (seq) obj;
        return Intrinsics.d(this.a, seqVar.a) && this.b == seqVar.b;
    }

    public final int hashCode() {
        List list = this.a;
        return Boolean.hashCode(this.b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return v3w.e("Shuffled(shuffleIndices=", w1g.J(this.a), ",pinFirstElement=", ")", this.b);
    }
}
