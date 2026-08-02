package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ghm {
    public final List a;
    public final boolean b;

    public ghm(List list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghm)) {
            return false;
        }
        ghm ghmVar = (ghm) obj;
        return Intrinsics.d(this.a, ghmVar.a) && this.b == ghmVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PopularEpisodesUiData(trackItems=" + this.a + ", showMoreButtonVisible=" + this.b + ")";
    }
}
