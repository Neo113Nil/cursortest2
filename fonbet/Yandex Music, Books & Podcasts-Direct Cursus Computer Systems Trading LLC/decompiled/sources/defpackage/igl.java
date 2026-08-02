package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class igl {
    public final mwk a;
    public final j1g b;

    public igl(mwk mwkVar, j1g j1gVar) {
        mwkVar.getClass();
        j1gVar.getClass();
        this.a = mwkVar;
        this.b = j1gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igl)) {
            return false;
        }
        igl iglVar = (igl) obj;
        return Intrinsics.d(this.a, iglVar.a) && this.b == iglVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayableWithLike(playable=" + this.a + ", likeState=" + this.b + ")";
    }
}
