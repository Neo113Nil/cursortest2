package defpackage;

/* loaded from: classes4.dex */
public final class t4u {
    public final String a;
    public final j1g b;

    public t4u(j1g j1gVar, String str) {
        this.a = str;
        this.b = j1gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4u)) {
            return false;
        }
        t4u t4uVar = (t4u) obj;
        return this.a.equals(t4uVar.a) && this.b == t4uVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoClipLikeState(videoClipId=" + this.a + ", newLikeState=" + this.b + ")";
    }
}
