package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n5r {
    public final ifs a;
    public final ifs b;

    public n5r(ifs ifsVar, ifs ifsVar2) {
        this.a = ifsVar;
        this.b = ifsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5r)) {
            return false;
        }
        n5r n5rVar = (n5r) obj;
        return Intrinsics.d(this.a, n5rVar.a) && Intrinsics.d(this.b, n5rVar.b);
    }

    public final int hashCode() {
        ifs ifsVar = this.a;
        int hashCode = (ifsVar == null ? 0 : ifsVar.hashCode()) * 31;
        ifs ifsVar2 = this.b;
        return hashCode + (ifsVar2 != null ? ifsVar2.hashCode() : 0);
    }

    public final String toString() {
        return "SpecialHeaderBackgroundState(bgAnimationThemedUrl=" + this.a + ", bgImageThemedUrl=" + this.b + ")";
    }
}
