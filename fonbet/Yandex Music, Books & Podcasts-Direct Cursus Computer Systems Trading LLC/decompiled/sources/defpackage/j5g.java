package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j5g {
    public final i5g a;
    public final boolean b;

    public j5g(i5g i5gVar, boolean z) {
        i5gVar.getClass();
        this.a = i5gVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5g)) {
            return false;
        }
        j5g j5gVar = (j5g) obj;
        return Intrinsics.d(this.a, j5gVar.a) && this.b == j5gVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Descriptor(wrapper=" + this.a + ", initiallyLiked=" + this.b + ")";
    }
}
