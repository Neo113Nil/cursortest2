package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ugl extends t7g {
    public final String b;

    public ugl(String str) {
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ugl) && Intrinsics.d(this.b, ((ugl) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    @Override // defpackage.t7g
    public final String s() {
        return this.b;
    }

    public final String toString() {
        return hrg.q("Stream(id=", this.b, ", streamSlug=null)");
    }
}
