package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class s4u {
    public final List a;
    public final List b;

    public s4u(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4u)) {
            return false;
        }
        s4u s4uVar = (s4u) obj;
        return this.a.equals(s4uVar.a) && this.b.equals(s4uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoClipLikedDisliked(liked=" + this.a + ", disliked=" + this.b + ")";
    }
}
