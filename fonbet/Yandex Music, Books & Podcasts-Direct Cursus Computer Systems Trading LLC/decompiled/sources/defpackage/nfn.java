package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nfn {
    public final cgr a;
    public final boolean b;

    public nfn(cgr cgrVar, boolean z) {
        cgrVar.getClass();
        this.a = cgrVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfn)) {
            return false;
        }
        nfn nfnVar = (nfn) obj;
        return Intrinsics.d(this.a, nfnVar.a) && this.b == nfnVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RadioContextWithSelection(context=" + this.a + ", selected=" + this.b + ")";
    }
}
