package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jb1 implements lb1 {
    public final String a;
    public final boolean b;

    public jb1(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb1)) {
            return false;
        }
        jb1 jb1Var = (jb1) obj;
        return Intrinsics.d(this.a, jb1Var.a) && this.b == jb1Var.b;
    }

    @Override // defpackage.lb1
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("Placeholder(title=", this.a, ", isLoading=", ")", this.b);
    }
}
