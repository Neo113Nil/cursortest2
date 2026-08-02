package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jst {
    public final String a;
    public final boolean b;

    public jst(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jst)) {
            return false;
        }
        jst jstVar = (jst) obj;
        return Intrinsics.d(this.a, jstVar.a) && this.b == jstVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return v3w.e("UserInput(email=", this.a, ", cvvValid=", ")", this.b);
    }

    public /* synthetic */ jst() {
        this(null, false);
    }
}
