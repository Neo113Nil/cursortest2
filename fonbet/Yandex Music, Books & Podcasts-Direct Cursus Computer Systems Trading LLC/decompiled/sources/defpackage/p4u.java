package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class p4u {
    public final x1u a;
    public final j1g b;

    public p4u(x1u x1uVar, j1g j1gVar) {
        x1uVar.getClass();
        j1gVar.getClass();
        this.a = x1uVar;
        this.b = j1gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4u)) {
            return false;
        }
        p4u p4uVar = (p4u) obj;
        return Intrinsics.d(this.a, p4uVar.a) && this.b == p4uVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoClipLikeData(clip=" + this.a + ", likeState=" + this.b + ")";
    }
}
