package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wzt {
    public final cn0 a;
    public final kya b;

    public wzt(cn0 cn0Var, kya kyaVar) {
        this.a = cn0Var;
        this.b = kyaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzt)) {
            return false;
        }
        wzt wztVar = (wzt) obj;
        return Intrinsics.d(this.a, wztVar.a) && Intrinsics.d(this.b, wztVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
