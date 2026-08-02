package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fuh {
    public final String a;
    public final boolean b;

    public fuh(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuh)) {
            return false;
        }
        fuh fuhVar = (fuh) obj;
        return Intrinsics.d(this.a, fuhVar.a) && this.b == fuhVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("KnownSignature(signature=", this.a, ", release=", ")", this.b);
    }
}
