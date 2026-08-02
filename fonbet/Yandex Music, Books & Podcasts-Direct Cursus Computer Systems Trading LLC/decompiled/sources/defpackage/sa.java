package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sa {
    public final String a;
    public final syc b;

    public sa(String str, syc sycVar) {
        this.a = str;
        this.b = sycVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        return Intrinsics.d(this.a, saVar.a) && Intrinsics.d(this.b, saVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        syc sycVar = this.b;
        return hashCode + (sycVar != null ? sycVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
